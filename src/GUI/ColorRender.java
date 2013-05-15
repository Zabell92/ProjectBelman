package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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
//    Date date = new Date();
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
                String dateValue = table.getValueAt(i, 2).toString();
                if ((dateValue).equals(expDateString))
                {
                    System.out.println("JA DET PASSER");
                    if (row <= i)
                    {
                        setBackground(Color.red);
                    }
                }
                System.out.println("COLOR RENDER VALUE: " + table.getValueAt(i, 2));
                System.out.println("EXP DATE: " + expDateString);

            }



        }
        return this;
    }
}
