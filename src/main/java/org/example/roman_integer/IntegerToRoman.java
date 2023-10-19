package org.example.roman_integer;

/***
 Example 1:

 Input: s = "III"
 Output: 3
 Explanation: III = 3.
 Example 2:

 Input: s = "LVIII"
 Output: 58
 Explanation: L = 50, V= 5, III = 3.
 Example 3:

 Input: s = "MCMXCIV"
 Output: 1994
 Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class IntegerToRoman {
    public static void main(String[] args) {
        reverse("MCMXCIV");
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static void reverse(String s){

        for(int i=s.length()-1;i>=0;i--){

           // System.out.println(i);


        }

    }


    public static int romanToInt(String s){
        int ans=0;
        int num=0;
        int prev=0;

        for(int i=s.length()-1;i>=0;i--){
            System.out.println("------------------------------------");

            switch (s.charAt(i)){
                case 'I': num=1; break;
                case 'V': num=5; break;
                case 'X': num=10; break;
                case 'L': num=50; break;
                case 'C': num=100;break;
                case 'D': num=200; break;
                case 'M': num=1000; break;
            }
            System.out.println(i);
            System.out.println(s.charAt(i));
            System.out.println(num);
            System.out.println(ans);
            if(num<prev){
                ans-=num;
            } else {
                ans+=num;
            }
            prev=num;

        }
        return ans;
    }

}
