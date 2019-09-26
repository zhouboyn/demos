package serial;

import java.io.Serializable;

public class Person implements Serializable {

    /**
     * 如果没这个字段，先将类的实例序列化，存储在文件中，这时是默认有一个serialVersionUID的。
     * 如果类动过，再编译成class文件的时候serialVersionUID就变了，反序列化会失败。
     */
    private static final long serialVersionUID = -7774419891466310847L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
