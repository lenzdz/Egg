Algoritmo numDigitos
	
	/// Opción #1: con trunc
	
	Definir num, dig Como Real
	
	Escribir "Ingrese un número"
	Leer num
	
	dig = 1
	Mientras 0<trunc(num/10) Hacer
		dig = dig + 1
		num = trunc(num/10)
	Fin Mientras
	
	Escribir dig
	
	/// Opción #2: con cadena
	
//	Definir num, cad Como Entero
//	
//	Escribir "Ingrese un número"
//	Leer num
//	
//	Escribir abs(num)
//	cad = Longitud(ConvertirATexto(abs(num)))
//	
//	Escribir cad
	
FinAlgoritmo
