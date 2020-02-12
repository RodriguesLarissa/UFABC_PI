public class Jogo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int horaInicial;
        int minutoInicial;
        int horaFinal;
        int minutoFinal;
        int horaTotal;
        int minutoTotal;
        int conta;
        
        horaInicial = scan.nextInt();
        minutoInicial = scan.nextInt();
        horaFinal = scan.nextInt();
        minutoFinal = scan.nextInt();
        
        if(horaFinal < horaInicial && minutoFinal > minutoInicial)
        {
            conta = ((horaFinal - horaInicial + 24)*60) + (minutoFinal - minutoInicial);
            horaTotal = (conta / 60);
            minutoTotal = (conta%60);
        }
        else if(horaFinal < horaInicial && minutoFinal < minutoInicial)
        {
            conta = ((horaFinal - horaInicial + 24)*60) + (minutoFinal - minutoInicial+60);
            horaTotal = (conta / 60);
            minutoTotal = (conta%60);
        }
        else if(horaFinal > horaInicial && minutoFinal < minutoInicial)
        {
            conta = ((horaFinal - horaInicial)*60) + (minutoFinal - minutoInicial+60);
            horaTotal = (conta / 60);
            minutoTotal = (conta%60);
        }
        else
        {
            conta = ((horaFinal - horaInicial)*60) + (minutoFinal - minutoInicial);
            horaTotal = (conta / 60);
            minutoTotal = (conta%60);
        }
       
        System.out.println("DUROU " + horaTotal + " HORA(S) E " + minutoTotal + " MINUTO(S)");
        
    }
}