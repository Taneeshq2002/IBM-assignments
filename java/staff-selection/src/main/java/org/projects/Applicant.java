package org.projects;

public class Applicant {
    String name;
    private int subject1,subject2,subject3;
   private int total,percentage;

   public Applicant(String name,int s1,int s2,int s3){
       this.name=name;
       this.subject1=s1;
       this.subject2=s2;
       this.subject3=s3;
   }

   public String getName(){
       return this.name;
   }

   public int getSubject1(){
       return this.subject1;
   }
    public int getSubject2(){
        return this.subject2;
    }
    public int getSubject3(){
        return this.subject3;
    }
    public int getTotal(){
       return this.total;
    }
    public void setTotal(int total) { this.total = total; }
    public int getPercentage(){
       return this.percentage;
    }
    public void setPercentage(int percentage) { this.percentage = percentage; }
    @Override
    public String toString() {
        return String.format("%-10s %-5d %-5d %-5d %-6d %-5d%%",
                name, subject1, subject2, subject3, total, percentage);
    }
}
