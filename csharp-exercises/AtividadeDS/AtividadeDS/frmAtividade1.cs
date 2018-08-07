using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace AtividadeDS
{
    public partial class frmAtividade1 : Form
    {
        public frmAtividade1()
        {
            InitializeComponent();
        }

        private void frmAtividade1_Load(object sender, EventArgs e)
        {
           
            }

        private void button1_Click(object sender, EventArgs e)
        {
            double valor1 = System.Convert.ToDouble(textBox1.Text);
            double valor2 = System.Convert.ToDouble(textBox2.Text);

            double resultado1 = valor1 + valor2;

            lblResultado.Text = "Resultado:" + resultado1;

            if (resultado1 > 20)
            {
                double resultado2 = resultado1 + 8;
                lblResultado2.Text = "Resultado adicionando mais 8:  " + resultado2;
            }

            else
            {
                double resultado2 = resultado1 - 5;
                lblResultado2.Text = "Resultado subtraindo por 5:   " + resultado2;
        }
        }

        private void frmAtividade1_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (MessageBox.Show("Deseja sair?", "Titulo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes) MessageBox.Show("Saindo :(");
            else
            {
                MessageBox.Show("Ficando :)");
                e.Cancel = true;
            }
        }
    }
}
