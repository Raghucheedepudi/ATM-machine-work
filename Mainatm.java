package money;
import java.util.*;
public class Mainatm {

	public static void main(String[] args) 
	{
		while(true)
	 {
	  int atmnum=9989;
	  int atmpass=1234;
	  Scanner sc=new Scanner(System.in);
	  Finalatm x=new Finalatm();
	  System.out.println("___Welcome to ATM___");
	  System.out.println("Enter The ATM Number : ");
	  int atmnum1=sc.nextInt();
	  System.out.println("Enter The ATM Password : ");
	  int atmpass1=sc.nextInt();
	  if(atmnum==atmnum1 && atmpass==atmpass1)
	  {
		  System.out.println("----how can I help You !!----");
		  System.out.println("");
		  while(true)
		  {
			
			  System.out.println(" 1.Avalable Balance \n2.Withdral Ammount \n 3.Diposit Amount \n 4.Mini Statements");
		  
			  System.out.println("Enter The Choice :");
			  int ch=sc.nextInt();
			   if(ch==1)
			   {
				  x.viewbalnce(); 
				   
			   }
			   else if(ch==2)
			   {
				   
				   System.out.println("Enter the Withdral Amount :");

				   double widral=sc.nextDouble();
				   x.withdralAmount(widral);
				   
				   
			   }
			   else if(ch==3)
			   {
				   System.out.print("Enter the Diposit Amount : ");
				   double dis=sc.nextDouble();
				   x.dipoitAmount(dis);
				  
				   
			   }
			   else if(ch==4)
			   {
				   x.statement();
			   }
			   else
			   {
				   System.out.println(" You not enter Currect choice \n Enter Currect choice..\n1.Return to Atm \n2.Exit the Atm");
				   int c2=sc.nextInt();
				   if(c2==1)
				   {
					   continue;
				   }
				   else
				   {
					   System.out.println(" You are exit Atm Thank you..");
					   System.exit(0);
					   
					   
				   }
				   
			   }
			  
		  }
	  }
	  else
	  {
		  System.out.println("Enter wrong pin or number");
		  System.out.println("Enter the Value : \n1.REnter the pin and Passward \n2.Exit the Atm");
		  int c1=sc.nextInt();
		  if(c1==1)
		  {
		  continue;
		  }else if(c1==2)
		  {
			 System.out.println("Thank you"); 
			 System.exit(c1);
		  }
		  else
		  {
			  System.out.println("Thank You and visit again.....");
			  System.exit(0);
		  }
		  
		  
	  }
		}
	  

	}

}
