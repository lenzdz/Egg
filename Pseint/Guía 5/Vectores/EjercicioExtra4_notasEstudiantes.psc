Algoritmo Ejercicio4
	
	Definir i, dim, vectorNotas, deficientes, regulares, buenos, excelentes como Real
	
	dim = 100
	
	Dimension vectorNotas[dim]
	
	deficientes = 0
	regulares = 0
	buenos = 0
	excelentes = 0
	Para i <- 0 Hasta dim-1 Hacer
		vectorNotas[i] = Aleatorio(0,20)
		
		Si vectorNotas[i] >= 16 Entonces
			excelentes = excelentes + 1
		SiNo
			Si vectorNotas[i] >= 11 Entonces
				buenos = buenos + 1
			SiNo
				Si vectorNotas[i] >= 6 Entonces
					regulares = regulares + 1
				SiNo
					deficientes = deficientes + 1
				Fin Si
			Fin Si
		Fin Si
		
	Fin Para
	
	Escribir "La cantidad de estudiantes excelentes fue de: ", excelentes
	Escribir "La cantidad de estudiantes buenos fue de: ", buenos
	Escribir "La cantidad de estudiantes regulares fue de: ", regulares
	Escribir "La cantidad de estudiantes deficientes fue de: ", deficientes
	
FinAlgoritmo
