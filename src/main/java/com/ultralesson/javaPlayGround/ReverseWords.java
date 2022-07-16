package com.ultralesson.javaPlayGround;

public class ReverseWords {
    public String reverse(String sentence){
        String reverseSentence="";
        int lastIndexOfWord=sentence.length();
        for(int i=sentence.length()-1;i>=0;i--){
            if(sentence.charAt(i)==' '){
                reverseSentence=reverseSentence.concat(sentence.substring(i+1,lastIndexOfWord));
                lastIndexOfWord=i;
                reverseSentence=reverseSentence.concat(" ");
            }
        }
        reverseSentence=reverseSentence.concat(sentence.substring(0,lastIndexOfWord));
        return reverseSentence;
    }

    public static void main(String[] args) {
        ReverseWords rw=new ReverseWords();
        System.out.println(rw.reverse("This is my second day of bootcamp"));
    }
}
