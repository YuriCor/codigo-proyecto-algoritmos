/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalalgoritmos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                
                case 1:
                    mostrarCategorias();
                    break;
                case 2:
                    agregarCategorias();
                    break;
                case 3:
                    modificarCategorias();
                    break;
                case 4:
                    eliminarCategorias();
                    break;
                case 5:{
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
            
            if (nombre.isEmpty() || categoriaExiste(nombre)){
            System.out.println("EL NOMBRE DE LA CATEGORIA NO PUEDE ESTAR VACIO O YA EXISTE. ");
            return;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(("categorias.txt"),true)){
                bw.write(nombre + "|" + descripcion);
                bw.newLine();
                System.out.println("CATEGORIA AGREGADA EXITOSAMENTE. ");
            } catch (IOException e) {
                    System.out.println("ERROR AL ESCRIBIR EN EL ARCHIVO. ");
                    }
            } // cierra agregar
static boolean categoriaExiste(String nombre){ // abre
                try(BufferedReader br= new BufferedReader(new FileReader(("categorias.txt")))) {
                String linea;
                while ((linea = br.readLine()) != null){
                String[] partes = linea.split(":V");
                if(partes[0].equals(nombre)){
                    return true;
                }
                
                }
                
                } catch (IOException e){
                System.out.println("ERROR AL LEER EL ARCHIVO. ");
                
                } return false;
            }// cierra
private static void modificarCategoria (){// abre
    try {
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        
                        File fc = new File("archivo_texto_copia.txt");
                        FileWriter fw = new FileWriter(fc);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        String linea = "";
                        
                        while((linea = br.readLine()) != null) {
                            String [] datos = linea.split("\\|");
                            if (datos[0].compareTo("") == 0) {
                                linea = "";
                            }
                            
                            bw.write(linea+"\n");
                        } 
                        
                        bw.close();
                        br.close();
                        
                        Files.move(fc.toPath(), categoriaExiste.toPath(), REPLACE_EXISTING);
                     } catch (FileNotFoundException ex) {
                        Logger.getLogger(ProyectoFinalAlgoritmos.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                    Logger.getLogger(ProyectoFinalAlgoritmos.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
            
        }
private static void eliminarCategoria(){
mostrarCategorias();
Scanner scan = new Scanner (System.in);

System.out.print("INGRESA EL NOMBRE DE LA CATEGORIA A ELIMINAR ");
String nombre= scan.nextLine();
if (categoriaExiste(nombre)) {
System.out.print("LA CATEGORIA NO EXISTE ");
return;
}
}
            
        }
        }
            
                

        
    
    

