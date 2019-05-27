# Solve_Leetcode
复习的过程，来刷刷题，坚持坚持坚持！
## [0150](0150.java)
逆波兰表达式

题目如下：
![](http://ww1.sinaimg.cn/large/006XKThBly1g38vin0m1cj31kw0rj0xi.jpg)
* 使用了 class Stack<E>
> A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations, which should be > used in preference to this class. (by Java API)
  此处日后改进。
  
* Integer.parseInt()
> public static int parseInt(String s)throws NumberFormatException

* for each循环

## [0001](0001.java)
Two Sum

题目如下：
![](http://ww1.sinaimg.cn/large/006XKThBgy1g3b11gsb6yj31kw0ssdk7.jpg)
* 官网描述此方法为"Brute Force",的确是蛮力。

* 关于数组的定义并没有想象中的那么熟练。
> int ans[] = new int[2];

* HashMap的方法继续学习。

## [0020](0020.java)
Valid Parentheses

题目如下：
![](https://i.loli.net/2019/05/24/5ce770ccdbd0937877.jpg)
* Stack泛型
> Character 和 char的关系，还有Integer和int的关系。前者是后者的包装(wrap)类，提供很多方法。

> The Character class wraps a value of the primitive type char in an object. An object of type Character contains a single field whose type is char. In addition, this class provides several methods for determining a character's category (lowercase letter, digit, etc.) and for converting characters from uppercase to lowercase and vice versa.--by Java API10

* s.toCharArray()
> 在看别人写的代码发现for-each循环里直接使用这种方法来遍历s，而不是再重新定义一个数组。
```java 
   for(char c : s.toCharArray){...}
```
* Hashmap的使用
> 将三种括号进行匹配，遍历时遇到左括号入栈的是右括号，遇到右括号则与栈顶元素比较。
> 此种写法提交到[0020v2](0020v2.java)

## [0155](0155.java)
Min Stack

题目如下：
![](https://i.loli.net/2019/05/25/5ce8e4f68ca1388723.jpg)
* 使用两个Stack，一个用来存放正常出入栈的数据，另一个存储每次操作中的最小值。
* 入栈时注意应是小于等于。

## [0232](0232.java)
Implement Queue using Stacks

题目如下：
![](https://i.loli.net/2019/05/26/5cea1decf08ae87020.jpg)
* 使用两个Stack,获取队头数据的时候就先把存数据的堆栈内容全部出栈再入备用栈，完成之后反过来再进行此过程。
* 队列和堆栈的特点。

##[0844](0844.java)
Backapace String Compare

* 题目假设字符串里面只有小写字母或者#，所以写了一个判别方法，看别人代码时发现有点多余。
* 关于各种情况的判别考虑不够简洁，看到一个优秀代码，上传在[0844v2](0844v2.java)。 
