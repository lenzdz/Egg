Algoritmo sin_titulo
	
	/// Ejercicio #1
	
//	Definir sueldoMin, sueldo Como Real
//	Definir res Como Logico
//	
//	Escribir "¿Cuál es el salario mínimo en tu país?"
//	Leer sueldoMin
//	
//	Escribir "¿Cuál es tu salario?"
//	Leer sueldo
//	
//	res = sueldoMin < sueldo
//	
//	Si res == Verdadero Entonces
//		Escribir "Tu salario es mayor que el salario mínimo en tu país."
//	SiNo
//		Escribir "Tu salario no es mayor que el salario mínimo en tu país."
//	FinSi
	
	/// Ejercicio #2
	
//	Definir num, calculo Como Real
//	
//	Escribir "Ingresa un número:"
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
//	Escribir "Ingrese un número de 3 dígitos:"
//	Leer num
//	
//	dig1 = trunc(num/100)
//	dig3 = num % 10
//	
//	Si dig1 == dig3 Entonces
//		Escribir "El número es capicúa."
//	SiNo
//		Escribir "El número no es capicúa."
//	Fin Si
	
	/// Ejercicio #5
	
//	Definir dia Como Caracter
//	Definir condicion Como Logico
//	
//	Escribir "Ingrese un día de la semana:"
//	Leer dia
//	
//	dia = Minusculas(dia)
//	
//	Mientras dia <> "lunes" Y dia <> "martes" Y dia <> "miércoles" Y dia <> "miercoles" Y dia <> "jueves" Y dia <> "viernes" Y dia <> "sábado" Y dia == "sabado" Y dia == "domingo" Hacer
//		
//		Escribir "Disculpa, no ingresaste el nombre de un día de la semana. Vuelve a intentarlo."
//		Leer dia
//		
//		dia = Minusculas(dia)
//		
//	Fin Mientras
//	
//	condicion = dia == "sábado" O dia == "sabado" O dia == "domingo"
//	
//	Si condicion == Verdadero Entonces
//		Escribir "El día que ingresaste no es un día laboral."
//	SiNo
//		Escribir "El día que ingresaste es un día laboral."
//	Fin Si
	
	/// Ejercicio 6
	
	Definir numCorreos, solEmergencia Como Entero
	Escribir "¿Cuántos correos hay sin leer?"
	Leer numCorreos
	
	Escribir "¿Cuántas solicitudes de emergencia hay?"
	Leer solEmergencia
	
	Escribir "Iniciar sesión en computadora."
	Escribir "Buscar últimos ingresos publicitarios en informes de marketing."
	Escribir "Completar la hoja de cálculo de ingresos mensuales."
	
	Si numCorreos < 10 Entonces
		Escribir "Revisar correo de voz."
	SiNo
		Escribir "Responder correos electrónicos."
		Escribir "Revisar correo de voz."
	FinSi
	
	Si solEmergencia > 0 Entonces
		Escribir "Solucionar solicitudes de emergencia."
		Escribir "Realizar solicitudes de ejecutivos."
		Si numCorreos < 10 Entonces
			Escribir "Responder correos electrónicos."
		FinSi
	SiNo
		Escribir "Realizar solicitudes de ejecutivos."
		Escribir "Responder correos electrónicos."
	Fin Si
	
	Escribir "Enviar correo de actualización al finalizar la jornada."
	Escribir "Apagar la computadora."
	Escribir "Regar la planta."
	
FinAlgoritmo
