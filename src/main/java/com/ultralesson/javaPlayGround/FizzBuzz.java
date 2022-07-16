package com.ultralesson.javaPlayGround;

import java.util.ArrayList;

public class FizzBuzz {
    public ArrayList fizzBuzz(int n){
        ArrayList a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                if(i%5==0){
                    a.add("FizzBuzz");
                }else{
                    a.add("Fizz");
                }
            }else if(i%5==0){
                a.add("Buzz");
            }
            else{
                a.add(i);
            }
        }
        return a;
    }
    public static void main(String[] args) {
        FizzBuzz fb=new FizzBuzz();
        System.out.println(fb.fizzBuzz(16));
    }
}
