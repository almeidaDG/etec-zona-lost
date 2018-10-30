using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data;
using System.Data.SqlClient;

namespace ProgramaModoOffline
{
    public partial class Form1 : Form
    {
        private List<ClasseFuncionario> listaFuncionarioMemoria = new List<ClasseFuncionario>();
        public Form1()
        {
            InitializeComponent();
        }

        private void btnSalvar_Click(object sender, EventArgs e)
        {
            ClasseFuncionario funcionario = new ClasseFuncionario();
            funcionario.nmFuncionario = txbFuncionario.Text;
            funcionario.cargo = txbCargo.Text;
            funcionario.salario = Convert.ToDecimal(txbSalario.Text);
            funcionario.dataEntrada = Convert.ToDateTime(txbData.Text);

            listaFuncionarioMemoria.Add(funcionario);

            dgvBanco.DataSource = null;
            dgvBanco.DataSource = listaFuncionarioMemoria;
            txbFuncionario.Text = "";
            txbCargo.Text = "";
            txbSalario.Text = "";
            txbData.Text = "";
        }

        private void btnEnviar_Click(object sender, EventArgs e)
        {
            foreach (ClasseFuncionario item in listaFuncionarioMemoria)
            {
                SqlConnection conexao = new SqlConnection();
                conexao.ConnectionString = Program.conexaoBD;
                conexao.Open();

                string comandoSQL = "INSERT INTO tbFuncionario values ('" + item.nmFuncionario + "','" + item.cargo + "','" + item.salario + "','" + item.dataEntrada + "')";

                SqlCommand sqlCommand = new SqlCommand(comandoSQL, conexao);

                sqlCommand.ExecuteNonQuery();

                conexao.Close();

                listaFuncionarioMemoria = new List<ClasseFuncionario>();

                dgvBanco.DataSource = null;
            }

            MessageBox.Show("Sucesso!");
        }
    }
}
