/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author alumno
 */
public class Calculo {
    private Integer num1;
    private Integer num2;
    private Integer num3;
    private Double rst;

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public void setNum3(Integer num3) {
        this.num3 = num3;
    }

    public Double getRst() {
        return rst;
    }
    public void suma (Double psuma) {
         rst = num1.doubleValue() + num2.doubleValue() + num3.doubleValue();
    }
    public void resta (Double presta){
            rst = num1.doubleValue() - num2.doubleValue() - num3.doubleValue();
    }
    public void dividir (Double pdividir){
        rst = num1.doubleValue() / num2.doubleValue() / num3.doubleValue();
    }
    public void multiplicar (Double pmultiplicar){
        rst = num1.doubleValue() * num2.doubleValue() * num3.doubleValue();
    }
}