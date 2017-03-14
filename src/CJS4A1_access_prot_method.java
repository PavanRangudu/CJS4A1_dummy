
import my_pack.pack_class;

public class CJS4A1_access_prot_method extends pack_class{
	
	public static void main(String []s){
		subclass sc = new subclass();
		sc.access_prot_method();
	}
}

// To access a protected method of a class in different package, one should create a subclass.
class subclass extends pack_class {
	void access_prot_method(){
		System.out.println("Value returned by protected method is: "+pack_method()); // protected method accessible from inside this subclass
	}
}