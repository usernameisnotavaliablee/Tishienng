package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CharsetUtil {
    private static final java.nio.charset.Charset[] CHARSETS = null;
    public static final java.nio.charset.Charset ISO_8859_1 = null;
    public static final java.nio.charset.Charset US_ASCII = null;
    public static final java.nio.charset.Charset UTF_16 = null;
    public static final java.nio.charset.Charset UTF_16BE = null;
    public static final java.nio.charset.Charset UTF_16LE = null;
    public static final java.nio.charset.Charset UTF_8 = null;

    static {
            java.lang.String r0 = "UTF-16"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            io.netty.util.CharsetUtil.UTF_16 = r0
            java.lang.String r1 = "UTF-16BE"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            io.netty.util.CharsetUtil.UTF_16BE = r1
            java.lang.String r2 = "UTF-16LE"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            io.netty.util.CharsetUtil.UTF_16LE = r2
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            io.netty.util.CharsetUtil.UTF_8 = r3
            java.lang.String r4 = "ISO-8859-1"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            io.netty.util.CharsetUtil.ISO_8859_1 = r4
            java.lang.String r5 = "US-ASCII"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)
            io.netty.util.CharsetUtil.US_ASCII = r5
            r6 = 6
            java.nio.charset.Charset[] r6 = new java.nio.charset.Charset[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 5
            r6[r0] = r5
            io.netty.util.CharsetUtil.CHARSETS = r6
            return
    }

    private CharsetUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.nio.charset.CharsetDecoder decoder(java.nio.charset.Charset r2) {
            java.lang.String r0 = "charset"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            java.util.Map r0 = r0.charsetDecoderCache()
            java.lang.Object r1 = r0.get(r2)
            java.nio.charset.CharsetDecoder r1 = (java.nio.charset.CharsetDecoder) r1
            if (r1 == 0) goto L23
            java.nio.charset.CharsetDecoder r2 = r1.reset()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r2 = r2.onMalformedInput(r0)
            r2.onUnmappableCharacter(r0)
            return r1
        L23:
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r1 = decoder(r2, r1, r1)
            r0.put(r2, r1)
            return r1
    }

    public static java.nio.charset.CharsetDecoder decoder(java.nio.charset.Charset r0, java.nio.charset.CodingErrorAction r1) {
            java.nio.charset.CharsetDecoder r0 = decoder(r0, r1, r1)
            return r0
    }

    public static java.nio.charset.CharsetDecoder decoder(java.nio.charset.Charset r1, java.nio.charset.CodingErrorAction r2, java.nio.charset.CodingErrorAction r3) {
            java.lang.String r0 = "charset"
            io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            java.nio.charset.CharsetDecoder r1 = r1.newDecoder()
            java.nio.charset.CharsetDecoder r2 = r1.onMalformedInput(r2)
            r2.onUnmappableCharacter(r3)
            return r1
    }

    public static java.nio.charset.CharsetEncoder encoder(java.nio.charset.Charset r2) {
            java.lang.String r0 = "charset"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            java.util.Map r0 = r0.charsetEncoderCache()
            java.lang.Object r1 = r0.get(r2)
            java.nio.charset.CharsetEncoder r1 = (java.nio.charset.CharsetEncoder) r1
            if (r1 == 0) goto L23
            java.nio.charset.CharsetEncoder r2 = r1.reset()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r2 = r2.onMalformedInput(r0)
            r2.onUnmappableCharacter(r0)
            return r1
        L23:
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r1 = encoder(r2, r1, r1)
            r0.put(r2, r1)
            return r1
    }

    public static java.nio.charset.CharsetEncoder encoder(java.nio.charset.Charset r0, java.nio.charset.CodingErrorAction r1) {
            java.nio.charset.CharsetEncoder r0 = encoder(r0, r1, r1)
            return r0
    }

    public static java.nio.charset.CharsetEncoder encoder(java.nio.charset.Charset r1, java.nio.charset.CodingErrorAction r2, java.nio.charset.CodingErrorAction r3) {
            java.lang.String r0 = "charset"
            io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            java.nio.charset.CharsetEncoder r1 = r1.newEncoder()
            java.nio.charset.CharsetEncoder r2 = r1.onMalformedInput(r2)
            r2.onUnmappableCharacter(r3)
            return r1
    }

    @java.lang.Deprecated
    public static java.nio.charset.CharsetDecoder getDecoder(java.nio.charset.Charset r0) {
            java.nio.charset.CharsetDecoder r0 = decoder(r0)
            return r0
    }

    @java.lang.Deprecated
    public static java.nio.charset.CharsetEncoder getEncoder(java.nio.charset.Charset r0) {
            java.nio.charset.CharsetEncoder r0 = encoder(r0)
            return r0
    }

    public static java.nio.charset.Charset[] values() {
            java.nio.charset.Charset[] r0 = io.netty.util.CharsetUtil.CHARSETS
            return r0
    }
}
