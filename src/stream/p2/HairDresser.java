package stream.p2;

import java.util.*;

public class HairDresser {

    public int generateRandomNumber() {
        return new Random().nextInt(3) + 1;
    }

    public Map<HairColor, Long> countHumansByHairColor(List<Human> humans) {
        return null;
    }

    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(new Human(HairColor.BLACK), new Human(HairColor.BLACK), new Human(HairColor.BLACK), new Human(HairColor.YELLOW), new Human(HairColor.YELLOW), new Human(HairColor.GREEN), new Human(HairColor.GREEN));
        HairDresser hairDresser = new HairDresser();
        Map<HairColor, Long> hairColorLongMap = hairDresser.countHumansByHairColor(humans);
        hairColorLongMap.forEach((key, value) -> System.out.println(key + "머리 색 사람 수 : " + value));
    }
}
