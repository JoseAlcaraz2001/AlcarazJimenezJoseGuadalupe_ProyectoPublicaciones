package publicacion;

public class Periodico extends Publicacion implements Periodicidad
{
   private String secciones;
   private String editor;
    
   public String getSecciones(){
      return secciones;
   }
    
   public void setSecciones(String secc){
      secciones = secc;
   }
    
   public String getEditor(){
      return editor;
   }
    
   public void setEditor(String edit){
      editor = edit;
   }

   @Override
   public String getPeriodicidad(){//implementaci�n del m�todo
      return periodicidad;
   }
}