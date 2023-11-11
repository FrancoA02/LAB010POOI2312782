package hospital;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArregloDoc {
           private List <Paciente> pacientes;
    private List <Doctor> doctor;
    private Map<Paciente, Doctor> atenciones; 
    
    public ArregloDoc () {   
        pacientes = new ArrayList<>(); // Lista Paciente
        pacientes.add(new Paciente(15482147, "Franco","Almerco","El Agustino", 80, 37.0));
        pacientes.add(new Paciente(87414526, "Jose","Alarcon", "Surco",75, 35.0));
        pacientes.add(new Paciente(15481245, "Benito","Martinez","Independencia",80,35.2));
        pacientes.add(new Paciente(98124571, "Freedie","Mercury","Los Olivos",72,35.5));
        pacientes.add(new Paciente(23849574,"Jose Maria","Palacios", "San Juan de Lurigancho",85,35.2));
        pacientes.add(new Paciente(48953647, "Roberto Gomez","Bolaños","La vecindad del Chavo", 65,34.0));
        
        doctor = new ArrayList<>(); // Lista Doctores
        doctor.add(new Doctor(12548127,"Dr.Chapatin","Cardiologia"));
        doctor.add(new Doctor(77414818,"Dr.Strange","Cirujano Plastico"));
        doctor.add(new Doctor(15481235, "Dr.Manhattan","Neurologia"));
        doctor.add(new Doctor(17748624,"Dr.Octavio","Oftalmologia"));
        doctor.add(new Doctor(85436125,"Dr.Parker","Ortopedia"));
        doctor.add(new Doctor(65154875,"Dr.Stephen","Cardiologia"));
        
        atenciones = new HashMap <>();
        atenciones.put(pacientes.get(0), doctor.get(1));
        atenciones.put(pacientes.get(1),doctor.get(0));
        atenciones.put(pacientes.get(5),doctor.get(4));
        atenciones.put(pacientes.get(3), doctor.get(2));
        atenciones.put(pacientes.get(2),doctor.get(3));
        atenciones.put(pacientes.get(4),doctor.get(5));
        
    }
    
        public void doctorPaciente() {
        for (Map.Entry<Paciente, Doctor> entry : atenciones.entrySet()) {
            Paciente paciente = entry.getKey();
            Doctor doctor = entry.getValue();
            System.out.println("Paciente: " + paciente.getNombre() + " " + paciente.getApellido()+
                               "\nDoctor: " + doctor.getNombre()+ 
                                "\n------------------------------");
            }
        }
        
        public void doctorEspecialida(){
            for (Doctor doctor: doctor){
                System.out.println("Doctor: "+doctor.getNombre()
                                  +"\nEspecialidad: "+doctor.getEspecialidad()
                                  +"\n--------------------------------------");
            }
        }
    }
