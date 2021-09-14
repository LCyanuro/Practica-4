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