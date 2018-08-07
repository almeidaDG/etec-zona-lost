using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Veiculo
    {
        public string marca;
        public int ano;
        public int pneu;

        public virtual void locomover()
        {
            Console.WriteLine("Locomovendo veiculo");
        }
        public virtual void abastecer()
        {
            Console.WriteLine("Abastecendo veiculo");
        }

        public string getMarca()
        {
            return marca;
        }

        public void setMarca(string marca)
        {
            this.marca = marca;
        }

        public int getAno()
        {
            return ano;
        }

        public void setAno(int ano)
        {
            this.ano = ano;
        }

        public int getPneu()
        {
            return pneu;
        }

        public void setPneu(int pneu)
        {
            this.pneu = pneu;
        }

        //public override string ToString()
        //{
            //return "Veiculo{" + " Marca = " + marca + ", Ano = " + ano + ", Pneu = " + pneu + '}';
        //}
    }
}
