public class Gerente extends Empregado{
    private double salarioFixo;

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
    
    @Override
    public double calcularBonus(Departamento departamento){
        double bonus = 0;
        if(departamento.alcancouMeta()){
            bonus = salarioFixo * 0.2 + departamento.getValorAtingidoMeta() - departamento.getValorMeta() * 0.01;
        }
        return bonus;
    }
}
