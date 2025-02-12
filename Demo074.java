class SortArray {
    void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = 0;
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }

                
            }
        }
        for(int j = 0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
public class Demo074 {
    public static void main(String[] args) {
        SortArray s1= new SortArray();
        int[] arr = {10,3,7,3,8,2,9};
        s1.sort(arr);
    }
}