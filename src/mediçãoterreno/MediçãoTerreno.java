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
public class MediçãoTerreno {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop=true;
        while(loop){
            System.out.println("Entre com o tipo de terreno a ser medido"
                    + ":\n1)Quadrado\n2)Retangular\n3)Sair");
            int op=sc.nextInt();
            switch (op){
                case 1:TerrenoQuadrado tq = new TerrenoQuadrado();
                    tq.receberLados();
                    tq.calcularArea();
                    tq.calcularPerimetro();
                    tq.exibirResultados();
                break;
                
                case 2:TerrenoRetangular tr = new TerrenoRetangular();
                tr.receberLados();
                tr.calcularArea();
                tr.calcularPerimetro();
                tr.exibirResultados();
                break;
         
                case 3:
                default:System.out.println("Progama Encerrado! Volte Smpre :)");
                System.exit(0);
            }
            
        }

    }
    
}
