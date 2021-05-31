// 3.
// a)

if (a > b) {
	System.out.println("Maior: ", a);
} else {
	System.out.println("Maior: ", b);
}

// b)
if (x > 10) {
	System.out.println("Valor maior que 10");
} else {
	if (x > 5) {
		System.out.println("Menor ou igual a 10 e maior que 5");
	}
	else {
		System.out.println("Menor ou igual a 5");
	}
}

// 4.
// a) comando 1, 2, 7
// b) comando 3, 4, 6, 7
// c) comando 5, 6, 7
// d) cond3: true, cond1: false

public static void main(String[] args) {
	if (cond1) {
		comando1;
		comando2;
	} else {
		 if (cond2) {
		 	comando3;
		 }
		 if (cond3) {
		 	comando4;
		 } else {
		 	comando5;
		 }
		 comando6;
	}
	comando7;
}