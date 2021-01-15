import java.util.*;

public class sort {
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    swap(arr,j+1,j);
                }
            }

        }
    }
   
    public static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                swap(arr,i,min);
            }
        }
    }
    public static void insertionSort(int[] arr)
    {
            for(int i=1;i<arr.length;i++)
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(arr[j+1]<arr[j])
                    {
                        swap(arr,j+1,j);
                    }
                }
            }
    }
    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
    int i=0;
    int j=0;
    int k=0;
    int[] ans=new int[a.length+b.length];

        while(i<a.length &&j<b.length)
        {
            if(a[i]<b[j])
            {
                ans[k]=a[i];
                i++;
                k++;

            }
            else{
                ans[k]=b[j];
                j++;
                k++;
                }
        }
        while(i<a.length)
        {
            ans[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length)
        {
            ans[k]=b[j];
            j++;
            k++;
        }
        return ans;
        
    
    }
    
    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] bans = new int[1];
            bans[0] = arr[lo];
            return bans;
        }
        int mid = (lo + hi) / 2;
        int[] lsa = mergeSort(arr, lo, mid);
        int[] rsa = mergeSort(arr, mid + 1, hi);
        int[] ans = mergeTwoSortedArrays(lsa, rsa);
        return ans;
    }
    public static void partition (int[] arr,int pivot)
{
    int i=0;
    int j=0;
    while(i<arr.length)
    {
        if(arr[i]<=pivot)
        {
            swap(arr,i,j);
            i++;
            j++;
        }
        else
        i++;
    }
}

public static void  zeroOne(int[] arr)
{
    int i=0,j=0;
    while(i<arr.length)
    {
        if(arr[i]==0)
        {
            swap(arr,i,j);
            i++;
            j++;
        }
        else{
            i++;
        }
    }

}

public static void sort012(int[] arr)
{
    int j=0;
    int i=0;
    int k=arr.length-1;

    while(i<=k)
    {
        if(arr[i]==0)
        {
            swap(arr,i,j);
            i++;
            j++;
        }
        else if(arr[i]==1)
        {
            i++;
        }
        else
        {
            swap(arr,i,k);
            k--;
        }
    }


}
public static void targetSumPair(int[] arr, int target) {
    Arrays.sort(arr);
    int left = 0, right = arr.length - 1;
    while (left < right) {
        if (arr[left] + arr[right] < target) {
            left++;
        } else if (arr[left] + arr[right] == target) {
            System.out.println(arr[left] + ", " + arr[right]);
            left++;
            right--;
        } else {
            right--;
        }
    }
}
    public static void main(String[] args) {
        int[] arr={20,30,10,40,6,23};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr); 
        //for(int i=0;i<arr.length;i++)
        //{
        //    System.out.print(arr[i]+" ");
        //}
        // int[] a={10,60,70,90};
        // int[] b={20,30,100};
        // int [] ans=mergeTwoSortedArrays(a, b);
        //int[] ans=mergeSort(arr, 0, arr.length-1);
        // for(int i=0;i<ans.length;i++)
        // {
        //     System.out.print(ans[i]+" ");
        // }
       // partition(arr, 30);
         int[] arr1={0,1,1,0,0,1,1,0,1};
         zeroOne(arr1);
         for(int i=0;i<arr1.length;i++)
         {
            System.out.print(arr1[i]+" ");
         }
    }
}
