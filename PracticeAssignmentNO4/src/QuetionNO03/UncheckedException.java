package QuetionNO03;

public class UncheckedException {
public static void main(String[] args)  {
	UncheckedException uncheckedException = new UncheckedException();
try {
	uncheckedException.exceptionMethod();
} catch (ArrayIndexOutOfBoundsException e) {
	// TODO: handle exception
	System.out.println(e);
}

}

void exceptionMethod () throws ArrayIndexOutOfBoundsException {
	int [] a = {12,23,3,43,32};
	System.out.println(a[5]);
}
}
