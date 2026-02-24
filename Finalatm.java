package money;
import java.util.*;
public class Finalatm implements p1 {
	Atm a=new Atm();
	Map<Double,String> mini=new HashMap<>();

	@Override
	public void viewbalnce() {
	System.out.println("Avalable Balance : "+a.getbalance());
	System.out.println();
		
	}

	@Override
	public void withdralAmount(double withdral) {
		if(withdral<=a.getbalance())
		{
			mini.put(withdral," -> Amount Withdrawl");
		System.out.println(withdral+" Withdral Succesfully...");
		a.setbalance(a.getbalance()-withdral);
		System.out.println();
		viewbalnce();
		}
		else
		{
			System.out.println("Insuficent Balance..");
		}
		
		
	}

	@Override
	public void dipoitAmount(double diposit) {
		mini.put(diposit," -> Amount diposited");
		System.out.println("Diposit Succefully : "+diposit);
		a.setbalance(a.getbalance()+diposit);
		System.out.println();
		viewbalnce();
		
		
	}

	@Override
	public void statement() {
		for(Map.Entry<Double,String> m:mini.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
			
		}
		viewbalnce();
	}

}
