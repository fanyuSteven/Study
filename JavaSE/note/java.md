IDEA创建文件要先

![1672835853636](.\05.png)

![1672835938137](.\06.png)

2.修改编码

![1672836239213](.\07.png)

![1672836295459](.\08.png)



# 注释

```java
public class HelloWorld {
    public static void main(String[] args) {
        //单行注释
        System.out.println("Hello,World");//输出一个Hello World
        //多行注释 /*    注释      */
        /*
        我是多行注释
        打开IDEA左上角File
        Setting–>Editor–>Color Scheme -->Language Defaults
        Comments目录下的
        Block comment 多行注释
        Line comment 单行注释
        Doc Comment 文档文件
         */
        //有趣的代码注释
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                            O\ = /O
//                        ____/`---'\____
//                      .   ' \\| |// `.
//                       / \\||| : |||// \
//                     / _||||| -:- |||||- \
//                       | | \\\ - /// | |
//                     | \_| ''\---/'' | |
//                      \ .-\__ `-` ___/-. /
//                   ___`. .' /--.--\ `. . __
//                ."" '< `.___\_<|>_/___.' >'"".
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |
//                 \ \ `-. \_ __\ /__ _/ .-` / /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//
//         .............................................
//                 佛祖保佑             永无BUG

    }
}

```

## 文档注释(JavaDoc)

1.JavaDoc命令是用来生成自己API文档的

2.参数信息

|          |                           |
| -------- | ------------------------- |
| @author  | 作者名                    |
| @version | 版本号                    |
| @since   | 指明需要最早使用的jdk版本 |
| @param   | 参数名                    |
| @return  | 返回值情况                |
| @throws  | 异常抛出情况              |

```java
//类注释
/**
 * @author Q.M.F.
 * @version 1.0
 * @since 1.8
 */
public class Doc {
    //方法注释
    /**
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name) throws Exception{
        return name;
    }
}
```

3.生成JavaDoc文档

![1672820576721](.\01.png)

# 标识符

规则

1.关键字：不能用作标识符  eg：int，class，char，boolean;//注意String不是关键字而是一个java类。

2.标识符都应该以字母，美元符$或者下划线 _ 作为首字符

3.首字符后可以是字母，美元符，下划线，数字

4.标识符是大小写敏感的 Man 和 man 是不一样的

规范（可不遵守）

1.包名：多单词组成时所有字母都小写。（例：aaabbbccc）

2.类名、接口名：多单词组成时，所有单词的首字母大写。（例：AaaBbbCcc）

3.变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写。（例：aaaBbbCcc）方法名类似C语言的函数名

4.常量名：所有字母都大写，多单词时每个单词之间用下划线_连接。（例：AAA_BBB_CCC）

# 数据类型

```java
public class Demo01 {
    public static void main(String[] args) {
        //基本类型
        //整数
        int num = 10;//最常用，占4字节
        byte num1=20;//占1字节
        short num2=30;//占2字节
        long num4 = 30L;//Long类型一定要再数字后加 L ，占8字节
        //浮点数，小数
        float num5 = 50.1F;//float类型要在数字后加个 F，占4字节
        double num6 = 3.1415;//占8字节
        //字符
        char name = '国';//占2字节，C语言中占1字节
        //布尔值：true or flase
        boolean flag=true;//占 1bit/1位
        //字符串，不是基本类型
        String name1 = "中国";//String不是关键字而是一个java类，就像Integer,Byte;这些首字母大写的都是一个类
        //应用数据类型（reference Type）
        /*
        类
        接口
        数组
         */
    }
}
```

## 拓展

```java
//进制
        int h = 0b10;//二进制0b开头
        int i = 10;//十进制
        int j = 010;//八进制 0开头
        int k = 0x10;//十六进制 0x开头
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println("============================");
        //==============================================
        //=================浮点数拓展=====================
        //==============================================
        float f = 0.1F;//0.1
        double d = 1.0 / 10;//0.1
        System.out.println(f == d);//判断f是否等于d
        System.out.println(f);
        System.out.println(d);
        //===============================================
        float d1 = 2312312312312312313f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);
        System.out.println(d1);
        System.out.println(d2);
        //浮点型因为是 有限 离散 有舍入误差 大约 接近但不等于
        //所以尽量不用浮点型进行比较
        //而用一个类数据工具类 BigDecimal
        System.out.println("===========================");


		//==============================================
 		//=================字符拓展======================
 		//==============================================
        char c1 = 'a';
        char c2 = '国';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int) c1);//强制类型转换
        System.out.println((int) c2);//强制类型转换
		//==============================================
        //=================字符串拓展=====================
        //==============================================
        String s1 = new String("hello world");
        String s2 = new String("hello world");
        System.out.println(s1 == s2);
        String s3 = "hello world";
        String s4 = "hello world";
        System.out.println(s3 == s4);


        System.out.println("============================");
        //==============================================
        //=================字符串拓展=====================
        //==============================================
        boolean flag1 = true;
        if (flag1 == true) ;//新手
        if (flag1) ;//老手，应为boolea型可以直接判断不用比较
```



# 转移字符

```java
\u unicode占两字节，a，97表示成"\u0061"
\n 换行
\t 制表符
        ...
```

# 类型转换

```java
		//容量低 ----------------------------------------------> 容量高
        //byte,short,char -> int -> long -> float -> double
        //long虽然容量高但表示范围低于float

        //强制类型转换 (类型)变量名, 由高转到低
        int i = 128;
        byte b = (byte) i;
        System.out.println(b);
        //自动类型转换  由低转到高
        b=122;
        i=b;//不用强制转换加括号
        System.out.println(i);
        /*
        注意点：
        1.不能对布尔值进行转换
        2.不能把对象类型转换为不相干的类型
        3.在把高容量转为低容量时，要强制转换
        4.转换时可能存在内存溢出，或精度问题!
         */
```

## 溢出

```java
 int money = 1_000_000_000;//JDK新特性，数字之间可以用_隔开，好看出有几位，数字还是原来的数字
        int years = 20;
        int total1 = money * years;
        System.out.println(total1);
        long total2 = money * years;//虽然total2是long类型，但是右边算式是int类型没有先进行类型转换，故计算时还是溢出
        System.out.println(total2);
        long total3 = money * ((long) years);//先把一个操作数转换，这样就直接是long类型了
        System.out.println(total3);
```

# 变量

1.属性： 即变量，在类中的变量叫属性

2.方法：相当于C语言的函数，在类中的函数叫方法

```java
public class Demo04 {
    //属性 即变量，在类中的变量叫属性，会默认初始化
    int a；
    //main方法 方法相当于C语言的函数，在类中的函数叫方法
    public static void main(String[] args) {
    }
    //其他方法,add
    public void add() {

    }
}
```

3.定义 type varName [=value] [{,varName [=value]}];

要声明变量类型，变量名，作用域

```java
int a=3,b=4;
//但最好是
/*
int a;
int b;
*/
```

## 变量作用域

类变量：在类中声明，声明时加static，C语言中静态变量，在该类中可以使用

实例变量：在类中声明，声明时不加static，但使用前必须先声明对象才能使用

局部变量：在方法中声明，且必须声明和初始化值，从属于方法，只能在该方法中使用

```java
public class Demo04 {
    //属性 即变量，在类中的变量叫属性

    //类变量 加个static
    static int salary = 100;
    //实例变量；从属于对象,在对象中使用，不用赋初值，未赋值时输出默认值
    /*
    int 默认值是0
    double 默认值是0.0
    boolean 默认值是false
    除了基本类型其他默认值都是null
    eg:String 默认值是null

     */
    int age;
    String name;
    double d;
    boolean flag;

    //main方法 方法相当于C语言的函数，在类中的函数叫方法
    public static void main(String[] args) {
        //局部变量；必须声明和初始化值，从属于方法，只能在该方法中使用
        int i;
        i = 10;
        System.out.println(i);

        //实例变量使用
        Demo04 demo04 = new Demo04();//定义一个Demo04类的对象，对象名是demo04
        System.out.println(demo04.age);//未赋初值输出默认值
        System.out.println(demo04.name);
        System.out.println(demo04.d);
        System.out.println(demo04.flag);
        //类变量使用
        System.out.println(salary);
    }

    //其他方法,add
    public void add() {

    }
}

```

# 常量

常量（constant）：赋初值后不能改变值，在程序中不允许被改变。

常量名声明时全用用大写字符

声明 final 类型 常量名 [=value]

```java
final double PI=3.14;
static final double PI=3.14;
final static double PI=3.14;//这两种都行final和static是修饰符，不存在先后顺序
```

# 运算符

- 算术运算符 + , - , * , / , % , ++ , --

- ```java
  //快捷键ctrl+D:复制当前行到下一行
  int a = 10;
  int b = 20;
  int c = 25;
  int d = 25;
  System.out.println(a + b);
  System.out.println(a - b);
  System.out.println(a * b);
  System.out.println(a / (double) b);
  System.out.println(a % b);
  System.out.println(a++);
  System.out.println(++a);
  System.out.println(a--);
  System.out.println(--a);
  //幂运算
  double pow = Math.pow(2, 3);
  System.out.println(pow);
  //补充
  long a = 123123123123L;
          int b = 123;
          short c = 10;
          byte d = 8;
          //多个操作数中有一个为long类型，结果为long类型，若无long类型，结果都为int类型。
          System.out.println(a+b+c+d);//long类型
          System.out.println(b+c+d);//int类型
          System.out.println(c+d);//int类型
  ```

- 赋值运算符 =

- 关系运算符 < , > , <= , >= , == , != , instanceof

  ```java
  //关系运算符返回的结果：true false 布尔值
  int a=10;
  int b=20;
  
  System.out.println(a>b);
  System.out.println(a<b);
  System.out.println(a==b);
  System.out.println(a!=b);
  ```

- 位运算符 & , | , ^ , ~ ,  >> , << , >>>(了解)

  ```java
  //位运算符
  //&(按位与),  |(按位或),    ^(按位异或),    ~(取反),    >>(右移,除2),    <<(左移,乘2)
  /*
  A = 0011 1100
  B = 0000 1101
  -----------------------
  A&B = 0000 1100
  A|B = 0011 1101
  A^B = 0011 0001
  ~A = 1100 0011
  ------------------------
  C=2
  C<<3
  C>>3
   */
  int c = 128;
  System.out.println((c >> 3));
  System.out.println((c << 3));
  ```

- 逻辑运算符  && ,|| , !

  ```java
  //逻辑运算符 与（&&）   或（||）   非（!）
  //需要注意的是逻辑运算时会发生短路，eg：判断或时如果已经出现false后面的式子就不会进行判断运行
  //c=false d=1，c&&(++d==2),运行后d仍为1
  boolean a=true;
  boolean b=false;
  System.out.println((a&&b));
  System.out.println((a||b));
  System.out.println((!a));
  ```

- 条件运算符 ?  :

- 扩展赋值运算符 += , -= ,*= , /=

```java
//扩展赋值运算符
int a=10;
int b=20;
a+=b;//a=a+b
a-=b;//a=a-b
System.out.println(a);

//字符串连接符    +   ,String
System.out.println("a+b="+(a+b));//输出的是a+b=30
//特别的
System.out.println("a+b="+a+b);//输出的是a+b=1020，a、b未进行运算
System.out.println(a+b+"a+b=");//30a+b=，a、b做了运算

//条件运算符 ? :
//x ? y : z;
//如果x==true,结果为y，否则结果为z
```

# 包机制

1.公司域名倒置

com.qmf.www

com.qmf.blog

com.wlai.www

2.导包

import com.qmf.www.类名(接口名，*(通配符，表所有)...)

# Scanner对象

1.通过Scanner类的使用hasNext()与hasNextLine()判断输入的数据是否是字符，一般还需通过Scanner类的next()与nextLine()方法获取输入的字符串。

注意：在hasNext()方法就要输入数据判断是否为字符类型，而next()方法只是取出输入的数据。

```java
while (scanner.hasNextDouble()) {		//hasNextDouble就要输入数据
    System.out.print("第" + i + "个数据为：");
}
执行顺序是先输入数据//因为hasNextDouble就要输入数据
再输出第i个数据为：//这样就不通顺
所以改成
while (true) {
            System.out.print("第" + i + "数据为：");//先输出
            if (scanner.hasNextDouble())//hasNextDouble输入数据
            {
                double x = scanner.nextDouble();//取出输出数据赋给x
            }else{
                break;
            }
        }
这样顺序就正常了
```

int类型nextInt()，判断用hasNextInt();

double类型nextDouble()，判断用hasNextDouble;

![1672821584634](.\02.png)

2.基本语法

```java
Scanner [名字] = new Scanner(System.in);
Scanner s = new Scanner(System.in);//创建一个Scanner对象，名字为s
```

3.next()

```java
Scanner scanner = new Scanner(System.in);
System.out.println("使用next方式接收：");
//判断用户有没有输入字符串
if (scanner.hasNext()) {
    //使用next方式接受
    String str = scanner.next();
    System.out.println("输入的内容为：" + str);
}
//凡是属于I/O流的类如果不关闭会一直占用资源，要养成关闭的好习惯
scanner.close();
```

![1672821722833](.\03.png)

hello后空格就已经结束了

4.nextLine()

```java
Scanner scanner = new Scanner(System.in);
System.out.println("使用nextLine方式接收：");
//判断用户有没有输入字符串
if (scanner.hasNextLine()) {
    //使用next方式接受
    String str = scanner.nextLine();
    System.out.println("输入的内容为：" + str);
}
//凡是属于I/O流的类如果不关闭会一直占用资源，要养成关闭的好习惯
scanner.close();
```

![1672821821294](.\04.png)

5.判断输入类型

```java
Scanner scanner = new Scanner(System.in);
int i = 0;
float f = 0.0f;

System.out.println("请输入整数：");
if (scanner.hasNextInt()) {         //判断输入是否是int类型
    i = scanner.nextInt();
    System.out.println("整数数据：" + i);
} else {
    System.out.println("输入的不是整数数据！");
}

System.out.println("请输入小数：");
if (scanner.hasNextFloat()) {         //判断输入是否是float类型
    f = scanner.nextFloat();
    System.out.println("小数数据：" + f);
} else {
    System.out.println("输入的不是小数数据！");
}

scanner.close();
```

# if选择结构

```java
//单选择
if(){
    
}
//双选择
if(){
    
}else{
    
}
//多选择
if(){
    
}else if(){
    
}else if(){
    
}else if(){
    
}else{
    
}
```

# Switch选择结构

```java
switch(){				//()中变量类型可以是byte，short，int，char，String
    case value:
        //语句
        break;//可选
    case value:
        //语句
        break;//可选
    default:	//可选择写不写，当case中都不匹配时
        //语句
}
```

# 循环

## while

```java
while(布尔表达式){
    //循环内容
}
先判断再执行
```

## do-while

```java
do{
    //循环内容
}while(布尔表达式)；
先执行再判断，至少会执行一次
```

## for循环

```java
for (int i = 0; 布尔表达式; i++) {
    //循环内容
}

//九九乘法表

for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + '\t');//这里字符用“ ”表字符													串，用‘’会格式转换变成int型，i+‘*’会变成int型
            }
            System.out.println();
        }
```

## 增强for循环

```java
//增强for循环，主要用于数组或集合遍历
        for (声明语句:表达式){
            //循环语句
        }


		int[] numbers={10,20,30,40,50};//定义一个数组
        for (int x:numbers){		//增强for循环，把numbers赋值给x
            System.out.println(x);
        }
```

## break-continue

```java
break		//退出循环或switch语句
continue	//退出当前循环进入下一次循环
goto		//java中没有goto语句，但可以用标签和break或continue实现
outer:for (int i = 0; i < 10; i++) {			//outer是一个标签（lable）
            for (int j = 0; j < i/2; j++) {
                continue outer; //break outer，相当于goto语句;
            }
```

# debug

![1672893696640](.\09.png)

![1672893786574](.\10.png)

# 方法

方法是类中定义的一个函数，叫做方法。

System.out.println(),System是类，out是System中的一个对象，println是一个方法。

## 方法定义和调用

### 定义

```java
{[修饰符]} [返回值类型] [方法名]({参数类型 参数名},{参数类型 参数名}){
    //方法体
    //return [返回值];
}
修饰符：static,final...，可不写
返回值类型：void,int,double,char...
参数可没有
方法体就是方法要实现功能的语句
```

```java
//eg:加法add
public static void main(String[] args) {    //main方法
    int sum = add(2,3);						//add方法调用
    System.out.println(sum);
}
public static int add(int a,int b){     //add方法，把两个数相加
    return a+b;
}
//eg2:比大小
public static int max(int a,int b){
    if(a >= b){
        return a;
    }else{
        return b;
    }
}
```

### 调用

[对象名].[方法名]

eg：scanner.nextLine();

补充：java是值传递

## 方法重载

重载就是一个类中，方法名(函数名)相同，但参数列表不同。

重载规则：

1. 方法名相同

2. 参数列表必须不同（个数不同 or 类型不同 or 参数排列顺序不同）

3. 方法的返回类型可以相同也可以不同

4. 仅仅返回类型不同不能叫重载，只有参数不同才叫重载。

```java
//eg:加法add
public static int add(double a,int b){
}
public static int add(int a,int b,int c,int d){     //个数不同
}
public static int add(double a,double b){	//类型不同
}
public static int add(int b,double a){	//参数排列顺序不同
}
public static double add(double a,double b){		//类型不同，返回类型不同
}
```

## 可变参数

有的时候调用方法，参数个数可能不确定，故用可变参数。

一个方法只能存在一个可变参数，它必须是方法的最后的那个参数，任何普通参数都要在之前声明

```java
//可变参数声明方法
{[修饰符]} [返回值类型] [方法名](参数类型... 参数名){	//这个参数相当于数组，调用参数用参数名[i]
    //方法体
    //return [返回值];
}

public static int add(int a,int b,double... numbers){
}
```

## 递归

方法自己调用自己，但要注意递归要有限，即最终会停止递归，开始返回。如果递归无限会导致栈溢出异常。

```java
//阶乘
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = f(n);
        scanner.close();
        System.out.println(x);
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;			//n==1时停止递归，开始返回
        }
        return n * f(n - 1);	//递归
    }
```

# 数组

## 声明

```java
类型[] 数组名;//声明(定义)首选方法
类型 数组名[];//效果相同，但使用少
//再使用new操作符来分配空间，创建数组
数组名 = new 类型[数组大小];

int[] a;//定义,(方法中声明参数是数组时，参数就是这样写，就不用new)
a=new int[10];//定义10个int类型变量

//合在一写成，最常用
类型[] 数组名 = new 类型[数组大小];//一般用于引用类型的数组声明

int[] a = new int[10];

//当把一个数组赋给另一各数组
int[] a = new a[10];
int[] b = a;		//这里b就不用再new占用堆空间了
```

补充：

1. 数组一般从0开始
2. 数组名.length表示数组长度
3. java.lang.IndexOutOfBoundsException（数组下标越界异常），一般出现是因为数组定义了两个(a[0],a[1])，却去访问a[2]
4. java中对象(用new操作符创建)都存在堆中，数组也是一个对象，是引用类型。

## 静态初始化

```java
//1
数组类型 [] 数组名 = {em1,em2,em3,…,emN};//声明数组的时候初始化，一共N个元素，例如：
int[] array = {3,5,4,8,12,5};//一共六个元素
//引用类型静态初始化
Man[] mans = {new Man(),new Man()}//Man()是选择无参构造器。

//2
数组类型[] 数组名 = new 数组类型[] {em1,em2,em3,…,emN};用new关键字声明数组的同时初始化数组
eg：int[] array = new int[] {2,4,5,6,8,9};array数组一共五个元素。
//静态初始化，数组会赋初值，故[]中不用写数字指明几个元素
```

## 动态初始化

```java
数组类型[] 数组名 = new 数组类型[] 
int[] array = new int[];
array[0] = 1;
array[1] = 1;
array[2] = 1;
array[3] = 1;
```

## 数组遍历

```java
//1
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}

//2，没有数组下标
for (int i : array) {
            System.out.println(i);
}
```

## 多维数组

![1672920878903](.\11.png)

```java
二维数组
int[][] array = new int[3][2];
静态初始化
int[][] array = {{1,2},{2,3},{3,4}};
动态初始化
int[][] array =new int[3][2];

遍历
int[][] array = new int[2][5];
for (int i = 0; i < array.length; i++) {	//从图中可以解释，array.length指的是行数
	for (int j = 0; j < array[i].length; j++){//从图中可以解释，array[i].length指的是第i行列数
		System.out.println(array[i][j]);
            }
}
```

## Arrays类

在java.util.Arrays包里，使用前先导包 import java.util.Arrays;

```java
int[] a = {1,5,3,6,2,4};
System.out.println(Arrays.toString(a));//以字符串形式，输出数组元素，输出为[1, 5, 3, 6, 2, 4]
Arrays.sort(a);                        //将数组a中元素排序
System.out.println(Arrays.toString(a));//输出为[1, 2, 3, 4, 5, 6]
```

# 面向对象(OOP)

- 面向过程：实现程序，分步走，第一步干什么，第二步干什么...
- 面向对象：分析要实现哪些功能，把同一类功能分在一类，实现程序时调用类就行

- 面向对象编程本质：以类的方式组织代码，以对象的方式组织(封装)数据。
- 三大特性：封装，继承，多态

## 方法加深

方法一定要在类里面

### 方法异常抛出

```java
public void readFile(String file) throws IOException{// I/O异常抛出
    
}
```

### 方法调用

#### 静态方法

static方法修饰的方法和类一起加载，没有static修饰的方法只有实例化(new)后才会加载。

```java
public class Student {
    public static void say(){
        System.out.println("说悄悄话");
    }
}
//静态方法   say方法有static
Student.say();//注意方法调用一定要有()在后面

public class Student {
    public static void a(){
        b();	//这样写会报错，因为b没有static修饰，未实例化，没有加载,而static修饰的a，在Student类加载时，a就会加载。
    }
    public void b(){
        a();
    }
}
```

#### 非静态方法

使用new关键字创建对象时，会分配内存空间给对象，且会默认初始化，以及对对象所属类中构造器的调用

```java
public class Student {
    public  void say(){
        System.out.println("说悄悄话");
    }
}
//非静态方法		Student类没有有static
Student student = new Student();//没有Static，先new实例化
//类 对象名 = new 类();
//类 对象名 = 对象值;new后面的(对象值)就是调用什么构造器
student.say();
```

#### 形参和实参

C语言里你学过

#### 值传递和引用传递

```java
//值传递
public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        change(a);
        System.out.println(a);
    }

    public static void change(int a){
        a=10;
    }
}
//最后输出1


//引用传递，java中只有对象才是引用传递，但本质是值传递，相当于C语言中传递指针
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "QMF";
        change(person);
        System.out.println(person.name);
    }
    public static void change (Person person){
        person.name= "Q.M.F.";
    }
}
class Person {
    String name;
}
//因为是引用传递，最后输出Q.M.F.
```

## 类与对象创建

类是一种抽象数据类型

对象是类的具体实例，用new来创建

```java
定义一个类
public class Student { //static 不一定所有class都要用
    //一个类中只有方法和属性
    //属性：静态的属性
    String name;
    int age;


    //方法：动态的行为
    public void study(){
        System.out.println(this.name+"在学习");
    }
}

对类进行操作
public class Application {
    public static void main(String[] args) {	//一个项目中只有一个main方法
        //类：抽象的
        //类用new实例化生成一个对象
        //student对象就是Student类的具体实例
        Student student = new Student();
        student.name= "XiaoMing";
        student.study();
    }
}
```

![1673055895135](.\14.png)

从这可以看出对象是应用类型，对象名空间存放的是对象空间的地址

## 构造器

构造器也叫构造方法，在创建对象时必须要调用的。构造器有以下两个特点：

1. 必须和类的名字相同
2. 必须没有返回类型，也不能写void
3. 无参构造是隐藏代码，默认就有，也可以显示定义
4. 若显示定义了有参构造，无参构造也必须显示定义出来，否则无参构造就不会默认就有

构造器作用

1. 使用new关键字，本质时调用构造器
2. 用来初始化值

```java
public class Person {
    String name;
    public Person(){	//有参构造，Person类的构造器(构造方法)，如果自己没写，系统会自动生成，但看不到。
        this.name = QMF;//一般构造器用于类中属性初始化
        
    }
    public Person(String name1){//有参构造；一旦定义有参构造，无参构造就必须显示定义（自己得写出来）
        this.name = name1;
    }
}
```

IDEA中生成构造器快捷键"alt + Insert"，如果是笔记本还得多加个Fn键

![1673001957646](.\12.png)

![1673002067324](.\13.png)

## 对象的使用

```java
对象的属性调用：对象名.属性名
对象的方法调用：对象名.方法名()
```

## this关键字

this.[属性名 or 方法名()]，表示当前类的属性或方法

## 封装

1. 把类的属性or方法，该露的露，该藏得藏，有的可以直接访问有的不行，一般大多数细节都应该隐藏起来，暴露少量方法给操作接口访问。
2. 属性私有：get/set方法
3. 权限：

|  修饰词   | 同一个类 | 同一个包 | 子类     | 所有类   |
| :-------: | :------: | -------- | -------- | -------- |
|  public   | 允许访问 | 允许访问 | 允许访问 | 允许访问 |
| protected | 允许访问 | 允许访问 | 允许访问 |          |
|  default  | 允许访问 | 允许访问 |          |          |
|  private  | 允许访问 |          |          |          |

private常用于封装，私有权限。
public修饰的类：在不同包内也可以访问。
default访问权限又叫包访问权限：在这种权限下，可以访问在同一个包中的其他的类。

### get/set方法

IDEA快捷键：alt + Insert，笔记本要多加一个Fn键，Fn + alt + Insert

![1673058609653](.\15.png)

![1673058730271](.\16.png)

```java
/*
*封装作用：
*提高程序安全性，保护数据
*隐藏代码的实现细节
*统一调用接口
*系统可维护性增加
*/
public class Student {
    //private 私有权限，用get/set获取属性和方法；
    private String name;//姓名
    private int id;//学号
    private char sex;//性别
    int age;//年龄

    //get/set,提供一些方法来操作上面属性。
    //get 获得属性
    //set 给属性赋值
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //alt+Insert快捷键
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {		//可以进一步设置年龄的规范
        if (age > 120 || age < 0) {
            System.out.println("年龄不合法");
        } else
            this.age = age;
    }
}
```

## 继承

1. 继承本质是对某一批类的抽象，狗->哺乳类->动物类

2. Java只有子类只能单继承，不能继承多个父类，一个儿子只能由一个父亲，一个父亲可以有多个儿子

3. 继承是类和类之间的关系，除继承以外类和类之间关系还有依赖，组合，聚合等

4. 继承关系的两个类，一个为父类(基类)，一个为子类(派生类)，子类继承父类，用关键字extends(扩展)来表示，子类是父类的扩展

5. 子类继承父类，就会拥有父类的全部方法和属性(如果权限是private就不会拥有属性，因为是父类的属性，方法一般不会用privat修饰)

6. final修饰，已经固定也不能继承

   ```java
   //父类
   public class Person {
       
   }
   //子类，派生类
   public class Student extends Person{
       
   }
   public class Teacher extends Person{
       
   }
   
   //final修饰的父类
   public final class Person {
       
   }
   
   //子类，派生类
   public class Student extends Person{ //这里继承会报错
       
   }
   
   ```

### object类

IDEA快捷键ctrl + h，打开继承树，有个object类，这是所有类默认的父类，默认存在，和无参构造一样可以写也可以不写默认存在。

![1673073743288](.\17.png)

### super

super.[属性名 or 方法名()]，表示父类的属性或方法

```java
//父类
public class Person {
    protected String name = "QMF";
}


//测试的一个main函数
public class Application {
    public static void main(String[] args) {
       Student student= new Student();
       student.printName("w_lai");
    }

//子类
public class Student extends Person {
    protected String name = "Q.M.F.";

    public void printName(String name) {
        System.out.println(name);		//w_lai
        System.out.println(this.name);	//Q.M.F.
        System.out.println(super.name);	//QMF
    }
}

```

super关键字还可以用于，调用父类的构造函数，super()，new一个子类会自动调用构器造

```java
//Person父类
public class Person {
   public Person(){
       System.out.println("我是父类，Person");
   }
}

//测试函数
public class Application {
    public static void main(String[] args) {
        Student student = new Student();
    }
}
/*不管Student类的构造器里有没有super(),输出的都是
*我是父类，Person
*我是子类，Student
*/

//Student子类
public class Student extends Person {
    public Student(){
        super();//调用student无参构造时隐藏的代码，即使没写也会调用
        		//且super();调用父类构造必须写在第一行，否则会报错
        //this.super	//如果还用调用Student自己构造器也要写在第一行，
        				//所以构造器中第一行要么调用父类构造器，要么调用
        				//自己构造器放在第一行
        System.out.println("我是子类，Student");
    }
    public Student(String name){
        this.name = name;
    }
    private String name;
}
```

```java
//Person父类
public class Person {
   public Person(String name){
       System.out.println("我是父类，Person");
   }
}

//Student子类
public class Student extends Person {
    public Student(){
        super();	//父类有有参构造，无参构造没有显示定义，就没有无参构造
        			//这里super();调用父类无参构造但父类没有无参构造会报错
    }
}

//Student子类
public class Student extends Person {
    public Student(){
        super("Q.M.F.");//这里调用有参构造才对;
    }
}
```



super注意点：

1. super调用父类的构造方法，必须在子类构造方法的第一行；

2. super必须只能出现在子类的方法或者构造器中

3. super和this不能同时调用构造方法，因为都要写在第一行



VS this

1. 代表的对象不同

   this：调用自己类里的东西

   super：调用父类里的东西

2. 前提

   super：只能在有继承条件下才能使用

   this：无继承就能使用

3. 构造方法调用

   this();调用本类的构造

   super();调用父类的构造

### 方法重写（override）

为什么要重写

1. 父类的功能子类不需要或条件不满足

注意点
1. 重写要有继承关系，子类重写父类的方法。
2. 方法名必须相同，参数列表要相同，修饰符重写范围可以扩大不能缩小，public>protected>Default>private
3. 抛出的异常：范围可以缩小不能扩大；ClassNotFoundException --> Exception(大)
4. 重写和重载都是，类中方法的重载或重写，属性没有重载或重写。
5. 快捷键：alt + Insert —> 选择override
6. @override，注解，有功能的注释

方法非静态，且方法修饰符只能是public

```java
//测试main函数
public class Application {
    public static void main(String[] args) {
        A a = new A();
        a.test();//调用A的方法
        B b = new A();//父类的引用可以指向子类，但不能A c = new B();
        b.test();//调用B的方法
        		 //从此看出方法调用，只与等号左边定义类型有关（B b = new A()），和new后面的无关
    }
}
//输出是
//A's test()
//A's test()



//父类
public class B {
    public void test(){
        System.out.println("B's test()");
    }
}

//子类
public class A extends B{
    @override//注解
    public void test(){//重写父类的方法
        System.out.println("A's test()");
    }
}
```

方法静态：这里不叫重写

```java
//测试main函数
public class Application {
    public static void main(String[] args) {
        A a = new A();
        a.test();//调用A的方法
        B b = new A();//父类的引用可以指向子类，但不能A c = new B();
        b.test();//调用B的方法
        		 //从此看出方法调用，只与等号左边定义类型有关（B b = new A()），和new后面的无关
    }
}
//输出是
//A's test()
//B's test()



//父类
public class B {
    public static void test(){
        System.out.println("B's test()");
    }
}

//子类
public class A extends B{
    public static void test(){//重写父类的方法
        System.out.println("A's test()");
    }
}
```

### 多态

1. 同一方法可以根据发送对象的不同，而采用多种不同的行为方式
2. 多态是方法的多态，属性没有多态
3. 父类和子类，有联系。
4. 对象进行类型转换必须有父子联系才能转换。没有关系则会报ClassCastException(类型转换异常)
5. 存在条件：继承关系，方法需要重写，父类引用指向子类对象，用重写的方法。Father f1 = new Son();
6. Static 修饰的方法，是静态方法属于类，随类一起加载，不属于实例故不会重写
7. final 常量，已经固定也不能重写
8. private修饰也不能重写

```java
public static void main(String[] args) {
    //一个对象的实际类型式确定的
    //new Student();
    //new Person();

    //可以指向的引用类型就不确定了
    //Student 能调用的方法都是自己的或者继承父类的
    Student s1=new Student();
    
    
    //父类的引用可以指向子类
    //Person 父类型，可以指向子类，但是不能调用子类特有的方法
    Person s2 = new Student();
    Object s3 = new Student();
    s2.run();//子类重写父类方法，执行子类方法
    s2.eat();//子类没有重写父类，这个方法调用会报错
    		 //对象能执行哪些方法，主要看左边类型，和new 右边关系不大，
    		 //除非右边重写左边方法才会执行重写的方法
    		 //如果一定要调用可以进行类型转换((Student)s2).eat();
}

//父类
public class Person {
    public void run(){
        System.out.println("冲啊");
    }
}

//子类
public class Student extends Person{
    @Override
    public void run() {
        System.out.println("奔跑吧");
    }
    public void eat(){
        System.out.println("eat");
    }
}
```

## instanceof

instanceof是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例(new)，而不是比较引用，返回 boolean 的数据类型。
instanceof，判断一个对象是属于谁的子类或者是什么类
示例：

A x = new b();

x instanceof  Y，

1. 如果A和Y属于同一条线，编译成功，否则编译不成功报错
2. A和Y属于同一类，且b如果是Y类或是Y类的子类返回true，否则返回false

```java
//父类
public class Person {
}
//子类
public class Teacher extends Person{
}
public class Student extends Person{
}

//测试main函数
public class Application {
    
    //Object -> Person
    //Object -> String
    //Object -> Person -> Student
    //Object -> Person -> Teacher
    public static void main(String[] args) {
        Object object = new Student();
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        											 //不会报错是因为Object里有String

        Person person = new Student();
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        System.out.println(person instanceof String);//编译报错因为完全不属于同一条线
        
        Student student = new Student();
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        System.out.println(student instanceof Teacher);//编译报错因为完全不属于同一条线
        System.out.println(student instanceof String);//编译报错因为完全不属于同一条线

    }
}

```

## 引用类型的类型转换

### 强制转换

高转低要强制转换：父 -> 子

```java
//父类
public class Person {
    public void run(){
        System.out.println("run");
    }
}

//子类
public class Student extends Person{
    public void go(){
        System.out.println("go");
    }
}

//测试类
public class Application {
    public static void main(String[] args) {
        //子 -> 父 子类可以用父类的属性和方法无须转换。

        //引用类型转换 父 -> 子要强转
        Person people = new Student();
        people.go();//报错，不能使用子类方法
        ((Student)people).go();
    }
}

```

### 自动转换

低转高：子 -> 父，但可能会丢失子类自己原有的一些方法

```java
//父类
public class Person {
    public void run(){
        System.out.println("run");
    }
}

//子类
public class Student extends Person{
    public void go(){
        System.out.println("go");
    }
}

//测试类
public class Application {
    public static void main(String[] args) {
        
        Student student = new Student();
		Person person = student;//自动转换
		person.go();//报错，自动转换会丢失子类方法
    }
}
```

## Static详解

Static(静态)

1. 方法 or 属性

```java
public class Student {
    private static int age;
    private double score;

    public static void run(){
        System.out.println("奔跑吧");
    }

    public void go(){
        System.out.println("走吧");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.age);//static静态变量，和类一起加载可以调用
        //System.out.println(Student.score);//score非静态变量，没有new一个实例无法调用
        System.out.println(s1.age);
        System.out.println(s1.score);
        Student.run();//static静态方法，和类一起加载可以调用
        run();//static静态方法，和类一起加载可以调用，就在类里面可以直接调用
        Student.go();//go(）非静态方法，没有new一个实例无法调用
        go();//go(）非静态方法，没有new一个实例无法调用
        new Student().go();
        new Student().run();
    }

}
```

2. 匿名代码块，静态代码块
```java
public class Person {
    {
        //代码块(匿名代码块)
        System.out.println("匿名代码块");
    }
    static{
        //静态代码块，类Person一加载就执行，且执行一次
        System.out.println("静态代码块");
    }
    public Person(){
        System.out.println("无参构造");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("================");
        Person person2 = new Person();
        
        /*输出结果：
        *new完Person1：
        * 静态代码块    //静态代码块指执行一次，故person2没有这句
        * 匿名代码块
        * 无参构造
        * ================
        *new完Person2：
        * 匿名代码块
        * 无参构造*/
    }
}
```

3. 静态导入包

```java
import static java.lang.Math.random;//静态导入方法
import static java.lang.Math.PI;//静态导入常量
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.random());//没有静态导入方法时只能这样调用
        System.out.println(random());//静态导入后可以只写方法名
        System.out.println(PI);//静态导入常量后可以只写方法名
    }
}
```

## 抽象类

1. 声明类时添加一个abstract修饰符，就是声明一个抽象类
2. 抽象类有声明(约束/规范)，有普通方法，但抽象方法的实现由子类来实现
3. 抽象类的所有方法，继承他的子类，都必须要实现他声明的抽象方法，除非子类也是抽象类
4. 抽象类也只能单继承，接口才能多继承
5. 抽象类不能new，只能定义抽象方法，子类必须要实现他。
6. 抽象类中可以出现普通方法
7. 抽象方法只能在抽象类中

```java
//抽象类
public abstract class Action {
    
    //声明一个抽象方法，可以没有代码块，具体实现可由别人实现
    //只有方法名，没有方法体
    public abstract void go();//抽象方法
    
    public void run(){		  //普通方法
        System.out.println("run");
    }
    
}


//继承抽象类的子类
public class A extends Action{
    //抽象类的所有方法，继承他的子类，都必须要实现他声明的抽象方法，除非子类也是抽象类
    //抽象类也只能单继承，接口才能多继承
    @Override
    public void go() {
        System.out.println("走吧");
    }
    
}
```

## 接口

接口作用：

1. 接口只有声明(约束/规范)，没有普通方法。(java中编程要实现约束和实现分离：面向接口编程)

2. 方法默认修饰符public abstract
3. 里面属性默认是常量，默认修饰符public static final
4. 接口不能new实例化，接口中没有构造器
5. implements可以实现（继承）多个接口
6. 实现类所继承的接口中，接口所约束的所有方法必须全都实现

```java
public interface UserService {
    
    //接口中定义的属性都是常量，隐藏代码是public static final
    int AGE = 99;//=public static final int AGE = 99;
    
    
    //接口中所有定义其实都是抽象的 public abstract，且默认存在，隐藏代码
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}

//interface接口需要有实现类，且要实现全部方法
//实现类需要重写接口的方法，快捷键alt + Insert，笔记本多加一个Fn，--->Implement Methods...
public class UserServiceImpl implements UserService{
    @Override
    public void add(String name) {
        
    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }
    public static void main(String[] args) {
        System.out.println(UserService.AGE);//调用接口里的常量
    }
}

```

2. 接口可以多继承

```java
//UserService接口
public interface UserService {
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}

//TimeService接口
public interface TimeService {
    void timer();
}

//实现类
public class UserServiceImpl implements UserService,TimeService{

    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void timer() {

    }
}

```

# 内部类

```java
public class Outer {									//外部类
    private int id = 10;

    public void out() {
        System.out.println("外部类");
    }

    private void run() {
        System.out.println("haha");
    }

    public class Inner {								//内部类
        public void in() {
            System.out.println("内部类");
        }

        //获得外部类私有属性,和方法
        public void getID() {
            System.out.println(id);
            run();
        }

    }
}

测试类
public class Application {
    public static void main(String[] args) {
        Outer outer= new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.in();
        outer.out();
    }
}
```
静态内部类

```java
public class Outer {
    public static class Inner{
        
    }
}
```

java类可以有多个类

```java
public class Outer {
   
}
//一个java类中可以有多个class类，但只能有一个public class
class A{
    
}
class B{
    
}
```

局部内部类，在方法里面

```java
public class Outer {
    public void method(){
        class Inner{//局部内部类
            public void in(){
                
            }
        }
    }
}
```

匿名内部类：new一个对象无须写对象名

```java
public class Outer {
    public static void main(String[] args) {
        new Apple().eat();//匿名使用内部类，叫匿名内部类
        new UserService(){//匿名

            @Override
            public void hello() {
                System.out.println("haha");
            }
        };
    }
}
class Apple{
    public void eat(){
        System.out.println("Apple");
    }
}
interface UserService{
    void hello();
}
```

# Error和Exception

1. Error（错误）:是程序无法处理的错误，表示运行应用程序中较严重问题。大多数错误与代码编写者执行的操作无关，而表示代码运行时 JVM（Java 虚拟机）出现的问题。例如，Java虚拟机运行错误（Virtual MachineError），当 JVM 不再有继续执行操作所需的内存资源时，将出现 OutOfMemoryError。这些异常发生时，Java虚拟机（JVM）一般会选择线程终止。这些错误表示故障发生于虚拟机自身、或者发生在虚拟机试图执行应用时，如Java虚拟机运行错误（Virtual MachineError）、类定义错误（NoClassDefFoundError）等。这些错误是不可查的，因为它们在应用程序的控制和处理能力之 外，而且绝大多数是程序运行时不允许出现的状况。对于设计合理的应用程序来说，即使确实发生了错误，本质上也不应该试图去处理它所引起的异常状况。在 Java中，错误通过Error的子类描述。 

2. Exception（异常）:是程序本身可以处理的异常。Exception 类有一个重要的子类 RuntimeException。RuntimeException 类及其子类表示“JVM 常用操作”引发的错误。例如，若试图使用空值对象引用、除数为零或数组越界，则分别引发运行时异常（NullPointerException、ArithmeticException）和 ArrayIndexOutOfBoundException。
3. Exception（异常）分两大类：运行时异常和非运行时异常(编译异常)。程序中应当尽可能去处理这些异常。
         1)运行时异常：都是RuntimeException类及其子类异常，如NullPointerException(空指针异常)、IndexOutOfBoundsException(下标越界异常)等，这些异常是不检查异常，程序中可以选择捕获处理，也可以不处理。这些异常一般是由程序逻辑错误引起的，程序应该从逻辑角度尽可能避免这类异常的发生。运行时异常的特点是Java编译器不会检查它，也就是说，当程序中可能出现这类异常，即使没有用try-catch语句捕获它，也没有用throws子句声明抛出它，也会编译通过。
         2)非运行时异常 （编译异常）：是RuntimeException以外的异常，类型上都属于Exception类及其子类。从程序语法角度讲是必须进行处理的异常，如果不处理，程序就不能编译通过。如IOException、SQLException等以及用户自定义的Exception异常，一般情况下不自定义检查异常。
4. 异常和error类

![error和异常](.\18.png)

# 捕获和抛出异常

异常处理关键字：try、catch、finally、throw、throws

### 抛出异常

- 程序本身可能无异常但想抛出一个异常，用throw，throws关键字

```java
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            if (b == 0) {
                throw new ArithmeticException();//主动抛出异常
            }
        } catch (ArithmeticException e) {
            System.out.println("异常");
        }
    }
```

- 抛出异常一般写在方法中，方法里抛出异常，抛出的是一个异常对象
```java
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        new Test().test(a, b);

    }
//抛出异常
    public void test(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();//抛出异常，并在console处打印错误信息
            								//在方法执行时抛出异常
        }
        System.out.println(a / b);
    }
}
```
- 方法上抛出异常，指明有可能在方法中出现的异常，是一个声明
```java
 public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            new Test().test(a, b);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    public void test(int a, int b) throws ArithmeticException {//列出有可能的异常
        if (b == 0) {
            throw new ArithmeticException();
        }
        System.out.println(a / b);
    }
}
```

### 捕获异常

try、catch一定要有，finally可以没有，有了try、catch程序碰见异常可以正常继续运行，没有则程序会停止

```java
public class Test {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try {//try 监控区域，监控是否出现异常
            System.out.println(a/b);
        }catch (ArithmeticException e){//如果监控区域出现ArithmeticException异常，那么执行catch里代码块
            System.out.println("程序出现异常，除数不能为0");
        }finally {//最后执行，善后
            System.out.println("finally");
        }
    }
}
```

可以写多个catch(){}，捕获多个异常，但必须保证( )中异常或error，子类写在上面，父类写在下面

```java
public class Test {
    public static void main(String[] args) {
        try {
            new Test().a();
        }catch (Error e){//Error是Throwable的子类
            System.out.println("Error");
        }catch (Exception e){//Exception是Throwable的子类
            System.out.println("Exception");
        }catch (Throwable t){//最大的类
            System.out.println("Throwable");
        }

    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
```

快捷键 ctrl + alt + t

1. 光标移到相应代码

![](.\19.png)

2. 按下快捷键，选择以下三种方式

![](.\20.png)

3. 最后结束
![](.\21.png)

4. throw new RuntimeException(e)，用于打印错误信息。
5. e存的就是StackOverflowError，异常或者错误(error)是什么类。

# 自定义异常

```java
public class MyException extends Exception {
    //定义，当传递数字大于10时，抛出异常
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    //toString方法，返回异常信息

    @Override
    public String toString() {
        return "MyException{" + "detail=" + detail + '}';
    }
}
```

# toString方法

toString方法它通常只是为了方便输出，比如System.out.println(xx)，括号里面的“xx”如果不是String类型的话，而是对象就自动调用xx对象里所有类的父类Object的toString()方法，或者时自己重写的toString()方法。