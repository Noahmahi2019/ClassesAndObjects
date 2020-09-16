public class Object {
    @Override
    public String toString() {
        return "Object{}";
    }

    public static void main(String[] args) {
        String [] insideManActors = {"Denzel Washington","Jodie Foster"};
        String [] rearWindowActors = { "James Stewart", "Grace Kelly"};

        Movies insideMan  = new Movies("INSIDE MAN",105, insideManActors);
        Movies rearWindow = new Movies("REAR WINDOW",112, rearWindowActors);
    }

}


