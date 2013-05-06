/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.ProductionOrder;
import BE.Sleeve;
import BLL.SleeveManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aka
 */
public class SleeveTableModel extends AbstractTableModel
{
    private SleeveManager slm;
    private final String[] header =
    {
        "Id", "Thickness", "Circumference", "MaterialID"
    };
    private final Class[] columnTypes =
    {
        Integer.class, Double.class, Double.class, Integer.class
    };
    private ArrayList <Sleeve> sl;

    public SleeveTableModel()
    {
        try
        {
            slm = new SleeveManager();
        }
        catch (Exception ex)
        {
            System.out.println("lol");
        }
    }

    SleeveTableModel(ArrayList<Sleeve> getBySleeveId)
    {
        fireTableDataChanged();
        sl = getBySleeveId;
    }

    @Override
    public int getRowCount()
    {
        return sl.size();
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
            Sleeve s = sl.get(row);
            switch (col)
            {
                case 0:
                    return s.getID();
                case 1:
                    return s.getThickness();
                case 2:
                    return s.getCircumference();
                case 3:
                    return s.getMaterialID();
    

            }
            return null;
        }
    }
}