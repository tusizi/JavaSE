/**
 * Created by tusizi on 2015/9/21.
 */
public class Count3Quit2 {
    public static void main(String[] args) {
        KidCircle kc = new KidCircle(500);
        System.out.println(kc.count);
        int countNum = 0;
        Kid k = kc.first;
        while (kc.count>1){
            countNum++;
            if(countNum ==3){
                countNum = 0;
                kc.delete(k);//我觉得删除的是第一个小孩呢
            }
            k = k.right;
        }
        //System.out.println(kc.first.id);
    }

}
class  Kid{
    int id;
    Kid left;
    Kid right;
}
class  KidCircle{
    Kid first;
    Kid last;
    int count = 0;//圈里的人数
    KidCircle(int n){
        for(int i = 0;i<n;i++){
            add();
        }

    }
    void  add(){
        Kid k = new Kid();
        k.id = count;
        if(count<=0){
            k.left= k;
            k.right = k;
            first = k;
            last = k;
        }else{
            last.right = k;
            k.left = last;
            k.right = first;
            first.left = k;
        }
    }
    void delete(Kid kid){
        if(count==0){
            return;
        }else if(count ==1){
            first=last= null;
        }else {
            kid.left.right = kid.right;
            kid.right.left = kid.left;
            if(kid==first){
                first= kid.right;
            }else if(kid ==last){
                last = kid.left;
            }
        }
        count--;
    }
}
