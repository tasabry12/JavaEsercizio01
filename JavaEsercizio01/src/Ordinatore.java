public class Ordinatore {

	Ordinabile[] v = null;

	public Ordinatore(Ordinabile[] _v) {
		v = _v.clone();
	}

	Ordinabile[] selectionSortA_Z() {
		for (int i = 0; i < v.length - 1; i++) {
			int posizioneMinimoDeiRimanenti = posMin(i);
			Ordinabile tmp = v[i];
			v[i] = v[posizioneMinimoDeiRimanenti];
			v[posizioneMinimoDeiRimanenti] = tmp;
		}
		return v;
	}

	int posMin(int partiDa) {
		int posizioneMinimo = partiDa;
		int posizioneCorrente = partiDa + 1;
		while (posizioneCorrente < v.length) {
			if (v[posizioneCorrente].minoreDi(v[posizioneMinimo]))
				posizioneMinimo = posizioneCorrente;
			posizioneCorrente++;
		}
		return posizioneMinimo;
	}
}
