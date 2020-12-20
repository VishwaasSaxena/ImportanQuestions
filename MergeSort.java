public class MergeSort {
    public static void main(String[] args) {
        int arr[]={6,1,2,8,5};
        mergeSort(arr, 0, 4);
        for(int item:arr){
            System.out.print(item+ " ");
        }
        
        
    }

    public static void merge(int arr[],int l,int m, int r){
        int i,j,k;
        int n1=m-l+1;
        int n2=r-m;
        int temp[]=new int[n1];
        int temp2[]=new int[n2];
        for(i=0;i<n1;i++){
            temp[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            temp2[j]=arr[m+1+j];
        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(temp[i]<temp2[j]){
                arr[k]=temp[i];
                i++;
                k++;
            }else if(temp[i]>temp2[j]){
                arr[k]=temp2[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=temp[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=temp2[j];
            j++;
            k++;
        }

    }
    public static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    
}
