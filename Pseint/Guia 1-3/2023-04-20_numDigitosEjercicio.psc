Algoritmo numDigitos
	
	/// Opci�n #1: con trunc
	
	Definir num, dig Como Real
	
	Escribir "Ingrese un n�mero"
	Leer num
	
	dig = 1
	Mientras 0<trunc(num/10) Hacer
		dig = dig + 1
		num = trunc(num/10)
	Fin Mientras
	
	Escribir dig
	
	/// Opci�n #2: con cadena
	
//	Definir num, cad Como Entero
//	
//	Escribir "Ingrese un n�mero"
//	Leer num
//	
//	Escribir abs(num)
//	cad = Longitud(ConvertirATexto(abs(num)))
//	
//	Escribir cad
	
FinAlgoritmo
