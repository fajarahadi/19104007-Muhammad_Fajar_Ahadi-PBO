var jml = 11;
var cekFibonacci = [0, 1];

for(var i=0; i<jml-2; i++) {
    cekFibonacci.push(cekFibonacci[i] + cekFibonacci[i+1]);
}

// Output hasil
console.log("Bilangan Fibonacci\t: " + cekFibonacci.join(", "));