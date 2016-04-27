
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sbi sb=new Sbi();
Icici ic= new Icici();
Axis ax=new Axis();
System.out.println("SBI bank rate of intrest" +" "+sb.getRateOfIntrest()+"%");
System.out.println("ICICI bank rate of intrest"+" "+ic.getRateOfIntrest()+"%");
System.out.println("AXIS bank rate of intrest"+" "+ax.getRateOfIntrest()+"%");
	}

}
