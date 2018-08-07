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
    public partial class frmAtividade7 : Form
    {
        public frmAtividade7()
        {
            InitializeComponent();
        }

        private void frmAtividade7_Load(object sender, EventArgs e)
        {

        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            double altArlindo = System.Convert.ToDouble(txbAltPe1.Text);
            double altManoel = System.Convert.ToDouble(txbAltPe2.Text);
            double cmPessoa1 = System.Convert.ToDouble(txbCmPe1.Text);
            double cmPessoa2 = System.Convert.ToDouble(txbCmPe2.Text);
            int ano = 0;

            while(altArlindo >= altManoel){
                altArlindo = altArlindo + cmPessoa1;
                altManoel = altManoel + cmPessoa2;
                ano = ano + 1;
            }

            lblResult.Text = "Em " + ano + " anos, Manoel será maior que Arlindo."; 
            
        }

        private void frmAtividade7_FormClosing(object sender, FormClosingEventArgs e)
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
