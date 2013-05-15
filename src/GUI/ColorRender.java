package GUI;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.*;

class ColorRender extends JLabel implements TableCellRenderer
{

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Calendar cal = Calendar.getInstance();
    String expDateString = sdf.format(cal.getTime()).toString();
    
    private String rowName;

    public ColorRender(String row)
    {
        this.rowName = row;
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Object columnValue = table.getValueAt(row, table.getColumnModel().getColumnIndex(rowName));

            Date date = new Date();
            Date date1 = new Date();
           
        
    
        if (value != null)
        {
            setText(value.toString());
        }
        if (isSelected)
        {
            setBackground(table.getSelectionBackground());
            setForeground(table.getSelectionForeground());
        }
        else
        {
            setBackground(table.getBackground());
            setForeground(table.getForeground());
            for (int i = 0; i < table.getRowCount(); i++)
            {
                String dueDate = table.getValueAt(i, 2).toString();
                 try
            {
                date = sdf.parse(dueDate);
                date1 = sdf.parse(expDateString);
                //         System.out.println(date); // Sat Jan 02 00:00:00 BOT 2010
            } catch (ParseException ex)
            {
                Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            long res = ((date.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
                if (res>=4)
                {
                }
                else{
                    
                    if (row <= i)
                    {
                        setBackground(Color.red);
                    }
                    
                }
                

            }



        }
        return this;
    }
}
