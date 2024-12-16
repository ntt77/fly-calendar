package net.enia.egoz.calendar.utils;


import net.enia.egoz.calendar.model.ModelDate;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


/**
 * @author Raven
 */
public interface PanelDateListener
{

    boolean cellPaint(Graphics2D g2, Rectangle2D rectangle, ModelDate e);
}
