/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioclasearboles;

class ArbolBinario {
    Nodo raiz;

    public void insertar(int edad, String nombre, String sexo) {
        raiz = insertarRecursivo(raiz, edad, nombre, sexo);
    }

    private Nodo insertarRecursivo(Nodo raiz, int edad, String nombre, String sexo) {
        if (raiz == null) {
            return new Nodo(edad, nombre, sexo);
        }
        if (edad >= 18) {
            raiz.izquierda = insertarRecursivo(raiz.izquierda, edad, nombre, sexo);
        } else {
            raiz.derecha = insertarRecursivo(raiz.derecha, edad, nombre, sexo);
        }
        return raiz;
    }

    public String mostrarArbol() {
        String resultado = mostrarRecursivo(raiz);
        if (resultado.isEmpty()) {
            return "El árbol está vacío.";
        }
        return resultado;
    }

    private String mostrarRecursivo(Nodo nodo) {
        if (nodo == null) {
            return "";
        }

        // Almacenar en StringBuilder para eficiencia
        StringBuilder sb = new StringBuilder();

        // Mostrar mayores de edad a la izquierda
        if (nodo.edad >= 18) {
            sb.append(String.format("%-25s %-10s %-10s%n", 
                "Nombre: " + nodo.nombre, "Edad: " + nodo.edad, "Sexo: " + nodo.sexo));
        }
        // Mostrar menores de edad a la derecha
        if (nodo.edad < 18) {
            sb.append(String.format("%30s %20s %20s%n", 
                "Nombre: " + nodo.nombre, "Edad: " + nodo.edad, "Sexo: " + nodo.sexo));
        }

        // Recursión para los nodos izquierdo y derecho
        sb.append(mostrarRecursivo(nodo.izquierda));
        sb.append(mostrarRecursivo(nodo.derecha));

        return sb.toString();
    }
}