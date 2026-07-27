/*
ime limit per test1 second
memory limit per test256 megabytes
You are given two positive integers x
 and y
.

You are allowed to perform the following operation any number of times (possibly zero):

Choose any positive integer z
 such that z
 divides x
;
Set x:=xz
.
Determine whether you can make x
 exactly equal to y
 using this operation.

Input
The first line of the input contains a single integer t
 (1≤t≤104
) — the number of test cases. The description of each test case follows.

The only line of each test case contains two space-separated integers x
 and y
 (1≤x,y≤100
).

Output
For each test case, print "YES" if you can make x
 exactly equal to y
 and "NO" otherwise.

You can output "YES" and "NO" in any case (for example, strings "yEs", "yes" and "Yes" will be recognized as a positive response).

Example
InputCopy
3
12 2
6 7
99 79
OutputCopy
YES
NO
NO
Note
For the first test case,

Choosing z=2
 makes x=122=6
Choosing z=3
 makes x=63=2
Thus, we can make x=y
. Hence, output YES.

For the second test case, it can be shown that it is impossible to make x
 equal to y
.
  */

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int[] arr1 = new int[loop];
        int[] arr2 = new int[loop];
        for(int i = 0; i < loop; i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        
        for(int i = 0; i < loop; i++){
            boolean state = false;
            if(arr1[i] % arr2[i] == 0){
                state = true;
            }if(state == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
