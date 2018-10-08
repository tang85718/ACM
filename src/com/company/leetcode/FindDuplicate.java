package com.company.leetcode;

/**
 * 龟兔算法
 * 检测单链表上的环有个很经典的算法叫做”弗洛伊德判圈算法”, 也叫”龟兔算法”.
 * http://adam8157.info/blog/2015/08/why-does-tortoise-and-hare-algorithm-work/
 */
public class FindDuplicate {


    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0, temp = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        while (slow != temp) {
            slow = nums[slow];
            temp = nums[temp];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, 1, 3, 4, 2, 1, 5};

        FindDuplicate depth = new FindDuplicate();
        depth.findDuplicate(nums);
    }
}
