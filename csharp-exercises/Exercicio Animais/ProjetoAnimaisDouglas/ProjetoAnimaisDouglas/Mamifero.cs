using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProjetoAnimaisDouglas
{
    public class Mamifero:Animal
    {
        public string corPelo;
        public string raca;

        public override void locomover()
        {
            Console.WriteLine("Correndo");
        }

        public override void alimentar()
        {
            Console.WriteLine("Bebendo leite");
        }
        public string getCorPelo()
        {
            return corPelo;
        }

        public void setCorPelo(string corPelo)
        {
            this.corPelo = corPelo;
        }

        public string getRaca(){
            return raca;
        }

        public void setRaca(string raca){
            this.raca = raca;
        }

        public override string ToString()
        {
            return "Mamifero{" + " Idade = " + idade + ", Peso = " + peso + ", Membros = " + membros + ", Cor do pelo = " + corPelo + ", Raça = " + raca + '}';
        }
    }
}
