function PersegiPanjang(panjang, lebar) {
    this.panjang = panjang
    this.lebar = lebar
}

PersegiPanjang.prototype.getLuas = function () {
    var luas = this.panjang*this.lebar
    console.log('Luas : ',this.panjang, 'x', this.lebar, ' : ', luas)
}

PersegiPanjang.prototype.print = function () {
    console.log('Panjang sisi \t: ', this.panjang)
    console.log('Lebar sisi \t: ', this.lebar)
}

function Persegi(sisi) {
    this.panjang = sisi
    this.lebar = sisi
}

Persegi.prototype = new PersegiPanjang()
Persegi.prototype.constructor = PersegiPanjang

Persegi.prototype.print = function () {
    console.log('Panjang sisi\t: ',this.panjang)
}

const prompt = require('prompt-sync')()

console.log('Persegi Panjang')
var obPersegiPanjang = new PersegiPanjang(
    prompt('Masukkan Panjang  : '),
    prompt('Masukkan Lebar    : ')
)

console.log('\nPersegi')
var obPersegi = new Persegi(
    prompt('Masukkan Panjang\t: ')
)


console.log('\nMenghitung luas persegi panjang')
obPersegiPanjang.print()
obPersegiPanjang.getLuas()

console.log('\nMenghitung luas persegi')
obPersegi.print()
obPersegi.getLuas()
