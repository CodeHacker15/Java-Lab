import java.util.Scanner;
class Time
{
    private int hour,min,sec;
    public Time()
    {
    }
    public Time(int hour,int min,int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    public Time add(Time t1,Time t2)
    {
        Time t3 = new Time();
        t3.sec = t1.sec + t2.sec;
        t3.min = t1.min + t2.min;
        t3.hour = t1.hour + t2.hour;
        t3.min+=t3.sec/60;
        t3.sec%=60;
        t3.hour+=t3.min/60;
        t3.min%=60;
        return t3;
    }
    public void display()
    {
        System.out.println("The total time is: ");
        System.out.println("Hours : "+hour);
        System.out.println("Minutes : "+min);
        System.out.println("Seconds : "+sec);
    }
}
class q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int h,m,s;
        System.out.println("Data of Time 1 : ");
        System.out.print("Hours = ");
        h = sc.nextInt();
        System.out.print("Minutes = ");
        m = sc.nextInt();
        System.out.print("Seconds = ");
        s = sc.nextInt();
        Time t1 = new Time(h,m,s);
        System.out.println("Data of Time 2 : ");
        System.out.print("Hours = ");
        h = sc.nextInt();
        System.out.print("Minutes = ");
        m = sc.nextInt();
        System.out.print("Seconds = ");
        s = sc.nextInt();
        Time t2 = new Time(h,m,s);
        Time t3 = new Time();
        t3 = t3.add(t1,t2);
        t3.display();
    }
}