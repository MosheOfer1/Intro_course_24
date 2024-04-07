package TA6;

public class Interval {
    // Data members
    private double _left;

    private double _right;

    public Interval(double _left, double _right) {
        if (_left > _right)
            throw new RuntimeException("It is not interval");
        this._left = _left;
        this._right = _right;
    }
    public boolean contains (double x) {
        return x <= _right && x>=_left;
    }
    public boolean intersection(Interval other) {
        return this.contains(other._left) || this.contains(other._right);
    }
    public double distBetweenMidPoints (Interval other) {
        double midOther = (other._left + other._right) / 2;
        double midThis = (this._left + this._right) / 2;
        return Math.abs(midThis - midOther);
    }
    public String toString() {
        return "[" + _left + ", "+_right + ']';
    }
}
