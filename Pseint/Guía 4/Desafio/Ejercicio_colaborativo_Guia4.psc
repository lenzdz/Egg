Algoritmo Ejercicio_colaborativo_Guia4
	
	menu()
	Escribir 'Fin de la ejecucion'
	
FinAlgoritmo

SubProceso menu ()
	Definir flag, choice Como Entero
	flag = 1
	
	Mientras  flag == 1 Hacer
	
		Escribir 'Elija una opcion segun el numero de la lista'
		Escribir '1.! Calcular muro de ladrillo'
		Escribir '2.! Calcular viga de hormigón'
		Escribir '3.! Calcular columnas de hormigón'
		Escribir '4.! Calcular contrapisos'
		Escribir '5.! Calcular techo'
		Escribir '6.! Calcular pisos'
		Escribir '7.! Calcular pintura'
		Escribir '8.! Calcular iluminación'
		Escribir '9.! Salir'
		Leer choice
	
		Segun choice Hacer
			1:
				calcularMuro()
			2:
				calcularViga()
			3:
				calcularColumna()
			4:
				calcularColumna()
			5:
				calcularTecho()
			6:
				calcularPisos()
			7:
				calcularPintura()
			8:
				calcularIluminacion()
			9:
				flag = 0
				
		Fin Segun
		Escribir'*****'
		Escribir ''
	FinMientras
	
FinSubProceso

Funcion  volumen <- calcularVolumen()
	
	Definir grosor,alto,largo,volumen Como Real
	
	Escribir 'Ingrese el grosor del area:'
	Leer grosor
	Escribir 'Ingrese el largo del area:'
	Leer largo
	Escribir 'Ingrese el alto del area:'
	Leer alto
	
	volumen = grosor*alto*largo
	
FinFuncion

Funcion superficie <- calcularSuperficie()
	
	Definir volumen, largo, alto, grosor, superficie Como Real
	
	Escribir 'Ingrese el largo del area'
	Leer largo
	Escribir 'Ingrese el alto del area'
	Leer alto

	superficie = alto*largo
	
FinFuncion


SubProceso calcularMuro()
	
	Definir superficie, grosor Como Real
	superficie = calcularSuperficie()
	
	Escribir 'Ingrese el grosor del muro:'
	Leer grosor
	Mientras grosor <> 20 y grosor <> 30 Hacer
		
		Escribir 'Elija una opcion, o 20, o 30'
		Leer grosor
		
	FinMientras
	Escribir 'La superficie del muro es ', superficie Sin Saltar
	Segun grosor Hacer
		
		20: 
			Escribir 'm2, y para un grosor de ', grosor,'cm necesitaremos ', superficie*10.9,'kg de cemento, ',superficie*0.09,'m3 de arena y ',superficie*90,' ladrillos.'
		30: 
			Escribir 'm2, y para un grosor de ', grosor,'cm necesitaremos ',superficie*15.2,'kg de cemento, ', superficie*0.115,'m3 de arena y ',superficie*120,' ladrillos.'
			
	FinSegun
	
FinSubProceso

SubProceso calcularViga()
    Definir largoViga  Como Real
    Escribir "Ingrese el largo de la viga en metros: "
    Leer largoViga

    Escribir "Materiales necesarios para la viga de ", largoViga, " metros:"
    Escribir " - ", largoViga*9 " kg de cemento"
    Escribir " - ", 0.02 * largoViga, " m3 de arena"
    Escribir " - ", 0.02 * largoViga / 2, " m3 de piedra"
    Escribir " - ", 4 * largoViga, " m de hierro del 8"
    Escribir " - ", 3 * largoViga, " m de hierro del 4"
	
FinSubProceso

SubProceso calcularColumna()
	Definir largoColumna Como Real;
	
	Escribir 'Ingrese el largo de la columna";
	Leer largoColumna;
	
	Escribir 'Para ", largoColumna, "metros de Columna, se necesita la siguinte lista de materiales: ";
	Escribir largoColumna * 7.5, "kg de Cemento, ", largoColumna * 0.016, " m3 de Arena "
	Escribir largoColumna * 0.016, "m2 de Piedra, ", largoColumna * 6, " metros de hierro #10 "
	Escribir "Y ",largoColumna * 3, " metros de hierro #4 ";
	
FinSubProceso

SubProceso calcularContrapisos()
	
	Definir volumen Como Real
	
	volumen = calcularVolumen()	
	Escribir "Usted necesitará: ", volumen * 105 " kg de cemento, ", volumen * 0.45, "m³ de arena y ", volumen * 0.9, " m³ de piedra."
	
FinSubProceso

SubProceso calcularTecho()
	Definir volumen Como Real
	volumen = calcularVolumen()
	
	Escribir 'Por metro cuadrado de techo se necesita: ',volumen*33,'kg de cemento, ',volumen* 0.072,' m3 de arena, ',volumen*0.072,' m3 de piedra, ',volumen* 7,' m de hierro del 8 y ', volumen*4,' m de hierro del 6'
	
FinSubProceso

SubProceso calcularPisos
	Definir superficie como Real
	
	superficie = calcularSuperficie()
		
	Escribir "Calcular pisos ", superficie+(superficie*0.10), "m2, teniendo en cuenta los recortes."
FinsubProceso 

SubProceso calcularPintura()
	Definir cantidadPintura, superficie Como Real
	
	superficie = calcularSuperficie()
	
	Escribir "La cantidad de pintura en litros requerida para pintar ',superficie,' es de: ", superficie/6,' teniendo en cuenta que cada lts rinde 6m2'
FinSubProceso

SubProceso calcularIluminacion()
	
	Definir superficie Como Real
	superficie=calcularSuperficie()
	Escribir 'La cantidad minima de iluminacion natural es de: ' superficie*0.20

FinSubProceso
