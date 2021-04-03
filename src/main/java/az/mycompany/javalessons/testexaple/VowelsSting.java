package az.mycompany.javalessons.testexaple;


public class VowelsSting {
    public static void main(String[] args) {
        System.out.println("Vowel count : " + vowelsCount("encyclopedia"));

    }

    public static int vowelsCount(String str) {
        char[] charset = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (char chr : str.toLowerCase().toCharArray()) {
            for (char vowels : charset) {
                if (chr == vowels) count += 1;
            }
        }
        return count;
    }

}