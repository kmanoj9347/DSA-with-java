/* Identify possible words: Detective Bakshi while solving a case stumbled upon a letter which
had many words whose one character was missing ie. one character in the word was replaced
by an underscore. For e.g. “Fi_ er”. He also found thin strips of paper which had a group of
words separated by colons, for e.g. “Fever:filer:Filter: Fixer:fiber:fibre:tailor:offer”. He could
figure out that the word whose one character was missing was one of the possible words from
the thin strips of paper. Detective Bakshi has approached you (a computer programmer)
asking for help in identifying the possible words for each incomplete word.
You are expected to write a function to identify the set of possible words
The function identity PossibleWords takes two strings as input,
input1 contains the incomplete word, and
input2 is the string containing a set of words separated by colons
The function is expected to find all the possible words from input2 that can replace the
incomplete word input1, and then return the final output string in the format specified below
See below examples carefully to understand the format of input1, input2 and output
Example1:
input1= "Fi_er”
input2=”Fever:filer:Filter: Fixer:fiber:fibre:tailor:offer”
output= "FILER:FIXER FIBER” */
package DSA_Practice;
import java.util.*;
public class Practice_DSA_01{ 
    private static String[] words;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter input1 :");
        String input1 = sc.nextLine();
        System.out.print("Enter input2:");
        String input2 = sc.nextLine();
        int i, j;
        input1 = input1.toUpperCase();
        input2 = input2.toUpperCase();
        String word = "", res ="",
        String[] words = input2.split(":");
        for(i =0 ; i<words.length;i++)
        {
            word = words[i];
            if(input1.length()==word.length())
            {
                for(j=0;j<input1.length();j++)
                {
                if(input1.charAt(j)!='_'&&input1.charAt(j)!=word.charAt(j))
                {
                    break;
                }
            }
            if(j==input1.length())
            {
                res = res + word+":";
            }
        }
        
    }
    }
}

