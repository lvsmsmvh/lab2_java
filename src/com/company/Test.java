package com.company;

import java.util.Scanner;

public class Test {
    Scanner scan = new Scanner(System.in);

    String name;
    int age;
    String city;
    char sex;
    String university;
    int yearOfStudying;
    String favColor;
    String favAnimal;

    void RunTest(){
        System.out.println("Hello, student!\nYou'll be asked 8 questions. Let's go!\n\n");
        System.out.println("1. What's your name?");
        name = scan.nextLine();
        System.out.println("2. What's your age?");
        age = scan.nextInt();
        scan.nextLine(); // bugs
        System.out.println("3. Where do you live?");
        city = scan.nextLine();
        System.out.println("4. What's your sex? (type M or F)");
        sex = scan.next().charAt(0);
        scan.nextLine(); // bugs
        System.out.println("5. In which university do you study?");
        university = scan.nextLine();
        System.out.println("6. What year of studying are you at?");
        yearOfStudying = scan.nextInt();
        scan.nextLine(); // bugs
        System.out.println("7. What's your favourite color?");
        favColor = scan.nextLine();
        System.out.println("8. What's your favourite animal?");
        favAnimal = scan.nextLine();
        System.out.println("\nGreat! Your results:");
        System.out.println("1. " + name + "\n2. " + age + "\n3. " + city + "\n4. " + sex +
                "\n5. " + university + "\n6. " + yearOfStudying + "\n7. " + favColor + "\n8. " + favAnimal);
    }
}
