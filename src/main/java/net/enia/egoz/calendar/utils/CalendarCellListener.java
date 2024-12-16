package net.enia.egoz.calendar.utils;

import java.awt.event.MouseEvent;


/**
 * @author Raven
 */
public interface CalendarCellListener
{

    void cellSelected(MouseEvent evet, int index);


    void scrollChanged();
}
