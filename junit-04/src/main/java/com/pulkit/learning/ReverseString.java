package com.pulkit.learning;

public class ReverseString {
    public String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char temp = str.charAt(left);
            arr[left] = str.charAt(right);
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}