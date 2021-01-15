package test;

public class JvmClassLoader extends ClassLoader {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        new JvmClassLoader().findClass("study.Hello").newInstance();
    }
}
