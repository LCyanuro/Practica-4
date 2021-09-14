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
    public void crearCuenta()
    {
        System.out.println("====== Nueva Cuenta ======");
        Cuenta.setUser_Name(CapturaEntrada.capturarCadena("✐ Inserte su nombre"));
        setUser_PIN();
        setUser_Balance(CapturaEntrada.capturarFlotante("✐ Inserte su primer deposito"));
        System.out.println("========== ÉXITO =========");
    }
}

class Cuenta extends Banco
{
    String user_name;
    float user_balance;
    int user_PIN;

    protected void setUser_Name(String user_name)
    {
        this.user_name = user_name;
    }

    //--------------------//
    protected String getUser_Name()
    {
        return user_name;
    }


    protected void setUser_Balance(float user_balance)
    {
        this.user_balance = user_balance;
    }

    protected void setUser_PIN()
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