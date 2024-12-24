IMPORT JAVA java.util.regex.Pattern
IMPORT JAVA cc.openhome.util.Console

IMPORT JAVA java.lang.StringBuffer
MAIN
  DEFINE p Pattern
  DEFINE d Console
  DEFINE s STRING
  DEFINE sb1, sb2 StringBuffer
  LET p = Pattern.compile("a*b")
  
  #LET d = Console.writeLine
  IF p.matcher("aaaab").matches() THEN
    DISPLAY "It matches..."
  END IF

  CALL Console.writeLine("Hello, World");

END MAIN
