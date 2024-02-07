let num;
let counter = 0;
let suma = 0;
do {
    num = parseFloat(prompt("Ingrese un número. Se calculará el promedio entre los números que ingrese hasta que incluya un número negativo."));
    if (num >= 0) {
        suma += num;
        counter++;
    }
} while (num >= 0);

console.log(suma);
console.log("El promedio de los números ingresados es " + suma/counter + ".");