class Solution {
    public int[] sortArray(int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }
    public void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int x=0;x<temp.length;x++){
            arr[low+x]=temp[x];
        }
    }
}