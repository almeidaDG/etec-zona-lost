using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Caiaque : Embarcacao
    {
        public override void abastecer()
        {
            Console.WriteLine("Depende da sua força, remador!");
        }

        public override void locomover()
        {
            Console.WriteLine("Remando");
        }

        public override string ToString()
        {
            return "Caiaque{" + " Marca = " + marca + ", Cor do casco = " + corCasco + ", Ano = " + ano + '}';
        }
    }
}
