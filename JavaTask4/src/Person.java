import java.util.Scanner;

public class Person { // SuperClass
    String type = "Man";
    int userInput;

    public void inputType(){ // Person Method
        Scanner in = new Scanner(System.in);
        while(userInput != 1 && userInput != 2) {
            System.out.print("1.Man\n2.Female\nPlease insert your gender : ");
            userInput = in.nextInt();

            switch (userInput) {
                case 1:
                    type = "Man";
                    break;
                case 2:
                    type = "Woman";
                    break;
                default:
                    System.out.println("Please insert correct gender");
            }
        }
    }
    public void displayType() { // Person Method
        System.out.println("I am a " + type);
    }
}

class Man extends Person { // SubClass
    String name;
    int age;
    Man(String inName, int inAge){ // Man Constructor
        name = inName;
        age = inAge;
        inputType();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        try{ // Try and catch
            System.out.print("Please insert your name : ");
            String inName = in.nextLine();
            System.out.print("Please insert your age : ");
            int inAge = in.nextInt();

            Man user1 = new Man(inName, inAge); // Create Man Object

            user1.displayType(); // Display Person Method
            System.out.println("My name is " + user1.name + " and I am " + user1.age + " Years old");
        }catch(Exception e){
            System.out.println("Please insert number only");
        }
    }
}