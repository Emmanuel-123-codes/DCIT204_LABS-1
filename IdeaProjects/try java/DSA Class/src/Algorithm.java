public class Algorithm {
    public static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        int mid = (start+end)/2;



        while(start<=end){
            System.out.println("Mid:"+array[mid]);
            if(array[mid]==target){
                return mid;
            }else if(array[mid]< target){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }

    public static int linearSearch(int [] array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
        }

        return -1;
    }


}
