// Programador: Jose Guadalupe Alcaraz Jimenez
// Estructura utilizada: ArrayList

package publicacion;
import java.util.*;

public class Principal
{
   public static void main(String[] args) 
   {
      int opcion, opc, datoInt;
      double datoDouble;
      String datoString;
      Scanner leer = new Scanner(System.in);
      ArrayList<Object> publicaciones = new ArrayList<Object>();
         
      do{   
         System.out.println("\n------ PROYECTO PUBLICACIONES ------");
         System.out.println("1) Dar de alta una publicacion");
         System.out.println("2) Mostrar publicaciones");
         System.out.println("3) Salir");
         System.out.print("Ingrese una opcion [1-3]: ");
         opcion = leer.nextInt();
           
         switch(opcion){
           
            case 1:
               do{
                  System.out.println("\n------ DAR DE ALTA ------");
                  System.out.println("1) Revista");
                  System.out.println("2) Periodico");
                  System.out.println("3) Libro");
                  System.out.println("4) Regresar al menu");
                  System.out.print("Ingrese una opcion [1-4]: ");
                  opc = leer.nextInt();
                  System.out.println();
                  leer.nextLine();
                  
                  switch(opc){                     
                     
                     case 1:
                        System.out.println("------ REVISTA ------");
                        Revista revista = new Revista();
                        
                        System.out.print("ISSN: ");
                        datoString = leer.nextLine();
                        revista.setISSN(datoString);
                        
                        System.out.print("Titulo: ");
                        datoString = leer.nextLine();
                        revista.setTitulo(datoString);
                                                
                        System.out.print("Numero: ");
                        datoInt = leer.nextInt();
                        revista.setNumero(datoInt);
                        
                        System.out.print("Anio: ");
                        datoInt = leer.nextInt();
                        revista.setAnio(datoInt);
                        
                        System.out.print("Precio: ");
                        datoDouble = leer.nextDouble();
                        revista.setPrecio(datoDouble);
                        
                        System.out.print("Num. de paginas: ");
                        datoInt = leer.nextInt();
                        revista.setNumpag(datoInt);
                        publicaciones.add(revista);
                        break;
                     
                     case 2:
                        System.out.println("------ PERIODICO ------");
                        Periodico periodico = new Periodico();
                        
                        System.out.print("Editor: ");
                        datoString = leer.nextLine();
                        periodico.setEditor(datoString);
                        
                        System.out.print("Titulo: ");
                        datoString = leer.nextLine();
                        periodico.setTitulo(datoString);
                        
                        System.out.print("Secciones: ");
                        datoString = leer.nextLine();
                        periodico.setSecciones(datoString);
                        
                        System.out.print("Precio: ");
                        datoDouble = leer.nextDouble();
                        periodico.setPrecio(datoDouble);
                        
                        System.out.print("Num. de paginas: ");
                        datoInt = leer.nextInt();
                        periodico.setNumpag(datoInt);
                        publicaciones.add(periodico);
                        break;
                     
                     case 3:
                        System.out.println("------ LIBRO ------");
                        Libro libro = new Libro();
                        
                        System.out.print("ISBN: ");
                        datoString = leer.nextLine();
                        libro.setISBN(datoString);
                        
                        System.out.print("Titulo: ");
                        datoString = leer.nextLine();
                        libro.setTitulo(datoString);
                        
                        System.out.print("Autor: ");
                        datoString = leer.nextLine();
                        libro.setAutor(datoString);
                        
                        System.out.print("Edicion: ");
                        datoString = leer.nextLine();
                        libro.setEdicion(datoString);
                        
                        System.out.print("Precio: ");
                        datoDouble = leer.nextDouble();
                        libro.setPrecio(datoDouble);
                        
                        System.out.print("Num. de paginas: ");
                        datoInt = leer.nextInt();
                        libro.setNumpag(datoInt);
                        publicaciones.add(libro);
                        break;
                     
                     case 4:
                        break;
                     
                     default:
                        System.out.println("\nIngrese una opcion valida");
                  }
               }while(opc != 4);
               break;
            
            case 2:
               Iterator<Object> itrPublic = publicaciones.iterator();
      
               while(itrPublic.hasNext())
               {
                  Object publicacion = itrPublic.next();
                  System.out.println("\n  " + publicacion.getClass());
                  
                  if(publicacion instanceof Revista)
                  {
                     Revista rev = (Revista) publicacion;
                     System.out.println("------ REVISTA ------");
                     System.out.println("ISSN: " + rev.getISSN());
                     System.out.println("Titulo: " + rev.getTitulo());
                     System.out.println("Numero: " + rev.getNumero());
                     System.out.println("Anio: " + rev.getAnio());
                     System.out.println("Precio: $" + rev.getPrecio());
                     System.out.println("Num. de paginas: " + rev.getNumpag());
                     System.out.println("Periodicidad: " + rev.getPeriodicidad());
                  }
                  else
                     if(publicacion instanceof Periodico)
                     {
                        Periodico per = (Periodico) publicacion;
                        System.out.println("------ PERIODICO ------");
                        System.out.println("Editor: " + per.getEditor());
                        System.out.println("Titulo: " + per.getTitulo());
                        System.out.println("Secciones: " + per.getSecciones());
                        System.out.println("Precio: $" + per.getPrecio());
                        System.out.println("Num. de paginas: " + per.getNumpag());
                        System.out.println("Periodicidad: " + per.getPeriodicidad());
                     }
                     else
                     {
                        Libro lib = (Libro) publicacion;
                        System.out.println("------ LIBRO ------");
                        System.out.println("ISBN: " + lib.getISBN());
                        System.out.println("Titulo: " + lib.getTitulo());
                        System.out.println("Autor: " + lib.getAutor());
                        System.out.println("Edicion: " + lib.getEdicion());
                        System.out.println("Precio: $" + lib.getPrecio());
                        System.out.println("Num. de paginas: " + lib.getNumpag());
                     }
               }
               break;
            
            case 3:
               System.exit(0);
               break;
            
            default:
               System.out.println("\nIngrese una opcion valida");
         }
      }while(opcion != 3);
      
   } // Main
}