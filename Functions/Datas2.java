public class Datas2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int dia, mes, ano;

        dia = scan.nextInt();
        mes = scan.nextInt();
        ano = scan.nextInt();
        
        
        if(dia > 31 || dia < 1 || mes > 12 || mes < 1 || ano < 1582 || (bissexto(ano) == false && mes == 2 && dia == 29) || (mes == 2 && dia > 29) || (mes == 4 && dia> 30) || (mes == 9 && dia > 30) || (mes == 6 && dia>30) || (mes == 11 && dia>30))
        {
            System.out.println("DATA INVALIDA");
        }
        else
        {
            System.out.println("DATA VALIDA");
        }
    }
    
    public static boolean bissexto(int anob)
    {
        if(anob%400 == 0 || (anob%4 == 0 && anob%100 != 0))
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
}