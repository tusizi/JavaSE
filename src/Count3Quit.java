/**
 * Created by tusizi on 2015/9/21.
 */
public class Count3Quit {
    public static void main(String[] args) {
        boolean[] arr = new boolean[500];
        for(int i = 0;i<arr.length;i++){
            arr[i] = true;
        }
        int leftCount = arr.length;//现在圈里剩下的人的数量
        int countNum = 0;//定义数数的计数器
        int index = 0;//从第0个人开始数
        while(leftCount>1){
            if(arr[index] == true){
                countNum++;
            }
            if(countNum == 3){
                countNum = 0;
                arr[index] = false;
                leftCount--;
                //arr.length= arr.length-1;
            }
            index++;
            if(index == arr.length){
                index = 0;
            }
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i] ==true){
                System.out.println(i);
            }
        }
    }
}
