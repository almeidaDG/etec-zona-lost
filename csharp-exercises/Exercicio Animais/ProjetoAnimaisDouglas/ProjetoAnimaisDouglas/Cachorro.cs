using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProjetoAnimaisDouglas
{
    public class Cachorro : Mamifero
    {
        public void enterrarOsso()
        {
            Console.WriteLine("Enterrando osso");
        }

        public void abanarRabo()
        {
            Console.WriteLine("Abanando o rabo");
        }

        public override void emitirSom()
        {
            Console.WriteLine("Latindo");
        }

        public override void alimentar()
        {
            Console.WriteLine("Bebendo água");
        }

        public override string ToString()
        {
            return "Cachorro{" + " Idade = " + idade + ", Peso = " + peso + ", Membros = " + membros + ", Cor do pelo = " + corPelo + ", Raça = " + raca + '}';
        }
    }
}
