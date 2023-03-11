package com.dio.baseCamp;

public class Mensagem {
    
    // Resolvido com If/else
    /*public static void obterMensagem(int hora){
        if(hora >= 5 && hora <= 12){
            mensagemBomDia();
        }else if(hora > 12 && hora <=17){
            mensagemBoaTarde();
        }else if(hora >= 18 && hora <= 23){
            mensagemBoaNoite();
        }else if(hora >= 0 && hora <= 4) {
            mensagemBoaNoite();
        }else{
            System.err.println("Hora Inválida");
        }   
    }*/

    public static void obterMensagem(int hora){
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break; 
            case 13:  
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;  
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: 
                mensagemBoaNoite(); 
                break;
            default:
                System.out.println("Hora inválida");
                break;
        }   
    }

    private static void mensagemBomDia(){
        System.err.println("Bom dia");
    }

    private static void mensagemBoaTarde(){
        System.err.println("Boa Tarde");
    }

    private static void mensagemBoaNoite(){
        System.err.println("Boa Noite");
    }

}
