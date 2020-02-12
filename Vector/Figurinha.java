public class Figurinha
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantJ, quantM, i, j, N1 = 0, N2 = 0, N = 0;
        boolean repetidas = false;
        
        quantJ = scan.nextInt();
        quantM = scan.nextInt();
        
        int vetJ[] = new int[quantJ];
        int vetM[] = new int[quantM];
        
        for(i=0; i<quantJ; i++)
        {
            vetJ[i] = scan.nextInt();
        }
        
        for(i=0; i<quantM; i++)
        {
            vetM[i] = scan.nextInt();
        }
        
        for(i=0; i<quantJ; i++)
        {
            repetidas = false;
            for(j=0; j<quantM; j++)
            {
                if(vetJ[i] == vetM[j])
                {
                    repetidas = true;
                }
                
            }
            
            if(repetidas == false)
            {
                N1+=1;
                if(i<quantJ-1)
                {
                    if(vetJ[i] == vetJ[i+1])
                    {
                        N1-=1;    
                    }
                }
            }
        }
        
        
        for(i=0; i<quantM; i++)
        {
            repetidas = false;
            for(j=0; j<quantJ; j++)
            {
                if(vetM[i] == vetJ[j])
                {
                    repetidas = true;
                }
            }
            
            if(repetidas == false)
            {
                N2+=1;
                if(i<quantM-1)
                {
                    if(vetM[i] == vetM[i+1])
                    {
                        N2-=1;    
                    }
                }
            }
        }
        
        

        if(N1 >= N2)
        {
            N = N2;
        }
        else
        {
            N = N1;
        }
        
        System.out.println(N);
        
    }
}