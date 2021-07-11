package io.pragra.mavenlearning2;

public class PragraStringUtils{
   public static String getMeAJoke(){
    return "Learning java and Do python";
   }
    public static String Abbreviate(String str){
        return str.substring(0,3).concat("...");
    }
    public static String Abbreciation(String str,int len){
       if (len-3>str.length()){
           throw new IllegalArgumentException("Not Valid Length");
       }
        return "Learning java and Do python";
    }



}
