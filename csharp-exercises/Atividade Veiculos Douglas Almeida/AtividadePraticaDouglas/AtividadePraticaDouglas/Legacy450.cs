using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Legacy450 : Aeronave
    {
        public override void abastecer()
        {
            Console.WriteLine("Colocando querosene");
        }

        public override void locomover()
        {
            Console.WriteLine("Ligando turbina");
        }

        public void decolar(String clima)
        {
            if (clima == "Sol")
            {
                Console.WriteLine("Voo normal");
            }

            else if (clima == "Chuva" || clima == "Nublado")
            {
                Console.WriteLine("Voo por instrumento");
            }

            else if (clima == "Neve")
            {
                Console.WriteLine("Sem voo");
            }

        }

        public void decolar(int horario)
        {
            if (horario >= 1 && horario <= 12)
            {
                Console.WriteLine("Altitude alta");
            }

            else if (horario >= 12 && horario <= 18)
            {
                Console.WriteLine("Altitude média");
            }

            else
            {
                Console.WriteLine("Altitude baixa");
            }
        }

        public void decolar(Boolean passageiros)
        {
            if (passageiros == true)
            {
                Console.WriteLine("Servindo refeição");
            }

            else
            {
                Console.WriteLine("Amarrar bem a carga");
            }
        }

        public void decolar(float combustivel)
        {
            if (combustivel >= 80)
            {
                Console.WriteLine("Decolando");
            }
            else
            {
                Console.WriteLine("Parado");
            }
        }


        public override string ToString()
        {
            return "Legacy 450{" + " Marca = " + marca + ", Cor da fuselagem = " + corFuselagem +", Ano = " + ano + ", Pneu = " + pneu + '}';
        }
    }
}
