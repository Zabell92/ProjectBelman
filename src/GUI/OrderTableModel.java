/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.ProductionOrder;
import BLL.ProductionOrderManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MikeZJ
 */
public class OrderTableModel extends AbstractTableModel
{

    private ProductionOrderManager pom;
    private final String[] header =
    {
        "Id", "POrder", "Duedate", "Quantity", "Width", "SleeveID"
    };
    private final Class[] columnTypes =
    {
        Integer.class, String.class, Date.class, Integer.class, Double.class, Integer.class
    };
    private ArrayList<ProductionOrder> Porder;

    public OrderTableModel()
    {
        try
        {
            pom = new ProductionOrderManager();
        }
        catch (Exception ex)
        {
            System.out.println("lol");
        }
    }

    OrderTableModel(ArrayList<ProductionOrder> showAll)
    {
        fireTableDataChanged();
        Porder = showAll;
    }

    @Override
    public int getRowCount()
    {
        return Porder.size();
    }

    @Override
    public int getColumnCount()
    {
        return header.length;
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        {
            ProductionOrder po = Porder.get(row);
            switch (col)
            {
                case 0:
                    return po.getID();
                case 1:
                    return po.getPOrder();
                case 2:
                    return po.getDueDate();
                case 3:
                    return po.getQuantity();
                case 4:
                    return po.getWidth();
                case 5:
                    return po.getSleeveID();

            }
            return null;
        }
    }

    @Override
    public String getColumnName(int col)
    {
        return header[col];
    }

    @Override
    public Class<?> getColumnClass(int col)
    {
        return columnTypes[col];
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return (false);
    }

    public void setCollection(Collection<ProductionOrder> list)
    {
        Porder = new ArrayList<>(list);
        fireTableDataChanged();
    }
    
    
            
    
      
}