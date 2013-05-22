
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Material;
import DAL.MaterialDBM;
import java.util.ArrayList;

/**
 *
 * @author Aka
 */
public class MaterialManager
{

    private MaterialDBM mdb;

    public MaterialManager() throws Exception
    {
        this.mdb = new MaterialDBM();
    }

    public ArrayList<Material> getByMaterialId(int ID) throws Exception
    {
        return mdb.getByMaterialID(ID);

    }
}
