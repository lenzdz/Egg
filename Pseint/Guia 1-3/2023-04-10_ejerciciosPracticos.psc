Algoritmo sin_titulo
	
	/// Ejercicio #1
	
//	Definir sueldoMin, sueldo Como Real
//	Definir res Como Logico
//	
//	Escribir "�Cu�l es el salario m�nimo en tu pa�s?"
//	Leer sueldoMin
//	
//	Escribir "�Cu�l es tu salario?"
//	Leer sueldo
//	
//	res = sueldoMin < sueldo
//	
//	Si res == Verdadero Entonces
//		Escribir "Tu salario es mayor que el salario m�nimo en tu pa�s."
//	SiNo
//		Escribir "Tu salario no es mayor que el salario m�nimo en tu pa�s."
//	FinSi
	
	/// Ejercicio #2
	
//	Definir num, calculo Como Real
//	
//	Escribir "Ingresa un n�mero:"
//	Leer num
//	
//	Si num > 500 Entonces
//		calculo = (num*18)/100
//		Escribir "El 18 % de ", num, " es ", calculo
//	Fin Si
	
	/// Ejercicio #3
	
//	Definir letra Como Caracter
//	Definir condicion Como Logico
//	
//	Escribir "Ingresa una letra del alfabeto:"
//	Leer letra
//	
//	letra = Mayusculas(letra)
//	condicion = letra == "A" O letra == "E" O letra == "I" O letra == "O" O letra == "U"
//	
//	Si condicion == Verdadero Entonces
//		Escribir "La letra que ingresaste es una vocal."
//	SiNo
//		Escribir "La letra que ingresaste es una consonante."
//	Fin Si
	
	/// Ejercicio #4
	
//	Definir num, dig1, dig3 como Real
//	
//	Escribir "Ingrese un n�mero de 3 d�gitos:"
//	Leer num
//	
//	dig1 = trunc(num/100)
//	dig3 = num % 10
//	
//	Si dig1 == dig3 Entonces
//		Escribir "El n�mero es capic�a."
//	SiNo
//		Escribir "El n�mero no es capic�a."
//	Fin Si
	
	/// Ejercicio #5
	
//	Definir dia Como Caracter
//	Definir condicion Como Logico
//	
//	Escribir "Ingrese un d�a de la semana:"
//	Leer dia
//	
//	dia = Minusculas(dia)
//	
//	Mientras dia <> "lunes" Y dia <> "martes" Y dia <> "mi�rcoles" Y dia <> "miercoles" Y dia <> "jueves" Y dia <> "viernes" Y dia <> "s�bado" Y dia == "sabado" Y dia == "domingo" Hacer
//		
//		Escribir "Disculpa, no ingresaste el nombre de un d�a de la semana. Vuelve a intentarlo."
//		Leer dia
//		
//		dia = Minusculas(dia)
//		
//	Fin Mientras
//	
//	condicion = dia == "s�bado" O dia == "sabado" O dia == "domingo"
//	
//	Si condicion == Verdadero Entonces
//		Escribir "El d�a que ingresaste no es un d�a laboral."
//	SiNo
//		Escribir "El d�a que ingresaste es un d�a laboral."
//	Fin Si
	
	/// Ejercicio 6
	
	Definir numCorreos, solEmergencia Como Entero
	Escribir "�Cu�ntos correos hay sin leer?"
	Leer numCorreos
	
	Escribir "�Cu�ntas solicitudes de emergencia hay?"
	Leer solEmergencia
	
	Escribir "Iniciar sesi�n en computadora."
	Escribir "Buscar �ltimos ingresos publicitarios en informes de marketing."
	Escribir "Completar la hoja de c�lculo de ingresos mensuales."
	
	Si numCorreos < 10 Entonces
		Escribir "Revisar correo de voz."
	SiNo
		Escribir "Responder correos electr�nicos."
		Escribir "Revisar correo de voz."
	FinSi
	
	Si solEmergencia > 0 Entonces
		Escribir "Solucionar solicitudes de emergencia."
		Escribir "Realizar solicitudes de ejecutivos."
		Si numCorreos < 10 Entonces
			Escribir "Responder correos electr�nicos."
		FinSi
	SiNo
		Escribir "Realizar solicitudes de ejecutivos."
		Escribir "Responder correos electr�nicos."
	Fin Si
	
	Escribir "Enviar correo de actualizaci�n al finalizar la jornada."
	Escribir "Apagar la computadora."
	Escribir "Regar la planta."
	
FinAlgoritmo
