设计模式分类：
https://www.runoob.com/design-pattern/design-pattern-intro.html

**创建型模式：**

不用new实例化对象，提供了创建对象同时隐藏创建逻辑的方式
单例模式,工厂模式，抽象工厂，建造者模式，原型模式（5个）

| 名字    | 含义                                                               | 解决问题            | 应用场景举例                                    | 关键代码                                                            |
|-------|------------------------------------------------------------------|-----------------|-------------------------------------------|-----------------------------------------------------------------|
| 单例模式  | 一个类仅有一个实例                                                        | 全局使用的对象被频繁创建和销毁 | 1. redis<br/>2. spring3<br/>3. I/O，数据库连接等 | （双重校验锁）<br/>1.构造函数私有<br/>2.该对象定义时用volatile<br/>3.访问对象的方法是static |
| 工厂模式  | 简单工厂模式：<br/>用一个单独的工厂类来创建实例<br/>工厂模式：<br/>每个对象都有对应的工厂类，子类决定实例化哪个类 | 接口选择问题          | 1. 日志选择器（选择要记录到哪个地方，磁盘或远程服务器等）            | 简单工厂模式：switch case 根据入参实例化对象<br/>工厂模式：每个类有单独的工厂，选择具体的工厂实例化对象    |
| 抽象工厂  | 有多个工厂时，对工厂进行抽象，其他与共产模式相同                                         | 接口选择问题          | 1.QQ换皮肤，一整套一起换<br/>2. 生成不同操作系统的程序       | 对各个工厂进行抽象，其他与工厂相同                                               |
| 建造者模式 | 使用多个简单的对象，构造一个复杂的对象（注重多个对象之间的创建顺序）                               | 复杂对象的创建问题       | 1.肯德基套餐组合<br/>                            | 1. Director中组合各个对象 2.Builder中实现抽象接口，由各个具体的对象实现                  |
| 原型模式  | 通过拷贝创建新的对象                                                       | 在运行期建立和删除对象     | 1. 细胞分裂<br/>2.需要频繁地new一个对象时               | 1.实现cloneable接口，如果对象中含有引用，则引用也要实现cloneable接口                    |

**结构型模式：**

关注类和对象的组合
适配器模式，桥接模式，组合模式，装饰器模式，外观模式，享元模式，代理模式（7个）

| 名字    | 含义                        | 解决问题         | 应用场景举例                                 | 关键代码                              |
|-------|---------------------------|--------------|----------------------------------------|-----------------------------------|
| 适配器模式 | 两个不兼容接口之间的桥梁              | 类之间不兼容       | 1.Linux运行windows程序                     | 适配器继承已有对象，重写想要调用的接口               |
| 桥接模式  | 将抽象与实现分离                  | 继承扩展不灵活      | 图形的形状不同，有正方形和原形（抽象），每个图形计算周长的方法（实现）也不同 | 继承和抽象分开                           |
| 组合模式  | 将对象整合成树形结构表示层次            | 程序与元素内部解耦    | 家谱                                     | 树枝内部组合接口，含有内部属性list，里面存放component |
| 外观模式  | 高层接口为子系统提供一致的界面           | 降低访问复杂系统的难度  | 去医院看病，挂号门诊等很复杂，如果有接待人员，会降低复杂性          | 在客服端和复杂系统之间再加一层，将调用顺序，依赖关系处理好     |
| 装饰器模式 | 动态给对象添加新的职责（新增接口）         | 继承扩展功能使得子类膨胀 | 孙悟空72变，可以变出很多东西                        | 动态添加新的接口                          |
| 享元模式  | 大面积非常相似的开销，希望能大幅减少实例化类的数量 | 减少创建对象的数量    | java string字符串，如果没有，创建一个，如果有直接返回       | map存储对象                           |
| 代理模式  | 为其他对象提供一种代理，以提供对这个对象的访问   | 直接访问对象的权限等问题 | 1.windows的快捷键 2.买火车票在app上可以买           | 实现与被代理类的组合                        |

**行为型模式**
关注对象之间的通信

责任链模式，命令模式，解释器模式，迭代器模式，
中介者模式，备忘录模式，观察者模式，状态模式，
策略模式，模版模式，访问者模式（11个）

| 名字    | 含义                         | 解决问题               | 应用场景                          | 关键代码                       |
|-------|----------------------------|--------------------|-------------------------------|----------------------------|
| 责任链模式 | 为请求创建接受对象的链                | 让多个对象都有可能接受请求      | 击鼓传花                          | 多个接口者，如果当前不能接收，继续往下传递      |
| 命令模式  | 将请求封装成对象                   | 请求者和实现者解耦          | 吃饭，服务员传递命令给后厨                 | 调用者->命令->接收者               |
| 解释器模式 | 提供评估语言的语法或者表达的方式           | 构建句子的解释器           | 抽象语法树，编译器，表达式的运算等             | 构建解释器类                     |
| 迭代器模式 | 顺序访问各个元素                   | 遍历集合对象             | Java Iterator                 | 定义接口next,hasNext           |
| 中介者模式 | 处理不同类之间的通信                 | 降低多个对象和类之间通信复杂性    | 各个国家通过WTO实现相互贸易               | 对象之间的通信封装到一个类中统一处理         |
| 备忘录模式 | 保存对象的状态，便于在适当的时候恢复         | 捕获对象的状态，对其进行恢复     | 回滚                            | 客户不与备忘录耦合，与备忘录管理耦合         |
| 观察者模式 | 当对象的状态修改时，会自动通知他依赖的对象(一对多) | 对象状态改变给其他依赖对象通知问题  | 关注和订阅问题                       | 抽象类中用list存放观察者们            |
| 状态模式  | 允许对象在内部状态改变时，改变其行为         | 对象的行为依赖属性问题        | 条件分支的替代                       | 实现类中改变对象的状态                |
| 策略模式  | 类的行为或算法可以在运行时更改            | if...else复杂和难维护的问题 | 一个系统需要动态地在多种算法中选择一种           | 多个类实现同一个接口，context中有该接口的引用 |
| 模版模式  | 一个抽象类定义了实现他的方法（模版）         | 方法通用，但是子类都重写了该方法   | 盖房子，前期打地基，走线，水管等流程相同          | 相同功能在抽象类中实现，不同功能在子类中分别实现   |
| 访问者模式 | 使用访问者类，改变元素类的执行方法          | 数据结构稳定，操作易变        | 去朋友家中做客，自己是访问者，通过朋友的描述，对其做出判断 | 基础类中有一个方法接口访问者，将自身引用传入访问者  |


