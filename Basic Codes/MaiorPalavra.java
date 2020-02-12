public class MaiorPalavra
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String palavra, maiorPalavra = "";
        int i=0;
        
        while(scan.hasNext())
        {
            palavra = scan.next();
            if(i == 0 || palavra.length() > maiorPalavra.length())
            {
                maiorPalavra = palavra;
            }
            i++;
        }
        
        if(i != 0)
        {
            System.out.println("A maior palavra informada foi " + maiorPalavra);
        }
        else
        {
            System.out.println("Nenhuma palavra foi informada.");
        }
    }
}