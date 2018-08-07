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
            Console.WriteLine("Digite um número: "); double a = double.Parse(Console.ReadLine());

            double quadrado = Math.Pow(a, 2);

            Console.WriteLine("O quadrado do seu número é: " + quadrado);

            Console.ReadKey();
        }
    }
}
