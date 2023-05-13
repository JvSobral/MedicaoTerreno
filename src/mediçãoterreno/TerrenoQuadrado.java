/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediçãoterreno;

import java.util.Scanner;

/**
 *
 * @author 296775
 */
public class TerrenoQuadrado {
    float comprimento,largura,area,perimetro;
    
    void receberLados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o comprimento :");
        comprimento = sc.nextFloat();
        largura=comprimento;
    }
    void calcularArea(){
        area=comprimento*largura;
        
    }
    void calcularPerimetro(){
        perimetro=2*(comprimento+largura);
        
    }
    void exibirResultados () {
        System.out.println("A Área do terreno quadrado é: "+area);
        System.out.println("O perimetro do terreno quadrado é: "+perimetro);
    }
    
    
}
