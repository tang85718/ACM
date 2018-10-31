package com.company.leetcode;

public class AddDigits {

    public int addDigits(int num) {
        int ans;
        do {
            ans = 0;
            while (num > 0) {
                ans += num % 10;
                num /= 10;
            }
            num = ans;
        } while (ans >= 10);

        return ans;
    }

    public static void main(String[] args) {

        AddDigits addDigits = new AddDigits();
        int ans = addDigits.addDigits(38);
        System.out.println(ans);
    }
}
