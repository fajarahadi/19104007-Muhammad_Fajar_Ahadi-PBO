function Buku(judul, pengarang, penerbit, thTerbit) {
    this.judul = judul;
    this.pengarang = pengarang;
    this.penerbit = penerbit;
    this.thTerbit = thTerbit;
    
    this.tampil = function() {
        console.log('Judul buku : ', this.judul)
        console.log('Nama Pengarang : ', this.pengarang)
        console.log('Penerbit : ', this.penerbit)
        console.log('Tahun Terbit : ', this.thTerbit)
    }
}
//deklarasi prompt
const prompt = require('prompt-sync')()

let jmlBuku = prompt('Jumlah buku yang akan di input : ')

//deklarasi array buku
var arrayBuku = []

//deklarasi objek
var buku = {}

//perulangan untuk membuat objek
for (let i = 1; i <= jmlBuku; i++) {
    console.log('\n')
    //membuat objek dengan constructor
    buku = new Buku(
        prompt(`Masukkan judul buku ke-${i} : `),
        prompt(`Masukkan nama pengarang : `),
        prompt(`Masukkan nama penerbit : `),
        prompt(`Masukkan tahun terbit : `)
    )   

    arrayBuku.push(buku)
}

console.log('\n')
var editData = prompt('Ingin mengubah data? [ya/tidak] : ')

if (editData == 'ya') {
    var noBuku = prompt('Masukkan urutan buku yang ingin diubah : ')

    var namaData = prompt('Masukkan data yang ingin diubah [Judul/Pengarang/Penerbit/Tahun terbit] : ')

    let index = noBuku-1
    if (namaData =='Judul') {
        arrayBuku[index].judul = prompt('Masukkan judul buku baru : ')
    } else if (namaData =='Pengarang') {
        arrayBuku[index].pengarang = prompt('Masukkan nama pengarang baru : ')
    } else if (namaData =='Penerbit') {
        arrayBuku[index].penerbit = prompt('Masukkan nama penerbit baru : ')
    } else if (namaData =='Tahun Terbit') {
        arrayBuku[index].thTerbit = prompt('Masukkan tahun terbit baru : ')
    }else {
        console.log('Pilihan tidak sesuai')
    }

    console.log('\nData buku yang berhasil disimpan')

    index = 1;

    for (let i in arrayBuku) {
        console.log(`\nBuku ke-${index}`)
        index++
        arrayBuku[i].tampil()
    }
} else if (editData == 'tidak') {
    console.log('\nData buku yang berhasil disimpan')

    index = 1;

    for (let i in arrayBuku) {
        console.log(`\nBuku ke-${index}`)
        index++
        arrayBuku[i].tampil()
    }
 } else {
     console.log('Pilihan tidak sesuai')
 }


