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
            Console.WriteLine("Digite sua idade: "); int age = int.Parse(Console.ReadLine());

            if (age <= 17)
            {
                Console.WriteLine("Você é menor de idade.");
            }

            else
            {
                Console.WriteLine("Você é maior de idade.");
            }

            Console.ReadKey();
        }
    }
}
