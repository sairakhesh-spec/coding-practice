import java.util.*;
public class UsVowelsOrConsonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char Vowels = sc.next().charAt(0);

        Vowels = Character.toLowerCase(Vowels);

        if(Vowels == 'a' || Vowels == 'e' || Vowels == 'i' ||Vowels == 'o' ||Vowels == 'u' )
             System.out.println("It is Vowels:"+Vowels);
        else 
            System.out.println("it is Consonants");    
    }
}
