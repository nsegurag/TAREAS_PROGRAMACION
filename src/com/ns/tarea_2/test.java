package com.ns.tarea_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class test {

    // Método para generar instancias de Persona y llenar la lista
    public static List<persona> generarPersonas() {
        List<persona> lista = new ArrayList<>();
        lista.add(new persona(1, "Luis", "Alberto", "García", "Méndez", "M", "2474145812215", 25, "Guatemala"));
        lista.add(new persona(2, "Ana", "Sofía", "Martínez", "Pérez", "F", "2474145812216", 17, "Guatemala"));
        lista.add(new persona(3, "Luis", "Fernando", "García", "Morales", "M", "2474145812217", 30, "Mixco"));
        return lista;
    }

    // Método que retorna la lista de personas
    public static List<persona> obtenerPersonas() {
        return generarPersonas();
    }

    public static void main(String[] args) {
        List<persona> personas = obtenerPersonas();

        // Recorrer la lista usando Stream e imprimir el nombre completo
        System.out.println("Nombres completos:");
        personas.stream()
                .forEach(persona -> System.out.println(persona.toString()));

        // Buscar personas mayores de edad usando Stream y predicados
        System.out.println("\nPersonas mayores de edad:");
        personas.stream()
                .filter(persona -> persona.getEdad() >= 18)
                .forEach(persona -> System.out.println(persona.toString()));

        // Utilizar Optional para encontrar la primera persona que cumpla con los criterios
        Optional<persona> personaEncontrada = personas.stream()
                .filter(persona -> persona.getEdad() >= 18)
                .filter(persona -> persona.getCiudad().equals("Guatemala"))
                .filter(persona -> persona.getPrimerNombre().contains("Lu"))
                .findFirst();

        // Imprimir la persona encontrada
        System.out.println("\nPrimera persona que cumple con los criterios:");
        personaEncontrada.ifPresent(persona -> System.out.println(persona.toString()));
    }
}
