package org.projects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of applicants:");
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Applicant> applicants=new ArrayList<Applicant>();
        for(int i=0;i<n;i++){
            System.out.println("Enter applicant details:");
            String input[]=sc.nextLine().split(",");
            String name=input[0].trim();
            int sub1=Integer.parseInt(input[1]);
            int sub2=Integer.parseInt(input[2]);
            int sub3=Integer.parseInt(input[3]);
        Applicant app=new Applicant(name,sub1,sub2,sub3);

        int total=calculateTotal(sub1,sub2,sub3);
        if(total>0){
            app.setTotal(total);
            app.setPercentage(calculatePercentage(total));
            applicants.add(app);
        }
        }
        // Sort by applicant name
        applicants.sort(Comparator.comparing(Applicant::getName));
//        System.out.println(applicants);
        System.out.printf("%-10s %-5s %-5s %-5s %-6s %-7s\n",
                "Name", "Sub1", "Sub2", "Sub3", "Total", "Percent");
        for (Applicant a : applicants) {
            if (a.getPercentage() >= 70) {
                System.out.println(a);
            }
        }
    }
    public static int calculateTotal(int m1,int m2,int m3){
        if(m1<50 || m2<50||m3<50)
            return 0;
        return m1+m2+m3;
    }
    public static int calculatePercentage(int total){
        return (total*100)/300;
    }
}