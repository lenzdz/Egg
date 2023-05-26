Algoritmo sin_titulo
	
	/// Ejercicio #2 
	
//	Definir limite, num, suma Como Entero
//	
//	Escribir "Defina un límite para la suma:"
//	Leer limite
//	
//	suma = 0
//	
//	Mientras suma < limite Hacer
//		
//		Escribir "Ingrese un número para añadirlo a la sumatoria final:"
//		Leer num
//		
//		suma = suma + num
//		
//	Fin Mientras
//	
	//	Escribir "Saliste del bucle. Tu límite era ", limite, " y la suma de los números que ingresaste llegó a ", suma
	
	/// Ejercicio #3
	
//	Definir num, suma, i Como Real
//	
//	Escribir "Ingrese un número para incluirlo a la sumatoria y calcular el promedio. Para finalizar el ingreso de números escriba -1."
//	Leer num
//	
//	suma = 0
//	i = 0
//	Mientras num > -1 Hacer
//		
//		suma = suma + num
//		i = i + 1
//		
//		Escribir "Ingrese un número para incluirlo a la sumatoria y calcular el promedio. Para finalizar el ingreso de números escriba -1."
//		Leer num
//		
//	Fin Mientras
//	
	//	Escribir "El promedio de los números ingresados es: ", suma/i
	
	/// Ejercicio #4
	
//	Definir num como Entero
//	Escribir "Ingrese un número:"
//	Leer num
//	
//	Mientras num > 10 Hacer
//		Escribir "Ingrese un número:"
//		Leer num
//	FinMientras
//	
//	Escribir "Saliste del bucle."
	
	
	/// Ejercicio #5
	
//	Definir min, max, num, counter como Entero
//	Escribir "Ingresa tus límites mínimo y máximo:"
//	Leer min, max
//	
//	Escribir "Ingresa un número. Se contarán la cantidad de números que ingreses hasta que este sea inferior o superior a los valores mínimo y máximo que estableciste en el paso anterior."
//	Leer num
//	
//	counter = 0
//	Mientras num >= min Y num <= max Hacer
//		
//		counter = counter + 1
//		
//		Escribir "Ingresa un número. Se contarán la cantidad de números que ingreses hasta que este sea inferior o superior a los valores mínimo y máximo que estableciste en el paso anterior."
//		Leer num
//		
//	FinMientras
//	
	//	Escribir "La cantidad de números que ingresaste fueron ", counter
	
	/// Ejercicio #7
	
//	Definir alumno como Cadena
//	
//	Escribir "Ingrese el nombre de su alumno:"
//	Leer alumno
//	
//	Definir nota1, nota2, nota3, promedio Como Real
//	Mientras Longitud(alumno) > 0 Hacer
//		
//		Escribir "Ingrese las calificaciones relativas a la parte práctica, problemas y teórica de ", alumno
//		Leer nota1, nota2, nota3
//		
//		Mientras nota1 < 0 O nota1 > 10 Hacer
//			Escribir "El valor ingresado para la parte práctica es inválido. Por favor, vuelva a ingresarlo:"
//			Leer nota1
//		FinMientras
//		
//		Mientras nota2 < 0 O nota2 > 10 Hacer
//			Escribir "El valor ingresado para la parte problemas es inválido. Por favor, vuelva a ingresarlo:"
//			Leer nota2
//		FinMientras
//		
//		Mientras nota3 < 0 O nota3 > 10 Hacer
//			Escribir "El valor ingresado para la parte teórica es inválido. Por favor, vuelva a ingresarlo:"
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
	
	Escribir "¿Cuántos dígitos tiene tu número? :O"
	Leer num
	
	dig = 0
	Mientras num > 0 Hacer
		num = trunc(num/10)
		dig = dig +1
	FinMientras
	
	Escribir "Tu número tiene ", dig, " cifras :O"
	
FinAlgoritmo
