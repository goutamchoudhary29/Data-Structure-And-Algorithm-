
//You are given n activiteis with their start and end times.Select the maximum number of activuties that can be 
//performed by a single person,assuming that a person can only work on a single activity at a time .Activities are sorted according to end time
package Greedy_approoches;

import java.util.*;
import java.util.Comparator;

public class workque {
    public static void main(String[] args) {
        int start []={1,3,0,5,8,5};
        int end[]={ 2,4,6,7,9,9};

        //sorting
        //this part is for not give to sorting of time in array to sort the array
        int activiteis[][] =new int[start.length][3];
        for(int i=0 ;i<start.length;i++){
            activiteis[i][0]=i;
            activiteis[i][1]=start[i];
            activiteis[i][2]=end[i];
        }

        //lambda function -> shortform
        Arrays.sort(activiteis,Comparator.comparingDouble(o->o[2]));

        //end time basis sorted
        int maxAct =0;
        ArrayList<Integer> ans=new ArrayList<>();

        //1st activity
        maxAct =1;
        ans.add(activiteis[0][0]);
        int lastEnd =activiteis[0][2];
        for(int i=1;i<end.length;i++){
            if(activiteis[i][1]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(activiteis[i][0]);
                lastEnd =activiteis[i][2];
            }
        }
        System.out.println("max Activities= "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
