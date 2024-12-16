package net.enia.egoz.calendar.swing;

import java.awt.event.MouseEvent;


/**
 * @author RAVEN
 */
public interface DynamicCellListener
{

    void scrollChanged(boolean scrollNext);


    void mouseSelected(MouseEvent mouse);
}
