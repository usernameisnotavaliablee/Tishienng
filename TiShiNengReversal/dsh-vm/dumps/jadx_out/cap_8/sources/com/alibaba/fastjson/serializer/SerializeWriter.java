package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class SerializeWriter extends java.io.Writer {
    private static final java.nio.charset.Charset UTF8 = null;
    private static final java.lang.ThreadLocal<char[]> bufLocal = null;
    private static final java.lang.ThreadLocal<byte[]> bytesBufLocal = null;
    static final int nonDirectFeautres = 0;
    protected boolean beanToArray;
    protected char[] buf;
    protected int count;
    protected boolean disableCircularReferenceDetect;
    protected int features;
    protected char keySeperator;
    protected int maxBufSize;
    protected boolean notWriteDefaultValue;
    protected boolean quoteFieldNames;
    protected boolean sortField;
    protected boolean useSingleQuotes;
    protected boolean writeDirect;
    protected boolean writeEnumUsingName;
    protected boolean writeEnumUsingToString;
    protected boolean writeNonStringValueAsString;
    private final java.io.Writer writer;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.alibaba.fastjson.serializer.SerializeWriter.UTF8 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.serializer.SerializeWriter.bufLocal = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.serializer.SerializeWriter.bytesBufLocal = r0
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes
            int r0 = r0.mask
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserSecure
            int r1 = r1.mask
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserCompatible
            int r1 = r1.mask
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat
            int r1 = r1.mask
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString
            int r1 = r1.mask
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringValueAsString
            int r1 = r1.mask
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            int r1 = r1.mask
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.IgnoreErrorGetter
            int r1 = r1.mask
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            int r1 = r1.mask
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue
            int r1 = r1.mask
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializeWriter.nonDirectFeautres = r0
            return
    }

    public SerializeWriter() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public SerializeWriter(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public SerializeWriter(java.io.Writer r3) {
            r2 = this;
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = com.alibaba.fastjson.serializer.SerializerFeature.EMPTY
            r2.<init>(r3, r0, r1)
            return
    }

    public SerializeWriter(java.io.Writer r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.maxBufSize = r0
            r2.writer = r3
            if (r4 <= 0) goto Lf
            char[] r3 = new char[r4]
            r2.buf = r3
            return
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Negative initial size: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public SerializeWriter(java.io.Writer r3, int r4, com.alibaba.fastjson.serializer.SerializerFeature... r5) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.maxBufSize = r0
            r2.writer = r3
            java.lang.ThreadLocal<char[]> r3 = com.alibaba.fastjson.serializer.SerializeWriter.bufLocal
            java.lang.Object r0 = r3.get()
            char[] r0 = (char[]) r0
            r2.buf = r0
            if (r0 == 0) goto L19
            r0 = 0
            r3.set(r0)
            goto L1f
        L19:
            r3 = 2048(0x800, float:2.87E-42)
            char[] r3 = new char[r3]
            r2.buf = r3
        L1f:
            int r3 = r5.length
            r0 = 0
        L21:
            if (r0 >= r3) goto L2d
            r1 = r5[r0]
            int r1 = r1.getMask()
            r4 = r4 | r1
            int r0 = r0 + 1
            goto L21
        L2d:
            r2.features = r4
            r2.computeFeatures()
            return
    }

    public SerializeWriter(java.io.Writer r2, com.alibaba.fastjson.serializer.SerializerFeature... r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public SerializeWriter(com.alibaba.fastjson.serializer.SerializerFeature... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    private int encodeToUTF8(java.io.OutputStream r5) throws java.io.IOException {
            r4 = this;
            int r0 = r4.count
            double r0 = (double) r0
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            java.lang.ThreadLocal<byte[]> r1 = com.alibaba.fastjson.serializer.SerializeWriter.bytesBufLocal
            java.lang.Object r2 = r1.get()
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L19
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]
            r1.set(r2)
        L19:
            int r1 = r2.length
            if (r1 >= r0) goto L1e
            byte[] r2 = new byte[r0]
        L1e:
            char[] r0 = r4.buf
            int r1 = r4.count
            r3 = 0
            int r0 = com.alibaba.fastjson.util.IOUtils.encodeUTF8(r0, r3, r1, r2)
            r5.write(r2, r3, r0)
            return r0
    }

    private byte[] encodeToUTF8Bytes() {
            r4 = this;
            int r0 = r4.count
            double r0 = (double) r0
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            java.lang.ThreadLocal<byte[]> r1 = com.alibaba.fastjson.serializer.SerializeWriter.bytesBufLocal
            java.lang.Object r2 = r1.get()
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L19
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]
            r1.set(r2)
        L19:
            int r1 = r2.length
            if (r1 >= r0) goto L1e
            byte[] r2 = new byte[r0]
        L1e:
            char[] r0 = r4.buf
            int r1 = r4.count
            r3 = 0
            int r0 = com.alibaba.fastjson.util.IOUtils.encodeUTF8(r0, r3, r1, r2)
            byte[] r1 = new byte[r0]
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    static boolean isSpecial(char r3, int r4) {
            r0 = 32
            r1 = 0
            if (r3 != r0) goto L6
            return r1
        L6:
            r0 = 47
            r2 = 1
            if (r3 != r0) goto L14
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            int r3 = r3.mask
            r3 = r3 & r4
            if (r3 == 0) goto L13
            return r2
        L13:
            return r1
        L14:
            r4 = 35
            r0 = 92
            if (r3 <= r4) goto L1d
            if (r3 == r0) goto L1d
            return r1
        L1d:
            r4 = 31
            if (r3 <= r4) goto L29
            if (r3 == r0) goto L29
            r4 = 34
            if (r3 != r4) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r2
    }

    private void writeEnumFieldValue(char r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = r1.useSingleQuotes
            if (r0 == 0) goto L8
            r1.writeFieldValue(r2, r3, r4)
            return
        L8:
            r1.writeFieldValueStringWithDoubleQuote(r2, r3, r4)
            return
    }

    private void writeKeyWithSingleQuoteIfHasSpecial(java.lang.String r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            byte[] r2 = com.alibaba.fastjson.util.IOUtils.specicalFlags_singleQuotes
            int r3 = r1.length()
            int r4 = r0.count
            int r4 = r4 + r3
            r5 = 1
            int r4 = r4 + r5
            char[] r6 = r0.buf
            int r6 = r6.length
            r7 = 92
            r8 = 58
            r9 = 0
            r10 = 39
            if (r4 <= r6) goto L6d
            java.io.Writer r6 = r0.writer
            if (r6 == 0) goto L6a
            if (r3 != 0) goto L2b
            r0.write(r10)
            r0.write(r10)
            r0.write(r8)
            return
        L2b:
            r4 = 0
        L2c:
            if (r4 >= r3) goto L3d
            char r6 = r1.charAt(r4)
            int r11 = r2.length
            if (r6 >= r11) goto L3a
            r6 = r2[r6]
            if (r6 == 0) goto L3a
            goto L3e
        L3a:
            int r4 = r4 + 1
            goto L2c
        L3d:
            r5 = 0
        L3e:
            if (r5 == 0) goto L43
            r0.write(r10)
        L43:
            if (r9 >= r3) goto L61
            char r4 = r1.charAt(r9)
            int r6 = r2.length
            if (r4 >= r6) goto L5b
            r6 = r2[r4]
            if (r6 == 0) goto L5b
            r0.write(r7)
            char[] r6 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r4 = r6[r4]
            r0.write(r4)
            goto L5e
        L5b:
            r0.write(r4)
        L5e:
            int r9 = r9 + 1
            goto L43
        L61:
            if (r5 == 0) goto L66
            r0.write(r10)
        L66:
            r0.write(r8)
            return
        L6a:
            r0.expandCapacity(r4)
        L6d:
            if (r3 != 0) goto L94
            int r1 = r0.count
            int r2 = r1 + 3
            char[] r3 = r0.buf
            int r3 = r3.length
            if (r2 <= r3) goto L7d
            int r1 = r1 + 3
            r0.expandCapacity(r1)
        L7d:
            char[] r1 = r0.buf
            int r2 = r0.count
            int r3 = r2 + 1
            r0.count = r3
            r1[r2] = r10
            int r4 = r2 + 2
            r0.count = r4
            r1[r3] = r10
            int r2 = r2 + 3
            r0.count = r2
            r1[r4] = r8
            return
        L94:
            int r6 = r0.count
            int r11 = r6 + r3
            char[] r12 = r0.buf
            r1.getChars(r9, r3, r12, r6)
            r0.count = r4
            r1 = r6
            r3 = 0
        La1:
            if (r1 >= r11) goto L10d
            char[] r12 = r0.buf
            char r13 = r12[r1]
            int r14 = r2.length
            if (r13 >= r14) goto Le2
            r14 = r2[r13]
            if (r14 == 0) goto Le2
            if (r3 != 0) goto Le5
            int r4 = r4 + 3
            int r3 = r12.length
            if (r4 <= r3) goto Lb8
            r0.expandCapacity(r4)
        Lb8:
            r0.count = r4
            char[] r3 = r0.buf
            int r12 = r1 + 1
            int r14 = r1 + 3
            int r15 = r11 - r1
            int r15 = r15 - r5
            java.lang.System.arraycopy(r3, r12, r3, r14, r15)
            char[] r3 = r0.buf
            java.lang.System.arraycopy(r3, r9, r3, r5, r1)
            char[] r3 = r0.buf
            r3[r6] = r10
            r3[r12] = r7
            int r1 = r1 + 2
            char[] r12 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r12 = r12[r13]
            r3[r1] = r12
            int r11 = r11 + 2
            int r12 = r0.count
            int r12 = r12 + (-2)
            r3[r12] = r10
            r3 = 1
        Le2:
            r16 = 1
            goto L109
        Le5:
            int r4 = r4 + 1
            int r12 = r12.length
            if (r4 <= r12) goto Led
            r0.expandCapacity(r4)
        Led:
            r0.count = r4
            char[] r12 = r0.buf
            int r14 = r1 + 1
            int r15 = r1 + 2
            r16 = 1
            int r5 = r11 - r1
            java.lang.System.arraycopy(r12, r14, r12, r15, r5)
            char[] r5 = r0.buf
            r5[r1] = r7
            char[] r1 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r1 = r1[r13]
            r5[r14] = r1
            int r11 = r11 + 1
            r1 = r14
        L109:
            int r1 = r1 + 1
            r5 = 1
            goto La1
        L10d:
            r16 = 1
            char[] r1 = r0.buf
            int r4 = r4 + (-1)
            r1[r4] = r8
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public com.alibaba.fastjson.serializer.SerializeWriter append(char r1) {
            r0 = this;
            r0.write(r1)
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public com.alibaba.fastjson.serializer.SerializeWriter append(java.lang.CharSequence r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = "null"
            goto L9
        L5:
            java.lang.String r3 = r3.toString()
        L9:
            r0 = 0
            int r1 = r3.length()
            r2.write(r3, r0, r1)
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public com.alibaba.fastjson.serializer.SerializeWriter append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = "null"
        L4:
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r1 = r1.toString()
            r2 = 0
            int r3 = r1.length()
            r0.write(r1, r2, r3)
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.io.Writer append(char r1) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.io.Writer append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.io.Writer append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            java.io.Writer r0 = r3.writer
            if (r0 == 0) goto Lb
            int r0 = r3.count
            if (r0 <= 0) goto Lb
            r3.flush()
        Lb:
            char[] r0 = r3.buf
            int r1 = r0.length
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 > r2) goto L17
            java.lang.ThreadLocal<char[]> r1 = com.alibaba.fastjson.serializer.SerializeWriter.bufLocal
            r1.set(r0)
        L17:
            r0 = 0
            r3.buf = r0
            return
    }

    protected void computeFeatures() {
            r8 = this;
            int r0 = r8.features
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.QuoteFieldNames
            int r1 = r1.mask
            r1 = r1 & r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r8.quoteFieldNames = r1
            com.alibaba.fastjson.serializer.SerializerFeature r4 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes
            int r4 = r4.mask
            r4 = r4 & r0
            if (r4 == 0) goto L19
            r4 = 1
            goto L1a
        L19:
            r4 = 0
        L1a:
            r8.useSingleQuotes = r4
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.SortField
            int r5 = r5.mask
            r5 = r5 & r0
            if (r5 == 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            r8.sortField = r5
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect
            int r5 = r5.mask
            r5 = r5 & r0
            if (r5 == 0) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = 0
        L32:
            r8.disableCircularReferenceDetect = r5
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.BeanToArray
            int r5 = r5.mask
            r5 = r5 & r0
            if (r5 == 0) goto L3d
            r5 = 1
            goto L3e
        L3d:
            r5 = 0
        L3e:
            r8.beanToArray = r5
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringValueAsString
            int r6 = r6.mask
            r6 = r6 & r0
            if (r6 == 0) goto L49
            r6 = 1
            goto L4a
        L49:
            r6 = 0
        L4a:
            r8.writeNonStringValueAsString = r6
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue
            int r6 = r6.mask
            r6 = r6 & r0
            if (r6 == 0) goto L55
            r6 = 1
            goto L56
        L55:
            r6 = 0
        L56:
            r8.notWriteDefaultValue = r6
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingName
            int r6 = r6.mask
            r6 = r6 & r0
            if (r6 == 0) goto L61
            r6 = 1
            goto L62
        L61:
            r6 = 0
        L62:
            r8.writeEnumUsingName = r6
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString
            int r7 = r7.mask
            r7 = r7 & r0
            if (r7 == 0) goto L6d
            r7 = 1
            goto L6e
        L6d:
            r7 = 0
        L6e:
            r8.writeEnumUsingToString = r7
            if (r1 == 0) goto L7c
            int r1 = com.alibaba.fastjson.serializer.SerializeWriter.nonDirectFeautres
            r0 = r0 & r1
            if (r0 != 0) goto L7c
            if (r5 != 0) goto L7b
            if (r6 == 0) goto L7c
        L7b:
            r2 = 1
        L7c:
            r8.writeDirect = r2
            if (r4 == 0) goto L83
            r0 = 39
            goto L85
        L83:
            r0 = 34
        L85:
            r8.keySeperator = r0
            return
    }

    public void config(com.alibaba.fastjson.serializer.SerializerFeature r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L27
            int r4 = r2.features
            int r0 = r3.getMask()
            r4 = r4 | r0
            r2.features = r4
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString
            if (r3 != r0) goto L1a
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingName
            int r3 = r3.getMask()
            int r3 = ~r3
            r3 = r3 & r4
            r2.features = r3
            goto L31
        L1a:
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingName
            if (r3 != r1) goto L31
            int r3 = r0.getMask()
            int r3 = ~r3
            r3 = r3 & r4
            r2.features = r3
            goto L31
        L27:
            int r4 = r2.features
            int r3 = r3.getMask()
            int r3 = ~r3
            r3 = r3 & r4
            r2.features = r3
        L31:
            r2.computeFeatures()
            return
    }

    public void expandCapacity(int r4) {
            r3 = this;
            int r0 = r3.maxBufSize
            r1 = -1
            if (r0 == r1) goto L29
            if (r4 >= r0) goto L8
            goto L29
        L8:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "serialize exceeded MAX_OUTPUT_LENGTH="
            r1.append(r2)
            int r2 = r3.maxBufSize
            r1.append(r2)
            java.lang.String r2 = ", minimumCapacity="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L29:
            char[] r0 = r3.buf
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r1 = r1 + 1
            if (r1 >= r4) goto L35
            goto L36
        L35:
            r4 = r1
        L36:
            char[] r4 = new char[r4]
            int r1 = r3.count
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.buf = r4
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
            r4 = this;
            java.io.Writer r0 = r4.writer
            if (r0 != 0) goto L5
            return
        L5:
            char[] r1 = r4.buf     // Catch: java.io.IOException -> L15
            int r2 = r4.count     // Catch: java.io.IOException -> L15
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.io.IOException -> L15
            java.io.Writer r0 = r4.writer     // Catch: java.io.IOException -> L15
            r0.flush()     // Catch: java.io.IOException -> L15
            r4.count = r3
            return
        L15:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }

    public int getBufferLength() {
            r1 = this;
            char[] r0 = r1.buf
            int r0 = r0.length
            return r0
    }

    public int getMaxBufSize() {
            r1 = this;
            int r0 = r1.maxBufSize
            return r0
    }

    public boolean isEnabled(int r2) {
            r1 = this;
            int r0 = r1.features
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    public boolean isEnabled(com.alibaba.fastjson.serializer.SerializerFeature r2) {
            r1 = this;
            int r0 = r1.features
            int r2 = r2.mask
            r2 = r2 & r0
            if (r2 == 0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    public boolean isNotWriteDefaultValue() {
            r1 = this;
            boolean r0 = r1.notWriteDefaultValue
            return r0
    }

    public boolean isSortField() {
            r1 = this;
            boolean r0 = r1.sortField
            return r0
    }

    public void setMaxBufSize(int r3) {
            r2 = this;
            char[] r0 = r2.buf
            int r0 = r0.length
            if (r3 < r0) goto L8
            r2.maxBufSize = r3
            return
        L8:
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "must > "
            r0.append(r1)
            char[] r1 = r2.buf
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public int size() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    public byte[] toBytes(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L10
            java.lang.String r0 = "UTF-8"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            goto L10
        Lb:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            goto L12
        L10:
            java.nio.charset.Charset r2 = com.alibaba.fastjson.serializer.SerializeWriter.UTF8
        L12:
            byte[] r2 = r1.toBytes(r2)
            return r2
    }

    public byte[] toBytes(java.nio.charset.Charset r5) {
            r4 = this;
            java.io.Writer r0 = r4.writer
            if (r0 != 0) goto L1c
            java.nio.charset.Charset r0 = com.alibaba.fastjson.serializer.SerializeWriter.UTF8
            if (r5 != r0) goto Ld
            byte[] r5 = r4.encodeToUTF8Bytes()
            return r5
        Ld:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.buf
            r2 = 0
            int r3 = r4.count
            r0.<init>(r1, r2, r3)
            byte[] r5 = r0.getBytes(r5)
            return r5
        L1c:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "writer not null"
            r5.<init>(r0)
            throw r5
    }

    public char[] toCharArray() {
            r4 = this;
            java.io.Writer r0 = r4.writer
            if (r0 != 0) goto Lf
            int r0 = r4.count
            char[] r1 = new char[r0]
            char[] r2 = r4.buf
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
        Lf:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "writer not null"
            r0.<init>(r1)
            throw r0
    }

    public char[] toCharArrayForSpringWebSocket() {
            r5 = this;
            java.io.Writer r0 = r5.writer
            if (r0 != 0) goto L14
            int r0 = r5.count
            int r1 = r0 + (-2)
            char[] r1 = new char[r1]
            char[] r2 = r5.buf
            r3 = 0
            int r0 = r0 + (-2)
            r4 = 1
            java.lang.System.arraycopy(r2, r4, r1, r3, r0)
            return r1
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "writer not null"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.buf
            r2 = 0
            int r3 = r4.count
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.io.Writer
    public void write(int r4) {
            r3 = this;
            int r0 = r3.count
            r1 = 1
            int r0 = r0 + r1
            char[] r2 = r3.buf
            int r2 = r2.length
            if (r0 <= r2) goto L15
            java.io.Writer r2 = r3.writer
            if (r2 != 0) goto L11
            r3.expandCapacity(r0)
            goto L15
        L11:
            r3.flush()
            goto L16
        L15:
            r1 = r0
        L16:
            char[] r0 = r3.buf
            int r2 = r3.count
            char r4 = (char) r4
            r0[r2] = r4
            r3.count = r1
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            r0 = 0
            int r1 = r3.length()
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.count
            int r0 = r0 + r7
            char[] r1 = r4.buf
            int r1 = r1.length
            if (r0 <= r1) goto L2e
            java.io.Writer r1 = r4.writer
            if (r1 != 0) goto L10
            r4.expandCapacity(r0)
            goto L2e
        L10:
            char[] r0 = r4.buf
            int r1 = r0.length
            int r2 = r4.count
            int r1 = r1 - r2
            int r3 = r6 + r1
            r5.getChars(r6, r3, r0, r2)
            char[] r6 = r4.buf
            int r6 = r6.length
            r4.count = r6
            r4.flush()
            int r7 = r7 - r1
            char[] r6 = r4.buf
            int r6 = r6.length
            if (r7 > r6) goto L2c
            r0 = r7
            r6 = r3
            goto L2e
        L2c:
            r6 = r3
            goto L10
        L2e:
            int r7 = r7 + r6
            char[] r1 = r4.buf
            int r2 = r4.count
            r5.getChars(r6, r7, r1, r2)
            r4.count = r0
            return
    }

    public void write(java.util.List<java.lang.String> r14) {
            r13 = this;
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lc
            java.lang.String r14 = "[]"
            r13.write(r14)
            return
        Lc:
            int r0 = r13.count
            int r1 = r14.size()
            r2 = 0
            r4 = r0
            r3 = 0
        L15:
            r5 = 93
            if (r3 >= r1) goto Lc1
            java.lang.Object r6 = r14.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            r7 = 34
            r8 = 1
            if (r6 != 0) goto L26
            r11 = 1
            goto L4a
        L26:
            int r9 = r6.length()
            r10 = 0
            r11 = 0
        L2c:
            if (r10 >= r9) goto L4a
            char r11 = r6.charAt(r10)
            r12 = 32
            if (r11 < r12) goto L43
            r12 = 126(0x7e, float:1.77E-43)
            if (r11 > r12) goto L43
            if (r11 == r7) goto L43
            r12 = 92
            if (r11 != r12) goto L41
            goto L43
        L41:
            r11 = 0
            goto L44
        L43:
            r11 = 1
        L44:
            if (r11 == 0) goto L47
            goto L4a
        L47:
            int r10 = r10 + 1
            goto L2c
        L4a:
            r9 = 44
            r10 = 91
            if (r11 == 0) goto L79
            r13.count = r0
            r13.write(r10)
            r0 = 0
        L56:
            int r1 = r14.size()
            if (r0 >= r1) goto L75
            java.lang.Object r1 = r14.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r0 == 0) goto L67
            r13.write(r9)
        L67:
            if (r1 != 0) goto L6f
            java.lang.String r1 = "null"
            r13.write(r1)
            goto L72
        L6f:
            r13.writeStringWithDoubleQuote(r1, r2)
        L72:
            int r0 = r0 + 1
            goto L56
        L75:
            r13.write(r5)
            return
        L79:
            int r5 = r6.length()
            int r5 = r5 + r4
            int r11 = r5 + 3
            int r12 = r14.size()
            int r12 = r12 - r8
            if (r3 != r12) goto L89
            int r11 = r5 + 4
        L89:
            char[] r5 = r13.buf
            int r5 = r5.length
            if (r11 <= r5) goto L93
            r13.count = r4
            r13.expandCapacity(r11)
        L93:
            if (r3 != 0) goto L9c
            char[] r5 = r13.buf
            int r8 = r4 + 1
            r5[r4] = r10
            goto La2
        L9c:
            char[] r5 = r13.buf
            int r8 = r4 + 1
            r5[r4] = r9
        La2:
            char[] r4 = r13.buf
            int r5 = r8 + 1
            r4[r8] = r7
            int r4 = r6.length()
            char[] r8 = r13.buf
            r6.getChars(r2, r4, r8, r5)
            int r4 = r6.length()
            int r5 = r5 + r4
            char[] r4 = r13.buf
            int r6 = r5 + 1
            r4[r5] = r7
            int r3 = r3 + 1
            r4 = r6
            goto L15
        Lc1:
            char[] r14 = r13.buf
            int r0 = r4 + 1
            r14[r4] = r5
            r13.count = r0
            return
    }

    public void write(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L8
            java.lang.String r1 = "true"
            r0.write(r1)
            return
        L8:
            java.lang.String r1 = "false"
            r0.write(r1)
            return
    }

    @Override // java.io.Writer
    public void write(char[] r4, int r5, int r6) {
            r3 = this;
            if (r5 < 0) goto L44
            int r0 = r4.length
            if (r5 > r0) goto L44
            if (r6 < 0) goto L44
            int r0 = r5 + r6
            int r1 = r4.length
            if (r0 > r1) goto L44
            if (r0 < 0) goto L44
            if (r6 != 0) goto L11
            return
        L11:
            int r0 = r3.count
            int r0 = r0 + r6
            char[] r1 = r3.buf
            int r1 = r1.length
            if (r0 <= r1) goto L3a
            java.io.Writer r1 = r3.writer
            if (r1 != 0) goto L21
            r3.expandCapacity(r0)
            goto L3a
        L21:
            char[] r0 = r3.buf
            int r1 = r0.length
            int r2 = r3.count
            int r1 = r1 - r2
            java.lang.System.arraycopy(r4, r5, r0, r2, r1)
            char[] r0 = r3.buf
            int r0 = r0.length
            r3.count = r0
            r3.flush()
            int r6 = r6 - r1
            int r5 = r5 + r1
            char[] r0 = r3.buf
            int r0 = r0.length
            if (r6 > r0) goto L21
            r0 = r6
        L3a:
            char[] r1 = r3.buf
            int r2 = r3.count
            java.lang.System.arraycopy(r4, r5, r1, r2, r6)
            r3.count = r0
            return
        L44:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r4.<init>()
            throw r4
    }

    public void writeByteArray(byte[] r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            int r2 = r2.mask
            boolean r2 = r0.isEnabled(r2)
            if (r2 == 0) goto L12
            r18.writeHex(r19)
            return
        L12:
            int r2 = r1.length
            boolean r3 = r0.useSingleQuotes
            if (r3 == 0) goto L1a
            r4 = 39
            goto L1c
        L1a:
            r4 = 34
        L1c:
            if (r2 != 0) goto L29
            if (r3 == 0) goto L23
            java.lang.String r1 = "''"
            goto L25
        L23:
            java.lang.String r1 = "\"\""
        L25:
            r0.write(r1)
            return
        L29:
            char[] r3 = com.alibaba.fastjson.util.IOUtils.CA
            int r5 = r2 / 3
            int r5 = r5 * 3
            int r6 = r2 + (-1)
            int r7 = r6 / 3
            int r7 = r7 + 1
            r8 = 2
            int r7 = r7 << r8
            int r9 = r0.count
            int r7 = r7 + r9
            int r10 = r7 + 2
            char[] r11 = r0.buf
            int r11 = r11.length
            r12 = 61
            r13 = 0
            if (r10 <= r11) goto Lc2
            java.io.Writer r11 = r0.writer
            if (r11 == 0) goto Lbf
            r0.write(r4)
            r7 = 0
        L4c:
            if (r7 >= r5) goto L89
            int r9 = r7 + 1
            r10 = r1[r7]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            int r11 = r7 + 2
            r9 = r1[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            r9 = r9 | r10
            int r7 = r7 + 3
            r10 = r1[r11]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r10 = r9 >>> 18
            r10 = r10 & 63
            char r10 = r3[r10]
            r0.write(r10)
            int r10 = r9 >>> 12
            r10 = r10 & 63
            char r10 = r3[r10]
            r0.write(r10)
            int r10 = r9 >>> 6
            r10 = r10 & 63
            char r10 = r3[r10]
            r0.write(r10)
            r9 = r9 & 63
            char r9 = r3[r9]
            r0.write(r9)
            goto L4c
        L89:
            int r2 = r2 - r5
            if (r2 <= 0) goto Lbb
            r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 10
            if (r2 != r8) goto L9a
            r1 = r1[r6]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r13 = r1 << 2
        L9a:
            r1 = r5 | r13
            int r5 = r1 >> 12
            char r5 = r3[r5]
            r0.write(r5)
            int r5 = r1 >>> 6
            r5 = r5 & 63
            char r5 = r3[r5]
            r0.write(r5)
            if (r2 != r8) goto Lb3
            r1 = r1 & 63
            char r1 = r3[r1]
            goto Lb5
        Lb3:
            r1 = 61
        Lb5:
            r0.write(r1)
            r0.write(r12)
        Lbb:
            r0.write(r4)
            return
        Lbf:
            r0.expandCapacity(r10)
        Lc2:
            r0.count = r10
            char[] r10 = r0.buf
            int r11 = r9 + 1
            r10[r9] = r4
            r9 = 0
        Lcb:
            if (r9 >= r5) goto L10e
            int r10 = r9 + 1
            r14 = r1[r9]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 16
            int r15 = r9 + 2
            r10 = r1[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r10 = r10 | r14
            int r9 = r9 + 3
            r14 = r1[r15]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r10 = r10 | r14
            char[] r14 = r0.buf
            int r15 = r11 + 1
            int r16 = r10 >>> 18
            r16 = r16 & 63
            char r16 = r3[r16]
            r14[r11] = r16
            int r16 = r11 + 2
            int r17 = r10 >>> 12
            r17 = r17 & 63
            char r17 = r3[r17]
            r14[r15] = r17
            int r15 = r11 + 3
            int r17 = r10 >>> 6
            r17 = r17 & 63
            char r17 = r3[r17]
            r14[r16] = r17
            int r11 = r11 + 4
            r10 = r10 & 63
            char r10 = r3[r10]
            r14[r15] = r10
            goto Lcb
        L10e:
            int r2 = r2 - r5
            if (r2 <= 0) goto L144
            r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 10
            if (r2 != r8) goto L11f
            r1 = r1[r6]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r13 = r1 << 2
        L11f:
            r1 = r5 | r13
            char[] r5 = r0.buf
            int r6 = r7 + (-3)
            int r9 = r1 >> 12
            char r9 = r3[r9]
            r5[r6] = r9
            int r6 = r7 + (-2)
            int r9 = r1 >>> 6
            r9 = r9 & 63
            char r9 = r3[r9]
            r5[r6] = r9
            int r6 = r7 + (-1)
            if (r2 != r8) goto L13e
            r1 = r1 & 63
            char r1 = r3[r1]
            goto L140
        L13e:
            r1 = 61
        L140:
            r5[r6] = r1
            r5[r7] = r12
        L144:
            char[] r1 = r0.buf
            int r7 = r7 + 1
            r1[r7] = r4
            return
    }

    public void writeDouble(double r2, boolean r4) {
            r1 = this;
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L3f
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 == 0) goto Ld
            goto L3f
        Ld:
            java.lang.String r2 = java.lang.Double.toString(r2)
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero
            boolean r3 = r1.isEnabled(r3)
            if (r3 == 0) goto L2c
            java.lang.String r3 = ".0"
            boolean r3 = r2.endsWith(r3)
            if (r3 == 0) goto L2c
            int r3 = r2.length()
            int r3 = r3 + (-2)
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r3)
        L2c:
            r1.write(r2)
            if (r4 == 0) goto L3e
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r2 = r1.isEnabled(r2)
            if (r2 == 0) goto L3e
            r2 = 68
            r1.write(r2)
        L3e:
            return
        L3f:
            r1.writeNull()
            return
    }

    public void writeEnum(java.lang.Enum<?> r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            boolean r0 = r1.writeEnumUsingName
            if (r0 == 0) goto L13
            boolean r0 = r1.writeEnumUsingToString
            if (r0 != 0) goto L13
            java.lang.String r0 = r2.name()
            goto L1d
        L13:
            boolean r0 = r1.writeEnumUsingToString
            if (r0 == 0) goto L1c
            java.lang.String r0 = r2.toString()
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L36
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes
            boolean r2 = r1.isEnabled(r2)
            if (r2 == 0) goto L2a
            r2 = 39
            goto L2c
        L2a:
            r2 = 34
        L2c:
            r1.write(r2)
            r1.write(r0)
            r1.write(r2)
            return
        L36:
            int r2 = r2.ordinal()
            r1.writeInt(r2)
            return
    }

    public void writeFieldName(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.writeFieldName(r2, r0)
            return
    }

    public void writeFieldName(java.lang.String r6, boolean r7) {
            r5 = this;
            if (r6 != 0) goto L8
            java.lang.String r6 = "null:"
            r5.write(r6)
            return
        L8:
            boolean r7 = r5.useSingleQuotes
            r0 = 58
            if (r7 == 0) goto L1d
            boolean r7 = r5.quoteFieldNames
            if (r7 == 0) goto L19
            r5.writeStringWithSingleQuote(r6)
            r5.write(r0)
            return
        L19:
            r5.writeKeyWithSingleQuoteIfHasSpecial(r6)
            return
        L1d:
            boolean r7 = r5.quoteFieldNames
            if (r7 == 0) goto L25
            r5.writeStringWithDoubleQuote(r6, r0)
            return
        L25:
            int r7 = r6.length()
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L2f
            r7 = 1
            goto L30
        L2f:
            r7 = 0
        L30:
            r3 = 0
        L31:
            int r4 = r6.length()
            if (r3 >= r4) goto L45
            char r4 = r6.charAt(r3)
            boolean r4 = isSpecial(r4, r1)
            if (r4 == 0) goto L42
            goto L46
        L42:
            int r3 = r3 + 1
            goto L31
        L45:
            r2 = r7
        L46:
            if (r2 == 0) goto L4c
            r5.writeStringWithDoubleQuote(r6, r0)
            return
        L4c:
            r5.write(r6)
            r5.write(r0)
            return
    }

    public void writeFieldNameDirect(java.lang.String r8) {
            r7 = this;
            int r0 = r8.length()
            int r1 = r7.count
            int r1 = r1 + r0
            int r2 = r1 + 3
            char[] r3 = r7.buf
            int r3 = r3.length
            if (r2 <= r3) goto L11
            r7.expandCapacity(r2)
        L11:
            int r3 = r7.count
            int r4 = r3 + 1
            char[] r5 = r7.buf
            r6 = 34
            r5[r3] = r6
            r3 = 0
            r8.getChars(r3, r0, r5, r4)
            r7.count = r2
            char[] r8 = r7.buf
            int r0 = r1 + 1
            r8[r0] = r6
            int r1 = r1 + 2
            r0 = 58
            r8[r1] = r0
            return
    }

    public void writeFieldValue(char r1, java.lang.String r2, char r3) {
            r0 = this;
            r0.write(r1)
            r0.writeFieldName(r2)
            if (r3 != 0) goto Le
            java.lang.String r1 = "\u0000"
            r0.writeString(r1)
            return
        Le:
            java.lang.String r1 = java.lang.Character.toString(r3)
            r0.writeString(r1)
            return
    }

    public void writeFieldValue(char r1, java.lang.String r2, double r3) {
            r0 = this;
            r0.write(r1)
            r0.writeFieldName(r2)
            r1 = 0
            r0.writeDouble(r3, r1)
            return
    }

    public void writeFieldValue(char r1, java.lang.String r2, float r3) {
            r0 = this;
            r0.write(r1)
            r0.writeFieldName(r2)
            r1 = 0
            r0.writeFloat(r3, r1)
            return
    }

    public void writeFieldValue(char r6, java.lang.String r7, int r8) {
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L61
            boolean r0 = r5.quoteFieldNames
            if (r0 != 0) goto L9
            goto L61
        L9:
            if (r8 >= 0) goto L13
            int r0 = -r8
            int r0 = com.alibaba.fastjson.util.IOUtils.stringSize(r0)
            int r0 = r0 + 1
            goto L17
        L13:
            int r0 = com.alibaba.fastjson.util.IOUtils.stringSize(r8)
        L17:
            int r1 = r7.length()
            int r2 = r5.count
            int r2 = r2 + r1
            int r2 = r2 + 4
            int r2 = r2 + r0
            char[] r0 = r5.buf
            int r0 = r0.length
            if (r2 <= r0) goto L37
            java.io.Writer r0 = r5.writer
            if (r0 == 0) goto L34
            r5.write(r6)
            r5.writeFieldName(r7)
            r5.writeInt(r8)
            return
        L34:
            r5.expandCapacity(r2)
        L37:
            int r0 = r5.count
            r5.count = r2
            char[] r2 = r5.buf
            r2[r0] = r6
            int r6 = r0 + r1
            int r3 = r0 + 1
            char r4 = r5.keySeperator
            r2[r3] = r4
            r3 = 0
            int r0 = r0 + 2
            r7.getChars(r3, r1, r2, r0)
            char[] r7 = r5.buf
            int r0 = r6 + 2
            char r1 = r5.keySeperator
            r7[r0] = r1
            int r6 = r6 + 3
            r0 = 58
            r7[r6] = r0
            int r6 = r5.count
            com.alibaba.fastjson.util.IOUtils.getChars(r8, r6, r7)
            return
        L61:
            r5.write(r6)
            r5.writeFieldName(r7)
            r5.writeInt(r8)
            return
    }

    public void writeFieldValue(char r6, java.lang.String r7, long r8) {
            r5 = this;
            r0 = -9223372036854775808
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L67
            boolean r0 = r5.quoteFieldNames
            if (r0 != 0) goto Lb
            goto L67
        Lb:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L19
            long r0 = -r8
            int r0 = com.alibaba.fastjson.util.IOUtils.stringSize(r0)
            int r0 = r0 + 1
            goto L1d
        L19:
            int r0 = com.alibaba.fastjson.util.IOUtils.stringSize(r8)
        L1d:
            int r1 = r7.length()
            int r2 = r5.count
            int r2 = r2 + r1
            int r2 = r2 + 4
            int r2 = r2 + r0
            char[] r0 = r5.buf
            int r0 = r0.length
            if (r2 <= r0) goto L3d
            java.io.Writer r0 = r5.writer
            if (r0 == 0) goto L3a
            r5.write(r6)
            r5.writeFieldName(r7)
            r5.writeLong(r8)
            return
        L3a:
            r5.expandCapacity(r2)
        L3d:
            int r0 = r5.count
            r5.count = r2
            char[] r2 = r5.buf
            r2[r0] = r6
            int r6 = r0 + r1
            int r3 = r0 + 1
            char r4 = r5.keySeperator
            r2[r3] = r4
            r3 = 0
            int r0 = r0 + 2
            r7.getChars(r3, r1, r2, r0)
            char[] r7 = r5.buf
            int r0 = r6 + 2
            char r1 = r5.keySeperator
            r7[r0] = r1
            int r6 = r6 + 3
            r0 = 58
            r7[r6] = r0
            int r6 = r5.count
            com.alibaba.fastjson.util.IOUtils.getChars(r8, r6, r7)
            return
        L67:
            r5.write(r6)
            r5.writeFieldName(r7)
            r5.writeLong(r8)
            return
    }

    public void writeFieldValue(char r2, java.lang.String r3, java.lang.Enum<?> r4) {
            r1 = this;
            if (r4 != 0) goto Lc
            r1.write(r2)
            r1.writeFieldName(r3)
            r1.writeNull()
            return
        Lc:
            boolean r0 = r1.writeEnumUsingName
            if (r0 == 0) goto L1c
            boolean r0 = r1.writeEnumUsingToString
            if (r0 != 0) goto L1c
            java.lang.String r4 = r4.name()
            r1.writeEnumFieldValue(r2, r3, r4)
            return
        L1c:
            boolean r0 = r1.writeEnumUsingToString
            if (r0 == 0) goto L28
            java.lang.String r4 = r4.toString()
            r1.writeEnumFieldValue(r2, r3, r4)
            return
        L28:
            int r4 = r4.ordinal()
            r1.writeFieldValue(r2, r3, r4)
            return
    }

    public void writeFieldValue(char r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            boolean r0 = r3.quoteFieldNames
            if (r0 == 0) goto L43
            boolean r0 = r3.useSingleQuotes
            if (r0 == 0) goto L18
            r3.write(r4)
            r3.writeFieldName(r5)
            if (r6 != 0) goto L14
            r3.writeNull()
            return
        L14:
            r3.writeString(r6)
            return
        L18:
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserSecure
            boolean r0 = r3.isEnabled(r0)
            r1 = 0
            r2 = 58
            if (r0 == 0) goto L2d
            r3.write(r4)
            r3.writeStringWithDoubleQuote(r5, r2)
            r3.writeStringWithDoubleQuote(r6, r1)
            return
        L2d:
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserCompatible
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L3f
            r3.write(r4)
            r3.writeStringWithDoubleQuote(r5, r2)
            r3.writeStringWithDoubleQuote(r6, r1)
            return
        L3f:
            r3.writeFieldValueStringWithDoubleQuoteCheck(r4, r5, r6)
            return
        L43:
            r3.write(r4)
            r3.writeFieldName(r5)
            if (r6 != 0) goto L4f
            r3.writeNull()
            return
        L4f:
            r3.writeString(r6)
            return
    }

    public void writeFieldValue(char r1, java.lang.String r2, java.math.BigDecimal r3) {
            r0 = this;
            r0.write(r1)
            r0.writeFieldName(r2)
            if (r3 != 0) goto Lc
            r0.writeNull()
            return
        Lc:
            java.lang.String r1 = r3.toString()
            r0.write(r1)
            return
    }

    public void writeFieldValue(char r7, java.lang.String r8, boolean r9) {
            r6 = this;
            boolean r0 = r6.quoteFieldNames
            if (r0 != 0) goto Le
            r6.write(r7)
            r6.writeFieldName(r8)
            r6.write(r9)
            return
        Le:
            r0 = 5
            r1 = 4
            if (r9 == 0) goto L14
            r2 = 4
            goto L15
        L14:
            r2 = 5
        L15:
            int r3 = r8.length()
            int r4 = r6.count
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r4 = r4 + r2
            char[] r1 = r6.buf
            int r1 = r1.length
            if (r4 <= r1) goto L39
            java.io.Writer r1 = r6.writer
            if (r1 == 0) goto L36
            r6.write(r7)
            r6.writeString(r8)
            r7 = 58
            r6.write(r7)
            r6.write(r9)
            return
        L36:
            r6.expandCapacity(r4)
        L39:
            int r1 = r6.count
            r6.count = r4
            char[] r2 = r6.buf
            r2[r1] = r7
            int r7 = r1 + r3
            int r4 = r1 + 1
            char r5 = r6.keySeperator
            r2[r4] = r5
            int r1 = r1 + 2
            r4 = 0
            r8.getChars(r4, r3, r2, r1)
            char[] r8 = r6.buf
            int r1 = r7 + 2
            char r2 = r6.keySeperator
            r8[r1] = r2
            if (r9 == 0) goto L67
            java.lang.String r8 = ":true"
            char[] r8 = r8.toCharArray()
            char[] r9 = r6.buf
            int r7 = r7 + 3
            java.lang.System.arraycopy(r8, r4, r9, r7, r0)
            return
        L67:
            java.lang.String r8 = ":false"
            char[] r8 = r8.toCharArray()
            char[] r9 = r6.buf
            int r7 = r7 + 3
            r0 = 6
            java.lang.System.arraycopy(r8, r4, r9, r7, r0)
            return
    }

    public void writeFieldValueStringWithDoubleQuote(char r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            int r0 = r11.length()
            int r1 = r9.count
            int r2 = r12.length()
            int r3 = r0 + r2
            int r3 = r3 + 6
            int r1 = r1 + r3
            char[] r3 = r9.buf
            int r3 = r3.length
            r4 = 58
            r5 = 0
            if (r1 <= r3) goto L28
            java.io.Writer r3 = r9.writer
            if (r3 == 0) goto L25
            r9.write(r10)
            r9.writeStringWithDoubleQuote(r11, r4)
            r9.writeStringWithDoubleQuote(r12, r5)
            return
        L25:
            r9.expandCapacity(r1)
        L28:
            char[] r3 = r9.buf
            int r6 = r9.count
            r3[r6] = r10
            int r10 = r6 + 2
            int r7 = r10 + r0
            int r6 = r6 + 1
            r8 = 34
            r3[r6] = r8
            r11.getChars(r5, r0, r3, r10)
            r9.count = r1
            char[] r10 = r9.buf
            r10[r7] = r8
            int r11 = r7 + 1
            int r0 = r7 + 2
            r10[r11] = r4
            int r7 = r7 + 3
            r10[r0] = r8
            r12.getChars(r5, r2, r10, r7)
            char[] r10 = r9.buf
            int r11 = r9.count
            int r11 = r11 + (-1)
            r10[r11] = r8
            return
    }

    public void writeFieldValueStringWithDoubleQuoteCheck(char r19, java.lang.String r20, java.lang.String r21) {
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            int r3 = r1.length()
            int r4 = r0.count
            r5 = 4
            if (r2 != 0) goto L14
            int r6 = r3 + 8
            int r4 = r4 + r6
            r6 = 4
            goto L1d
        L14:
            int r6 = r2.length()
            int r7 = r3 + r6
            int r7 = r7 + 6
            int r4 = r4 + r7
        L1d:
            char[] r7 = r0.buf
            int r7 = r7.length
            r8 = 58
            r9 = 0
            if (r4 <= r7) goto L36
            java.io.Writer r7 = r0.writer
            if (r7 == 0) goto L33
            r18.write(r19)
            r0.writeStringWithDoubleQuote(r1, r8)
            r0.writeStringWithDoubleQuote(r2, r9)
            return
        L33:
            r0.expandCapacity(r4)
        L36:
            char[] r7 = r0.buf
            int r10 = r0.count
            r7[r10] = r19
            int r11 = r10 + 2
            int r12 = r11 + r3
            r13 = 1
            int r10 = r10 + r13
            r14 = 34
            r7[r10] = r14
            r1.getChars(r9, r3, r7, r11)
            r0.count = r4
            char[] r1 = r0.buf
            r1[r12] = r14
            int r3 = r12 + 1
            int r7 = r12 + 2
            r1[r3] = r8
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != 0) goto L6c
            int r2 = r12 + 3
            r4 = 110(0x6e, float:1.54E-43)
            r1[r7] = r4
            int r4 = r12 + 4
            r1[r2] = r3
            int r12 = r12 + 5
            r2 = 108(0x6c, float:1.51E-43)
            r1[r4] = r2
            r1[r12] = r2
            return
        L6c:
            int r12 = r12 + 3
            r1[r7] = r14
            int r7 = r12 + r6
            r2.getChars(r9, r6, r1, r12)
            r1 = -1
            r8 = r12
            r6 = 0
            r10 = -1
            r11 = -1
        L7a:
            r15 = 8233(0x2029, float:1.1537E-41)
            r19 = 117(0x75, float:1.64E-43)
            r3 = 8232(0x2028, float:1.1535E-41)
            if (r8 >= r7) goto Lc4
            r16 = 34
            char[] r14 = r0.buf
            char r14 = r14[r8]
            r13 = 93
            if (r14 < r13) goto La2
            r13 = 127(0x7f, float:1.78E-43)
            if (r14 < r13) goto Lbc
            if (r14 == r3) goto L98
            if (r14 == r15) goto L98
            r3 = 160(0xa0, float:2.24E-43)
            if (r14 >= r3) goto Lbc
        L98:
            if (r10 != r1) goto L9b
            r10 = r8
        L9b:
            int r9 = r9 + 1
            int r4 = r4 + 4
        L9f:
            r11 = r8
        La0:
            r6 = r14
            goto Lbc
        La2:
            int r3 = r0.features
            boolean r3 = isSpecial(r14, r3)
            if (r3 == 0) goto Lbc
            int r9 = r9 + 1
            byte[] r3 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            int r6 = r3.length
            if (r14 >= r6) goto Lb7
            r3 = r3[r14]
            if (r3 != r5) goto Lb7
            int r4 = r4 + 4
        Lb7:
            if (r10 != r1) goto L9f
            r10 = r8
            r11 = r10
            goto La0
        Lbc:
            int r8 = r8 + 1
            r3 = 117(0x75, float:1.64E-43)
            r13 = 1
            r14 = 34
            goto L7a
        Lc4:
            r16 = 34
            if (r9 <= 0) goto L233
            int r4 = r4 + r9
            char[] r1 = r0.buf
            int r1 = r1.length
            if (r4 <= r1) goto Ld1
            r0.expandCapacity(r4)
        Ld1:
            r0.count = r4
            r1 = 92
            r4 = 1
            if (r9 != r4) goto L18d
            r2 = 48
            r8 = 50
            if (r6 != r3) goto L103
            int r3 = r11 + 1
            int r5 = r11 + 6
            int r7 = r7 - r11
            int r7 = r7 - r4
            char[] r4 = r0.buf
            java.lang.System.arraycopy(r4, r3, r4, r5, r7)
            char[] r4 = r0.buf
            r4[r11] = r1
            r4[r3] = r19
            int r1 = r11 + 2
            r4[r1] = r8
            int r1 = r11 + 3
            r4[r1] = r2
            int r1 = r11 + 4
            r4[r1] = r8
            int r11 = r11 + 5
            r1 = 56
            r4[r11] = r1
            goto L233
        L103:
            if (r6 != r15) goto L12d
            int r3 = r11 + 1
            int r4 = r11 + 6
            int r7 = r7 - r11
            r17 = 1
            int r7 = r7 + (-1)
            char[] r5 = r0.buf
            java.lang.System.arraycopy(r5, r3, r5, r4, r7)
            char[] r4 = r0.buf
            r4[r11] = r1
            r4[r3] = r19
            int r1 = r11 + 2
            r4[r1] = r8
            int r1 = r11 + 3
            r4[r1] = r2
            int r1 = r11 + 4
            r4[r1] = r8
            int r11 = r11 + 5
            r1 = 57
            r4[r11] = r1
            goto L233
        L12d:
            byte[] r2 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            int r3 = r2.length
            if (r6 >= r3) goto L175
            r2 = r2[r6]
            if (r2 != r5) goto L175
            int r2 = r11 + 1
            int r3 = r11 + 6
            int r7 = r7 - r11
            r17 = 1
            int r7 = r7 + (-1)
            char[] r4 = r0.buf
            java.lang.System.arraycopy(r4, r2, r4, r3, r7)
            char[] r3 = r0.buf
            r3[r11] = r1
            int r1 = r11 + 2
            r3[r2] = r19
            int r2 = r11 + 3
            char[] r4 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r5 = r6 >>> 12
            r5 = r5 & 15
            char r5 = r4[r5]
            r3[r1] = r5
            int r1 = r11 + 4
            int r5 = r6 >>> 8
            r5 = r5 & 15
            char r5 = r4[r5]
            r3[r2] = r5
            int r11 = r11 + 5
            int r2 = r6 >>> 4
            r2 = r2 & 15
            char r2 = r4[r2]
            r3[r1] = r2
            r1 = r6 & 15
            char r1 = r4[r1]
            r3[r11] = r1
            r4 = 1
            goto L233
        L175:
            int r2 = r11 + 1
            int r3 = r11 + 2
            int r7 = r7 - r11
            r4 = 1
            int r7 = r7 - r4
            char[] r5 = r0.buf
            java.lang.System.arraycopy(r5, r2, r5, r3, r7)
            char[] r3 = r0.buf
            r3[r11] = r1
            char[] r1 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r1 = r1[r6]
            r3[r2] = r1
            goto L233
        L18d:
            if (r9 <= r4) goto L233
            int r4 = r10 - r12
        L191:
            int r6 = r2.length()
            if (r4 >= r6) goto L233
            char r6 = r2.charAt(r4)
            byte[] r7 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            int r8 = r7.length
            if (r6 >= r8) goto L1a4
            r8 = r7[r6]
            if (r8 != 0) goto L1b0
        L1a4:
            r8 = 47
            if (r6 != r8) goto L1f0
            com.alibaba.fastjson.serializer.SerializerFeature r8 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            boolean r8 = r0.isEnabled(r8)
            if (r8 == 0) goto L1f0
        L1b0:
            char[] r8 = r0.buf
            int r9 = r10 + 1
            r8[r10] = r1
            r7 = r7[r6]
            if (r7 != r5) goto L1e7
            int r7 = r10 + 2
            r8[r9] = r19
            int r9 = r10 + 3
            char[] r11 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r12 = r6 >>> 12
            r12 = r12 & 15
            char r12 = r11[r12]
            r8[r7] = r12
            int r7 = r10 + 4
            int r12 = r6 >>> 8
            r12 = r12 & 15
            char r12 = r11[r12]
            r8[r9] = r12
            int r9 = r10 + 5
            int r12 = r6 >>> 4
            r12 = r12 & 15
            char r12 = r11[r12]
            r8[r7] = r12
            int r10 = r10 + 6
            r6 = r6 & 15
            char r6 = r11[r6]
            r8[r9] = r6
            goto L22f
        L1e7:
            int r10 = r10 + 2
            char[] r7 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r6 = r7[r6]
            r8[r9] = r6
            goto L22f
        L1f0:
            if (r6 == r3) goto L1fd
            if (r6 != r15) goto L1f5
            goto L1fd
        L1f5:
            char[] r7 = r0.buf
            int r8 = r10 + 1
            r7[r10] = r6
            r10 = r8
            goto L22f
        L1fd:
            char[] r7 = r0.buf
            int r8 = r10 + 1
            r7[r10] = r1
            int r9 = r10 + 2
            r7[r8] = r19
            int r8 = r10 + 3
            char[] r11 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r12 = r6 >>> 12
            r12 = r12 & 15
            char r12 = r11[r12]
            r7[r9] = r12
            int r9 = r10 + 4
            int r12 = r6 >>> 8
            r12 = r12 & 15
            char r12 = r11[r12]
            r7[r8] = r12
            int r8 = r10 + 5
            int r12 = r6 >>> 4
            r12 = r12 & 15
            char r12 = r11[r12]
            r7[r9] = r12
            int r10 = r10 + 6
            r6 = r6 & 15
            char r6 = r11[r6]
            r7[r8] = r6
        L22f:
            int r4 = r4 + 1
            goto L191
        L233:
            char[] r1 = r0.buf
            int r2 = r0.count
            r17 = 1
            int r2 = r2 + (-1)
            r1[r2] = r16
            return
    }

    public void writeFloat(float r3, boolean r4) {
            r2 = this;
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L3f
            boolean r0 = java.lang.Float.isInfinite(r3)
            if (r0 == 0) goto Ld
            goto L3f
        Ld:
            java.lang.String r3 = java.lang.Float.toString(r3)
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero
            boolean r0 = r2.isEnabled(r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = ".0"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L2c
            int r0 = r3.length()
            int r0 = r0 + (-2)
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L2c:
            r2.write(r3)
            if (r4 == 0) goto L3e
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r3 = r2.isEnabled(r3)
            if (r3 == 0) goto L3e
            r3 = 70
            r2.write(r3)
        L3e:
            return
        L3f:
            r2.writeNull()
            return
    }

    public void writeHex(byte[] r12) {
            r11 = this;
            int r0 = r11.count
            int r1 = r12.length
            r2 = 2
            int r1 = r1 * 2
            int r0 = r0 + r1
            int r0 = r0 + 3
            char[] r1 = r11.buf
            int r1 = r1.length
            r3 = 120(0x78, float:1.68E-43)
            r4 = 0
            r5 = 55
            r6 = 48
            r7 = 10
            r8 = 39
            if (r0 <= r1) goto L63
            java.io.Writer r1 = r11.writer
            if (r1 == 0) goto L60
            int r0 = r12.length
            int r0 = r0 + 3
            char[] r0 = new char[r0]
            r0[r4] = r3
            r1 = 1
            r0[r1] = r8
        L27:
            int r1 = r12.length
            if (r4 >= r1) goto L4f
            r1 = r12[r4]
            r3 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r3 >> 4
            r1 = r1 & 15
            int r9 = r2 + 1
            if (r3 >= r7) goto L39
            r10 = 48
            goto L3b
        L39:
            r10 = 55
        L3b:
            int r3 = r3 + r10
            char r3 = (char) r3
            r0[r2] = r3
            int r2 = r2 + 2
            if (r1 >= r7) goto L46
            r3 = 48
            goto L48
        L46:
            r3 = 55
        L48:
            int r1 = r1 + r3
            char r1 = (char) r1
            r0[r9] = r1
            int r4 = r4 + 1
            goto L27
        L4f:
            r0[r2] = r8
            java.io.Writer r12 = r11.writer     // Catch: java.io.IOException -> L57
            r12.write(r0)     // Catch: java.io.IOException -> L57
            return
        L57:
            r12 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "writeBytes error."
            r0.<init>(r1, r12)
            throw r0
        L60:
            r11.expandCapacity(r0)
        L63:
            char[] r0 = r11.buf
            int r1 = r11.count
            int r9 = r1 + 1
            r11.count = r9
            r0[r1] = r3
            int r1 = r1 + r2
            r11.count = r1
            r0[r9] = r8
        L72:
            int r0 = r12.length
            if (r4 >= r0) goto La2
            r0 = r12[r4]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 >> 4
            r0 = r0 & 15
            char[] r2 = r11.buf
            int r3 = r11.count
            int r9 = r3 + 1
            r11.count = r9
            if (r1 >= r7) goto L8a
            r10 = 48
            goto L8c
        L8a:
            r10 = 55
        L8c:
            int r1 = r1 + r10
            char r1 = (char) r1
            r2[r3] = r1
            int r3 = r3 + 2
            r11.count = r3
            if (r0 >= r7) goto L99
            r1 = 48
            goto L9b
        L99:
            r1 = 55
        L9b:
            int r0 = r0 + r1
            char r0 = (char) r0
            r2[r9] = r0
            int r4 = r4 + 1
            goto L72
        La2:
            char[] r12 = r11.buf
            int r0 = r11.count
            int r1 = r0 + 1
            r11.count = r1
            r12[r0] = r8
            return
    }

    public void writeInt(int r4) {
            r3 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto La
            java.lang.String r4 = "-2147483648"
            r3.write(r4)
            return
        La:
            if (r4 >= 0) goto L14
            int r0 = -r4
            int r0 = com.alibaba.fastjson.util.IOUtils.stringSize(r0)
            int r0 = r0 + 1
            goto L18
        L14:
            int r0 = com.alibaba.fastjson.util.IOUtils.stringSize(r4)
        L18:
            int r1 = r3.count
            int r1 = r1 + r0
            char[] r2 = r3.buf
            int r2 = r2.length
            if (r1 <= r2) goto L32
            java.io.Writer r2 = r3.writer
            if (r2 != 0) goto L28
            r3.expandCapacity(r1)
            goto L32
        L28:
            char[] r1 = new char[r0]
            com.alibaba.fastjson.util.IOUtils.getChars(r4, r0, r1)
            r4 = 0
            r3.write(r1, r4, r0)
            return
        L32:
            char[] r0 = r3.buf
            com.alibaba.fastjson.util.IOUtils.getChars(r4, r1, r0)
            r3.count = r1
            return
    }

    public void writeLong(long r7) {
            r6 = this;
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserCompatible
            boolean r0 = r6.isEnabled(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L26
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r0 = r6.isEnabled(r0)
            if (r0 != 0) goto L26
            r3 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto L24
            r3 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L26
        L24:
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 != 0) goto L3b
            if (r0 == 0) goto L35
            java.lang.String r7 = "\"-9223372036854775808\""
            r6.write(r7)
            return
        L35:
            java.lang.String r7 = "-9223372036854775808"
            r6.write(r7)
            return
        L3b:
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L48
            long r3 = -r7
            int r3 = com.alibaba.fastjson.util.IOUtils.stringSize(r3)
            int r3 = r3 + r2
            goto L4c
        L48:
            int r3 = com.alibaba.fastjson.util.IOUtils.stringSize(r7)
        L4c:
            int r2 = r6.count
            int r2 = r2 + r3
            if (r0 == 0) goto L53
            int r2 = r2 + 2
        L53:
            char[] r4 = r6.buf
            int r4 = r4.length
            r5 = 34
            if (r2 <= r4) goto L77
            java.io.Writer r4 = r6.writer
            if (r4 != 0) goto L62
            r6.expandCapacity(r2)
            goto L77
        L62:
            char[] r2 = new char[r3]
            com.alibaba.fastjson.util.IOUtils.getChars(r7, r3, r2)
            if (r0 == 0) goto L73
            r6.write(r5)
            r6.write(r2, r1, r3)
            r6.write(r5)
            return
        L73:
            r6.write(r2, r1, r3)
            return
        L77:
            if (r0 == 0) goto L89
            char[] r0 = r6.buf
            int r1 = r6.count
            r0[r1] = r5
            int r1 = r2 + (-1)
            com.alibaba.fastjson.util.IOUtils.getChars(r7, r1, r0)
            char[] r7 = r6.buf
            r7[r1] = r5
            goto L8e
        L89:
            char[] r0 = r6.buf
            com.alibaba.fastjson.util.IOUtils.getChars(r7, r2, r0)
        L8e:
            r6.count = r2
            return
    }

    public void writeNull() {
            r1 = this;
            java.lang.String r0 = "null"
            r1.write(r0)
            return
    }

    public void writeNull(int r1, int r2) {
            r0 = this;
            r1 = r1 & r2
            if (r1 != 0) goto Lc
            int r1 = r0.features
            r1 = r1 & r2
            if (r1 != 0) goto Lc
            r0.writeNull()
            return
        Lc:
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            int r1 = r1.mask
            if (r2 != r1) goto L18
            java.lang.String r1 = "[]"
            r0.write(r1)
            return
        L18:
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty
            int r1 = r1.mask
            if (r2 != r1) goto L24
            java.lang.String r1 = ""
            r0.writeString(r1)
            return
        L24:
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullBooleanAsFalse
            int r1 = r1.mask
            if (r2 != r1) goto L30
            java.lang.String r1 = "false"
            r0.write(r1)
            return
        L30:
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero
            int r1 = r1.mask
            if (r2 != r1) goto L3c
            r1 = 48
            r0.write(r1)
            return
        L3c:
            r0.writeNull()
            return
    }

    public void writeNull(com.alibaba.fastjson.serializer.SerializerFeature r2) {
            r1 = this;
            r0 = 0
            int r2 = r2.mask
            r1.writeNull(r0, r2)
            return
    }

    public void writeString(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.useSingleQuotes
            if (r0 == 0) goto L8
            r1.writeStringWithSingleQuote(r2)
            return
        L8:
            r0 = 0
            r1.writeStringWithDoubleQuote(r2, r0)
            return
    }

    public void writeString(java.lang.String r2, char r3) {
            r1 = this;
            boolean r0 = r1.useSingleQuotes
            if (r0 == 0) goto Lb
            r1.writeStringWithSingleQuote(r2)
            r1.write(r3)
            return
        Lb:
            r1.writeStringWithDoubleQuote(r2, r3)
            return
    }

    public void writeStringWithDoubleQuote(java.lang.String r21, char r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            if (r1 != 0) goto L11
            r0.writeNull()
            if (r2 == 0) goto L179
            r0.write(r2)
            return
        L11:
            int r3 = r1.length()
            int r4 = r0.count
            int r4 = r4 + r3
            int r5 = r4 + 2
            if (r2 == 0) goto L1e
            int r5 = r4 + 3
        L1e:
            char[] r4 = r0.buf
            int r4 = r4.length
            r6 = 65
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 97
            r10 = 57
            r13 = 48
            r14 = 8
            r11 = 117(0x75, float:1.64E-43)
            r9 = 34
            r12 = 92
            if (r5 <= r4) goto L180
            java.io.Writer r4 = r0.writer
            if (r4 == 0) goto L17a
            r0.write(r9)
            r3 = 0
        L3d:
            int r4 = r1.length()
            if (r3 >= r4) goto L171
            char r4 = r1.charAt(r3)
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserSecure
            boolean r5 = r0.isEnabled(r5)
            if (r5 == 0) goto L9c
            if (r4 < r13) goto L58
            if (r4 <= r10) goto L54
            goto L58
        L54:
            r18 = 1
            goto L16a
        L58:
            if (r4 < r8) goto L5c
            if (r4 <= r7) goto L54
        L5c:
            if (r4 < r6) goto L62
            r5 = 90
            if (r4 <= r5) goto L54
        L62:
            r5 = 44
            if (r4 == r5) goto L54
            r5 = 46
            if (r4 == r5) goto L54
            r5 = 95
            if (r4 == r5) goto L54
            r0.write(r12)
            r0.write(r11)
            char[] r5 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r16 = r4 >>> 12
            r16 = r16 & 15
            r18 = 1
            char r15 = r5[r16]
            r0.write(r15)
            int r15 = r4 >>> 8
            r15 = r15 & 15
            char r15 = r5[r15]
            r0.write(r15)
            int r15 = r4 >>> 4
            r15 = r15 & 15
            char r15 = r5[r15]
            r0.write(r15)
            r4 = r4 & 15
            char r4 = r5[r4]
            r0.write(r4)
            goto L16d
        L9c:
            r18 = 1
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserCompatible
            boolean r5 = r0.isEnabled(r5)
            if (r5 == 0) goto L11d
            if (r4 == r14) goto L112
            r5 = 12
            if (r4 == r5) goto L112
            r5 = 10
            if (r4 == r5) goto L112
            r5 = 13
            if (r4 == r5) goto L112
            r5 = 9
            if (r4 == r5) goto L112
            if (r4 == r9) goto L112
            r5 = 47
            if (r4 == r5) goto L112
            if (r4 != r12) goto Lc1
            goto L112
        Lc1:
            r5 = 32
            if (r4 >= r5) goto Le3
            r0.write(r12)
            r0.write(r11)
            r0.write(r13)
            r0.write(r13)
            char[] r5 = com.alibaba.fastjson.util.IOUtils.ASCII_CHARS
            int r4 = r4 * 2
            char r15 = r5[r4]
            r0.write(r15)
            int r4 = r4 + 1
            char r4 = r5[r4]
            r0.write(r4)
            goto L16d
        Le3:
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 < r5) goto L16a
            r0.write(r12)
            r0.write(r11)
            char[] r5 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r15 = r4 >>> 12
            r15 = r15 & 15
            char r15 = r5[r15]
            r0.write(r15)
            int r15 = r4 >>> 8
            r15 = r15 & 15
            char r15 = r5[r15]
            r0.write(r15)
            int r15 = r4 >>> 4
            r15 = r15 & 15
            char r15 = r5[r15]
            r0.write(r15)
            r4 = r4 & 15
            char r4 = r5[r4]
            r0.write(r4)
            goto L16d
        L112:
            r0.write(r12)
            char[] r5 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r4 = r5[r4]
            r0.write(r4)
            goto L16d
        L11d:
            byte[] r5 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            int r15 = r5.length
            if (r4 >= r15) goto L126
            r15 = r5[r4]
            if (r15 != 0) goto L132
        L126:
            r15 = 47
            if (r4 != r15) goto L16a
            com.alibaba.fastjson.serializer.SerializerFeature r15 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            boolean r15 = r0.isEnabled(r15)
            if (r15 == 0) goto L16a
        L132:
            r0.write(r12)
            r5 = r5[r4]
            r15 = 4
            if (r5 != r15) goto L162
            r0.write(r11)
            char[] r5 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r15 = r4 >>> 12
            r15 = r15 & 15
            char r15 = r5[r15]
            r0.write(r15)
            int r15 = r4 >>> 8
            r15 = r15 & 15
            char r15 = r5[r15]
            r0.write(r15)
            int r15 = r4 >>> 4
            r15 = r15 & 15
            char r15 = r5[r15]
            r0.write(r15)
            r4 = r4 & 15
            char r4 = r5[r4]
            r0.write(r4)
            goto L16d
        L162:
            char[] r5 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r4 = r5[r4]
            r0.write(r4)
            goto L16d
        L16a:
            r0.write(r4)
        L16d:
            int r3 = r3 + 1
            goto L3d
        L171:
            r0.write(r9)
            if (r2 == 0) goto L179
            r0.write(r2)
        L179:
            return
        L17a:
            r18 = 1
            r0.expandCapacity(r5)
            goto L182
        L180:
            r18 = 1
        L182:
            int r4 = r0.count
            int r15 = r4 + 1
            r19 = 117(0x75, float:1.64E-43)
            int r11 = r15 + r3
            char[] r14 = r0.buf
            r14[r4] = r9
            r4 = 0
            r1.getChars(r4, r3, r14, r15)
            r0.count = r5
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserSecure
            boolean r3 = r0.isEnabled(r3)
            r14 = -1
            if (r3 == 0) goto L246
            r1 = r15
        L19e:
            if (r1 >= r11) goto L1c4
            char[] r3 = r0.buf
            char r3 = r3[r1]
            if (r3 < r13) goto L1a8
            if (r3 <= r10) goto L1c1
        L1a8:
            if (r3 < r8) goto L1ac
            if (r3 <= r7) goto L1c1
        L1ac:
            if (r3 < r6) goto L1b2
            r4 = 90
            if (r3 <= r4) goto L1c1
        L1b2:
            r4 = 44
            if (r3 == r4) goto L1c1
            r4 = 46
            if (r3 == r4) goto L1c1
            r4 = 95
            if (r3 == r4) goto L1c1
            int r5 = r5 + 5
            r14 = r1
        L1c1:
            int r1 = r1 + 1
            goto L19e
        L1c4:
            char[] r1 = r0.buf
            int r1 = r1.length
            if (r5 <= r1) goto L1cc
            r0.expandCapacity(r5)
        L1cc:
            r0.count = r5
        L1ce:
            if (r14 < r15) goto L22e
            char[] r1 = r0.buf
            char r3 = r1[r14]
            if (r3 < r13) goto L1d8
            if (r3 <= r10) goto L229
        L1d8:
            if (r3 < r8) goto L1dc
            if (r3 <= r7) goto L229
        L1dc:
            if (r3 < r6) goto L1e2
            r4 = 90
            if (r3 <= r4) goto L229
        L1e2:
            r4 = 44
            if (r3 == r4) goto L229
            r4 = 46
            if (r3 == r4) goto L229
            r4 = 95
            if (r3 == r4) goto L229
            int r4 = r14 + 1
            int r5 = r14 + 6
            int r16 = r11 - r14
            int r6 = r16 + (-1)
            java.lang.System.arraycopy(r1, r4, r1, r5, r6)
            char[] r1 = r0.buf
            r1[r14] = r12
            r1[r4] = r19
            int r4 = r14 + 2
            char[] r5 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r6 = r3 >>> 12
            r6 = r6 & 15
            char r6 = r5[r6]
            r1[r4] = r6
            int r4 = r14 + 3
            int r6 = r3 >>> 8
            r6 = r6 & 15
            char r6 = r5[r6]
            r1[r4] = r6
            int r4 = r14 + 4
            int r6 = r3 >>> 4
            r6 = r6 & 15
            char r6 = r5[r6]
            r1[r4] = r6
            int r4 = r14 + 5
            r3 = r3 & 15
            char r3 = r5[r3]
            r1[r4] = r3
            int r11 = r11 + 5
        L229:
            int r14 = r14 + (-1)
            r6 = 65
            goto L1ce
        L22e:
            if (r2 == 0) goto L23d
            char[] r1 = r0.buf
            int r3 = r0.count
            int r4 = r3 + (-2)
            r1[r4] = r9
            int r3 = r3 + (-1)
            r1[r3] = r2
            return
        L23d:
            char[] r1 = r0.buf
            int r2 = r0.count
            int r2 = r2 + (-1)
            r1[r2] = r9
            return
        L246:
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserCompatible
            boolean r3 = r0.isEnabled(r3)
            if (r3 == 0) goto L36b
            r1 = r15
        L24f:
            if (r1 >= r11) goto L286
            char[] r3 = r0.buf
            char r3 = r3[r1]
            if (r3 == r9) goto L280
            r4 = 47
            if (r3 == r4) goto L280
            if (r3 != r12) goto L25e
            goto L280
        L25e:
            r4 = 8
            if (r3 == r4) goto L280
            r4 = 12
            if (r3 == r4) goto L280
            r4 = 10
            if (r3 == r4) goto L280
            r4 = 13
            if (r3 == r4) goto L280
            r4 = 9
            if (r3 != r4) goto L273
            goto L280
        L273:
            r4 = 32
            if (r3 >= r4) goto L27b
        L277:
            int r5 = r5 + 5
        L279:
            r14 = r1
            goto L283
        L27b:
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 < r4) goto L283
            goto L277
        L280:
            int r5 = r5 + 1
            goto L279
        L283:
            int r1 = r1 + 1
            goto L24f
        L286:
            char[] r1 = r0.buf
            int r1 = r1.length
            if (r5 <= r1) goto L28e
            r0.expandCapacity(r5)
        L28e:
            r0.count = r5
        L290:
            if (r14 < r15) goto L353
            char[] r1 = r0.buf
            char r3 = r1[r14]
            r4 = 8
            r5 = 12
            if (r3 == r4) goto L339
            if (r3 == r5) goto L339
            r6 = 10
            if (r3 == r6) goto L339
            r6 = 13
            if (r3 == r6) goto L339
            r6 = 9
            if (r3 != r6) goto L2ac
            goto L339
        L2ac:
            if (r3 == r9) goto L325
            r6 = 47
            if (r3 == r6) goto L325
            if (r3 != r12) goto L2b5
            goto L325
        L2b5:
            r6 = 32
            if (r3 >= r6) goto L2e7
            int r6 = r14 + 1
            int r7 = r14 + 6
            int r8 = r11 - r14
            int r8 = r8 + (-1)
            java.lang.System.arraycopy(r1, r6, r1, r7, r8)
            char[] r1 = r0.buf
            r1[r14] = r12
            r1[r6] = r19
            int r6 = r14 + 2
            r1[r6] = r13
            int r6 = r14 + 3
            r1[r6] = r13
            int r6 = r14 + 4
            char[] r7 = com.alibaba.fastjson.util.IOUtils.ASCII_CHARS
            int r3 = r3 * 2
            char r8 = r7[r3]
            r1[r6] = r8
            int r6 = r14 + 5
            int r3 = r3 + 1
            char r3 = r7[r3]
            r1[r6] = r3
        L2e4:
            int r11 = r11 + 5
            goto L34f
        L2e7:
            r6 = 127(0x7f, float:1.78E-43)
            if (r3 < r6) goto L34f
            int r6 = r14 + 1
            int r7 = r14 + 6
            int r8 = r11 - r14
            int r8 = r8 + (-1)
            java.lang.System.arraycopy(r1, r6, r1, r7, r8)
            char[] r1 = r0.buf
            r1[r14] = r12
            r1[r6] = r19
            int r6 = r14 + 2
            char[] r7 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r8 = r3 >>> 12
            r8 = r8 & 15
            char r8 = r7[r8]
            r1[r6] = r8
            int r6 = r14 + 3
            int r8 = r3 >>> 8
            r8 = r8 & 15
            char r8 = r7[r8]
            r1[r6] = r8
            int r6 = r14 + 4
            int r8 = r3 >>> 4
            r8 = r8 & 15
            char r8 = r7[r8]
            r1[r6] = r8
            int r6 = r14 + 5
            r3 = r3 & 15
            char r3 = r7[r3]
            r1[r6] = r3
            goto L2e4
        L325:
            int r6 = r14 + 1
            int r7 = r14 + 2
            int r8 = r11 - r14
            int r8 = r8 + (-1)
            java.lang.System.arraycopy(r1, r6, r1, r7, r8)
            char[] r1 = r0.buf
            r1[r14] = r12
            r1[r6] = r3
        L336:
            int r11 = r11 + 1
            goto L34f
        L339:
            int r6 = r14 + 1
            int r7 = r14 + 2
            int r8 = r11 - r14
            int r8 = r8 + (-1)
            java.lang.System.arraycopy(r1, r6, r1, r7, r8)
            char[] r1 = r0.buf
            r1[r14] = r12
            char[] r7 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r3 = r7[r3]
            r1[r6] = r3
            goto L336
        L34f:
            int r14 = r14 + (-1)
            goto L290
        L353:
            if (r2 == 0) goto L362
            char[] r1 = r0.buf
            int r3 = r0.count
            int r4 = r3 + (-2)
            r1[r4] = r9
            int r3 = r3 + (-1)
            r1[r3] = r2
            return
        L362:
            char[] r1 = r0.buf
            int r2 = r0.count
            int r2 = r2 + (-1)
            r1[r2] = r9
            return
        L36b:
            r6 = r15
            r3 = 0
            r7 = -1
            r8 = -1
        L36f:
            if (r6 >= r11) goto L3c1
            r16 = 34
            char[] r9 = r0.buf
            char r9 = r9[r6]
            r17 = 57
            r10 = 8232(0x2028, float:1.1535E-41)
            if (r9 == r10) goto L3b3
            r10 = 8233(0x2029, float:1.1537E-41)
            if (r9 != r10) goto L382
            goto L3b3
        L382:
            r10 = 93
            if (r9 < r10) goto L398
            r10 = 127(0x7f, float:1.78E-43)
            if (r9 < r10) goto L3ba
            r10 = 160(0xa0, float:2.24E-43)
            if (r9 >= r10) goto L3ba
            if (r7 != r14) goto L391
            r7 = r6
        L391:
            int r4 = r4 + 1
            int r5 = r5 + 4
        L395:
            r8 = r6
        L396:
            r3 = r9
            goto L3ba
        L398:
            int r10 = r0.features
            boolean r10 = isSpecial(r9, r10)
            if (r10 == 0) goto L3ba
            int r4 = r4 + 1
            byte[] r3 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            int r8 = r3.length
            if (r9 >= r8) goto L3ae
            r3 = r3[r9]
            r8 = 4
            if (r3 != r8) goto L3ae
            int r5 = r5 + 4
        L3ae:
            if (r7 != r14) goto L395
        L3b0:
            r7 = r6
            r8 = r7
            goto L396
        L3b3:
            int r4 = r4 + 1
            int r5 = r5 + 4
            if (r7 != r14) goto L395
            goto L3b0
        L3ba:
            int r6 = r6 + 1
            r9 = 34
            r10 = 57
            goto L36f
        L3c1:
            r16 = 34
            r17 = 57
            if (r4 <= 0) goto L53b
            int r5 = r5 + r4
            char[] r6 = r0.buf
            int r6 = r6.length
            if (r5 <= r6) goto L3d0
            r0.expandCapacity(r5)
        L3d0:
            r0.count = r5
            r5 = 1
            if (r4 != r5) goto L48b
            r1 = 8232(0x2028, float:1.1535E-41)
            r4 = 50
            if (r3 != r1) goto L400
            int r1 = r8 + 1
            int r3 = r8 + 6
            int r11 = r11 - r8
            int r11 = r11 - r5
            char[] r5 = r0.buf
            java.lang.System.arraycopy(r5, r1, r5, r3, r11)
            char[] r3 = r0.buf
            r3[r8] = r12
            r3[r1] = r19
            int r1 = r8 + 2
            r3[r1] = r4
            int r1 = r8 + 3
            r3[r1] = r13
            int r1 = r8 + 4
            r3[r1] = r4
            int r8 = r8 + 5
            r1 = 56
            r3[r8] = r1
            goto L53b
        L400:
            r1 = 8233(0x2029, float:1.1537E-41)
            if (r3 != r1) goto L42a
            int r1 = r8 + 1
            int r3 = r8 + 6
            int r11 = r11 - r8
            r18 = 1
            int r11 = r11 + (-1)
            char[] r5 = r0.buf
            java.lang.System.arraycopy(r5, r1, r5, r3, r11)
            char[] r3 = r0.buf
            r3[r8] = r12
            r3[r1] = r19
            int r1 = r8 + 2
            r3[r1] = r4
            int r1 = r8 + 3
            r3[r1] = r13
            int r1 = r8 + 4
            r3[r1] = r4
            int r8 = r8 + 5
            r3[r8] = r17
            goto L53b
        L42a:
            byte[] r1 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            int r4 = r1.length
            if (r3 >= r4) goto L473
            r1 = r1[r3]
            r15 = 4
            if (r1 != r15) goto L473
            int r1 = r8 + 1
            int r4 = r8 + 6
            int r11 = r11 - r8
            r18 = 1
            int r11 = r11 + (-1)
            char[] r5 = r0.buf
            java.lang.System.arraycopy(r5, r1, r5, r4, r11)
            char[] r4 = r0.buf
            r4[r8] = r12
            int r5 = r8 + 2
            r4[r1] = r19
            int r1 = r8 + 3
            char[] r6 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r7 = r3 >>> 12
            r7 = r7 & 15
            char r7 = r6[r7]
            r4[r5] = r7
            int r5 = r8 + 4
            int r7 = r3 >>> 8
            r7 = r7 & 15
            char r7 = r6[r7]
            r4[r1] = r7
            int r8 = r8 + 5
            int r1 = r3 >>> 4
            r1 = r1 & 15
            char r1 = r6[r1]
            r4[r5] = r1
            r1 = r3 & 15
            char r1 = r6[r1]
            r4[r8] = r1
            r5 = 1
            goto L53b
        L473:
            int r1 = r8 + 1
            int r4 = r8 + 2
            int r11 = r11 - r8
            r5 = 1
            int r11 = r11 - r5
            char[] r6 = r0.buf
            java.lang.System.arraycopy(r6, r1, r6, r4, r11)
            char[] r4 = r0.buf
            r4[r8] = r12
            char[] r6 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r3 = r6[r3]
            r4[r1] = r3
            goto L53b
        L48b:
            if (r4 <= r5) goto L53b
            int r3 = r7 - r15
        L48f:
            int r4 = r1.length()
            if (r3 >= r4) goto L53b
            char r4 = r1.charAt(r3)
            byte[] r5 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            int r6 = r5.length
            if (r4 >= r6) goto L4a2
            r6 = r5[r4]
            if (r6 != 0) goto L4a5
        L4a2:
            r15 = 47
            goto L4a8
        L4a5:
            r15 = 47
            goto L4b2
        L4a8:
            if (r4 != r15) goto L4f3
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            boolean r6 = r0.isEnabled(r6)
            if (r6 == 0) goto L4f3
        L4b2:
            char[] r6 = r0.buf
            int r8 = r7 + 1
            r6[r7] = r12
            r5 = r5[r4]
            r9 = 4
            if (r5 != r9) goto L4ea
            int r5 = r7 + 2
            r6[r8] = r19
            int r8 = r7 + 3
            char[] r10 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r11 = r4 >>> 12
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r5] = r11
            int r5 = r7 + 4
            int r11 = r4 >>> 8
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r8] = r11
            int r8 = r7 + 5
            int r11 = r4 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r5] = r11
            int r7 = r7 + 6
            r4 = r4 & 15
            char r4 = r10[r4]
            r6[r8] = r4
            goto L537
        L4ea:
            int r7 = r7 + 2
            char[] r5 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r4 = r5[r4]
            r6[r8] = r4
            goto L537
        L4f3:
            r9 = 4
            r5 = 8232(0x2028, float:1.1535E-41)
            if (r4 == r5) goto L505
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 != r5) goto L4fd
            goto L505
        L4fd:
            char[] r5 = r0.buf
            int r6 = r7 + 1
            r5[r7] = r4
            r7 = r6
            goto L537
        L505:
            char[] r5 = r0.buf
            int r6 = r7 + 1
            r5[r7] = r12
            int r8 = r7 + 2
            r5[r6] = r19
            int r6 = r7 + 3
            char[] r10 = com.alibaba.fastjson.util.IOUtils.DIGITS
            int r11 = r4 >>> 12
            r11 = r11 & 15
            char r11 = r10[r11]
            r5[r8] = r11
            int r8 = r7 + 4
            int r11 = r4 >>> 8
            r11 = r11 & 15
            char r11 = r10[r11]
            r5[r6] = r11
            int r6 = r7 + 5
            int r11 = r4 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r5[r8] = r11
            int r7 = r7 + 6
            r4 = r4 & 15
            char r4 = r10[r4]
            r5[r6] = r4
        L537:
            int r3 = r3 + 1
            goto L48f
        L53b:
            if (r2 == 0) goto L54c
            char[] r1 = r0.buf
            int r3 = r0.count
            int r4 = r3 + (-2)
            r1[r4] = r16
            r18 = 1
            int r3 = r3 + (-1)
            r1[r3] = r2
            return
        L54c:
            r18 = 1
            char[] r1 = r0.buf
            int r2 = r0.count
            int r2 = r2 + (-1)
            r1[r2] = r16
            return
    }

    protected void writeStringWithSingleQuote(java.lang.String r14) {
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L1b
            int r14 = r13.count
            r1 = 4
            int r14 = r14 + r1
            char[] r2 = r13.buf
            int r2 = r2.length
            if (r14 <= r2) goto Lf
            r13.expandCapacity(r14)
        Lf:
            char[] r2 = r13.buf
            int r3 = r13.count
            java.lang.String r4 = "null"
            r4.getChars(r0, r1, r2, r3)
            r13.count = r14
            return
        L1b:
            int r1 = r14.length()
            int r2 = r13.count
            int r2 = r2 + r1
            int r2 = r2 + 2
            char[] r3 = r13.buf
            int r3 = r3.length
            r4 = 47
            r5 = 13
            r6 = 92
            r7 = 39
            if (r2 <= r3) goto L6b
            java.io.Writer r3 = r13.writer
            if (r3 == 0) goto L68
            r13.write(r7)
        L38:
            int r1 = r14.length()
            if (r0 >= r1) goto L64
            char r1 = r14.charAt(r0)
            if (r1 <= r5) goto L57
            if (r1 == r6) goto L57
            if (r1 == r7) goto L57
            if (r1 != r4) goto L53
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            boolean r2 = r13.isEnabled(r2)
            if (r2 == 0) goto L53
            goto L57
        L53:
            r13.write(r1)
            goto L61
        L57:
            r13.write(r6)
            char[] r2 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r1 = r2[r1]
            r13.write(r1)
        L61:
            int r0 = r0 + 1
            goto L38
        L64:
            r13.write(r7)
            return
        L68:
            r13.expandCapacity(r2)
        L6b:
            int r3 = r13.count
            int r8 = r3 + 1
            int r9 = r8 + r1
            char[] r10 = r13.buf
            r10[r3] = r7
            r14.getChars(r0, r1, r10, r8)
            r13.count = r2
            r14 = -1
            r3 = r8
            r1 = 0
            r10 = -1
        L7e:
            if (r3 >= r9) goto L9b
            char[] r11 = r13.buf
            char r11 = r11[r3]
            if (r11 <= r5) goto L94
            if (r11 == r6) goto L94
            if (r11 == r7) goto L94
            if (r11 != r4) goto L98
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            boolean r12 = r13.isEnabled(r12)
            if (r12 == 0) goto L98
        L94:
            int r0 = r0 + 1
            r10 = r3
            r1 = r11
        L98:
            int r3 = r3 + 1
            goto L7e
        L9b:
            int r2 = r2 + r0
            char[] r3 = r13.buf
            int r3 = r3.length
            if (r2 <= r3) goto La4
            r13.expandCapacity(r2)
        La4:
            r13.count = r2
            r2 = 1
            if (r0 != r2) goto Lbf
            char[] r14 = r13.buf
            int r0 = r10 + 1
            int r3 = r10 + 2
            int r9 = r9 - r10
            int r9 = r9 - r2
            java.lang.System.arraycopy(r14, r0, r14, r3, r9)
            char[] r14 = r13.buf
            r14[r10] = r6
            char[] r3 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r1 = r3[r1]
            r14[r0] = r1
            goto L10a
        Lbf:
            if (r0 <= r2) goto L10a
            char[] r0 = r13.buf
            int r3 = r10 + 1
            int r11 = r10 + 2
            int r12 = r9 - r10
            int r12 = r12 - r2
            java.lang.System.arraycopy(r0, r3, r0, r11, r12)
            char[] r0 = r13.buf
            r0[r10] = r6
            char[] r11 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r1 = r11[r1]
            r0[r3] = r1
            int r9 = r9 + r2
            int r10 = r10 + r14
        Ld9:
            if (r10 < r8) goto L10a
            char[] r14 = r13.buf
            char r14 = r14[r10]
            if (r14 <= r5) goto Lef
            if (r14 == r6) goto Lef
            if (r14 == r7) goto Lef
            if (r14 != r4) goto L107
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            boolean r0 = r13.isEnabled(r0)
            if (r0 == 0) goto L107
        Lef:
            char[] r0 = r13.buf
            int r1 = r10 + 1
            int r3 = r10 + 2
            int r11 = r9 - r10
            int r11 = r11 - r2
            java.lang.System.arraycopy(r0, r1, r0, r3, r11)
            char[] r0 = r13.buf
            r0[r10] = r6
            char[] r3 = com.alibaba.fastjson.util.IOUtils.replaceChars
            char r14 = r3[r14]
            r0[r1] = r14
            int r9 = r9 + 1
        L107:
            int r10 = r10 + (-1)
            goto Ld9
        L10a:
            char[] r14 = r13.buf
            int r0 = r13.count
            int r0 = r0 - r2
            r14[r0] = r7
            return
    }

    public void writeTo(java.io.OutputStream r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r0.writeTo(r1, r2)
            return
    }

    public void writeTo(java.io.OutputStream r1, java.nio.charset.Charset r2) throws java.io.IOException {
            r0 = this;
            r0.writeToEx(r1, r2)
            return
    }

    public void writeTo(java.io.Writer r4) throws java.io.IOException {
            r3 = this;
            java.io.Writer r0 = r3.writer
            if (r0 != 0) goto Ld
            char[] r0 = r3.buf
            r1 = 0
            int r2 = r3.count
            r4.write(r0, r1, r2)
            return
        Ld:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "writer not null"
            r4.<init>(r0)
            throw r4
    }

    public int writeToEx(java.io.OutputStream r5, java.nio.charset.Charset r6) throws java.io.IOException {
            r4 = this;
            java.io.Writer r0 = r4.writer
            if (r0 != 0) goto L20
            java.nio.charset.Charset r0 = com.alibaba.fastjson.serializer.SerializeWriter.UTF8
            if (r6 != r0) goto Ld
            int r5 = r4.encodeToUTF8(r5)
            return r5
        Ld:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.buf
            r2 = 0
            int r3 = r4.count
            r0.<init>(r1, r2, r3)
            byte[] r6 = r0.getBytes(r6)
            r5.write(r6)
            int r5 = r6.length
            return r5
        L20:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "writer not null"
            r5.<init>(r6)
            throw r5
    }
}
