
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class TestingOutputStream extends PrintStream
{
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream extraPrint = new PrintStream(outputStream);
    public static final PrintStream realOut = System.out;

    public TestingOutputStream() {
        super(realOut);
    }

    @Override
    public void print(boolean b) {
        realOut.print(b);
        extraPrint.print(b);
    }

    @Override
    public void print(char c) {
        realOut.print(c);
        extraPrint.print(c);
    }

    @Override
    public void print(int i) {
        realOut.print(i);
        extraPrint.print(i);
    }

    @Override
    public void print(long l) {
        realOut.print(l);
        extraPrint.print(l);
    }

    @Override
    public void print(float f) {
        realOut.print(f);
        extraPrint.print(f);
    }

    @Override
    public void print(double d) {
        realOut.print(d);
        extraPrint.print(d);
    }

    @Override
    public void print(char[] s) {
        realOut.print(s);
        extraPrint.print(s);
    }

    @Override
    public void print(String s) {
        realOut.print(s);
        extraPrint.print(s);
    }

    @Override
    public void print(Object obj) {
        realOut.print(obj);
        extraPrint.print(obj);
    }

    @Override
    public void println() {
        realOut.println();
        extraPrint.println();
    }

    @Override
    public void println(boolean x) {
        realOut.println(x);
        extraPrint.println(x);
    }

    @Override
    public void println(char x) {
        realOut.println(x);
        extraPrint.println(x);
    }

    @Override
    public void println(int x) {
        realOut.println(x);
        extraPrint.println(x);
    }

    @Override
    public void println(long x) {
        realOut.println(x);
        extraPrint.println(x);
    }

    @Override
    public void println(float x) {
        realOut.println(x);
        extraPrint.println(x);
    }

    @Override
    public void println(double x) {
        realOut.println(x);
        extraPrint.println(x);
    }

    @Override
    public void println(char[] x) {
        realOut.println(x);
        extraPrint.println(x);
    }

    @Override
    public void println(String x) {
        realOut.println(x);
        extraPrint.println(x);
    }

    @Override
    public void println(Object x) {
        realOut.println(x);
        extraPrint.println(x);
    }

    @Override
    public PrintStream printf(String format, Object... args) {
        extraPrint.printf(format, args);
        return realOut.printf(format, args);
    }

    @Override
    public PrintStream printf(Locale l, String format, Object... args) {
        extraPrint.printf(l,format, args);
        return realOut.printf(l, format, args);
    }

    public String toString()
    {
        return outputStream.toString();
    }

    @Override
    public void flush() {
        try
        {
            realOut.flush();
            extraPrint.flush();
        }
        catch (Exception e)
        {e.printStackTrace();}
    }

    @Override
    public void close() {
        realOut.close();
        extraPrint.close();
    }
}
