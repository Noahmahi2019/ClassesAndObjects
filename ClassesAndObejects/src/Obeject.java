public class Obeject {
    public static void main(String[] args) {
        Media m1 = new Media("movie", "allTogether", "drama");
        Media m2 = new Media("tvShow", "cleaners", "action");

        System.out.println(m1.getProgram());
        System.out.println(m1.getTitle());
        System.out.println(m1.getCategories());
    }
}