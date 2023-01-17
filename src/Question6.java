public class Question6 {
    public static void main(String[] args) {

        String phrase = "Hi, welcome to this program that I made!";
        String str1 = "welcome";

        boolean result = phrase.contains(str1);
        if (result) {
            System.out.println(str1 + " is present in the phrase: " + phrase);
        } else {
            System.out.println(str1 + " is not present in the phrase: " + phrase);
        }

    }
}