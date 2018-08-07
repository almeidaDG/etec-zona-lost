import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class botaoFornecedor extends JFrame{
	ImageIcon iconeCad, iconeVol;
	JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16;
	JTextField campo1, campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo9, campo10, campo11, campo12, campo13, campo14, campo15;
	JButton cadastrar, voltar, pequeno;
	MaskFormatter mascaracpf, mascaracep, mascarafone, mascarafax, mascaranit;
	
	public botaoFornecedor(){
		super("Cadastro de Fornecedor");
		Container tela = getContentPane();
		setLayout(null);
		iconeCad = new ImageIcon("cadastrar.png"); 
		iconeVol = new ImageIcon("voltar.png");
		label1 = new JLabel("Tipo do Fornecedor: *");
		label2 = new JLabel("Razão Social: *");
		label3 = new JLabel("Nome Fantasia:");
		label4 = new JLabel("CPF/ CNPJ: *");
		label5 = new JLabel("Representante:");
		label6 = new JLabel("Endereço: *");
		label7 = new JLabel("Bairro: *");
		label8 = new JLabel("Cidade: *");
		label9 = new JLabel("CEP:");
		label10 = new JLabel("Email:");
		label11 = new JLabel("Fone:");
		label12 = new JLabel("Fax:");
		label13 = new JLabel("NIT ou PIS/PASEP:");
		label14 = new JLabel("Emite Fatura?:");
		label15 = new JLabel("Alíquota de Imposto:                %");
		label16 = new JLabel("Internacional");
		
		campo1 = new JTextField();
		campo2 = new JTextField();
		campo3 = new JTextField();
		campo5 = new JTextField();
		campo6 = new JTextField();
		campo7 = new JTextField();
		campo8 = new JTextField();
		campo10 = new JTextField();
		campo14 = new JTextField();
		campo15 = new JTextField("0.00");
		pequeno = new JButton();
		
		cadastrar = new JButton("Cadastrar", iconeCad);
		voltar = new JButton("Voltar", iconeVol);
		
		
		//
		
		label1.setBounds(30, 10, 150, 20);
		label2.setBounds(30, 30, 150, 20);
		label3.setBounds(30, 50, 150, 20);
		label4.setBounds(30, 70, 150, 20);
		label5.setBounds(30, 90, 150, 20);
		
		label6.setBounds(30, 110, 150, 20);
		label7.setBounds(30, 130, 150, 20);
		label8.setBounds(30, 150, 150, 20);
		label9.setBounds(30, 170, 150, 20);
		label10.setBounds(30, 190, 150, 20);
		
		label11.setBounds(30, 210, 150, 20);
		label12.setBounds(30, 230, 150, 20);
		label13.setBounds(30, 250, 150, 20);
		label14.setBounds(30, 270, 150, 20);
		label15.setBounds(300, 270, 200, 20);
		
		label16.setBounds(350, 130 , 150 , 20);
		
		try{
			mascaracpf = new MaskFormatter("#########-##");
			mascaracep = new MaskFormatter("#####-###");
			mascarafone = new MaskFormatter("(##)####-####");
			mascarafax = new MaskFormatter("(##)####-####");
			mascaranit = new MaskFormatter("###.#####.##-#");
			mascaracpf.setPlaceholderCharacter('_');
			mascaracep.setPlaceholderCharacter('_');
			mascarafone.setPlaceholderCharacter('_');
			mascarafax.setPlaceholderCharacter('_');
			mascaranit.setPlaceholderCharacter('X');
		}
		catch(ParseException excp){}
	
		campo4 = new JFormattedTextField(mascaracpf);
		campo9 = new JFormattedTextField(mascaracep);
		campo11 = new JFormattedTextField(mascarafone);
		campo12 = new JFormattedTextField(mascarafax);
		campo13 = new JFormattedTextField(mascaranit);
		
		//
		
		campo1.setBounds(155, 10, 300, 20);
		campo2.setBounds(155, 30, 400, 20);
		campo3.setBounds(155, 50, 400, 20);
		campo4.setBounds(155, 70, 100, 20);
		campo5.setBounds(155, 90, 400, 20);
		
		campo6.setBounds(155, 110, 400, 20);
		campo7.setBounds(155, 130, 150, 20);
		campo8.setBounds(155, 150, 150, 20);
		campo9.setBounds(155, 170, 100, 20);
		campo10.setBounds(155, 190, 150, 20);
		
		campo11.setBounds(155, 210, 100, 20);
		campo12.setBounds(155, 230, 100, 20);
		campo13.setBounds(155, 250, 100, 20);
		campo14.setBounds(155, 270, 50, 20);
		campo15.setBounds(430, 270, 30, 20);
		campo15.setBackground(Color.gray);
		
		pequeno.setBounds(330, 133, 15, 15);
		
		
		cadastrar.setBounds(180, 300, 130, 25);
		voltar.setBounds(330, 300, 130, 25);
		
		cadastrar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						 
						 JFrame cadastrado = new JFrame("JOptionPane exemplo");
						 
						 JOptionPane.showMessageDialog(cadastrado,
							        "Fornecedor cadastrado com sucesso!",
							        "Cadastro concluído",
							        JOptionPane.INFORMATION_MESSAGE);
						 
						 			campo1.setText(null);
									campo2.setText(null);
									campo3.setText(null);
									campo4.setText(null);
									campo5.setText(null);
									campo6.setText(null);
									campo7.setText(null);
									campo8.setText(null);
									campo9.setText(null);
									campo10.setText(null);
									campo11.setText(null);
									campo12.setText(null);
									campo13.setText(null);
									campo14.setText(null);
									campo15.setText(null);
									
					}
				}
				);
		
		voltar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						SistCad app = new SistCad();
						app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setVisible(false);
						app.setVisible(true);
					}
				}
				);
		
		
		//configuracao tela
		
		tela.add(label1);
		tela.add(label2);
		tela.add(label3);
		tela.add(label4);
		tela.add(label5);
		tela.add(label6);
		tela.add(label7);
		tela.add(label8);
		tela.add(label9);
		tela.add(label10);
		tela.add(label11);
		tela.add(label12);
		tela.add(label13);
		tela.add(label14);
		tela.add(label15);
		tela.add(label16);
		
		tela.add(campo1);
		tela.add(campo2);
		tela.add(campo3);
		tela.add(campo4);
		tela.add(campo5);
		
		tela.add(campo6);
		tela.add(campo7);
		tela.add(campo8);
		tela.add(campo9);
		tela.add(campo10);
		
		tela.add(campo11);
		tela.add(campo12);
		tela.add(campo13);
		tela.add(campo14);
		tela.add(campo15);
		
		tela.add(pequeno);
		tela.add(cadastrar);
		tela.add(voltar);
		setSize(650, 360);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
}