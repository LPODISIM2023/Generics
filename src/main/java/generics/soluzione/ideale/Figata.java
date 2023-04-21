package generics.soluzione.ideale;

public class Figata {
	public static void main(String[] args){
		Erba e = new Erba();
		Carnivoro c = new Carnivoro();
		Erbivoro eb = new Erbivoro();
		eb.mangia(e);
		c.mangia(eb);

	}
}

interface Animale<C extends Cibo> {
	void mangia(C cibo);
}

interface Cibo {
    String getColore();
}

class Erba implements Cibo {
    public String getColore() {
        return "verde";    
    }
}

class Carnivoro<E extends Erbivoro> implements Animale<E> {
	@Override
	public void mangia(E erbivoro) {
		// un carnivoro potrebbe mangiare erbivori
		System.out.println(erbivoro.getColore());
	}
}

class Erbivoro<E extends Erba> implements Cibo, Animale<E> {
	@Override
	public void mangia(E erba) {
		System.out.println(erba.getColore());
	}

	public String getColore() {
		return "rosso";
	}
}
