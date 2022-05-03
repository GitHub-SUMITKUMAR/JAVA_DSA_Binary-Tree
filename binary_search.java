class BinarySearch {  
    static int binarySearch(int a[], int beg, int end, int val)    
    {    
        int mid;    
        if(end >= beg)     
        {  
            mid = (beg + end)/2;    
            if(a[mid] == val)    
            {    
                return mid+1;    
            }    
              
            else if(a[mid] < val)     
            {  
                return binarySearch(a, mid+1, end, val);    
            }    
             
            else    
            {  
                return binarySearch(a, beg, mid-1, val);    
            }    
        }    
        return -1;    
    }   
    public static void main(String args[]) {  
        int a[] = {8, 10, 22, 27, 37, 44, 49, 55, 69};  
        int val = 37;   
        int n = a.length;   
        int res = binarySearch(a, 0, n-1, val);   
        System.out.print("The elements of the array are: ");  
        for (int i = 0; i < n; i++)  
        {  
            System.out.print(a[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Element to be searched is: " + val);  
        if (res == -1)  
        System.out.println("Element is not present in the array");  
        else  
        System.out.println("Element is present at " + res + " position of array");  
    }  
    }  
