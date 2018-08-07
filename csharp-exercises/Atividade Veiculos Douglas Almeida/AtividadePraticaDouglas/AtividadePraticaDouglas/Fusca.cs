using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Fusca : Carro
    {
        public override void locomover()
        {
            Console.WriteLine("Locomovendo 2 rodas");
        }

        public override void abastecer()
        {
            Console.WriteLine("Colocando gasolina");
        }

        public override string ToString()
        {
            return "Fusca{" + " Marca = " + marca + ", Cor do carro = " + corCarro + ", Ano = " + ano + ", Pneu = " + pneu + '}';
        }
    }
}
