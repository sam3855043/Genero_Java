IMPORT JAVA java.util.regex.Pattern
IMPORT JAVA com.example.model.Person
 
IMPORT JAVA java.lang.StringBuffer
MAIN
  DEFINE p Pattern
  DEFINE pp Person
  DEFINE s STRING

  DEFINE sb1, sb2 StringBuffer
  LET p = Pattern.compile("a*b")
  LET pp = Person.create("Alice", 30);
  CALL pp.displayInfo();
  #LET d = Console.writeLine
  IF p.matcher("aaaab").matches() THEN
    DISPLAY "It matches..."
  END IF


END MAIN
