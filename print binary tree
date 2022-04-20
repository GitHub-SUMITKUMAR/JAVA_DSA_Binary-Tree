import java.util.Scanner;

class Node {
        public int data;
        public Node left;
        public Node right;
        public Node parent;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }

    class BinarySearchTree {
        public static Node root;

        public BinarySearchTree() {
            this.root = null;
        }

        public Node minimum(Node x) {
            while(x.left != null)
                x = x.left;
            return x;
        }

        public void insert(Node n) {
            Node y = null;
            Node temp = this.root;
            while(temp != null) {
                y = temp;
                if(n.data < temp.data)
                    temp = temp.left;
                else
                    temp = temp.right;
            }
            n.parent = y;

            if(y == null) //newly added node is root
                this.root = n;
            else if(n.data < y.data)
                y.left = n;
            else
                y.right = n;
        }

        public void transplant(Node u, Node v) {
            if(u.parent == null) //u is root
                this.root = v;
            else if(u == u.parent.left) //u is left child
                u.parent.left = v;
            else //u is right child
                u.parent.right = v;

            if(v != null)
                v.parent = u.parent;
        }

        public void delete(Node z) {
            if(z.left == null) {
                transplant(z, z.right);
            }
            else if(z.right == null) {
                transplant(z, z.left);
            }
            else {
                Node y = minimum(z.right); //minimum element in right subtree
                if(y.parent != z) {
                    transplant(y, y.right);
                    y.right = z.right;
                    y.right.parent = y;
                }
                transplant(z, y);
                y.left = z.left;
                y.left.parent = y;
            }
        }

        public void inorder(Node n) {
            if(n != null) {
                inorder(n.left);
                System.out.println(n.data);
                inorder(n.right);
            }
        }

        public static void main(String[] args) {
            BinarySearchTree t = new BinarySearchTree();
            System.out.println("hello,user insert the value of binary tree from left to right");
            Scanner sc=new Scanner(System.in);

           BinarySearchTree tree =new BinarySearchTree();
           int i=0;
           while(i!=15){
               int a=sc.nextInt();
               Node b=new Node(a);
               tree.insert(b);
               i++;
           }

            tree.inorder(root);



        }
    }

