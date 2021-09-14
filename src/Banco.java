public class Banco
{
    String nombre;
    int PIN;
    float balance;

    public Banco()
    {
        String nombre = "";
        int PIN = 2500;
        float balance = 0f;
    }

    //GETTERS
    protected String getNombre()
    {
        return nombre;
    }
    protected int getPIN()
    {
        return PIN;
    }
    protected float getBalance()
    {
        return balance;
    }

    protected void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    protected void setPIN(int PIN)
    {
        this.PIN = PIN;
    }
    protected void setBalance(float balance)
    {
        this.balance = balance;
    }

    //2. Haga una clase banco que pueda registrar nuevas cuentas.

    public static Banco Registrar()
    {
        Banco retorno = new Cuenta(CapturaEntrada.capturarCadena("✐ Inserte su nombre"),
                setUser_PIN(),
                CapturaEntrada.capturarFlotante("✐ Inserte su primer deposito"));
        return retorno;
    }

    private static int setUser_PIN() {
        int j;
        int retorno = 0;

        for (j = 0; j < 2; j++) {
            retorno = 0;
            retorno = CapturaEntrada.capturarEntero("✐ Inserte su PIN (4 DIGITOS)");

            if (retorno > 1000 && retorno < 9999) {
                j = 2;
            } else {
                j = 0;
                System.out.println("⚠️Tu PIN debe tener 4 digitos numéricos.");
            }
        }

        return retorno;
    }

    public static void Log(Banco arreglo[])
    {
        //System.out.println(arreglo[0].getPIN());
        //VALIDAR EL NIP
        int temporal_id,id = 0;
        int f,bool = 1,k;

        //System.out.println(arreglo.length);
        //System.out.println(arreglo.length);
        //System.out.println(arreglo.length);

        for (k=0;k<2;k++)
        {
            temporal_id = CapturaEntrada.capturarEntero("✐ Inserte su PIN");


            for (f = 0; f < arreglo.length-1; f++)
            {
                System.out.println(arreglo[f].getPIN() + ", " + temporal_id);
                if (arreglo[f].getPIN() == temporal_id)
                {
                    //System.out.println(arreglo[f].getPIN() + ", " + temporal_id);
                    System.out.println("=== ✔ Acceso correcto! ===");
                    bool = 0;
                    k = 2;
                    id = f;
                }
            }

            if (bool == 1) {System.out.println("== ⚠ Acceso Incorrecto! ==");k = 0;}
        }

        if(bool == 0)
        {
            int y;
            for(y=0;y<2;y++)
            {
                System.out.println("");
                System.out.println("== BANCO ÓSCAR LOGGED IN ==");
                System.out.println(arreglo[id].getNombre() + ": " + arreglo[id].getBalance());
                System.out.println("===== Menú principal =====");
                System.out.println("===== ⒈ Depositar ========");
                System.out.println("===== ⒉ Retirar       ====");
                System.out.println("===== ⒊ SALIR        =====");
                System.out.println("");
                System.out.println("== SELECCIONA TU OPCIÓN ==");
                int choice = CapturaEntrada.capturarEntero("Inserte su opcion");

                if (choice == 1)
                {
                    arreglo[id].setBalance(arreglo[id].getBalance() + CapturaEntrada.capturarFlotante("Inserte la cantidad de deposito"));
                    y=0;

                }
                else if (choice == 2)
                {
                    float cantidad = CapturaEntrada.capturarFlotante("Inserte la cantidad de retiro");
                    if ((arreglo[id].getBalance() - cantidad) > 0)
                    {
                        arreglo[id].setBalance(arreglo[id].getBalance() - cantidad);
                    }
                    else
                    {
                        System.out.println("⚠ No se puede");
                    }
                    y=0;
                }
                else
                {
                    y=2;
                }
            }
        }
    }
}