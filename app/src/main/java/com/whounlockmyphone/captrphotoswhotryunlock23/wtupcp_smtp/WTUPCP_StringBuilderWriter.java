package com.whounlockmyphone.captrphotoswhotryunlock23.wtupcp_smtp;

import java.io.Serializable;
import java.io.Writer;

public class WTUPCP_StringBuilderWriter extends Writer implements Serializable {
    private final StringBuilder builder;

    public void close() {
    }

    public void flush() {
    }

    public WTUPCP_StringBuilderWriter() {
        this.builder = new StringBuilder();
    }

    public WTUPCP_StringBuilderWriter(int i) {
        this.builder = new StringBuilder(i);
    }

    public Writer append(char c) {
        this.builder.append(c);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i, int i2) {
        this.builder.append(charSequence, i, i2);
        return this;
    }

    public void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.builder.append(cArr, i, i2);
        }
    }

    public String toString() {
        return this.builder.toString();
    }
}
