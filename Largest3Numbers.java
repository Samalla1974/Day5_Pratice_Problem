package basic_core_programs;

public class Largest3Numbers 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n1 = 10, n2 = 20, n3 = 30;

        if( n1 >= n2 && n1 >= n3)
            System.out.println("n1 is the largest number");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println("n2 is the largest number");

        else
            System.out.println("n3 is the largest number");
	}

}
