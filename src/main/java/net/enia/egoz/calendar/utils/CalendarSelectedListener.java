package net.enia.egoz.calendar.utils;


import net.enia.egoz.calendar.model.ModelDate;

import java.awt.event.MouseEvent;


/**
 * @author Raven
 */
public interface CalendarSelectedListener
{

    void selected(MouseEvent evt, ModelDate date);
}
