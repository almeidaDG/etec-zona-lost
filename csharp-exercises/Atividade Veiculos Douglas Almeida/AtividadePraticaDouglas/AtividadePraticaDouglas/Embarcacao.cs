using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Embarcacao : Veiculo
    {
        public string corCasco;

        public void ancorar()
        {
            Console.WriteLine("Ancorando");
        }

        public string getCorCasco()
        {
            return corCasco;
        }

        public void setCorCasco(string corCasco)
        {
            this.corCasco = corCasco;
        }
    }
}
