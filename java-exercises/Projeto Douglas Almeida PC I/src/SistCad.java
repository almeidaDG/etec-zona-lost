import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Calendar;
public class SistCad extends JFrame {
	JMenuBar barra;
	JMenu opcoes, fonte, cor, estilo, tamanho;
	JMenuItem azul, verde, vermelho, amarelo, preto, sair;
	JCheckBoxMenuItem nomeE[];
	ButtonGroup grupoT, grupoE;
	JRadioButtonMenuItem tamanhoF[];
	String tam[] = {"12" , "14" , "16", "18"};
	String est[] = {"Normal" , "Negrito" , "Itálico" , "Negrito e Itálico"};
	int estilofonte, tamfonte;
	ImageIcon iconeCli, iconeFor, iconeUsu, iconePro;
	JLabel label , rotulo1, rotulo2, lblHora;
	JButton botaoCliente, botaoFornecedor, botaoUsuario, botaoProduto;
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
		barra = new JMenuBar();
		setJMenuBar(barra);
		opcoes = new JMenu("Opções");
		barra.add(opcoes);
		
		estilo = new JMenu("Estilo");
		grupoE = new ButtonGroup();
		nomeE = new JCheckBoxMenuItem[4];
		
		
		tamanho = new JMenu("Tamanho");
		grupoT = new ButtonGroup();
		tamanhoF = new JRadioButtonMenuItem[4];

		sair = new JMenuItem("Sair");
		opcoes.setMnemonic(KeyEvent.VK_O);
		
		opcoes.add(sair);
		
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ee) {
				int resposta = 0;
				resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?",
						"Mensagem do Programa", JOptionPane.YES_NO_OPTION); resposta++;
				if(resposta == 1)
					System.exit(0);
			}
		});
		
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
		rotulo2.setText("Hoje é: " +diasemana[ds-1] +", " +dia+" de " +meses[mes]+" de " +ano);
		
		botaoCliente = new JButton ("Cadastrar Cliente", iconeCli);
		botaoFornecedor = new JButton ("Cadastrar Fornecedor", iconeFor);
		botaoUsuario = new JButton ("Cadastrar Usuário", iconeUsu);
		botaoProduto = new JButton ("Cadastrar Produto", iconePro);

		
		lblHora.setBounds(161, 220, 200, 20);
		label.setBounds(120, 10, 300, 20);
		rotulo1.setBounds(160, 180, 280, 20);
		rotulo2.setBounds(100, 200, 280, 20);
		botaoCliente.setBounds(60, 40, 300, 30);
		botaoFornecedor.setBounds(60, 75, 300, 30);
		botaoUsuario.setBounds(60, 110, 300, 30);
		botaoProduto.setBounds(60, 145, 300, 30);
		
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
		
		

		
		tela.add(label);
		tela.add(botaoCliente);
		tela.add(botaoFornecedor);
		tela.add(botaoUsuario);
		tela.add(botaoUsuario);
		tela.add(botaoProduto);
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(lblHora);
		setSize(450, 300);
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
