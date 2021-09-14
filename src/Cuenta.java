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