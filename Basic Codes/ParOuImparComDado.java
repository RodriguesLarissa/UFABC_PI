public class ParOuImparComDado
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int pontuacao, pontosS, pontosL, dadoS, dadoL;
        
        pontuacao = scan.nextInt();
        pontosS = 0;
        pontosL = 0;
        dadoS = 0;
        dadoL = 0;
        
        while(pontosS < pontuacao && pontosL < pontuacao)
        {
            dadoS = scan.nextInt();
            dadoL = scan.nextInt();
            
            if((dadoS%2 == 0 && pontosS%2 == 0) || (dadoS%2 != 0 && pontosS%2 != 0))
            {
                pontosS += 1;
            }
            else if(pontosS > 0)
            {
                pontosS -= 1;
            }
            
            if((dadoL%2 == 0 && pontosL%2 == 0) || (dadoL%2 != 0 && pontosL%2 != 0))
            {
                pontosL += 1;
            }
            else if(pontosL > 0)
            {
                pontosL -= 1;
            }
            
            System.out.println(pontosS);
            System.out.println(pontosL);
        }
        
        if(pontosS == pontuacao)
        {
            System.out.println("Sheldon");
        }
        else
        {
            System.out.println("Leonard");    
        }
    
    }
}