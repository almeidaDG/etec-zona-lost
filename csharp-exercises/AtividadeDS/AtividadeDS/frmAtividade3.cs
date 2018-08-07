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
    public partial class frmAtividade3 : Form
    {
        public frmAtividade3()
        {
            InitializeComponent();
        }

        private void frmAtividade3_Load(object sender, EventArgs e)
        {

        }

        private void frmAtividade3_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (MessageBox.Show("Deseja sair?", "Titulo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes) MessageBox.Show("Saindo :(");
            else
            {
                MessageBox.Show("Ficando :)");
                e.Cancel = true;
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            double valor1 = System.Convert.ToDouble(textBox1.Text);
            double valor2 = System.Convert.ToDouble(textBox2.Text);
            double valor3 = System.Convert.ToDouble(textBox3.Text);

            if (valor1 == valor2 && valor2 == valor3)
            {
                lblResultado.Text = "Triângulo Equilátero";
            }

            else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3)
            {
                lblResultado.Text = "Triângulo Isósceles";
            }

            else
            {
                lblResultado.Text = "Triângulo Escaleno";
            }
        }
    }
}
