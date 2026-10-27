package io.netty.handler.codec.http.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class CookieUtil {
    private static final java.util.BitSet VALID_COOKIE_ATTRIBUTE_VALUE_OCTETS = null;
    private static final java.util.BitSet VALID_COOKIE_NAME_OCTETS = null;
    private static final java.util.BitSet VALID_COOKIE_VALUE_OCTETS = null;

    static {
            java.util.BitSet r0 = validCookieNameOctets()
            io.netty.handler.codec.http.cookie.CookieUtil.VALID_COOKIE_NAME_OCTETS = r0
            java.util.BitSet r0 = validCookieValueOctets()
            io.netty.handler.codec.http.cookie.CookieUtil.VALID_COOKIE_VALUE_OCTETS = r0
            java.util.BitSet r0 = validCookieAttributeValueOctets()
            io.netty.handler.codec.http.cookie.CookieUtil.VALID_COOKIE_ATTRIBUTE_VALUE_OCTETS = r0
            return
    }

    private CookieUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static void add(java.lang.StringBuilder r0, java.lang.String r1) {
            r0.append(r1)
            r1 = 59
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            return
    }

    static void add(java.lang.StringBuilder r0, java.lang.String r1, long r2) {
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            r0.append(r2)
            r1 = 59
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            return
    }

    static void add(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2) {
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            r0.append(r2)
            r1 = 59
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            return
    }

    static void addQuoted(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2) {
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            r1 = 34
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r1 = 59
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            return
    }

    static int firstInvalidCookieNameOctet(java.lang.CharSequence r1) {
            java.util.BitSet r0 = io.netty.handler.codec.http.cookie.CookieUtil.VALID_COOKIE_NAME_OCTETS
            int r1 = firstInvalidOctet(r1, r0)
            return r1
    }

    static int firstInvalidCookieValueOctet(java.lang.CharSequence r1) {
            java.util.BitSet r0 = io.netty.handler.codec.http.cookie.CookieUtil.VALID_COOKIE_VALUE_OCTETS
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

    static java.lang.StringBuilder stringBuilder() {
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            java.lang.StringBuilder r0 = r0.stringBuilder()
            return r0
    }

    static java.lang.String stripTrailingSeparator(java.lang.StringBuilder r1) {
            int r0 = r1.length()
            if (r0 <= 0) goto Lf
            int r0 = r1.length()
            int r0 = r0 + (-2)
            r1.setLength(r0)
        Lf:
            java.lang.String r1 = r1.toString()
            return r1
    }

    static java.lang.String stripTrailingSeparatorOrNull(java.lang.StringBuilder r1) {
            int r0 = r1.length()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = stripTrailingSeparator(r1)
            return r1
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

    private static java.util.BitSet validCookieAttributeValueOctets() {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r1 = 32
        L7:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 >= r2) goto L11
            r0.set(r1)
            int r1 = r1 + 1
            goto L7
        L11:
            r1 = 59
            r2 = 0
            r0.set(r1, r2)
            return r0
    }

    private static java.util.BitSet validCookieNameOctets() {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r1 = 32
        L7:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 >= r2) goto L11
            r0.set(r1)
            int r1 = r1 + 1
            goto L7
        L11:
            r1 = 19
            int[] r2 = new int[r1]
            r2 = {x0026: FILL_ARRAY_DATA , data: [40, 41, 60, 62, 64, 44, 59, 58, 92, 34, 47, 91, 93, 63, 61, 123, 125, 32, 9} // fill-array
            r3 = 0
            r4 = 0
        L1a:
            if (r4 >= r1) goto L24
            r5 = r2[r4]
            r0.set(r5, r3)
            int r4 = r4 + 1
            goto L1a
        L24:
            return r0
    }

    private static java.util.BitSet validCookieValueOctets() {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r1 = 33
            r0.set(r1)
            r1 = 35
        Lc:
            r2 = 43
            if (r1 > r2) goto L16
            r0.set(r1)
            int r1 = r1 + 1
            goto Lc
        L16:
            r1 = 45
        L18:
            r2 = 58
            if (r1 > r2) goto L22
            r0.set(r1)
            int r1 = r1 + 1
            goto L18
        L22:
            r1 = 60
        L24:
            r2 = 91
            if (r1 > r2) goto L2e
            r0.set(r1)
            int r1 = r1 + 1
            goto L24
        L2e:
            r1 = 93
        L30:
            r2 = 126(0x7e, float:1.77E-43)
            if (r1 > r2) goto L3a
            r0.set(r1)
            int r1 = r1 + 1
            goto L30
        L3a:
            return r0
    }

    static java.lang.String validateAttributeValue(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r4 = r4.trim()
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.util.BitSet r0 = io.netty.handler.codec.http.cookie.CookieUtil.VALID_COOKIE_ATTRIBUTE_VALUE_OCTETS
            int r0 = firstInvalidOctet(r4, r0)
            r1 = -1
            if (r0 != r1) goto L19
            return r4
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = " contains the prohibited characters: "
            r2.append(r3)
            char r3 = r4.charAt(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r1.<init>(r3)
            throw r1
    }
}
