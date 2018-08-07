using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Media
{
    public partial class frmMedia : Form
    {
        public frmMedia()
        {
            InitializeComponent();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {

            double nota1 = System.Convert.ToDouble(txb1Bim.Text);
            double nota2 = System.Convert.ToDouble(txb2Bim.Text);
            double nota3 = System.Convert.ToDouble(txb3Bim.Text);
            double nota4 = System.Convert.ToDouble(txb4Bim.Text);

            double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

            lblNome.Text = "Nome do Aluno: " + txbNome.Text;

            if(resultado >= 7){
                lblMedia.Text = "Aprovado";
            }

            else{
                lblMedia.Text = "Reprovado";
            }


        }

        
    }
}
