package homework_Nov12;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.*;

public class hashtest {
    public static List<String> dfs(String path, List filelist) {
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

            filelist.add(file.getAbsolutePath());
        }

        return filelist;
    }

    //计算hash值
    public static String SHA1Checksum(String path) throws Exception {
        FileInputStream is = new FileInputStream(path);
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
        byte[] sha1Byte = complete.digest();
        BigInteger BigInt = new BigInteger(1, sha1Byte);
        return BigInt.toString(16);
    }

    public static void main(String[] args) {
        String path = "/Users/wangshiranwang/Documents/课件/java";
        System.out.println("文件夹中包括：");
        List<String> filelist = new ArrayList<>();
        dfs(path, filelist);

        System.out.println("文件hash值为：");
        try {
            for (String listpath : filelist) {
                String sha1hashcode = SHA1Checksum(listpath);
                System.out.println(sha1hashcode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
