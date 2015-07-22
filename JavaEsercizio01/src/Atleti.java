
public class Atleti implements Ordinabile {

	int eta=0;
	int prestazione=0;
	int pettorale=0;
	public final static double coefficienteEta=0.4;
	
	public Atleti(int _pettorale, int _eta, int _prestazione){
		eta=_eta;
		prestazione=_prestazione;
		pettorale=_pettorale;		
	}

	public boolean minoreDi(Object altroAtleta){
		
		if( altroAtleta==null || !(altroAtleta instanceof Atleti))
		return false;
		
		else{
			double indicePrestazioniQuesto=prestazione-eta*coefficienteEta;
			double indicePrestazioneAltro=((Atleti)altroAtleta).prestazione-((Atleti)altroAtleta).eta*coefficienteEta;
			return indicePrestazioniQuesto<indicePrestazioneAltro;
		}
	}
	
	public boolean maggioreeDi(Object altroAtleta){
		return !minoreDi(altroAtleta);
	}

}
