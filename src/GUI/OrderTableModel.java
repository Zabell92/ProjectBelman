/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.ProductionOrder;
import BLL.ProductionOrderManager;
import java.util.ArrayList;
import java.util.Collection;
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
        "Id", "Name", "Address", "Phone Nr", "E-mail", "Contigent is paid?"
    };
    private final Class[] columnTypes =
    {
        Integer.class, String.class, String.class, Integer.class, String.class, Boolean.class
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
                    return po.getEmployeeID();
                case 2:
                    return po.getPOrder();
                case 3:
                    return po.getDueDate();
                case 4:
                    return po.getQuantity();
                case 5:
                    return po.getMaterialID();
                case 6:
                    return po.getThickness();
                case 7:
                    return po.getWidth();
                case 8:
                    return po.getCircumference();
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