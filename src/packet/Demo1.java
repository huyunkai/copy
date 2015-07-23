/*
 * 包： 对类文件进行分类管理
 * 给类提供了多层命名空间
 * 写在程序文件的第一行
 * 类名的全称是在包名.类名
 * 包也是一种封装形式
 * 定义包的形式：package pack;
 * 定义包名所有的字母小写
 * java -d 指定包名的目录 例如 javac -d 。PackageDemo.java指定到跟Package相同的目录
 *set classpath=c:/myclass只需要指定包的父目录就行了
 *当前packat 包不在文件下，需要设置classpath告诉jvm去哪里找指定的packet。
 *总结:
 *包与包之间进行访问， 被访问的包中的类以及类中的成员，需要public修饰。
 *不同包中的子类可以范文父类中被protected权限修饰的成员.
 *包与包之间可以使用的权限只有两种：public protected
 *        public   protected  default private
 *同一个类中           Y          Y          Y      Y 
 *同一个包中           Y          Y          Y         
 *子类                        Y          Y
 *不同包中              Y       
 * */
package packet;

public class Demo1 {
   public void show()
   {
	   System.out.println("this is my first program!");
   }
}
