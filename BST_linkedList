class node{
    int data;
    node left;
    node right;
    node(int val){
        data=val;
    }
}
public class bst_lls {
    node root;
    public void insert(node root,int data){
        node nnd=new node(data);
        if(root==null){
            this.root=nnd;
        }
        else if(data< root.data){
            if(root.left!=null){
                insert(root.left,data);
            }
            else{
                root.left=nnd;
            }
        }
        else if(data> root.data){
            if(root.right!=null){
                insert(root.right,data);
            }
            else{
                root.right=nnd;
            }
        }
    }
    public void insert(int data){
        node nnd=new node(data);
        if(root==null){
            this.root=nnd;
            return;
        }
        node curr=root;
        node par=null;
        while (true){
            if(data< curr.data){
                par=curr;
                if(curr.left!=null){
                    curr=curr.left;
                }
                else{
                    par.left=nnd;
                    return;
                }
            }
            else if(data> curr.data){
                par=curr;
                if(curr.right!=null){
                    curr=curr.right;
                }
                else{
                    par.right=nnd;
                    return;
                }
            }
        }
    }
    public void traverse(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        traverse(root.left);
        traverse(root.right);
    }
    public node search(node root,int data){
        if(root==null){
            return null;
        }
        if(root.data==data){
            return root;
        }
        if(data< root.data){
            return search(root.left,data);
        }
        else if(data> root.data){
            return search(root.right,data);
        }
        return null;
    }
    public int count(node root){
        if(root==null){
            return 0;
        }
        int res=1;
        res=res+count(root.left)+count(root.right);
        return res;
    }

    public boolean checkbst(node root){
        if (root == null)
            return true;
        if (root.left != null && root.left.data > root.data)
            return false;
        if (root.right != null && root.right.data < root.data)
            return false;
        if (!checkbst(root.left) || !checkbst(root.right))
            return false;
        return true;
    }


    public node delete(node root,int data){
        if(data<root.data)
            root.left=delete(root.left,data);
        else if(data>root.data)
            root.right=delete(root.right,data);
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                root.data=successor(root.right);
            }
        }
        return root;
    }
    public int successor(node root){
        while (root.left!=null){
            root=root.left;
        }
        int min=root.data;
        delete(this.root,min);
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bst_lls obj=new bst_lls();
        obj.insert(5);
        obj.insert(3);
        obj.insert(7);
        obj.insert(2);
        obj.insert(4);
        obj.insert(6);
//        obj.insert(9);
//        obj.traverse(obj.root);
        System.out.println(obj.search(obj.root,2));
        System.out.println(obj.count(obj.root));
    }
}
