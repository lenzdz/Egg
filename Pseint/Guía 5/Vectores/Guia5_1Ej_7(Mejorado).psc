//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//	hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//			función debe devolver el resultado de está validación, para mostrar el mensaje en el
//			algoritmo. Nota: recordar el uso de las variables de tipo lógico.

SubProceso llenarVectorManual(vector Por Referencia, longVector)
	definir i, x Como Entero
	
	
	para i = 0 hasta longVector-1 Hacer
		Escribir "Ingrese el valor: " i+1
		leer x
		vector[i] = x
	FinPara
	
FinSubProceso

SubProceso llenarVector(vector Por Referencia, longVector)
	definir i Como Entero
	
	para i = 0 hasta longVector-1 Hacer
		vector[i] = Aleatorio(-10,10)
	FinPara
	
FinSubProceso

SubProceso mostrarVector(vector,longVector)
	definir i Como Entero
	Escribir " "
	Escribir "************************************************************************"
	para i = 0 hasta longVector-1 Hacer
		Escribir sinsaltar vector[i] " "
	FinPara
	Escribir " " 
	Escribir "************************************************************************"
	Escribir " "
FinSubProceso

SubProceso OrdenarVector(vector, longVector)
	Definir i, j, temp Como Entero
	Para i=0 Hasta longVector-1
		para j = (i) Hasta longVector-1
			si vector[i] > vector[j]
				Temp = vector[i]
				vector[i] = vector[j]
				vector[j] = Temp
			FinSi
		FinPara
	FinPara
FinSubProceso


Funcion iguales = IgualdadVectores(vectorA,vectorB, longVector)
	Definir iguales Como logico
	iguales = Verdadero
	definir i, j, aux Como Entero
	i = 0
	Para i=0 Hasta longVector-1 Hacer
		Si vectorA[i]<>vectorB[i] Entonces
			iguales = Falso
		FinSi
	FinPara
		
FinFuncion

Algoritmo Guia5_1Ej_7_Mejorado
	definir vectorA, vectorB, longVector Como Entero
	Definir iguales Como Logico
	Escribir "Ingrese el tamaño de los vectores:" 
	leer longVector
	Dimension vectorA[longVector]
	Dimension vectorB[longVector]
	
	llenarVector(vectorA, longVector)
	llenarVector(vectorB, longVector)
	
	OrdenarVector(vectorA,longVector)
	OrdenarVector(vectorB,longVector)
	
	iguales = IgualdadVectores(vectorA,vectorB,longVector)

	si iguales Entonces
		Escribir "Los valores de vectores son iguales! "
	sino
		Escribir "Los valores de vectores NO son iguales! "
	FinSi
	
	Escribir "El vector A ordenado es: "
	mostrarVector(vectorA,longVector)
	Escribir "El vector B ordenado es: "
	mostrarVector(vectorB,longVector)
	
FinAlgoritmo
