package Synergech;

import java.util.Scanner;

public class StudentNestedIF{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks:");
        int marks=sc.nextInt();
        System.out.print("Enter class(10 or 11):");
        int studentClass=sc.nextInt();
        System.out.print("Enter city:");
        String city=sc.next();
        int scholarship=calculateScholarship(marks,studentClass,city);
        System.out.println("Calculated Scholarship:"+scholarship);
        System.out.println("Scenario1:"+calculateScholarship(80,10,"Chennai"));
        System.out.println("Scenario2:"+calculateScholarship(70,10,"Delhi"));
        System.out.println("Scenario3:"+calculateScholarship(20,10,"Chennai"));
    }
    public static int calculateScholarship(int marks,int studentClass,String city){
        int scholarship=0;
        if(studentClass==10){
            if(marks>30&&marks<60){
                scholarship=30*15000/100;

                if(city.equalsIgnoreCase("Chennai")){
                    scholarship=scholarship-1000;
                }else{
                    scholarship=scholarship-3000;
                }
            }else{
                if(marks>60&&marks<90){
                    scholarship=50*15000/100;
                }else{
                    if(marks>90){
                        scholarship=70*15000/100;
                    }else{
                        scholarship=0;
                    }
                }
            }
        }else{
            if(studentClass==11){

                if(marks>30&&marks<60){
                    scholarship=30*25000/100;

                    if(city.equalsIgnoreCase("Chennai")){
                        scholarship=scholarship-1000;
                    }else{
                        scholarship=scholarship-2000;
                    }
                }else{
                    if(marks>60&&marks<90){
                        scholarship=50*25000/100;
                    }else{
                        if(marks>90){
                            scholarship=70*25000/100;
                        }else{
                            scholarship=0;
                        }
                    }
                }
            }
        }
        return scholarship;
    }
}
