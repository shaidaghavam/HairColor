
import java.util.Scanner;

public class Haircolor {

    public static void main(String[] args) {
        
        String password,username;
        String username2,password2;


        System.out.println("Enter your username\n");      Scanner scannerUserName = new Scanner(System.in);

        System.out.println("Enter your password\n");      Scanner scannerPassWord = new Scanner(System.in);


        username = scannerUserName.nextLine();
        password = scannerPassWord.nextLine();

        // your username should start with @  and password end with 0

        if (username.startsWith("@" ) && password.endsWith("0")) {
	        System.out.println("           Welcome       " + username);}


        else if (username.startsWith("@") || password.endsWith("0")) { 
            System.out.println(" your username or your password is wrong !! \n you can try again");


        System.out.println("Enter your username");
        Scanner scanUsername = new Scanner(System.in);
        System.out.println("Enter your password");
        Scanner scanPassword = new Scanner(System.in);

        username2 = scanUsername.nextLine();
        password2 = scanPassword.nextLine();

        if (username2.startsWith("@" ) && password2.endsWith("0")) {
	        System.out.println("        Welcome     " + username);}
        else if (username2.startsWith("@") || password2.endsWith("0")) { 
            System.out.println(" your username or your password is wrong !! \n you can try again ");

        }
        

    else { System.out.println("Sorry it is wrong!");

        }


    Scanner scanHairColor = new Scanner(System.in);  

    System.out.println("What color is your hair? \n ");

    String haircolor = scanHairColor.nextLine();
    haircolor = haircolor.toLowerCase();

    
switch (haircolor) {
  case "black":
    System.out.println("you should use special shampoo1");
    break;
  case "pink":
    System.out.println("you should use special shampoo2");
    break;
  case "brown":
    System.out.println("you should use special shampoo3");
    break;
  case "blond":
    System.out.println("you should use special shampoo4");
    break;
  case "ombre":
    System.out.println("you should use special shampoo5");
    break;
  case "hilight":
    System.out.println("you should use special shampoo6");
    break;
  case "salty":
    System.out.println("you should use special shampoo7");
    break;
}




            

        
        }
    }

}
        