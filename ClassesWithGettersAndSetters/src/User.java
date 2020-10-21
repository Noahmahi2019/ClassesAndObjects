public class User {

    public String firstName;
    public String lastName;
    public String userName;
    public String passWord;

    public User(String firstName, String lastName, String userName, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setPassWord(String passWord) {
        if (passWord.length() <= 10) {
            this.passWord = passWord;
        } else {
            System.out.println("Invalid Password");
        }
        String specialCharacter = "~`!@#$%^&*()-_=+|[{]};:',<.>/?";
        for (int i = 0; i < passWord.length(); i++) ;
        if (passWord.contains(specialCharacter))
            this.passWord = passWord;
        else {
            System.out.println("Error Password");
        }
    }
    public String getPassword() {
        return passWord;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}