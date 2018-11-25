/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvilatuña.controlador;

import com.jvilatuña.modelo.Celular;
import com.jvilatuña.modelo.Television;
import javax.swing.JOptionPane;

/**
 *
 * @author UseR
 */
public class Coordinador {
        public String menuCelular(){
        String op=JOptionPane.showInputDialog("Opciones para celular\n"
                + "1.-Asignar valores\n"
                + "2.-Retorna valores\n");
        return op;
    }
        
    public String ingresoCelular(){
        String op=JOptionPane.showInputDialog("Opciones para celular\n"
                + "1.-Asignar marca\n"
                + "2.-Asignar modelo\n"
                + "3.-Asignar numero de telefono\n"
                + "4.-Asignar operadora\n"
                + "5.-Asingar precio");
        return op;
    }
    
    public String retornoCelular(){
        String op=JOptionPane.showInputDialog("Opciones para celular\n"
                + "1.-Retornar marca\n"
                + "2.-Retornar modelo\n"
                + "3.-Retornar numero de telefono\n"
                + "4.-Retornar operadora\n"
                + "5.-Retornar precio");
        return op;
    }
    
    public String menuTelevision(){
        String op=JOptionPane.showInputDialog("Opciones para celular\n"
                + "1.-Asignar valores\n"
                + "2.-Retorna valores\n");
        return op;
    }
        
    public String ingresoTelevision(){
        String op=JOptionPane.showInputDialog("Opciones para avion\n"
                + "1.-Asignar marca\n"
                + "2.-Asignar modelo\n"
                + "3.-Asignar precio");
        return op;
    }
    
    public String retornoTelevision(){
        String op=JOptionPane.showInputDialog("Opciones para avion\n"
                + "1.-Retornar marca\n"
                + "2.-Retornar modelo\n"
                + "3.-Retornar precio");
        return op;
    }
    
    public String menuPm(){
        String op=JOptionPane.showInputDialog("Escoja una opción:\n"
                + "1.-Celular\n"
                + "2.-Televisión\n"
                + "3.-salir\n");
        return op;
    }
    
    public void menuPrincipal(){
        String op="";
        do{
            op=menuPm();
            switch(op){
                case "1":
                    menuPrincipalCelular();
                    break;
                case "2":
                    menuPrincipalTelevision();
                    break;
            }
            
        }while(!op.equals("3"));
    }
    
    public void menuPrincipalCelular(){
        String op="";
        do{
            op=menuCelular();
            switch(op){
                case "1":
                    menuIngresoCelular();
                    break;
                case "2":
                    menuRetornoCelular();
                    break;
            }
            
        }while(!op.equals("3"));
    }
    
    public void menuPrincipalTelevision(){
        String op="";
        do{
            op=menuTelevision();
            switch(op){
                case "1":
                    menuIngresoTelevision();
                    break;
                case "2":
                    menuRetornoTelevision();
                    break;
            }  
        }while(!op.equals("3"));
    }
    
    public void menuIngresoCelular(){
        Celular ob=new Celular();
        String op="";
        do{
            op=ingresoCelular();
            switch(op){
                case "1":
                    ob.setMarca(op);
                    break;
                case "2":
                    ob.setModelo(op);
                    break;
                case "3":
                    ob.setNumeroelefonico(0);
                    break;
                case "4":
                    ob.setOperadora(op);
                    break;
                case "5":
                    ob.setPrecio(op);
                    break;
            }  
        }while(!op.equals("6"));
    }
    
    public void menuRetornoCelular(){
        Celular ob=new Celular();
        String op="";
        do{
            op=retornoCelular();
            switch(op){
                case "1":
                    ob.getMarca();
                    break;
                case "2":
                    ob.getModelo();
                    break;
                case "3":
                    ob.getNumeroelefonico();
                    break;
                case "4":
                    ob.getOperadora();
                    break;
                case "5":
                    ob.getPrecio();
                    break;
            }  
        }while(!op.equals("6"));
    }
    
    public void menuIngresoTelevision(){
        Television ob=new Television();
        String op="";
        do{
            op=ingresoTelevision();
            switch(op){
                case "1":
                    ob.setMarca(op);
                    break;
                case "2":
                    ob.setModelo(op);
                    break;
                case "3":
                    ob.setPrecio(op);
                    break;
            }  
        }while(!op.equals("4"));
    }
    
    public void menuRetornoTelevision(){
        Television ob=new Television();
        String op="";
        do{
            op=retornoTelevision();
            switch(op){
                case "1":
                    ob.getMarca();
                    break;
                case "2":
                    ob.getModelo();
                    break;
                case "3":
                    ob.getPrecio();
                    break;
            }  
        }while(!op.equals("4"));
    }
}
