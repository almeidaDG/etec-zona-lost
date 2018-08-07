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
    public partial class frmCalculadora : Form
    {

        public frmCalculadora()
        {
            InitializeComponent();
        }
        double valor1;
        int operacao;
        private void btnNum1_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "1";
            lblResultado.Text = lblResultado.Text + 1;
        }

        private void btnNum2_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "2";
            lblResultado.Text = lblResultado.Text + 2;
           
        }

        private void btnNum3_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "3";
            lblResultado.Text = lblResultado.Text + 3;
        }

        private void btnNum4_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "4";
           lblResultado.Text = lblResultado.Text + 4;
            
        }

        private void btnNum5_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "5";
            lblResultado.Text = lblResultado.Text + 5;
        }

        private void btnNum6_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "6";
            lblResultado.Text = lblResultado.Text + 6;
        }

        private void btnNum7_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "7";
            lblResultado.Text = lblResultado.Text + 7;
        }

        private void btnNum8_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "8";
            lblResultado.Text = lblResultado.Text + 8;
        }

        private void btnNum9_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "9";
            lblResultado.Text = lblResultado.Text + 9;
        }

        private void btnNum0_Click(object sender, EventArgs e)
        {
            txbCalculadora.Text = txbCalculadora.Text += "0";
            lblResultado.Text = lblResultado.Text + 0;
        }

        private void btnSoma_Click(object sender, EventArgs e)
        {
           lblResultado.Text = lblResultado.Text + "+";
           btnIgual.PerformClick();
           operacao = 1;
           txbCalculadora.Clear();
          // lblResultado.Text = "Histórico: " acumular1 + "+" + acumular2 ;
        }

        private void btnSub_Click(object sender, EventArgs e)
        {
           lblResultado.Text = lblResultado.Text + "-";
           btnIgual.PerformClick();
           operacao = 2;
           txbCalculadora.Clear();
        }
        
        private void btnMult_Click(object sender, EventArgs e)
        {
           lblResultado.Text = lblResultado.Text + "*";
           btnIgual.PerformClick();
           operacao = 3;
           txbCalculadora.Clear();
        }
        private void btnDiv_Click(object sender, EventArgs e)
        {
           lblResultado.Text = lblResultado.Text + "/";
           btnIgual.PerformClick();
           operacao = 4;
           txbCalculadora.Clear();
        }

        private void btnIgual_Click(object sender, EventArgs e)
        {
            switch(operacao){
                case 1: 
                txbCalculadora.Text = (valor1 + Double.Parse(txbCalculadora.Text)).ToString();
                //lblResultado.Text = (valor1 + " + " + valor1 + " = " + Double.Parse(txbCalculadora.Text)).ToString();
                //lblResultado.Text += " = " + txbCalculadora.Text;  
                break;
            
                case 2:
                txbCalculadora.Text = (valor1 - Double.Parse(txbCalculadora.Text)).ToString();
                //lblResultado.Text = (valor1 + " - " + valor1 + " = " + Double.Parse(txbCalculadora.Text)).ToString();
                break;
                
                case 3:
                txbCalculadora.Text = (valor1 * Double.Parse(txbCalculadora.Text)).ToString();
                //lblResultado.Text = (valor1 + " * " + valor1 + " = " + Double.Parse(txbCalculadora.Text)).ToString();
                break;
                
                case 4:
                txbCalculadora.Text = (valor1 / Double.Parse(txbCalculadora.Text)).ToString();
                //lblResultado.Text = (valor1 + " / " + valor1 + " = " + Double.Parse(txbCalculadora.Text)).ToString();
                break;
        }
            valor1 = Double.Parse(txbCalculadora.Text);
            //lblResultado.Text = "Resultados: " + valor1;
            operacao = 0;
        }
        private void btnLimpar_Click(object sender, EventArgs e)
        {
            txbCalculadora.Clear();
            lblResultado.Text = "";
            valor1 = 0;
        }

        
    }
}
