package w03;

class Counter {
	int end;
	int counter = 1;

	// Konstrukt�ren. Vi m�tte ha inn hva end skulle v�re. counter skulle
	// alltid starte p� 1.
	public Counter(int end) {
		this.end = end;
	}

	int getCounter() {
		return counter;
	}

	boolean count() {
		if (counter == end)
			return true;
		else {
			counter++; // samme som 'counter += 1' som er det samme som 'counter = counter + 1'
			return false;
		}
	}

	/**
	 * Vi kan jo starte med � lage den akkurat som n�r en skal g� opp med 1.
	 */
	boolean count(int inc) {
		if (counter == end)
			return true;
		else {
			counter += inc;
			return false;
			// Ser dere hva som blir feil her? Kan dere fikse feilene selv?
		}
	}
	/*
	 * For �vrig kan en se p� kravene slik de er beskrevet i lysarkene og sp�rre om
	 * det er helt spesifikt beskrevet. Gitt tilstanden counter = 4, end = 5, og en
	 * kaller count(2). Det er nettopp usikkerheten i beskrivelsen som gj�r at det
	 * blir litt vanskelig � lage ting uten at det ogs� kan krasje.
	 */

	public static void main(String[] args) {
		Counter c = new Counter(3);
		System.out.println(c.getCounter());
		System.out.println(c.count(2));
		System.out.println(c.getCounter());
		System.out.println(c.count(2));

		// Her kan vi ogs� lage en l�kke som g�s igjennom helt til vi er ferdige:
		Counter c2 = new Counter(8);
		while (c2.count() == false) {
			System.out.println(c2.count());
			System.out.println(c2.getCounter());
		}

		// Kan dere finne ut hva som er galt her, og fikse det?
//		Counter c3 = new Counter(8);
//		while (c3.count() == false) {
//			System.out.println(c3.count(3));
//			System.out.println(c3.getCounter());
//		}
	}

}
