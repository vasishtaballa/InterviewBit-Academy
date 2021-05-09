package com.scaler.academy.homework.nov01;

/*
Same Format String
Problem Description

Given two strings A and B. Check if B contains same characters as that of given string A and in the same order.


Problem Constraints
1: A and B contain only UPPERCASE Letters.
2: No two consecutive characters are same in A.
3: You can only use constant amount of extra memory.


Input Format
The first argument given is string A.
The second argument given is string B.


Output Format
Return 1 if B contains same characters as that of given string A and in the same order else return 0.


Example Input
Input 1:
    A = "HIRED"
    B = "HHHIIIRRRRREEEEEDDDDD"
Input 2:

    A = "HIRED"
    B = "DDHHHHIIIIRRRRREEEEDDD"


Example Output
Output 1:
    1
Output 2:

    0


Example Explanation
Explanation 1:
    B has same characters and appear in same order.
Explanation 2:

    B has extra character "D"
 */

public class SameFormatString {

    public static void main(String[] args) {
        SameFormatString obj = new SameFormatString();
        System.out.println(obj.solve("HIR", "HIRE"));
    }

    public int solve(final String A, final String B) {
        // If  A has more chars than B, then  definitely not  possible
        if (A.length() > B.length())
            return 0;
        int i = 0, j = 0;
        while (i < A.length() && j < B.length()) {
            char ch = A.charAt(i);
            if (ch != B.charAt(j))
                return 0;
            // Moving j pointer till we have same character which was already equal in both strings
            while (j < B.length() && B.charAt(j) == ch)
                j++;
            i++;
        }
        // If any pointer has still not reached end, then not possible
        if (i < A.length() || j < B.length())
            return 0;
        return 1;
    }
}
