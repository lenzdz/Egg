Algoritmo EjercicioZombie
	
	Definir gen, muestra como Cadena
	Definir resultado Como Logico
	Definir dim Como Entero
	
	gen = "ACCDBBADDDCCBACABDCBDCBADBDACBBBBDAABBCCBAACCABDBDCDDABDBDADAAACBBBBCDDDCBBBDDCDABBDDABDBDBBACADCDAAADACDDDACCDCACDDABACDCCCAABDDCCACDADDBCBAACCDBCBCDDDCAACCBAADCBBBCDCBBACBDCCDDADBABCAABBACABDCAACCBDADDCAAACCDBDBBCDDDDDACBCDDADDDDCBADADBDCADDABBCDAACBCCDDDADDADADAACCACDCDDABCCCADABBACDACCAADDBCBCCDADBCCADAAABDDDAABBABCADDCCAADDCDDCDCACBADADACADDAADCBDBCDBDDACDCBCDCCABBDCBACDDACCCDADBCADCACAAABBBCADDDDBCBACDBDAAADDDACCDACBBBADACCCDCACCBACDADBCBBDADACABAACBCCADDCCCCACCCCADBCCDAADCAABBABAADDBDADDABABCCABBCDDACCADAAADBBCCDBADCADCBBDADACCDDBCAAABBBDCAAAACBAADBABBABACDDBBCBDCDCADABABBDADCBADAACDBCBDABADBCBADCACADAABCDDCABACDDBDCBCBDCAAACBDABBCACBACCCBACACDCADBDCDCDDCAACDBDCBACDBBDAABDBBCBAAADBABDBAACAAACDCDAAABABDDDBCACADCBBAADCCDABCCCBBCACCBAABDAADDDCDACDDDBCDCCBABDABACCDCDCDABAABCABBADADCBDDACDDCDDCDACDADADCACBCDABABDDCCDBCCDABACDBDAABDBDDDBADDBACABDCDDBACDDBBDDBBACBCCAACABBDADDBCAACCBCCDADDBCAADDADCCCBAAABABBBBBCABAACADBCBBABACCABCDAABADCCCCDCCADDDCCABBDDDAAADDADACBBBCBDAADACABABBAACCCADADDABDBCADDDCCDBBCCBCDCDBDDDDCACDACDBBBDDBADDACADDADDABCACDCBBADDABBBDCBBDCDAABADDDDDBCACCCCAAACBCBCDBACCCDACCCDBCBDCBADBCDDACCDBDBDBCAAACDDCBAABDBCAADCADDBABABDCBCBCBBBCACBCADDCAAAAAACBBACBBCCACBDCDDDDADCAAACBABDDBDADBAADCBABDDBCDBABDBAADDDBACBBBCCCDBDDBDDAADBBADADDDCBCACBABCDBBABAADABCABCDBACBBBCDBADADDBDCBDABBDDDCDDCCACDCBDCADABAABCDCAACCDDBADBDBCDACAAACBCADCCCBAC"
	
	Si Longitud(gen) == 9 Entonces
		dim = 3
	SiNo
		Si Longitud(gen) == 16 Entonces
			dim = 4
		SiNo
			dim = 37
		Fin Si
	Fin Si
	
	Dimension muestra[dim, dim]
	rellenarMuestra(dim, gen, muestra)
	
	impresion(dim, muestra)
	
	resultado = chequeo(dim, muestra)
	Escribir "El resultado es ", resultado, " para la mutación del gen Z."
	
FinAlgoritmo


SubProceso rellenarMuestra(dim, gen, muestra)
	
	Definir i, j, indice Como Entero
	
	indice = 0
	Para i <- 0 Hasta dim-1 Hacer
		Para j <- 0 Hasta dim-1 Hacer
			muestra[i,j] = Subcadena(gen, indice, indice)
			indice = indice + 1
		Fin Para
	Fin Para

FinSubProceso

Funcion retorno <- chequeo(dim, muestra)
	
	Definir i, j Como Entero
	Definir baseDiagPrim, baseDiagSec como Cadena
	Definir retorno Como Logico
	
	retorno = Verdadero
	Para i <- 0 Hasta dim-1 Hacer
		Si i == 0 Entonces
			baseDiagPrim = muestra[i,i]
		SiNo
			Si baseDiagPrim <> muestra[i,i] Entonces
				retorno = Falso
				i = dim
			Fin Si
		Fin Si
	Fin Para
	
	j = dim-1
	Para i <- 0 Hasta dim -1 Hacer
		Si i == 0 Entonces
			baseDiagSec = muestra[i,j]
		SiNo
			Si baseDiagSec <> muestra[i,j] Entonces
				retorno = Falso
				i = dim
			Fin Si
		Fin Si
		j = j - 1
	Fin Para
	
FinFuncion

SubProceso impresion(tamanio, mat)
	
	Definir i, j Como Entero
	Definir impresionFila como Cadena
	
	Para i <- 0 Hasta tamanio-1 Hacer
		impresionFila = ""
		Para j <- 0 Hasta tamanio-1 Hacer
			Segun j Hacer
				0:
					impresionFila = impresionFila + "[" + (mat[i,j]) + ", "
				tamanio-1:
					impresionFila = impresionFila + (mat[i,j]) + "]"
				De Otro Modo:
					impresionFila = impresionFila + (mat[i,j]) + ", "
			Fin Segun
		Fin Para
		Escribir impresionFila
	Fin Para
	
	
FinSubProceso
	