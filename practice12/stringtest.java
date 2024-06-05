package practice12;

import java.lang.*;
public class stringtest 
{
    
    public static void main(String a[])
    {
        String s1="HCST";
        
        String s2=new String("HCST");
        
        char[] ch={'o','f'};
        String s3=new String(ch);
        
        char ch1[]={'s','c','i','e','n','c','e'};
        String s4=new String(ch1,1,4);
        
        String s5="hcst";
        
        String s6="  Hindustan";
        
        
        
        s6.length();
      
       
       
       
       
       
       
       
       
       
       
        
        
        
//Comparison
        
//1. Equals && equalsIgnoreCase
//The String equals() method compares the original content of the string. It compares values of string for equality. String class provides two methods:
//public boolean equals(Object another) compares this string to the specified object.
//public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.

       System.out.println(s1.equals(s2));
       System.out.println(s1.equals(s3));
       System.out.println(s1.equalsIgnoreCase(s5));
       
//2. == operator: The = = operator compares references not values.
       System.out.println(s1==s2);
       
//3. compareTo && compareToIgnoreCase
       System.out.println(s1.compareTo(s2));
       System.out.println(s1.compareToIgnoreCase(s5));
       
       
//Concatenation

//1. + operator
       System.out.println(s1+s2);
       
//2. concat method: concatenates the specified string to the end of current string      
       System.out.println(s1.concat(s2));
       
//Substring
       
//1. substring(int startIndex)- startIndex inclusive
       
       System.out.println(s6.substring(3));
       
//2. substring(int startIndex, int endIndex):
       System.out.println(s6.substring(3,6));
       
       
//String class methods:
       //1. toUpperCase and toLowerCase
       System.out.println(s4.toUpperCase());
       
       System.out.println(s6.toUpperCase());
       
       //2.trim: eliminates white spaces before and after string
       System.out.println(s6.trim());
       
       //3.startsWith() and endsWith()
       System.out.println(s6.startsWith("  Hi"));
       
       System.out.println(s6.endsWith("an"));
       
       //4. charAt() method: returns a character at specified index.
       System.out.println(s6.charAt(4));
       
       //5. length() method: returns length of the string
       System.out.println(s6.length());
       
       //6. intern() method: When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.
       
       String s7=s1.intern();
       System.out.println(s7);
       
       //7. valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string
       
       int as=10;
       String s8=String.valueOf(as);
       System.out.println(s8);
       System.out.println(s8+11);
       
       //8. replace() method: replaces all occurrence of first sequence of character with second sequence of character.
       String s9="Java is a programming Lang, Java is an island too";
       System.out.println(s9.replace("Java", "Kava"));
    }
}
