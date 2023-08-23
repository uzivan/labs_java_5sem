package Lab12;

public class GetClassAndMethodName {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] tracer;
        tracer = new Throwable().getStackTrace();
        if(tracer[2].getMethodName() == "main"){
            return "null";
        }
        else {
            return tracer[2].getClassName() + " " + tracer[2].getMethodName();
        }
    }
}
