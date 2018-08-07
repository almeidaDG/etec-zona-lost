using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProjetoAnimaisDouglas
{
    public class Reptil:Animal
    {
        public string corEscama;

        public override void locomover()
        {
            Console.WriteLine("Rastejando");
        }

        public override void alimentar()
        {
            Console.WriteLine("Comendo insetos");    
        }

        public override void emitirSom()
        {
            Console.WriteLine("Sibilando");
        }


        public string getCorEscama()
        {
            return corEscama;
        }

        public void setCorEscama(string corEscama)
        {
            this.corEscama = corEscama;
        }

        public override string ToString()
        {
            return "Reptil{" + " Idade = " + idade + ", Peso = " + peso + ", Membros = " + membros + ", Cor da escama = " + corEscama + '}';
        }
    }
}
