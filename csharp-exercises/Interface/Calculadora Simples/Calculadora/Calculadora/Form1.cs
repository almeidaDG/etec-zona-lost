using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Calculadora
{
    public partial class Calculadora : Form
    {
        public Calculadora()
        {
            InitializeComponent();
        }

        private void btnSoma_Click(object sender, EventArgs e)
        {
            double valorA = System.Convert.ToDouble(txbValorA.Text);
            double valorB = System.Convert.ToDouble(txbValorB.Text);

            double resultado = valorA + valorB;

            lblResposta.Text = "O valor da soma é: " + resultado;
        }

        private void btnSub_Click(object sender, EventArgs e)
        {
            double valorA = System.Convert.ToDouble(txbValorA.Text);
            double valorB = System.Convert.ToDouble(txbValorB.Text);

            double resultado = valorA - valorB;

            lblResposta.Text = "O valor da subtração é: " + resultado;
        }

        private void btnMult_Click(object sender, EventArgs e)
        {
            double valorA = System.Convert.ToDouble(txbValorA.Text);
            double valorB = System.Convert.ToDouble(txbValorB.Text);

            double resultado = valorA * valorB;

            lblResposta.Text = "O valor da multiplicação é: " + resultado;
        }

        private void btnDiv_Click(object sender, EventArgs e)
        {
            double valorA = System.Convert.ToDouble(txbValorA.Text);
            double valorB = System.Convert.ToDouble(txbValorB.Text);

            double resultado = valorA / valorB;

            if (valorB == 0)
            {
                lblResposta.Text = "Não existe divisão para 0";
            }

            else
            {
                lblResposta.Text = "O valor da divisão é: " + resultado;
            }
        }
    }
}
