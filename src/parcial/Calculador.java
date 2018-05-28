/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiantes
 */
public class Calculador implements Icalculador{
    
    public Punto puntoUno = new Punto();
    public Punto puntoDos = new Punto();

    @Override
    public double calcularArea() {
        
        double rectangulo = (puntoDos.getX() - puntoUno.getX()*puntoUno.getY());
        double triangulo = ((puntoDos.getY() - puntoUno.getY())*(puntoDos.getX()-puntoUno.getY()))/2;
        return triangulo + rectangulo ;
    }

    @Override
    public double calcularDistancia() {
       double dx =  Math.pow((puntoDos.getX() - puntoUno.getX()),2);
       double dy =  Math.pow((puntoDos.getY() - puntoUno.getY()),2);
       return Math.sqrt(dx + dy);
        
    }

    @Override
    public double calcularPendiente() {
        double dx = (puntoDos.getX() - puntoUno.getX());
        double dy = (puntoDos.getY() - puntoUno.getY());
        return dy/dx;
        
    }

}
