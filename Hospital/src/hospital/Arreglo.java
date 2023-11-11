package hospital;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;

public class Arreglo {
    private List <Paciente> pacientes;
    private List <Doctor> doctor;
    private Map<Paciente, Doctor> atenciones; 
    
    public Arreglo () {   
        pacientes = new ArrayList<>(); // Lista Paciente
        pacientes.add(new Paciente(15482147, "Franco","Almerco","El Agustino", 80, 37.0));
        pacientes.add(new Paciente(87414526, "Jose","Alarcon", "Surco",75, 35.0));
        pacientes.add(new Paciente(15481245, "Benito","Martinez","Independencia",80,35.2));
        pacientes.add(new Paciente(98124571, "Freedie","Mercury","Los Olivos",72,35.5));
        pacientes.add(new Paciente(23849574,"Jose Maria","Palacios", "San Juan de Lurigancho",85,35.2));
        pacientes.add(new Paciente(48953647, "Roberto Gomez","Bolaños","La vecindad del Chavo", 65,34.0));
        
    }
    public void elegirPaciente (int posicion){
        
          if (posicion >= 0 && posicion < pacientes.size()) {
            Paciente paciente = pacientes.get(posicion);
            System.out.println("Datos del paciente en la posición " + posicion + ":");
            System.out.println(paciente);
        } else {
            System.out.println("Posición inválida. No se puede imprimir el paciente.");
        }
    }

    public void imprimirPaciente() {
        System.out.println("LISTA DE PACIENTES");
        for (Paciente pacientes : pacientes){
            System.out.println(pacientes);
        }
    }
    public void eliminarPaciente(int posicion){
        if (posicion >= 0 && posicion < pacientes.size()){
            pacientes.remove(posicion);
            System.out.println("PACIENTE ELIMINADO - NUEVA LISTA  ");
        } else {
            System.out.println("No se pudo eliminar");
        }         
    }
    
    public void modificarPaciente(int posicion, Paciente nuevoPaciente){
        if(posicion >= 0 && posicion < pacientes.size()){
            pacientes.set(posicion, nuevoPaciente);
            System.out.println("PACIENTE MODIFICADO");
        } else {
            System.out.println("No se pudo modificar");
        }
    }
    
    public void pesoRepetido() {
        List<Double> pesos = new ArrayList<>();
        Map<Double, Integer> frecuenciaPesos = new HashMap<>();

        // Obtener la lista de pesos
        for (Paciente paciente : pacientes) {
            pesos.add(paciente.getPeso());
        }
        for (double peso : pesos) {
            frecuenciaPesos.put(peso, frecuenciaPesos.getOrDefault(peso, 0) + 1);
        }

        double pesoMasRepetido = 0.0;
        int frecuenciaMaxima = 0;
        for (Map.Entry<Double, Integer> entry : frecuenciaPesos.entrySet()) {
            if (entry.getValue() > frecuenciaMaxima) {
                frecuenciaMaxima = entry.getValue();
                pesoMasRepetido = entry.getKey();
            }
        }
        System.out.println("EL PESO QUE MAS SE REPITE ES: " + pesoMasRepetido);
    }
    
    public void listaPeso(){
        List<Double> pesos = new ArrayList<>();
        Map<Double, Integer> frecuenciaPesos = new HashMap<>();

        // Obtener la lista de pesos
        for (Paciente paciente : pacientes) {
            pesos.add(paciente.getPeso());
        }
        for (double peso : pesos) {
            frecuenciaPesos.put(peso, frecuenciaPesos.getOrDefault(peso, 0) + 1);
        }

        double pesoMasRepetido = 0.0;
        int frecuenciaMaxima = 0;
        for (Map.Entry<Double, Integer> entry : frecuenciaPesos.entrySet()) {
            if (entry.getValue() > frecuenciaMaxima) {
                frecuenciaMaxima = entry.getValue();
                pesoMasRepetido = entry.getKey();
            }
        }
        
        int cantPesoMasRepetido = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getPeso() == pesoMasRepetido) {
                cantPesoMasRepetido++;
            }
        }

        System.out.println("EL PESO QUE MAS SE REPITE ES: " + pesoMasRepetido + "\nLA CANTIDAD DE PACIENTES QUE TIENEN EL MISMO PESO ES: " + cantPesoMasRepetido); 
               
        }
 
        public void pesoMayor(){
                double pesoMayor = pacientes.get(0).getPeso();
        double pesoMenor = pacientes.get(0).getPeso();

        // Encontrar el peso mayor y menor
        for (Paciente paciente : pacientes) {
            double peso = paciente.getPeso();
            if (peso > pesoMayor) {
                pesoMayor = peso;
            }
            if (peso < pesoMenor) {
                pesoMenor = peso;
            }
        }
        System.out.println("**** PESO MAYOR Y PESO MENOR ***");
        System.out.println("Peso Mayor: " + pesoMayor);
        System.out.println("Peso Menor: " + pesoMenor);
        }
        public void divRangPeso(){
         double pesoMin = Double.MAX_VALUE;
         double pesoMax = Double.MIN_VALUE;
         
            for (Paciente paciente : pacientes) {
            double peso = paciente.getPeso();
            if (peso < pesoMin) {
                pesoMin = peso;
            }
            if (peso > pesoMax) {
                pesoMax = peso;
            }
        }

        double rango = (pesoMax - pesoMin) / 4;

        int rango1 = 0;
        int rango2 = 0;
        int rango3 = 0;
        int rango4 = 0;

        for (Paciente paciente : pacientes) {
            double peso = paciente.getPeso();
            if (peso >= pesoMin && peso < pesoMin + rango) {
                rango1++;
            } else if (peso >= pesoMin + rango && peso < pesoMin + 2 * rango) {
                rango2++;
            } else if (peso >= pesoMin + 2 * rango && peso < pesoMin + 3 * rango) {
                rango3++;
            } else if (peso >= pesoMin + 3 * rango && peso <= pesoMax) {
                rango4++;
            }
        }
        System.out.println("Rango 1 (" + pesoMin + " - " + (pesoMin + rango) + "): " + rango1 + " personas");
        System.out.println("Rango 2 (" + (pesoMin + rango) + " - " + (pesoMin + 2 * rango) + "): " + rango2 + " personas");
        System.out.println("Rango 3 (" + (pesoMin + 2 * rango) + " - " + (pesoMin + 3 * rango) + "): " + rango3 + " personas");
        System.out.println("Rango 4 (" + (pesoMin + 3 * rango) + " - " + pesoMax + "): " + rango4 + " personas");
        
 } 
     
        public void listaApellido(){
        Collections.sort(pacientes, Comparator.comparing(Paciente::getApellido));

        // Mostrar la lista ordenada
        System.out.println("LISTA DE PACIENTES ORDENADOS POR APELLIDO:");
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
        }

        
        
}