动态代理是在程序运行阶段动态的在内存中去生成代理类。

Proxy类中提供了一个创建代理对象的静态方法（即newProxyInstance方法）来获取代理对象

代理类也实现了对应的接口，因此该方法的返回值类型我们就写为了SellTickets接口 (多态的思维)

Proxy类中的newProxyInstance方法所需要的三个参数：
-   ClassLoader loader：类加载器，用于加载代理类（我们说了，代理类是在程序运行过程中动态的在内存中生成的），可以通过目标对象获取类加载器
-   Class<?>[] interfaces：代理类实现的接口的字节码对象。由于目标对象所属类也实现了同样的接口，所以我们可以通过目标对象来获取对应接口的字节码对象
-   InvocationHandler h：代理对象的调用处理程序。不过要注意，InvocationHandler是一个接口，所以你不妨以匿名内部类的形式将该参数体现出来

代理类是程序在运行过程中动态的在内存中生成的类，我们是看不到的。

JDK动态代理的代码执行流程了。

-   在测试类中通过代理对象调用sell方法
-   根据多态的特性，执行的是代理类（即$Proxy0）中的sell方法
-   代理类（即$Proxy0）中的sell方法又调用了InvocationHandler接口的子实现类对象的invoke方法，也就是调用了我们自己定义的InvocationHandler接口的子实现类对象的invoke方法
-   invoke方法通过反射执行了真实对象所属类（即TrainStation）中的sell方法。当然，我们还可以对其进行一个增强
