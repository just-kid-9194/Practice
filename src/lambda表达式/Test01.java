package lambda表达式;
/*基本概念
1.背景。
    Lambda表达式是Java SE 8中一个重要的新特性。lambda表达式允许你通过表达式来代替功能接口。
    lambda表达式就和方法一样,它提供了一个正常的参数列表和一个使用这些参数的主体(body,可以是
    一个表达式或一个代码块)。 Lambda 表达式（Lambda expression）可以看作是一个匿名函数，
    基于数学中的λ演算得名，也可称为闭包（Closure）

2.语法。
    基本语法: (parameters) -> expression 或 (parameters) ->{ statements; }

    Lambda表达式由三部分组成：
        (1)parameters：类似方法中的形参列表，这里的参数是函数式接口里的参数。这里的参数类型可以明确的声
            明也可不声明而由JVM隐含的推断。另外当只有一个推断类型时可以省略掉圆括号。
        (2)->：可理解为“被用于”的意思
        (3)方法体：可以是表达式也可以代码块，是函数式接口里方法的实现。代码块可返回一个值或者什么都不返回，
            这里的代码块块等同于方法的方法体。如果是表达式，也可以返回一个值或者什么都不返回。

3.函数式接口
    要了解Lambda表达式,首先需要了解什么是函数式接口，函数式接口定义：一个接口有且只有一个抽象方法
    注意！
        (1)如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口
        (2)如果我们在某个接口上声明了 @FunctionalInterface 注解，那么编译器就会按照函数式接口的定义来
            要求该接口，这样如果有两个抽象方法，程序编译就会报错的。所以，从某种意义上来说，只要你保证你的接
            口中只有一个抽象方法，你可以不加这个注解。加上就会自动进行检测的。
            定义方式：
                @FunctionalInterface
                interface NoParameterNoReturn {
	                //注意：只能有一个方法
	                void test();
                }

            但是这种方式也是可以的：我们知道在 jdk1.8之后接口中的方法式可以有具体实现的
                @FunctionalInterface
                interface NoParameterNoReturn {
	                void test();
	                default void test2() {
		                System.out.println("JDK1.8新特性，default默认方法可以有具体的实现");
	                }
                }



*/
public class Test01 {
}
