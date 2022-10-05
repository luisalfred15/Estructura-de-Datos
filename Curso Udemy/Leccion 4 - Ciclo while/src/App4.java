
public class App4 {
	public static void main(String[] args) {

//		int num = 5;
//		int i = 5;
//		
//		while (i > 1) {
//			num = num * (i -1);
//			i--;
//		}
//		
		
		int num = 5;
		
		num = num - 1;
		
		int f_0 = 0;
		int f_1 = 1;
		int f_n = 0;
		
		while (num > 0) {
			
			
			f_n = f_0 + f_1;
			
			f_0 = f_1;
			f_1 = f_n;
			
			num--;
				
		}
		
		System.out.println(f_n); // 0, 1, 1, 2, 3, 5, 8
	}
}

// Se puede inicializar una desigualdad a una variable para que sea booleana; desigualdades entre variables y enteros tambien
// Sintx: while(cond es V) {
//		(bloque de codigo)
// {
// Nota: Recuerda SIEMPRE declarar