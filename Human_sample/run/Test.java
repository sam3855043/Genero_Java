package Human_sample.run;
import Human_sample.tina.Human;   // This syntax isn't valid in Java ;

public class Test {
    public static void main(String[] args) {
        Human h1 = new Human("小婷");
        h1.setValue(18, 162);
        Human h2 = new Human("小木");
        h2.setValue(22, 178);
        Human_sample.yubin.Human h3 = new Human_sample. yubin.Human("阿杉");  
        h3.setValue(10, 100, 100);
        // 物件h3 雖然也叫Human但跟h1、h2是完全不一樣的東西
        }
}
