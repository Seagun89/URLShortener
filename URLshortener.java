public class URLshortener
{
    // fields
    public static char[] ch = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray(); // initializing the char array for the characters for possible combos
    public static StringBuilder shortURL; //defining the string used to hold shortURL
    public static int base62 = 62; // int 62
    //main 
    public static void main(String[] args)
    {
        System.out.println(idToShortURL(12345)); //printing the shortURL from id
    }
    // functions
    public static String idToShortURL(int n) // n is the long URL counter (how many chars in longURL)
    {
        shortURL = new StringBuilder(" "); // empty string for the shortURL
        while(n != 0) // while the longURL counter hasn't reached zero 
        {
            shortURL.append(ch[n % base62]); // find the matching char to the remainder after modding by 62 then append char to string
            n /= base62; // cut counter by 62 
        }
        
        return shortURL.reverse().toString(); // why must I reverse the string after converting to base 62?
    }
}