/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author user
 */
public class Random {

    private double min;
    private double max;
    private double range;

    public Random(double min, double max) {
        setMinMax(min, max);
        if (range == 0.0) {
            range = 1.0;
        }
    }

    public void setMin(double min) {
        setMinMax(min, max);
    }

    public void setMax(double max) {
        setMinMax(min, max);
    }

    public void setMinMax(double min, double max) {
        if (min <= max) {
            this.min = min;
            this.max = max;
        } else {
            this.min = max;
            this.max = min;
        }
        range = (max - min);
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getRange() {
        return range;
    }

    public double get() {
        return (Math.random() * range) + min;
    }
}
