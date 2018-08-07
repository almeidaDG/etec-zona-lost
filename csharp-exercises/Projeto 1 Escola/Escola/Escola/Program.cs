using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Escola
{
    class Program
    {
        static void Main(string[] args)
        {
            Pessoa pessoa1 = new Pessoa();
            Aluno pessoa2 = new Aluno();
            Professor pessoa3 = new Professor();
            Funcionario pessoa4 = new Funcionario();
            Professor pessoa5 = new Professor();
            Professor pessoa6 = new Professor();

            pessoa1.setNome("Luis");
            pessoa1.setIdade(30);

            pessoa2.setNome("Maria");
            pessoa2.setCurso("TI");

            pessoa3.setNome("Luisa");
            pessoa3.setSalario(3000.50f);

            pessoa4.setNome("João");
            pessoa4.setSexo("Masculino");
            pessoa4.setTrabalhando(false);

            pessoa5.setNome("Caio");

            pessoa6.setNome("Wilson");
            pessoa6.setIdade(23);
            pessoa6.setSexo("Masculino");
            pessoa6.setSalario(5000.50f);
            pessoa6.setEspecialidade("TI");
            pessoa6.receberAumento(150.30f);
            pessoa6.fazerAniversario();

            Console.WriteLine(pessoa1.ToString());
            Console.WriteLine();
            Console.WriteLine(pessoa2.ToString());
            Console.WriteLine();
            Console.WriteLine(pessoa3.ToString());
            Console.WriteLine();
            Console.WriteLine(pessoa4.ToString());
            Console.WriteLine();
            Console.WriteLine(pessoa5.ToString());
            Console.WriteLine();
            Console.WriteLine(pessoa6.ToString());

            Console.ReadKey();
        }
    }
}
