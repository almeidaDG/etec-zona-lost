using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    class Program
    {
        static void Main(string[] args)
        {
            Fusca fusca1 = new Fusca();
            PicapeS10 picape1 = new PicapeS10();
            Cb200 cb1 = new Cb200();
            Caiaque caiaque1 = new Caiaque();
            Esquilo esquilo1 = new Esquilo();
            Legacy450 legacy1 = new Legacy450();

            //

            fusca1.setMarca("Toyota");
            fusca1.setCorCarro("Preto");
            fusca1.setAno(1999);
            fusca1.setPneu(4);

            picape1.setMarca("Volkswagen");
            picape1.setCorCarro("Branco");
            picape1.setAno(2006);
            picape1.setPneu(4);

            cb1.setMarca("Kawasaki");
            cb1.setCorMotocicleta("Amarela");
            cb1.setAno(2018);
            cb1.setPneu(2);

            caiaque1.setMarca("Dutsch");
            caiaque1.setCorCasco("Marrom");
            caiaque1.setAno(2010);
            caiaque1.setPneu(0);

            esquilo1.setMarca("Gol");
            esquilo1.setCorFuselagem("Branco");
            esquilo1.setAno(2005);
            esquilo1.setPneu(3);

            legacy1.setMarca("Malaysia");
            legacy1.setCorFuselagem("Cinza");
            legacy1.setAno(2020);
            legacy1.setPneu(3);

            //

            Console.WriteLine(fusca1.ToString());
            Console.WriteLine();
            fusca1.abastecer();
            fusca1.locomover();
            Console.WriteLine();

            Console.WriteLine(picape1.ToString());
            Console.WriteLine();
            picape1.abastecer();
            picape1.locomover();
            Console.WriteLine();

            Console.WriteLine(cb1.ToString());
            Console.WriteLine();
            cb1.abastecer();
            cb1.locomover();
            Console.WriteLine();

            Console.WriteLine(caiaque1.ToString());
            Console.WriteLine();
            caiaque1.abastecer();
            caiaque1.locomover();
            Console.WriteLine();

            Console.WriteLine(esquilo1.ToString());
            Console.WriteLine();
            esquilo1.abastecer();
            esquilo1.locomover();
            Console.WriteLine();

            Console.WriteLine(legacy1.ToString());
            Console.WriteLine();
            legacy1.abastecer();
            legacy1.locomover();
            legacy1.decolar("Sol");
            legacy1.decolar("Chuva");
            legacy1.decolar("Neve");
            legacy1.decolar(11);
            legacy1.decolar(13);
            legacy1.decolar(19);
            legacy1.decolar(true);
            legacy1.decolar(false);
            legacy1.decolar(93.5f);

            Console.WriteLine();

            Console.ReadKey();
        }
    }
}
