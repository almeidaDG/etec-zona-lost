using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data.OleDb;
using System.Data;
using System.Windows.Forms;
namespace PrjCliente_conexao
{
    class Conexao
    {
        // objeto com string de conexão do access
        public static string connString = @"Provider=Microsoft.ACE.OLEDB.12.0;Data Source=BD_Cliente.accdb";
        //variavel de conexao com database
        private static OleDbConnection conn = null;

        public static OleDbConnection obterConexao()
        {
            conn = new OleDbConnection(connString);
            try
            {
                conn.Open();
            }
            catch (Exception e)
            {
                conn = null;
                MessageBox.Show("Conexão não estabelecida!!");
            }
            return conn;
        }

        public static void fecharConexao()
        {
            if (conn != null)
            {
                conn.Close();
            }
        }


    }
}
