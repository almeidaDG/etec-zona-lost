using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace PrjCliente_conexao
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void cadastroToolStripMenuItem_Click(object sender, EventArgs e)
        {
            frm_Cadastro cad = new frm_Cadastro();
            cad.MdiParent = this;
            cad.Show();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
