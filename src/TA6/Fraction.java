package TA6;

import java.util.Objects;

public class Fraction {
    private int _nominator;
    private int _denominator;

    // Constructors
    public Fraction(){
        _nominator = 0;
        _denominator = 1;
    }
    public Fraction(int nominator) {
        this._nominator = nominator;
        this._denominator = 1;
    }
    public Fraction(int nominator, int denominator) {
        this._nominator = nominator;
        this._denominator = denominator;
    }

    public Fraction(Fraction other) {
        this._nominator = other._nominator;
        this._denominator = other._denominator;
    }

    public Fraction plus(Fraction other) {
        this._nominator =
                (this._nominator * other._denominator) +
                (this._denominator * other._nominator);
        this._denominator = this._denominator * other._denominator;
        return this;
    }

    @Override
    public String toString() {
        return  _nominator +" / " + _denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction fraction)) return false;
        return _nominator == fraction._nominator && _denominator == fraction._denominator;
    }

}
