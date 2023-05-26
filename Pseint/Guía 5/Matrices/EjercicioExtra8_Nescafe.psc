Algoritmo EjercicioExtra8
	
	Definir filas, columnas, matriz Como Real
	
	filas = 4 // Número de representantes (4)
	columnas = 5 // Número de zonas (5)
	
	Dimension matriz[filas, columnas]
	rellenar(filas, columnas, matriz)
	
	menu(filas, columnas, matriz)
	
FinAlgoritmo


SubProceso rellenar(fil, col, mat)
	
	Definir i, j Como Entero
	
	Escribir "Bienvenido al menú de ingreso de ventas. Las zonas son (1) norte, (2) sur, (3) este, (4) oeste y (5) centro."
	Escribir ""
	
	Para i <- 0 Hasta fil-1 Hacer
		Para j <- 0 Hasta col-1 Hacer
			Escribir Sin Saltar "Ingrese el monto de las ventas del representante #", i+1, " para la zona #", j+1, " "
			Leer mat[i,j]
		Fin Para
		Escribir "" 
	Fin Para
	
FinSubProceso


SubProceso menu(fil, col, mat)
	
	Definir choice Como Entero
	
	Repetir
		Escribir "¿Qué desea hacer?"
		Escribir "1) Conocer el total de ventas por zona"
		Escribir "2) Conocer el total de ventas de un representante"
		Escribir "3) Conocer el total de ventas de todos los representantes"
		Escribir "4) Salir del menú"
		Leer choice
		Escribir ""
		
		Segun choice Hacer
			1:
				ventasPorZona(fil, mat)
			2:
				ventasPorRepresentante(col, mat)
			3:
				totalRepresentantes(fil, col, mat)
			4:
				Escribir "¡Hasta la próxima!"
			De Otro Modo:
				Escribir "Opción no válida. Inténtelo nuevamente."
				Escribir ""
		Fin Segun
	Mientras Que choice <> 4
	
	
FinSubProceso


SubProceso ventasPorZona(fil, mat)
	
	Definir i, zona Como Entero
	Definir sumaZona Como Real
	
	Repetir
		Escribir "¿Sobre qué zona desea información? Las zonas son (1) norte, (2) sur, (3) este, (4) oeste y (5) centro."
		Leer zona
	Mientras Que zona < 1 O zona > 5
	
	sumaZona = 0
	Para i <- 0 Hasta fil-1 Hacer
		sumaZona = sumaZona + mat[i,zona-1]
	Fin Para
	
	Escribir "El total de las ventas para la zona #", zona, " fue de ", sumaZona
	Escribir ""
	
FinSubProceso


SubProceso ventasPorRepresentante(col, mat)
	
	Definir j, representante Como Entero
	Definir sumaRepresentante Como Real
	
	Repetir
		Escribir "¿Sobre qué representante desea información? Escriba un número de 1 a 4"
		Leer representante
	Mientras Que representante < 1 O representante > 4
	
	sumaRepresentante = 0
	Para j <- 0 Hasta col-1 Hacer
		sumaRepresentante = sumaRepresentante + mat[representante-1,j]
	Fin Para
	
	Escribir "El total de las ventas para el representante #", representante, " fue de ", sumaRepresentante
	Escribir ""
	
FinSubProceso


SubProceso totalRepresentantes(fil, col, mat)
	
	Definir i, j Como Entero
	Definir sumaTotal Como Real
	
	sumaTotal = 0
	Para i <- 0 Hasta fil-1 Hacer
		Para j <- 0 Hasta col-1 Hacer
			sumaTotal = sumaTotal + mat[i,j]
		Fin Para
	Fin Para
	
	Escribir "El total de las ventas fue de ", sumaTotal
	Escribir ""
	
FinSubProceso
	