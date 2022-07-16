package com.ultralesson.javaPlayGround;

import java.util.ArrayList;

public class ScoresSorter {
    public ArrayList<Integer> sortScores(ArrayList<Integer> scores){
        for(int i=0;i<scores.size();i++){
            int minValue=scores.get(0),minIndex=0,lastIndex=scores.size()-i-1;
            for(int j=1;j<scores.size()-i;j++){
                if(scores.get(j)<=minValue){
                    minIndex=j;
                    minValue=scores.get(j);
                }
            }
            int temp= scores.get(lastIndex);
            scores.set(lastIndex, scores.get(minIndex));
            scores.set(minIndex,temp);
        }
        return scores;
    }

    public static void main(String[] args) {
        ScoresSorter ss=new ScoresSorter();
        ArrayList<Integer> scores=new ArrayList<>();
        scores.add(23);
        scores.add(43);
        scores.add(54);
        scores.add(8099);
        scores.add(15);
        ArrayList a=ss.sortScores(scores);
        System.out.println(a);


    }
}
