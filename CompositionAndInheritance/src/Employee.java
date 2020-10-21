
public class Employee {
    private int ptoDays;
    private String username;
    private String password;

    public Employee(int ptoDays, String username, String password) {
        this.ptoDays = ptoDays;
        this.username = username;
        this.password = password;
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}