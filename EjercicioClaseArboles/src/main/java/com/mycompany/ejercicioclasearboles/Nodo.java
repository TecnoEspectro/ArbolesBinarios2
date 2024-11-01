/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioclasearboles;

class Nodo {
    int edad;
    String nombre;
    String sexo;
    Nodo izquierda, derecha;

    Nodo(int edad, String nombre, String sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.izquierda = this.derecha = null;
    }
}