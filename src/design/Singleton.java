package design;

public class Singleton {
    public int value = 0;

    // 单例模式
    static volatile Singleton instance = null;

    private Singleton() {
        // 私有构造函数
    }

    //懒汉模式单例
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // 双重检查
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
