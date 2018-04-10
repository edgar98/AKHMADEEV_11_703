package ru.itis;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

/**
 * 04.04.2018
 * BinarySearchTreeImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T> {

    private class TreeNode {
        private T value;
        private TreeNode left;
        private TreeNode right;
        private TreeNode parent;

        public TreeNode(T value) {
            this.value = value;
        }
    }

    private TreeNode root;

    public BinarySearchTreeImpl() {
        this.root = null;
    }

    @Override
    public void insert(T element) {
        this.root = insert(root, element);
    }

    private TreeNode insert(TreeNode root, T element) {
        if (root == null) {
            root = new TreeNode(element);
        } else if (root.value.compareTo(element) >= 0) {
            root.left = insert(root.left, element);
            root.left.parent = root;
        } else {
            root.right = insert(root.right, element);
            root.right.parent = root;
        }
        return root;
    }


//    Это не работает с полем parent
//
//    public boolean remove(T k) {
//        TreeNode x = root, y = null;
//        while (x != null) {
//            int cmp = k.compareTo(x.value);
//            if (cmp == 0) {
//                break;
//            } else {
//                y = x;
//                if (cmp < 0) {
//                    x = x.left;
//                } else {
//                    x = x.right;
//                }
//            }
//        }
//        if (x == null) {
//            return false;
//        }
//        if (x.right == null) {
//            if (y == null) {
//                root = x.left;
//            } else {
//                if (x == y.left) {
//                    y.left = x.left;
//                } else {
//                    y.right = x.left;
//                }
//            }
//        } else {
//            TreeNode leftMost = x.right;
//            y = null;
//            while (leftMost.left != null) {
//                y = leftMost;
//                leftMost = leftMost.left;
//            }
//            if (y != null) {
//                y.left = leftMost.right;
//            } else {
//                x.right = leftMost.right;
//            }
//            x.value = leftMost.value;
//        }
//        return true;
//    }


    @Override
    public boolean remove(T element) {
        TreeNode toRemove = search(element, root);
        if (toRemove == null) return false;
        TreeNode replacement = toRemove.right != null ? toRemove.right : toRemove.left;
        if (toRemove == root) {
            root.parent = new TreeNode(root.value);
            root.parent.left = root;
        }
        boolean toRemoveIsLeft = toRemove.parent.value.compareTo(toRemove.value) >= 0;
        if (replacement != null) {
            if (replacement == toRemove.left) {
                removeLeft(replacement, toRemove, toRemoveIsLeft);
            } else {
                removeRight(replacement,toRemove, toRemoveIsLeft);
            }
        } else {
            if (toRemoveIsLeft) toRemove.parent.left = null;
            else toRemove.parent.right = null;
        }
        if (toRemove == root) {
            root = replacement;
            replacement.parent = null;
        }
        return true;
    }

    private boolean removeLeft(TreeNode replacement, TreeNode toRemove, boolean toRemoveIsLeft) {
        replacement.parent = toRemove.parent;
        if (toRemoveIsLeft) toRemove.parent.left = replacement;
        else toRemove.parent.right = replacement;
        return true;
    }

    private boolean removeRight(TreeNode replacement, TreeNode toRemove, boolean toRemoveIsLeft) {
        while (replacement.left != null) replacement = replacement.left;
        replacement.parent.left = replacement.parent != root ? null : replacement.parent.left;
        replacement.left = toRemove.left;
        replacement.right = toRemove != root ? toRemove.right : replacement.right;
        replacement.parent = toRemove.parent;
        toRemove.right.parent = replacement;
        if (toRemove.left != null) toRemove.left.parent = replacement;
        if (toRemoveIsLeft) toRemove.parent.left = replacement;
        else toRemove.parent.right = replacement;
        return true;
    }

    @Override
    public boolean contains(T element) {
        return search(element, root) != null;
    }

    @Override
    public void print() {
        print(this.root);
        System.out.println();
    }

    private void print(TreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }
    }

    private TreeNode search(T element, TreeNode root) {
        TreeNode flag = null;
        if (root != null) {
            if (root.value.equals(element)) {
                flag = root;
                return flag;
            }
            flag = search(element, root.left);
            if (flag != null) return flag;
            flag = search(element, root.right);
        }
        return flag;
    }

    @Override
    public void printByLevels() {
        printByLevels(root);

    }

    private void printByLevels(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode previousNode = null;
       do {
            System.out.print("\t" + node.value);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
            if (!queue.isEmpty()) {
                previousNode = node;
                node = queue.poll();
                if (previousNode == node) break;
            }
            if (!isSameLevel(node, previousNode)) System.out.println();
            if (queue.isEmpty()) {
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (queue.isEmpty()) System.out.println("\t" + node.value);
       } while (!queue.isEmpty());
        System.out.println();
    }

    private boolean isSameLevel(TreeNode nodeOne, TreeNode nodeTwo) {
        while (true) {
            if ((nodeOne == root) | (nodeTwo == root)) break;
            nodeOne = nodeOne.parent != null ? nodeOne.parent : nodeOne;
            nodeTwo = nodeTwo.parent != null ? nodeTwo.parent : nodeTwo;
        }
        return nodeOne == nodeTwo;
    }
}