using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite um valor correspondente a R$: "); double reais = double.Parse(Console.ReadLine());
            Console.WriteLine("Digite a cotação do dólar: "); double cotacao = double.Parse(Console.ReadLine());

            double conversao = reais / cotacao;

            Console.WriteLine("O valor da conversão é: " + conversao);

            Console.ReadKey();
        }
    }
}
