public class Main {

    public static void main(String[] args) {

        Teacher firstTeacher = new Teacher("George","Bowling","Bowling@gmail.com","George111",
                 "Bowl2020",5,10);

         Admin admin1 = new Admin("Elinor","Dashwood","Dashwood@gmail.com ","Dashwood1010",
                 "Elinor1030",4,20);

         firstTeacher.numberOfAbsentDays(8);
         admin1.numberOfAbsentDays(10);
        System.out.println(firstTeacher.getFirstName());
        System.out.println(admin1.getEmail());
    }
}
