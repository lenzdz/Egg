let secretNumber = Math.floor((Math.random()*100));
console.log(secretNumber);

let res;
do {
    res = parseInt(prompt("¡Adivina el número secreto! Está entre 0 y 99."));
    if (Number.isNaN(res)) {
        console.log("No ingresaste un número.");
        res = -1;
    } else if (res < 0) {
        console.log("El número no debe ser negativo.");
        res = -1;
    } else if (res != secretNumber) {
        console.log("¡Ups! " + res + " no es el número secreto.");
    } else {
        console.log("¡Has ganado!");
    }  
} while(res != secretNumber);
