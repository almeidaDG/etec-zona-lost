using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Cb200 : Motocicleta
    {
        public override void locomover()
        {
            Console.WriteLine("Locomovendo roda traseira");
        }

        public override void abastecer()
        {
            Console.WriteLine("Colocando álcool");
        }

        public override string ToString()
        {
            return "CB 200{" + " Marca = " + marca + ", Cor da motocicleta = " + corMotocicleta + ", Ano = " + ano + ", Pneu = " + pneu + '}';
        }
    }
}
