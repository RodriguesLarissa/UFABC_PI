public class Bissexto
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int ano;
        
        ano = scan.nextInt();
        
        if(ano%400 == 0)
        {
            System.out.println("ANO BISSEXTO");
        }
        else if(ano%4 == 0 && ano%100 != 0)
        {
            System.out.println("ANO BISSEXTO");
        }
        else
        {
            System.out.println("ANO NAO BISSEXTO");
        }
    }
}