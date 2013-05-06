/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

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
    private ArrayList<Sleeve> sl;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
