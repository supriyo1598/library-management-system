/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Supiya
 */
public class Stringdemo {
    public static void main(String args[])
    {
        String s1="First String";
        String s2="First String";
        String s3=s1+" and "+s2;
        System.out.println(s3);
        
        System.out.println("Length of s1:"+s1.length());
        
        System.out.println("char at index 4:"+s1.charAt(4));
        
        if(s1.equals(s2))
        {
            System.out.println("Same");
        }
        else
            System.out.println("Not same");
    }
}
