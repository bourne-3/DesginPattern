package com.bouneCompany.SingleTon.Destroy;

import com.bouneCompany.SingleTon.demo1.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**

 */
public class Client {

    public static void main(String[] args) throws Exception {
        d1 obj = d1.getObj();
        d1 obj2 = d1.getObj();
        System.out.println(obj);
        System.out.println(obj2);

        System.out.println("============");

//        writeObject2File();

        readObjectFromFile();
        readObjectFromFile();
        System.out.println("发现序列化回来之后，创建的对象是不一样的了");
    }

    // 从文件中读取数据（对象）
    public static void readObjectFromFile() throws Exception {
        // 1. 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\tmp\\tmpG\\a.txt"));
        // 2. 读取对象
        d1 instance = (d1) ois.readObject();
        System.out.println(instance);
        // 3. 释放资源
        ois.close();
    }

    // 向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        // 1. 获取Singleton对象
//        Singleton instance = Singleton.getInstance();
        d1 instance = d1.getObj();
        // 2. 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\tmp\\tmpG\\a.txt"));
        // 3. 写对象
        oos.writeObject(instance);
        // 4. 释放资源
        oos.close();
    }
}
