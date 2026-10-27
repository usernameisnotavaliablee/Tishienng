package io.netty.handler.codec.http.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class CookieDecoder {
    private final io.netty.util.internal.logging.InternalLogger logger;
    private final boolean strict;

    protected CookieDecoder(boolean r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r1.getClass()
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            r1.logger = r0
            r1.strict = r2
            return
    }

    protected io.netty.handler.codec.http.cookie.DefaultCookie initCookie(java.lang.String r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = 0
            r1 = -1
            if (r5 == r1) goto L83
            if (r5 != r6) goto L8
            goto L83
        L8:
            if (r7 != r1) goto L12
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            java.lang.String r5 = "Skipping cookie with null value"
            r4.debug(r5)
            return r0
        L12:
            java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r4, r7, r8)
            java.lang.CharSequence r2 = io.netty.handler.codec.http.cookie.CookieUtil.unwrapValue(r1)
            if (r2 != 0) goto L24
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            java.lang.String r5 = "Skipping cookie because starting quotes are not properly balanced in '{}'"
            r4.debug(r5, r1)
            return r0
        L24:
            java.lang.String r4 = r4.substring(r5, r6)
            boolean r5 = r3.strict
            if (r5 == 0) goto L4a
            int r5 = io.netty.handler.codec.http.cookie.CookieUtil.firstInvalidCookieNameOctet(r4)
            if (r5 < 0) goto L4a
            io.netty.util.internal.logging.InternalLogger r6 = r3.logger
            boolean r6 = r6.isDebugEnabled()
            if (r6 == 0) goto L49
            io.netty.util.internal.logging.InternalLogger r6 = r3.logger
            char r5 = r4.charAt(r5)
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            java.lang.String r7 = "Skipping cookie because name '{}' contains invalid char '{}'"
            r6.debug(r7, r4, r5)
        L49:
            return r0
        L4a:
            int r5 = r2.length()
            int r8 = r8 - r7
            if (r5 == r8) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = 0
        L54:
            boolean r6 = r3.strict
            if (r6 == 0) goto L76
            int r6 = io.netty.handler.codec.http.cookie.CookieUtil.firstInvalidCookieValueOctet(r2)
            if (r6 < 0) goto L76
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            boolean r4 = r4.isDebugEnabled()
            if (r4 == 0) goto L75
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            char r5 = r2.charAt(r6)
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            java.lang.String r6 = "Skipping cookie because value '{}' contains invalid char '{}'"
            r4.debug(r6, r2, r5)
        L75:
            return r0
        L76:
            io.netty.handler.codec.http.cookie.DefaultCookie r6 = new io.netty.handler.codec.http.cookie.DefaultCookie
            java.lang.String r7 = r2.toString()
            r6.<init>(r4, r7)
            r6.setWrap(r5)
            return r6
        L83:
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            java.lang.String r5 = "Skipping cookie with null name"
            r4.debug(r5)
            return r0
    }
}
