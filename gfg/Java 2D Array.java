// You are given a  2D array. An hourglass in an array is a portion shaped like this:

// a b c
//   d
// e f g
// For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

// 1 1 1     1 1 0     1 0 0
//   1         0         0
// 1 1 1     1 1 0     1 0 0
// The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

// In this problem you have to print the largest sum among all the hourglasses in the array.

// Input Format

// There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.

// Output Format

// Print the answer to this problem on a single line.

// Sample Input

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// Sample Output

// 19
// Explanation

// The hourglass which has the largest sum is:

// 2 4 4
//   2
// 1 2 4

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N[][]=new int[6][6];
       for(int i=0; i<6; i++){
       for(int j=0; j<6; j++){
       N[i][j]=sc.nextInt();
       }
       }
       int high=-100000000;
       for(int m=0; m<4; m++){
       for(int n=1; n<5; n++){
       int one=N[m][n-1];
       int one1=N[m][n];
       int one2=N[m][n+1];
       int one3=N[m+1][n];
       int one4=N[m+2][n-1];
       int one5=N[m+2][n];
       int one6=N[m+2][n+1];
       int add=one+one1+one2+one3+one4+one5+one6;
       if(add>high){
       high=add;
       }
      
       }
           
       }
       System.out.println(high);
}
}
