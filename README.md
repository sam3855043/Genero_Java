### RUN
 - cd Genero_JAVA </br>
 - export CLASSPATH=$PWD/console/Console.jar </br>
 - r.cs myjar </br>
 - fglrun myjar </br>
### java compiler
 - jar cmf META-INF/MANIFEST.MF Console.jar -C . cc/openhome/util/Console.class
 
 - jar tf Console.jar
 - java -jar Console.jar [ 🚨 錯誤：Something went wrong! can call by other not working alone]