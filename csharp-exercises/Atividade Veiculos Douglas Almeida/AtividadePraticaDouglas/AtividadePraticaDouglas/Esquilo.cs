using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Esquilo : Aeronave
    {
        public override void abastecer()
        {
            Console.WriteLine("Colocando diesel");
        }

        public override void locomover()
        {
            Console.WriteLine("Ligando hélice");
        }

        public override string ToString()
        {
            return "Esquilo{" + " Marca = " + marca + ", Cor da fuselagem = " + corFuselagem +", Ano = " + ano + ", Pneu = " + pneu + '}';
        }
    }
}
