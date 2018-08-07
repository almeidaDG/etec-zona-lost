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
            Console.WriteLine("Digite o valor de A: "); double a = double.Parse(Console.ReadLine());
            Console.WriteLine("Digite o valor de B: "); double b = double.Parse(Console.ReadLine());
            Console.WriteLine("Digite o valor de C: "); double c = double.Parse(Console.ReadLine());

            double resultado = 
                Math.Pow(a, 2) * 5 - c / (b - a % 4);

            Console.WriteLine("O resultado é: " + resultado);

            Console.ReadKey();
        }
    }
}
