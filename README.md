## java 
 - cd src
 - javac -d . com/example/model/Person.java Main.java
 - java -cp . Main
 - export CLASSPATH=$PWD
 - cd .. 
 - r.cs myjar
 - fglrun myjar

## jar
 - cd src
 - jar cmf META-INF/MANIFEST.MF Person.jar -C . com/example/model/Person.class
 - jar cvf Person.jar -C . com/example/model/Person.class (option)
 java -cp .:person.jar Main
 - export CLASSPATH=$PWD
 - cd ..
 - r.cs myjar 
 - fglrun myjar






