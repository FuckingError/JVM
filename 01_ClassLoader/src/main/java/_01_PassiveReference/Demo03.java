package _01_PassiveReference;

/**
 * 被动使用类字段演示三：
 *     常量在编译阶段会存入 `调用类`的`常量池`中，本质上没有直接引用到定义常量的类，因此不会触发 定义常量的 类的初始化
 *
 *     注意：这里指 将常量存放到Demo03的常量池中 之后 Demo03与ConstClass没有关系了
 *          甚至可以将ConstClass的class文件删除
 *
 *     助记符：
 *         getstatic: 从类中获取静态字段
 *         ldc : 将 int float 或 String类型的`常量值`从常量池中推送至栈顶
 *         bipush: 将 单字节(-128-127)的常量值推送至栈顶
 *         sipush: 将 短整型常量值(-32768-32767)推送至栈顶
 *         iconst_1: 将int类型1推送至栈顶 (-1到5)
 *
 * @author Qing
 * @version 1.0
 * @date 2020/9/17 下午 4:35
 */
public class Demo03 {
    public static void main(String[] args) {
        System.out.println(ConstClass.i);
    }
}

class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world";
    public static final short s = 128;
    public static final int i = 1;
}
