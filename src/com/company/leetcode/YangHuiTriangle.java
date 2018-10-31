package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class YangHuiTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        if (numRows == 0) {
            return ans;
        }

        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);

        for (int i = 1; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j=1; j<i; j++) {
                int pre = ans.get(i-1).get(j-1);
                int cur = ans.get(i-1).get(j);
                row.add(pre + cur);
            }

            row.add(1);

            ans.add(row);
        }

        return ans;
    }

    public static void main(String[] args) {
        YangHuiTriangle triangle = new YangHuiTriangle();
        List<List<Integer>> ans = triangle.generate(5);

    }
}
