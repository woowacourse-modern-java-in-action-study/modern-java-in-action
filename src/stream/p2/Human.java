package stream.p2;

public class Human {

    private final HairColor hairColor;

    public Human(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public HairColor changeHairColor(HairDresser hairDresser) {
        int hairDresserRandomNumber = hairDresser.generateRandomNumber();
        if (hairDresserRandomNumber == 1) {
            return HairColor.GREEN;
        }
        if (hairDresserRandomNumber == 2) {
            return HairColor.BLACK;
        }
        return HairColor.YELLOW;
    }
}
