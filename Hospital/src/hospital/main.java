package hospital;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo arreglo = new Arreglo();
        ArregloDoc arregloDoc = new ArregloDoc();
        int c ;
        Scanner sc = new Scanner (System.in);
       
        
        System.out.println("****** BIENVENIDOS AL HOSPITAL SANA SANA COLITA DE RANA******");
        System.out.println("           ****** ELIGA UNA OPCION *******\n");
        
        try {
            
            
                
                System.out.println(
                "Operacion 1 : Registrar los datos de los pacientes uno a uno (agregar al final).\n" +
                "Operacion 2 : Eliminar los datos de un paciente dado su posición una lista.\n" +
                "Operación 3 : Modificar los datos de un paciente de la lista.\n" +
                "Operación 4 : Mostrar el peso que más se repite en la lista.\n" +
                "Operación 5 : Mostrar la cantidad de pacientes que tienen el peso que más se repite;\n" +
                "Operación 6 : Mostrar el peso mayor y menor.\n" +
                "Operación 7 : Dividir el rango de pesos por 4, por ejemplo, si el peso máximo es 120 kg y 40kg es el peso mínimo, entonces tenderemos 4 rangos de 40 a 60, 60 a 80, de 80 a 100 y de 100 hasta 120. Muestre la cantidad de personas que corresponde a cada rango de pesos.\n" +
                "Operación 8 : Mostrar la lista de pacientes ordenados por apellidos\n" +
                "Operación 9 : Dado un paciente indicar qué doctor lo atendió\n" + 
                "Operación 10 : Buscar a los doctores por especialidad.\n" +       
                       " ¿QUÉ ACCIONES DESEA EJECUTAR?\n");
                
                c = sc.nextInt();
                while (c<0 || c >11 ) {
                    System.out.println("Ingresa nuevamente un valor valido: ");
                    c=sc.nextInt();
                }
                switch (c) {
                    case 1:
                        System.out.println("REGISTRO DE PACIENTES");
                        arreglo.imprimirPaciente();
                       
                        break;
                    case 2:
                        System.out.println("USTED ESCOGIO LA OPERACION ELIMINAR PACIENTE");
                        System.out.println("--------------------------------------------");
                        
                        
                        arreglo.imprimirPaciente();
                        arreglo.eliminarPaciente(1);
                        arreglo.imprimirPaciente();
                        break;
                    case 3: 
                        System.out.println("USTED ESCOGIO LA OPERACION MODIFICAR PACIENTE");
                        System.out.println("--------------------------------------------");
                       
                        arreglo.imprimirPaciente();
                        
                        Paciente pacienteModificado = new Paciente(15482147, "Bad Bunny","Martinez", "Almirante Sur", 80.0, 38.0);
                        arreglo.modificarPaciente(2, pacienteModificado);
                        arreglo.elegirPaciente(2);
                        
                        break;
                    case 4:       
                          System.out.println("USTED ESCOGIO LA OPERACION MOSTRAR PESO QUE MAS SE REPITE");
                          System.out.println("---------------------------------------------------------");
                          arreglo.pesoRepetido();
                        break;
                    case 5:
                          System.out.println("USTED ESCOGIO LA OPERACION QUE MUESTRA LA CANTIDAD DE PACIENTES QUE TIENEN EL MISMO PESO");
                          System.out.println("----------------------------------------------------------------------------------------");
                          
                          arreglo.listaPeso();
                        break;
                    case 6:
                        System.out.println("USTED ESCOGIO LA OPERACION MOSTRAR PESO DE MAYOR A MENOR");
                          System.out.println("------------------------------------------------------");                         
                          arreglo.pesoMayor();
                        break;
                    case 7:
                          System.out.println("USTED ESCOGIO LA OPERACION DIVIDIR EL RANGO DE PESO POR 4");
                          System.out.println("------------------------------------------------------");   
                          arreglo.divRangPeso();
                        break;
                    case 8:
                        System.out.println("USTED ESCOGIO LA OPERACION ORDENAR A LOS PACIENTES POR APELLIDO");
                        System.out.println("---------------------------------------------");
                        arreglo.listaApellido();
                        break;
                    case 9:
                        System.out.println("USTED ESCOGIO LA OPERACION MOSTRAR AL PACIENTE Y EL DOCTOR QUE LO ATENDIO");
                        System.out.println("---------------------------------------------");
                        arregloDoc.doctorPaciente();
                        break;
                    default:
                        System.out.println("USTED ESCOGIO LA OPERACION BUSCAR DOCTOR POR ESPECIALIDAD");
                        System.out.println("---------------------------------------------");
                        arregloDoc.doctorEspecialida();
                        break;
                } 
                    
            } catch (Exception e) {
            System.out.println("ERROR! ");
        }
        sc.close();
    }
}
                
