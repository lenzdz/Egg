Algoritmo sin_titulo
	
	/// Ejercicio #2 
	
//	Definir limite, num, suma Como Entero
//	
//	Escribir "Defina un l�mite para la suma:"
//	Leer limite
//	
//	suma = 0
//	
//	Mientras suma < limite Hacer
//		
//		Escribir "Ingrese un n�mero para a�adirlo a la sumatoria final:"
//		Leer num
//		
//		suma = suma + num
//		
//	Fin Mientras
//	
	//	Escribir "Saliste del bucle. Tu l�mite era ", limite, " y la suma de los n�meros que ingresaste lleg� a ", suma
	
	/// Ejercicio #3
	
//	Definir num, suma, i Como Real
//	
//	Escribir "Ingrese un n�mero para incluirlo a la sumatoria y calcular el promedio. Para finalizar el ingreso de n�meros escriba -1."
//	Leer num
//	
//	suma = 0
//	i = 0
//	Mientras num > -1 Hacer
//		
//		suma = suma + num
//		i = i + 1
//		
//		Escribir "Ingrese un n�mero para incluirlo a la sumatoria y calcular el promedio. Para finalizar el ingreso de n�meros escriba -1."
//		Leer num
//		
//	Fin Mientras
//	
	//	Escribir "El promedio de los n�meros ingresados es: ", suma/i
	
	/// Ejercicio #4
	
//	Definir num como Entero
//	Escribir "Ingrese un n�mero:"
//	Leer num
//	
//	Mientras num > 10 Hacer
//		Escribir "Ingrese un n�mero:"
//		Leer num
//	FinMientras
//	
//	Escribir "Saliste del bucle."
	
	
	/// Ejercicio #5
	
//	Definir min, max, num, counter como Entero
//	Escribir "Ingresa tus l�mites m�nimo y m�ximo:"
//	Leer min, max
//	
//	Escribir "Ingresa un n�mero. Se contar�n la cantidad de n�meros que ingreses hasta que este sea inferior o superior a los valores m�nimo y m�ximo que estableciste en el paso anterior."
//	Leer num
//	
//	counter = 0
//	Mientras num >= min Y num <= max Hacer
//		
//		counter = counter + 1
//		
//		Escribir "Ingresa un n�mero. Se contar�n la cantidad de n�meros que ingreses hasta que este sea inferior o superior a los valores m�nimo y m�ximo que estableciste en el paso anterior."
//		Leer num
//		
//	FinMientras
//	
	//	Escribir "La cantidad de n�meros que ingresaste fueron ", counter
	
	/// Ejercicio #7
	
//	Definir alumno como Cadena
//	
//	Escribir "Ingrese el nombre de su alumno:"
//	Leer alumno
//	
//	Definir nota1, nota2, nota3, promedio Como Real
//	Mientras Longitud(alumno) > 0 Hacer
//		
//		Escribir "Ingrese las calificaciones relativas a la parte pr�ctica, problemas y te�rica de ", alumno
//		Leer nota1, nota2, nota3
//		
//		Mientras nota1 < 0 O nota1 > 10 Hacer
//			Escribir "El valor ingresado para la parte pr�ctica es inv�lido. Por favor, vuelva a ingresarlo:"
//			Leer nota1
//		FinMientras
//		
//		Mientras nota2 < 0 O nota2 > 10 Hacer
//			Escribir "El valor ingresado para la parte problemas es inv�lido. Por favor, vuelva a ingresarlo:"
//			Leer nota2
//		FinMientras
//		
//		Mientras nota3 < 0 O nota3 > 10 Hacer
//			Escribir "El valor ingresado para la parte te�rica es inv�lido. Por favor, vuelva a ingresarlo:"
//			Leer nota3
//		FinMientras
//		
//		promedio = (nota1*0.1) + (nota2*0.5) + (nota3*0.4)
//		
//		Escribir "El promedio de ", alumno, " es ", promedio
//		
//		Escribir "Ingrese el nombre de su alumno:"
//		Leer alumno
//		
//	FinMientras
	
	/// Ejercicio #8
	
	Definir num, dig como Entero
	
	Escribir "�Cu�ntos d�gitos tiene tu n�mero? :O"
	Leer num
	
	dig = 0
	Mientras num > 0 Hacer
		num = trunc(num/10)
		dig = dig +1
	FinMientras
	
	Escribir "Tu n�mero tiene ", dig, " cifras :O"
	
FinAlgoritmo
