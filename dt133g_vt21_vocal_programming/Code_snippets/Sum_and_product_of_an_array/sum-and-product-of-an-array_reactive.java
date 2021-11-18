import io.reactivex.Observable;
public class SumProd
{
    static int sum = 0;
    static int prod = 1;
    public static void main(String[] args) {
	Observable<Integer> arr = Observable.fromArray(new Integer[] { 0, 1, 2, 3, 4, 5 });
	arr.subscribe(e -> {
		sum += e;
		prod *= e;
	});
    }
}
