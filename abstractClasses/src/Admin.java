public class Admin extends User{
    private int ptoDays;

    public Admin(String firstName, String lastName, String email, String username, String password, int totalNumberOfDaysAbsences, int ptoDays) {
        super(firstName, lastName, email, username, password, totalNumberOfDaysAbsences);
        this.ptoDays = ptoDays;
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    @Override
    public void numberOfAbsentDays(int daysAbsent) {
        this.ptoDays-=daysAbsent;
        System.out.println(this.getFirstName() + " has " + this.ptoDays + " pto days left.");
    }
}
