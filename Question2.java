public class Question2

{ public static void main(String[] args) {
    String str  =  "ConsultAdd";
    String str2 = "Pvt";
    System.out.println("Original string: "+str + " " +str2);
    int n = str.length();
    int m = str2.length();
    String reversedString ="";
    String reversedString2 ="";
    char ch;
    char ch2;
    for(int i=0;i<n;i++){
        ch= str.charAt(i);
        reversedString = ch+reversedString;
    }
    for(int j=0;j<m;j++){
        ch2= str2.charAt(j);
        reversedString2 = ch2+reversedString2;
    }
    System.out.println("Reversed string: "+reversedString + " " +reversedString2);


}

}