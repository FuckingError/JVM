package _02_ClassLoader;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/24 下午 1:57
 *
 * load 只是加载  不是对类的主动使用 因此 不会 初始化该类
 * forName 通过反射 对类进行主动使用 因此 会 初始化
 *
 * 这边也引入了类加载器的使用
 */

class CL{
    static{
        System.out.println("Class CL");
    }
}

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        Class<?> clazz = loader.loadClass("_02_ClassLoader.CL");

        System.out.println(clazz);

        System.out.println("----------");

        clazz = Class.forName("_02_ClassLoader.CL");

        System.out.println(clazz);
    }
}
