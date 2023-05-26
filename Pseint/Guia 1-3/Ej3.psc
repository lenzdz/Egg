Algoritmo Ej3
	//Definimos variables
	Definir user,pass, respuesta como caracteres
	Definir Login como logica
	Definir contador, op, botellas, gramos, suma, precio, saldo como entero
	saldo = 0
	Login=Verdadero
	
////	//Login
////	Repetir  //Reptir mientras o Hacer mientras
////		Escribir "Ingrese su usuario"
////		Leer user
////	Mientras Que user <> "Albus_D"
////	
////	pass=""
////	contador=0
////	Mientras pass<> "caramelosDeLimon" y contador<3
////		Escribir "Ingrese contraseña ,intento ",contador+1,")"
////		Leer pass
////		si pass<> "caramelosDeLimon"
////			Escribir "Su contraseña es incorrecta"
////		FinSi
////		si pass<> "caramelosDeLimon" y contador == 2 //Esto es para el ultimo ciclo
////			Escribir "Se bloqueo tu clave"
////			Login = Falso
////		FinSi
////		contador = contador +1
////	FinMientras
	
	//Menu botellas
	Si login == Verdadero Entonces
		Hacer 
			Escribir "Elija una opción escribiendo su número. (1) Ingresar botellas (2) Consultar saldo (3) Salir"
			Leer op
				Segun op
					1: 
						Escribir "Ingrese el número de botellas"
						Leer botellas
						suma=0
						Para contador <- 1 Hasta botellas Hacer
							Escribir "Ingrese la botella " contador
							gramos = Aleatorio(100, 3000)
							Escribir "El peso es " gramos
							Si gramos <= 500 Entonces
								precio = 50
							SiNo
								Si gramos <= 1500 Entonces
									precio = 125
								SiNo
									precio =200
								FinSi
							FinSi
							Escribir "¿Acepta que se le pague " precio " ? S= Sí o N=No"
							Leer respuesta
							Si mayusculas(respuesta) == "S" Entonces
								suma =suma+ precio
							SiNo
								Escribir "Devolviendo material"
							FinSi
							Escribir "El saldo parcial es " suma
						FinPara
						saldo = saldo + suma
					2:
						Escribir "El saldo total es: " saldo
					3: 
						Escribir "Gracias por venir. Hasta la próxima"
					De Otro Modo:
						Escribir "No ingresó una opción valida"
				FinSegun
		Mientras que op <> 3 
	FinSi

	
	
	//ha ingresado bien o mal la contraseña
	
FinAlgoritmo
