import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);


        try {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        }
        catch(Exception e){
            System.out.println("Erro:"+ e.getMessage());
        }
        finally{
            scanner.close();
        }
    }

    public static void verificarNumeroConta (String numeroConta) throws IllegalArgumentException{

        if(numeroConta.length() != 8){
            throw new IllegalArgumentException("Numero de conta invalido. Digite Exatamente 8 caracteres.");
        }
    }
}



