package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class AsciiString implements java.lang.CharSequence, java.lang.Comparable<java.lang.CharSequence> {
    public static final io.netty.util.HashingStrategy<java.lang.CharSequence> CASE_INSENSITIVE_HASHER = null;
    public static final io.netty.util.HashingStrategy<java.lang.CharSequence> CASE_SENSITIVE_HASHER = null;
    public static final io.netty.util.AsciiString EMPTY_STRING = null;
    public static final int INDEX_NOT_FOUND = -1;
    private static final char MAX_CHAR_VALUE = 255;
    private int hash;
    private final int length;
    private final int offset;
    private java.lang.String string;
    private final byte[] value;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AsciiCaseInsensitiveCharEqualityComparator implements io.netty.util.AsciiString.CharEqualityComparator {
        static final io.netty.util.AsciiString.AsciiCaseInsensitiveCharEqualityComparator INSTANCE = null;

        static {
                io.netty.util.AsciiString$AsciiCaseInsensitiveCharEqualityComparator r0 = new io.netty.util.AsciiString$AsciiCaseInsensitiveCharEqualityComparator
                r0.<init>()
                io.netty.util.AsciiString.AsciiCaseInsensitiveCharEqualityComparator.INSTANCE = r0
                return
        }

        private AsciiCaseInsensitiveCharEqualityComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.netty.util.AsciiString.CharEqualityComparator
        public boolean equals(char r1, char r2) {
                r0 = this;
                boolean r1 = io.netty.util.AsciiString.access$000(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface CharEqualityComparator {
        boolean equals(char r1, char r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultCharEqualityComparator implements io.netty.util.AsciiString.CharEqualityComparator {
        static final io.netty.util.AsciiString.DefaultCharEqualityComparator INSTANCE = null;

        static {
                io.netty.util.AsciiString$DefaultCharEqualityComparator r0 = new io.netty.util.AsciiString$DefaultCharEqualityComparator
                r0.<init>()
                io.netty.util.AsciiString.DefaultCharEqualityComparator.INSTANCE = r0
                return
        }

        private DefaultCharEqualityComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.netty.util.AsciiString.CharEqualityComparator
        public boolean equals(char r1, char r2) {
                r0 = this;
                if (r1 != r2) goto L4
                r1 = 1
                return r1
            L4:
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class GeneralCaseInsensitiveCharEqualityComparator implements io.netty.util.AsciiString.CharEqualityComparator {
        static final io.netty.util.AsciiString.GeneralCaseInsensitiveCharEqualityComparator INSTANCE = null;

        static {
                io.netty.util.AsciiString$GeneralCaseInsensitiveCharEqualityComparator r0 = new io.netty.util.AsciiString$GeneralCaseInsensitiveCharEqualityComparator
                r0.<init>()
                io.netty.util.AsciiString.GeneralCaseInsensitiveCharEqualityComparator.INSTANCE = r0
                return
        }

        private GeneralCaseInsensitiveCharEqualityComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.netty.util.AsciiString.CharEqualityComparator
        public boolean equals(char r3, char r4) {
                r2 = this;
                char r0 = java.lang.Character.toUpperCase(r3)
                char r1 = java.lang.Character.toUpperCase(r4)
                if (r0 == r1) goto L17
                char r3 = java.lang.Character.toLowerCase(r3)
                char r4 = java.lang.Character.toLowerCase(r4)
                if (r3 != r4) goto L15
                goto L17
            L15:
                r3 = 0
                return r3
            L17:
                r3 = 1
                return r3
        }
    }

    static {
            java.lang.String r0 = ""
            io.netty.util.AsciiString r0 = cached(r0)
            io.netty.util.AsciiString.EMPTY_STRING = r0
            io.netty.util.AsciiString$1 r0 = new io.netty.util.AsciiString$1
            r0.<init>()
            io.netty.util.AsciiString.CASE_INSENSITIVE_HASHER = r0
            io.netty.util.AsciiString$2 r0 = new io.netty.util.AsciiString$2
            r0.<init>()
            io.netty.util.AsciiString.CASE_SENSITIVE_HASHER = r0
            return
    }

    public AsciiString(java.lang.CharSequence r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length()
            r2.<init>(r3, r0, r1)
            return
    }

    public AsciiString(java.lang.CharSequence r5, int r6, int r7) {
            r4 = this;
            r4.<init>()
            int r0 = r5.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r6, r7, r0)
            if (r0 != 0) goto L2d
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r7)
            r4.value = r0
            r0 = 0
            r1 = 0
        L15:
            if (r1 >= r7) goto L28
            byte[] r2 = r4.value
            char r3 = r5.charAt(r6)
            byte r3 = c2b(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            int r6 = r6 + 1
            goto L15
        L28:
            r4.offset = r0
            r4.length = r7
            return
        L2d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expected: 0 <= start("
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ") <= start + length("
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = ") <= value.length("
            r1.append(r6)
            int r5 = r5.length()
            r1.append(r5)
            r5 = 41
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public AsciiString(java.lang.CharSequence r3, java.nio.charset.Charset r4) {
            r2 = this;
            r0 = 0
            int r1 = r3.length()
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public AsciiString(java.lang.CharSequence r2, java.nio.charset.Charset r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            int r0 = r4 + r5
            java.nio.CharBuffer r2 = java.nio.CharBuffer.wrap(r2, r4, r0)
            java.nio.charset.CharsetEncoder r3 = io.netty.util.CharsetUtil.encoder(r3)
            float r4 = r3.maxBytesPerChar()
            float r5 = (float) r5
            float r4 = r4 * r5
            int r4 = (int) r4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r5 = 1
            r3.encode(r2, r4, r5)
            int r2 = r4.arrayOffset()
            byte[] r3 = r4.array()
            int r4 = r4.position()
            int r4 = r4 + r2
            byte[] r2 = java.util.Arrays.copyOfRange(r3, r2, r4)
            r1.value = r2
            r3 = 0
            r1.offset = r3
            int r2 = r2.length
            r1.length = r2
            return
    }

    public AsciiString(java.nio.ByteBuffer r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AsciiString(java.nio.ByteBuffer r3, int r4, int r5, boolean r6) {
            r2 = this;
            r2.<init>()
            int r0 = r3.capacity()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r4, r5, r0)
            if (r0 != 0) goto L48
            boolean r0 = r3.hasArray()
            r1 = 0
            if (r0 == 0) goto L33
            if (r6 == 0) goto L2a
            int r6 = r3.arrayOffset()
            int r6 = r6 + r4
            byte[] r3 = r3.array()
            int r4 = r6 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r6, r4)
            r2.value = r3
            r2.offset = r1
            goto L45
        L2a:
            byte[] r3 = r3.array()
            r2.value = r3
            r2.offset = r4
            goto L45
        L33:
            byte[] r4 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r5)
            r2.value = r4
            int r6 = r3.position()
            r3.get(r4, r1, r5)
            r3.position(r6)
            r2.offset = r1
        L45:
            r2.length = r5
            return
        L48:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected: 0 <= start("
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ") <= start + length("
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ") <= value.capacity("
            r0.append(r4)
            int r3 = r3.capacity()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r6.<init>(r3)
            throw r6
    }

    public AsciiString(java.nio.ByteBuffer r3, boolean r4) {
            r2 = this;
            int r0 = r3.position()
            int r1 = r3.remaining()
            r2.<init>(r3, r0, r1, r4)
            return
    }

    public AsciiString(byte[] r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AsciiString(byte[] r3, int r4, int r5, boolean r6) {
            r2 = this;
            r2.<init>()
            if (r6 == 0) goto L11
            int r6 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r4, r6)
            r2.value = r3
            r3 = 0
            r2.offset = r3
            goto L1c
        L11:
            int r6 = r3.length
            boolean r6 = io.netty.util.internal.MathUtil.isOutOfBounds(r4, r5, r6)
            if (r6 != 0) goto L1f
            r2.value = r3
            r2.offset = r4
        L1c:
            r2.length = r5
            return
        L1f:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected: 0 <= start("
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ") <= start + length("
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ") <= value.length("
            r0.append(r4)
            int r3 = r3.length
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r6.<init>(r3)
            throw r6
    }

    public AsciiString(byte[] r3, boolean r4) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.<init>(r3, r0, r1, r4)
            return
    }

    public AsciiString(char[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.<init>(r3, r0, r1)
            return
    }

    public AsciiString(char[] r5, int r6, int r7) {
            r4 = this;
            r4.<init>()
            int r0 = r5.length
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r6, r7, r0)
            if (r0 != 0) goto L28
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r7)
            r4.value = r0
            r0 = 0
            r1 = 0
        L12:
            if (r1 >= r7) goto L23
            byte[] r2 = r4.value
            char r3 = r5[r6]
            byte r3 = c2b(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            int r6 = r6 + 1
            goto L12
        L23:
            r4.offset = r0
            r4.length = r7
            return
        L28:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expected: 0 <= start("
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ") <= start + length("
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = ") <= value.length("
            r1.append(r6)
            int r5 = r5.length
            r1.append(r5)
            r5 = 41
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public AsciiString(char[] r3, java.nio.charset.Charset r4) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public AsciiString(char[] r1, java.nio.charset.Charset r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1, r3, r4)
            java.nio.charset.CharsetEncoder r2 = io.netty.util.CharsetUtil.encoder(r2)
            float r3 = r2.maxBytesPerChar()
            float r4 = (float) r4
            float r3 = r3 * r4
            int r3 = (int) r3
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            r4 = 1
            r2.encode(r1, r3, r4)
            int r1 = r3.arrayOffset()
            byte[] r2 = r3.array()
            int r3 = r3.position()
            int r3 = r3 + r1
            byte[] r1 = java.util.Arrays.copyOfRange(r2, r1, r3)
            r0.value = r1
            r2 = 0
            r0.offset = r2
            int r1 = r1.length
            r0.length = r1
            return
    }

    static /* synthetic */ boolean access$000(char r0, char r1) {
            boolean r0 = equalsIgnoreCase(r0, r1)
            return r0
    }

    public static char b2c(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            return r0
    }

    public static byte c2b(char r1) {
            r0 = 255(0xff, float:3.57E-43)
            if (r1 <= r0) goto L6
            r1 = 63
        L6:
            byte r1 = (byte) r1
            return r1
    }

    private static byte c2b0(char r0) {
            byte r0 = (byte) r0
            return r0
    }

    public static io.netty.util.AsciiString cached(java.lang.String r1) {
            io.netty.util.AsciiString r0 = new io.netty.util.AsciiString
            r0.<init>(r1)
            r0.string = r1
            return r0
    }

    public static boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            io.netty.util.AsciiString$DefaultCharEqualityComparator r0 = io.netty.util.AsciiString.DefaultCharEqualityComparator.INSTANCE
            boolean r1 = contains(r1, r2, r0)
            return r1
    }

    private static boolean contains(java.lang.CharSequence r6, java.lang.CharSequence r7, io.netty.util.AsciiString.CharEqualityComparator r8) {
            r0 = 0
            if (r6 == 0) goto L47
            if (r7 == 0) goto L47
            int r1 = r6.length()
            int r2 = r7.length()
            if (r1 >= r2) goto L10
            goto L47
        L10:
            int r1 = r7.length()
            r2 = 1
            if (r1 != 0) goto L18
            return r2
        L18:
            r1 = 0
            r3 = 0
        L1a:
            int r4 = r6.length()
            if (r1 >= r4) goto L47
            char r4 = r7.charAt(r3)
            char r5 = r6.charAt(r1)
            boolean r4 = r8.equals(r4, r5)
            if (r4 == 0) goto L37
            int r3 = r3 + 1
            int r4 = r7.length()
            if (r3 != r4) goto L44
            return r2
        L37:
            int r3 = r6.length()
            int r3 = r3 - r1
            int r4 = r7.length()
            if (r3 >= r4) goto L43
            return r0
        L43:
            r3 = 0
        L44:
            int r1 = r1 + 1
            goto L1a
        L47:
            return r0
    }

    public static boolean containsAllContentEqualsIgnoreCase(java.util.Collection<java.lang.CharSequence> r1, java.util.Collection<java.lang.CharSequence> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = containsContentEqualsIgnoreCase(r1, r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L18:
            r1 = 1
            return r1
    }

    public static boolean containsContentEqualsIgnoreCase(java.util.Collection<java.lang.CharSequence> r1, java.lang.CharSequence r2) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = contentEqualsIgnoreCase(r2, r0)
            if (r0 == 0) goto L4
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static boolean containsIgnoreCase(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            io.netty.util.AsciiString$AsciiCaseInsensitiveCharEqualityComparator r0 = io.netty.util.AsciiString.AsciiCaseInsensitiveCharEqualityComparator.INSTANCE
            boolean r1 = contains(r1, r2, r0)
            return r1
    }

    public static boolean contentEquals(java.lang.CharSequence r5, java.lang.CharSequence r6) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L3e
            if (r6 != 0) goto L7
            goto L3e
        L7:
            boolean r2 = r5 instanceof io.netty.util.AsciiString
            if (r2 == 0) goto L12
            io.netty.util.AsciiString r5 = (io.netty.util.AsciiString) r5
            boolean r5 = r5.contentEquals(r6)
            return r5
        L12:
            boolean r2 = r6 instanceof io.netty.util.AsciiString
            if (r2 == 0) goto L1d
            io.netty.util.AsciiString r6 = (io.netty.util.AsciiString) r6
            boolean r5 = r6.contentEquals(r5)
            return r5
        L1d:
            int r2 = r5.length()
            int r3 = r6.length()
            if (r2 == r3) goto L28
            return r1
        L28:
            r2 = 0
        L29:
            int r3 = r5.length()
            if (r2 >= r3) goto L3d
            char r3 = r5.charAt(r2)
            char r4 = r6.charAt(r2)
            if (r3 == r4) goto L3a
            return r1
        L3a:
            int r2 = r2 + 1
            goto L29
        L3d:
            return r0
        L3e:
            if (r5 != r6) goto L41
            return r0
        L41:
            return r1
    }

    public static boolean contentEqualsIgnoreCase(java.lang.CharSequence r5, java.lang.CharSequence r6) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L42
            if (r6 != 0) goto L7
            goto L42
        L7:
            boolean r2 = r5 instanceof io.netty.util.AsciiString
            if (r2 == 0) goto L12
            io.netty.util.AsciiString r5 = (io.netty.util.AsciiString) r5
            boolean r5 = r5.contentEqualsIgnoreCase(r6)
            return r5
        L12:
            boolean r2 = r6 instanceof io.netty.util.AsciiString
            if (r2 == 0) goto L1d
            io.netty.util.AsciiString r6 = (io.netty.util.AsciiString) r6
            boolean r5 = r6.contentEqualsIgnoreCase(r5)
            return r5
        L1d:
            int r2 = r5.length()
            int r3 = r6.length()
            if (r2 == r3) goto L28
            return r1
        L28:
            r2 = 0
        L29:
            int r3 = r5.length()
            if (r2 >= r3) goto L41
            char r3 = r5.charAt(r2)
            char r4 = r6.charAt(r2)
            boolean r3 = equalsIgnoreCase(r3, r4)
            if (r3 != 0) goto L3e
            return r1
        L3e:
            int r2 = r2 + 1
            goto L29
        L41:
            return r0
        L42:
            if (r5 != r6) goto L45
            return r0
        L45:
            return r1
    }

    private static boolean equalsIgnoreCase(byte r0, byte r1) {
            if (r0 == r1) goto Lf
            byte r0 = toLowerCase(r0)
            byte r1 = toLowerCase(r1)
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    private static boolean equalsIgnoreCase(char r0, char r1) {
            if (r0 == r1) goto Lf
            char r0 = toLowerCase(r0)
            char r1 = toLowerCase(r1)
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    private int forEachByte0(int r3, int r4, io.netty.util.ByteProcessor r5) throws java.lang.Exception {
            r2 = this;
            int r0 = r2.offset
            int r1 = r0 + r3
            int r1 = r1 + r4
            int r0 = r0 + r3
        L6:
            if (r0 >= r1) goto L19
            byte[] r3 = r2.value
            r3 = r3[r0]
            boolean r3 = r5.process(r3)
            if (r3 != 0) goto L16
            int r3 = r2.offset
            int r0 = r0 - r3
            return r0
        L16:
            int r0 = r0 + 1
            goto L6
        L19:
            r3 = -1
            return r3
    }

    private int forEachByteDesc0(int r3, int r4, io.netty.util.ByteProcessor r5) throws java.lang.Exception {
            r2 = this;
            int r0 = r2.offset
            int r1 = r0 + r3
            int r0 = r0 + r3
            int r0 = r0 + r4
            int r0 = r0 + (-1)
        L8:
            if (r0 < r1) goto L1b
            byte[] r3 = r2.value
            r3 = r3[r0]
            boolean r3 = r5.process(r3)
            if (r3 != 0) goto L18
            int r3 = r2.offset
            int r0 = r0 - r3
            return r0
        L18:
            int r0 = r0 + (-1)
            goto L8
        L1b:
            r3 = -1
            return r3
    }

    public static int hashCode(java.lang.CharSequence r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto Ld
            int r1 = r1.hashCode()
            return r1
        Ld:
            int r1 = io.netty.util.internal.PlatformDependent.hashCodeAscii(r1)
            return r1
    }

    public static int indexOf(java.lang.CharSequence r3, char r4, int r5) {
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.indexOf(r4, r5)
            return r3
        Lb:
            boolean r0 = r3 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L16
            io.netty.util.AsciiString r3 = (io.netty.util.AsciiString) r3
            int r3 = r3.indexOf(r4, r5)
            return r3
        L16:
            r0 = -1
            if (r3 != 0) goto L1a
            return r0
        L1a:
            int r1 = r3.length()
            if (r5 >= 0) goto L21
            r5 = 0
        L21:
            if (r5 >= r1) goto L2d
            char r2 = r3.charAt(r5)
            if (r2 != r4) goto L2a
            return r5
        L2a:
            int r5 = r5 + 1
            goto L21
        L2d:
            return r0
    }

    public static int indexOfIgnoreCase(java.lang.CharSequence r8, java.lang.CharSequence r9, int r10) {
            r0 = -1
            if (r8 == 0) goto L2d
            if (r9 != 0) goto L6
            goto L2d
        L6:
            if (r10 >= 0) goto L9
            r10 = 0
        L9:
            int r6 = r9.length()
            int r1 = r8.length()
            int r1 = r1 - r6
            int r7 = r1 + 1
            if (r10 <= r7) goto L17
            return r0
        L17:
            if (r6 != 0) goto L1a
            return r10
        L1a:
            r3 = r10
        L1b:
            if (r3 >= r7) goto L2d
            r2 = 1
            r5 = 0
            r1 = r8
            r4 = r9
            boolean r8 = regionMatches(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L28
            return r3
        L28:
            int r3 = r3 + 1
            r8 = r1
            r9 = r4
            goto L1b
        L2d:
            return r0
    }

    public static int indexOfIgnoreCaseAscii(java.lang.CharSequence r8, java.lang.CharSequence r9, int r10) {
            r0 = -1
            if (r8 == 0) goto L2d
            if (r9 != 0) goto L6
            goto L2d
        L6:
            if (r10 >= 0) goto L9
            r10 = 0
        L9:
            int r6 = r9.length()
            int r1 = r8.length()
            int r1 = r1 - r6
            int r7 = r1 + 1
            if (r10 <= r7) goto L17
            return r0
        L17:
            if (r6 != 0) goto L1a
            return r10
        L1a:
            r3 = r10
        L1b:
            if (r3 >= r7) goto L2d
            r2 = 1
            r5 = 0
            r1 = r8
            r4 = r9
            boolean r8 = regionMatchesAscii(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L28
            return r3
        L28:
            int r3 = r3 + 1
            r8 = r1
            r9 = r4
            goto L1b
        L2d:
            return r0
    }

    private static boolean isLowerCase(byte r1) {
            r0 = 97
            if (r1 < r0) goto La
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean isUpperCase(byte r1) {
            r0 = 65
            if (r1 < r0) goto La
            r0 = 90
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean isUpperCase(char r1) {
            r0 = 65
            if (r1 < r0) goto La
            r0 = 90
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static io.netty.util.AsciiString of(java.lang.CharSequence r1) {
            boolean r0 = r1 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L7
            io.netty.util.AsciiString r1 = (io.netty.util.AsciiString) r1
            return r1
        L7:
            io.netty.util.AsciiString r0 = new io.netty.util.AsciiString
            r0.<init>(r1)
            return r0
    }

    private int parseInt(int r8, int r9, int r10, boolean r11) {
            r7 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r0 / r10
            r1 = 0
            r2 = r8
            r3 = 0
        L6:
            if (r2 >= r9) goto L4f
            byte[] r4 = r7.value
            int r5 = r2 + 1
            int r6 = r7.offset
            int r2 = r2 + r6
            r2 = r4[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            int r2 = java.lang.Character.digit(r2, r10)
            r4 = -1
            if (r2 == r4) goto L41
            if (r0 > r3) goto L33
            int r4 = r3 * r10
            int r4 = r4 - r2
            if (r4 > r3) goto L25
            r3 = r4
            r2 = r5
            goto L6
        L25:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            io.netty.util.AsciiString r8 = r7.subSequence(r8, r9, r1)
            java.lang.String r8 = r8.toString()
            r10.<init>(r8)
            throw r10
        L33:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            io.netty.util.AsciiString r8 = r7.subSequence(r8, r9, r1)
            java.lang.String r8 = r8.toString()
            r10.<init>(r8)
            throw r10
        L41:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            io.netty.util.AsciiString r8 = r7.subSequence(r8, r9, r1)
            java.lang.String r8 = r8.toString()
            r10.<init>(r8)
            throw r10
        L4f:
            if (r11 != 0) goto L63
            int r10 = -r3
            if (r10 < 0) goto L55
            return r10
        L55:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            io.netty.util.AsciiString r8 = r7.subSequence(r8, r9, r1)
            java.lang.String r8 = r8.toString()
            r10.<init>(r8)
            throw r10
        L63:
            return r3
    }

    private long parseLong(int r19, int r20, int r21, boolean r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            long r4 = (long) r3
            r6 = -9223372036854775808
            long r6 = r6 / r4
            r10 = r1
            r11 = 0
        Lf:
            if (r10 >= r2) goto L62
            byte[] r14 = r0.value
            int r15 = r10 + 1
            r16 = 0
            int r8 = r0.offset
            int r10 = r10 + r8
            r8 = r14[r10]
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = (char) r8
            int r8 = java.lang.Character.digit(r8, r3)
            r9 = -1
            if (r8 == r9) goto L53
            int r9 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r9 > 0) goto L44
            long r9 = r11 * r4
            long r13 = (long) r8
            long r9 = r9 - r13
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 > 0) goto L35
            r11 = r9
            r10 = r15
            goto Lf
        L35:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r4 = 0
            io.netty.util.AsciiString r1 = r0.subSequence(r1, r2, r4)
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            throw r3
        L44:
            r4 = 0
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            io.netty.util.AsciiString r1 = r0.subSequence(r1, r2, r4)
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            throw r3
        L53:
            r4 = 0
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            io.netty.util.AsciiString r1 = r0.subSequence(r1, r2, r4)
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            throw r3
        L62:
            r4 = 0
            r16 = 0
            if (r22 != 0) goto L7b
            long r5 = -r11
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 < 0) goto L6d
            return r5
        L6d:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            io.netty.util.AsciiString r1 = r0.subSequence(r1, r2, r4)
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            throw r3
        L7b:
            return r11
    }

    public static boolean regionMatches(java.lang.CharSequence r6, boolean r7, int r8, java.lang.CharSequence r9, int r10, int r11) {
            if (r6 == 0) goto L3a
            if (r9 != 0) goto L5
            goto L3a
        L5:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L16
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L16
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = r6.regionMatches(r7, r8, r9, r10, r11)
            return r6
        L16:
            boolean r0 = r6 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L27
            r0 = r6
            io.netty.util.AsciiString r0 = (io.netty.util.AsciiString) r0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r6
        L27:
            r3 = r9
            if (r7 == 0) goto L32
            io.netty.util.AsciiString$GeneralCaseInsensitiveCharEqualityComparator r7 = io.netty.util.AsciiString.GeneralCaseInsensitiveCharEqualityComparator.INSTANCE
        L2c:
            r9 = r10
            r10 = r11
            r11 = r7
            r7 = r8
            r8 = r3
            goto L35
        L32:
            io.netty.util.AsciiString$DefaultCharEqualityComparator r7 = io.netty.util.AsciiString.DefaultCharEqualityComparator.INSTANCE
            goto L2c
        L35:
            boolean r6 = regionMatchesCharSequences(r6, r7, r8, r9, r10, r11)
            return r6
        L3a:
            r6 = 0
            return r6
    }

    public static boolean regionMatchesAscii(java.lang.CharSequence r6, boolean r7, int r8, java.lang.CharSequence r9, int r10, int r11) {
            if (r6 == 0) goto L3e
            if (r9 != 0) goto L5
            goto L3e
        L5:
            if (r7 != 0) goto L19
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L19
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L19
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = r6.regionMatches(r7, r8, r9, r10, r11)
            return r6
        L19:
            boolean r0 = r6 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L2a
            r0 = r6
            io.netty.util.AsciiString r0 = (io.netty.util.AsciiString) r0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r6
        L2a:
            r1 = r7
            r2 = r9
            if (r1 == 0) goto L36
            io.netty.util.AsciiString$AsciiCaseInsensitiveCharEqualityComparator r7 = io.netty.util.AsciiString.AsciiCaseInsensitiveCharEqualityComparator.INSTANCE
        L30:
            r0 = r6
            r5 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            goto L39
        L36:
            io.netty.util.AsciiString$DefaultCharEqualityComparator r7 = io.netty.util.AsciiString.DefaultCharEqualityComparator.INSTANCE
            goto L30
        L39:
            boolean r6 = regionMatchesCharSequences(r0, r1, r2, r3, r4, r5)
            return r6
        L3e:
            r6 = 0
            return r6
    }

    private static boolean regionMatchesCharSequences(java.lang.CharSequence r3, int r4, java.lang.CharSequence r5, int r6, int r7, io.netty.util.AsciiString.CharEqualityComparator r8) {
            r0 = 0
            if (r4 < 0) goto L30
            int r1 = r3.length()
            int r1 = r1 - r4
            if (r7 <= r1) goto Lb
            goto L30
        Lb:
            if (r6 < 0) goto L30
            int r1 = r5.length()
            int r1 = r1 - r6
            if (r7 <= r1) goto L15
            goto L30
        L15:
            int r7 = r7 + r4
        L16:
            if (r4 >= r7) goto L2e
            int r1 = r4 + 1
            char r4 = r3.charAt(r4)
            int r2 = r6 + 1
            char r6 = r5.charAt(r6)
            boolean r4 = r8.equals(r4, r6)
            if (r4 != 0) goto L2b
            return r0
        L2b:
            r4 = r1
            r6 = r2
            goto L16
        L2e:
            r3 = 1
            return r3
        L30:
            return r0
    }

    private static io.netty.util.AsciiString[] toAsciiStringArray(java.lang.String[] r4) {
            int r0 = r4.length
            io.netty.util.AsciiString[] r0 = new io.netty.util.AsciiString[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L13
            io.netty.util.AsciiString r2 = new io.netty.util.AsciiString
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L13:
            return r0
    }

    private static byte toLowerCase(byte r1) {
            boolean r0 = isUpperCase(r1)
            if (r0 == 0) goto L9
            int r1 = r1 + 32
            byte r1 = (byte) r1
        L9:
            return r1
    }

    public static char toLowerCase(char r1) {
            boolean r0 = isUpperCase(r1)
            if (r0 == 0) goto L9
            int r1 = r1 + 32
            char r1 = (char) r1
        L9:
            return r1
    }

    private static byte toUpperCase(byte r1) {
            boolean r0 = isLowerCase(r1)
            if (r0 == 0) goto L9
            int r1 = r1 + (-32)
            byte r1 = (byte) r1
        L9:
            return r1
    }

    public static java.lang.CharSequence trim(java.lang.CharSequence r5) {
            boolean r0 = r5 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto Lb
            io.netty.util.AsciiString r5 = (io.netty.util.AsciiString) r5
            io.netty.util.AsciiString r5 = r5.trim()
            return r5
        Lb:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L16
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.trim()
            return r5
        L16:
            int r0 = r5.length()
            int r0 = r0 + (-1)
            r1 = 0
        L1d:
            r2 = 32
            if (r1 > r0) goto L2a
            char r3 = r5.charAt(r1)
            if (r3 > r2) goto L2a
            int r1 = r1 + 1
            goto L1d
        L2a:
            r3 = r0
        L2b:
            if (r3 < r1) goto L36
            char r4 = r5.charAt(r3)
            if (r4 > r2) goto L36
            int r3 = r3 + (-1)
            goto L2b
        L36:
            if (r1 != 0) goto L3b
            if (r3 != r0) goto L3b
            return r5
        L3b:
            java.lang.CharSequence r5 = r5.subSequence(r1, r3)
            return r5
    }

    public byte[] array() {
            r1 = this;
            byte[] r0 = r1.value
            return r0
    }

    public void arrayChanged() {
            r1 = this;
            r0 = 0
            r1.string = r0
            r0 = 0
            r1.hash = r0
            return
    }

    public int arrayOffset() {
            r1 = this;
            int r0 = r1.offset
            return r0
    }

    public byte byteAt(int r4) {
            r3 = this;
            if (r4 < 0) goto L1e
            int r0 = r3.length
            if (r4 >= r0) goto L1e
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L16
            byte[] r0 = r3.value
            int r1 = r3.offset
            int r4 = r4 + r1
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r0, r4)
            return r4
        L16:
            byte[] r0 = r3.value
            int r1 = r3.offset
            int r4 = r4 + r1
            r4 = r0[r4]
            return r4
        L1e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " must be in the range [0,"
            r1.append(r4)
            int r4 = r3.length
            r1.append(r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.lang.CharSequence
    public char charAt(int r1) {
            r0 = this;
            byte r1 = r0.byteAt(r1)
            char r1 = b2c(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(java.lang.CharSequence r8) {
            r7 = this;
            r0 = 0
            if (r7 != r8) goto L4
            return r0
        L4:
            int r1 = r7.length()
            int r2 = r8.length()
            int r3 = java.lang.Math.min(r1, r2)
            int r4 = r7.arrayOffset()
        L14:
            if (r0 >= r3) goto L2b
            byte[] r5 = r7.value
            r5 = r5[r4]
            char r5 = b2c(r5)
            char r6 = r8.charAt(r0)
            int r5 = r5 - r6
            if (r5 == 0) goto L26
            return r5
        L26:
            int r0 = r0 + 1
            int r4 = r4 + 1
            goto L14
        L2b:
            int r1 = r1 - r2
            return r1
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public io.netty.util.AsciiString concat(java.lang.CharSequence r7) {
            r6 = this;
            int r0 = r6.length()
            int r1 = r7.length()
            if (r1 != 0) goto Lb
            return r6
        Lb:
            boolean r2 = r7 instanceof io.netty.util.AsciiString
            r3 = 0
            if (r2 == 0) goto L37
            io.netty.util.AsciiString r7 = (io.netty.util.AsciiString) r7
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L19
            return r7
        L19:
            int r2 = r0 + r1
            byte[] r2 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r2)
            byte[] r4 = r6.value
            int r5 = r6.arrayOffset()
            java.lang.System.arraycopy(r4, r5, r2, r3, r0)
            byte[] r4 = r7.value
            int r7 = r7.arrayOffset()
            java.lang.System.arraycopy(r4, r7, r2, r0, r1)
            io.netty.util.AsciiString r7 = new io.netty.util.AsciiString
            r7.<init>(r2, r3)
            return r7
        L37:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L43
            io.netty.util.AsciiString r0 = new io.netty.util.AsciiString
            r0.<init>(r7)
            return r0
        L43:
            int r1 = r1 + r0
            byte[] r1 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r1)
            byte[] r2 = r6.value
            int r4 = r6.arrayOffset()
            java.lang.System.arraycopy(r2, r4, r1, r3, r0)
            r2 = 0
        L52:
            int r4 = r1.length
            if (r0 >= r4) goto L64
            char r4 = r7.charAt(r2)
            byte r4 = c2b(r4)
            r1[r0] = r4
            int r0 = r0 + 1
            int r2 = r2 + 1
            goto L52
        L64:
            io.netty.util.AsciiString r7 = new io.netty.util.AsciiString
            r7.<init>(r1, r3)
            return r7
    }

    public boolean contains(java.lang.CharSequence r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean contentEquals(java.lang.CharSequence r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L3b
            int r2 = r7.length()
            int r3 = r6.length()
            if (r2 == r3) goto L12
            goto L3b
        L12:
            boolean r2 = r7 instanceof io.netty.util.AsciiString
            if (r2 == 0) goto L1b
            boolean r7 = r6.equals(r7)
            return r7
        L1b:
            int r2 = r6.arrayOffset()
            r3 = 0
        L20:
            int r4 = r7.length()
            if (r3 >= r4) goto L3a
            byte[] r4 = r6.value
            r4 = r4[r2]
            char r4 = b2c(r4)
            char r5 = r7.charAt(r3)
            if (r4 == r5) goto L35
            return r1
        L35:
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L20
        L3a:
            return r0
        L3b:
            return r1
    }

    public boolean contentEqualsIgnoreCase(java.lang.CharSequence r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L5f
            int r2 = r7.length()
            int r3 = r6.length()
            if (r2 == r3) goto L12
            goto L5f
        L12:
            boolean r2 = r7 instanceof io.netty.util.AsciiString
            if (r2 == 0) goto L3b
            io.netty.util.AsciiString r7 = (io.netty.util.AsciiString) r7
            int r2 = r6.arrayOffset()
            int r3 = r7.arrayOffset()
        L20:
            int r4 = r6.length()
            if (r2 >= r4) goto L3a
            byte[] r4 = r6.value
            r4 = r4[r2]
            byte[] r5 = r7.value
            r5 = r5[r3]
            boolean r4 = equalsIgnoreCase(r4, r5)
            if (r4 != 0) goto L35
            return r1
        L35:
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L20
        L3a:
            return r0
        L3b:
            int r2 = r6.arrayOffset()
            r3 = 0
        L40:
            int r4 = r6.length()
            if (r2 >= r4) goto L5e
            byte[] r4 = r6.value
            r4 = r4[r2]
            char r4 = b2c(r4)
            char r5 = r7.charAt(r3)
            boolean r4 = equalsIgnoreCase(r4, r5)
            if (r4 != 0) goto L59
            return r1
        L59:
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L40
        L5e:
            return r0
        L5f:
            return r1
    }

    public void copy(int r3, byte[] r4, int r5, int r6) {
            r2 = this;
            int r0 = r2.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r3, r6, r0)
            if (r0 != 0) goto L19
            byte[] r0 = r2.value
            int r1 = r2.offset
            int r3 = r3 + r1
            java.lang.String r1 = "dst"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r1)
            java.lang.System.arraycopy(r0, r3, r4, r5, r6)
            return
        L19:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "expected: 0 <= srcIdx("
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = ") <= srcIdx + length("
            r5.append(r3)
            r5.append(r6)
            java.lang.String r3 = ") <= srcLen("
            r5.append(r3)
            int r3 = r2.length()
            r5.append(r3)
            r3 = 41
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    public void copy(int r2, char[] r3, int r4, int r5) {
            r1 = this;
            if (r3 == 0) goto L54
            int r0 = r1.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r2, r5, r0)
            if (r0 != 0) goto L24
            int r5 = r5 + r4
            int r0 = r1.arrayOffset()
            int r2 = r2 + r0
        L12:
            if (r4 >= r5) goto L23
            byte[] r0 = r1.value
            r0 = r0[r2]
            char r0 = b2c(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L12
        L23:
            return
        L24:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "expected: 0 <= srcIdx("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = ") <= srcIdx + length("
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = ") <= srcLen("
            r4.append(r2)
            int r2 = r1.length()
            r4.append(r2)
            r2 = 41
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L54:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "dst"
            r2.<init>(r3)
            throw r2
    }

    public boolean endsWith(java.lang.CharSequence r4) {
            r3 = this;
            int r0 = r4.length()
            int r1 = r3.length()
            int r1 = r1 - r0
            r2 = 0
            boolean r4 = r3.regionMatches(r1, r4, r2, r0)
            return r4
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L41
            java.lang.Class r1 = r7.getClass()
            java.lang.Class<io.netty.util.AsciiString> r2 = io.netty.util.AsciiString.class
            if (r1 == r2) goto Lc
            goto L41
        Lc:
            r1 = 1
            if (r6 != r7) goto L10
            return r1
        L10:
            io.netty.util.AsciiString r7 = (io.netty.util.AsciiString) r7
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 != r3) goto L41
            int r2 = r6.hashCode()
            int r3 = r7.hashCode()
            if (r2 != r3) goto L41
            byte[] r2 = r6.array()
            int r3 = r6.arrayOffset()
            byte[] r4 = r7.array()
            int r7 = r7.arrayOffset()
            int r5 = r6.length()
            boolean r7 = io.netty.util.internal.PlatformDependent.equals(r2, r3, r4, r7, r5)
            if (r7 == 0) goto L41
            return r1
        L41:
            return r0
    }

    public int forEachByte(int r3, int r4, io.netty.util.ByteProcessor r5) throws java.lang.Exception {
            r2 = this;
            int r0 = r2.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r3, r4, r0)
            if (r0 != 0) goto Lf
            int r3 = r2.forEachByte0(r3, r4, r5)
            return r3
        Lf:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected: 0 <= index("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") <= start + length("
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ") <= length("
            r0.append(r3)
            int r3 = r2.length()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
    }

    public int forEachByte(io.netty.util.ByteProcessor r3) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            int r1 = r2.length()
            int r3 = r2.forEachByte0(r0, r1, r3)
            return r3
    }

    public int forEachByteDesc(int r3, int r4, io.netty.util.ByteProcessor r5) throws java.lang.Exception {
            r2 = this;
            int r0 = r2.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r3, r4, r0)
            if (r0 != 0) goto Lf
            int r3 = r2.forEachByteDesc0(r3, r4, r5)
            return r3
        Lf:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected: 0 <= index("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") <= start + length("
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ") <= length("
            r0.append(r3)
            int r3 = r2.length()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
    }

    public int forEachByteDesc(io.netty.util.ByteProcessor r3) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            int r1 = r2.length()
            int r3 = r2.forEachByteDesc0(r0, r1, r3)
            return r3
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.hash
            if (r0 != 0) goto L10
            byte[] r0 = r3.value
            int r1 = r3.offset
            int r2 = r3.length
            int r0 = io.netty.util.internal.PlatformDependent.hashCodeAscii(r0, r1, r2)
            r3.hash = r0
        L10:
            return r0
    }

    public int indexOf(char r4, int r5) {
            r3 = this;
            r0 = 255(0xff, float:3.57E-43)
            r1 = -1
            if (r4 <= r0) goto L6
            return r1
        L6:
            if (r5 >= 0) goto L9
            r5 = 0
        L9:
            byte r4 = c2b0(r4)
            int r0 = r3.offset
            int r2 = r3.length
            int r2 = r2 + r0
            int r5 = r5 + r0
        L13:
            if (r5 >= r2) goto L22
            byte[] r0 = r3.value
            r0 = r0[r5]
            if (r0 != r4) goto L1f
            int r4 = r3.offset
            int r5 = r5 - r4
            return r5
        L1f:
            int r5 = r5 + 1
            goto L13
        L22:
            return r1
    }

    public int indexOf(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.indexOf(r2, r0)
            return r2
    }

    public int indexOf(java.lang.CharSequence r10, int r11) {
            r9 = this;
            int r0 = r10.length()
            r1 = 0
            if (r11 >= 0) goto L8
            r11 = 0
        L8:
            if (r0 > 0) goto L10
            int r10 = r9.length
            if (r11 >= r10) goto Lf
            return r11
        Lf:
            return r10
        L10:
            int r2 = r9.length
            int r2 = r2 - r11
            r3 = -1
            if (r0 <= r2) goto L17
            return r3
        L17:
            char r2 = r10.charAt(r1)
            r4 = 255(0xff, float:3.57E-43)
            if (r2 <= r4) goto L20
            return r3
        L20:
            byte r2 = c2b0(r2)
            int r4 = r9.offset
            int r5 = r9.length
            int r5 = r5 + r4
            int r5 = r5 - r0
            int r11 = r11 + r4
        L2b:
            if (r11 > r5) goto L53
            byte[] r4 = r9.value
            r4 = r4[r11]
            if (r4 != r2) goto L50
            r6 = r11
            r4 = 0
        L35:
            int r4 = r4 + 1
            if (r4 >= r0) goto L4a
            byte[] r7 = r9.value
            int r6 = r6 + 1
            r7 = r7[r6]
            char r7 = b2c(r7)
            char r8 = r10.charAt(r4)
            if (r7 != r8) goto L4a
            goto L35
        L4a:
            if (r4 != r0) goto L50
            int r10 = r9.offset
            int r11 = r11 - r10
            return r11
        L50:
            int r11 = r11 + 1
            goto L2b
        L53:
            return r3
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.length
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isEntireArrayUsed() {
            r2 = this;
            int r0 = r2.offset
            if (r0 != 0) goto Ld
            int r0 = r2.length
            byte[] r1 = r2.value
            int r1 = r1.length
            if (r0 != r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int lastIndexOf(java.lang.CharSequence r2) {
            r1 = this;
            int r0 = r1.length
            int r2 = r1.lastIndexOf(r2, r0)
            return r2
    }

    public int lastIndexOf(java.lang.CharSequence r9, int r10) {
            r8 = this;
            int r0 = r9.length()
            int r1 = r8.length
            int r1 = r1 - r0
            int r10 = java.lang.Math.min(r10, r1)
            r1 = -1
            if (r10 >= 0) goto Lf
            return r1
        Lf:
            if (r0 != 0) goto L12
            return r10
        L12:
            r2 = 0
            char r3 = r9.charAt(r2)
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L1c
            return r1
        L1c:
            byte r3 = c2b0(r3)
            int r4 = r8.offset
            int r4 = r4 + r10
        L23:
            if (r4 < 0) goto L4b
            byte[] r10 = r8.value
            r10 = r10[r4]
            if (r10 != r3) goto L48
            r5 = r4
            r10 = 0
        L2d:
            int r10 = r10 + 1
            if (r10 >= r0) goto L42
            byte[] r6 = r8.value
            int r5 = r5 + 1
            r6 = r6[r5]
            char r6 = b2c(r6)
            char r7 = r9.charAt(r10)
            if (r6 != r7) goto L42
            goto L2d
        L42:
            if (r10 != r0) goto L48
            int r9 = r8.offset
            int r4 = r4 - r9
            return r4
        L48:
            int r4 = r4 + (-1)
            goto L23
        L4b:
            return r1
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    public boolean matches(java.lang.String r1) {
            r0 = this;
            boolean r1 = java.util.regex.Pattern.matches(r1, r0)
            return r1
    }

    public boolean parseBoolean() {
            r3 = this;
            int r0 = r3.length
            r1 = 1
            if (r0 < r1) goto Le
            byte[] r0 = r3.value
            int r2 = r3.offset
            r0 = r0[r2]
            if (r0 == 0) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    public char parseChar() {
            r1 = this;
            r0 = 0
            char r0 = r1.parseChar(r0)
            return r0
    }

    public char parseChar(int r4) {
            r3 = this;
            int r0 = r4 + 1
            int r1 = r3.length()
            if (r0 >= r1) goto L22
            int r0 = r3.offset
            int r4 = r4 + r0
            byte[] r0 = r3.value
            r0 = r0[r4]
            char r0 = b2c(r0)
            int r0 = r0 << 8
            byte[] r1 = r3.value
            int r4 = r4 + 1
            r4 = r1[r4]
            char r4 = b2c(r4)
            r4 = r4 | r0
            char r4 = (char) r4
            return r4
        L22:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "2 bytes required to convert to character. index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " would go out of bounds."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public double parseDouble() {
            r2 = this;
            r0 = 0
            int r1 = r2.length()
            double r0 = r2.parseDouble(r0, r1)
            return r0
    }

    public double parseDouble(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = r0.toString(r1, r2)
            double r1 = java.lang.Double.parseDouble(r1)
            return r1
    }

    public float parseFloat() {
            r2 = this;
            r0 = 0
            int r1 = r2.length()
            float r0 = r2.parseFloat(r0, r1)
            return r0
    }

    public float parseFloat(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = r0.toString(r1, r2)
            float r1 = java.lang.Float.parseFloat(r1)
            return r1
    }

    public int parseInt() {
            r3 = this;
            int r0 = r3.length()
            r1 = 10
            r2 = 0
            int r0 = r3.parseInt(r2, r0, r1)
            return r0
    }

    public int parseInt(int r3) {
            r2 = this;
            r0 = 0
            int r1 = r2.length()
            int r3 = r2.parseInt(r0, r1, r3)
            return r3
    }

    public int parseInt(int r2, int r3) {
            r1 = this;
            r0 = 10
            int r2 = r1.parseInt(r2, r3, r0)
            return r2
    }

    public int parseInt(int r4, int r5, int r6) {
            r3 = this;
            r0 = 2
            if (r6 < r0) goto L36
            r0 = 36
            if (r6 > r0) goto L36
            if (r4 == r5) goto L30
            byte r0 = r3.byteAt(r4)
            r1 = 45
            r2 = 0
            if (r0 != r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L2b
            int r1 = r4 + 1
            if (r1 == r5) goto L1d
            r4 = r1
            goto L2b
        L1d:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            io.netty.util.AsciiString r4 = r3.subSequence(r4, r5, r2)
            java.lang.String r4 = r4.toString()
            r6.<init>(r4)
            throw r6
        L2b:
            int r4 = r3.parseInt(r4, r5, r6, r0)
            return r4
        L30:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            r4.<init>()
            throw r4
        L36:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            r4.<init>()
            throw r4
    }

    public long parseLong() {
            r3 = this;
            int r0 = r3.length()
            r1 = 10
            r2 = 0
            long r0 = r3.parseLong(r2, r0, r1)
            return r0
    }

    public long parseLong(int r3) {
            r2 = this;
            r0 = 0
            int r1 = r2.length()
            long r0 = r2.parseLong(r0, r1, r3)
            return r0
    }

    public long parseLong(int r2, int r3) {
            r1 = this;
            r0 = 10
            long r2 = r1.parseLong(r2, r3, r0)
            return r2
    }

    public long parseLong(int r4, int r5, int r6) {
            r3 = this;
            r0 = 2
            if (r6 < r0) goto L36
            r0 = 36
            if (r6 > r0) goto L36
            if (r4 == r5) goto L30
            byte r0 = r3.byteAt(r4)
            r1 = 45
            r2 = 0
            if (r0 != r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L2b
            int r1 = r4 + 1
            if (r1 == r5) goto L1d
            r4 = r1
            goto L2b
        L1d:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            io.netty.util.AsciiString r4 = r3.subSequence(r4, r5, r2)
            java.lang.String r4 = r4.toString()
            r6.<init>(r4)
            throw r6
        L2b:
            long r4 = r3.parseLong(r4, r5, r6, r0)
            return r4
        L30:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            r4.<init>()
            throw r4
        L36:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            r4.<init>()
            throw r4
    }

    public short parseShort() {
            r3 = this;
            int r0 = r3.length()
            r1 = 10
            r2 = 0
            short r0 = r3.parseShort(r2, r0, r1)
            return r0
    }

    public short parseShort(int r3) {
            r2 = this;
            r0 = 0
            int r1 = r2.length()
            short r3 = r2.parseShort(r0, r1, r3)
            return r3
    }

    public short parseShort(int r2, int r3) {
            r1 = this;
            r0 = 10
            short r2 = r1.parseShort(r2, r3, r0)
            return r2
    }

    public short parseShort(int r2, int r3, int r4) {
            r1 = this;
            int r4 = r1.parseInt(r2, r3, r4)
            short r0 = (short) r4
            if (r0 != r4) goto L8
            return r0
        L8:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            r0 = 0
            io.netty.util.AsciiString r2 = r1.subSequence(r2, r3, r0)
            java.lang.String r2 = r2.toString()
            r4.<init>(r2)
            throw r4
    }

    public boolean regionMatches(int r5, java.lang.CharSequence r6, int r7, int r8) {
            r4 = this;
            if (r6 == 0) goto L39
            r0 = 0
            if (r7 < 0) goto L38
            int r1 = r6.length()
            int r1 = r1 - r7
            if (r1 >= r8) goto Ld
            goto L38
        Ld:
            int r1 = r4.length()
            if (r5 < 0) goto L38
            int r1 = r1 - r5
            if (r1 >= r8) goto L17
            goto L38
        L17:
            r1 = 1
            if (r8 > 0) goto L1b
            return r1
        L1b:
            int r8 = r8 + r7
            int r2 = r4.arrayOffset()
            int r5 = r5 + r2
        L21:
            if (r7 >= r8) goto L37
            byte[] r2 = r4.value
            r2 = r2[r5]
            char r2 = b2c(r2)
            char r3 = r6.charAt(r7)
            if (r2 == r3) goto L32
            return r0
        L32:
            int r7 = r7 + 1
            int r5 = r5 + 1
            goto L21
        L37:
            return r1
        L38:
            return r0
        L39:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "string"
            r5.<init>(r6)
            throw r5
    }

    public boolean regionMatches(boolean r3, int r4, java.lang.CharSequence r5, int r6, int r7) {
            r2 = this;
            if (r3 != 0) goto L7
            boolean r3 = r2.regionMatches(r4, r5, r6, r7)
            return r3
        L7:
            if (r5 == 0) goto L43
            int r3 = r2.length()
            r0 = 0
            if (r4 < 0) goto L42
            int r3 = r3 - r4
            if (r7 <= r3) goto L14
            goto L42
        L14:
            if (r6 < 0) goto L42
            int r3 = r5.length()
            int r3 = r3 - r6
            if (r7 <= r3) goto L1e
            goto L42
        L1e:
            int r3 = r2.arrayOffset()
            int r4 = r4 + r3
            int r7 = r7 + r4
        L24:
            if (r4 >= r7) goto L40
            byte[] r3 = r2.value
            int r1 = r4 + 1
            r3 = r3[r4]
            char r3 = b2c(r3)
            int r4 = r6 + 1
            char r6 = r5.charAt(r6)
            boolean r3 = equalsIgnoreCase(r3, r6)
            if (r3 != 0) goto L3d
            return r0
        L3d:
            r6 = r4
            r4 = r1
            goto L24
        L40:
            r3 = 1
            return r3
        L42:
            return r0
        L43:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "string"
            r3.<init>(r4)
            throw r3
    }

    public io.netty.util.AsciiString replace(char r8, char r9) {
            r7 = this;
            r0 = 255(0xff, float:3.57E-43)
            if (r8 <= r0) goto L5
            goto L4e
        L5:
            byte r8 = c2b0(r8)
            byte r9 = c2b(r9)
            int r0 = r7.offset
            int r1 = r7.length
            int r1 = r1 + r0
        L12:
            if (r0 >= r1) goto L4e
            byte[] r2 = r7.value
            r2 = r2[r0]
            if (r2 != r8) goto L4b
            int r2 = r7.length()
            byte[] r2 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r2)
            byte[] r3 = r7.value
            int r4 = r7.offset
            int r5 = r0 - r4
            r6 = 0
            java.lang.System.arraycopy(r3, r4, r2, r6, r5)
            int r3 = r7.offset
            int r3 = r0 - r3
            r2[r3] = r9
        L32:
            int r0 = r0 + 1
            if (r0 >= r1) goto L45
            byte[] r3 = r7.value
            r3 = r3[r0]
            int r4 = r7.offset
            int r4 = r0 - r4
            if (r3 == r8) goto L41
            goto L42
        L41:
            r3 = r9
        L42:
            r2[r4] = r3
            goto L32
        L45:
            io.netty.util.AsciiString r8 = new io.netty.util.AsciiString
            r8.<init>(r2, r6)
            return r8
        L4b:
            int r0 = r0 + 1
            goto L12
        L4e:
            return r7
    }

    public io.netty.util.AsciiString[] split(char r9) {
            r8 = this;
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            java.util.ArrayList r0 = r0.arrayList()
            int r1 = r8.length()
            r2 = 0
            r3 = 0
            r4 = 0
        Lf:
            if (r3 >= r1) goto L35
            char r5 = r8.charAt(r3)
            if (r5 != r9) goto L32
            if (r4 != r3) goto L1f
            io.netty.util.AsciiString r4 = io.netty.util.AsciiString.EMPTY_STRING
            r0.add(r4)
            goto L30
        L1f:
            io.netty.util.AsciiString r5 = new io.netty.util.AsciiString
            byte[] r6 = r8.value
            int r7 = r8.arrayOffset()
            int r7 = r7 + r4
            int r4 = r3 - r4
            r5.<init>(r6, r7, r4, r2)
            r0.add(r5)
        L30:
            int r4 = r3 + 1
        L32:
            int r3 = r3 + 1
            goto Lf
        L35:
            if (r4 != 0) goto L3b
            r0.add(r8)
            goto L68
        L3b:
            if (r4 == r1) goto L4e
            io.netty.util.AsciiString r9 = new io.netty.util.AsciiString
            byte[] r3 = r8.value
            int r5 = r8.arrayOffset()
            int r5 = r5 + r4
            int r1 = r1 - r4
            r9.<init>(r3, r5, r1, r2)
            r0.add(r9)
            goto L68
        L4e:
            int r9 = r0.size()
            int r9 = r9 + (-1)
        L54:
            if (r9 < 0) goto L68
            java.lang.Object r1 = r0.get(r9)
            io.netty.util.AsciiString r1 = (io.netty.util.AsciiString) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L68
            r0.remove(r9)
            int r9 = r9 + (-1)
            goto L54
        L68:
            io.netty.util.AsciiString[] r9 = new io.netty.util.AsciiString[r2]
            java.lang.Object[] r9 = r0.toArray(r9)
            io.netty.util.AsciiString[] r9 = (io.netty.util.AsciiString[]) r9
            return r9
    }

    public io.netty.util.AsciiString[] split(java.lang.String r1, int r2) {
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.lang.String[] r1 = r1.split(r0, r2)
            io.netty.util.AsciiString[] r1 = toAsciiStringArray(r1)
            return r1
    }

    public boolean startsWith(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.startsWith(r2, r0)
            return r2
    }

    public boolean startsWith(java.lang.CharSequence r3, int r4) {
            r2 = this;
            r0 = 0
            int r1 = r3.length()
            boolean r3 = r2.regionMatches(r4, r3, r0, r1)
            return r3
    }

    public io.netty.util.AsciiString subSequence(int r2) {
            r1 = this;
            int r0 = r1.length()
            io.netty.util.AsciiString r2 = r1.subSequence(r2, r0)
            return r2
    }

    @Override // java.lang.CharSequence
    public io.netty.util.AsciiString subSequence(int r2, int r3) {
            r1 = this;
            r0 = 1
            io.netty.util.AsciiString r2 = r1.subSequence(r2, r3, r0)
            return r2
    }

    public io.netty.util.AsciiString subSequence(int r4, int r5, boolean r6) {
            r3 = this;
            int r0 = r5 - r4
            int r1 = r3.length()
            boolean r1 = io.netty.util.internal.MathUtil.isOutOfBounds(r4, r0, r1)
            if (r1 != 0) goto L25
            if (r4 != 0) goto L15
            int r1 = r3.length()
            if (r5 != r1) goto L15
            return r3
        L15:
            if (r5 != r4) goto L1a
            io.netty.util.AsciiString r4 = io.netty.util.AsciiString.EMPTY_STRING
            return r4
        L1a:
            io.netty.util.AsciiString r5 = new io.netty.util.AsciiString
            byte[] r1 = r3.value
            int r2 = r3.offset
            int r4 = r4 + r2
            r5.<init>(r1, r4, r0, r6)
            return r5
        L25:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected: 0 <= start("
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ") <= end ("
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ") <= length("
            r0.append(r4)
            int r4 = r3.length()
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
    }

    @Override // java.lang.CharSequence
    public /* bridge */ /* synthetic */ java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            io.netty.util.AsciiString r1 = r0.subSequence(r1, r2)
            return r1
    }

    public byte[] toByteArray() {
            r2 = this;
            r0 = 0
            int r1 = r2.length()
            byte[] r0 = r2.toByteArray(r0, r1)
            return r0
    }

    public byte[] toByteArray(int r3, int r4) {
            r2 = this;
            byte[] r0 = r2.value
            int r1 = r2.offset
            int r3 = r3 + r1
            int r4 = r4 + r1
            byte[] r3 = java.util.Arrays.copyOfRange(r0, r3, r4)
            return r3
    }

    public char[] toCharArray() {
            r2 = this;
            r0 = 0
            int r1 = r2.length()
            char[] r0 = r2.toCharArray(r0, r1)
            return r0
    }

    public char[] toCharArray(int r4, int r5) {
            r3 = this;
            int r5 = r5 - r4
            if (r5 != 0) goto L6
            char[] r4 = io.netty.util.internal.EmptyArrays.EMPTY_CHARS
            return r4
        L6:
            int r0 = r3.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r4, r5, r0)
            if (r0 != 0) goto L2a
            char[] r0 = new char[r5]
            int r1 = r3.arrayOffset()
            int r4 = r4 + r1
            r1 = 0
        L18:
            if (r1 >= r5) goto L29
            byte[] r2 = r3.value
            r2 = r2[r4]
            char r2 = b2c(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            int r4 = r4 + 1
            goto L18
        L29:
            return r0
        L2a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expected: 0 <= start("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ") <= srcIdx + length("
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ") <= srcLen("
            r1.append(r4)
            int r4 = r3.length()
            r1.append(r4)
            r4 = 41
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public io.netty.util.AsciiString toLowerCase() {
            r5 = this;
            int r0 = r5.length()
            int r1 = r5.arrayOffset()
            int r0 = r0 + r1
            int r1 = r5.arrayOffset()
        Ld:
            if (r1 >= r0) goto L44
            byte[] r2 = r5.value
            r2 = r2[r1]
            r3 = 65
            if (r2 < r3) goto L41
            r3 = 90
            if (r2 > r3) goto L41
            int r0 = r5.length()
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r0)
            int r1 = r5.arrayOffset()
            r2 = 0
            r3 = 0
        L29:
            int r4 = r0.length
            if (r3 >= r4) goto L3b
            byte[] r4 = r5.value
            r4 = r4[r1]
            byte r4 = toLowerCase(r4)
            r0[r3] = r4
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L29
        L3b:
            io.netty.util.AsciiString r1 = new io.netty.util.AsciiString
            r1.<init>(r0, r2)
            return r1
        L41:
            int r1 = r1 + 1
            goto Ld
        L44:
            return r5
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.string
            if (r0 != 0) goto Lb
            r0 = 0
            java.lang.String r0 = r1.toString(r0)
            r1.string = r0
        Lb:
            return r0
    }

    public java.lang.String toString(int r2) {
            r1 = this;
            int r0 = r1.length()
            java.lang.String r2 = r1.toString(r2, r0)
            return r2
    }

    public java.lang.String toString(int r4, int r5) {
            r3 = this;
            int r5 = r5 - r4
            if (r5 != 0) goto L6
            java.lang.String r4 = ""
            return r4
        L6:
            int r0 = r3.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r4, r5, r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.value
            int r2 = r3.offset
            int r4 = r4 + r2
            r2 = 0
            r0.<init>(r1, r2, r4, r5)
            return r0
        L1c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expected: 0 <= start("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ") <= srcIdx + length("
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ") <= srcLen("
            r1.append(r4)
            int r4 = r3.length()
            r1.append(r4)
            r4 = 41
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public io.netty.util.AsciiString toUpperCase() {
            r5 = this;
            int r0 = r5.length()
            int r1 = r5.arrayOffset()
            int r0 = r0 + r1
            int r1 = r5.arrayOffset()
        Ld:
            if (r1 >= r0) goto L44
            byte[] r2 = r5.value
            r2 = r2[r1]
            r3 = 97
            if (r2 < r3) goto L41
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 > r3) goto L41
            int r0 = r5.length()
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r0)
            int r1 = r5.arrayOffset()
            r2 = 0
            r3 = 0
        L29:
            int r4 = r0.length
            if (r3 >= r4) goto L3b
            byte[] r4 = r5.value
            r4 = r4[r1]
            byte r4 = toUpperCase(r4)
            r0[r3] = r4
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L29
        L3b:
            io.netty.util.AsciiString r1 = new io.netty.util.AsciiString
            r1.<init>(r0, r2)
            return r1
        L41:
            int r1 = r1 + 1
            goto Ld
        L44:
            return r5
    }

    public io.netty.util.AsciiString trim() {
            r5 = this;
            int r0 = r5.arrayOffset()
            int r1 = r5.arrayOffset()
            int r2 = r5.length()
            int r1 = r1 + r2
            int r1 = r1 + (-1)
        Lf:
            r2 = 32
            if (r0 > r1) goto L1c
            byte[] r3 = r5.value
            r3 = r3[r0]
            if (r3 > r2) goto L1c
            int r0 = r0 + 1
            goto Lf
        L1c:
            r3 = r1
        L1d:
            if (r3 < r0) goto L28
            byte[] r4 = r5.value
            r4 = r4[r3]
            if (r4 > r2) goto L28
            int r3 = r3 + (-1)
            goto L1d
        L28:
            if (r0 != 0) goto L2d
            if (r3 != r1) goto L2d
            return r5
        L2d:
            io.netty.util.AsciiString r1 = new io.netty.util.AsciiString
            byte[] r2 = r5.value
            int r3 = r3 - r0
            int r3 = r3 + 1
            r4 = 0
            r1.<init>(r2, r0, r3, r4)
            return r1
    }
}
