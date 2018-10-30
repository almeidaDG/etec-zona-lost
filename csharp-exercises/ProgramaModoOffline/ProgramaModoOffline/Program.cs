using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace ProgramaModoOffline
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form1());

        }

        public static string conexaoBD = "Persist Security Info=False;User ID=sa;password=info211;Initial Catalog=CADASTRO;Data Source=LAB-06-10";
    }
}
