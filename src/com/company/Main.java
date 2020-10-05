package com.company;

import java.util.Arrays;

public class Main {

    public static int countPairs(int[] arr, int k) {
        Arrays.sort(arr);
        int ans = 0, i = 0, j = 1;
        boolean check = true;
        while(i <= j){
            if(i > 0 && i < arr.length && arr[i-1] == arr[i]){
                i++;
                if(k == 0 && check){
                    ans++;
                    check = false;
                }
                continue;
            }
            check = true;
            if(j < arr.length && arr[j-1] == arr[j]){
                j++;
                continue;
            }
            while(j < arr.length && arr[j] - arr[i] <= k){
                if(arr[j] - arr[i] == k && k > 0){
                    ans++;
                    j++;
                    break;
                }
                j++;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,1,1,2};
        int k = 1;
        System.out.println(countPairs(arr,k));
    }
}
