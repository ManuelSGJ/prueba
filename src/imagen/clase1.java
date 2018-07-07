
package imagen;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class clase1 {

    //Constructor 
    public clase1() {
        
    }
    
    //Métodos 
    public void cargarImagen(){
        /*Para cargar una imagen, es necesario importar unas librerias
        llamadas 
        1- ImageIcon-que permite colocar iconos
        2- Icon-que ayudará en el proceso 
        Acá utilizzaremos la estructura try{} catch(Exception error){} que sirve para validar 
        */
        try{
            /*Creamos el ojeto icon que servirá para pasar la imagen que queramos importar, para 
            ello usamos a "Icon" que es la clase que permitirá convertirla en icono
            1- se crea el objeto desde la clase Ícon
            2- se pone luego del objeto la clase ImageIcon
            3- dentro de los parámetros finales, se coloca getClass().getResource(nombreImagen/Dirección de la imagem que se desea tomar (esto es el paquete()
            */
            Icon icon=new ImageIcon(getClass().getResource("imagenes/verde.jpg"));
            
            /*Se coloca la clase donde se desea importar el icono 
            Luego la varible que va a almacenar o recibir la información
            finalmente se coloca setIncon(enicar icono s...) Y luego 
            el objeto que tiene la imagen. :v */
            venana1.iconos.setIcon(icon);
        }catch(Exception error){
            JOptionPane.showMessageDialog(null,"Error"+error);
        }
        
    }
    
}
