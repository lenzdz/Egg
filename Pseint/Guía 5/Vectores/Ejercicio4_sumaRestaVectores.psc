Algoritmo Ejercicio4
	
	menu()
	
FinAlgoritmo

SubProceso menu()
	
	Definir i, dim, choice, flagDim, flagA, flagB, flagC, arregloA, arregloB, arregloC Como Entero
	Definir cadenaArregloA, cadenaArregloB, cadenaArregloC como Cadena
	
	Escribir "¡Bienvenido al programa! ¿Qué deseas hacer?"
	
	dim = 0
	
	flagDim = 0 // Identificador para saber si ya se definió la dimensión de los vectores.Evita que se cree un vector C sin valores de vectores A y/o B.
	flagA = 0 // Identificador para saber si ya se le asignaron elementos al vector A. 0 indica que el vector está vacío.
	flagB = 0 // Identificador para saber si ya se le asignaron elementos al vector B. 0 indica que el vector está vacío.
	flagC = 0 // Identificador para saber si ya se le asignaron elementos al vector C. 0 indica que el vector está vacío.
	
	cadenaArregloA = "" // Se inicializan las cadenas de los arreglos para garantizar que el usuario pueda entrar a la opción 5 del menú tras haberle asignado elementos al menos a un vector.
	cadenaArregloB = ""
	cadenaArregloC = ""
	
	Repetir
		Escribir "1) Llenar el vector A"
		Escribir "2) Llenar el vector B"
		Escribir "3) Llenar el vector C con la suma entre A y B"
		Escribir "4) Llenar el vector C con la resta entre A y B"
		Escribir "5) Mostrar el vector A, B o C"
		Escribir "6) Salir"
		Leer choice
		Escribir ""
		
		Si (choice == 1 O choice == 2) Y flagDim = 0 Entonces
			Escribir "¿Qué dimensión deseas asignarle a tus vectores?"
			Leer dim
			Escribir ""
			flagDim = 1
		Fin Si
		
		Segun choice Hacer
			1: // Asignar elementos vector A
				Si flagA == 0 Entonces
					Dimension arregloA[dim]
					llenar(dim, arregloA, cadenaArregloA)
					// Escribir cadenaArregloA
					flagA = 1
				SiNo
					Escribir "¡Ups! Ya le asignaste elementos al vector A. Para asignarle nuevos elementos, reinicia el programa."
					Escribir ""
				Fin Si
				
			2: // Asignar elementos vector B
				Si flagB == 0 Entonces
					Dimension arregloB[dim]
					llenar(dim, arregloB, cadenaArregloB)
					// Escribir cadenaArregloB
					flagB = 1
				SiNo
					Escribir "¡Ups! Ya le asignaste elementos al vector B. Para asignarle nuevos elementos, reinicia el programa."
					Escribir ""
				Fin Si
			3,4: // Sumar o restar A y B para obtener vector C
				Si dim == 0 Entonces
					Escribir "¡Ups! Aún no has llenado los vectores A y B."
					Escribir ""
				SiNo
					Si flagC == 0 Entonces
						Si flagA == 1 Entonces
							Si flagB == 1 Entonces
								// Si ambos vectores están llenos:
								Dimension arregloC[dim]
								llenarC(choice, dim, arregloA, arregloB, arregloC, cadenaArregloC)
								// Escribir cadenaArregloC
								flagC = 1
							SiNo
								// Si el vector B está vacío:
								Dimension arregloB[dim]
								asignacionForzosa(flagA, flagB, dim, arregloB, cadenaArregloB) // Procedimiento para llenar de manera forzosa el vector B
								Si Longitud(cadenaArregloB)>1 Entonces // Si se aprobó el proceso de relleno forzoso del vector B:
									Dimension arregloC[dim]
									llenarC(choice, dim, arregloA, arregloB, arregloC, cadenaArregloC)
									// Escribir cadenaArregloC
									flagC = 1
								Fin Si
							Fin Si
						SiNo
							// Si el vector A está vacío:
							Dimension arregloA[dim]
							asignacionForzosa(flagA, flagB, dim, arregloA, cadenaArregloA)
							Si Longitud(cadenaArregloA)>1 Entonces // Si se aprobó el proceso de relleno forzoso del vector A :
								Dimension arregloC[dim]
								llenarC(choice, dim, arregloA, arregloB, arregloC, cadenaArregloC)
								// Escribir cadenaArregloC
								flagC = 1
							Fin Si
						Fin Si
					Sino
						Escribir "¡Ups! Ya le asignaste elementos al vector C. Para asignarle nuevos elementos, reinicia el programa."
						Escribir ""
					Fin Si
					
				Fin Si
			5: // Ver vectores (entrada válida si al menos un vector tiene elementos)
				Si dim == 0 Entonces
					Escribir "¡Ups! Aún no has llenado ningún vector."
					Escribir ""
				SiNo
					ver(cadenaArregloA, cadenaArregloB, cadenaArregloC)
				Fin Si
			6: // Salir
				Escribir "¡Hasta la próxima!"
			De Otro Modo: // Opción inválida
				Escribir "Ingresaste una opción inválida. Por favor, vuelve a intentarlo."
				Escribir ""
		Fin Segun
		
	Mientras Que choice <> 6
	
FinSubProceso


SubProceso  llenar(dim, vector Por Referencia, cadenaVector Por Referencia)
	
	Definir i Como Entero
	
	cadenaVector = ""
	Para i <- 0 Hasta dim-1 Hacer
		vector[i] = Aleatorio(-100, 100)
		Segun i Hacer
			0:
				cadenaVector = cadenaVector + "[" + ConvertirATexto(vector[i]) + ", "
			dim-1:
				cadenaVector = cadenaVector + ConvertirATexto(vector[i]) + "]"
			De Otro Modo:
				cadenaVector = cadenaVector + ConvertirATexto(vector[i]) + ", "
		Fin Segun
		
	FinPara
	
FinSubProceso


SubProceso asignacionForzosa(flagA, flagB, dim, vector Por Referencia, cadenaVector Por Referencia)
	
	Definir i Como Entero
	Definir confirmarCopia Como Caracter // Permite determinar si C será la copia del vector A o B cuando se ingresa a las opciones 3 o 4 del menú sin haberle asignado elementos a alguno de los dos vectores.
	Definir textoVectorVacio Como Cadena
	
	Si flagA == 0 Entonces
		textoVectorVacio = "El vector A aún está vacío. Dado que todos sus elementos son 0, el vector C (la suma entre A y B) será igual al vector B y todos los elementos del vector A serán 0."
	SiNo // Se asume que la opción restante para entrar a esta función es es flagB == 0
		textoVectorVacio = "El vector B aún está vacío. Dado que todos sus elementos son 0, el vector C (la suma entre A y B) será igual al vector A y todos los elementos del vector B serán 0."
	Fin Si
	
	Repetir
		Escribir textoVectorVacio
		Escribir "¿Deseas continuar? (S/N)"
		Leer confirmarCopia
		confirmarCopia = Mayusculas(confirmarCopia)
	Mientras Que confirmarCopia <> "S" Y confirmarCopia <> "N"
	
	Si confirmarCopia == "S" Entonces
		Para i <- 0 Hasta dim-1 Hacer
			vector[i] = 0
			Segun i Hacer
				0:
					cadenaVector = cadenaVector + "[" + ConvertirATexto(vector[i]) + ", "
				dim-1:
					cadenaVector = cadenaVector + ConvertirATexto(vector[i]) + "]"
				De Otro Modo:
					cadenaVector = cadenaVector + ConvertirATexto(vector[i]) + ", "
			Fin Segun
		Fin Para
	Fin Si
	
FinSubProceso


SubProceso llenarC(choice, dim, vectorA, vectorB, vectorC Por Referencia, cadenaVectorC Por Referencia)
	
	Definir i Como Entero
	
	Si choice == 3 Entonces
		Para i <- 0 Hasta dim-1 Hacer
			vectorC[i] = vectorA[i] + vectorB[i]
			Segun i Hacer
				0:
					cadenaVectorC = cadenaVectorC + "[" + ConvertirATexto(vectorC[i]) + ", "
				dim-1:
					cadenaVectorC = cadenaVectorC + ConvertirATexto(vectorC[i]) + "]"
				De Otro Modo:
					cadenaVectorC = cadenaVectorC + ConvertirATexto(vectorC[i]) + ", "
			Fin Segun
		Fin Para
	SiNo
		Para i <- 0 Hasta dim-1 Hacer
			vectorC[i] = vectorB[i] - vectorA[i]
			Segun i Hacer
				0:
					cadenaVectorC = cadenaVectorC + "[" + ConvertirATexto(vectorC[i]) + ", "
				dim-1:
					cadenaVectorC = cadenaVectorC + ConvertirATexto(vectorC[i]) + "]"
				De Otro Modo:
					cadenaVectorC = cadenaVectorC + ConvertirATexto(vectorC[i]) + ", "
			Fin Segun
		Fin Para
	Fin Si
	
FinSubProceso


SubProceso ver(cadenaVectorA, cadenaVectorB, cadenaVectorC)
	
	Definir vectorPantalla Como Caracter
	
	Repetir
		Escribir "¿Qué vector deseas ver por pantalla? Ingresa una opción válida (A, B o C):"
		Leer vectorPantalla
		vectorPantalla = Mayusculas(vectorPantalla)
	Mientras Que vectorPantalla <> "A" Y vectorPantalla <> "B" Y vectorPantalla <> "C"
	
	Segun vectorPantalla Hacer
		"A":
			Si Longitud(cadenaVectorA) > 1 Entonces
				Escribir "El vector A es: ", cadenaVectorA
				Escribir ""
			SiNo
				Escribir "El vector A todavía está vacío."
				Escribir ""
			Fin Si
			
		"B":
			Si Longitud(cadenaVectorB) > 1 Entonces
				Escribir "El vector B es: ", cadenaVectorB
				Escribir ""
			SiNo
				Escribir "El vector B todavía está vacío."
				Escribir ""
			Fin Si
		"C":
			Si Longitud(cadenaVectorC) > 1 Entonces
				Escribir "El vector C es: ", cadenaVectorC
				Escribir ""
			SiNo
				Escribir "El vector C todavía está vacío."
				Escribir ""
			Fin Si
	Fin Segun
	
FinSubProceso
	