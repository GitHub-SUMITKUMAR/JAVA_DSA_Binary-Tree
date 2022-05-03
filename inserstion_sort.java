package com.company;
import java.util.Scanner;

public class insertionsort {
    int arr[];
    insertionsort(int size){
        arr=new int[size];
    }
    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public void sortass(){
        int key,t;
        for (int i = 1; i < arr.length; i++) {
            key=arr[i];
            for (int j = i-1; j >=0 ; j--) {
                if(key<arr[j]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public void sortdes(){
        int key,t;
        for (int i = 1; i < arr.length; i++) {
            key=arr[i];
            for (int j = i-1; j >=0 ; j--) {
                if(key>arr[j]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        insertionsort obj=new insertionsort(sc.nextInt());
        for (int i = 0; i <obj.arr.length ; i++) {
            obj.arr[i]= sc.nextInt();
        }
        obj.display();
        obj.sortass();
        obj.display();
        obj.sortdes();
        obj.display();
    }
}
