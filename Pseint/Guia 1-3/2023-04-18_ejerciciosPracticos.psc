Algoritmo sin_titulo
	
	/// Ejercicio #2
	
//	Definir pal, cadenaFinal como Cadena
//	Definir i Como Entero
//	Leer pal
//	
//	i = 0
//	cadenaFinal = ""
//	
//	Para i = 0 Hasta (Longitud(pal)-1) Hacer
//		cadenaFinal = cadenaFinal + SubCadena(pal,i,i) + " "
//	Fin Para
//	
//	Escribir cadenaFinal
	
	/// Ejercicio #3
	
	Definir numAlumnos, i Como Entero
	
	Escribir "¿Cuántos alumnos hay en su clase?"
	Leer numAlumnos
	
	Definir nombre, reprobados como Cadena
	Definir promedio como Real
	Definir integrador, numEstIntegrador como Real
	Definir expo, maxExpo como Real
	Definir parcial, numEstParcial como Real
	
	reprobados = ""
	numEstIntegrador = 0
	numEstParcial = 0
	
	Para i <- 1 Hasta numAlumnos Hacer
		
		Escribir "Ingrese el nombre de su estudiante."
		Leer nombre
		
		Escribir "Ingrese las calificaciones correspondientes al Integrador, la Exposición y el Parcial."
		Leer integrador, expo, parcial
		
		promedio = (integrador * 0.35) + (expo * 0.25) + (parcial * 0.4)
		
		Si promedio < 6.5 Entonces
			reprobados = reprobados + nombre + " reprobó con " + ConvertirATexto(promedio) + ". "
		Fin Si
		
		Si integrador >= 7.5 Entonces
			numEstIntegrador = numEstIntegrador + 1
		Fin Si
		
		Si i == 1 Entonces
			maxExpo = expo
		SiNo
			Si maxExpo < expo Entonces
				maxExpo = expo
			FinSi
		Fin Si
		
		Si parcial >= 4.0 Y parcial <= 7.5 Entonces
			numEstParcial = numEstParcial + 1
		Fin Si
		
	Fin Para
	
	Si Longitud(reprobados) > 0 Entonces
		Escribir reprobados
	SiNo
		Escribir "Ningún estudiante reprobó el curso."
	Fin Si
	
	Escribir "El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 corresponde al ", (numEstIntegrador/numAlumnos) * 100, " %."
	Escribir "La calificación más alta obtenida en una exposición fue de ", maxExpo, "."
	Escribir "El total de estudiantes que obtuvieron en el parcial entre 4.0 y 7.5 fue de ", numEstParcial, "."
	
	/// Ejercicio #5
	
//	Definir num, i, suma Como Entero
//	Escribir "Ingrese un valor para N. Los primeros N números naturales se sumarán y se mostrará el cálculo."
//	Leer num
//	
//	i = 0
//	suma = 0
//	
//	Para i <- 0 Hasta num Hacer
//		suma = suma + i
//	Fin Para
//	
//	Escribir "La suma de los primeros ", num, " números naturales da como resultado ", suma
	
	/// Ejercicio #6
	
//	Definir pal, cadenaFinal como Cadena
//	Definir i Como Entero
//	Leer pal
//	
//	i = (Longitud(pal)-1)
//	cadenaFinal = ""
//	
//	Para i = (Longitud(pal)-1) Hasta 0 Con Paso -1 Hacer
//		cadenaFinal = cadenaFinal + SubCadena(pal,i,i) + " "
//	Fin Para
//	
//	Escribir cadenaFinal
	
FinAlgoritmo
