function readNumbers() {
    let numbersList = [];
    let num;
    do {
        num = parseFloat(prompt("Ingrese un número:"));
        if (Number.isNaN(num)) {
            console.log("No ingresó un número válido.");
            num = 0;
        } else if (num < 0) {
            continue;
        } else {
            numbersList.push(num);
        }        
    } while(num >= 0);
    return numbersList;
}

function forStructure() {

    let numbersList = readNumbers();

    let suma = 0;
    numbersList.forEach(element => {
        suma += element;
    });
    console.log("El promedio entre los números ingresados es " + suma/numbersList.length + ".");

}

function whileStructure() {

    let numbersList = readNumbers();

    let length = numbersList.length;
    let suma = 0;
    while (length > 0) {
        suma += numbersList[length-1];
        length -= 1;
    }
    
    console.log("El promedio entre los números ingresados es " + suma/numbersList.length + ".");

}

function ifStructure() {

    let numbersList = readNumbers();

    let suma;
    if (numbersList.length > 0) {
        suma = numbersList.reduce((a,b)=> a+b);
    }

    console.log("El promedio entre los números ingresados es " + suma/numbersList.length + ".");

}