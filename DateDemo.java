import java.util.*;
class DateDemo
{
    public static void main(String args[])
    {
        Date d=new Date();
        
        System.out.println("The Today Date and Time is:"+d);
        System.out.println("The Date is:"+d.getDate());
        System.out.println("The Month is:"+(d.getMonth()+1));
        System.out.println("The Year is:"+(d.getYear()+1900));
  System.out.println("Today Date  is:"+d.getDate()+"-0"
                                +(d.getMonth()+1)+"-"+(d.getYear()+1900));
        System.out.println("The Hours is:"+d.getHours());                                         
        System.out.println("The Minutes is:"+d.getMinutes());
        System.out.println("The Seconds is:"+d.getSeconds());
System.out.println("Time is:"+d.getHours()+":"
                                +d.getMinutes()+":"+d.getSeconds());        
    }
}