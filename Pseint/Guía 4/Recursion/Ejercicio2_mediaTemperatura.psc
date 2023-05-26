Algoritmo Ejercicio2
	
	Definir dias, retorno Como Real
	
	Escribir "Ingrese la cantidad de días:"
	Leer dias
	
	mediaTemp(dias, retorno)	
	
FinAlgoritmo

SubProceso mediaTemp(dias por Valor, res Por Referencia)
	
	Definir i, minTemp, maxTemp, sumaTemp, medTemp como Real
	sumaTemp = 0
	Para i <- 1 Hasta dias Hacer
		
		Escribir "Ingrese la temperatura mínima y la temperatura máxima del día ", i, ":"
		Leer minTemp, maxTemp
		
		sumaTemp = sumaTemp + minTemp + maxTemp
		medTemp = sumaTemp/(i*2)
		
		Escribir "La media de la temperatura hasta el día ", i, " es ", medTemp
		
	FinPara
	
	
FinSubProceso
	