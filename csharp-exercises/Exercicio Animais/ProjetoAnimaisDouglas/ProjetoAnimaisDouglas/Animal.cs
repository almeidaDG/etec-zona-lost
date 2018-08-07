using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProjetoAnimaisDouglas
{
    public class Animal
    {
        public float peso;
        public int idade;
        public int membros;

        public virtual void locomover()
        {
            Console.WriteLine("Locomovendo");
        }

        public virtual void alimentar()
        {
            Console.WriteLine("Comendo");
        }

        public virtual void emitirSom()
        {
            Console.WriteLine("Grunhindo");
        }

        //get e set variavel

        public float getPeso()
        {
            return peso;
        }

        public void setPeso(float peso)
        {
            this.peso = peso;
        }

        public int getIdade()
        {
            return idade;
        }

        public void setIdade(int idade)
        {
            this.idade = idade;
        }

        public int getMembros()
        {
            return membros;
        }

        public void setMembros(int membros)
        {
            this.membros = membros;
        }

        public override string ToString()
        {
            return "Animal{" + " Peso = " + peso + ", Idade = " + idade + ", Membros = " + membros + '}';
        }
    }
}
