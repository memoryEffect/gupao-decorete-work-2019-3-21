思考并总结装饰者模式和适配器模式的根本区别:

适配器模式是在不改变原有代码的基础上，也能够兼容新的需求。

装饰者模式是将原有类的附加功能抽离出来，简化原有类逻辑。


装饰者模式的优缺点：

1.装饰者是继承的有力补充，比继承灵活，不改变原有对象的情况下动态地给一个对象扩展功能，即插即用。

2.通过使用不同装饰类以及这些装饰类的排列组合，可以使用不同效果。

3.装饰者完全符合开闭原则

缺点：

1.会出现更多的代码，更多的类，增加程序的复杂行。

2.动态装饰时，多层装饰时会更复杂


