import java.util.*;
class student
{
	int regno,m1,m2,m3;
	String name;
	student(int regno,String name,int m1,int m2,int m3)
	{
		this.regno=regno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void display()
	{
		System.out.println("Register number="+regno);
		System.out.println("Student name="+name);
		System.out.println("Marks for subject1="+m1);
		System.out.println("Marks for subject 2="+m2);
		System.out.println("Marks for subject 3="+m3);
	}
	public static void mainI(String args[])
	{
		Student s1=new Student(101,"vaishu",98,88,78);
		S1.display();
	}
}
		  