public class NumerosAmigos
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numero1, numero2, i, soma1, soma2;
        String x;
        
        while(scan.hasNext())
        {
            i = 1;
            soma1 = 0;
            soma2 = 0;
            numero1 = scan.nextInt();
            numero2 = scan.nextInt();

            while(i < numero1)
            {
                if(numero1%i == 0)
                {
                    soma1 += i;
                }
            
                i++;
            }
        
            i = 1;
        
            while(i < numero2)
            {
                if(numero2%i == 0)
                {
                    soma2 += i;
                }
            
                i++;
            }
        
            if(soma1 == numero2 && soma2 == numero1)
            {
                System.out.println("amigos");
            }
            else
            {
                System.out.println("nao amigos");
            }
         
        }
    }
}