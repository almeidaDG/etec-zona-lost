import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListaDeCompras extends JFrame{
	JCheckBox arroz, feijao, carnes, legumes, molhos, ovo, manteiga, doces, 
		  	  tempero, pao, leite, suco, massa, salada, frios, frutas;
	JButton exibir;
	JLabel vazio, titulo;
	public ListaDeCompras(){
		super("Lista de Compras");
		Container tela = getContentPane();
		setLayout(null);
		
		exibir = new JButton("Exibir");
		titulo = new JLabel("Liste suas compras!");
		
		exibir.setBounds(0, 300, 384, 30);
		titulo.setBounds(130, 10, 200, 30);
		
		arroz = new JCheckBox("Arroz");
		arroz.setMnemonic(KeyEvent.VK_A);
		arroz.setBounds(30, 50, 100, 30);
		
		feijao = new JCheckBox("Feijão");
		feijao.setMnemonic(KeyEvent.VK_F);
		feijao.setBounds(30, 80, 100, 30);
		
		carnes = new JCheckBox("Carnes");
		carnes.setMnemonic(KeyEvent.VK_C);
		carnes.setBounds(30, 110, 100, 30);
		
		legumes = new JCheckBox("Legumes");
		legumes.setMnemonic(KeyEvent.VK_L);
		legumes.setBounds(30, 140, 100, 30);
		
		molhos = new JCheckBox("Molhos");
		molhos.setMnemonic(KeyEvent.VK_M);
		molhos.setBounds(30, 170, 100, 30);
		
		ovo = new JCheckBox("Ovos");
		ovo.setMnemonic(KeyEvent.VK_O);
		ovo.setBounds(30, 200, 100, 30);
		
		manteiga = new JCheckBox("Manteiga");
		manteiga.setMnemonic(KeyEvent.VK_M);
		manteiga.setBounds(30, 230, 100, 30);
		
		doces = new JCheckBox("Doces");
		doces.setMnemonic(KeyEvent.VK_D);
		doces.setBounds(30, 260, 100, 30);
		
		tempero = new JCheckBox("Temperos");
		tempero.setMnemonic(KeyEvent.VK_T);
		tempero.setBounds(260, 50, 100, 30);
		
		pao = new JCheckBox("Pães");
		pao.setMnemonic(KeyEvent.VK_P);
		pao.setBounds(260, 80, 100, 30);
		
		leite = new JCheckBox("Leite");
		leite.setMnemonic(KeyEvent.VK_L);
		leite.setBounds(260, 110, 100, 30);
		
		suco = new JCheckBox("Sucos");
		suco.setMnemonic(KeyEvent.VK_S);
		suco.setBounds(260, 140, 100, 30);
		
		massa = new JCheckBox("Massas");
		massa.setMnemonic(KeyEvent.VK_M);
		massa.setBounds(260, 170, 100, 30);
		
		salada = new JCheckBox("Salada");
		salada.setMnemonic(KeyEvent.VK_S);
		salada.setBounds(260, 200, 100, 30);
		
		frios = new JCheckBox("Frios");
		frios.setMnemonic(KeyEvent.VK_F);
		frios.setBounds(260, 230, 100, 30);
		
		frutas = new JCheckBox("Frutas");
		frutas.setMnemonic(KeyEvent.VK_F);
		frutas.setBounds(260, 260, 100, 30);
		
		vazio = new JLabel("");
		arroz.setSelected(false);
		vazio.setBounds(10, 350, 10000, 30 );
		
		exibir.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						String escolhas = "";
						if(arroz.isSelected() == true)
							escolhas = escolhas + arroz.getText();
						if(feijao.isSelected() == true)
							escolhas = escolhas + ", " + feijao.getText();
						if(carnes.isSelected() == true)
							escolhas = escolhas + ", " + carnes.getText();
						if(legumes.isSelected() == true)
							escolhas = escolhas + ", " + legumes.getText();
						if(molhos.isSelected() == true)
							escolhas = escolhas + ", " + molhos.getText();
						if(ovo.isSelected() == true)
							escolhas = escolhas + ", " + ovo.getText();
						if(manteiga.isSelected() == true)
							escolhas = escolhas + ", " + manteiga.getText();
						if(doces.isSelected() == true)
							escolhas = escolhas + ", " + doces.getText();
						if(tempero.isSelected() == true)
							escolhas = escolhas + ", " + tempero.getText();
						if(pao.isSelected() == true)
							escolhas = escolhas + ", " + pao.getText();
						if(leite.isSelected() == true)
							escolhas = escolhas + ", " + leite.getText();
						if(suco.isSelected() == true)
							escolhas = escolhas + ", " + suco.getText();
						if(massa.isSelected() == true)
							escolhas = escolhas + ", " + massa.getText();
						if(salada.isSelected() == true)
							escolhas = escolhas + ", " + salada.getText();
						if(frios.isSelected() == true)
							escolhas = escolhas + ", " + frios.getText();
						if(frutas.isSelected() == true)
							escolhas = escolhas + ", " + frutas.getText();
						vazio.setText("Você escolheu: " + escolhas);
					}
				});
		// tempero, pao, leite, suco, massa, salada, frios, frutas
		
		tela.add(exibir);
		tela.add(titulo);
		tela.add(arroz);
		tela.add(feijao);
		tela.add(carnes);
		tela.add(legumes);
		tela.add(molhos);
		tela.add(ovo);
		tela.add(manteiga);
		tela.add(doces);
		tela.add(tempero);
		tela.add(pao);
		tela.add(leite);
		tela.add(suco);
		tela.add(massa);
		tela.add(salada);
		tela.add(frios);
		tela.add(frutas);
		tela.add(vazio);
		
		setSize(400, 500);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		ListaDeCompras app = new ListaDeCompras();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
