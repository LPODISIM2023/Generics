package generics.soluzione.grezza;


public class MenoFigata {
	public static void main(String[] args) {
		try {
			Carnivoro tigre = new Carnivoro();
			Cibo erba = new Erba();
			Erbivoro erbivoro = new Erbivoro();
			tigre.mangia(erbivoro);
			tigre.mangia(erba);
		} catch (CiboException ex) {
			ex.printStackTrace();
		}
	}
}

interface Cibo {
	String getColore();
}

interface Animale {
	void mangia(Cibo cibo) throws CiboException;
}

class Erba implements Cibo {
	public String getColore() {
		return "verde";
	}
}

class Carnivoro implements Animale {
	public void mangia(Cibo cibo) throws CiboException {
		if (!(cibo instanceof Erbivoro)) {
			throw new CiboException("Un carnivoro deve mangiare animali");
		}
		System.out.println("Carnivoro mangia cibo: " + cibo.getColore());
	}
}

class Erbivoro implements Cibo, Animale {
	public void mangia(Cibo cibo) throws CiboException {
		if (!(cibo instanceof Erba)) {
		    throw new CiboException("Un erbivoro deve mangiare erba!");
		}
		System.out.println("Erbivoro mangia cibo: " + cibo.getColore());

	}

	public String getColore() {
		return "rosso";
	}
}
