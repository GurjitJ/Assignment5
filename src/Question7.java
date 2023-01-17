public class Question7 {
    public static boolean checkStr(String str) {
        str = str.toLowerCase();
        char[] array = str.toCharArray();
        for (char ch : array) {
            if(str.indexOf(ch) != str.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "ConsultAd";
        boolean result = checkStr(word);
        if(result == true) {
            System.out.println(word + " is an Isogram");
        }
        else {
            System.out.println(word + " is not an Isogram");
        }
    }
}