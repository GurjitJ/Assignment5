public class Question4
{
    public static void main(String[] args)
    {
        String str = "ConsultAdd";
        char search = 'd';

        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == search)
                count++;
        }

        System.out.println("The letter '"+search+"' appears "+count+" times in the word " + str);
    }
}
