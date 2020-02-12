public class AlbumDaCopa
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantFigurinha, quantCarimbada, quantComprado, i, j, count=0, resultado;
        
        quantFigurinha = scan.nextInt();
        quantCarimbada = scan.nextInt();
        quantComprado = scan.nextInt();
        
        int vetCarimbadas[] = new int[quantCarimbada];
        int vetComprados[] = new int[quantComprado];
        
        for(i=0; i<quantCarimbada; i++)
        {
            vetCarimbadas[i] = scan.nextInt();
        }
        
        for(i=0; i<quantComprado; i++)
        {
            vetComprados[i] = scan.nextInt();
        }
        
        for(i=0; i<quantCarimbada; i++)
        {
            boolean iguais = false;
            for(j=0; j<quantComprado; j++)
            {
                if(vetCarimbadas[i] == vetComprados[j])
                {
                    iguais = true;
                    count++;
                }
            }
        }
        
        resultado = quantCarimbada-count;
        
        System.out.println(resultado);
    }
}