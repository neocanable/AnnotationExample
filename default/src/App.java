import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;

public class App<@NotNull T> extends OtherApp<@NotNull T> implements @NotNull AnnotationInterface {
    public App() {

    }

    @MethodInfo(
            author = "Foo",
            date = "2024",
            version = "12"
    )
    public String getAppName() {
        return "App";
    }

    public void getMyName(String name)
    {
        System.out.println("name is: " + name);
    }

    @NotNull public App(@Valid String info)
    {
        super();
    }

    class SimpleGenericClass<T>{
        <K, V> SimpleGenericClass(K k, V v){
        }

        <K, V> void genericMethod(K k, V v) {
        }

        static <K, V> Object genericStaticMethod(K k, V v) {
            return null;
        }
    }


    @NotNull
    @Valid
    @NotEmpty
    String appCode;

    @NotBlank(message = "作者名字不能空")
    String appAuthor;

    @Size(max = 5, message = "can not great than 5")
    List<String> users;

    public <@NotNull @Valid T extends Object> Object annotation0x01(Object name)
    {

        System.out.println("my name: " + name);
        return String.format("my: %s" , name);
    }

    public <K extends @NotNull T> K annotation0x12() {
        return null;
    }

    public @NotNull String annotation0x14(String version)
    {
        return "version: " + version;
    }

    public int annotation0x15(@NotNull App<T>this, App other)
    {
        return 0;
    }

    public void annotation0x16(@NotNull String name) {
        System.out.println(name);
    }

    public void annotation0x17() throws @NotNull Exception {
    }

    public void annotation0x40()
    {
        @NotNull String catchName = "name: " + appCode;
        @Email String autoEmail = String.format("%s@%s", appAuthor, "gmail.com");
    }

    public void annotation0x40V1() {
        @NotNull Collection<? extends @NotNull Parent> c = null;
    }


    public <@NotNull T extends Object> Object annotation0x40(Object name)
    {
        System.out.println("my name: " + name);
        @NotNull @Email String email = "my@gmail.com";
        return String.format("my: %s" , name);
    }

    public void annotation0x41() {
        try(@NotNull FileWriter autoclosedhere = new FileWriter("")) {
        }catch (IOException ioe){
        }
    }
    public void annotation0x42() {
        try {
            throw  (new RuntimeException("hahah"));
        }catch (@Valid Exception e)
        {
            int a = 10;
        }finally {
            int b = 20;
        }
    }

    public void annotation0x43()
    {
        int m = 10000;
        Object obj = m;
        boolean k = obj instanceof @NotNull String;
    }

    public void annotation0x44() {
        Child c = new @NotNull Child();
    }

    public void annotation0x45() {
        Runnable r = @NotNull App::new;
    }

    private static Object biFunction(Object o, Object o1) {
        return null;
    }

    public void annotation0x46() {
        BiFunction function = @NotNull App::biFunction;
    }

    public void annotation0x47()
    {
        double a = 1000.0;
        int m = (@NotNull int) a;
    }


    public void annotation0x48()
    {
        SimpleGenericClass<?> obj = new <@NotNull String, Integer>SimpleGenericClass<Float>("test", 1);
    }

    public void annotation0x49()
    {
        SimpleGenericClass<?> obj = new <String, Integer>SimpleGenericClass<Float>("test", 1);
        obj.<@NotNull String, @NotNull Integer>genericMethod("test", 1);
    }

    public void annotation0x4a()
    {
        BiFunction<String, Integer, SimpleGenericClass<Float>> aNew = SimpleGenericClass<Float>::<String, @NotNull Integer>new;
    }

    public void annotation0x4b()
    {
        BiFunction<String, Integer, Object> genericStaticMethod = SimpleGenericClass::<String, @NotNull Integer>genericStaticMethod;
    }


    public <T extends ArrayList> ArrayList<T> annotation0x16(@Valid ArrayList<T> node)
    {
        return null;
    }


    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    class A {
        String name;
        B classB = new B();

        public B getClassB() { return classB; }
    }

    class B {
        String age;
        C classC = new C();

        public C getClassC() { return classC; }
    }

    class C {
        String location;

        public String getLocation() { return location; }
    }

    class Folder<F extends @NotNull File> {

    }

    interface Job<@NotNull T> {
        void exec(T t);
        // 0x00
    }

    class JobOnA<@ExceptionDemo T> implements Job<A>{
        @Override
        public void exec(@NotNull A a) {
//            a.methodA();
        }
    }

    class Outer {
        class Middle {
            class Inner {
                void innerMethod(@NotNull Outer.@NotNull Middle.@NotNull Inner this) { }
            }
        }
    }

    void m() {
    }

    public interface AppAction {
    }
}
