using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProjetoAnimaisDouglas
{
    public class Aves:Animal
    {
        public string corPena;

        public override void locomover()
        {
            Console.WriteLine("Voando");
        }

        public override void alimentar()
        {
            Console.WriteLine("Comendo minhocas");
        }

        public override void emitirSom()
        {
            Console.WriteLine("Cantando");
        }

        public void fazerNinho()
        {
            Console.WriteLine("Construindo ninho...");
        }

        public string getCorPena()
        {
            return corPena;
        }

        public void setCorPena(string corPena)
        {
            this.corPena = corPena;
        }

        public override string ToString()
        {
            return "Aves{" + " Idade = " + idade + ", Peso = " + peso + ", Membros = " + membros + ", Cor da pena = " + corPena + '}';
        }
    }
}
