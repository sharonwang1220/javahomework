package homework_Nov12;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class hash {
    //深度优先遍历一个文件夹,并按照文件名称排序
    public static void dfs(String path) {
        File dir = new File(path);
        //给出路径不存在或是不是一个目录会抛出空指针异常
        //表示file目录中所有的子文件或目录，把文件/文件夹封装成file对象，多个file对象存储在file数组中
        File[] fs = dir.listFiles();
        List fileList = Arrays.asList(fs);
        Collections.sort(fileList, new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                if (f1.isDirectory() && f2.isFile())
                    return -1;
                if (f1.isFile() && f2.isDirectory())
                    return 1;
                return f1.getName().compareTo(f2.getName());
            }
        });
        for (File file : fs) {
            System.out.println(file.getName());
        }
    }

    //计算hash值
    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int length = 0;
        do {
            length = is.read(buffer);
            if (length > 0) {
                complete.update(buffer, 0, length);
            }
            //read方法读取结束之后返回-1
        } while (length != -1);
        //关闭输入流
        is.close();
        return complete.digest();

    }

    public static void main(String[] args) {
        //FileInputStream必须定义在try catch语句中
        try {

            String path = "/Users/wangshiranwang/Documents/ppt/java";
            File file = new File(path);
            FileInputStream is = new FileInputStream(file);
            dfs(path);
            byte[] f = SHA1Checksum(is);
            String result="";
            for(int i=0;i<f.length;i++){
                result+=Integer.toString(f[i],16);
            }
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
