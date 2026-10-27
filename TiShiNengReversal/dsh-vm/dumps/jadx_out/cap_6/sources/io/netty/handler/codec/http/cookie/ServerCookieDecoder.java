package io.netty.handler.codec.http.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ServerCookieDecoder extends io.netty.handler.codec.http.cookie.CookieDecoder {
    public static final io.netty.handler.codec.http.cookie.ServerCookieDecoder LAX = null;
    private static final java.lang.String RFC2965_DOMAIN = "$Domain";
    private static final java.lang.String RFC2965_PATH = "$Path";
    private static final java.lang.String RFC2965_PORT = "$Port";
    private static final java.lang.String RFC2965_VERSION = "$Version";
    public static final io.netty.handler.codec.http.cookie.ServerCookieDecoder STRICT = null;

    static {
            io.netty.handler.codec.http.cookie.ServerCookieDecoder r0 = new io.netty.handler.codec.http.cookie.ServerCookieDecoder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.codec.http.cookie.ServerCookieDecoder.STRICT = r0
            io.netty.handler.codec.http.cookie.ServerCookieDecoder r0 = new io.netty.handler.codec.http.cookie.ServerCookieDecoder
            r1 = 0
            r0.<init>(r1)
            io.netty.handler.codec.http.cookie.ServerCookieDecoder.LAX = r0
            return
    }

    private ServerCookieDecoder(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.util.Set<io.netty.handler.codec.http.cookie.Cookie> decode(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "header"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r14, r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 != 0) goto L11
            java.util.Set r14 = java.util.Collections.EMPTY_SET
            return r14
        L11:
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            r6 = 0
            r7 = 8
            r3 = 1
            r4 = 0
            java.lang.String r5 = "$Version"
            r2 = r14
            boolean r14 = r2.regionMatches(r3, r4, r5, r6, r7)
            r8 = 59
            r9 = 0
            if (r14 == 0) goto L30
            int r14 = r2.indexOf(r8)
            r3 = 1
            int r14 = r14 + r3
            r4 = r14
            r14 = 1
            goto L32
        L30:
            r14 = 0
            r4 = 0
        L32:
            if (r4 != r0) goto L35
            return r1
        L35:
            char r3 = r2.charAt(r4)
            r5 = 9
            if (r3 == r5) goto Lb0
            r5 = 10
            if (r3 == r5) goto Lb0
            r5 = 11
            if (r3 == r5) goto Lb0
            r5 = 12
            if (r3 == r5) goto Lb0
            r5 = 13
            if (r3 == r5) goto Lb0
            r5 = 32
            if (r3 == r5) goto Lb0
            r5 = 44
            if (r3 == r5) goto Lb0
            if (r3 != r8) goto L59
            goto Lb0
        L59:
            r3 = r4
        L5a:
            char r5 = r2.charAt(r3)
            r6 = -1
            if (r5 != r8) goto L65
            r5 = r3
            r10 = r5
        L63:
            r7 = -1
            goto L85
        L65:
            r7 = 61
            if (r5 != r7) goto L7e
            int r6 = r3 + 1
            if (r6 != r0) goto L72
            r5 = r3
            r10 = r6
            r6 = 0
            r7 = 0
            goto L85
        L72:
            int r5 = r2.indexOf(r8, r6)
            if (r5 <= 0) goto L79
            goto L7a
        L79:
            r5 = r0
        L7a:
            r7 = r5
            r10 = r7
            r5 = r3
            goto L85
        L7e:
            int r3 = r3 + 1
            if (r3 != r0) goto L5a
            r5 = r0
            r10 = r3
            goto L63
        L85:
            if (r14 == 0) goto La2
            java.lang.String r3 = "$Path"
            r11 = 5
            boolean r3 = r2.regionMatches(r4, r3, r9, r11)
            if (r3 != 0) goto Lae
            java.lang.String r3 = "$Domain"
            r12 = 7
            boolean r3 = r2.regionMatches(r4, r3, r9, r12)
            if (r3 != 0) goto Lae
            java.lang.String r3 = "$Port"
            boolean r3 = r2.regionMatches(r4, r3, r9, r11)
            if (r3 == 0) goto La2
            goto Lae
        La2:
            r3 = r2
            r2 = r13
            io.netty.handler.codec.http.cookie.DefaultCookie r4 = r2.initCookie(r3, r4, r5, r6, r7)
            r2 = r3
            if (r4 == 0) goto Lae
            r1.add(r4)
        Lae:
            r4 = r10
            goto L32
        Lb0:
            int r4 = r4 + 1
            goto L32
    }
}
