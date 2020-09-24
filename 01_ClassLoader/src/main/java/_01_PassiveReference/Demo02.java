package _01_PassiveReference;

/**
 * 被动使用类字段 演示二
 *
 * 数组定义来引用类 不会触发此类的初始化
 *
 * @author Qing
 * @version 1.0
 * @date 2020/9/17 下午 4:02
 */
public class Demo02 {
    public static void main(String[] args) {
        SuperClass[] array = new SuperClass[10];
    }
}
