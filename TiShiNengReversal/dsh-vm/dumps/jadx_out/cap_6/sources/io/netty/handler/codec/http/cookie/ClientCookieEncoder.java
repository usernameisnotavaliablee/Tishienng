package io.netty.handler.codec.http.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ClientCookieEncoder extends io.netty.handler.codec.http.cookie.CookieEncoder {
    private static final java.util.Comparator<io.netty.handler.codec.http.cookie.Cookie> COOKIE_COMPARATOR = null;
    public static final io.netty.handler.codec.http.cookie.ClientCookieEncoder LAX = null;
    public static final io.netty.handler.codec.http.cookie.ClientCookieEncoder STRICT = null;


    static {
            io.netty.handler.codec.http.cookie.ClientCookieEncoder r0 = new io.netty.handler.codec.http.cookie.ClientCookieEncoder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.codec.http.cookie.ClientCookieEncoder.STRICT = r0
            io.netty.handler.codec.http.cookie.ClientCookieEncoder r0 = new io.netty.handler.codec.http.cookie.ClientCookieEncoder
            r1 = 0
            r0.<init>(r1)
            io.netty.handler.codec.http.cookie.ClientCookieEncoder.LAX = r0
            io.netty.handler.codec.http.cookie.ClientCookieEncoder$1 r0 = new io.netty.handler.codec.http.cookie.ClientCookieEncoder$1
            r0.<init>()
            io.netty.handler.codec.http.cookie.ClientCookieEncoder.COOKIE_COMPARATOR = r0
            return
    }

    private ClientCookieEncoder(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void encode(java.lang.StringBuilder r3, io.netty.handler.codec.http.cookie.Cookie r4) {
            r2 = this;
            java.lang.String r0 = r4.name()
            java.lang.String r1 = r4.value()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r4.value()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            r2.validateCookie(r0, r1)
            boolean r4 = r4.wrap()
            if (r4 == 0) goto L1e
            io.netty.handler.codec.http.cookie.CookieUtil.addQuoted(r3, r0, r1)
            return
        L1e:
            io.netty.handler.codec.http.cookie.CookieUtil.add(r3, r0, r1)
            return
    }

    public java.lang.String encode(io.netty.handler.codec.http.cookie.Cookie r3) {
            r2 = this;
            java.lang.StringBuilder r0 = io.netty.handler.codec.http.cookie.CookieUtil.stringBuilder()
            java.lang.String r1 = "cookie"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            io.netty.handler.codec.http.cookie.Cookie r3 = (io.netty.handler.codec.http.cookie.Cookie) r3
            r2.encode(r0, r3)
            java.lang.String r3 = io.netty.handler.codec.http.cookie.CookieUtil.stripTrailingSeparator(r0)
            return r3
    }

    public java.lang.String encode(java.lang.Iterable<? extends io.netty.handler.codec.http.cookie.Cookie> r5) {
            r4 = this;
            java.lang.String r0 = "cookies"
            java.lang.Object r5 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L14
            r5 = 0
            return r5
        L14:
            java.lang.StringBuilder r0 = io.netty.handler.codec.http.cookie.CookieUtil.stringBuilder()
            boolean r1 = r4.strict
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r5.next()
            io.netty.handler.codec.http.cookie.Cookie r1 = (io.netty.handler.codec.http.cookie.Cookie) r1
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L2c
            r4.encode(r0, r1)
            goto L6e
        L2c:
            io.netty.util.internal.InternalThreadLocalMap r2 = io.netty.util.internal.InternalThreadLocalMap.get()
            java.util.ArrayList r2 = r2.arrayList()
            r2.add(r1)
        L37:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r5.next()
            r2.add(r1)
            goto L37
        L45:
            r5 = 0
            io.netty.handler.codec.http.cookie.Cookie[] r1 = new io.netty.handler.codec.http.cookie.Cookie[r5]
            java.lang.Object[] r1 = r2.toArray(r1)
            io.netty.handler.codec.http.cookie.Cookie[] r1 = (io.netty.handler.codec.http.cookie.Cookie[]) r1
            java.util.Comparator<io.netty.handler.codec.http.cookie.Cookie> r2 = io.netty.handler.codec.http.cookie.ClientCookieEncoder.COOKIE_COMPARATOR
            java.util.Arrays.sort(r1, r2)
            int r2 = r1.length
        L54:
            if (r5 >= r2) goto L6e
            r3 = r1[r5]
            r4.encode(r0, r3)
            int r5 = r5 + 1
            goto L54
        L5e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r5.next()
            io.netty.handler.codec.http.cookie.Cookie r1 = (io.netty.handler.codec.http.cookie.Cookie) r1
            r4.encode(r0, r1)
            goto L5e
        L6e:
            java.lang.String r5 = io.netty.handler.codec.http.cookie.CookieUtil.stripTrailingSeparatorOrNull(r0)
            return r5
    }

    public java.lang.String encode(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            io.netty.handler.codec.http.cookie.DefaultCookie r0 = new io.netty.handler.codec.http.cookie.DefaultCookie
            r0.<init>(r2, r3)
            java.lang.String r2 = r1.encode(r0)
            return r2
    }

    public java.lang.String encode(java.util.Collection<? extends io.netty.handler.codec.http.cookie.Cookie> r5) {
            r4 = this;
            java.lang.String r0 = "cookies"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            r5 = 0
            return r5
        L10:
            java.lang.StringBuilder r0 = io.netty.handler.codec.http.cookie.CookieUtil.stringBuilder()
            boolean r1 = r4.strict
            if (r1 == 0) goto L46
            int r1 = r5.size()
            r2 = 1
            if (r1 != r2) goto L2d
            java.util.Iterator r5 = r5.iterator()
            java.lang.Object r5 = r5.next()
            io.netty.handler.codec.http.cookie.Cookie r5 = (io.netty.handler.codec.http.cookie.Cookie) r5
            r4.encode(r0, r5)
            goto L5a
        L2d:
            r1 = 0
            io.netty.handler.codec.http.cookie.Cookie[] r2 = new io.netty.handler.codec.http.cookie.Cookie[r1]
            java.lang.Object[] r5 = r5.toArray(r2)
            io.netty.handler.codec.http.cookie.Cookie[] r5 = (io.netty.handler.codec.http.cookie.Cookie[]) r5
            java.util.Comparator<io.netty.handler.codec.http.cookie.Cookie> r2 = io.netty.handler.codec.http.cookie.ClientCookieEncoder.COOKIE_COMPARATOR
            java.util.Arrays.sort(r5, r2)
            int r2 = r5.length
        L3c:
            if (r1 >= r2) goto L5a
            r3 = r5[r1]
            r4.encode(r0, r3)
            int r1 = r1 + 1
            goto L3c
        L46:
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            io.netty.handler.codec.http.cookie.Cookie r1 = (io.netty.handler.codec.http.cookie.Cookie) r1
            r4.encode(r0, r1)
            goto L4a
        L5a:
            java.lang.String r5 = io.netty.handler.codec.http.cookie.CookieUtil.stripTrailingSeparatorOrNull(r0)
            return r5
    }

    public java.lang.String encode(io.netty.handler.codec.http.cookie.Cookie... r5) {
            r4 = this;
            java.lang.String r0 = "cookies"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            io.netty.handler.codec.http.cookie.Cookie[] r0 = (io.netty.handler.codec.http.cookie.Cookie[]) r0
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = 0
            return r5
        Ld:
            java.lang.StringBuilder r0 = io.netty.handler.codec.http.cookie.CookieUtil.stringBuilder()
            boolean r1 = r4.strict
            r2 = 0
            if (r1 == 0) goto L37
            int r1 = r5.length
            r3 = 1
            if (r1 != r3) goto L20
            r5 = r5[r2]
            r4.encode(r0, r5)
            goto L42
        L20:
            int r1 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            io.netty.handler.codec.http.cookie.Cookie[] r5 = (io.netty.handler.codec.http.cookie.Cookie[]) r5
            java.util.Comparator<io.netty.handler.codec.http.cookie.Cookie> r1 = io.netty.handler.codec.http.cookie.ClientCookieEncoder.COOKIE_COMPARATOR
            java.util.Arrays.sort(r5, r1)
            int r1 = r5.length
        L2d:
            if (r2 >= r1) goto L42
            r3 = r5[r2]
            r4.encode(r0, r3)
            int r2 = r2 + 1
            goto L2d
        L37:
            int r1 = r5.length
        L38:
            if (r2 >= r1) goto L42
            r3 = r5[r2]
            r4.encode(r0, r3)
            int r2 = r2 + 1
            goto L38
        L42:
            java.lang.String r5 = io.netty.handler.codec.http.cookie.CookieUtil.stripTrailingSeparatorOrNull(r0)
            return r5
    }
}
