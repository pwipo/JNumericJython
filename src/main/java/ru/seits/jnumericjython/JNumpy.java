package ru.seits.jnumericjython;

import org.python.core.ClassDictInit;
import org.python.core.PyObject;
import org.python.core.PyType;

public class JNumpy extends PyObject implements ClassDictInit {
    public JNumpy() {
        super(PyType.fromClass(JNumpy.class));
    }

    /**
     * Set up the class's __dict__.
     *
     * @param dict The default __dict__ to modify
     */
    public static void classDictInit(final PyObject dict) {
        JNumeric.classDictInit(dict);
    }
}
