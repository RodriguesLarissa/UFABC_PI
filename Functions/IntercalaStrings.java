public class IntercalaStrings
{
    public static void main(String[] args)
    {
        String s1, s2, sR;
        int i, tamanho1, tamanho2, j;
        Scanner scan = new Scanner(System.in);
        
        tamanho1 = scan.nextInt();
        s1 = scan.next();

        tamanho2 = scan.nextInt();
        s2 = scan.next();
        
        sR = Intercala(tamanho1, tamanho2, s1, s2);
        
        System.out.println(sR);
    }
    
    public static String Intercala(int tamanho1, int tamanho2, String s1, String s2)
    {
        int i, j;
        String sR = "";
        
        for(i=j=0; i<tamanho1 && j<tamanho2; )
        {
            if(s1.charAt(i) <= s2.charAt(j))
            {
                sR += (s1.charAt(i));
                i++;
            }
            else if(s2.charAt(j) < s1.charAt(i))
            {
                sR += (s2.charAt(j));
                j++;
            }
        }
        
        if(i != tamanho1)
        {
            while(i != tamanho1)
            {
                sR += (s1.charAt(i));
                i++;
            }
        }
        else if(j != tamanho2)
        {
            while(j != tamanho2)
            {
                sR += (s2.charAt(j));
                j++;
            }
        }
        
        return sR;
    }
}