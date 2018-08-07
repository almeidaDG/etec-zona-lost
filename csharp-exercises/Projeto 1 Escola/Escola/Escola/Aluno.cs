using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Escola
{
    public class Aluno:Pessoa
    {
        private int matricula;
        private string curso;

        public void cancelarMatricula()
        {
            Console.WriteLine("Matrícula cancelada!");
        }

        //matricula

        public int getMatricula()
        {
            return matricula;
        }

        public void setMatricula(int matricula)
        {
            this.matricula = matricula;
        }

        //curso


        public string getCurso()
        {
            return curso;
        }

        public void setCurso(string curso)
        {
            this.curso = curso;
        }

        public override string ToString()
        {
            return "Aluno{" + " matricula =" + matricula + ", curso = " + curso + '}';
        }
    }
}
