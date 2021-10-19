
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username=scanner.nextLine();
        System.out.println("Enter password: ");
        String password=scanner.nextLine();
        
        ArrayList<String> usernamesArray=new ArrayList<>();
        usernamesArray.add("alex");
        usernamesArray.add("emma");
        
        ArrayList<String> passwordsArray=new ArrayList<>();
        passwordsArray.add("sunshine");
        passwordsArray.add("haskell");
        
        if(isPasswordCorrect(username, password, usernamesArray, passwordsArray)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
    
    public static Boolean isPasswordCorrect(String name, String password, ArrayList<String> usernames, ArrayList<String> passwords) {
        //Provide Username, Password, ArrayList of usernames, and Arraylist of passwords
        //Return true if provided password match the password in array
        int index=0;
        for (int i=0;i<usernames.size();i++) {
            if (name.equals(usernames.get(i))) {
                index=i;
            }
        }
        if (password.equals(passwords.get(index))) {
            return true;
        } else {
            return false;
        }
    }
}
