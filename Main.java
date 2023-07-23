import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of students
        int numofstudents = 0;
        while (numofstudents <= 0) {
            try {
                System.out.print("Enter the number of students: ");
                numofstudents = input.nextInt();
                if (numofstudents <= 0) {
                    System.out.println("Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                input.nextLine();
            }
        }

        // Create an array of students
        Student[] students = new Student[numofstudents];

        // Ask the user if they want to print individual module results
        String answer = "";
        while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {
            try {
                System.out.print("Would you like the results printed for individual modules (Y/N)? ");
                answer = input.next();
                if (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {
                    System.out.println("Please enter Y or N.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter Y or N.");
                input.nextLine();
            }
        }

        // Loop through each student and ask for their information and module marks
        for (int i = 0; i < numofstudents; i++) {
            System.out.println("Enter information for student " + (i + 1));
            System.out.print("First name: ");
            String firstname = input.next();
            System.out.print("Surname: ");
            String lastname = input.next();

            // Create a new student object and add it to the array
            Student student = new Student("id" + i, firstname, lastname);
            students[i] = student;

            // Ask for marks for module CW001
            double[] cw001marks = new double[4];
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter marks for CW001 (Homework 1, Homework 2,Homework 3, Project): ");
                    for (int j = 0; j < 4; j++) {
                        cw001marks[j] = input.nextDouble();
                    }
                    student.getCw001().setHomeworkMarks(cw001marks[0], 0);
                    student.getCw001().setHomeworkMarks(cw001marks[1], 1);
                    student.getCw001().setHomeworkMarks(cw001marks[2], 2);
                    student.getCw001().setProjectMark(cw001marks[3]);
                    student.getCw001().calculateFinalMark();//Calling the function
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter valid marks.");
                    input.nextLine();
                }
            }

            // Ask for marks for module EX002
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter marks for EX002 (Exam): ");
                    double ex002mark = input.nextDouble();
                    student.getEx002().setExamMark(ex002mark);
                    validInput = true;
                    student.getEx002().calculateFinalMark();//Calling the function
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid mark.");
                    input.nextLine();
                }
            }

            // Ask for marks for module CE003
            System.out.print("Enter marks for CE003 (Homework 1, Homework 2, Homework 3, Homework 4, Exam): ");
            double[] ce003marks = new double[5];
            int j=0;
            try {
                for (j = 0; j < 5; j++) {
                    ce003marks[j] = input.nextDouble();
                }
                student.getCe003().setHomeworkMarks(ce003marks[0], 0);
                student.getCe003().setHomeworkMarks(ce003marks[1], 1);
                student.getCe003().setHomeworkMarks(ce003marks[2], 2);
                student.getCe003().setHomeworkMarks(ce003marks[3], 3);
                student.getCe003().setExamMark(ce003marks[4]);
                student.getCe003().calculateFinalMark();//Calling the function

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine(); // consume the invalid input
                j--; // decrement j to repeat the loop iteration
            }
            
            
        }
        
        if (answer.equalsIgnoreCase("Y")) {
        		System.out.println("Marks for CW001:");
        		System.out.println("Name\tSurname\tHWs\tProject\tFinalMark");
        	for (int p = 0; p < numofstudents; p++) {
        		students[p].printmodulemarks("CW001");}
        		System.out.println("Marks for EX002:");
        		System.out.println("Name\tSurname\tFinal Mark");
        	for (int k = 0; k < numofstudents; k++) {
        		students[k].printmodulemarks("EX002");}
        		System.out.println("Marks for CE003:");
        		System.out.println("Name\tSurname\tCW\tExam\tFinal Mark");
        	for (int l = 0; l < numofstudents; l++) {
        		students[l].printmodulemarks("CE003");}
        }

        if (answer.equalsIgnoreCase("N")) {
            System.out.println("Marks for all modules:");
            System.out.println("Name\tSurname\tCW001\tEX002\tCE003");
            for (int i = 0; i < numofstudents; i++) {
            	System.out.printf("%s\t%s\t%.2f%%\t%.2f%%\t%.2f%%\n", students[i].getFirstname(), students[i].getLastname(),
                        students[i].getCw001().getFinalMark(), students[i].getEx002().getFinalMark(), students[i].getCe003().getFinalMark());
                        
            }
        }


}}