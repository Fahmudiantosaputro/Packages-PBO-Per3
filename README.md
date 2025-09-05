# 📘 Penjelasan Program Java

---

## 🧩 CLASS ABSTRACT
Class abstract adalah class yang tidak bisa langsung dibuat objek.  
Class ini hanya jadi kerangka dasar untuk diturunkan ke class lain.  
Dalam program, ada **3 class abstract** yang berfungsi sebagai dasar dan harus di-extends oleh class turunannya.

---

## 💁🏻‍♀️ INTERFACE
Interface adalah aturan yang hanya berisi daftar method tanpa isi.  
Class yang menggunakan interface wajib mengisi semua method tersebut.  
Dalam program, ada **3 interface** yang dipakai untuk menyamakan aturan antar class yang berbeda.

---

## 🔄 OVERLOADING
Overloading adalah membuat **beberapa method dengan nama yang sama** tapi parameternya berbeda.  
Hal ini berguna untuk memberi fleksibilitas pemanggilan method.  
Di program, overloading dipakai pada salah satu class agar method bisa dipanggil dengan cara berbeda.

---

## 🔁 OVERRIDING
Overriding adalah membuat **ulang method yang sudah ada di parent class** supaya punya isi yang berbeda di subclass.  
Ini digunakan agar subclass bisa menyesuaikan perilakunya sendiri.  
Di program, overriding dipakai pada 2 class untuk mengganti isi method dari class induknya.

---

## 🔑 Perbedaan Singkat
- **Abstract** → kerangka, tidak bisa langsung dipakai, hanya untuk diwarisi.  
- **Interface** → aturan, semua class yang pakai harus mengisi methodnya.  
- **Overloading** → method sama tapi parameternya berbeda.  
- **Overriding** → method sama tapi isinya diganti di class turunan.  
