Funcion isPrime <- checkPrime ( n )
	
	Definir idx como Entero
	Definir isPrime Como Logico
	isPrime = Verdadero
	
	idx = 2
	Mientras idx <= redon(raiz(n)) Y isPrime == VERDADERO Hacer
		Si n % idx == 0 Entonces
			isPrime = Falso
		Fin Si
		idx = idx + 1
	Fin Mientras
	
Fin Funcion

Algoritmo primeNumber
	Definir numInput Como Entero
	Definir res Como Logico
	
	Escribir 'Ingrese un numero entero mayor o igual a 1'
	Leer numInput
	Mientras numInput <= 0 Hacer
		Escribir 'Ingrese un numero entero mayor o igual a 1'
		Leer numInput
	Fin Mientras
	
	res = checkPrime(numInput)
	Escribir res
	
FinAlgoritmo
