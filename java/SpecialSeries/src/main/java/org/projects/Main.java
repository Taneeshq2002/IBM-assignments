package org.projects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Wrong input");
        }
        int j=2;
        for(int i=1;i<=n;i++){
            System.out.print(i*j+" ");
            j++;
        }
    }
}