import java.io.*;


public class Contador {
    public static void main(String[] args) {
        try {
            //Leitura de dados eficiente usando a Lib IO.
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

            int numeroUm;
            int numeroDois;

            writer.write("Digite o numero um:");
            writer.flush();
            numeroUm = Integer.parseInt(reader.readLine());

            writer.write("Digite o numero dois:");
            writer.flush();
            numeroDois = Integer.parseInt(reader.readLine());
        try{
            contar(numeroUm, numeroDois);
        }catch (ParametrosInvalidosException exception){
            throw new ParametrosInvalidosException("Segundo número deve ser maior que o primeiro!");
        }

        writer.close();
        reader.close();
        }catch (IOException | ParametrosInvalidosException e){
            e.printStackTrace();
        }
    }


    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException("Segundo número deve ser maior que o primeiro!");
        } else {
            int contagem = numeroDois - numeroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println(i);
            }
        }
    }

}