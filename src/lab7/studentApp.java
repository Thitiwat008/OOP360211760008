package lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.Scanner;

public class studentApp {

    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        s1.setName("Mit");
        s1.setAge(22);
        s1.setGender("Male");
        s1.setHeight(180);
        System.out.println(s1.toString());

        Student s2 = new Student("Safe",90,"Femaie",190);
        System.out.print(s2.toString());

        //input data from user
        Student s3 = new Student();
        //s3 = inputData(s3); //s
        s3 = inputDataBuffer(s3);
        System.out.println(s3.toString());

    }//main

    private static Student inputDataBuffer(Student s) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your information: ");
        System.out.println("Name: ");
        s.setName(reader.readLine());
        System.out.print("Age: ");
        s.setAge(Integer.parseInt(reader.readLine()));
        System.out.print("Gender: ");
        s.setGender(reader.readLine());
        System.out.print("Hright: ");
        s.setHeight(Double.parseDouble(reader.readLine()));
        return s;
    }

    private static Student inputData(Student s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your information: ");
        System.out.println("Name: ");
            s.setName(sc.nextLine());
            System.out.print("Age: ");
            s.setAge(sc.nextInt());
            System.out.print("Gender: ");
            s.setGender(sc.nextLine());
            System.out.print("Height: ");
            s.setHeight(sc.nextDouble());

            return s;
    }
}
