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
    public partial class frmAtividade6 : Form
    {
        public frmAtividade6()
        {
            InitializeComponent();
        }

        private void frmAtividade6_Load(object sender, EventArgs e)
        {
      
        }

        private void frmAtividade6_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (MessageBox.Show("Deseja sair?", "Titulo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes) MessageBox.Show("Saindo :(");
            else
            {
                MessageBox.Show("Ficando :)");
                e.Cancel = true;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int valor = int.Parse(textBox1.Text);
            int count = 1;
            while (count <= valor)
            {
                textBox2.Text = textBox2.Text + "Brasil! ";
                count++;
            }

           
        }
    }
}
