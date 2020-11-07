/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Supiya
 */
import java.util.Scanner;
public class Stringarray {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String arr[]=new String[3];
    
    for(int i=0;i<3;i++)
    {
        arr[i]=sc.nextLine();
    }
    
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("str["+i+"]="+arr[i]);
    }
}
}
