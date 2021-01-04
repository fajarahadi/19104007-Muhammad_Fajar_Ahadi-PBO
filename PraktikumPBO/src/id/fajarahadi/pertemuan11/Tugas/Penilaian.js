const prompt = require('prompt-sync')();

let nilai
let total
var array = []

const prodi = ['S1 SE', 'S1 IF', 'S1 SI']

function funGrade(nilai){
    if(nilai > 80 && nilai <= 100){
        return 'A'
    }else if(nilai > 60 && nilai <= 80){
        return 'B'
    }else if(nilai > 40 && nilai <= 60){
        return 'C'
    }else{
        return 'D'
    }
}

// fungsi data mahasiswa | object pattern
function Mahasiswa(name, nim, birth, prodi, grade = null){
    var name = name
    var nim = nim
    var birth = birth
    var prodi = prodi
    var grade = grade

    // getter
    this.getName = function(){
        return name
    }

    this.getNim = function(){
        return nim
    }

    this.getBirth = function(){
        return birth
    }

    this.getProdi = function(){
        return prodi
    }

    this.getGrade = function(){
        return grade
    }

    this.getAge = function(){
        return 2020 - birth
    }
}

// menu penilaian


Boolean(menu = false)

// perulangan non-stop
do{
    console.log()
    console.log('<====== MENU PENILAIAN ======>')
    console.log('1. Tambah Mahasiswa')
    console.log('2. Penilaian')
    console.log('3. Lihat Seluruh Mahasiswa')
    console.log('4. Keluar')
    var input = prompt('Masukkan Pilihan : ') // masukkan pilihan menu

    console.log()

    if(input==1){
        total = prompt('Berapa Banyak Mahasiswa : ')

        // input data mahasiswa
        for (let i = 1; i <= total; i++) {
            console.log(`\nMahasiswa ${i}`)
            let name =  prompt('Masukkan Nama           : ')
            let nim =   prompt('Masukkan NIM            : ')
            let birth = prompt('Masukkan Tanggal Lahir  : ')
            
            // input prodi
            console.log('\n<== Prodi ==>')
            console.log('1. S1 SE')
            console.log('2. S1 IF')
            console.log('3. S1 SI')

            let idProdi = prompt('Masukkan Prodi : ')
            idProdi = idProdi - 1 // ketika user memasukkan nomer 1
                                    // maka yang terpilih nomer 1
            
            array.push(
                new Mahasiswa(name,nim,birth,idProdi)
            ) // push data ke array

            console.log()
        }

        console.log('Data Berhasil Disimpan. . . .')
    }else if(input==2){
        var inputNim = prompt('Masukkan Nim\t: ')
        var inputNilai = prompt('Masukkan Nilai\t: ')

        // memasukkan nilai sesuai nim yang cocok
        for (let i = 0; i < array.length; i++) {
            if(array[i].getNim() == inputNim){
                array[i].getGrade() = funGrade(inputNilai)
            }
        }

        console.log("Nilai Berhasil Disimpan. . . .")
    }else if(input==3){
        // menampilkan data mahasiswa
        let index = 0

        for(let x in array){
            console.log(`\nMahasiswa      : ${index+1}`)
            index++
            console.log(`Nama           : ${array[x].getName()}`)
            console.log(`Tanggal Lahir  : ${array[x].getBirth()}`)
            console.log(`NIM            : ${array[x].getNim()}`)
            console.log(`Umur           : ${array[x].getAge()}`)
            console.log(`Prodi          : ${prodi[array[x].getProdi()]}`)
            console.log(`Grade          : ${array[x].getGrade()}`)
        }
    }else{
        console.log('Bye. . . . .') // perulangan selesai
        break
    }
}while(!menu)