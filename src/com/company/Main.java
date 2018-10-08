package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Student S1 = new Student("Jae", 7.43);
        Student S2 = new Student("Thing", 3.65);
        Student S3 = new Student("Victor", 2.0);

        if (S1.gpa >= S2.gpa && S1.gpa >= S3.gpa && S2.gpa >= S3.gpa) {
            System.out.println("1:" + S1.name);
            System.out.println("2:" + S2.name);
            System.out.println("3:" + S3.name);
        } else {
            if (S1.gpa >= S2.gpa && S1.gpa >= S3.gpa && S3.gpa >= S2.gpa) {
                System.out.println("1:" + S1.name);
                System.out.println("2:" + S3.name);
                System.out.println("3:" + S2.name);
            }
            else if(S2.gpa >= S1.gpa && S2.gpa >= S3.gpa && S1.gpa >= S3.gpa){
                System.out.println("1:" + S2.name);
                System.out.println("2:" + S1.name);
                System.out.println("3:" + S3.name);
            }
            else{
                if(S2.gpa >= S1.gpa && S2.gpa >= S3.gpa && S3.gpa >= S1.gpa){
                    System.out.println("1:" + S2.name);
                    System.out.println("2:" + S3.name);
                    System.out.println("3:" + S1.name);
                }
                else if(S3.gpa >= S2.gpa && S3.gpa >= S1.gpa && S2.gpa >= S1.gpa){
                    System.out.println("1:" + S3.name);
                    System.out.println("2:" + S2.name);
                    System.out.println("3:" + S1.name);
                }
                else if(S3.gpa >= S2.gpa && S3.gpa >= S1.gpa && S1.gpa >= S2.gpa){
                    System.out.println("1:" + S3.name);
                    System.out.println("2:" + S1.name);
                    System.out.println("3:" + S2.name);
                }
            }
        }

    }



    }

