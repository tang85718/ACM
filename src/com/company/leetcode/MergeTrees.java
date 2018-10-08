package com.company.leetcode;

public class MergeTrees {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        if (t2 == null) {
            return t1;
        }

        if (t1 == null) {
            t1 = t2;
        }

        t1.val += t2.val;

        mergeTrees(t1.left, t2.left);
        mergeTrees(t1.right, t2.right);

        return t1;
    }


    public static void main(String[] args) {

    }
}
