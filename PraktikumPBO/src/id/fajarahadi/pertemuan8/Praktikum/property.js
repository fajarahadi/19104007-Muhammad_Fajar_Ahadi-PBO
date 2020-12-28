//deklarasi input

const prompt = require('prompt-sync')()

let object = {}
object.name = prompt('Input Nama\t: ')
object.age = prompt('Input Age\t: ')
object.nim = prompt('Input Nim\t: ')
object.prodi = prompt('Input Prodi\t: ')

console.log('')

console.log(object)

//object.name == object['name']

for(var property in object){
  console.log(property + `\t\t: ${object[property] }`)
}