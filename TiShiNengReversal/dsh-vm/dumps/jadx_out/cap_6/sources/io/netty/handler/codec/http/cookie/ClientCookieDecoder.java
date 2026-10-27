package io.netty.handler.codec.http.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ClientCookieDecoder extends io.netty.handler.codec.http.cookie.CookieDecoder {
    public static final io.netty.handler.codec.http.cookie.ClientCookieDecoder LAX = null;
    public static final io.netty.handler.codec.http.cookie.ClientCookieDecoder STRICT = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class CookieBuilder {
        private final io.netty.handler.codec.http.cookie.DefaultCookie cookie;
        private java.lang.String domain;
        private int expiresEnd;
        private int expiresStart;
        private final java.lang.String header;
        private boolean httpOnly;
        private long maxAge;
        private java.lang.String path;
        private boolean secure;

        CookieBuilder(io.netty.handler.codec.http.cookie.DefaultCookie r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                r0 = -9223372036854775808
                r2.maxAge = r0
                r2.cookie = r3
                r2.header = r4
                return
        }

        private java.lang.String computeValue(int r2, int r3) {
                r1 = this;
                boolean r0 = isValueDefined(r2, r3)
                if (r0 == 0) goto Ld
                java.lang.String r0 = r1.header
                java.lang.String r2 = r0.substring(r2, r3)
                return r2
            Ld:
                r2 = 0
                return r2
        }

        private static boolean isValueDefined(int r1, int r2) {
                r0 = -1
                if (r1 == r0) goto L7
                if (r1 == r2) goto L7
                r1 = 1
                return r1
            L7:
                r1 = 0
                return r1
        }

        private long mergeMaxAgeAndExpires() {
                r7 = this;
                long r0 = r7.maxAge
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L9
                return r0
            L9:
                int r0 = r7.expiresStart
                int r1 = r7.expiresEnd
                boolean r0 = isValueDefined(r0, r1)
                if (r0 == 0) goto L39
                java.lang.String r0 = r7.header
                int r1 = r7.expiresStart
                int r4 = r7.expiresEnd
                java.util.Date r0 = io.netty.handler.codec.DateFormatter.parseHttpDate(r0, r1, r4)
                if (r0 == 0) goto L39
                long r0 = r0.getTime()
                long r2 = java.lang.System.currentTimeMillis()
                long r0 = r0 - r2
                r2 = 1000(0x3e8, double:4.94E-321)
                long r4 = r0 / r2
                long r0 = r0 % r2
                r2 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 == 0) goto L35
                r0 = 1
                goto L36
            L35:
                r0 = 0
            L36:
                long r0 = (long) r0
                long r4 = r4 + r0
                return r4
            L39:
                return r2
        }

        private void parse4(int r7, int r8, int r9) {
                r6 = this;
                java.lang.String r0 = r6.header
                r4 = 0
                r5 = 4
                r1 = 1
                java.lang.String r3 = "Path"
                r2 = r7
                boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r7 == 0) goto L14
                java.lang.String r7 = r6.computeValue(r8, r9)
                r6.path = r7
            L14:
                return
        }

        private void parse6(int r7, int r8, int r9) {
                r6 = this;
                java.lang.String r0 = r6.header
                r4 = 0
                r5 = 5
                r1 = 1
                java.lang.String r3 = "Domain"
                r2 = r7
                boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r7 == 0) goto L15
                java.lang.String r7 = r6.computeValue(r8, r9)
                r6.domain = r7
                return
            L15:
                java.lang.String r0 = r6.header
                r4 = 0
                r5 = 5
                r1 = 1
                java.lang.String r3 = "Secure"
                boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r7 == 0) goto L25
                r7 = 1
                r6.secure = r7
            L25:
                return
        }

        private void parse7(int r7, int r8, int r9) {
                r6 = this;
                java.lang.String r0 = r6.header
                r4 = 0
                r5 = 7
                r1 = 1
                java.lang.String r3 = "Expires"
                r2 = r7
                boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r7 == 0) goto L13
                r6.expiresStart = r8
                r6.expiresEnd = r9
                return
            L13:
                java.lang.String r0 = r6.header
                r4 = 0
                r5 = 7
                r1 = 1
                java.lang.String r3 = "Max-Age"
                boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r7 == 0) goto L27
                java.lang.String r7 = r6.computeValue(r8, r9)
                r6.setMaxAge(r7)
            L27:
                return
        }

        private void parse8(int r7) {
                r6 = this;
                java.lang.String r0 = r6.header
                r4 = 0
                r5 = 8
                r1 = 1
                java.lang.String r3 = "HTTPOnly"
                r2 = r7
                boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r7 == 0) goto L12
                r7 = 1
                r6.httpOnly = r7
            L12:
                return
        }

        private void setMaxAge(java.lang.String r5) {
                r4 = this;
                long r0 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> Lc
                r2 = 0
                long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.NumberFormatException -> Lc
                r4.maxAge = r0     // Catch: java.lang.NumberFormatException -> Lc
            Lc:
                return
        }

        void appendAttribute(int r2, int r3, int r4, int r5) {
                r1 = this;
                int r3 = r3 - r2
                r0 = 4
                if (r3 != r0) goto L8
                r1.parse4(r2, r4, r5)
                return
            L8:
                r0 = 6
                if (r3 != r0) goto Lf
                r1.parse6(r2, r4, r5)
                return
            Lf:
                r0 = 7
                if (r3 != r0) goto L16
                r1.parse7(r2, r4, r5)
                return
            L16:
                r4 = 8
                if (r3 != r4) goto L1d
                r1.parse8(r2)
            L1d:
                return
        }

        io.netty.handler.codec.http.cookie.Cookie cookie() {
                r3 = this;
                io.netty.handler.codec.http.cookie.DefaultCookie r0 = r3.cookie
                java.lang.String r1 = r3.domain
                r0.setDomain(r1)
                io.netty.handler.codec.http.cookie.DefaultCookie r0 = r3.cookie
                java.lang.String r1 = r3.path
                r0.setPath(r1)
                io.netty.handler.codec.http.cookie.DefaultCookie r0 = r3.cookie
                long r1 = r3.mergeMaxAgeAndExpires()
                r0.setMaxAge(r1)
                io.netty.handler.codec.http.cookie.DefaultCookie r0 = r3.cookie
                boolean r1 = r3.secure
                r0.setSecure(r1)
                io.netty.handler.codec.http.cookie.DefaultCookie r0 = r3.cookie
                boolean r1 = r3.httpOnly
                r0.setHttpOnly(r1)
                io.netty.handler.codec.http.cookie.DefaultCookie r0 = r3.cookie
                return r0
        }
    }

    static {
            io.netty.handler.codec.http.cookie.ClientCookieDecoder r0 = new io.netty.handler.codec.http.cookie.ClientCookieDecoder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.codec.http.cookie.ClientCookieDecoder.STRICT = r0
            io.netty.handler.codec.http.cookie.ClientCookieDecoder r0 = new io.netty.handler.codec.http.cookie.ClientCookieDecoder
            r1 = 0
            r0.<init>(r1)
            io.netty.handler.codec.http.cookie.ClientCookieDecoder.LAX = r0
            return
    }

    private ClientCookieDecoder(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public io.netty.handler.codec.http.cookie.Cookie decode(java.lang.String r13) {
            r12 = this;
            java.lang.String r0 = "header"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = 0
            r9 = r1
            r5 = 0
        L13:
            if (r5 != r0) goto L16
            goto L1e
        L16:
            char r3 = r13.charAt(r5)
            r4 = 44
            if (r3 != r4) goto L26
        L1e:
            if (r9 == 0) goto L25
            io.netty.handler.codec.http.cookie.Cookie r13 = r9.cookie()
            return r13
        L25:
            return r1
        L26:
            r6 = 9
            if (r3 == r6) goto L42
            r6 = 10
            if (r3 == r6) goto L42
            r6 = 11
            if (r3 == r6) goto L42
            r6 = 12
            if (r3 == r6) goto L42
            r6 = 13
            if (r3 == r6) goto L42
            r6 = 32
            if (r3 == r6) goto L42
            r6 = 59
            if (r3 != r6) goto L47
        L42:
            r11 = r5
            r5 = r13
            r13 = r11
            goto La4
        L47:
            r3 = r5
        L48:
            char r7 = r13.charAt(r3)
            r8 = -1
            if (r7 != r6) goto L53
            r6 = r3
            r10 = r6
        L51:
            r7 = -1
            goto L74
        L53:
            r10 = 61
            if (r7 != r10) goto L6d
            int r8 = r3 + 1
            if (r8 != r0) goto L60
            r6 = r3
            r10 = r8
            r7 = 0
            r8 = 0
            goto L74
        L60:
            int r6 = r13.indexOf(r6, r8)
            if (r6 <= 0) goto L67
            goto L68
        L67:
            r6 = r0
        L68:
            r10 = r6
            r7 = r8
            r6 = r3
            r8 = r10
            goto L74
        L6d:
            int r3 = r3 + 1
            if (r3 != r0) goto L9d
            r6 = r0
            r10 = r3
            goto L51
        L74:
            if (r8 <= 0) goto L80
            int r3 = r8 + (-1)
            char r3 = r13.charAt(r3)
            if (r3 != r4) goto L80
            int r8 = r8 + (-1)
        L80:
            if (r9 != 0) goto L93
            r3 = r12
            r4 = r13
            io.netty.handler.codec.http.cookie.DefaultCookie r13 = r3.initCookie(r4, r5, r6, r7, r8)
            r5 = r4
            if (r13 != 0) goto L8c
            return r1
        L8c:
            io.netty.handler.codec.http.cookie.ClientCookieDecoder$CookieBuilder r3 = new io.netty.handler.codec.http.cookie.ClientCookieDecoder$CookieBuilder
            r3.<init>(r13, r5)
            r9 = r3
            goto L99
        L93:
            r11 = r5
            r5 = r13
            r13 = r11
            r9.appendAttribute(r13, r6, r7, r8)
        L99:
            r13 = r5
            r5 = r10
            goto L13
        L9d:
            r11 = r5
            r5 = r13
            r13 = r11
            r11 = r5
            r5 = r13
            r13 = r11
            goto L48
        La4:
            int r13 = r13 + 1
            r11 = r5
            r5 = r13
            r13 = r11
            goto L13
    }
}
