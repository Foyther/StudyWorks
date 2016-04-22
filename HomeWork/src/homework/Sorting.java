/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.ArrayList;

/**
 *
 * @author Nurislam
 */
public class Sorting {
    int[] array;
    int[] sortedArray;
    
    public Sorting(int[] array){
        this.array = array;
        this.sortedArray = array.clone();
    }
    
    public void swap(int i, int j){
        if(i != j){
        int c = sortedArray[i];
        sortedArray[i] = sortedArray[j];
        sortedArray[j] = c;
        }
    }
    
    public void bubbleSort(){
        for(int i = 0; i < sortedArray.length-1; i++){
            for(int j = 0; j < sortedArray.length-i-1; j++){
                if(sortedArray[j] > sortedArray[j+1]){
                    this.swap(j,j+1);
                }
            }
        }
    }
    
    public int minIndex(int i, int j){
        if(i != j){
        int min = sortedArray[i];
        int index = i;
        while(i <= j){
            if(min > sortedArray[i]){
             min = sortedArray[i];
             index = i;
            }
            i++;
        } return index;
        }
        return i;
    }
    
    public void selectionSort(){
        for(int i = 0; i < sortedArray.length-1; i++){
            this.swap(this.minIndex(i, sortedArray.length-1), i);
        }
    }
    
    public void insertSort(){
        for(int i = 0; i < sortedArray.length; i++){
            for(int j = 1; j < sortedArray.length; j++){
                int k = 0;
                w: while(k < j){
                    if(sortedArray[k] > sortedArray[j]){
                        this.swap(k,j);
                        break w;
                    }
                    k++;
                }
            }
        }
    }
    
    
    public void mergeSort(){
        int k = sortedArray.length;
        int c = 1;
        while(k%2!=0){
            k/=2;
            c++;
        }
        for(int i = 0; i < c; i++){
            for(int j = 0; j < sortedArray.length-1; j+=2*(int)Math.pow(2, i)){
                int left = j,right = j+(int)Math.pow(2, i);     //write left and right num
                ArrayList temp = new ArrayList();
                while(left != j+(int)Math.pow(2, i)  && right != j+2*(int)Math.pow(2, i)){
                    if(sortedArray[left] < sortedArray[right]){
                        temp.add(sortedArray[left]);
                        left++;
                    } else{
                        temp.add(sortedArray[right]);
                        right++;
                        }
                }
                if(left == j+(int)Math.pow(2, i)){
                        while(right != j + 2*(int)Math.pow(2, i)){
                            temp.add(sortedArray[right]);
                            right++;
                        }
                    }
                    else{
                        if(right == j + 2*(int)Math.pow(2, i)){
                            while(left == j+(int)Math.pow(2, i)){
                                temp.add(sortedArray[left]);
                                left++;
                            }
                        }
                    }
                for(int l = j; l < j+2*(int)Math.pow(2, i); l++){
                    if(j == 0){
                       sortedArray[l] = (int) temp.get(l);
                    }
                    else{
                    sortedArray[l] = (int) temp.get(l%(int)Math.pow(2, i));
                    }
                }
            }
        }
        }
    
    
    @Override
    public String toString(){
        String s = "";
        for(int i: sortedArray){
            s+= " " + i;
        }
        sortedArray = array.clone();
        return s;
    }
    
}
