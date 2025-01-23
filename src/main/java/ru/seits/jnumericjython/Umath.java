/**
 * JNumeric - a Jython port of Numerical Java
 * Current Maintainer: Daniel Lemire, Ph.D.
 * (c) 1998, 1999 Timothy Hochberg, tim.hochberg@ieee.org
 * <p>
 * Free software under the Python license, see http://www.python.org
 * Home page: http://jnumerical.sourceforge.net
 */

package ru.seits.jnumericjython;

import org.python.core.ClassDictInit;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;

/**
 *
 */
public class Umath extends PyObject implements ClassDictInit {

    private static final long serialVersionUID = 983522288678302348L;

    /**
     * Simple constructor. No special logic.
     */
    public Umath() {
        super(PyType.fromClass(Umath.class));
        // this.javaProxy = this;
    }

    /**
     * Sets the appropriate ufuncs in the object's __dict__.
     *
     * @param dict __dict__, which we want to modify.
     */
    public static void classDictInit(final PyObject dict) {
        dict.__setitem__("__doc__", new PyString("Universal math functions."));

        // umath functions

        dict.__setitem__("add", Umath.add);
        dict.__setitem__("subtract", Umath.subtract);
        dict.__setitem__("multiply", Umath.multiply);
        dict.__setitem__("divide", Umath.divide);
        dict.__setitem__("remainder", Umath.remainder);
        dict.__setitem__("power", Umath.power);

        dict.__setitem__("arccos", Umath.arccos);
        dict.__setitem__("arccosh", Umath.arccosh);
        dict.__setitem__("arcsin", Umath.arcsin);
        dict.__setitem__("arcsinh", Umath.arcsinh);
        dict.__setitem__("arctan", Umath.arctan);
        dict.__setitem__("arctanh", Umath.arctanh);
        dict.__setitem__("ceil", Umath.ceil);
        dict.__setitem__("conjugate", Umath.conjugate);
        dict.__setitem__("imaginary", Umath.imaginary);
        dict.__setitem__("cos", Umath.cos);
        dict.__setitem__("cosh", Umath.cosh);
        dict.__setitem__("exp", Umath.exp);
        dict.__setitem__("floor", Umath.floor);
        dict.__setitem__("log", Umath.log);
        dict.__setitem__("log10", Umath.log10);
        dict.__setitem__("real", Umath.real);
        dict.__setitem__("sin", Umath.sin);
        dict.__setitem__("sinh", Umath.sinh);
        dict.__setitem__("sqrt", Umath.sqrt);
        dict.__setitem__("tan", Umath.tan);
        dict.__setitem__("tanh", Umath.tanh);

        dict.__setitem__("maximum", Umath.maximum);
        dict.__setitem__("minimum", Umath.minimum);

        dict.__setitem__("equal", Umath.equal);
        dict.__setitem__("not_equal", Umath.not_equal);
        dict.__setitem__("less", Umath.less);
        dict.__setitem__("less_equal", Umath.less_equal);
        dict.__setitem__("greater", Umath.greater);
        dict.__setitem__("greater_equal", Umath.greater_equal);

        dict.__setitem__("logical_and", Umath.logical_and);
        dict.__setitem__("logical_or", Umath.logical_or);
        dict.__setitem__("logical_xor", Umath.logical_xor);
        dict.__setitem__("logical_not", Umath.logical_not);

        dict.__setitem__("bitwise_and", Umath.bitwise_and);
        dict.__setitem__("bitwise_or", Umath.bitwise_or);
        dict.__setitem__("bitwise_xor", Umath.bitwise_xor);
    }

    /**
     * @see BinaryUfunc#add
     */
    static final public BinaryUfunc add = new BinaryUfunc(BinaryUfunc.add);
    /**
     * @see BinaryUfunc#subtract
     */
    static final public BinaryUfunc subtract = new BinaryUfunc(
            BinaryUfunc.subtract);
    /**
     * @see BinaryUfunc#multiply
     */
    static final public BinaryUfunc multiply = new BinaryUfunc(
            BinaryUfunc.multiply);
    /**
     * @see BinaryUfunc#divide
     */
    static final public BinaryUfunc divide = new BinaryUfunc(BinaryUfunc.divide);
    /**
     * @see BinaryUfunc#remainder
     */
    static final public BinaryUfunc remainder = new BinaryUfunc(
            BinaryUfunc.remainder);
    /**
     * @see BinaryUfunc#power
     */
    static final public BinaryUfunc power = new BinaryUfunc(BinaryUfunc.power);

    /**
     * @see UnaryUfunc#arccos
     */
    static final public UnaryUfunc arccos = new UnaryUfunc(UnaryUfunc.arccos);
    /**
     * @see UnaryUfunc#arccosh
     */
    static final public UnaryUfunc arccosh = new UnaryUfunc(UnaryUfunc.arccosh);
    /**
     * @see UnaryUfunc#arcsin
     */
    static final public UnaryUfunc arcsin = new UnaryUfunc(UnaryUfunc.arcsin);
    /**
     * @see UnaryUfunc#arcsinh
     */
    static final public UnaryUfunc arcsinh = new UnaryUfunc(UnaryUfunc.arcsinh);
    /**
     * @see UnaryUfunc#arctan
     */
    static final public UnaryUfunc arctan = new UnaryUfunc(UnaryUfunc.arctan);
    /**
     * @see UnaryUfunc#arctanh
     */
    static final public UnaryUfunc arctanh = new UnaryUfunc(UnaryUfunc.arctanh);
    /**
     * @see UnaryUfunc#ceil
     */
    static final public UnaryUfunc ceil = new UnaryUfunc(UnaryUfunc.ceil);
    /**
     * @see UnaryUfunc#conjugate
     */
    static final public UnaryUfunc conjugate = new UnaryUfunc(
            UnaryUfunc.conjugate);
    /**
     * @see UnaryUfunc#imaginary
     */
    static final public UnaryUfunc imaginary = new UnaryUfunc(
            UnaryUfunc.imaginary);
    /**
     * @see UnaryUfunc#cos
     */
    static final public UnaryUfunc cos = new UnaryUfunc(UnaryUfunc.cos);
    /**
     * @see UnaryUfunc#cosh
     */
    static final public UnaryUfunc cosh = new UnaryUfunc(UnaryUfunc.cosh);
    /**
     * @see UnaryUfunc#exp
     */
    static final public UnaryUfunc exp = new UnaryUfunc(UnaryUfunc.exp);
    /**
     * @see UnaryUfunc#floor
     */
    static final public UnaryUfunc floor = new UnaryUfunc(UnaryUfunc.floor);
    /**
     * @see UnaryUfunc#log
     */
    static final public UnaryUfunc log = new UnaryUfunc(UnaryUfunc.log);
    /**
     * @see UnaryUfunc#log10
     */
    static final public UnaryUfunc log10 = new UnaryUfunc(UnaryUfunc.log10);
    /**
     * @see UnaryUfunc#real
     */
    static final public UnaryUfunc real = new UnaryUfunc(UnaryUfunc.real);
    /**
     * @see UnaryUfunc#sin
     */
    static final public UnaryUfunc sin = new UnaryUfunc(UnaryUfunc.sin);
    /**
     * @see UnaryUfunc#sinh
     */
    static final public UnaryUfunc sinh = new UnaryUfunc(UnaryUfunc.sinh);
    /**
     * @see UnaryUfunc#sqrt
     */
    static final public UnaryUfunc sqrt = new UnaryUfunc(UnaryUfunc.sqrt);
    /**
     * @see UnaryUfunc#tan
     */
    static final public UnaryUfunc tan = new UnaryUfunc(UnaryUfunc.tan);
    /**
     * @see UnaryUfunc#tanh
     */
    static final public UnaryUfunc tanh = new UnaryUfunc(UnaryUfunc.tanh);

    /**
     * @see BinaryUfunc#maximum
     */
    static final public BinaryUfunc maximum = new BinaryUfunc(
            BinaryUfunc.maximum);
    /**
     * @see BinaryUfunc#minimum
     */
    static final public BinaryUfunc minimum = new BinaryUfunc(
            BinaryUfunc.minimum);

    /**
     * @see BinaryUfunc#equal
     */
    static final public BinaryUfunc equal = new BinaryUfunc(BinaryUfunc.equal);
    /**
     * @see BinaryUfunc#notEqual
     */
    static final public BinaryUfunc not_equal = new BinaryUfunc(
            BinaryUfunc.notEqual);
    /**
     * @see BinaryUfunc#less
     */
    static final public BinaryUfunc less = new BinaryUfunc(BinaryUfunc.less);
    /**
     * @see BinaryUfunc#lessEqual
     */
    static final public BinaryUfunc less_equal = new BinaryUfunc(
            BinaryUfunc.lessEqual);
    /**
     * @see BinaryUfunc#greater
     */
    static final public BinaryUfunc greater = new BinaryUfunc(
            BinaryUfunc.greater);
    /**
     * @see BinaryUfunc#greaterEqual
     */
    static final public BinaryUfunc greater_equal = new BinaryUfunc(
            BinaryUfunc.greaterEqual);

    /**
     * @see BinaryUfunc#logicalAnd
     */
    static final public BinaryUfunc logical_and = new BinaryUfunc(
            BinaryUfunc.logicalAnd);
    /**
     * @see BinaryUfunc#logicalOr
     */
    static final public BinaryUfunc logical_or = new BinaryUfunc(
            BinaryUfunc.logicalOr);
    /**
     * @see BinaryUfunc#logicalXor
     */
    static final public BinaryUfunc logical_xor = new BinaryUfunc(
            BinaryUfunc.logicalXor);
    /**
     * @see UnaryUfunc#logicalNot
     */
    static final public UnaryUfunc logical_not = new UnaryUfunc(
            UnaryUfunc.logicalNot);

    /**
     * @see BinaryUfunc#bitwiseAnd
     */
    static final public BinaryUfunc bitwise_and = new BinaryUfunc(
            BinaryUfunc.bitwiseAnd);
    /**
     * @see BinaryUfunc#bitwiseOr
     */
    static final public BinaryUfunc bitwise_or = new BinaryUfunc(
            BinaryUfunc.bitwiseOr);
    /**
     * @see BinaryUfunc#bitwiseXor
     */
    static final public BinaryUfunc bitwise_xor = new BinaryUfunc(
            BinaryUfunc.bitwiseXor);
}
