package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor){
        this.valor = valor;
    }

    public InteiroPositivo(String valor){
        this.valor = Integer.parseInt(valor);
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void getMessage(int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public static boolean ehPrimo(int valor) {
        for (int j = 2; j < valor; j++) {
            if (valor % j == 0)
                return false;   
        }
        return true;
    }
}
