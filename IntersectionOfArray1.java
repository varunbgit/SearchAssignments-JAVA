package com.varun;

import java.util.Arrays;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.ArrayList;

// 349  Intersection of Two Arrays
public class IntersectionOfArray1 {
    public static void main(String[] args) {

//        //Array with duplicate elements
//        Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
//
//        //This array has duplicate elements
//        System.out.println( Arrays.toString(numbers) );
//
//        //Create set from array elements
//        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
//
//        //Get back the array without duplicates
//        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
//
//        //Verify the array content
//        System.out.println( Arrays.toString(numbersWithoutDuplicates) );

       int [] nums1 = {3,1,2,2,1},nums2 = {2,2};
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet( Arrays.asList(nums1) );
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
//       LinkedHashSet num1 = new LinkedHashSet(List.of(nums1));
//       LinkedHashSet num2 = new LinkedHashSet(List.of(nums2));
//
//       Integer [] uniquenums1= (Integer[]) num1.toArray(new Integer[]{});
//       Integer [] uniquenums2= (Integer[]) num2.toArray(new Integer[]{});
   //    int [] ans = intersection(uniquenums1,uniquenums2);
     //  System.out.println(Arrays.toString(ans));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        //int [] output=new int[Math.max(nums2.length, nums1.length)];
//        int index=0;
        List<Integer> output = new ArrayList<Integer>();
        for(int ele:nums1){
            if(BinarySearch(ele,nums2)){
                output.add(ele);
                //index++;
            }

        }


        int[] ints =  new int[output.size()];
        int index =0;
        for(int ele : output){
            ints[index] = ele;
            index++;
        }
        return ints;

    }

    public static boolean BinarySearch(int key,int[] nums2){

        int start = 0 ;
        int end = nums2.length-1;

        while(start<=end){
            int mid = end - (end -start)/2;
            if(nums2[mid] == key){
                return true;
            }
            else if(nums2[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }

}

