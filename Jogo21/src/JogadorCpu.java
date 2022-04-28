public class JogadorCpu {

	private Carta[] mao;
	private int pontos;
	private int topo;
	
	public JogadorCpu() {
		this.mao = new Carta[10];
	}
	
	public JogadorCpu(Carta a, Carta b) {
		this(); //Chamando o construtor padrão
		this.mao[0] = a;
		this.mao[1] = b;
		this.pontos = getPontosCarta(a);
		this.pontos = this.pontos + getPontosCarta(b);
		this.topo = 2;
	}
	
	public void addCarta(Carta c) {
		mao[topo] = c;
		pontos = pontos + getPontosCarta(c);
		topo++;
	}
	
	private int getPontosCarta(Carta c) {
		if(c.getNumero() < 10){
			return 10;
		} else {
			return c.getNumero();
		}
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public String toString() {
		int i = 0;
		String aux = "";
		while(i < topo) {
			aux = aux + mao[i].toString() + " ";
			i++;
		}
		return aux;
	}
	
	public boolean querCarta() {
		if(pontos <= 16) {
			return true;
		} else {
			return false;
		}
	}
}
