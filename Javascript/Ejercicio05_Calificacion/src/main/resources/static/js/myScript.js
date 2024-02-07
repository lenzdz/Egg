let res = parseFloat(prompt("¿Cuál fue su calificación en el examen?"));

if (Number.isNaN(res)) {
    console.log("No ingresaste un número.");
} else if (res < 0 || res > 100) {
    console.log("No ingresaste un número válido.");
} else if (res < 70) {
    console.log("Lo siento, no aprobaste el examen. ¡Sigue estudiando!");
} else {
    console.log("¡Felicidades! Aprobaste el examen.");
}