package Synergech;

import java.util.*;
public class StudentGradeManager{
    private static Map<Integer,List<String>> gradeMap=new TreeMap<>();

    public static void addStudent(int grade,String name){
        gradeMap.computeIfAbsent(grade,k->new ArrayList<>()).add(name);
        System.out.println("Student added successfully.");
    }

    public static void removeStudent(int grade,String name){
        if(gradeMap.containsKey(grade)){
            List<String> students=gradeMap.get(grade);
            if(students.remove(name)){
                if(students.isEmpty())
                    gradeMap.remove(grade);
                System.out.println("Student removed successfully.");
            }else
                System.out.println("Student not found in this grade.");
        }else
            System.out.println("Grade level not found.");
    }

    public static void getStudentsByGrade(int grade){
        if(gradeMap.containsKey(grade))
            System.out.println("Students in Grade "+grade+": "+gradeMap.get(grade));
        else
            System.out.println("No students found for this grade.");
    }

    public static void getAllStudents(){
        if(gradeMap.isEmpty()){
            System.out.println("No students available.");
            return;
        }
        for(Map.Entry<Integer,List<String>> e:gradeMap.entrySet())
            System.out.println("Grade "+e.getKey()+": "+e.getValue());
    }

    public static void getGradeLevels(){
        System.out.println("Grade Levels: "+gradeMap.keySet());
    }

    public static void getStudentCountByGrade(){
        for(Map.Entry<Integer,List<String>> e:gradeMap.entrySet())
            System.out.println("Grade "+e.getKey()+" -> "+e.getValue().size()+" students");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    int grade=sc.nextInt();
                    sc.nextLine();
                    String name=sc.nextLine();
                    addStudent(grade,name);
                    break;
                case 2:
                    grade=sc.nextInt();
                    sc.nextLine();
                    name=sc.nextLine();
                    removeStudent(grade,name);
                    break;
                case 3:
                    grade=sc.nextInt();
                    getStudentsByGrade(grade);
                    break;
                case 4:
                    getAllStudents();
                    break;
                case 5:
                    getGradeLevels();
                    break;
                case 6:
                    getStudentCountByGrade();
                    break;
                case 7:
                    System.out.println("Exiting program...");
            }
        }while(choice!=7);
    }
}

