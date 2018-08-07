using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProjetoAnimaisDouglas
{
    public class Tartaruga : Reptil
    {
        public override void locomover()
        {
            Console.WriteLine("Andando");
        }

        public override void alimentar()
        {
            Console.WriteLine("Comendo plantas");
        }

        public override string ToString()
        {
            return "Tartaruga{" + " Idade = " + idade + ", Peso = " + peso + ", Membros = " + membros + ", Cor da escama = " + corEscama + '}';
        }
    }
}
