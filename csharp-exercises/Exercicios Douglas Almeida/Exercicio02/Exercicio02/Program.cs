﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite um número: "); int a = int.Parse(Console.ReadLine());
        
            int dobro = a * 2;

            Console.WriteLine("O dobro do seu número é: " + dobro);

            Console.ReadKey();


        }
    }
}
