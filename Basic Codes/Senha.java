public class Senha
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
        
        if(digito1 == 0 || digito2 == 0 || digito3 == 0 || digito4 == 0)
        {
            System.out.println("NAO");
        }
        else
        {
            System.out.println("SIM");
        }
    }
} 