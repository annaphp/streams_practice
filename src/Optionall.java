
public class Optionall<T> {
	
	private T t;

	public Optionall() {}

	public Optionall(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
	public boolean hasObject(){
		return t != null;
	}
	

}
