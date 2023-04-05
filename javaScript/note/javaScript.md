# 1、什么是javaScript

javaScript是一个脚本语言

# 2、快速入门

## 2.1、引入javaScript

注释

```javascript
//单行注释
/* 多行注释 */
```



1.添加JavaScript内部标签

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<!--script标签内写JavaScript代码-->
    <script>
        alert('hello,world!');
    </script>

</head>
<body>

<!--这里也可以放script标签-->
</body>
</html>
```

2.外部引入

先html中引入，**注意script标签必须成对出现**

```html
<script src="js/JavaScript.js"></script>

<script src="js/JavaScript.js" type="text/javascript"></script><!--type属性可写可不写-->
```

然后在JavaScript.js中写入代码，**注意分号（ ; ）结尾**

```javascript
alert('hello,world!');
```

## 2.2、基本语法

alert是弹窗

console.log( );是输出

```javascript
    //JavaScript区分大小写
    //  1.定义变量    变量类型 变量名 = 变量值;
    //  javaScript 变量类型只有var
    var num = 1;
    console.log(num);
    //  2.条件控制
    if (2 > 1) {
        alert("true");
    }
    //双if
    var score = 70;
    if (score > 60) {
        alert("大于60");
    } else if (score < 80) {
        alert("小于80");
    }
    //嵌套
    if (score > 0 && score < 100) {
        if (score > 60) {
            alert("及格");
        }
    }
```

## 2.3、数据类型

数值、文本、图形、音频、视频......

==变量==

```javascript
var 变量名 = 变量值，
```





==number==

js中不区分小数和整数，统统用number

```javascript
123 // 整数
123.1 // 浮点数
1.123e3 // 科学计数法
-99		// 负数
NaN		//not a number
Infinity // 表示无限大
```



==字符串==

'abc'	"abc"



==布尔值==

true	false



==逻辑运算符==

```javascript
&&	两个都为真，结果为真

||	一个为真，结果为真

!	非，非真=假，非假=真
```



比较运算符！！！！重要！

```javascript
=		赋值
==		等于	(类型不一样，值一样，判断为true)
=== 	绝对等于(类型一样，值一样判断为true)
```

这是JS的缺陷，坚持不要使用==进行比较

须知：

- NaN===NaN，返回的是false，因为NaN与所有的数都不相等，包括自己。

- 只能通过方法isNaN( NaN )，来判断该是否是NaN。

  

浮点数问题：

```javascript
console.log( (1/3) === (1 - 2/3) )
```

无论是Java还是JS都尽量避免使用浮点数进行运算，存在精度问题！

Java中使用bigdecimal类才能避免。



==null和undefinde==

- null 空
- undefined 未定义



==数组==

Java中必须要是一系列相同类型的对象，JS中不需要这样。

```javascript
var arr = [1, 2, 3, 4, 5, 'hello', null, true]；
new array(1, 2, 3);//这样也可以，但尽量使用第一种，可读性更高。
var arr2 = [
   {"num":"1","name":"Tom","age":20},
   {"num":"2","name":"Jane","age":18},
   {"num":"3","name":"Jenny","age":22}
   ];//对象数组进行定义
```

数组下标越界会显示：undefinded



==对象==

对象是大括号，数组是中括号

对象中属性用' , '隔开，最后一个属性不需要' , '隔开。

```javascript
//对象的定义:
//Person person = new person(变量1, 变量2, 变量3...);//java写法
var person = {
    name: 'haha',
    age: 3,
    tags: ['js', 'java', 'html']
}


//对象中属性的引用
console.log(person.name);
console.log(person.age);
console.log(person.tags[0]);
```



==严格检查模式==

use strict

```javascript
'use strict';
var i = 1;	//全局变量
let j = 2;	//局部变量
```

'use strict';	是严格检查模式，写JS时最好都带上，必须写在JS的第一行，预防JS的随意性导致产生一系列问题，使用前提时JS支持ES6语法。

局部变量用let定义，全局用var定义
