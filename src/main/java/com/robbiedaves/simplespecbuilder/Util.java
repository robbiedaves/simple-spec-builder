package com.robbiedaves.simplespecbuilder;

public class Util {

    static <T> T checkNotNull(T reference, String format, Object... args) {
        if (reference == null) throw new NullPointerException(String.format(format, args));
        return reference;
    }
}

