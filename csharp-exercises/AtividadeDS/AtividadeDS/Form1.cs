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
    public partial class frmMenu : Form
    {
        public frmMenu()
        {
            InitializeComponent();
        }

        private void frmMenu_Load(object sender, EventArgs e)
        {

        }

        private void atividade1ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            frmAtividade1 att1 = new frmAtividade1();
            att1.MdiParent = this;
            att1.Show();
        }

        private void atividade2ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            frmAtividade2 att2 = new frmAtividade2();
            att2.MdiParent = this;
            att2.Show();
        }

        private void atividade3ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            frmAtividade3 att3 = new frmAtividade3();
            att3.MdiParent = this;
            att3.Show();
        }

        private void atividade4ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            frmAtividade4 att4 = new frmAtividade4();
            att4.MdiParent = this;
            att4.Show();
        }

        private void atividade5ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            frmAtividade5 att5 = new frmAtividade5();
            att5.MdiParent = this;
            att5.Show();
        }

        private void atividade6ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            frmAtividade6 att6 = new frmAtividade6();
            att6.MdiParent = this;
            att6.Show();
        }

        private void atividade7ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            frmAtividade7 att7 = new frmAtividade7();
            att7.MdiParent = this;
            att7.Show();
        }
    }
}
