
package utilidades;

import com.github.lgooddatepicker.components.DatePicker;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class TextboxValidator {
    
    
    public TextboxValidator() {
        
    }
    
    
    public boolean emptyFields(JPanel panel) {
        ArrayList<Component> campos = new ArrayList<>();
        
        for(Component c : panel.getComponents()) {
            if(c instanceof JTextField) {
                campos.add((JTextField) c);
            }
            
            if(c instanceof JPasswordField) {
                campos.add((JPasswordField) c);
            }
            
            if(c instanceof DatePicker) {
                campos.add((DatePicker) c);
            }
            
            if(c instanceof JFormattedTextField) {
                campos.add((JFormattedTextField) c);
            }
        }
        
        for(Component campo : campos) {
            if(campo instanceof JTextField) {

                if( ((JTextField) campo).getText().trim().isEmpty() ) {
                    return true;
                }
  
            }
            
            if(campo instanceof JPasswordField) {

                if( ((JPasswordField) campo).getPassword().length == 0 ) {
                    return true;
                }
  
            }
            
            if(campo instanceof JFormattedTextField) {
                if( !((JFormattedTextField) campo).isEditValid() ) {
                    return true;
                }
            }
            
            if(campo instanceof DatePicker) {
                if( ((DatePicker) campo).getDateStringOrEmptyString().equals("") ) {
                    return true;
                }
            }
            
        }
        
        return false;
    }
    
    
    public boolean emptyFields(Container container) {
        ArrayList<Component> campos = new ArrayList<>();
        
        for(Component c : container.getComponents()) {
            if(c instanceof JTextField) {
                campos.add((JTextField) c);
            }
            if(c instanceof JFormattedTextField) {
                campos.add((JFormattedTextField) c);
            }
            if(c instanceof DatePicker) {
                campos.add((DatePicker) c);
            }
            if(c instanceof JPasswordField) {
                campos.add((JPasswordField) c);
            }
        }
        
        for(Component campo : campos) {
            if(campo instanceof JTextField) {
 
                if( ( (JTextField)campo).getText().isEmpty() ) {
                    return true;
                }

            }
            
            if(campo instanceof JPasswordField) {

                if( ((JPasswordField) campo).getPassword().length == 0 ) {
                    return true;
                }
  
            }
            
            if(campo instanceof JFormattedTextField) {
                if( !((JFormattedTextField) campo).isEditValid() ) {
                    return true;
                }
            }
            
            if(campo instanceof DatePicker) {
                if( ((DatePicker) campo).getDateStringOrEmptyString().isEmpty() ) {
                    return true;
                }
            }
            
        }
        
        return false;
        
    }
     
    
}
