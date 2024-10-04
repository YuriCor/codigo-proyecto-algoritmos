/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalalgoritmos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

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
                    case 1: gestionProductos();
                       break; 
                    case 2: //controlExistencias();
                        break; 
                    case 3: //pedidosCompras();
                        break; 
                    case 4: //informesEstadisticas();
                        break; 
                    case 5: // salida
                                System.out.println("CERRANDO PROGRAMA");
                                
                }
        } // cierra menu
        static void gestionProductos (){ // abre gestion
            Scanner scan= new Scanner(System.in);
            int Opcion;
            System.out.println("1. DEFINICION DE CATEGORIAS");
            System.out.println("2. DEFINICION DE CARACTERISTICAS");
            System.out.println("3. DEFINICON DE ESPECIFICACIONES");
            System.out.println("4. ASIGNACION DE CATEGORIA, CARACTERISTICAS Y ESPECIFICACIONES A PRODUCTOS");
            System.out.println("5. ALTA DE PRODUCTOS");
            System.out.println("6. BAJA DE PRODUCTOS");
            System.out.println("7. MODIFICACION DE PRODUCTOS");
            System.out.println("8. CONSIDERACIONES ADICIONALES");
            System.out.println("9. SALIR");
            System.out.println("SELECCIONE LA OPCION NECESARIA");
            Opcion= scan.nextInt();
            System.out.println(Opcion);
            switch (Opcion){
                case 1: definicionCategorias();
                break;
                case 2: definicionCaracteristicas();
                break;
                case 3: definicionEspecificaciones();
                break;
                case 4: definicionCaracEspecificacionesProductos();
                break;
                case 5: altaProductos();
            }
        } // cierre de la gestion de productos
        static void definicionCategorias(){ // abre 
            Scanner scan=new Scanner (System.in);
            
            int Opcion;
            
            System.out.println("CATEGORIA PRODUCTOS");
            System.out.println("1. VER CATEGORIAS");
            System.out.println("2. AGREGAR CATEGORIAS");
            System.out.println("3. MODIFICAR CATEGORIAS");
            System.out.println("4. ELIMINAR CATEGORIAS");
            System.out.println("5. SALIR DE CATEGORIAS PRODUCTOS");
            System.out.println("SELECCIONE LA OPCION NECESARIA");
            Opcion= scan.nextInt();

            switch (Opcion){
                
                case 1 -> mostrarCategorias();
                case 2 -> agregarCategorias();
                case 3 -> modificarCategorias();
                case 4 -> eliminarCategorias();
                case 5 -> {
            }
                default -> throw new AssertionError();
            }
        // para salir
                } // Cierra Def Categorias
        static void mostrarCategorias() throws FileNotFoundException, java.io.IOException { 
            System.out.println("CATEGORIAS EXISTENTES");
            try (BufferedReader br = new BufferedReader(new FileReader("categoria.txt"))){
                String linea;
                while ((linea = br.readLine())!= null) {
                String[] partes = linea.split (" :V ");
                    System.out.println("Nombre: " + partes[0]);
                    System.out.println("Descripcion: " + (partes.length > 1 ? partes[1]: "NO EXISTE"));
                    System.out.println();
                }
            }
        }
        static void agregarCategoria(){ // abre 
            Scanner scan= new Scanner (System.in);
            System.out.print("INGRESE LA CATEGORIA NUEVA: ");
            String nombre = scan.nextLine();
            
            if (nombre.isEmpty()categoriaExiste(nombre)){
            System.out.println("EL NOMBRE DE LA VATEGORIA NO PUEDE ESTAR VACIO O YA EXISTE. ");
            return;
        }
            System.out.print();
        }
        }
            
                
        
                    
                    
            

                         
                        
                
                
    
        
    
    

