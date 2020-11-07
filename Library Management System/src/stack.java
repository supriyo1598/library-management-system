/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Supiya
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author USER
 */
public class stack {
   int top,a[],max;
    stack()
    {
        top=-1;
        max=5;
        a=new int[5];
    }
    void pus(int p)
    {
        if(top==max-1)
           System.out.println("stack overflow");
        else
        {
            top++;
            a[top]=p;
            System.out.println("push"+a[top]);
        }
    }
    void pop()
    {
        int d;
        if(top==-1)
            System.out.println("no element to pop");
        else
        {
            d=a[top];
            top--;
            System.out.println("pop"+d);
        }
    }
    void display()
    {
        if(top==-1)
            System.out.println("no elements to display");
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String args[])
    {
        stack obj=new stack();
        obj.pop();
        obj.pus(5);
        obj.display();
        
    }
}

