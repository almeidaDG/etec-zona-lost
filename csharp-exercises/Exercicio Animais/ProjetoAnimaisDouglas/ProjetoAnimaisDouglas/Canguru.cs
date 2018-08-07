using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProjetoAnimaisDouglas
{
    public class Canguru : Mamifero
    {
        public override void locomover()
        {
            Console.WriteLine("Pulando");
        }

        public void usarBolsa()
        {
            Console.WriteLine("Usando bolsa");
        }

        public override string ToString()
        {
            return "Canguru{" + " Idade = " + idade + ", Peso = " + peso + ", Membros = " + membros + ", Cor do pelo = " + corPelo + ", Raça = " + raca + '}';
        }
    }
}