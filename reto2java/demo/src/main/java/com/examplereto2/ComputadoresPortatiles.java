package com.examplereto2;

public class ComputadoresPortatiles extends Computadores {
    private final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG;
    //Construtor
    public ComputadoresPortatiles() {
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W, PULGADAS_BASE, false);
    }
    //Construtor
    public ComputadoresPortatiles(Double precioBase, Integer peso){
        this(precioBase, peso, CONSUMO_W, PULGADAS_BASE,  false);
    }
    //Construtor
    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }
    //Metodos
    public Double calcularPrecio(){
        Double precioCP = super.calcularPrecio();
        if (pulgadas > 40){
            precioCP += precioBase*0.3;
        }
        if(camaraITG){
            precioCP += 50.0;
        }
        return precioCP;
    }
}