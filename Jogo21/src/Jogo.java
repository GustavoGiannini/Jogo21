import javax.swing.JOptionPane;

public class Jogo {

	public static void main(String[] args) {

		Baralho bar = new Baralho();
		bar.embaralha();
		
		JogadorHumano gut = new JogadorHumano();
		JogadorCpu cpu = new JogadorCpu(bar.compra(), bar.compra());
		
		gut.addCarta(bar.compra());
		gut.addCarta(bar.compra());
		
		
		
		while(gut.querCarta()) {
			gut.addCarta(bar.compra());
		}
		
		while(cpu.querCarta()) {
			cpu.addCarta(bar.compra());
		}
		
		if(gut.getPontos() <= 21 && cpu.getPontos() <= 21) {
			if(cpu.getPontos() >= gut.getPontos()) {
				JOptionPane.showMessageDialog(null, cpu + "\nCpu ganhou");
			} else {
				JOptionPane.showMessageDialog(null, cpu + "\nEu ganhei");
			}
		} else if(gut.getPontos() <= 21 && cpu.getPontos() > 21) {
			JOptionPane.showMessageDialog(null, cpu + "\nEu ganhei");
		} else if(gut.getPontos() > 21 && cpu.getPontos() <= 21) {
			JOptionPane.showMessageDialog(null, cpu + "\nCpu ganhou");
		} else {
			JOptionPane.showMessageDialog(null, cpu + "\nNinguem ganhou");
		}
	}

}
