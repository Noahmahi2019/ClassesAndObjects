public class Main {

    public static void main(String[] args) {

        LightSwitch mySwitch = new LightSwitch("NS001650", true);

        mySwitch.setOn(false);
        System.out.println(mySwitch.getIsOn());
    }
}


