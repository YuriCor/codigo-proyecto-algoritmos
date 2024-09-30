/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalalgoritmos;

/**
 *
 * @author DELL
 */
public class ProyectoFinalAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menu General
        private static void MenuGeneral(){ _// abre el menu
                Scanner scan = new Scanner (System.in);
                System.out.println("BIENVENIDO AL SISTEMA DE GESTION DE INVENTARIO :V ");
                
                // Opciones
                int Opcion=0;
                System.out.println("FUNCIONALIDADES");
                System.out.println("1. GESTION DE PRODUCTOS");
                System.out.println("2. CONTROL DE EXISTENCIAS");
                System.out.println("3. PEDIDOS DE COMPRA");
                System.out.println("4. INFORMES Y ESTADISTICAS");
                System.out.println("5. SALIR");
                System.out.println("6. INGRESE EL NUMERO DE OPCION REQUERIDO");
                Opcion=scan.nextInt();
                System.out.println(Opcion);
                
                switch (Opcion){
                    case 1:
                        gestionProductos();
                        break;
                        
                    case 2:
                        controlExistencias();
                        break;
                        
                    case 3:
                        pedidosCompras();
                        break;
                        
                    case 4:
                        informesEstadisticas();
                        break;
                        
                }
                }
    
        
    }
    
}
