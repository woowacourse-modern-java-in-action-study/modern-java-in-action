package stream.answers;

import java.util.*;

public class HairDresser {

    public int generateRandomNumber() {
        return new Random().nextInt(3) + 1;
    }

//    public Map<HairColor, Long> countHumansByHairColor(List<Human> humans) {
//        Map<HairColor, Long> map = humans.stream()
//                .map(human -> human.changeHairColor(this))
//                .collect(Collectors.groupingBy(this::classify, () -> new EnumMap<>(HairColor.class), Collectors.counting()));
//        Arrays.stream(HairColor.values())
//                .forEach(hairColor -> map.computeIfAbsent(hairColor, key -> 0L)); //초기화 부분은 map의 merge로도 가능
//        return map;
//    }
//
//    private HairColor classify(HairColor hairColor) {
//        if (hairColor == HairColor.BLACK) {
//            return HairColor.YELLOW;
//        }
//        if (hairColor == HairColor.YELLOW) {
//            return HairColor.BLACK;
//        }
//        return HairColor.GREEN;
//    }
}
