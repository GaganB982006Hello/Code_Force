/*
time limit per test1 second
memory limit per test256 megabytes
Allen has a LOT of money. He has n
 dollars in the bank. For security reasons, he wants to withdraw it in cash (we will not disclose the reasons here). The denominations for dollar bills are 1
, 5
, 10
, 20
, 100
. What is the minimum number of bills Allen could receive after withdrawing his entire balance?

Input
The first and only line of input contains a single integer n
 (1≤n≤109
).

Output
Output the minimum number of bills that Allen could receive.

Examples
InputCopy
125
OutputCopy
3
InputCopy
43
OutputCopy
5
InputCopy
1000000000
OutputCopy
10000000
  */

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int Lot = 0;
        while( money != 0){
            if(money % 100 == 0){
                money -= 100;
                Lot++;
            }else if(money % 20 == 0){
                money -= 20;
                Lot++;
            }else if(money % 10 == 0){
                money -= 10;
                Lot++;
            }else if(money % 5 == 0){
                money -= 5;
                Lot++;
            }else{
                money--;
                Lot++;
            }
        }
        System.out.print(Lot);
        sc.close();
    }
}
