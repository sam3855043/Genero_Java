IMPORT JAVA java.util.regex.Pattern
IMPORT JAVA cc.openhome.util.Console
IMPORT JAVA Human_sample.tina.Human
IMPORT JAVA java.lang.StringBuffer
MAIN
  DEFINE p Pattern
  DEFINE d Console
  DEFINE s STRING
  DEFINE h1 Human
  DEFINE sb1, sb2 StringBuffer
  LET p = Pattern.compile("a*b")
  
  #LET d = Console.writeLine
  IF p.matcher("aaaab").matches() THEN
    DISPLAY "It matches..."
  END IF

  CALL Console.writeLine("Hello, World");
  #LET h1 = Human.create("小婷");
  LET sb1 = StringBuffer.create("abcdef")
  #CALL Human.setValue(22, 178);
  #CALL Human.setValue("小婷");
END MAIN
