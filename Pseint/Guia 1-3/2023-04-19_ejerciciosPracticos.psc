Algoritmo sin_titulo
	
	/// Ejercicio 1
	
//	Definir numEmpleados, i, sueldoBase, sueldoTotal, numVentas, cobroVentas, totalVentas, comisionVentas Como Real
//	Definir nombre, infoEmpleado, infoFinal como Cadena
//	
//	Escribir "Ingrese el número de empleados:"
//	Leer numEmpleados
//	
//	Para i = 1 Hasta numEmpleados Hacer
//		
//		Escribir "Ingrese el nombre de su empleado:"
//		Leer nombre
//		
//		Escribir "Ingrese el salario base de su empleado, el número de ventas que realizó y cuánto cobró por cada venta:"
//		Leer sueldoBase, numVentas, cobroVentas
//		
//		totalVentas = numVentas * cobroVentas
//		comisionVentas = totalVentas * 0.10
//		sueldoTotal = sueldoBase + comisionVentas
//		
//		Si i == 1 Entonces
//			infoFinal = "Esta semana el sueldo total de " + nombre + " es de $" + ConvertirATexto(sueldoTotal) + ", pues deberá pagarle $" + ConvertirATexto(comisionVentas) + " por concepto de comisiones. "
//		SiNo
//			infoEmpleado = "Esta semana el sueldo total de " + nombre + " es de $" + ConvertirATexto(sueldoTotal) + ", pues deberá pagarle $" + ConvertirATexto(comisionVentas) + " por concepto de comisiones. "
//			infoFinal = infoFinal + infoEmpleado
//		Fin Si
//		
//	Fin Para
//	
//	Escribir infoFinal
	
	/// Ejercicio #2
	
//	Definir tam, i, j Como Entero
//	
//	Escribir "Especifique el tamaño del cuadrado a dibujar. Ej: 4 para 4x4"
//	Leer tam
//	
//	tam = Abs(tam)
//	
//	Si tam > 0 Entonces
//		Para i = 1 hasta tam
//			//los bordes sup inf están dados por i == 1 o por i == tam
//			Para j = 1 Hasta tam
//				Si i == 1 o i == tam o j == 1 o j == tam
//					//Si el i es el primero o ultimo escribe el asterisco
//					//Si el j es el primero o ultimo escribe el asterisco
//					Escribir Sin Saltar " * "
//				SiNo
//					//Si no es el primero o ultimo agrega espacio en blanco
//					Escribir Sin Saltar "   "
//				FinSi
//			FinPara
//			Escribir ""
//		FinPara
//		Escribir i j
//	FinSi
	
	/// Ejercicio #4
	
//	Definir i, j, res Como Entero
//	Definir cad como Cadena
//	
//	Para i = 1 Hasta 5 Hacer
//		
//		res = 1
//		cad = ConvertirATexto(i) + "! = "
//		Para j = 1 Hasta i Hacer
//			
//			res = res * j
//			Si j == 1 Entonces
//				cad = cad + ConvertirATexto(j)
//			SiNo
//				cad = cad + "*" + ConvertirATexto(j)
//			Fin Si
//			
//		Fin Para
//		
//		Si i == 1 Entonces
//			Escribir cad
//		SiNo
//			Escribir cad, " = ", res
//		Fin Si
//		
//	Fin Para
	
	Definir i, j, factorial Como Entero
	Definir producto Como Real
	
	Escribir "Elija el factorial a calcular"
	Leer factorial
	factorial=ABS(factorial)
	producto = 1
	//El primer "Para" va desde 1 al factorial que eligio el user
	Para i = 1 Hasta factorial
		producto = producto * i
		// el producto empieza en 1 y en cada vuelta se actualiza al multiplicarse por el i
		Escribir Sin Saltar i, "! = "
		
		Para j = 1 Hasta i
			Escribir Sin Saltar j
			Si j < i
				Escribir Sin Saltar " * "
			FinSi
		FinPara
		
		Escribir " = ", producto
	FinPara
	
FinAlgoritmo
