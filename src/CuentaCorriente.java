public class CuentaCorriente {
    private double saldo;

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;


    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double dineroEntrante){
        this.saldo += dineroEntrante;
        System.out.println("Saldo actualizado");

    }

    public  void egreso(double dineroSaliente){
        if(this.saldo< dineroSaliente){
            System.out.println("Saldo Insuficiente para el retiro");
        }else {
            this.saldo-=dineroSaliente;
            System.out.println("Dinero retirado con exito");
        }
    }

    public void reintegro(double cantidadReintegro){
        this.saldo+=cantidadReintegro;
        System.out.println("La cantidad de "+cantidadReintegro+" ha sido reintegrada con exito, por favor revise su saldo");
    }

    public void transferencia(CuentaCorriente cuentaATransferir, double cantidad){
        if(this.saldo>=cantidad){
            cuentaATransferir.setSaldo(cuentaATransferir.getSaldo()+cantidad);
            this.saldo-=cantidad;
        }else{
            System.out.println("Fondos insuficientes para realizar la transferencia");
        }
    }

}
