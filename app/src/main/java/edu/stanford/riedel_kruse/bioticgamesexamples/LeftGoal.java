package edu.stanford.riedel_kruse.bioticgamesexamples;

import org.opencv.core.Point;
import org.opencv.core.Scalar;

import edu.stanford.riedel_kruse.bioticgamessdk.CompositeShape;
import edu.stanford.riedel_kruse.bioticgamessdk.Rectangle;
import edu.stanford.riedel_kruse.bioticgamessdk.Shape;

/**
 * Created by dchiu on 2/2/15.
 */
public class LeftGoal extends CompositeShape {
    public LeftGoal(Point position, int goalWidth, int goalLength, Scalar color) {
        super(position);
        Rectangle back = new Rectangle(new Point(0, 0), goalWidth, goalLength, color, -1, true);
        Rectangle top = new Rectangle(new Point(0, 0), goalLength / 4, goalWidth, color, -1, false);
        Point bottomPosition = new Point(0, goalLength - goalWidth);
        Rectangle bottom = new Rectangle(bottomPosition, goalLength / 4, goalWidth, color, -1,
                false);

        addChild(back);
        addChild(top);
        addChild(bottom);
    }
}
