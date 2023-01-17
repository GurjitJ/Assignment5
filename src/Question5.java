public class Question5 {
    public static void main(String[] args) {
        int vowels = 0, consonants = 0;

        String str = "I want to be a software developer";

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels++;
            }

            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                //Increments the consonant counter
                consonants++;
            }
        }
        System.out.println("Your phrase is: " + str);
        System.out.println("Number of vowels in your phrase: " + vowels);
        System.out.println("Number of consonants in your phrase: " + consonants);
    }
}