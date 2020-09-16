public class forEach {

    public static void main(String[] args) {
        String[]users= {"noah","Mahi","Michael","Wandi"};
        welcomeForEachUser(users);
    }

    public static void welcomeForEachUser(String[] usersName) {
        for (String name:usersName) {
            System.out.println("welcome"+" " +name);

        }
    }
}

