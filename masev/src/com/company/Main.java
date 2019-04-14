package com.company;

public class Main {

    public static void main(String[] args) {
	int k = 0;
	int mass[];
	mass = new int[10];
	    for (int i=0; i<mass.length; i++){
	        mass[i] = (int)(random()*100)-200;
	        if(mass[i]<0){
	            k++;
            }
        }
        System.out.println(k);
    }
}
