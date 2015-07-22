
public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atleti[] elenco = {new Atleti(1,19,13),
				           new Atleti(2,29,14),
				           new Atleti(3,29,15),		           
			};
		
		Ordinatore o = new Ordinatore(elenco);
		
		Atleti[] classifica = (Atleti[]) o.selectionSortA_Z();
		
		
		System.out.println("\nClassifica");
		for(int i=0; i<classifica.length;i++){
			System.out.println("Pettorale "+classifica[i].pettorale+" "+(classifica[i].prestazione-Atleti.coefficienteEta*classifica[i].eta));
		}
		
		
		

	}

}
