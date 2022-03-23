package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] students = {"Chis","Michael","Camila"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String findName = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(findName)) {
                System.out.println("Position of the students in the list " + findName + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + findName + " in the list.");
        }
    }
}
