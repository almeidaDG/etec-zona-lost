using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.OleDb;
using System.Data;
namespace PrjCliente_conexao
{
    public partial class frmConexao : Form
    {
        public frmConexao()
        {
            InitializeComponent();
        }  
            OleDbConnection conn = Conexao.obterConexao();
            OleDbDataReader dr_clientes;//leitura
            BindingSource bs_clientes = new BindingSource();//editavel
            String _query;

            private void carregar_grid()
            {
                _query = "Select * from clientes";
                OleDbCommand _dataCommand = new OleDbCommand(_query, conn);
                dr_clientes = _dataCommand.ExecuteReader();
                if (dr_clientes.HasRows == true)
                {
                    bs_clientes.DataSource = dr_clientes;
                    dgv_clientes.DataSource = bs_clientes;
                    igualar_text();
                }
                else
                {
                    MessageBox.Show("Não temos clientes cadastrados !!!!", "Atenção", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                }
            }

            private void igualar_text()
            {
                lblMatricula.DataBindings.Add("Text", bs_clientes, "Matricula");
                lblMatricula.DataBindings.Clear();
                txbNome.DataBindings.Add("Text", bs_clientes, "Nome");
                txbNome.DataBindings.Clear();
                txbEndereco.DataBindings.Add("Text", bs_clientes, "Endereco");
                txbEndereco.DataBindings.Clear();
                txbNumero.DataBindings.Add("Text", bs_clientes, "Numero");
                txbNumero.DataBindings.Clear();
                mskCep.DataBindings.Add("Text", bs_clientes, "Cep");
                mskCep.DataBindings.Clear();
                dtpNasc.DataBindings.Add("Text", bs_clientes, "Nasc");
                dtpNasc.DataBindings.Clear();
            }

        private void frmConexao_Load(object sender, EventArgs e)
        {
           
            this.bs_clientesTableAdapter.Fill(this.bD_ClienteDataSet.bs_clientes);
            carregar_grid();
        }

        private void dgv_clientes_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            igualar_text();
        }

        private void dgv_clientes_KeyUp(object sender, KeyEventArgs e)
        {
            igualar_text();
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {
            _query = "Select * from clientes";

            OleDbCommand _dataCommand = new OleDbCommand(_query, conn);

            dr_clientes = _dataCommand.ExecuteReader();

            if (dr_clientes.HasRows == true)
            {
                bs_clientes.DataSource = dr_clientes;
                dgv_clientes.DataSource = bs_clientes;
                igualar_text();

            }
            else
            {
                MessageBox.Show("Não temos clientes cadastrados !!!!", "Atenção", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }

        }

        }
    }

