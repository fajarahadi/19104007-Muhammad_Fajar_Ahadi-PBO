const prompt = require('prompt-sync')()

let total = prompt('Berapa mahasiswa\t: ')

var arrayMhs = []//array
var mahasiswa = {}//object

for(let i = 0; i<total; i++){
  console.log(`\nMahasiswa ${ i }`)

  mahasiswa = {
    name : prompt('Masukkan Nama\t\t\t: '),
    birth : prompt('Masukkan Tanggal Lahir\t: '),
    nim : prompt('Masukkan NIM\t\t\t: '),
    age : function(){
      let year = this.birth.slice(this.birth.length - 4)
      return 2020 - year
    }
  }

  arrayMhs.push(mahasiswa)
}

let index = 0

for(let x in arrayMhs){
  console.log(`\nMahasiswa ${ index }`)
  index++
  //memanggil value object di array
  console.log(`Nama\t\t\t: ${ arrayMhs[x].name }`)
  console.log(`Tanggal Lahir\t: ${ arrayMhs[x].birth }`)
  console.log(`NIM\t\t\t\t: ${ arrayMhs[x].nim }`)
  console.log(`Umur\t\t\t: ${ arrayMhs[x].age() }`)
}