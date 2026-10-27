package com.google.common.escape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ArrayBasedUnicodeEscaper extends com.google.common.escape.UnicodeEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    protected ArrayBasedUnicodeEscaper(com.google.common.escape.ArrayBasedEscaperMap r1, int r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r4) {
            r0 = this;
            r0.<init>()
            com.google.common.base.Preconditions.checkNotNull(r1)
            char[][] r1 = r1.getReplacementArray()
            r0.replacements = r1
            int r1 = r1.length
            r0.replacementsLength = r1
            if (r3 >= r2) goto L15
            r3 = -1
            r2 = 2147483647(0x7fffffff, float:NaN)
        L15:
            r0.safeMin = r2
            r0.safeMax = r3
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r1) goto L27
            r1 = 65535(0xffff, float:9.1834E-41)
            r0.safeMinChar = r1
            r1 = 0
            r0.safeMaxChar = r1
            return
        L27:
            char r1 = (char) r2
            r0.safeMinChar = r1
            r1 = 55295(0xd7ff, float:7.7485E-41)
            int r1 = java.lang.Math.min(r3, r1)
            char r1 = (char) r1
            r0.safeMaxChar = r1
            return
    }

    protected ArrayBasedUnicodeEscaper(java.util.Map<java.lang.Character, java.lang.String> r1, int r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r4) {
            r0 = this;
            com.google.common.escape.ArrayBasedEscaperMap r1 = com.google.common.escape.ArrayBasedEscaperMap.create(r1)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final java.lang.String escape(java.lang.String r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            r0 = 0
        L4:
            int r1 = r4.length()
            if (r0 >= r1) goto L28
            char r1 = r4.charAt(r0)
            int r2 = r3.replacementsLength
            if (r1 >= r2) goto L18
            char[][] r2 = r3.replacements
            r2 = r2[r1]
            if (r2 != 0) goto L24
        L18:
            char r2 = r3.safeMaxChar
            if (r1 > r2) goto L24
            char r2 = r3.safeMinChar
            if (r1 >= r2) goto L21
            goto L24
        L21:
            int r0 = r0 + 1
            goto L4
        L24:
            java.lang.String r4 = r3.escapeSlow(r4, r0)
        L28:
            return r4
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected final char[] escape(int r2) {
            r1 = this;
            int r0 = r1.replacementsLength
            if (r2 >= r0) goto Lb
            char[][] r0 = r1.replacements
            r0 = r0[r2]
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = r1.safeMin
            if (r2 < r0) goto L15
            int r0 = r1.safeMax
            if (r2 > r0) goto L15
            r2 = 0
            return r2
        L15:
            char[] r2 = r1.escapeUnsafe(r2)
            return r2
    }

    protected abstract char[] escapeUnsafe(int r1);

    @Override // com.google.common.escape.UnicodeEscaper
    protected final int nextEscapeIndex(java.lang.CharSequence r3, int r4, int r5) {
            r2 = this;
        L0:
            if (r4 >= r5) goto L1c
            char r0 = r3.charAt(r4)
            int r1 = r2.replacementsLength
            if (r0 >= r1) goto L10
            char[][] r1 = r2.replacements
            r1 = r1[r0]
            if (r1 != 0) goto L1c
        L10:
            char r1 = r2.safeMaxChar
            if (r0 > r1) goto L1c
            char r1 = r2.safeMinChar
            if (r0 >= r1) goto L19
            goto L1c
        L19:
            int r4 = r4 + 1
            goto L0
        L1c:
            return r4
    }
}
