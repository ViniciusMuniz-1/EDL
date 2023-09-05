package PilhaComVector;

public class TestePilha {
	public static void main(String[] args) {		
		PilhaArray pp= new PilhaArray(10);
		System.out.println("inserindo");
		for(int f=0;f<11;f++){
			  System.out.println(f);		  
			  pp.push(f);
			}
		pp.showPilha(pp);
		
		System.out.println("retirando");
		for(int f=0;f<1;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.pop());
		}
		
		pp.showPilha(pp);
		pp.empty(pp);
		pp.showPilha(pp);
	}
}
