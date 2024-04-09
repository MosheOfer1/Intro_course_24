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
        simplify();
    }

    public Fraction(Fraction other) {
        this._nominator = other._nominator;
        this._denominator = other._denominator;
        simplify();
    }

    public Fraction plus(Fraction other) {
        this._nominator =
                (this._nominator * other._denominator) +
                (this._denominator * other._nominator);
        this._denominator = this._denominator * other._denominator;
        return this;
    }
    private void simplify(){
        int g = gcd(this._nominator, this._denominator);
        this._nominator /= g;
        this._denominator /= g;
    }
    private int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
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
