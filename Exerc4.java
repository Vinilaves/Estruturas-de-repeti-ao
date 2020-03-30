import javax.swing.JOptionPane;

public class Exerc4
{
   public static void main (String [] args)
   {
      int num;
      int cont = 0;
      
      do{
         num = Integer.parseInt(JOptionPane.showInputDialog(" informe o número " ));
         if ((num>=100) && (num<=200))
         {
          cont++;
         }
      }while (num !=0 );
       
       JOptionPane.showMessageDialog(null, " valores digitados " + cont);
   }
   
}
     
   
   