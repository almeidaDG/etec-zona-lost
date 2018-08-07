using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class PicapeS10 : Carro
    {
        public override void locomover()
        {
            Console.WriteLine("Locomovendo 4 rodas");
        }

        public override void abastecer()
        {
            Console.WriteLine("Colocando diesel");
        }

        public override string ToString()
        {
            return "Picape S10{" + " Marca = " + marca + ", Cor do carro = " + corCarro +", Ano = " + ano + ", Pneu = " + pneu + '}';
        }
    }
}
