public class Question1

{ public static void main(String[] args) {
        String str  =  "ConsultAdd";
        System.out.println("string: "+str);
        int n = str.length();
        String reversedString ="";
        char ch;
        for(int i=0;i<n;i++){
            ch= str.charAt(i);
            reversedString = ch+reversedString;
        }
        System.out.println("Reversed string: "+reversedString);


    }

}