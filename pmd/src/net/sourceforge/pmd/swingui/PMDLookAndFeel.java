package net.sourceforge.pmd.swingui;

import java.awt.Color;
import javax.swing.UIDefaults;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

/**
 *
 * @author Donald A. Leckie
 * @since August 27, 2002
 * @version $Revision$, $Date$
 */
public class PMDLookAndFeel extends WindowsLookAndFeel
{

    public static final Color TABLE_BACKGROUND_COLOR = new Color(0xFFFFD9);
    public static final Color TREE_BACKGROUND_COLOR = new Color(0xFFFFD9);

    /**************************************************************
     *
     * @return
     */
    public String getDescription()
    {
        return "Source Forge PMD look and feel";
    }

    /**************************************************************
     *
     * @return
     */
    public String getID()
    {
        return "SourceForgePMD";
    }

    /**************************************************************
     *
     * @return
     */
    public String getName()
    {
        return "SourceForgePMD";
    }

    /**************************************************************
     *
     * @return
     */
    public boolean isNativeLookAndFeel()
    {
        return false;
    }

    /**************************************************************
     *
     * @return
     */
    public boolean isSupportedLookAndFeel()
    {
        return true;
    }

    /**************************************************************
     *
     * @param table
     */
    protected void initClassDefaults(UIDefaults table)
    {
        super.initClassDefaults(table);

        String pkgName = "net.sourceforge.pmd.swingui";
    }



    /**************************************************************
     *
     * @param table
     */
    protected void initSystemColorDefaults(UIDefaults table)
    {
//J-
          super.initSystemColorDefaults(table);

          String[] defaultSystemColors = {
                       "pmdBlue", "#5A74AF",
                       "pmdGray", "#C5C5C5",
                        "pmdRed", "#CC4662",
                      "pmdGreen", "#336666",
                      "pmdCream", "#FFFCED",
             "pmdTreeBackground", "#FFFFD9",
            "pmdTableBackground", "#FFFFD9",
                    "mediumGray", "#686868",
                "mediumDarkGray", "#434343",
                      "paleGray", "#AAAAAA",
          };

          loadSystemColors(table, defaultSystemColors, isNativeLookAndFeel());
//J
    }



    /**************************************************************
     *
     * @param table
     */
    protected void initComponentDefaults(UIDefaults table)
    {
        super.initComponentDefaults(table);
    }
}