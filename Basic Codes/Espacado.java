public class Espacado
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String palavra;
        int i;
        
        while(scan.hasNext())
        {
            palavra = scan.next();
            for(i=0; i<palavra.length(); i++)
            {
                if(i < palavra.length() -1)
                {
                    System.out.println(palavra.charAt(i) + " ");
                }
                else
                {
                    System.out.println
                }
            }
        }
    }
}