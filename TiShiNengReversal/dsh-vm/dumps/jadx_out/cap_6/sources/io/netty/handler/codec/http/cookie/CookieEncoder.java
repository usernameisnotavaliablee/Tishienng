package io.netty.handler.codec.http.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class CookieEncoder {
    protected final boolean strict;

    protected CookieEncoder(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.strict = r1
            return
    }

    protected void validateCookie(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.strict
            if (r0 == 0) goto L64
            int r0 = io.netty.handler.codec.http.cookie.CookieUtil.firstInvalidCookieNameOctet(r4)
            if (r0 >= 0) goto L49
            java.lang.CharSequence r4 = io.netty.handler.codec.http.cookie.CookieUtil.unwrapValue(r5)
            if (r4 == 0) goto L32
            int r5 = io.netty.handler.codec.http.cookie.CookieUtil.firstInvalidCookieValueOctet(r4)
            if (r5 >= 0) goto L17
            goto L64
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cookie value contains an invalid char: "
            r1.append(r2)
            char r4 = r4.charAt(r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L32:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cookie value wrapping quotes are not balanced: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L49:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cookie name contains an invalid char: "
            r1.append(r2)
            char r4 = r4.charAt(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            throw r5
        L64:
            return
    }
}
