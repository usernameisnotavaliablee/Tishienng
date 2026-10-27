package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class CookieUtil {
    private static final java.util.BitSet VALID_COOKIE_NAME_OCTETS = null;
    private static final java.util.BitSet VALID_COOKIE_VALUE_OCTETS = null;

    static {
            java.util.BitSet r0 = validCookieValueOctets()
            io.netty.handler.codec.http.CookieUtil.VALID_COOKIE_VALUE_OCTETS = r0
            java.util.BitSet r0 = validCookieNameOctets(r0)
            io.netty.handler.codec.http.CookieUtil.VALID_COOKIE_NAME_OCTETS = r0
            return
    }

    private CookieUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static int firstInvalidCookieNameOctet(java.lang.CharSequence r1) {
            java.util.BitSet r0 = io.netty.handler.codec.http.CookieUtil.VALID_COOKIE_NAME_OCTETS
            int r1 = firstInvalidOctet(r1, r0)
            return r1
    }

    static int firstInvalidCookieValueOctet(java.lang.CharSequence r1) {
            java.util.BitSet r0 = io.netty.handler.codec.http.CookieUtil.VALID_COOKIE_VALUE_OCTETS
            int r1 = firstInvalidOctet(r1, r0)
            return r1
    }

    static int firstInvalidOctet(java.lang.CharSequence r2, java.util.BitSet r3) {
            r0 = 0
        L1:
            int r1 = r2.length()
            if (r0 >= r1) goto L15
            char r1 = r2.charAt(r0)
            boolean r1 = r3.get(r1)
            if (r1 != 0) goto L12
            return r0
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            r2 = -1
            return r2
    }

    static java.lang.CharSequence unwrapValue(java.lang.CharSequence r5) {
            int r0 = r5.length()
            if (r0 <= 0) goto L26
            r1 = 0
            char r1 = r5.charAt(r1)
            r2 = 34
            if (r1 != r2) goto L26
            r1 = 2
            if (r0 < r1) goto L25
            int r3 = r0 + (-1)
            char r4 = r5.charAt(r3)
            if (r4 != r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.String r5 = ""
            return r5
        L1f:
            r0 = 1
            java.lang.CharSequence r5 = r5.subSequence(r0, r3)
            return r5
        L25:
            r5 = 0
        L26:
            return r5
    }

    private static java.util.BitSet validCookieNameOctets(java.util.BitSet r2) {
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 8
            r0.<init>(r1)
            r0.or(r2)
            r2 = 40
            r1 = 0
            r0.set(r2, r1)
            r2 = 41
            r0.set(r2, r1)
            r2 = 60
            r0.set(r2, r1)
            r2 = 62
            r0.set(r2, r1)
            r2 = 64
            r0.set(r2, r1)
            r2 = 58
            r0.set(r2, r1)
            r2 = 47
            r0.set(r2, r1)
            r2 = 91
            r0.set(r2, r1)
            r2 = 93
            r0.set(r2, r1)
            r2 = 63
            r0.set(r2, r1)
            r2 = 61
            r0.set(r2, r1)
            r2 = 123(0x7b, float:1.72E-43)
            r0.set(r2, r1)
            r2 = 125(0x7d, float:1.75E-43)
            r0.set(r2, r1)
            r2 = 32
            r0.set(r2, r1)
            r2 = 9
            r0.set(r2, r1)
            return r0
    }

    private static java.util.BitSet validCookieValueOctets() {
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 8
            r0.<init>(r1)
            r1 = 35
        L9:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 >= r2) goto L13
            r0.set(r1)
            int r1 = r1 + 1
            goto L9
        L13:
            r1 = 34
            r2 = 0
            r0.set(r1, r2)
            r1 = 44
            r0.set(r1, r2)
            r1 = 59
            r0.set(r1, r2)
            r1 = 92
            r0.set(r1, r2)
            return r0
    }
}
