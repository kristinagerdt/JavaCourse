package Search;

public class BinarySearch {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        Integer val = binarySearch(arr, 7);
        System.out.println(val);
    }

    public static Integer binarySearch(Integer[] arr, Integer value){

        int left = 0;
        int right = arr.length;

        while(true){
            int mid = left + (right - left) / 2;

            if (arr[mid].equals(value)){
                return mid;
            }
            if (arr[mid] > value){
                right = mid;
            }
            else{
                left = mid;
            }
        }

    }
}
