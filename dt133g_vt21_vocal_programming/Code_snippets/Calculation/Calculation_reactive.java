import io.reactivex.Observable;
public class Calculation_reactive {
	public static void main(String[] args) {
		Observable<Integer> c = Observable.defer(() -> Observable.just(a + b));
		c.subscribe(s -> System.out.println(s));		// 3
		a = 4;
		c.subscribe(s -> System.out.println(s));		// 6
	}
	private static int a = 1;
	private static int b = 2;
}
