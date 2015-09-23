/**
 * Created by tusizi on 2015/9/22.
 */
public class TextSearch {
    public static void main(String[] args) {
        int[] a = {2,3,5,7,9,12,18,20};
        int num = 18;
        System.out.println(binarySearch(a,num));
    }
    public static int  binarySearch(int[] a , int num){
        if(a.length == 0){
            return  -1;
        }
        int startPos = 0;
        int lastPos = a.length-1;
        int m = (startPos+lastPos)/2;
        while(startPos<=lastPos){//折半查找的循环条件
            if(a[m]==num){
                return m;
            } if(a[m]<num){
                startPos = m+1;
            }if(a[m]>num){
                lastPos = m-1;
            }
            m = (startPos + lastPos)/2;
        }
        return  -1;
    }

}


