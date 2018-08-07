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
    public partial class frmAtividade2 : Form
    {
        public frmAtividade2()
        {
            InitializeComponent();
        }

        private void frmAtividade2_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            double valor = System.Convert.ToDouble(textBox1.Text);

            if (valor % 10 == 0)
            {
                lblResultado.Text = "O número é divisível por 10.";
            }

            else if (valor % 5 == 0)
            {
                lblResultado.Text = "O número é divisível por 5.";
            }

            else if (valor % 2 == 0)
            {
                lblResultado.Text = "O número é divisível por 2.";
            }

            else
            {
                lblResultado.Text = "O número não é divisível por 10, 5 e 2";
            }
        }

        private void frmAtividade2_FormClosing(object sender, FormClosingEventArgs e)
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