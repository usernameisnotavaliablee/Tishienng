package com.google.gson.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class JsonWriter implements java.io.Closeable, java.io.Flushable {
    private static final java.lang.String[] HTML_SAFE_REPLACEMENT_CHARS = null;
    private static final java.lang.String[] REPLACEMENT_CHARS = null;
    private java.lang.String deferredName;
    private boolean htmlSafe;
    private java.lang.String indent;
    private boolean lenient;
    private final java.io.Writer out;
    private java.lang.String separator;
    private boolean serializeNulls;
    private int[] stack;
    private int stackSize;

    static {
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS = r0
            r0 = 0
            r1 = 0
        L8:
            r2 = 31
            if (r1 > r2) goto L22
            java.lang.String[] r2 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r3
            java.lang.String r3 = "\\u%04x"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L8
        L22:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
            r1 = 34
            java.lang.String r2 = "\\\""
            r0[r1] = r2
            r1 = 92
            java.lang.String r2 = "\\\\"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "\\t"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "\\b"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "\\n"
            r0[r1] = r2
            r1 = 13
            java.lang.String r2 = "\\r"
            r0[r1] = r2
            r1 = 12
            java.lang.String r2 = "\\f"
            r0[r1] = r2
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            com.google.gson.stream.JsonWriter.HTML_SAFE_REPLACEMENT_CHARS = r0
            r1 = 60
            java.lang.String r2 = "\\u003c"
            r0[r1] = r2
            r1 = 62
            java.lang.String r2 = "\\u003e"
            r0[r1] = r2
            r1 = 38
            java.lang.String r2 = "\\u0026"
            r0[r1] = r2
            r1 = 61
            java.lang.String r2 = "\\u003d"
            r0[r1] = r2
            r1 = 39
            java.lang.String r2 = "\\u0027"
            r0[r1] = r2
            return
    }

    public JsonWriter(java.io.Writer r2) {
            r1 = this;
            r1.<init>()
            r0 = 32
            int[] r0 = new int[r0]
            r1.stack = r0
            r0 = 0
            r1.stackSize = r0
            r0 = 6
            r1.push(r0)
            java.lang.String r0 = ":"
            r1.separator = r0
            r0 = 1
            r1.serializeNulls = r0
            if (r2 == 0) goto L1c
            r1.out = r2
            return
        L1c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "out == null"
            r2.<init>(r0)
            throw r2
    }

    private void beforeName() throws java.io.IOException {
            r2 = this;
            int r0 = r2.peek()
            r1 = 5
            if (r0 != r1) goto Lf
            java.io.Writer r0 = r2.out
            r1 = 44
            r0.write(r1)
            goto L12
        Lf:
            r1 = 3
            if (r0 != r1) goto L1a
        L12:
            r2.newline()
            r0 = 4
            r2.replaceTop(r0)
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Nesting problem."
            r0.<init>(r1)
            throw r0
    }

    private void beforeValue() throws java.io.IOException {
            r3 = this;
            int r0 = r3.peek()
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L43
            if (r0 == r2) goto L38
            r1 = 4
            if (r0 == r1) goto L2c
            r1 = 6
            r2 = 7
            if (r0 == r1) goto L28
            if (r0 != r2) goto L20
            boolean r0 = r3.lenient
            if (r0 == 0) goto L18
            goto L28
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JSON must have only one top-level value."
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Nesting problem."
            r0.<init>(r1)
            throw r0
        L28:
            r3.replaceTop(r2)
            return
        L2c:
            java.io.Writer r0 = r3.out
            java.lang.String r1 = r3.separator
            r0.append(r1)
            r0 = 5
            r3.replaceTop(r0)
            return
        L38:
            java.io.Writer r0 = r3.out
            r1 = 44
            r0.append(r1)
            r3.newline()
            return
        L43:
            r3.replaceTop(r2)
            r3.newline()
            return
    }

    private com.google.gson.stream.JsonWriter close(int r2, int r3, java.lang.String r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.peek()
            if (r0 == r3) goto L11
            if (r0 != r2) goto L9
            goto L11
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Nesting problem."
            r2.<init>(r3)
            throw r2
        L11:
            java.lang.String r2 = r1.deferredName
            if (r2 != 0) goto L26
            int r2 = r1.stackSize
            int r2 = r2 + (-1)
            r1.stackSize = r2
            if (r0 != r3) goto L20
            r1.newline()
        L20:
            java.io.Writer r2 = r1.out
            r2.write(r4)
            return r1
        L26:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Dangling name: "
            r3.append(r4)
            java.lang.String r4 = r1.deferredName
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private void newline() throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = r4.indent
            if (r0 != 0) goto L5
            goto L1b
        L5:
            java.io.Writer r0 = r4.out
            java.lang.String r1 = "\n"
            r0.write(r1)
            int r0 = r4.stackSize
            r1 = 1
        Lf:
            if (r1 >= r0) goto L1b
            java.io.Writer r2 = r4.out
            java.lang.String r3 = r4.indent
            r2.write(r3)
            int r1 = r1 + 1
            goto Lf
        L1b:
            return
    }

    private com.google.gson.stream.JsonWriter open(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            r0.beforeValue()
            r0.push(r1)
            java.io.Writer r1 = r0.out
            r1.write(r2)
            return r0
    }

    private int peek() {
            r2 = this;
            int r0 = r2.stackSize
            if (r0 == 0) goto Lb
            int[] r1 = r2.stack
            int r0 = r0 + (-1)
            r0 = r1[r0]
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonWriter is closed."
            r0.<init>(r1)
            throw r0
    }

    private void push(int r5) {
            r4 = this;
            int r0 = r4.stackSize
            int[] r1 = r4.stack
            int r2 = r1.length
            if (r0 != r2) goto L11
            int r2 = r0 * 2
            int[] r2 = new int[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r4.stack = r2
        L11:
            int[] r0 = r4.stack
            int r1 = r4.stackSize
            int r2 = r1 + 1
            r4.stackSize = r2
            r0[r1] = r5
            return
    }

    private void replaceTop(int r3) {
            r2 = this;
            int[] r0 = r2.stack
            int r1 = r2.stackSize
            int r1 = r1 + (-1)
            r0[r1] = r3
            return
    }

    private void string(java.lang.String r9) throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.htmlSafe
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.HTML_SAFE_REPLACEMENT_CHARS
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
        L9:
            java.io.Writer r1 = r8.out
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.out
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.out
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.out
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.out
            r9.write(r2)
            return
    }

    private void writeDeferredName() throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r1.deferredName
            if (r0 == 0) goto Lf
            r1.beforeName()
            java.lang.String r0 = r1.deferredName
            r1.string(r0)
            r0 = 0
            r1.deferredName = r0
        Lf:
            return
    }

    public com.google.gson.stream.JsonWriter beginArray() throws java.io.IOException {
            r2 = this;
            r2.writeDeferredName()
            r0 = 1
            java.lang.String r1 = "["
            com.google.gson.stream.JsonWriter r0 = r2.open(r0, r1)
            return r0
    }

    public com.google.gson.stream.JsonWriter beginObject() throws java.io.IOException {
            r2 = this;
            r2.writeDeferredName()
            r0 = 3
            java.lang.String r1 = "{"
            com.google.gson.stream.JsonWriter r0 = r2.open(r0, r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            java.io.Writer r0 = r3.out
            r0.close()
            int r0 = r3.stackSize
            r1 = 1
            if (r0 > r1) goto L18
            if (r0 != r1) goto L14
            int[] r2 = r3.stack
            int r0 = r0 - r1
            r0 = r2[r0]
            r1 = 7
            if (r0 != r1) goto L18
        L14:
            r0 = 0
            r3.stackSize = r0
            return
        L18:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Incomplete document"
            r0.<init>(r1)
            throw r0
    }

    public com.google.gson.stream.JsonWriter endArray() throws java.io.IOException {
            r3 = this;
            r0 = 2
            java.lang.String r1 = "]"
            r2 = 1
            com.google.gson.stream.JsonWriter r0 = r3.close(r2, r0, r1)
            return r0
    }

    public com.google.gson.stream.JsonWriter endObject() throws java.io.IOException {
            r3 = this;
            r0 = 5
            java.lang.String r1 = "}"
            r2 = 3
            com.google.gson.stream.JsonWriter r0 = r3.close(r2, r0, r1)
            return r0
    }

    public void flush() throws java.io.IOException {
            r2 = this;
            int r0 = r2.stackSize
            if (r0 == 0) goto La
            java.io.Writer r0 = r2.out
            r0.flush()
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonWriter is closed."
            r0.<init>(r1)
            throw r0
    }

    public final boolean getSerializeNulls() {
            r1 = this;
            boolean r0 = r1.serializeNulls
            return r0
    }

    public final boolean isHtmlSafe() {
            r1 = this;
            boolean r0 = r1.htmlSafe
            return r0
    }

    public boolean isLenient() {
            r1 = this;
            boolean r0 = r1.lenient
            return r0
    }

    public com.google.gson.stream.JsonWriter jsonValue(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            if (r2 != 0) goto L7
            com.google.gson.stream.JsonWriter r2 = r1.nullValue()
            return r2
        L7:
            r1.writeDeferredName()
            r1.beforeValue()
            java.io.Writer r0 = r1.out
            r0.append(r2)
            return r1
    }

    public com.google.gson.stream.JsonWriter name(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            if (r2 == 0) goto L1b
            java.lang.String r0 = r1.deferredName
            if (r0 != 0) goto L15
            int r0 = r1.stackSize
            if (r0 == 0) goto Ld
            r1.deferredName = r2
            return r1
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "JsonWriter is closed."
            r2.<init>(r0)
            throw r2
        L15:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        L1b:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "name == null"
            r2.<init>(r0)
            throw r2
    }

    public com.google.gson.stream.JsonWriter nullValue() throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r2.deferredName
            if (r0 == 0) goto L10
            boolean r0 = r2.serializeNulls
            if (r0 == 0) goto Lc
            r2.writeDeferredName()
            goto L10
        Lc:
            r0 = 0
            r2.deferredName = r0
            return r2
        L10:
            r2.beforeValue()
            java.io.Writer r0 = r2.out
            java.lang.String r1 = "null"
            r0.write(r1)
            return r2
    }

    public final void setHtmlSafe(boolean r1) {
            r0 = this;
            r0.htmlSafe = r1
            return
    }

    public final void setIndent(java.lang.String r2) {
            r1 = this;
            int r0 = r2.length()
            if (r0 != 0) goto Le
            r2 = 0
            r1.indent = r2
            java.lang.String r2 = ":"
            r1.separator = r2
            return
        Le:
            r1.indent = r2
            java.lang.String r2 = ": "
            r1.separator = r2
            return
    }

    public final void setLenient(boolean r1) {
            r0 = this;
            r0.lenient = r1
            return
    }

    public final void setSerializeNulls(boolean r1) {
            r0 = this;
            r0.serializeNulls = r1
            return
    }

    public com.google.gson.stream.JsonWriter value(double r4) throws java.io.IOException {
            r3 = this;
            r3.writeDeferredName()
            boolean r0 = r3.lenient
            if (r0 != 0) goto L2b
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L14
            boolean r0 = java.lang.Double.isInfinite(r4)
            if (r0 != 0) goto L14
            goto L2b
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Numeric values must be finite, but was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2b:
            r3.beforeValue()
            java.io.Writer r0 = r3.out
            java.lang.String r4 = java.lang.Double.toString(r4)
            r0.append(r4)
            return r3
    }

    public com.google.gson.stream.JsonWriter value(long r2) throws java.io.IOException {
            r1 = this;
            r1.writeDeferredName()
            r1.beforeValue()
            java.io.Writer r0 = r1.out
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.write(r2)
            return r1
    }

    public com.google.gson.stream.JsonWriter value(java.lang.Boolean r2) throws java.io.IOException {
            r1 = this;
            if (r2 != 0) goto L7
            com.google.gson.stream.JsonWriter r2 = r1.nullValue()
            return r2
        L7:
            r1.writeDeferredName()
            r1.beforeValue()
            java.io.Writer r0 = r1.out
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L18
            java.lang.String r2 = "true"
            goto L1a
        L18:
            java.lang.String r2 = "false"
        L1a:
            r0.write(r2)
            return r1
    }

    public com.google.gson.stream.JsonWriter value(java.lang.Number r4) throws java.io.IOException {
            r3 = this;
            if (r4 != 0) goto L7
            com.google.gson.stream.JsonWriter r4 = r3.nullValue()
            return r4
        L7:
            r3.writeDeferredName()
            java.lang.String r0 = r4.toString()
            boolean r1 = r3.lenient
            if (r1 != 0) goto L42
            java.lang.String r1 = "-Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "NaN"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2b
            goto L42
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Numeric values must be finite, but was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L42:
            r3.beforeValue()
            java.io.Writer r4 = r3.out
            r4.append(r0)
            return r3
    }

    public com.google.gson.stream.JsonWriter value(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            if (r1 != 0) goto L7
            com.google.gson.stream.JsonWriter r1 = r0.nullValue()
            return r1
        L7:
            r0.writeDeferredName()
            r0.beforeValue()
            r0.string(r1)
            return r0
    }

    public com.google.gson.stream.JsonWriter value(boolean r2) throws java.io.IOException {
            r1 = this;
            r1.writeDeferredName()
            r1.beforeValue()
            java.io.Writer r0 = r1.out
            if (r2 == 0) goto Ld
            java.lang.String r2 = "true"
            goto Lf
        Ld:
            java.lang.String r2 = "false"
        Lf:
            r0.write(r2)
            return r1
    }
}
