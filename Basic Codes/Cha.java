public class Cha
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int cha;
        int resposta1;
        int resposta2;
        int resposta3;
        int resposta4;
        int resposta5;
        int pontos=0;
        
        cha = scan.nextInt();
        resposta1 = scan.nextInt();
        resposta2 = scan.nextInt();
        resposta3 = scan.nextInt();
        resposta4 = scan.nextInt();
        resposta5 = scan.nextInt();

        if(cha == resposta1)
        {
            pontos = pontos + 1;
        }
        if(cha == resposta2)
        {
            pontos = pontos + 1;
        }
        if(cha == resposta3)
        {
            pontos = pontos + 1;
        }
        if(cha == resposta4)
        {
            pontos = pontos + 1;
        }
        if(cha == resposta5)
        {
            pontos = pontos + 1;
        }
        
        System.out.println(pontos);
    
    }
}