package _01_PassiveReference;

/**
 * 被动使用类字段 演示二
 *
 * 数组定义来引用类 不会触发此类的初始化
 *
 * 这段代码里面触发了 另一个名为“[L_01_PassiveReference.SuperClass”的类的初始化阶段
 * 对于用户代码来说，这并不是 一个合法的类型名称
 * 它是一个由虚拟机自动生成的、直接继承于java.lang.Object的子类，创建动作由 字节码指令newarray触发
 *     anewaray: 表示将一个引用类型的(类 接口 数组)数组  并将其引用值压入栈顶
 *     newarray: 表示将一个基本类型（int float char）的数组 将其引用值压入栈顶
 * @author Qing
 * @version 1.0
 * @date 2020/9/17 下午 4:02
 */
public class Demo02 {
    public static void main(String[] args) {
        SuperClass[] array = new SuperClass[10];
        //既然这里的new 没有对SuperClass进行初始化 那么这里的new到底new了什么？

        /**
         * The {@code Class} object that represents the runtime class of this object.
         * 返回的结果 代表 该对象 运行时类型
         */
        System.out.println(array.getClass());
        //看看它的父类型是什么
        System.out.println(array.getClass().getSuperclass());

        //定义一个二维数组
        SuperClass[][] biArray = new SuperClass[1][1];
        System.out.println(biArray.getClass());

        int[] ints = new int[1];
        System.out.println(ints.getClass());

    }
}
