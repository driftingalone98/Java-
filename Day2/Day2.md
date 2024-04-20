# Day 2

今天学习了注释，Java SE的API，简单了解JVM，并且开始了关键字、标识符、变量的学习。

## 注释

> Java注释类似Javascript。
>
> 单行注释
>
> ```
> //单行注释
> ```
>
> 多行注释
>
> ```
> /*
> ...
> */
> ```
>
> 文档注释（Java特有）
>
> ```
> /**
> ...
> */
> ```
>
> **注意**
>
> 多行注释编译后的字节码文件并没有注释中的内容。
>
> 而文档注释是可以被JDK提供的工具javadoc所解析（需要使用固定的格式），生成一套以网页文件形式体现的程序。

**javadoc运行出现的问题**

无法在CLI中运行javadoc，会报错

![1713434452697](C:/Users/13119/AppData/Roaming/Typora/typora-user-images/1713434452697.png)

经过两小时的查阅资料，没找到解决方案，但在自己的误打误撞下，在个人用户的Path中加入了javadoc.exe的绝对路径，居然成功了

![1713434255183](C:/Users/13119/AppData/Roaming/Typora/typora-user-images/1713434255183.png)

根本问题在于，之前配置的Path中，%JAVA_HOME%\bin敲成了%JAVA_HOME\%bin，但是java和javac.exe都可以通过jdk自动配置的路径运行，而javadoc只能自行配置，两小时惨案。

**javadoc成功运行**

javadoc可以解析.java文档，生成一套网页格式的信息

``` 
/**
这是我的第二个Java程序！
@author llw
@version 1.0
*/
public class CommentTest{
	/**
	文件注释
	*/
	/*
	多行注释
	*/
	public static void main(String[] args){
		System.out.println("看看哪个注释出现啦");
	}
}
```

![1713435229820](C:/Users/13119/AppData/Roaming/Typora/typora-user-images/1713435229820.png)

![1713435341958](C:/Users/13119/AppData/Roaming/Typora/typora-user-images/1713435341958.png)



## Java SE API

> API——Application Programming Interface，应用程序接口
>
> Java提供了大量的基础类，同时有个API文档，JDK17市面都是英文文档，开始折磨。



## JVM - Java核心机制

> **功能1 - 跨平台性** - write once , anywhere.
>
> 由于不同平台的JVM不同，JDK是不同的，下载时看清楚平台。

![1713436477619](C:/Users/13119/AppData/Roaming/Typora/typora-user-images/1713436477619.png)

> **功能2 -内存自动管理（分配和回收）**
>
> 数据的分配和存储都交给JVM完成，提高了效率，很大程度减少了内存泄漏情况

> **面试题**
>
> JAVA程序会出现内存溢出和内存泄漏问题吗？
>
> YES！内存泄漏多了会导致内存溢出。



**练习1**

> 输出以下内容
>
> ```
> 姓名：渣渣辉
> 性别：男
> 家庭住址：安徽黄山
> 	
> ok!
> ```
>
> ```
> class PersonalInformation{
> 	public static void main(String[] args){
> 		System.out.println("姓名：渣渣辉");
> 		System.out.println("性别：男");
> 		System.out.println("家庭住址：安徽黄山");
> 		System.out.println("");
> 		System.out.println("ok!");
> 	}
> }
> ```

**练习2**

> 使用\n和\t做一个爱心
>
> ```
> class Heart{
> 	public static void main(String[] args){
> 		System.out.println("\t"+ "*" + "\t\t\t\t\t\t\t\t\t\t\t\t" + "*");
> 		System.out.println("*"+"\t\t"+"*"+"\t\t\t\t"+"I love gerner"+"\t\t\t\t"+"*"+"\t\t\t"+"*"+"\n");
> 		System.out.println("\t"+"*"+"\t\t\t\t\t\t\t\t\t\t\t\t"+"*"+"\t"+"\n");
> 		System.out.println("\t\t"+"*"+"\t\t\t\t\t\t\t\t\t\t"+"*"+"\t\t"+"\n");
> 		System.out.println("\t\t\t"+"*"+"\t\t\t\t\t\t\t\t"+"*"+"\t"+"\n");
> 		System.out.println("\t\t\t\t"+"*"+"\t\t\t\t\t\t"+"*"+""+"\t"+"\n");
> 		System.out.println("\t\t\t\t\t"+"*"+"\t\t\t\t"+"*"+""+"\t\t"+"\n");
> 		System.out.println("\t\t\t\t\t\t"+"*"+"\t\t"+"*"+""+"\t\t"+"\n");
> 		System.out.println("\t\t\t\t\t\t\t"+"*"+"\n");
> 	}
> }
> ```
>
> ![1713438263265](C:/Users/13119/AppData/Roaming/Typora/typora-user-images/1713438263265.png)



## 小结

以上结束了Java概述的学习，开启下一阶段——Java关键字。

这里也简单做一个未来规划

```
第一阶段：Java基本语法
> Java概述，关键字，标识符，变量，运算符，流程控制（条件、选择、循环）、IDEA、数组

第二阶段：面向对象
> 类及类的内部成员
> 继承封装和多态
> 其他关键字的使用

第三阶段：高级应用
> 异常处理、多线程、IO流、集合框架、反射、网络编程、新特性、其他常用API
```

第一阶段7天，第二阶段7天，第三阶段7-14天

神书：《Java核心技术》《Effective Java》《Java编程思想》

这是论坛里经常看到的三本书，感觉内容对初学者非常不友好，我认为初学阶段不急着看，在日后工作时作为工具书，慢慢体悟。



## 关键字

> const goto 保留字
>
> true false null 不是关键字但是很特殊



## 标识符

> 学两门语言了，都没怎么听过这个概念…所以什么是标识符？
>
> 能起名的就是标识符，类名、变量名…

**命名规则**（必须遵守）

> 1. 字母大小写/数字/_$组成
> 2. 开头不能是数字
> 3. 不能使用关键字和保留字，但可以包含关键字和保留字
> 4. 严格区分大小写，长度无限制
> 5. 标识符不能包含空格

**命名规范**（建议遵守）

> 包：小写
>
> 类、接口：首字母大写——**大驼峰**
>
> 变量、方法：首字母小写，第二个单词首字母大写——**小驼峰**
>
> 常量：所有字母大写，多单词用_连接



## 变量

**基本数据类型**

> - **整形：byte / short /  int / long** **- 1 / 2 / 4 / 8 byte**
> 	- long进行声明时，需要后缀‘l’或‘L’
> 	- 开发中一般使用int
> - **浮点型：float / double**
> 	- float进行声明时，需要后缀‘f’或‘F’
> 	- 开发中一般使用double
> 	- float的表述范围大于long的表述范围，但精度不高
> 	- 不允许舍入误差时，需要使用BigDecimal
> - **字符型： char** 
> 	- 使用单引号，内部有且仅有一个字符
> 	- 直接使用Unicode值表示，比如 char c8 = ‘\u0036’
> 	- 转义字符，比如‘\n’ ‘\t’
> 	- 数字，比如char c8 = 97，输出 c8 = a
> - **布尔型： boolean**
> 	- boolean类型占用4个字节

**引用数据类型**

> - **类（class）**
> - **数组（array）**
> - **接口（interface）**
> - 枚举（enum）
> - 注解（annotation）
> - 记录（record）

定义变量时，变量名要遵循标识符命名的规则和规范。

**声明** 

与C基本相同，必须先声明后赋值

**作用域**

> - 变量都有作用域，超出作用域就会失效。
> - 在同一个作用域内，不能声明两个同名的变量

**练习1**

> 定义圆周率并赋值3.14，现在有3个圆的半径分别为1.2,2.5,6，求他们的面积。
>
> ```
> class CircleArea{
> 	public static void main(String[] args){
> 		float pi = 3.14f;
> 		float r1 = 1.2f,r2=2.5f,r3=6.0f;
> 		float area1,area2,area3;
> 		area1 = pi * r1 * r1;
> 		area2 = pi * r2 * r2;
> 		area3 = pi * r3 * r3;
> 		System.out.println("圆1的面积为"+area1);
> 		System.out.println("圆2的面积为"+area2);
> 		System.out.println("圆3的面积为"+area3);
> 	}
> }
> ```
>
> ![1713451576110](C:/Users/13119/AppData/Roaming/Typora/typora-user-images/1713451576110.png)
>
> ```
> class CircleArea{
> 	public static void main(String[] args){
> 		double pi = 3.14;
> 		double r1 = 1.2,r2=2.5,r3=6.0;
> 		double area1,area2,area3;
> 		area1 = pi * r1 * r1;
> 		area2 = pi * r2 * r2;
> 		area3 = pi * r3 * r3;
> 		System.out.println("圆1的面积为"+area1);
> 		System.out.println("圆2的面积为"+area2);
> 		System.out.println("圆3的面积为"+area3);
> 	}
> }
> ```
>
> ![1713451612520](C:/Users/13119/AppData/Roaming/Typora/typora-user-images/1713451612520.png)

**练习2**

> 将华氏度80度转换为摄氏度，并用华氏度和摄氏度分别显示该温度
>
> ```
> class Temperature{
> 	public static void main(String[] args){
> 		double huashi = 80,sheshi;
> 		sheshi = (huashi - 32) /1.8;
> 		System.out.println("华氏度"+huashi+"，摄氏度"+sheshi);
> 	}
> }
> ```
>
> ![1713453018036](C:/Users/13119/AppData/Roaming/Typora/typora-user-images/1713453018036.png)

**基本数据类型变量间的运算规则**

> 1. boolean外所有类型都可以运算
>
> 2. 规则
>
> 	- **自动类型提升**
>
> 		- 容量小和容量大的变量运算时，结果自动转换为容量大的数据类型
> 		- byte / short / char–> int –> long –> float –> double
> 		- byte / short / char 三者不能两两做运算
>
> 	- **强制类型转换**
>
> 		- 容量大变为容量小，需要强制类型转换
>
> 		- ```
> 			long l1 = 123;
> 			short s2 = (short)l1
> 			```
>
> 		- 但是可能会带来精度损失
>
> 		- ```
> 			int l2 = 128;
> 			byte b1 = (byte)l2
> 			```
>
> 		- 输出-128，学习C的时候也遇到过这种情况，应该是，源码、反码、补码导致

**基本数据类型与String的运算**

> **String**
>
> - 不是基本数据类型，而是引用数据类型
> - 可以使用“”进行赋值
> - 内部可以是0个字符

> **基本数据类型转换为String运算**
>
> - 只能做连接运算，用 + ，结果还是String

> **String转换为基本数据类型**
>
> - 例如，将“10”变为10
>
> - 如何实现？
>
> - ```
> 	String str = "10";
> 	int num = Integer.parseInt(str); // 使用Integer类
> 	```

**练习1**

> 填写自己的姓名、年龄、性别、体重、婚姻情况（已婚true，反之false），联系方式
>
> ```
> class Situation{
>     public static void main(String[] args){
>         String name = "大帅逼";
>         int age = 26;
>         char gender = '男';
>         double weight = 75.0;
>         bool marrige = false;
>         String phoneNumber  = "13838385438;
>     }
> }
> ```

**练习2**

```
String str1 = 4;                       //判断对错：错
String str2 = 3.5f + "";               //判断str2对错：对
System.out.println(str2);              //输出：3.5
System.out .println(3+4+"Hello!");     //输出：7Hello
System.out.println("Hello!"+3+4);      //输出：HELLO34
System.out.println('a'+1+"Hello!");    //输出：98Hello
System.out.println("Hello"+'a'+1);     //输出：Helloa1
```

**练习3**

```
System.out.println("*    *");				//输出：*    *
System.out.println("*\t*");					//输出：*	*
System.out.println("*" + "\t" + "*");		//输出：*	*
System.out.println('*' + "\t" + "*");		//输出：*	*
System.out.println('*' + '\t' + "*");		//输出：*	*
System.out.println('*' + "\t" + '*');		//输出：51*
System.out.println("*" + '\t' + '*');		//输出：*	*
System.out.println('*' + '\t' + '*');		//输出：93
```



**二进制转十进制**

>  **源码、反码、补码**
>
> 转换规则：
>
> 正数：正数的三码相同
>
> 负数：源码 –> 反码：符号位不变，各位取反 ； 反码 –> 补码： 反码+1
>
> 计算机数据的存储是以二进制补码的形式存储的，二进制的首位是符号位，0表示正数，1表示负数，以1byte为例，127即 0111 1111

```
举例：1110 1011是多少？
1110 1011 减1得到反码1110 1010
1110 1010除符号位外，各位取反，得源码1001 0101，即-21
```

**思考**

> 这下就可以解决上文的问题了——为什么128转换为byte后会变成128？
>
> 128的源码是1000 0000， 超出了-127~128的范围，由于首位是1，被认定为是负数，对其进行计算得到反码为1111 1111，补码为1 0000 0000，由于超出了8位，需要对其前8位做截断，即1000 0000。根据补码的定义，这就是-128。
>
> 才知道这是计组知识，今后有空补上。