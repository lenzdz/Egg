Algoritmo Ejercicio2
	
	Definir dias, retorno Como Real
	
	Escribir "Ingrese la cantidad de d�as:"
	Leer dias
	
	mediaTemp(dias, retorno)	
	
FinAlgoritmo

SubProceso mediaTemp(dias por Valor, res Por Referencia)
	
	Definir i, minTemp, maxTemp, sumaTemp, medTemp como Real
	sumaTemp = 0
	Para i <- 1 Hasta dias Hacer
		
		Escribir "Ingrese la temperatura m�nima y la temperatura m�xima del d�a ", i, ":"
		Leer minTemp, maxTemp
		
		sumaTemp = sumaTemp + minTemp + maxTemp
		medTemp = sumaTemp/(i*2)
		
		Escribir "La media de la temperatura hasta el d�a ", i, " es ", medTemp
		
	FinPara
	
	
FinSubProceso
	