import java.io.*;
import java.lang.*;

public class TimeTester{
	public static void main(String[] args){
		Time t1 = new Time(12, 30, "am");
		Time t2 = new Time(2, 42, "pm");
		t1.print();

		t1.addDuration(45);
		t1.print();
		System.out.println("");

		t1.addDuration(11, 15);
		t1.print();
		System.out.println("");

		if(t1.isBefore(t2))
			System.out.println("t1 e' precedente a t2");
		else
			System.out.println("t1 non è precedente a t2");

		if(t1.isAfter(t2))
			System.out.println("t1 è antecedente a t2");
		else 
			System.out.println("t1 non è antecedente a t2");
	}
}