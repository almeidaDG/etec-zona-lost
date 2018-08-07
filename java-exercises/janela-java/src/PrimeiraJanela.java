import javax.swing.*;
import java.awt.*;
public class PrimeiraJanela extends JFrame{
	public PrimeiraJanela(){
		super("MINHA PRIMEIRA JANELA");
		setSize(500,300);
		setVisible(true);
		Container tela = getContentPane();
		tela.setBackground(Color.LIGHT_GRAY);
		//setExtendedState(MAXIMIZED_BOTH);
		//setExtendedState(ICONIFIED);
		//setResizable(false);
		setLocationRelativeTo(null);
	}
}


