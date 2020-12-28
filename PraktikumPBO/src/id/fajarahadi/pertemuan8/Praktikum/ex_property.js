var person0 = {}//deklarasi object tanpa value
var person1 = {name : 'Squid'}
var person2 = new Object()

person2.name = 'Word'

person1.age = 20
person2.age = 25

console.log('Object person1\t: ')
console.log(`name\t: ${ person1.name }`)
console.log('age\t\t: ' + person1.age)

console.log()

console.log('Object person1\t: ')
console.log(`name\t: ${ person2.name }`)
console.log('age\t\t: ' + person2.age)
