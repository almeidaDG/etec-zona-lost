using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Escola
{
    public class Funcionario:Pessoa
    {
        private string setor;
        private Boolean trabalhando;

        public void mudarTrabalho()
        {
            this.trabalhando = !this.trabalhando;
        }

        //setor

        public string getSetor()
        {
            return setor;
        }

        public void setSetor(string setor)
        {
            this.setor = setor;
        }
        
        //trabalhando

        public Boolean getTrabalhando()
        {
            return trabalhando;
        }

        public void setTrabalhando(Boolean trabalhando)
        {
            this.trabalhando = trabalhando;
        }

        public override string ToString()
        {
            return "Funcionario{" + " setor =" + setor + ", trabalhando =" + trabalhando + '}';
        }

    }
}
