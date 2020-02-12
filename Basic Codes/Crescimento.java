public class Crescimento
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, contador;
        double porcentagemA, porcentagemB, populacaoA, populacaoB;
        
        i = 0;
        quantidade = scan.nextInt();
        
        while(i < quantidade)
        {
            populacaoA = scan.nextInt();
            populacaoB = scan.nextInt();
            porcentagemA = scan.nextDouble();
            porcentagemB = scan.nextDouble();
            contador = 0;
            
            while(populacaoB > populacaoA)
            {
                populacaoB += (populacaoB* porcentagemB)/100;
                populacaoA += (populacaoA * porcentagemA)/100;
                contador++;
            }
            
            if(contador <= 100)
            {
                System.out.println(contador + " anos.");
            }
            else
            {
                System.out.println("Mais de 1 seculo.");
            }
            
            i++;
        }
    }
}