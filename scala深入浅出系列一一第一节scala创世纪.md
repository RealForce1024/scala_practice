## Scala诞生与流行记 #

```
Scala Class = if( Jaded by Java, restless with Ruby ) { Try some Scala }
```
上面的一段伪代码，正是Scala语言被创造出的理由，即天才工程师的需求。当疲惫于Java，不安于Ruby的时候，你应该去使用Scala了。

Java被一些新生代语言的使用者所诟病，过于啰嗦，繁琐，但是其在当今世界开发语言使用量中，无出其右，适合集团军作战的优秀语言。而Ruby语言则凭借其优美简练灵活的动态语言特性，深深吸引了一大批追求自由的工程师，他们不甘于平庸的Java。但Ruby实在是性能太慢了。

以上只是简单的说了下被广泛使用的Java和Ruby，并不想抛出“Php是当今世界上最优秀的开发语言”这样永远不会有结论的议题。只有适不适合自己的需求的语言。

每种语言被创造的时候都有被赋予的使命，而Scala语言是为了大数据时代而生。如今火爆的Spark平台实现语言就是基于Scala而构建的。正如Rails引爆了Ruby，历史总是如此的巧合。



##Scala出生到一路成长 

> 联邦理工学院洛桑（EPFL）的Martin Odersky于2001年基于Funnel的工作开始设计Scala。Funnel是把函数式编程思想和Petri网相结合的一种编程语言。Odersky先前的工作是Generic Java和javac（Sun Java编译器）。Java平台的Scala于2003年底/2004年初发布。.NET平台的Scala发布于2004年6月。该语言第二个版本，v2.0，发布于2006年3月。
> 截至2009年9月，最新版本是版本2.7.6 。Scala 2.8预计的特性包括重写的Scala类库（Scala collections library）、方法的命名参数和默认参数、包对象（package object），以及Continuation.
> 2009年4月，Twitter宣布他们已经把大部分后端程序从Ruby迁移到Scala，其余部分也打算要迁移。此外， Wattzon已经公开宣称，其整个平台都已经是基于Scala基础设施编写的。

如今的Scala官网上挂了更多的大平台公司，Twiter, LinkedIn, Interl等
##Scala语言特性 
Scala 是 "Scalable"单词的简写，"A Scalable Language" 一种可伸缩式；可攀登式或可升级式的语言，这意味着你可以和它一起成长。你可以在命令行中输入一行表达式直接看结果，就类似于脚本语言Python、Ruby、NodeJs等一样快速便捷。但同时你也可以依赖Scala构建大型稳定的关键平台系统，现在有很多大公司的核心关键系统都在使用。

> ####面向对象特性
> Scala是一种纯面向对象的语言，每一个值都是对象。对象的数据类型以及行为由类和特征(Trait)描述。类抽象机制的扩展有两种途径。一种途径是子类继承，另一种途径是灵活的混入（Mixin）机制。这两种途径能避免多重继承的种种问题。[4]
> ####函数式编程
> Scala也是一种函数式语言，其函数也能当成值来使用。Scala提供了轻量级的语法用以定义匿名函数，支持高阶函数，允许嵌套多层函数，并支持柯里化
> 。Scala的Case Class及其内置的模式匹配相当于函数式编程语言中常用的代数类型（Algebraic Type）。[4] 
> 更进一步，程序员可以利用Scala的模式匹配，编写类似正则表达式的代码处理XML数据。在这些情形中，顺序容器的推导式（comprehension）功能对编写公式化查询非常有用。
> 由于JVM不支持尾部递归，Scala也不能完全支持尾部递归优化。不过，在简单的情况下，Scala编译器可以把尾部递归优化成循环。
> 以下代码以函数式风格实现了快速排序算法，可以与Erlang快速排序的例子做个比较：

```
def qsort(list: List[Int]):
> List[Int]= list match{ case Nil => Nil case pivot::tail => qsort(for(i
> <- tail if i < pivot)yield i)::: pivot :: qsort(for(i <- tail if i >=
> pivot)yield i) } 
```

> ####静态类型 
> Scala是具备类型系统，通过编译时的检查，保证代码的安全性和一致性。类型系统具体支持以下特性：
> 泛型类，型变注释（Variance
> Annotation），类型继承结构的上限和下限，把类别和抽象类型作为对象成员，复合类型，引用自己时显式指定类型，视图，多态方法。
>#### 扩展性
> Scala的设计承认一个事实，即在实践中，某个领域特定的应用程序开发往往需要特定于该领域的语言扩展。Scala提供了许多独特的语言机制，可以以库的形式轻易无缝添加新的语言结构：
> 任何方法可用作前缀或后缀操作符，可以根据预期类型自动构造闭包。联合使用以上两个特性，使你可以定义新的语句而无须扩展语法也无须使用宏之类的元编程特性。

##水要持续的烧，开始Hello Scala吧。
大数据时代，Scala将是你的最佳首选。
下一节将详细讲解 搭建Scala开发环境