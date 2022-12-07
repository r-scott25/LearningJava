import java.util.Locale;
import java.util.Scanner;

public class Main {

    //////////////////////////**** Developer Tea Time *****///////////////////////
    /////////////////////////     Defining a Function     ////////////////////////
//    public static void announceDeveloperTeaTime() {
//        System.out.println("Waiting for developer tea time...");
//        System.out.println("Type in a random word and press Enter to start developer tea time");
//        Scanner input = new Scanner(System.in);
//        input.next();
//        System.out.println("It's developer tea time!");
//    }



    //////////////////////////**** TOTAL MEAL PRICE *****///////////////////////
    /////////////////     Defining a Function with Parameters    ///////////////

//    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
//        double tip = tipRate * listedMealPrice;
//        double tax = taxRate * listedMealPrice;
//        double result = listedMealPrice + tip + tax;
//        return result;
//    }


    //////////////////////////**** Challenge *****///////////////////////
    /////////////////     Function: Salary Calculator    ////////////////

    public static double calculateSalary(double hrsPerWeek, double dollarsPerHour, int vacationDays) {
        if (hrsPerWeek < 0){
            return -1;
        }
        if (dollarsPerHour < 0){
            return -1;
        }
            double weeklyIncome = hrsPerWeek * dollarsPerHour;
            double unpaidTime = vacationDays * dollarsPerHour * 8;
            double grossYearlySalary = (weeklyIncome * 52) - unpaidTime;
            return grossYearlySalary;


    }

    public static void main(String[] args) {

        //////////////////////////**** Developer Tea Time *****///////////////////////
        /////////////////////////     Calling a Function     ////////////////////////

//        announceDeveloperTeaTime();


        //////////////////////////**** Developer Tea Time *****///////////////////////
        ///////////////////     Calling a Function w/ Parameters     ////////////////

//        calculateTotalMealPrice(5.99, .20, .07);
//        calculateTotalMealPrice(15, .30, .08);

//       double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
//       System.out.println(groupTotalMealPrice);
//
//       double individualTotalMealPrice = groupTotalMealPrice / 5;
//       System.out.println(individualTotalMealPrice);


        //////////////////////////**** Challenge *****///////////////////////
        /////////////////     Call Function: Salary Calculator    ////////////////

//       double employeeSalary =  calculateSalary(40, 30, 8);
//       System.out.println(employeeSalary);







    //////////////////////////**** Ex. Math.pow *****///////////////////////
    //////////////////////////     Built-In Functions    ////////////////////////

//   double result = Math.pow(2, 5);
//   System.out.println(result);




        //////////////////////////**** STUDENT *****///////////////////////
        ////////////////////  Data Types and Variables  ///////////////////

//        int studentAge = 15;
//        double studentGPA = 3.4;
//        boolean hasPerfectAttendance = true;
//
//        String studentFirstName = "Kayla";
//        String studentLastName = "Hammon";
//        char studentFirstInitial = studentFirstName.charAt(0);
//        char studentLastInitial = studentLastName.charAt(0);
//
//        System.out.println(studentAge);
//        System.out.println(studentGPA);
//        System.out.println(hasPerfectAttendance);
//        System.out.println(studentFirstName);
//        System.out.println(studentLastName);
//        System.out.println(studentFirstInitial);
//        System.out.println(studentLastInitial);
//
//        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA + ".");
//        System.out.println("What do you want to update it to?");
//
//
//        Scanner input = new Scanner(System.in);
//        studentGPA = input.nextDouble();
//
//        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA + ".");




        //////////////////////////**** FORTUNE TELLER *****///////////////////////
        //////////////////////////     If Statement        ///////////////////////

//        System.out.println("Pick a number between 1 and 10");
//        Scanner scanner = new Scanner(System.in);
//
//        int inputtedNum = scanner.nextInt();
//
//        if (inputtedNum < 5){
//            System.out.println("Enjoy the good luck a friend bring you.");
//        } else {
//            System.out.println("Your shoe selection will make you happy today.");
//        }



        //////////////////////////**** Song on Repeat *****///////////////////////
        ///////////////////////////     While Loop        ///////////////////////

//    Scanner input = new Scanner(System.in);
//    boolean isOnRepeat = true;
//    while(isOnRepeat) {
//        System.out.println("Playing current song");
//        System.out.println("Would you like to take this song off of repeat? If so, answer yes");
//        String userInput = input.next();
//
//        if (userInput.equals("yes")) {
//            isOnRepeat = false;
//        }
//    }
//        System.out.println("Playing next song");




        //////////////////////////**** Challenge *****///////////////////////
        ///////////////////////     Multiple Choice     /////////////////////

//        String question = "What is my favorite color?";
//        String choiceOne = "red";
//        String choiceTwo = "green";
//        String choiceThree = "blue";
//
//        String correctAnswer = choiceTwo;
////        Write a print statement asking the question
//        System.out.println(question);
//
////        Write a print statement giving the answer choices
//        System.out.println("Choose one: " + choiceOne + "  " + choiceTwo + "  " + choiceThree);
//
////        Have the user input an answer
//        Scanner input = new Scanner(System.in);
//
////        Retrive the user's input
//        String userAnswer = input.next();
//
////        If the user's input matches the correct answer, print a congrats message
//        if (userAnswer.toLowerCase().equals(correctAnswer)) {
//            System.out.println("Congratulations! You answered correctly!");
//
////         If the user's input does not match the correct answer, print an "incorrect" message
//        } else {
//            System.out.println("Sorry! That is incorrect. The correct answer is " + correctAnswer + ".");
//        }


        //////////////////////////**** Challenge *****///////////////////////
        /////////////////////////     Debugging     ////////////////////////

//        System.out.println("Let's calculate the area of a triangle");
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please input the base of the triangle (in inches).");
//        double base = input.nextDouble();
//
//        while (base <= 0) {
//            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
//            base = input.nextDouble();
//        }
//
//        System.out.println("Please input the height of the triangle (in inches).");
//        double height = input.nextDouble();
//        while (height <= 0) {
//            System.out.println("That's invalid. Please input the height of the triangle (in inches).");
//            height = input.nextDouble();
//        }
//
//        double area = (base * height) / 2;
//        System.out.println("The area is " + area);






    }
}
