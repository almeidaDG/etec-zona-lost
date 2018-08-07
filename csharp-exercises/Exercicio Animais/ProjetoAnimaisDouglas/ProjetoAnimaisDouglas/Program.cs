using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProjetoAnimaisDouglas
{
    class Program
    {
        static void Main(string[] args)
        {
            Mamifero gato = new Mamifero();
            Reptil lagarto = new Reptil();
            Aves passaro = new Aves();
            Canguru canguru1 = new Canguru();
            Cachorro cachorro1 = new Cachorro();
            Tartaruga tartaruga1 = new Tartaruga();
            Tucano tucano1 = new Tucano();

            //setando

            gato.setIdade(5);
            gato.setCorPelo("Branco");
            gato.setMembros(4);
            gato.setPeso(20);
            gato.setRaca("Siamês");

            lagarto.setIdade(2);
            lagarto.setMembros(4);
            lagarto.setPeso(1);
            lagarto.setCorEscama("Verde");

            passaro.setIdade(2);
            passaro.setMembros(4);
            passaro.setPeso(2);
            passaro.setCorPena("Azul");

            canguru1.setIdade(4);
            canguru1.setCorPelo("Alaranjado");
            canguru1.setMembros(4);
            canguru1.setPeso(40);
            canguru1.setRaca("Wallabyes");

            cachorro1.setIdade(7);
            cachorro1.setCorPelo("Preto");
            cachorro1.setMembros(4);
            cachorro1.setPeso(20);
            cachorro1.setRaca("Bull Terrier");

            tartaruga1.setIdade(2);
            tartaruga1.setMembros(4);
            tartaruga1.setPeso(3);
            tartaruga1.setCorEscama("Verde");

            tucano1.setIdade(4);
            tucano1.setMembros(4);
            tucano1.setPeso(4);
            tucano1.setCorPena("Preto");

            //imprimindo

            Console.WriteLine(gato.ToString());
            Console.WriteLine();
            gato.emitirSom();
            gato.alimentar();
            gato.locomover();

            //

            Console.WriteLine();
            Console.WriteLine(lagarto.ToString());
            Console.WriteLine();
            lagarto.emitirSom();
            lagarto.alimentar();
            lagarto.locomover();

            //

            Console.WriteLine();
            Console.WriteLine(passaro.ToString());
            Console.WriteLine();
            passaro.emitirSom();
            passaro.alimentar();
            passaro.locomover();
            passaro.fazerNinho();
            Console.WriteLine();

            //

            Console.WriteLine();
            Console.WriteLine(canguru1.ToString());
            Console.WriteLine();
            canguru1.emitirSom();
            canguru1.alimentar();
            canguru1.locomover();
            canguru1.usarBolsa();
            Console.WriteLine();

            //

            Console.WriteLine();
            Console.WriteLine(cachorro1.ToString());
            Console.WriteLine();
            cachorro1.emitirSom();
            cachorro1.alimentar();
            cachorro1.locomover();
            cachorro1.enterrarOsso();
            cachorro1.abanarRabo();
            Console.WriteLine();

            //

            Console.WriteLine();
            Console.WriteLine(tartaruga1.ToString());
            Console.WriteLine();
            tartaruga1.emitirSom();
            tartaruga1.alimentar();
            tartaruga1.locomover();
            Console.WriteLine();

            //

            Console.WriteLine();
            Console.WriteLine(tucano1.ToString());
            Console.WriteLine();
            tucano1.emitirSom();
            tucano1.alimentar();
            tucano1.locomover();
            Console.WriteLine();
            Console.ReadKey();
        }
    }
}
