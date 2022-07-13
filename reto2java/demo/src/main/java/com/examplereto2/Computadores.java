package com.examplereto2;

public class Computadores {
    //Atributos:
    protected final static char ConsumoW = 'F';
    protected final static Double  PRECIO_BASE
        
    }

    //Construtor

    public Computadores() {
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.ConsumoW = CONSUMO_W;
        //this(PRECIO_BASE, PESO_BASE, CONSUMO_W; // Llamma al constructor de la misma clase
    }
    public Computadores(Double precioBase, Integer peso) {

    }
    public Computadores(Double precioBase, Integer peso, char ConsumoW) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;

    }
    //Metodos
    public Double calcularPrecio(){
        Double adicion = 0.0;
        switch(ConsumoW){
            class= 'A':
                adicion +=100.0;
                break;
            case 'B':
                adicion +=80.0;
                break;
            case 'C':
                adicion +=60.0;
                break;
            case 'D':
                adicion +=50.0;
                break;
            case 'E':
                adicion +=30.0;
                break;
            case 'F':
                adicion +=10.0;
                break;
        }
        if (peso >= 0 && peso <19) {
            adicion +=10.0;
        }else if(peso >= 20 && peso < 49){
            adicion +=50.0;
        }else if(peso >= 50 && peso <= 79){
            adicion +=80;
        }else if(peso >=80){
            adicion +=100.0;
        }
        return precioBase + adicion;
    }
}

