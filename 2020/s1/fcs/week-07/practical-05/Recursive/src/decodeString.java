import java.util.*;
import java.lang.*;
import java.io.*;
public class decodeString {
        // main method
        public static void main (String[] args) throws java.lang.Exception
        {
            String str = "2[b2[ca]1[d]]";
            // print the output
            System.out.println("Input: "+str);
            System.out.println("Output: "+decodeString(str));
        }
        // method to decode the string using stack
        static String decodeString(String str)
        {
            // create stack
            Stack<Integer> intstack = new Stack<>();
            Stack<Character> strstack = new Stack<>();
            String temp = "", result = "";

// traverse the string
            for (int i = 0; i < str.length(); i++)
            {
                int count = 0;

// If number exists, convert it into number and push it into intstack.
                if (Character.isDigit(str.charAt(i)))
                {
                    while (Character.isDigit(str.charAt(i)))
                    {
                        count = count * 10 + str.charAt(i) - '0';
                        i++;
                    }

                    i--;
                    intstack.push(count);
                }

// If get closing bracket ']', pop the elm till the '[' is not found in strstack
                else if (str.charAt(i) == ']')
                {
                    temp = "";
                    count = 0;

                    if (!intstack.isEmpty())
                    {
                        count = intstack.peek();
                        intstack.pop();
                    }

                    while (!strstack.isEmpty() && strstack.peek()!='[' )
                    {
                        temp = strstack.peek() + temp;
                        strstack.pop();
                    }

                    if (!strstack.empty() && strstack.peek() == '[')
                        strstack.pop();

// repeat the popped string temp number of times.
                    for (int j = 0; j < count; j++)
                        result = result + temp;

// push it in the strstack
                    for (int j = 0; j < result.length(); j++)
                        strstack.push(result.charAt(j));

                    result = "";
                }

// if get '[', push it into strstack
                else if (str.charAt(i) == '[')
                {
                    if (Character.isDigit(str.charAt(i-1)))
                        strstack.push(str.charAt(i));

                    else
                    {
                        strstack.push(str.charAt(i));
                        intstack.push(1);
                    }
                }

                else
                    strstack.push(str.charAt(i));
            }

// pop all the elm and make a string
            while (!strstack.isEmpty())
            {
                result = strstack.peek() + result;
                strstack.pop();
            }
// return the final result
            return result;
        }

    }
