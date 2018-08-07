using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Escola
{
    public class Professor:Pessoa
    {
        private string especialidade;
        private float salario;

        public void receberAumento(float aum)
        {
            this.salario += aum;
        }

        //especialidade

        public string getEspecialidade()
        {
            return especialidade;
        }

        public void setEspecialidade(string especialidade)
        {
            this.especialidade = especialidade;
        }

        //salario

        public float getSalario()
        {
            return salario;
        }

        public void setSalario(float salario)
        {
            this.salario = salario;
        }

        public override string ToString()
        {
            return "Professor{" + " especialidade = " + especialidade + ", salário = " + salario + ", nome =" + nome + ", idade = " + idade + ", sexo=" + sexo + '}';
        }

    }
}
