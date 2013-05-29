/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.SimilarSleeve;
import DAL.SimilarSleeveDBM;
import java.util.ArrayList;

/**
 *
 * @author MikeZJ
 */
public class SimilarSleeveManager
{

    private SimilarSleeveDBM ssldb;

    /**
     *
     * Creates a new similarsleeveDBM
     */
    public SimilarSleeveManager() throws Exception
    {
        ssldb = new SimilarSleeveDBM();
    }

    /**
     *
     * @param ID
     * @return the sleeves with that specified ID from the SimilarSleeve list
     */
    public ArrayList<SimilarSleeve> getNewSimilarSleeve(int ID) throws Exception
    {
        return ssldb.getNewSimilarSleeve(ID);
    }
}
