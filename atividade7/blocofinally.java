public class blocofinally {
	public static void main( String args[] )
	 {
	 try
	 {
	 method1();
	 } 
	catch ( Exception exception ) 
	{
	System.err.printf( "%s\n\n", exception.getMessage() );
	 exception.printStackTrace(); 
	 StackTraceElement[] traceElements = exception.getStackTrace(); 
	 System.out.println( "\nStack trace from getStackTrace:" );
	  System.out.println( "Class\t\tFile\t\t\tLine\tMethod" );
	 for ( StackTraceElement element : traceElements )
	 {
	 System.out.printf( "%s\t", element.getClassName() );
	 System.out.printf( "%s\t", element.getFileName() );
	 System.out.printf( "%s\t", element.getLineNumber() );
	 System.out.printf( "%s\n", element.getMethodName() );
	 } 
	 } 
	 } 
	 public static void method1() throws Exception
	 {
	 method2();
	 } 
	 public static void method2() throws Exception
	  {
	  }  
}






//Todas as exceções são herdadas direta ou indiretamente da classe Exception.
//As classes Exception formam uma hierarquia de herança que pode ser estendida.