import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Cuenta[] database = new Cuenta[20];
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

            if (opcion == 1)
            {
                //database[id] = ;
                id = id + 1;
                i=0;
            }
            else if (opcion == 2)
            {
                //Banco.logIN(database);

                //System.out.println(database[0].getUser_Name());
                //i=0;
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
    //2. Haga una clase banco que pueda registrar nuevas cuentas.


    public Banco Registrar()
    {
        Banco retorno = new Cuenta(CapturaEntrada.capturarCadena("✐ Inserte su nombre"),
                setUser_PIN(),
                CapturaEntrada.capturarFlotante("✐ Inserte su primer deposito"));
        return retorno;
    }

    private int setUser_PIN()
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
        return retorno;
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
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setPIN(int PIN)
    {
        this.PIN = PIN;
    }
    public void setBalance(float balance)
    {
        this.balance = balance;
    }


    //GETTERS
    public String getNombre()
    {
        return nombre;
    }
    public int getPIN()
    {
        return PIN;
    }
    public float getBalance()
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