package _01_PassiveReference;

/**
 * 被动使用类字段 示例1
 *
 * 子类 引用 父类 的 静态字段 不会导致子类初始化
 *     虽然是通过子类引用父类的静态字段 但是 这是对父类的静态字段的主动使用 因此 只会初始化父类
 * @author Qing
 * @version 1.0
 * @date 2020/9/17 下午 3:43
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}

class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}

class SubClass extends SuperClass{
    static {
        System.out.println("SubClass init!");
    }
}



