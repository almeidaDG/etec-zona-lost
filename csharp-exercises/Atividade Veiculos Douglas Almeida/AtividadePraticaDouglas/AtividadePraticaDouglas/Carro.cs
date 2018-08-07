using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Carro : Veiculo
    {
        public string corCarro;

        public string getCorCarro()
        {
            return corCarro;
        }

        public void setCorCarro(string corCarro)
        {
            this.corCarro = corCarro;
        }
    }
}
