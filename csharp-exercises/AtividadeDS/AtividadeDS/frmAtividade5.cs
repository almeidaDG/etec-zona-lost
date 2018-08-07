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
    public partial class frmAtividade5 : Form
    {
        public frmAtividade5()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int valor = int.Parse(textBox1.Text);
            int count = 1;
            while (count <= valor)
            {
                textBox2.Text = textBox2.Text + count + ", ";
                count++;
            }

            if (valor > 50)
            {
                label2.Text = "Porfavor, digite apenas número de 1 a 50.";
                textBox2.Clear();
                valor = 0;
            }
        }

        private void frmAtividade5_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (MessageBox.Show("Deseja sair?", "Titulo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes) MessageBox.Show("Saindo :(");
            else
            {
                MessageBox.Show("Ficando :)");
                e.Cancel = true;
            }
        }

        private void frmAtividade5_Load(object sender, EventArgs e)
        {

        }
    }
}
