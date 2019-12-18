abstract class student
{
	String name,address;
	long id;
	double grade;
	int age;
	int s1,s2,s3,s4,s5;
	void setMarks(int s1,int s2,int s3,int s4,int s5)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
	}
	void CalcGrade()
	{
		grade = (s1+s2+s3+s4+s5)/5;
	}
	public abstract boolean isPassed();
}
class Grad extends student
{
	public synchronized boolean isPassed()
	{
		System.out.println(Thread.currentThread().getName());
		if(grade>80)
			return true;
		else
			return false;
	}
}
class Undergrad extends student
{
	public synchronized boolean isPassed()
	{
		System.out.println(Thread.currentThread().getName());
		if(grade>70)
			return true;
		else
			return false;
	}
}
class test implements Runnable
{
	student s;
	test(student s)
	{
		this.s = s;
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		System.out.println(s.isPassed());
	}
	public static void main(String args[])
	{
		double grade;
		student s1 = new Grad();
		s1.setMarks(60,60,90,60,100);
		s1.CalcGrade();
		student s2 = new Grad();
		s2.setMarks(60,90,90,90,100);
		s2.CalcGrade();
		new test(s1);
		new test(s2);
		s1 = new Undergrad();
		s1.setMarks(60,90,90,70,100);
		s1.CalcGrade();
		s2 = new Undergrad();
		s2.setMarks(60,50,40,70,100);
		s2.CalcGrade();
		new test(s1);
		new test(s2);
	}
}