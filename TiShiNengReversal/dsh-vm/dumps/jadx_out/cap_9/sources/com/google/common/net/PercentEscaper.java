package com.google.common.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class PercentEscaper extends com.google.common.escape.UnicodeEscaper {
    private static final char[] PLUS_SIGN = null;
    private static final char[] UPPER_HEX_DIGITS = null;
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    static {
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 43
            r2 = 0
            r0[r2] = r1
            com.google.common.net.PercentEscaper.PLUS_SIGN = r0
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r0 = r0.toCharArray()
            com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS = r0
            return
    }

    public PercentEscaper(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.<init>()
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.String r0 = ".*[0-9A-Za-z].*"
            boolean r0 = r2.matches(r0)
            if (r0 != 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            if (r3 == 0) goto L32
            java.lang.String r0 = " "
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L2a
            goto L32
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "plusForSpace cannot be specified when space is a 'safe' character"
            r2.<init>(r3)
            throw r2
        L32:
            r1.plusForSpace = r3
            boolean[] r2 = createSafeOctets(r2)
            r1.safeOctets = r2
            return
        L3b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Alphanumeric characters are always 'safe' and should not be explicitly specified"
            r2.<init>(r3)
            throw r2
    }

    private static boolean[] createSafeOctets(java.lang.String r5) {
            char[] r5 = r5.toCharArray()
            int r0 = r5.length
            r1 = -1
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r0) goto L13
            char r4 = r5[r3]
            int r1 = java.lang.Math.max(r4, r1)
            int r3 = r3 + 1
            goto L8
        L13:
            r0 = 1
            int r1 = r1 + r0
            boolean[] r1 = new boolean[r1]
            int r3 = r5.length
        L18:
            if (r2 >= r3) goto L21
            char r4 = r5[r2]
            r1[r4] = r0
            int r2 = r2 + 1
            goto L18
        L21:
            return r1
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public java.lang.String escape(java.lang.String r6) {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6)
            int r0 = r6.length()
            r1 = 0
        L8:
            if (r1 >= r0) goto L1f
            char r2 = r6.charAt(r1)
            boolean[] r3 = r5.safeOctets
            int r4 = r3.length
            if (r2 >= r4) goto L1b
            boolean r2 = r3[r2]
            if (r2 != 0) goto L18
            goto L1b
        L18:
            int r1 = r1 + 1
            goto L8
        L1b:
            java.lang.String r6 = r5.escapeSlow(r6, r1)
        L1f:
            return r6
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected char[] escape(int r15) {
            r14 = this;
            boolean[] r0 = r14.safeOctets
            int r1 = r0.length
            if (r15 >= r1) goto Lb
            boolean r0 = r0[r15]
            if (r0 == 0) goto Lb
            r15 = 0
            return r15
        Lb:
            r0 = 32
            if (r15 != r0) goto L16
            boolean r0 = r14.plusForSpace
            if (r0 == 0) goto L16
            char[] r15 = com.google.common.net.PercentEscaper.PLUS_SIGN
            return r15
        L16:
            r0 = 127(0x7f, float:1.78E-43)
            r1 = 1
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 37
            r6 = 3
            if (r15 > r0) goto L33
            char[] r0 = new char[r6]
            r0[r3] = r5
            char[] r3 = com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS
            r5 = r15 & 15
            char r5 = r3[r5]
            r0[r2] = r5
            int r15 = r15 >>> r4
            char r15 = r3[r15]
            r0[r1] = r15
            return r0
        L33:
            r0 = 2047(0x7ff, float:2.868E-42)
            r7 = 5
            r8 = 12
            r9 = 10
            r10 = 6
            r11 = 8
            if (r15 > r0) goto L64
            char[] r0 = new char[r10]
            r0[r3] = r5
            r0[r6] = r5
            char[] r3 = com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS
            r5 = r15 & 15
            char r5 = r3[r5]
            r0[r7] = r5
            int r5 = r15 >>> 4
            r5 = r5 & r6
            r5 = r5 | r11
            char r5 = r3[r5]
            r0[r4] = r5
            int r4 = r15 >>> 6
            r4 = r4 & 15
            char r4 = r3[r4]
            r0[r2] = r4
            int r15 = r15 >>> r9
            r15 = r15 | r8
            char r15 = r3[r15]
            r0[r1] = r15
            return r0
        L64:
            r0 = 65535(0xffff, float:9.1834E-41)
            r12 = 9
            r13 = 7
            if (r15 > r0) goto L9e
            char[] r0 = new char[r12]
            r0[r3] = r5
            r3 = 69
            r0[r1] = r3
            r0[r6] = r5
            r0[r10] = r5
            char[] r1 = com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS
            r3 = r15 & 15
            char r3 = r1[r3]
            r0[r11] = r3
            int r3 = r15 >>> 4
            r3 = r3 & r6
            r3 = r3 | r11
            char r3 = r1[r3]
            r0[r13] = r3
            int r3 = r15 >>> 6
            r3 = r3 & 15
            char r3 = r1[r3]
            r0[r7] = r3
            int r3 = r15 >>> 10
            r3 = r3 & r6
            r3 = r3 | r11
            char r3 = r1[r3]
            r0[r4] = r3
            int r15 = r15 >>> r8
            char r15 = r1[r15]
            r0[r2] = r15
            return r0
        L9e:
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r15 > r0) goto Leb
            char[] r0 = new char[r8]
            r0[r3] = r5
            r3 = 70
            r0[r1] = r3
            r0[r6] = r5
            r0[r10] = r5
            r0[r12] = r5
            char[] r1 = com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS
            r3 = r15 & 15
            char r3 = r1[r3]
            r5 = 11
            r0[r5] = r3
            int r3 = r15 >>> 4
            r3 = r3 & r6
            r3 = r3 | r11
            char r3 = r1[r3]
            r0[r9] = r3
            int r3 = r15 >>> 6
            r3 = r3 & 15
            char r3 = r1[r3]
            r0[r11] = r3
            int r3 = r15 >>> 10
            r3 = r3 & r6
            r3 = r3 | r11
            char r3 = r1[r3]
            r0[r13] = r3
            int r3 = r15 >>> 12
            r3 = r3 & 15
            char r3 = r1[r3]
            r0[r7] = r3
            int r3 = r15 >>> 16
            r3 = r3 & r6
            r3 = r3 | r11
            char r3 = r1[r3]
            r0[r4] = r3
            int r15 = r15 >>> 18
            r15 = r15 & r13
            char r15 = r1[r15]
            r0[r2] = r15
            return r0
        Leb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid unicode character value "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected int nextEscapeIndex(java.lang.CharSequence r4, int r5, int r6) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
        L3:
            if (r5 >= r6) goto L16
            char r0 = r4.charAt(r5)
            boolean[] r1 = r3.safeOctets
            int r2 = r1.length
            if (r0 >= r2) goto L16
            boolean r0 = r1[r0]
            if (r0 != 0) goto L13
            goto L16
        L13:
            int r5 = r5 + 1
            goto L3
        L16:
            return r5
    }
}
