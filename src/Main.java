import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Banco[] database = new Cuenta[1];
        int i, id = 0;
        for(i=0;i<2;i++)
        {
            System.out.println("");
            System.out.println("== B A N C O  Ó S C A R ==");
            System.out.println("===== Menú principal =====");
            System.out.println("===== ⒈ Crear cuenta =====");
            System.out.println("===== ⒉ Entrar       =====");
            System.out.println("===== ⒊ SALIR        =====");
            System.out.println("");
            System.out.println("== SELECCIONA TU OPCIÓN ==");
            int opcion = CapturaEntrada.capturarEntero("Inserte su opcion");

            //System.out.println(database.length);

            if (opcion == 1)
            {
                database[database.length-1] = Banco.Registrar();
                database = Arrays.copyOf(database, database.length+1);

                i=0;
            }
            else if (opcion == 2)
            {
                Banco.Log(database);
                //System.out.println(database[1].getNombre());
                i=0;
            }
            else
            {
                i=2;
            }

        }



    }
}


class Banco
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

class Cuenta extends Banco
{
    //3. La clase “Cuenta”, a su vez, tendrá diferentes atributos que, por la naturaleza de esta información,
    //deberán permanecer todos privados y solo ser accesibles para el “Banco”.
    //4. Una "Cuenta" se compone del "nombre" del titular de la cuenta, el "saldo" que tiene esta cuenta y un
    //"PIN" que se utiliza para acceder al saldo de la cuenta

    //Atributos
    String nombre;
    int PIN;
    float balance;

    //Constructor
    public Cuenta(String nombre, int PIN, float balance)
    {
        setNombre(nombre);
        setPIN(PIN);
        setBalance(balance);
    }

    //SETTERS
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

}

/*
class Cuenta extends Banco
{
    String user_name;
    float user_balance;
    int user_PIN;

    public void Cuenta(String user_name, float user_balance, int user_PIN)
    {
        System.out.println("====== Nueva Cuenta ======");
        setUser_Name(CapturaEntrada.capturarCadena("✐ Inserte su nombre"));
        setUser_PIN();
        setUser_Balance(CapturaEntrada.capturarFlotante("✐ Inserte su primer deposito"));
        System.out.println("========== ÉXITO =========");
    }

    private void setUser_Name(String user_name)
    {
        this.user_name = user_name;
    }

    //--------------------//
    public String getUser_Name()
    {
        return user_name;
    }


    private void setUser_Balance(float user_balance)
    {
        this.user_balance = user_balance;
    }

    private void setUser_PIN()
    {
        int j;
        for(j = 0;j<2;j++)
        {
            float retorno = CapturaEntrada.capturarFlotante("✐ Inserte su PIN (4 DIGITOS)");

            if (retorno> 1000f && retorno < 9999f)
            {
                j=2;
            }
            else
            {
                j=0;
                System.out.println("⚠️Tu PIN debe tener 4 digitos numéricos.");
            }
        }
    }
}
*/