Algoritmo Ejercicio8
	
	Definir dia, mes, anio Como Entero
	Definir resultado como Cadena
	Definir fechaValida Como Logico
	
	Repetir
		Escribir "Ingrese una fecha válida (dd/mm/aaa):"
		Leer dia, mes, anio
		
		Segun mes Hacer
			1,3,5,7,8,10,12:
				Si dia >= 1 Y dia <= 31 Entonces
					fechaValida = Verdadero
				SiNo
					fechaValida = Falso
				Fin Si
			4,6,9,11:
				Si dia >= 1 Y dia <= 30 Entonces
					fechaValida = Verdadero
				SiNo
					fechaValida = Falso
				Fin Si
			2: // Febrero
				Si dia >= 1 Y dia <= 28 Entonces
					fechaValida = Verdadero
				SiNo
					Si dia == 29 Entonces
						// Chequeo de bisiesto
						Si anio % 4 == 0 Entonces
							fechaValida = Verdadero
						SiNo
							fechaValida = Falso
						Fin Si
					SiNo
						fechaValida = Falso
					Fin Si
				Fin Si
			De Otro Modo:
				fechaValida = Falso
		Fin Segun
		
	Mientras Que fechaValida = Falso
	
	diaAnterior(dia, mes, anio, resultado)
	Escribir resultado
	
FinAlgoritmo

SubProceso diaAnterior(dia, mes, anio, retorno Por Referencia)
	
	// Cambio al día anterior
	
	Si dia == 1 Entonces
		Segun mes Hacer
			2,4,6,8,9,11: // Devolver a día 31 (mes anterior)
				dia = 31
				mes = mes - 1
			5,7,10,12: // Devolver a día 30 (mes anterior)
				dia = 30
				mes = mes - 1
			3: // Devolver a febrero
				Si anio % 4 == 0 Entonces
					dia = 29
				SiNo
					dia = 28
				Fin Si
				mes = mes - 1
			1: // Devolver a diciembre del año pasado
				dia = 31
				mes = 12
				anio = anio - 1
		Fin Segun
	SiNo
		dia = dia - 1
	Fin Si
	
	retorno = "El día anterior fue " + ConvertirATexto(dia) + "/" + ConvertirATexto(mes) + "/" + ConvertirATexto(anio) + "."
FinSubProceso
	