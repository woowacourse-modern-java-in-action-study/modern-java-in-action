package stream.p3;

public class CharacterParser {

    private CharacterParser() {
        throw new UnsupportedOperationException();
    }

    public static String parseString(String target) {
        return null;
    }

    public static void main(String[] args) {
        String allDigit = CharacterParser.parseString("123");
        System.out.println(allDigit.equals("allDigit"));

        String allAlphabetic = CharacterParser.parseString("abc");
        System.out.println(allAlphabetic.equals("allAphabetic"));
    }
}
