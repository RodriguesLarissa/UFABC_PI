public class Senha2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int senha;
        int digito1;
        int digito2;
        int digito3;
        int digito4;
        
        senha = scan.nextInt();
        
        digito4 = senha%10;
        senha = senha/10;
        digito3 = senha%10;
        senha = senha/10;
        digito2 = senha%10;
        digito1 = senha/10;
        
        if(digito1 == digito2 || digito1 == digito3 || digito1 == digito4 || digito2 == digito3 || digito2 == digito4 || digito3 == digito4)
        {
            System.out.println("NAO");
        }
        else
        {
            System.out.println("SIM");
        }
    }
}