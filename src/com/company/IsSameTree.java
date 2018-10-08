package com.company;

public class IsSameTree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p.val == q.val) {
            return true;
        }

        return isSameTree(p.left, q.left) || isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
    }
}
