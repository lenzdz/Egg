Algoritmo desafio2_dia17
	
	menu()
	
FinAlgoritmo

//MENU

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
				calcularContrapisos()
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
		Escribir "";
		
	FinMientras
	
FinSubProceso

//****Superficie ***
Funcion retorno = calcularSuperficie()
	Definir superficie, retorno, alto, largo Como Real
	
	Escribir "Ingrese alto y largo: "
	Leer alto, largo
	
	superficie = alto * largo
	retorno = superficie
FinFuncion


Funcion  volumen <- calcularVolumen()
	
	Definir grosor,alto,largo,volumen Como Real
	
	Escribir 'Ingrese el grosor del area a medir:'
	Leer grosor
	Escribir 'Ingrese el largo del area a medir'
	Leer largo
	Escribir 'Ingrese el alto del area a medir'
	Leer alto
	
	volumen = grosor*alto*largo
	
FinFuncion


//**1 ****
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

//***2 ****
SubProceso calcularViga()
    Definir largoViga, cemento, arena, piedra, hierro8, hierro4 Como Real
    Escribir "Ingrese el largo de la viga en metros: "
    Leer largoViga
    cemento = 9 * largoViga
    arena = 0.02 * largoViga
    piedra = 0.02 * largoViga / 2
    hierro8 = 4 * largoViga
    hierro4 = 3 * largoViga
    Escribir "Materiales necesarios para la viga de ", largoViga, " metros:"
    Escribir " - ", cemento, " kg de cemento"
    Escribir " - ", arena, " m3 de arena"
    Escribir " - ", piedra, " m3 de piedra"
    Escribir " - ", hierro8, " m de hierro del 8"
    Escribir " - ", hierro4, " m de hierro del 4"
	menu()
FinSubProceso


//subprograma 3 calcularColumna
//Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg de
//	cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro del 4.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularColumna()
	Definir largoColumna, cemento  Como Real;
	
	Escribir 'Ingrese el largo de la columna";
	Leer largoColumna;
	
	Escribir 'Para ", largoColumna, "metros de Columna, se necesita la siguinte lista de materiales: ";
//	cemento = largoColumna * 7.5;
//	arena = largoColumna * 0.016;
//	piedra = largoColumna * 0.016;
//	hierro10 = largoColumna * 6;
//	hierro4 =largoColumna * 3;
	
	Escribir largoColumna * 7.5, "kg de Cemento, ", largoColumna * 0.016, " m3 de Arena "
	Escribir largoColumna * 0.016, "m2 de Piedra, ", largoColumna * 6, " metros de hierro #10 "
	Escribir "Y ",largoColumna * 3, " metros de hierro #4 ";
	
FinSubProceso



//****Funcion 4******

SubProceso calcularContrapisos()
	Definir espesor, ancho, largo, volumen, cemento, arena, piedra Como Real
	
	Escribir "Ingrese el espesor del contrapiso en metros: "
	Leer espesor
	
	Escribir "Ingrese el ancho del contrapiso en metros: "
	Leer ancho
	
	Escribir "Ingrese el largo del contrapiso en metros: "
	Leer largo
	
	volumen = espesor * ancho * largo
	
	cemento = volumen * 105
	arena = volumen * 0.45
	piedra = volumen * 0.9
	
	Escribir "Para un contrapiso de ", espesor, " metros de espesor, ", ancho, " metros de ancho y ", largo, " metros de largo:"
	Escribir "- Se necesitan ", cemento, " kg de cemento."
	Escribir "- Se necesitan ", arena, " m3 de arena."
	Escribir "- Se necesitan ", piedra, " m3 de piedra."
FinSubProceso


// ****5 ****
//Nos debe pedir espesor, ancho y largo del techo a calcular.
//Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena, 0.072 m3 de
//	piedra, 7 m de hierro del 8 y 4 m de hierro del 6
//	Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularTecho()
	Definir volumen Como Real
	
	volumen = calcularVolumen()
	
	Escribir 'Para ", volumen, "metros de Columna, se necesita la siguinte lista de materiales: ";
	Escribir volumen * 33, "kg de Cemento, ", volumen * 0.072, " m3 de Arena "
	Escribir volumen * 0.072, "m2 de Piedra, ", volumen * 7, " metros de hierro #8 "
	Escribir "Y ",volumen * 3, " metros de hierro #6 ";
	
FinSubProceso

//******6 ****
SubProceso calcularPisos()
	Definir ancho, largo, superficie, extraRecortes como Real
	
	Escribir "Ingrese ancho"
	Leer ancho
	
	Escribir "Ingrese largo"
	Leer largo
	
	superficie = ancho * largo
	
	extraRecortes = superficie * 0.1
	
	Escribir "Calcular pisos ", superficie + extraRecortes, " m²"
FinSubProceso


//**** 7 ***

SubProceso calcularPintura()
	Definir cantidadPintura, superficie Como Real
	
	superficie = calcularSuperficie()
	
	Escribir "Ingrese cantidad de pintura en litros: "
	Leer cantidadPintura
	
	
	cantidadPintura = superficie / 6
	
	Escribir "La cantidad de pintura en litros requerida es de: " cantidadPintura
FinSubProceso

//**** 8 ***
//Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente forma:
//	superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural (ventanas y
//	puertas de vidrio). Mostrar resultado
SubProceso calcularIluminacion()
	Definir superficie Como Real
	
	superficie=calcularSuperficie();
	
	Escribir 'La cantidad minima de iluminacion natural es de: ' superficie*0.20;
	
FinSubProceso