package org.projects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<11){
            System.out.println("Invalid input");
        }
        for(int i=11;i<=n;i++){
            if(checkPalindrome(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPalindrome(int n){
        int rem=0;
        int rev=0;
        int org=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(org==rev)
            return true;
        return false;
    }
}