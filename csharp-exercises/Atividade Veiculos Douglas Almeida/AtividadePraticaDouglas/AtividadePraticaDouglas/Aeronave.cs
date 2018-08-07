using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Aeronave : Veiculo
    {
        public string corFuselagem;

        public void arremeter()
        {
            Console.WriteLine("Arremetando");
        }

        public string getCorFuselagem()
        {
            return corFuselagem;
        }

        public void setCorFuselagem(string corFuselagem)
        {
            this.corFuselagem = corFuselagem;
        }
    }
}
