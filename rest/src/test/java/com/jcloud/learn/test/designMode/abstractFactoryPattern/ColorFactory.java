package com.jcloud.learn.test.designMode.abstractFactoryPattern;

import com.jcloud.learn.test.designMode.base.Color;
import com.jcloud.learn.test.designMode.base.Green;
import com.jcloud.learn.test.designMode.base.Red;
import com.jcloud.learn.test.designMode.base.Shape;

/**
 * Created by lixin32 on 2018/8/13.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }
}
