using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AtividadePraticaDouglas
{
    public class Motocicleta : Veiculo
    {
        public string corMotocicleta;

        public string getCorMotocicleta()
        {
            return corMotocicleta;
        }

        public void setCorMotocicleta(string corMotocicleta)
        {
            this.corMotocicleta = corMotocicleta;
        }
    }
}
