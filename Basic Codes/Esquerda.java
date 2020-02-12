public class Esquerda
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, direcao;
        String lado;
        char caractere;
        
        direcao = 1;
        
        quantidade = scan.nextInt();
        lado = scan.next();

        for(i=0; quantidade > i; i++)
        {
            caractere = lado.charAt(i);
            if(caractere == 'E' )
            {
                if(direcao <= 1)
                {
                    direcao = 4;
                }
                else
                {
                    direcao--;
                }
            }
            else
            {
                if(direcao >= 4)
                {
                    direcao = 1;
                }
                else
                {
                    direcao++;
                }
            }
        }
        
        if (direcao == 1)
        {
            System.out.println("N");
        }
        else if(direcao == 2)
        {
            System.out.println("L");
        }
        else if(direcao == 3)
        {
            System.out.println("S");
        }
        else
        {
            System.out.println("O");
        }
        
    }
}