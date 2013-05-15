package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

class ColorRender extends JLabel implements TableCellRenderer
{

    private String rowName;

    public ColorRender(String row)
    {
        this.rowName = row;
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
//        Object columnValue = table.getValueAt(row, table.getColumnModel().getColumnIndex(rowName));

        if (value != null)
        {
            setText(value.toString());
        }
        if (isSelected)
        {
            setBackground(table.getSelectionBackground());
            setForeground(table.getSelectionForeground());
        } else
        {
            setBackground(table.getBackground());
            setForeground(table.getForeground());
//             if(row )setBackground(Color.red);
             
      



        }
        return this;
    }
}
