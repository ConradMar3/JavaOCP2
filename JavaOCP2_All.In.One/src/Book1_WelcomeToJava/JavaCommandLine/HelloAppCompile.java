package Book1_WelcomeToJava.JavaCommandLine;

public class HelloAppCompile {
    public static void main(String[] args) {
        System.out.println("Compiling Java.");
    }
}

//Compile = javac HelloAppCompile.java

//Compile Multiple = javac *.java

/*
To use one or more of these options, type the option before or after the source file name.
Either of the following commands, for example, compiles the HelloAppCompile.
java file with the -verbose and -deprecation options enabled:
Example:
javac HelloAppCompile.java -verbose -deprecation
javac -verbose -deprecation HelloAppCompile.java
 */