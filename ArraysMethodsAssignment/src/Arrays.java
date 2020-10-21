public class Arrays {

    public static void main(String[] args) {
        String  usersCharacter = "Halo";
        CharacterHistory(usersCharacter);
    }

    public static void CharacterHistory(String CharacterName) {
        displayCharacter(CharacterName);
        getCharacterHighScores();
    }

    public static void displayCharacter(String CharacterName) {
        System.out.println(CharacterName +  " " + "is being displayed");
    }
    static void getCharacterHighScores() {
        System.out.println("Highest kills: 10000");
    }
}
