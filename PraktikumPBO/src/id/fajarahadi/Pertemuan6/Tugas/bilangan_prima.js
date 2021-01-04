var jumlah = 15;
var arrayPrima = [];
var angka = 2;
do {
    var cekPrima = true;
    for(var i=2; i<angka; i++) {
        if(angka % i === 0) {
            cekPrima = false;
        }
    }
    if(cekPrima)
        arrayPrima.push(angka);
    angka++;
} while(arrayPrima.length !== jumlah);

console.log("Bilangan prima\t: " + arrayPrima.join(", "));