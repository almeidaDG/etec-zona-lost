using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProjetoAnimaisDouglas
{
    public class Tucano : Aves
    {
        public override void alimentar()
        {
            Console.WriteLine("Comendo frutas");
        }

        public override string ToString()
        {
            return "Tucano{" + " Idade = " + idade + ", Peso = " + peso + ", Membros = " + membros + ", Cor da pena = " + corPena + '}';
        }
    }
}
