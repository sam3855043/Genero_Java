
 - javac Console.java Main.java
 - jar cf Console.jar Console.class
 - jar cmf MANIFEST.MF Console.jar Console.class
 - jar cfe Main.jar Main Main.class
 - java -cp .:Console.jar Main
 - jar cmf META-INF/MANIFEST.MF app.jar Main.class Console.class
 - java -jar app.jar
 - r.cs myjar error [ 🚨 錯誤：r.cs can't work]






