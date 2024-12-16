package net.enia.egoz.calendar.swing;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


/**
 * @param <E>
 * @author RAVEN
 */
public interface DynamicCellRender<E>
{

    void paintBackground(Graphics2D g2, DynamicCell<E> dynamicCell, Rectangle rectangle);


    void paintCell(Graphics2D g2, Rectangle2D rectangle, E e);


    void paint(Graphics2D g2, Rectangle rectangle);


    E next(E last);


    E previous(E first);
}
