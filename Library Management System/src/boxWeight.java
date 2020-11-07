/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Supiya
 */
class box{
    private double width,height,length;
    
    box(box ob)
    {
        width=ob.width;
        length=ob.length;
        height=ob.height;
    }
    box(double w,double h,double l)
    {
        width=w;
        height=h;
        length=l;
    }
    box(){
        width=-1;
        height=-1;
        length=-1;
    }
    box(double len){
        height=width=length=len;
    }
    double volume()
    {
        return height*width*length;
    }
}
public class boxWeight extends box{
    double weight;
    
    boxWeight(boxWeight ob)
    {
        super(ob);
        weight=ob.weight;
    }
    boxWeight(double w,double h,double l,double m)
    {
        super(w,h,l);
        weight=m;
    }
    boxWeight()
    {
        super();
        weight=-1;
    }
    boxWeight(double l,double m)
    {
        super(l);
        weight=m;
    }
    public static void main(String args[])
    {
         boxWeight mybox1=new boxWeight(10,20,25,30);
        boxWeight mybox=new boxWeight(mybox1);
        double vol;
        vol=mybox.volume();
        System.out.println("Volume of the box:"+vol);
        
        
    }
    
}
