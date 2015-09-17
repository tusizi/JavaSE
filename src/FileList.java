import java.io.File;

/**
 * Created by tusizi on 2015/9/17.
 */
public class FileList {
    public static void main(String[] args) {
        File f = new File("G:/A");
        System.out.println("A");
        tree(f,1);
    }
    private static void tree(File f , int level){
        String paraStr ="";
        for(int i =0 ;i<level;i++){
            paraStr +="     ";
        }
        File[] childs = f.listFiles();
        for(int i=0;i<childs.length;i++){
            System.out.println(paraStr + childs[i].getName());
            if(childs[i].isDirectory()){
                tree(childs[i],level+1);
            }

        }
    }
}
