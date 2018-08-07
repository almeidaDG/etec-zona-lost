import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.Timer;
public class SistCad extends JFrame {
	ImageIcon iconeCli, iconeFor, iconeUsu, iconePro;
	JLabel label , rotulo1, rotulo2, lblHora;
	JButton botaoCliente, botaoFornecedor, botaoUsuario, botaoProduto, botaoSair;
	int ds, dia, mes, ano, hh, mm, ss, h;
	Calendar data, hora;
	DecimalFormat formato;
	String diasemana[]= {
			"Domingo" , "Segunda-Feira" , "Terça-Feira" , "Quarta-Feira" , "Quinta-Feira" , "Sexta-Feira" , "Sábado"
	};
	String meses[]= {
		"Janeiro" , "Fevereiro" , "Março" , "Abril" , "Maio" , "Junho" , "Julho" , "Agosto" , "Setembro" , "Outubro" , "Novembro" , "Dezembro"	
	};
	public SistCad(){
		super("Sistema de Cadastro");
		Container tela = getContentPane();
		setLayout(null);

		iconeCli = new ImageIcon("cliente.png");
		iconeFor = new ImageIcon("fornecedor.png");
		iconeUsu = new ImageIcon("usuario.png");
		iconePro = new ImageIcon("produto.png");
		
		rotulo1 = new JLabel("");
		rotulo2 = new JLabel("");
		label = new JLabel ("Sistema de Cadastro");
		label.setFont(new Font("Arial", Font.BOLD, 20));
		lblHora = new JLabel("");
		
		
		data = Calendar.getInstance();
		ds = data.get(Calendar.DAY_OF_WEEK);
		dia = data.get(Calendar.DAY_OF_MONTH);
		mes = data.get(Calendar.MONTH);
		ano = data.get(Calendar.YEAR);
		
		rotulo1.setText("Data: " +dia+"/"+(mes+1)+"/"+ano);
		rotulo2.setText("Data: " +diasemana[ds-1] +", " +dia+" de " +meses[mes]+" de " +ano);
		
		botaoCliente = new JButton ("Cadastrar Cliente", iconeCli);
		botaoFornecedor = new JButton ("Cadastrar Fornecedor", iconeFor);
		botaoUsuario = new JButton ("Cadastrar Usuário", iconeUsu);
		botaoProduto = new JButton ("Cadastrar Produto", iconePro);
		botaoSair = new JButton ("Sair");
		
		lblHora.setBounds(20, 220, 200, 20);
		label.setBounds(120, 10, 300, 20);
		rotulo1.setBounds(20, 180, 280, 20);
		rotulo2.setBounds(20, 200, 280, 20);
		botaoCliente.setBounds(60, 40, 300, 30);
		botaoFornecedor.setBounds(60, 75, 300, 30);
		botaoUsuario.setBounds(60, 110, 300, 30);
		botaoProduto.setBounds(60, 145, 300, 30);
		botaoSair.setBounds(310, 210, 50, 25);
		botaoSair.setMargin(new Insets(1,1,1,1));
		
		ActionListener tarefa = (new ActionListener(){
			public void actionPerformed(ActionEvent ev) {
				HORAS();
			}
		});
		javax.swing.Timer time = new javax.swing.Timer(1000, tarefa);
		time.start();
		botaoCliente.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						botaoCliente app2 = new botaoCliente();
						app2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setVisible(false);
						//app2.setVisible(true);
					}
				}
				);
		
		botaoFornecedor.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ex) {
						botaoFornecedor app3 = new botaoFornecedor();
						app3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setVisible(false);
					}
				}
				);
		
		botaoUsuario.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ea) {
						botaoUsuario app4 = new botaoUsuario();
						app4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setVisible(false);
					}
				}
				);
		
		botaoProduto.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent eu) {
						botaoProduto app5 = new botaoProduto();
						//app5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setVisible(false);
					}
				}
				);
		
		botaoSair.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ed) {
						System.exit(0);
					}
				}
				);
		

		
		tela.add(label);
		tela.add(botaoCliente);
		tela.add(botaoFornecedor);
		tela.add(botaoUsuario);
		tela.add(botaoUsuario);
		tela.add(botaoProduto);
		tela.add(botaoSair);
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(lblHora);
		setSize(450, 280);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);

	}


	public static void main(String[] args) {
		SistCad app = new SistCad();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void HORAS() {
		hora = Calendar.getInstance();
		hh = hora.get(Calendar.HOUR_OF_DAY);
		mm = hora.get(Calendar.MINUTE);
		ss = hora.get(Calendar.SECOND);
		formato = new DecimalFormat("00");
		lblHora.setText("Hora: " + formatar(hh%12) + ":" +formatar(mm)+":"+formatar(ss));
	}
	
	private String formatar(int num) {
		formato = new DecimalFormat("00");
		return formato.format(num);
	}
}
