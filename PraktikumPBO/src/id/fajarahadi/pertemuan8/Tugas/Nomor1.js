const prompt = require('prompt-sync')();

let listMahasiswa = [];


function Mahasiswa(nama, tgl_lahir, nim, prodi) {
    this.nama = nama;
    this.tgl_lahir = tgl_lahir;
    this.nim = nim;
    this.prodi = prodi;


    this.nilai = -1;

    Object.defineProperty(this, "grade", {
        get() {
            if(80 <= this.nilai && this.nilai <= 100)
                return 'A';

            else if(60 <= this.nilai && this.nilai < 80)
                return 'B';

            else if(40 <= this.nilai && this.nilai < 60)
                return 'C';

            else if(0 <= this.nilai && this.nilai < 40)
                return 'D';

            else
                return null
        }
    });


    Object.defineProperty(this, "umur", {
        get() {
            return 2020 - (this.tgl_lahir.slice(this.tgl_lahir.length - 4))
        }
    });


    this.printData = function() {
        console.log(` Nama          : ${this.nama}`);
        console.log(` Tanggal lahir : ${this.tgl_lahir}`);
        console.log(` Umur          : ${this.umur}`);
        console.log(` NIM           : ${this.nim}`);
        console.log(` Prodi         : ${this.prodi}`);
        console.log(` Grade         : ${this.grade}`)
    }
}


const Menu = {

    isExit: false,
    start() {

        do {
            console.log();
            console.log("<===== Menu Penilaian =====>");
            console.log("1. Tambah Mahasiswa");
            console.log("2. Penilaian");
            console.log("3. Lihat Seluruh Mahasiswa");
            console.log("4. Keluar");
            console.log();

            let pilihan = prompt("> ");

            switch(pilihan) {
                case '1':
                    Menu.add.mahasiswa();
                    break;

                case '2':
                    Menu.add.nilai();
                    break;

                case '3':
                    Menu.show.mahasiswa();
                    break;

                case '4':
                    Menu.exit();
                    break;
            }
        }while(!Menu.isExit);
    },


    add: {

        mahasiswa() {
            console.log();
            console.log("<==== Tambah Mahasiswa ====>");
            const nama = prompt("Input nama         : ");
            const tgl_lahir = prompt("Input tanggal lahir: ");
            const nim = prompt("Input NIM          : ");

            Menu.process.inputDataMahasiswa(nama, tgl_lahir, nim)
        },


        nilai() {
            console.log("\n<==== Penilaian ====>");
            const nim = prompt("Input NIM: ");
            const nilai = Number(prompt("Set nilai: "));

            Menu.process.inputNilai(nim, nilai)
        }
    },


    show: {

        mahasiswa() {
            let counter = 1;
            for(let mahasiswa of listMahasiswa) {
                console.log();
                console.log(`Mahasiswa ke-${counter}`);
                mahasiswa.printData();
                console.log();
                counter++;
            }
        }
    },


    process: {

        
        pilihProdi() {

            do {
                console.log("<= Pilih Prodi:");
                console.log("1. S1 SE");
                console.log("2. S1 IF");
                console.log("3. S1 SI");
                console.log();

                let p = Number(prompt("> "));

                if(p === 1)
                    return "S1 SE";

                else if(p === 2)
                    return "S1 IF";

                else if(p === 3)
                    return "S1 SI";

            
                else
                    console.log("\nProdi tidak ditemukan\n")

            }while(true);
        },


        inputDataMahasiswa(nama, tgl_lahir, nim) {
            console.log();
            const prodi = Menu.process.pilihProdi();

            console.log();
            listMahasiswa.push(new Mahasiswa(nama, tgl_lahir, nim, prodi))
        },


        inputNilai(nim, nilai) {

            let isNotFound = true;

            for(let mahasiswa of listMahasiswa) {

                if(mahasiswa.nim === nim) {

                    mahasiswa.nilai = nilai;

                    isNotFound = false;
                }
            }
            if(isNotFound)
                console.log(`\nMahasiswa dengan NIM '${nim}' tidak terdaftar\n`)}
    },


    exit() {
        console.log("ByeBye!!!");
        Menu.isExit = true
    }
};


Menu.start();