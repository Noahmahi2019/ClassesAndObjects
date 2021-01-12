import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> user = new HashMap<String, String>();
        user.put("jane@gmail.com", "Jane");
        user.put("eyre@gmail.com", "Eyre");
        user.put("george@gmail.com", "George");
        user.put("Godwin@gmail.com", "Godwin");
        
        System.out.println("user : " + user.get("jane@gmail.com"));
        System.out.println("user : " + user.get("eyre@gmail.com"));
        System.out.println("user : " + user.get("george@gmail.com"));
        System.out.println("user : " + user.get("Godwin@gmail.com"));


        System.out.println(user.put("newUser@gmail.com","new user"));
        System.out.println(user.get("newUser@gmail.com"));

        user.remove("Godwin@gmail.com");
        System.out.println(user.get("Godwin@gmail.com"));
    }
}
