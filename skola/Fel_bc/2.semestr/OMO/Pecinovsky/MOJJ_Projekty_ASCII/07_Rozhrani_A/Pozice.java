/*******************************************************************************
 * Trida {@code Pozice} slouzi jako prepravka uchovavajici informace
 * o pozici objektu. 
 * Proto jsou jeji atributy deklarovany jako verejne konstanty.
 *
 * @author     Rudolf Pecinovsky
 * @version    2.02, 18.2.2005
 */
public class Pozice
{
//== KONSTANTNI ATRIBUTY TRIDY =================================================
//== PROMENNE ATRIBUTY TRIDY ===================================================
//== KONSTANTNI ATRIBUTY INSTANCI ==============================================

    /** Vodorovna souradnice dane pozice. */
    public final int x;

    /** Svisla souradnice dane pozice. */
    public final int y;



//== PROMENNE ATRIBUTY INSTANCI ================================================
//== PRISTUPOVE METODY VLASTNOSTI TRIDY ========================================
//== OSTATNI NESOUKROME METODY TRIDY ===========================================

//##############################################################################
//== KONSTRUKTORY A TOVARNI METODY =============================================

    /***************************************************************************
     * Vytvori instanci se zadanymi souradnicemi.
     *
     * @param x  Vodorovna souradnice.
     * @param y  Svisla souradnice.
     */
    public Pozice( int x, int y )
    { 
        this.x  = x;
        this.y  = y;
    }



//== ABSTRAKTNI METODY =========================================================
//== PRISTUPOVE METODY VLASTNOSTI INSTANCI =====================================

    /***************************************************************************
     * Vrati hodnotu vodorovne souradnice dane pozice.
     *
     * @return  Pozadovana souradnice.
     */
    public int getX()
    {
        return x;
    }


    /***************************************************************************
     * Vrati hodnotu svisle souradnice dane pozice.
     *
     * @return  Pozadovana souradnice.
     */
    public int getY()
    {
        return y;
    }


//== OSTATNI NESOUKROME METODY INSTANCI ========================================

    /***************************************************************************
     * Vrati informaci o tom, reprezentuje-li zadana instance stejnou pozici
     * jako objekt zadany jako parametr.
     *
     * @param  o Objekt, s nimz je dana instance porovnavana
     * @return {@code true} reprezentuje-li objekt stejnou pozici, 
     *         jinak {@code false}
     */
    @Override
    public boolean equals( Object o )
    {
        return (o instanceof Pozice )   &&
               (((Pozice)o).x  ==  x)   && 
               (((Pozice)o).y  ==  y);
    }


    /***************************************************************************
     * Vraci textovou reprezentaci dane instance
     * pouzivanou predevsim k ladicim ucelum.
     *
     * @return Pozadovana textova reprezentace.
     */
    @Override
    public String toString()
    {
        return "Pozice[x=" + x + ",y=" + y + "]";
    }



//== SOUKROME A POMOCNE METODY TRIDY ===========================================
//== SOUKROME A POMOCNE METODY INSTANCI ========================================
//== VNORENE A VNITRNI TRIDY ===================================================
//== TESTY A METODA MAIN =======================================================
}
