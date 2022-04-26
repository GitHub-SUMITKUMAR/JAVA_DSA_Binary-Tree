import java.util.Scanner;
class binarytree{
    int arr[];
    int lastusedindex;
    binarytree(int size){
        arr=new int[size+1];
    }
    public void insert(int data){
        if(lastusedindex==arr.length-1){
            System.out.println("Array Is Full");
        }
        else{
            arr[++lastusedindex]=data;
        }
    }
    public void traverse(int index){
        if(index>lastusedindex){
            return;
        }
        else{
            System.out.print(arr[index]+" ");
            traverse(2*index);
            System.out.print(arr[index]+" ");
            traverse(2*index+1);
        }
    }
    public void delete(int index){
        arr[index]=-1;
    }
    public void search(int val){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of Tree");
        int n=sc.nextInt();
        binarytree obj=new binarytree(n);
        for (int i=0;i<n;i++){
            System.out.println("Enter The Data for "+(i+1)+" node");
            obj.insert(sc.nextInt());
        }
        obj.traverse(2);
    }
}
