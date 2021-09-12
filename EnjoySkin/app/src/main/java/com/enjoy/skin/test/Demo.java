package com.enjoy.skin.test;

/**
 * @Author Xuxiaowu
 * @Date 2021/7/18
 * @Time 21:28
 * @PackageName com.enjoy.skin.test
 * @Description
 */

class Demo {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,9,11,13,15,18,21,543,4232,31433,31243253};
        int target = 18;
        int lo = 0;
        int hi = arr.length;
        int index = -1;
        for (int mid = (lo + hi)/2; mid < arr.length;) {
            if (arr[mid] == target){
                index = mid;
                break;
            } else if (arr[mid] > target){
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
            mid = (lo + hi)/2;
        }


        System.out.println("index = " + index);

    }
}
