package com.company;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.SortedMap;

import java.util.Scanner;
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
    }
}
class binarytree{
    node root;
    public node insert(int data){
        node temp=new node(data);
        if(root==null){
            root=temp;
        }
        else if(data<0){
            return null;
        }
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter left for "+data);
            temp.left=insert(sc.nextInt());
            System.out.println("Enter Right For "+data);
            temp.right=insert(sc.nextInt());
        return temp;
    }
    public node insert(node temp){
        if(temp.data<0){
            return null;
        }
        else if(root==null){
            root=temp;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Left For "+temp.data);
        temp.left=insert(new node(sc.nextInt()));
        System.out.println("Enter Right For "+temp.data);
        temp.right=insert(new node(sc.nextInt()));
        return temp;
    }
    public void preorder(node temp){
        if(temp==null){
            return;
        }
        System.out.println(temp.data);
        preorder(temp.left);
        preorder(temp.right);
    }
    public void postorder(node temp){
        if(temp==null){
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.println(temp.data);
    }
    public void inorder(node temp){
        if(temp==null){
            return;
        }
        inorder(temp.left);
        System.out.println(temp.data);
        inorder(temp.right);
    }
    public node search(node root,int data){
        node temp=root;

    }
    public void delete(node root,int data) {

    }
    public static void main(String[] args) {
        binarytree obj=new binarytree();
        obj.insert(30);
        obj.inorder(obj.root);
        obj.delete(obj.root,);
    }
}
 */
/*
public class Tree_by_lls {
    node root;
    static class node{
        int data;
        node left;
        node right;
        node(int val){
            data=val;
        }
    }
    public node insert(int data){
        node nnd=new node(data);
        if(data<0){
            return null;
        }
        if(this.root==null){
            root=nnd;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Left For "+ data);
        nnd.left=insert(sc.nextInt());
        System.out.println("Enter Rigth For "+data);
        nnd.right=insert(sc.nextInt());
        return nnd;
    }
    public void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public void print2DUtil(node root, int space)
    {
        if (root == null)
            return;
        space += 1;
        print2DUtil(root.right, space);
        System.out.print("\n");
        for (int i = 0; i < space; i++)
            System.out.print(" ");
        System.out.println(root.data);
        print2DUtil(root.left, space);
    }
    public node search(node root,int data){
        if(root==null){
            return null;
        }
        if(root.data==data){
            return root;
        }
        node res=search(root.left,data);
        if(res!=null){
            return res;
        }
        node res2=search(root.right,data);
        if(res2!=null)
            return res2;
        return null;
    }
    public node deepest(node root){
        if(root.right==null){
            return null;
        }
        root.right=deepest(root.right);
        return root;
    }
    public void delete(node root,int data){
        node temp=search(root,data);
        node t=root;
        while (t.right!=null){
            t=t.right;
        }
        temp.data=t.data;
        deepest(root);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tree_by_lls obj=new Tree_by_lls();
        System.out.println("Enter The Root Node ");
        obj.insert(sc.nextInt());
       obj.inorder(obj.root);
//        System.out.println(obj.search(obj.root,4).data);
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println(obj.search(obj.root,8).data);
        obj.delete(obj.root,2);
        System.out.println();
        obj.inorder(obj.root);
    }
}
