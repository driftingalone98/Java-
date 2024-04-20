# Day 3

## 运算符（Operater）

分为算数、赋值、比较、逻辑、位、条件

大多与C相同，果然C是万物之源。但是有一部分是不同的

**++**

```
short s1=10;
s1 = short(s1+1);
System.out.println(s1); // 11

short s2 = 10;
s2++; //内存空间上更节省
System.out.println(s2); // 11
```

由于基本是学过的内容，这里就做两道练习题，标记一下。

**练习1**

```
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：

例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1

```

```
class EachPosition{
    public static void main(String[] args){
        int num = 153;
        int bai = num / 100;
        int shi = num / 10 - 10 * bai;
        int ge = num - bai * 100 - shi * 10;
        System.out.println("数字为" + num + " 百位/十位/个位" + bai + "/" + shi + "/" + ge);
    }
}
```

**练习2**

```
public class ArithmeticExer{
    public static void main(String[] args){
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i); // 10
        System.out.println("i1="+i1);// 11
        i = ++i1;
        System.out.print("i="+i);// 12
        System.out.println("i1="+i1);// 12
        i = i2--;
        System.out.print("i="+i);// 20
        System.out.println("i2="+i2);// 19
        i = --i2;
        System.out.print("i="+i);// 18
        System.out.println("i2="+i2);// 18
    }
}
```

**练习3**

```
int i = 1;
int j = i++ + ++i * i++;
System.out.println("j = " + j);
```

**练习4**（企业真题）

```
int m = 2;
m = m++; // 2
//(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
System.out.println(m);
```



**&和&&** - 与 和 短路与

> 相同点：如果符号左边是true，两者都执行符号右边操作
>
> 不同点：
>
> ​	&：如果符号左边是false，继续执行右边的操作
>
> ​	&&：如果符号左边是false，不继续执行右边操作
>
> 开发一般用&&

**|和||** - 或 和 短路或，同理

**^**异或，用的很少

**练习1**

```
1. 定义类 CompareLogicExer
2. 定义 main方法
3. 定义一个int类型变量a,变量b,都赋值为20
4. 定义boolean类型变量bo1 , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo1
5. 输出a的值,bo1的值
6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
7. 输出b的值,bo2的值
```

```
public class CompaerLogicExer{
    public static void main(String[] args){
        int a = 20, b = 20;
        boolean bo1 = (++a % 3 == 0) && ( a++ % 7 == 0);
        System.out.println("a:"+a+"bo1:"+bo1);
        System.out.println("----------------------");
        boolean bo2 = (b++ % 3 == 0) && ( ++b % 7 == 0);
        System.out.println("b:"+b+"bo2:"+bo2);
    }
}
```

**练习2**

```
class  Test  {
	public static void main (String []  args)  {
		boolean x = true;
        boolean y = false;
        short z = 42;
        
        if ((z++ == 42) && (y = true)) { //true && true -> true , z=43
            z++; // z=44
        }
        if ((x = false) || (++z == 45)) { //false || true --> true , z=45
            z++; // z=46
        }

        System.out.println("z=" + z); // 46
	}
}
```



**位运算符**（难点，非重点）

```
<<   >>   >>>   &   |   ^   ~
都是基于二进制的补码进行运算
<< : 一定范围内，每向左移动一位，结果就在原有的基础上 * 2（正数负数都适用）
>> ： 一定范围内，每向左移动一位，结果就在原有的基础上 / 2（正数负数都适用）
>>> ： 无符号右移
```

```
面试题： 高效方式计算2 * 8？
答： 2<<3 或 8<<1
```

```
& 与		对应位都是1才为1，否则为0
| 或		对应位有1就是1，否则为0
^ 异或	对应位一个为1一个为0,才为1，否则为0
~ 取反	对应位为1,结果为0；对应位为0，结果为1
```

```
~9	// 结果：-10
~-9	// 结果：8
```

**练习1**：如何交换两个int型变量的值？String呢？

```
方式1:临时变量
int m = 10, n = 20;
int temp = m;
m = n;
n = temp;

方式2：不需要临时变量，但不适用于非数值类型，两数之和可能会超出阈值
m = m + n;
n = m - n;
m = m - n;

方式3：异或（绝杀）不是第一次见了，可以理解，但开发应该还是选第一个
m = m ^ n;
n = m ^ n;
m = m ^ n;
```



**三元运算符**

三目运算符是运算符，所以效率比if-else高

```
（条件表达式) ? 表达式1 : 表达式2
```



## 变量与运算符面试题

这里的题目是作为复习用的，都是这部分学完的后一天进行。

### 1. 高效的方式计算2 * 8的值 (文\*\*辉、轮*科技)

使用 << 

### 2. &和&&的区别？(恒\*电子、\*度)

略

### 3. Java中的基本类型有哪些？String 是最基本的数据类型吗？(恒*电子)

8种基本数据类型。（略）

String不是，属于引用数据类型。

### 4. Java中的基本数据类型包括哪些？（*米）

```
类似问题：
> Java的基础数据类型有哪些？String是吗？（贝壳）
```

略

### 5. Java开发中计算金额时使用什么数据类型？（5*到家）

不能使用float或double，因为精度不高。

使用BigDecimal类替换，可以实现任意精度的数据的运算。

### 6. char型变量中能不能存储一个中文汉字，为什么？(*通快递)

可以的。char c1 = '中';

char c2 = 'a'。

因为char使用的是unicode字符集，包含了世界范围的所有的字符。

### 7. 代码分析(君\*科技、新\*陆)

```java
short s1=1; 
s1=s1+1;  //有什么错？  =右边是int类型。需要强转
```

```java
short s1=1;
s1+=1; //有什么错?   没错
```



### 8. int i=0; i=i++执行这两句化后变量 i 的值为（*软）

0。

### 9. 如何将两个变量的值互换（北京\*彩、中外\*译咨询）

```java
String s1 = "abc";
String s2 = "123";

String temp = s1;
s1 = s2;
s2 = temp;
```



### 10. boolean 占几个字节（阿**巴）

```
编译时不谈占几个字节。

但是JVM在给boolean类型分配内存空间时，boolean类型的变量占据一个槽位(slot，等于4个字节)。
细节：true:1  false:0

>拓展：在内存中，byte\short\char\boolean\int\float : 占用1个slot
              double\long :占用2个slot
```



### 11. 为什么Java中0.1 + 0.2结果不是0.3？（字*跳动）

在代码中测试0.1 + 0.2，你会惊讶的发现，结果不是0.3，而是0.3000……4。这是为什么？

几乎所有现代的编程语言都会遇到上述问题，包括 JavaScript、Ruby、Python、Swift 和 Go 等。引发这个问题的原因是，它们都采用了`IEEE 754标准`。

> IEEE是指“电气与电子工程师协会”，其在1985年发布了一个IEEE 754计算标准，根据这个标准，小数的二进制表达能够有最大的精度上限提升。但无论如何，物理边界是突破不了的，它仍然`不能实现“每一个十进制小数，都对应一个二进制小数”`。正因如此，产生了0.1 + 0.2不等于0.3的问题。

具体的：

**整数变为二进制，能够做到“每个十进制整数都有对应的二进制数”**，比如数字3，二进制就是11；再比如，数字43就是二进制101011，这个毫无争议。

**对于小数，并不能做到“每个小数都有对应的二进制数字”**。举例来说，二进制小数0.0001表示十进制数0.0625 （至于它是如何计算的，不用深究）；二进制小数0.0010表示十进制数0.125；二进制小数0.0011表示十进制数0.1875。看，对于四位的二进制小数，二进制小数虽然是连贯的，但是十进制小数却不是连贯的。比如，你无法用四位二进制小数的形式表示0.125 ~ 0.1875之间的十进制小数。

所以在编程中，遇见小数判断相等情况，比如开发银行、交易等系统，可以采用`四舍五入`或者“`同乘同除`”等方式进行验证，避免上述问题。



## 流程控制语句

分为顺序、分支、循环，分支可以分为if-else 和 switch-case两种，循环可以分为for / while / do-while三种，同时，jdk5.0后加入了foreach循环（优点眼熟哈，数据库里出现过），可以遍历集合、数组。

这部分在C/Python用得太多，洒洒水啦。

### Scanner ：从键盘上获取

**步骤**

> 步骤1：导包 import java.util.Scanner
>
> 步骤2：提供（或创建）一个Scanner类中的方法，获取指定类型的变量
>
> 步骤3：调用Scanner类中的方法，获取指定类型的变量(nextXxx)
>
> 步骤4：关闭资源，调用Scanner类的close()
>
> **注意**：Scanner没有提供获取char类型变量的方法，只能通过.next().charAt(0)

**案例**

```
输入网名，年龄，体重，是否单身，性别

import java.util.Scanner;
class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("请输入你的网名");
        String name = scan.next();
        System.out.println("name = " + name);
        
        System.out.println("请输入你的年龄");
        int age = scan.nextInt();
        System.out.println("age = " + age);
        
        System.out.println("请输入你的体重");
        double weight = scan.nextDouble();
        System.out.println("weight = " + weight);
        
        System.out.println("请输入你是否单身");
        boolean isSingle = scan.nextBoolean();
        System.out.println("isSingle = " + isSingle);
        
        System.out.println("请输入你的性别");
        char gender = scan.next().charAt(0);
        System.out.println("gender = " + gender);
        
        System.out.println("网名："+name+"年龄："+age+"体重"+weight+"单身"+isSingle+"性别"+gender);
    }
}
```

**注意**

如果是判断字符串是否等于某个值，不能使用==，而是xxx.equals(“xx”)



### 产生一个随机数

**步骤**

> 步骤1：使用Java提供的API：Math类的random()
>
> 步骤2：random()调用后，会返回一个[0.0,1.0)范围的double型的随机数

```
需求1：获取[0,100]范围的随机整数
int num1 = (int)(Math.random() * 101);

需求2：获取[1,100]范围的随机整数
int num2 = (int)(Math.random() * 100) + 1;

公式：获取一个[a,b]范围内的随机整数
int num = (int)(Math.random() * (b-a+1)) + a;
```

让我想起了Python的random() , randint(a,b) , randrange(start, stop, step)，还有一堆生成随机数、随机选择元素的方法，相比之下，jdk17 API中我只看到了这一个生成随机数的方法。



### 分支结构

#### if-else

略

#### switch-case

这里我学到了之前一直没太明白的语句switch，基本不怎么用吧，但是确实某些情况下很好使，尤其是考虑到代码冗余度的情况下。主要利用一个机制：case穿透，即没遇到break时，不再判断case是否匹配，直接执行case中的语句。

和C相同，case后只能直接跟常量，具体来说，是byte/short/char/int/枚举/String

```
从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
import java.util.Scanner;
class SwitchCaseTest4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入2023年的month:");
		int month = scan.nextInt();
		System.out.println("请输入2023年的day:");
		int day = scan.nextInt();

		//这里就不针对month和day进行合法性的判断了，以后可以使用正则表达式进行校验。
		int sumDays = 0;//记录总天数
		switch(month){
			case 12:
				sumDays += 30;//这个30是代表11月份的满月天数
			case 11:
				sumDays += 31;//这个31是代表10月份的满月天数
			case 10:
				sumDays += 30;//这个30是代表9月份的满月天数
			case 9:
				sumDays += 31;//这个31是代表8月份的满月天数
			case 8:
				sumDays += 31;//这个31是代表7月份的满月天数
			case 7:
				sumDays += 30;//这个30是代表6月份的满月天数
			case 6:
				sumDays += 31;//这个31是代表5月份的满月天数
			case 5:
				sumDays += 30;//这个30是代表4月份的满月天数
			case 4:
				sumDays += 31;//这个31是代表3月份的满月天数
			case 3:
				sumDays += 28;//这个28是代表2月份的满月天数
			case 2:
				sumDays += 31;//这个31是代表1月份的满月天数
			case 1:
				sumDays += day;//这个day是代表当月的第几天
		}
		
		System.out.println(month + "月" + day + "日是2023年的第" + sumDays + "天");
        //关闭资源，防止内存泄漏
		scan.close();
	}
}
```

