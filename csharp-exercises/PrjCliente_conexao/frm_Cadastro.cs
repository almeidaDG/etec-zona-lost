using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.OleDb;


namespace PrjCliente_conexao
{
    public partial class frm_Cadastro : Form
    {
        OleDbConnection conn = Conexao.obterConexao();
        OleDbDataReader dr_clientes;
        BindingSource bs_clientes = new BindingSource();
        String _query;
                                            
        public frm_Cadastro()
        {
            InitializeComponent();
        }
        private void carregar_grid()
        {
            _query = "SELECT * FROM clientes";
            OleDbCommand _dataCommand = new OleDbCommand(_query,conn);
            dr_clientes = _dataCommand.ExecuteReader();
            if (dr_clientes.HasRows == true)
            {
                bs_clientes.DataSource = dr_clientes;
                dgv_clientes.DataSource = bs_clientes;
                igualar_Text();
            }
            else
            {
                MessageBox.Show("Não temos Clientes cadastrados !!!", "Atenção", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }
        private void igualar_Text()
        {
            lbl_Matricula.DataBindings.Add("Text", bs_clientes, "Matricula");
            lbl_Matricula.DataBindings.Clear();

            txt_Nome.DataBindings.Add("Text", bs_clientes, "Nome");
            txt_Nome.DataBindings.Clear();
            txt_End.DataBindings.Add("Text", bs_clientes, "Endereco");
            txt_End.DataBindings.Clear();
            txt_Numero.DataBindings.Add("Text", bs_clientes, "numero");
            txt_Numero.DataBindings.Clear();
            msk_cep.DataBindings.Add("Text",bs_clientes,"cep");
            msk_cep.DataBindings.Clear();
            dtp_nasc.DataBindings.Add("Text", bs_clientes,"Nasc");
            dtp_nasc.DataBindings.Clear();
        }
        private void frm_Cadastro_Load(object sender, EventArgs e)
        {
            carregar_grid();
        }

        private void dgv_clientes_Click(object sender, EventArgs e)
        {
            igualar_Text();
        }

        private void dgv_clientes_KeyUp(object sender, KeyEventArgs e)
        {
            igualar_Text();
        }

        private void txt_Pesquisar_TextChanged(object sender, EventArgs e)
        {
          
            

            _query = "Select * from Clientes where nome like '" + txt_Pesquisar.Text + "%'";
            OleDbCommand _dataCommand = new OleDbCommand(_query, conn);
            dr_clientes = _dataCommand.ExecuteReader();

            if (dr_clientes.HasRows == true)
            {
                bs_clientes.DataSource = dr_clientes;
            }

            else
            {
                MessageBox.Show("Não temos cliente cadastrado com este nome!!!!", "Atenção", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                txt_Pesquisar.Text = "";
            }

        }
    
    }
}
