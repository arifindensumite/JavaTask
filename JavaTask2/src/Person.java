import java.util.Scanner;

public class Person { // SuperClass
    String type = "Man";
    int userInput;
    public void inputType(){ // Person Method
        Scanner in = new Scanner(System.in);
        System.out.print("1.Man\n2.Female\nPlease insert your gender : ");
        userInput = in.nextInt();

        switch (userInput){
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
    public void displayType() { // Person Method
        System.out.println("I am a " + type);
    }
}

class Man extends Person { // SubClass
    String name = "Ahmad";
    int age;

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        Man user1 = new Man(); // Create Man Object

        user1.inputType();
        System.out.print("Please insert your name : ");
        user1.name = in.nextLine();
        System.out.print("Please insert your age : ");
        user1.age = in.nextInt();

        user1.displayType(); // Display Person Method
        System.out.println("My name is " + user1.name + " and I am " + user1.age + " Years old");
        System.out.println("Please insert number only");
    }
}