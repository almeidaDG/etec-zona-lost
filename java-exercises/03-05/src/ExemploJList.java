import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploJList extends JFrame{
	JList lista;
	String cidades[] = {"São Paulo" , "Rio de Janeiro" , "Minas Gerais" , "Amazonas" , "Rio Grande do Sul" , "Acre",
			"Bahia"};
	JButton exibir;
	JLabel rotulo;
	public ExemploJList(){
		super("Exemplo JList");
		Container tela = getContentPane();
		setLayout(null);
		exibir = new JButton("Exibir");
		//rotulo = new JLabel("");
		lista = new JList(cidades);
		lista.setVisibleRowCount(5);
		JScrollPane painelRolagem = new JScrollPane(lista);
		lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		painelRolagem.setBounds(40, 50, 150, 100);
		//rotulo.setBounds(50, 150, 200, 30);
		exibir.setBounds(270, 50, 100, 30);
		exibir.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						Object selecionados[] = lista.getSelectedValues();
						String resultados = "Valores selecionados: \n";
						for(int i=0; i<selecionados.length; i++)
							resultados += selecionados[i].toString() + "\n";
						JOptionPane.showInputDialog(null,resultados);
					}
				});
		
		tela.add(painelRolagem);
		tela.add(exibir);
		//tela.add(rotulo);
		
		setSize(400, 250);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		ExemploJList app = new ExemploJList();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
