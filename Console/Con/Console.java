package Con.Console;
public class Console {
    public static void writeLine(String text) {
        System.out.println(text);
        java.lang.System.out.println("Hello Java"); // 完整类名
    }
    
    public void writeLine1(String text) {
        System.out.println(text);
        java.lang.System.out.println("Hello Java"); // 完整类名
    }

    // 添加 main 方法作为程序入口
    // public static void main(String[] args) {
    //    Console console = new Console();
    //    console.writeLine("Welcome to Console!");
    // }
}
