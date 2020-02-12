public class Loto
{
    public static void main(String[] args)
    {
        int n, m;
        double[] resultado = new double[15];
        
        for(n=0; n < 15; n++)
        {
            resultado[n] = (Math.random() * 26);
            
            if(resultado[n] <1)
            {
                n = 0;
            }
            
            for(m = n-1; m >= 0; m--)
            {
                if((int)resultado[n] == (int)resultado[m])
                {
                    n = 0;
                }
            }
        }
        
        for(n=0; n < 15; n++)
        {
            if(n != 14)
            {
                System.out.printf("%d ",(int)resultado[n]);
            }
            else
            {
                System.out.printf("%d\n",(int)resultado[n]);
            }
        }
    }
}