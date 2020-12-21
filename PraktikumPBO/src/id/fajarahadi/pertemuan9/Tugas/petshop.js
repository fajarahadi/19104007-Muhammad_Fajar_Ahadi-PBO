const prompt = require('prompt-sync')()

function Hewan(nama, jenis, umur, makanan, riwayat_penyakit){
  this.nama = nama
  this.jenis = jenis
  this.umur = umur
  this.makanan = makanan
  this.riwayat_penyakit = riwayat_penyakit
  
  
  this.tampil = function(){
    console.log('Nama Hewan        : ', this.nama)
    console.log('Jenis Hewan       : ', this.jenis)
    console.log('Umur Hewan        : ', this.umur)
    console.log('Makanan           : ', this.makanan)
    console.log('Riwayat Penyakit  : ', this.riwayat_penyakit)
  } 
}
  
var array = []

var hewan = {}

var cek = false

do{
  console.log('\n<===="Selamat Datang di Petmart"====> ')
  console.log()
  console.log('Menu :')
  console.log('1. Tambah Hewan')
  console.log('2. Edit Hewan')
  console.log('3. Tampilkan Hewan')
  console.log('4. Exit')
  console.log()
  let pil = prompt('Masukkan Pilihan Menu\t: ')

  console.log()
//Menampilkan menu Pilihan 1
  if(pil == 1){
    let jmlHewan = prompt('Masukkan Jumlah Hewan\t: ')

    for (let i = 1; i <= jmlHewan; i++) {
      console.log(`\nHewan ke-${i}`);  
      hewan = new Hewan(
        prompt(`Nama Hewan        : `), 
        prompt(`Jenis Hewan       : `), 
        prompt(`Umur Hewan        : `),
        prompt(`Makanan           : `),
        prompt(`Riwayat Penyakit  : `)
      )
      array.push(hewan)
    }
    console.log()

  }else if(pil == 2){
    var noHewan = prompt('Masukkan Nomer Urut Hewan\t: ')
     
    Hewan.prototype.edit = function(){
      nama = prompt(`Nama Hewan        : `), 
      jenis = prompt(`Jenis Hewan       : `), 
      umur = prompt(`Umur Hewan        : `),
      makanan = prompt(`Makanan           : `),
      riwayat_penyakit = prompt(`Riwayat Penyakit  : `),
      tampil = this.tampil
      return {nama, jenis, umur, makanan, riwayat_penyakit, tampil}
    } 
    
    let index = noHewan-1
    array[index] = array[index].edit()
    
    console.log('\nData Berhasil Dirubah')
    console.log()
   
  }else if(pil == 3){
    index = 1

    for (let x in array){
      console.log(`\nHewan ke-${index}`);
      index++;
      array[x].tampil()
    }
  console.log()

  }else if(pil == 4){
    cek = true
    console.log('Terimakasih, Silahkan datang kembali')
  }else{
    console.log('Inputan yang anda masukkan salah!!')
    console.log()
  }
}while(!cek)