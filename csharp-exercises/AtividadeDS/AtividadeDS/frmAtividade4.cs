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
    public partial class frmAtividade4 : Form
    {
        public frmAtividade4()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int valor = int.Parse(textBox1.Text);

            if (valor == 1)
            {
                lblResultado.Text = "Janeiro";
            }

            else if (valor == 2)
            {
                lblResultado.Text = "Fevereiro";
            }

            else if (valor == 3)
            {
                lblResultado.Text = "Março";
            }

            else if (valor == 4)
            {
                lblResultado.Text = "Abril";
            }

            else if (valor == 5)
            {
                lblResultado.Text = "Maio";
            }

            else if (valor == 6)
            {
                lblResultado.Text = "Junho";
            }

            else if (valor == 7)
            {
                lblResultado.Text = "Julho";
            }

            else if (valor == 8)
            {
                lblResultado.Text = "Agosto";
            }

            else if (valor == 9)
            {
                lblResultado.Text = "Setembro";
            }

            else if (valor == 10)
            {
                lblResultado.Text = "Outubro";
            }

            else if (valor == 11)
            {
                lblResultado.Text = "Novembro";
            }

            else if (valor == 12)
            {
                lblResultado.Text = "Dezembro";
            }

            else
            {
                lblResultado.Text = "Porfavor, digite um número de 1 a 12";
            }
        }

        private void frmAtividade4_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (MessageBox.Show("Deseja sair?", "Titulo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes) MessageBox.Show("Saindo :(");
            else
            {
                MessageBox.Show("Ficando :)");
                e.Cancel = true;
            }
        }

        private void frmAtividade4_Load(object sender, EventArgs e)
        {

        }
    }
}
