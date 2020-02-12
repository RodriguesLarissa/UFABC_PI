public class ConsoantesVogais
{
    public static void main(String[] args)
    {
        String letra;
        Scanner scan = new Scanner(System.in);
        
        
        letra = scan.next();
        
        if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U") || letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") )
        {
            System.out.println("vogal");
        }
        else
        {
            System.out.println("consoante");
        }
    }
}