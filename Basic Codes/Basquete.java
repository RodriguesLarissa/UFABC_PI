public class Basquete
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int distancia;
        int pontuacao;
        
        distancia = scan.nextInt();
        
        if(distancia <= 800)
        {
            pontuacao = 1;
        }
        else if(distancia <= 1400)
        {
            pontuacao = 2;
        }
        else
        {
            pontuacao = 3;
        }
        
        System.out.println(pontuacao);
    }
}