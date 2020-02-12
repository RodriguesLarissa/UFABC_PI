public class Pim
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numero, i;
        
        i = 1;
        numero = scan.nextInt();
        
        while(i <= (numero*4))
        {
            if(i%4 != 0)
            {
            System.out.print(i + " ");
            }
            else
            {
                System.out.println("PIM");
            }
            
            i++;
        }
    }
 }