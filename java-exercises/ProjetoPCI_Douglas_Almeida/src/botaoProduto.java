import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane.*;  
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.text.ParseException;

public class botaoProduto extends JFrame{
	ImageIcon iconeCad, iconeVol;
	JLabel codigo, quantidade, descricao, categoria, fornecedor, valor, promocao, label, codBarra, data;
	JTextField cmpCod, cmpQuant, cmpDes, cmpFor, cmpVal, cmpBarra;
	String lista[] = {"VESTUÁRIO", "UTENSÍLIOS", "LIMPEZA", "ALIMENTÍCIOS", "COSMÉTICOS", "HIGIENE"};
	JComboBox listaCategoria;
	JRadioButton sim, nao;
	JButton cadastrar, voltar, carregarImg;
	public botaoProduto(){
		super("Cadastro de Produtos");
		Container tela = getContentPane();
		setLayout(null);
		iconeCad = new ImageIcon("cadastrar.png"); 
		iconeVol = new ImageIcon("voltar.png");
		//label
		
		codigo = new JLabel("Código do Produto:");
		quantidade = new JLabel("Quantidade:");
		descricao = new JLabel("Descrição:");
		categoria = new JLabel("Categoria:");
		fornecedor = new JLabel("Fornecedor:");
		valor = new JLabel("Valor Total:");
		promocao = new JLabel("Promoção?");
		codBarra = new JLabel("Cód. Barras:");
		data = new JLabel("Data do cadastro:"); // criar um campo com mascara para data
		//lista e button
		
		listaCategoria = new JComboBox(lista);
		listaCategoria.setMaximumRowCount(7);
		sim = new JRadioButton("Sim");
		nao = new JRadioButton("Não");
		//textfield
		
		cmpCod = new JTextField(50);
		cmpQuant = new JTextField(30);
		cmpDes = new JTextField(100);
		cmpFor = new JTextField(50);
		cmpVal = new JTextField(50);
		cmpBarra = new JTextField(100);
		//button
		
		cadastrar = new JButton("Cadastrar", iconeCad);
		voltar = new JButton("Voltar", iconeVol);
		carregarImg = new JButton("Selecionar Imagem");
		//dimensoes
		
		codigo.setBounds(20, 30, 150, 20);
		cmpCod.setBounds(130, 32, 50, 18);
		descricao.setBounds(20, 55, 150, 20);
		cmpDes.setBounds(90, 57, 300, 18);
		categoria.setBounds(20, 80, 100, 20);
		listaCategoria.setBounds(90, 83, 100, 18);
		quantidade.setBounds(20, 105, 100, 20);
		cmpQuant.setBounds(90, 107, 50, 18);
		fornecedor.setBounds(20, 125, 100, 20);
		cmpFor.setBounds(90, 127 ,300, 18);
		promocao.setBounds(20, 170, 100, 20);
		sim.setBounds(100, 170, 50, 20);
		nao.setBounds(150, 170, 50, 20);
		valor.setBounds(20, 190, 100, 20);
		cmpVal.setBounds(90, 192, 70, 18);
		cadastrar.setBounds(20, 230, 130, 25);
		voltar.setBounds(160, 230, 130, 25);
		carregarImg.setBounds(420, 55, 200, 20);
		codBarra.setBounds(420, 80, 150, 20);
		cmpBarra.setBounds(500, 80, 120, 20);
		//lista
		listaCategoria.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				if(listaCategoria.getSelectedItem().toString() == "VESTUÁRIO");
				if(listaCategoria.getSelectedItem().toString() == "UTENSÍLIOS");
				if(listaCategoria.getSelectedItem().toString() == "LIMPEZA");
				if(listaCategoria.getSelectedItem().toString() == "ALIMENTÍCIOS");
				if(listaCategoria.getSelectedItem().toString() == "COSMÉTICOS");
				if(listaCategoria.getSelectedItem().toString() == "HIGIENE");
			}
		}
				);
		//cadastrar
		
		cadastrar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						 
						 JFrame cadastrado = new JFrame("JOptionPane exemplo");
						 
						 JOptionPane.showMessageDialog(cadastrado,
							        "Produto cadastro com sucesso!",
							        "Cadastro concluído",
							      //\nCódigo do Produto: " + cmpCod.getText()
							        JOptionPane.INFORMATION_MESSAGE);
						 
						    cmpCod.setText(null);
							cmpQuant.setText(null);
							cmpDes.setText(null);
							cmpFor.setText(null);
							cmpVal.setText(null);
							cmpBarra.setText(null);
						 //cmpCod, cmpQuant, cmpDes, cmpFor, cmpVal, cmpBarra;
									
					}
				}
				);
		
		voltar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						SistCad app = new SistCad();
						app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setVisible(false);
						app.setVisible(true);
					}
				}
				);
		
		
	    
		carregarImg.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						
						JFileChooser jfc = new JFileChooser();
		                jfc.setFileFilter(new FileNameExtensionFilter("Imagem", "jpg", "jpeg", "gif"));
		                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		                jfc.showDialog(jfc, "Selecione");
		                JOptionPane.showMessageDialog(null, jfc.getSelectedFile());
					}
					
				});
		
	    //chooser.setBounds(500, 120, 100, 20);
		//configuracao tela
		
		tela.add(codigo);
		tela.add(cmpCod);
		tela.add(quantidade);
		tela.add(cmpQuant);
		tela.add(descricao);
		tela.add(cmpDes);
		tela.add(categoria);
		tela.add(fornecedor);
		tela.add(cmpFor);
		tela.add(valor);
		tela.add(promocao);
		tela.add(sim);
		tela.add(nao);
		tela.add(listaCategoria);
		tela.add(cmpVal);
		tela.add(carregarImg);
		tela.add(codBarra);
		tela.add(cadastrar);
		tela.add(voltar);
		tela.add(cmpBarra);
		setSize(650, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
}