public class DiaSeguinte
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int dia, mes, ano;
        
        dia = scan.nextInt();
        mes = scan.nextInt();
        ano = scan.nextInt();
        
        if((mes == 1 && dia < 31) || (mes == 2 && bissexto(ano) == true && dia < 29 ) || (mes == 2 && bissexto(ano) == false && dia < 28) || (mes == 3 && dia < 31) || (mes == 4 && dia < 30) || (mes == 5 && dia < 31) || (mes == 6 && dia < 30) || (mes == 7 && dia < 31) || (mes == 8 && dia < 31) || (mes == 9 && dia < 30) || (mes == 10 && dia < 31) || (mes == 11 && dia < 30) || (mes == 12 && dia < 31))
        {
            dia = dia+1;
        }
        else if (mes != 12)
        {
            dia = 1;
            mes = mes + 1;
        }
        else
        {
            dia = 1;
            mes = 1;
            ano = ano + 1;
        }
        
        System.out.println(dia + " " + mes + " " + ano);

    }
    
    public static boolean bissexto(int anob)
    {
        if(anob%400 == 0 || (anob%4 == 0  && anob%100 != 0))
        {
            return(true);
        }
        else
        {
            return(false);   
        }
    }
}