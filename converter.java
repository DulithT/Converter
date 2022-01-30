//Name: Dulith Thaveesha Wijekoon
//Student ID: A00224718
//JAV1001

//Convert units between different forms of measurements

import java.util.Scanner;
public class converter {
    public static void main(String[]args) {
        float input = 1;

        //Choose the convertion
        System.out.println("Choose from the following to convert:");
        System.out.println("\t1. km to m");
        System.out.println("\t2. Miles to km");
        System.out.println("\t3. cm to in");
        System.out.println("\t4. in to cm");
        System.out.println("\t5. kg to lb");
        System.out.println("\t6. lb to kg");
        System.out.println("");

        Scanner menuIn = new Scanner(System.in);
        System.out.print("\t"); int menu = Integer.parseInt(menuIn.nextLine());

        if (menu == 1) {
            //km to miles
            
            System.out.println("Enter the distance you need to convert from km to mi:");
            
            //Getting the user input and converting it to a float
            try (Scanner userIn = new Scanner(System.in)) {
                System.out.print("\t"); input = Float.parseFloat(userIn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("***********");
                System.out.println("Wrong input");
            }
            
            //Calculation
            float output = input*0.62f;
            
            //Printing out the result
            System.out.println("");
            System.out.println("\t" + input + " km equals to " + output + " miles");
            System.out.println("");
        }

        else if (menu == 2) {
            //Miles to km
            
            System.out.println("Enter the distance you need to convert from mi to km:");
            
            //Getting the user input and converting it to a float
            try (Scanner userIn = new Scanner(System.in)) {
                System.out.print("\t"); input = Float.parseFloat(userIn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("***********");
                System.out.println("Wrong input");
            }
            
            //Calculation
            float output = input*1.61f;
            
            //Printing out the result
            System.out.println("");
            System.out.println("\t" + input + " miles" + " equals to " + output + " km");
            System.out.println("");         
        }

        else if (menu == 3) {
            //cm to in
            
            System.out.println("Enter the number you need to convert from cm to in:");
            
            //Getting the user input and converting it to a float
            try (Scanner userIn = new Scanner(System.in)) {
                System.out.print("\t"); input = Float.parseFloat(userIn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("***********");
                System.out.println("Wrong input");
            }
            
            //Calculation
            float output = input*0.39f;
            
            //Printing out the result
            System.out.println("");
            System.out.println("\t" + input + " cm" + " equals to " + output + " in");
            System.out.println("");         
        }

        else if (menu == 4) {
            //in to cm

            System.out.println("Enter the number you need to convert from in to cm:");
            
            //Getting the user input and converting it to a float
            try (Scanner userIn = new Scanner(System.in)) {
                System.out.print("\t"); input = Float.parseFloat(userIn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("***********");
                System.out.println("Wrong input");
            }
            
            //Calculation
            float output = input*2.54f;
            
            //Printing out the result
            System.out.println("");
            System.out.println("\t" + input + " in" + " equals to " + output + " cm");
            System.out.println("");
        }

        else if (menu == 5) {
            //kg to lb

            System.out.println("Enter the number you need to convert from kg to lb:");
            
            //Getting the user input and converting it to a float
            try (Scanner userIn = new Scanner(System.in)) {
                System.out.print("\t"); input = Float.parseFloat(userIn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("***********");
                System.out.println("Wrong input");
            }
            
            //Calculation
            float output = input*2.2f;
            
            //Printing out the result
            System.out.println("");
            System.out.println("\t" + input + " kg" + " equals to " + output + " lb");
            System.out.println("");
        }

        else if (menu == 6) {
            //lb to kg

            System.out.println("Enter the number you need to convert from lb to kg:");
            
            //Getting the user input and converting it to a float
            try (Scanner userIn = new Scanner(System.in)) {
                System.out.print("\t"); input = Float.parseFloat(userIn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("***********");
                System.out.println("Wrong input");
            }
            
            //Calculation
            float output = input*0.45f;
            
            //Printing out the result
            System.out.println("");
            System.out.println("\t" + input + " lb" + " equals to " + output + " kg");
            System.out.println("");
        }
    }
}

