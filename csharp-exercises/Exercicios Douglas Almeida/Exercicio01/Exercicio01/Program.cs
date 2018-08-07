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
            Console.WriteLine("Digite seu nome: "); string name = Console.ReadLine();
            Console.WriteLine("Digite sua idade: "); int age = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite sua cidade: "); string city = Console.ReadLine();

            Console.WriteLine("\nSr." +name + ", você possui " + age + " anos. \nResidente da cidade: " + city + ".");

            Console.ReadKey();
        }
    }
}
