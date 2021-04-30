/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros;

/**
 *
 * @author Forsaken
 */
public class Operaciones 
{
    //1.  Abstraccion - Definición de los atributos
    private int Num1;
    private int Num2;
    private int Res;
    
    //2. Polimorfismo - basado en metodos constructor
    public Operaciones ()
    {
    }        
    public Operaciones(int n1, int n2)
    {
        this.Num1 = n1;
        this.Num2 = n2;
        this.Res = 0;
        
    }         
    
    //3. Encapsulamiento
    // Get = Obtener
    public int getNum1()
    {
        return this.Num1;
    }        
    // Set == Colocar el valor
    public void setNum1(int n)
    {
           this.Num1 = n;
    }        
    
    // 4. metodos 
     /**
     * @return Retorna la suma de los dos operandos, no es necesario enviar parametros
     */
    public int Sumar()
    {
        this.Res =  this.Num1 + this.getNum2();
        return this.getRes();
    }        

    /**
     * @return the Num2
     */
    public int getNum2() {
        return Num2;
    }

    /**
     * @param Num2 the Num2 to set
     */
    public void setNum2(int Num2) {
        this.Num2 = Num2;
    }

    /**
     * @return the Res
     */
    public int getRes() {
        return Res;
    }
}
