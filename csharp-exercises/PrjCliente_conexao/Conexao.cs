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
        private static string connString = @"Provider=Microsoft.Ace.OLEDB.12.0;Data Source=DB_Cliente.accdb";
        private static OleDbConnection conn = null;

        public static OleDbConnection obterConexao()
        {
            conn = new OleDbConnection(connString);
            try
            {
                conn.Open();
            }
            catch(Exception)
            {
                conn = null;
                MessageBox.Show("Conexão não estabelecida!!");
            }
            return conn;
        }

        public static void fecharConexao()
        {
            if(conn != null){
                conn.Close();
            }
        }

    }
}
