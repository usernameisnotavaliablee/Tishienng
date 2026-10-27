package io.netty.handler.codec.http.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ServerCookieEncoder extends io.netty.handler.codec.http.cookie.CookieEncoder {
    public static final io.netty.handler.codec.http.cookie.ServerCookieEncoder LAX = null;
    public static final io.netty.handler.codec.http.cookie.ServerCookieEncoder STRICT = null;

    static {
            io.netty.handler.codec.http.cookie.ServerCookieEncoder r0 = new io.netty.handler.codec.http.cookie.ServerCookieEncoder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.codec.http.cookie.ServerCookieEncoder.STRICT = r0
            io.netty.handler.codec.http.cookie.ServerCookieEncoder r0 = new io.netty.handler.codec.http.cookie.ServerCookieEncoder
            r1 = 0
            r0.<init>(r1)
            io.netty.handler.codec.http.cookie.ServerCookieEncoder.LAX = r0
            return
    }

    private ServerCookieEncoder(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static java.util.List<java.lang.String> dedup(java.util.List<java.lang.String> r4, java.util.Map<java.lang.String, java.lang.Integer> r5) {
            int r0 = r4.size()
            boolean[] r0 = new boolean[r0]
            java.util.Collection r1 = r5.values()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 1
            r0[r2] = r3
            goto Le
        L22:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r5 = r5.size()
            r1.<init>(r5)
            int r5 = r4.size()
            r2 = 0
        L30:
            if (r2 >= r5) goto L40
            boolean r3 = r0[r2]
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r4.get(r2)
            r1.add(r3)
        L3d:
            int r2 = r2 + 1
            goto L30
        L40:
            return r1
    }

    public java.lang.String encode(io.netty.handler.codec.http.cookie.Cookie r8) {
            r7 = this;
            java.lang.String r0 = "cookie"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r8, r0)
            io.netty.handler.codec.http.cookie.Cookie r0 = (io.netty.handler.codec.http.cookie.Cookie) r0
            java.lang.String r0 = r0.name()
            java.lang.String r1 = r8.value()
            if (r1 == 0) goto L17
            java.lang.String r1 = r8.value()
            goto L19
        L17:
            java.lang.String r1 = ""
        L19:
            r7.validateCookie(r0, r1)
            java.lang.StringBuilder r2 = io.netty.handler.codec.http.cookie.CookieUtil.stringBuilder()
            boolean r3 = r8.wrap()
            if (r3 == 0) goto L2a
            io.netty.handler.codec.http.cookie.CookieUtil.addQuoted(r2, r0, r1)
            goto L2d
        L2a:
            io.netty.handler.codec.http.cookie.CookieUtil.add(r2, r0, r1)
        L2d:
            long r0 = r8.maxAge()
            r3 = -9223372036854775808
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L69
            java.lang.String r0 = "Max-Age"
            long r3 = r8.maxAge()
            io.netty.handler.codec.http.cookie.CookieUtil.add(r2, r0, r3)
            java.util.Date r0 = new java.util.Date
            long r3 = r8.maxAge()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = r3 + r5
            r0.<init>(r3)
            java.lang.String r1 = "Expires"
            r2.append(r1)
            r1 = 61
            r2.append(r1)
            io.netty.handler.codec.DateFormatter.append(r0, r2)
            r0 = 59
            r2.append(r0)
            r0 = 32
            r2.append(r0)
        L69:
            java.lang.String r0 = r8.path()
            if (r0 == 0) goto L78
            java.lang.String r0 = "Path"
            java.lang.String r1 = r8.path()
            io.netty.handler.codec.http.cookie.CookieUtil.add(r2, r0, r1)
        L78:
            java.lang.String r0 = r8.domain()
            if (r0 == 0) goto L87
            java.lang.String r0 = "Domain"
            java.lang.String r1 = r8.domain()
            io.netty.handler.codec.http.cookie.CookieUtil.add(r2, r0, r1)
        L87:
            boolean r0 = r8.isSecure()
            if (r0 == 0) goto L92
            java.lang.String r0 = "Secure"
            io.netty.handler.codec.http.cookie.CookieUtil.add(r2, r0)
        L92:
            boolean r8 = r8.isHttpOnly()
            if (r8 == 0) goto L9d
            java.lang.String r8 = "HTTPOnly"
            io.netty.handler.codec.http.cookie.CookieUtil.add(r2, r8)
        L9d:
            java.lang.String r8 = io.netty.handler.codec.http.cookie.CookieUtil.stripTrailingSeparator(r2)
            return r8
    }

    public java.lang.String encode(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            io.netty.handler.codec.http.cookie.DefaultCookie r0 = new io.netty.handler.codec.http.cookie.DefaultCookie
            r0.<init>(r2, r3)
            java.lang.String r2 = r1.encode(r0)
            return r2
    }

    public java.util.List<java.lang.String> encode(java.lang.Iterable<? extends io.netty.handler.codec.http.cookie.Cookie> r9) {
            r8 = this;
            java.lang.String r0 = "cookies"
            java.lang.Object r9 = io.netty.util.internal.ObjectUtil.checkNotNull(r9, r0)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L15
            java.util.List r9 = java.util.Collections.EMPTY_LIST
            return r9
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r9.next()
            io.netty.handler.codec.http.cookie.Cookie r1 = (io.netty.handler.codec.http.cookie.Cookie) r1
            boolean r2 = r8.strict
            if (r2 == 0) goto L30
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L30
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            goto L31
        L30:
            r2 = 0
        L31:
            java.lang.String r3 = r8.encode(r1)
            r0.add(r3)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L4f
            java.lang.String r1 = r1.name()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r2.put(r1, r5)
            if (r1 == 0) goto L4d
            r1 = 1
            r5 = 1
            goto L51
        L4d:
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            r5 = 0
        L51:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r9.next()
            io.netty.handler.codec.http.cookie.Cookie r6 = (io.netty.handler.codec.http.cookie.Cookie) r6
            java.lang.String r7 = r8.encode(r6)
            r0.add(r7)
            if (r2 == 0) goto L51
            java.lang.String r6 = r6.name()
            int r7 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.put(r6, r1)
            if (r1 == 0) goto L78
            r1 = 1
            goto L79
        L78:
            r1 = 0
        L79:
            r1 = r1 | r5
            r5 = r1
            r1 = r7
            goto L51
        L7d:
            if (r5 == 0) goto L84
            java.util.List r9 = dedup(r0, r2)
            return r9
        L84:
            return r0
    }

    public java.util.List<java.lang.String> encode(java.util.Collection<? extends io.netty.handler.codec.http.cookie.Cookie> r9) {
            r8 = this;
            java.lang.String r0 = "cookies"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r9, r0)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            java.util.List r9 = java.util.Collections.EMPTY_LIST
            return r9
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            boolean r1 = r8.strict
            r2 = 1
            if (r1 == 0) goto L2b
            int r1 = r9.size()
            if (r1 <= r2) goto L2b
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            goto L2c
        L2b:
            r1 = 0
        L2c:
            java.util.Iterator r9 = r9.iterator()
            r3 = 0
            r4 = 0
            r5 = 0
        L33:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L5e
            java.lang.Object r6 = r9.next()
            io.netty.handler.codec.http.cookie.Cookie r6 = (io.netty.handler.codec.http.cookie.Cookie) r6
            java.lang.String r7 = r8.encode(r6)
            r0.add(r7)
            if (r1 == 0) goto L33
            java.lang.String r6 = r6.name()
            int r7 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r1.put(r6, r5)
            if (r5 == 0) goto L5a
            r5 = 1
            goto L5b
        L5a:
            r5 = 0
        L5b:
            r4 = r4 | r5
            r5 = r7
            goto L33
        L5e:
            if (r4 == 0) goto L65
            java.util.List r9 = dedup(r0, r1)
            return r9
        L65:
            return r0
    }

    public java.util.List<java.lang.String> encode(io.netty.handler.codec.http.cookie.Cookie... r9) {
            r8 = this;
            java.lang.String r0 = "cookies"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r9, r0)
            io.netty.handler.codec.http.cookie.Cookie[] r0 = (io.netty.handler.codec.http.cookie.Cookie[]) r0
            int r0 = r0.length
            if (r0 != 0) goto Le
            java.util.List r9 = java.util.Collections.EMPTY_LIST
            return r9
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.length
            r0.<init>(r1)
            boolean r1 = r8.strict
            r2 = 1
            if (r1 == 0) goto L22
            int r1 = r9.length
            if (r1 <= r2) goto L22
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            goto L23
        L22:
            r1 = 0
        L23:
            r3 = 0
            r4 = 0
            r5 = 0
        L26:
            int r6 = r9.length
            if (r4 >= r6) goto L49
            r6 = r9[r4]
            java.lang.String r7 = r8.encode(r6)
            r0.add(r7)
            if (r1 == 0) goto L46
            java.lang.String r6 = r6.name()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r1.put(r6, r7)
            if (r6 == 0) goto L44
            r6 = 1
            goto L45
        L44:
            r6 = 0
        L45:
            r5 = r5 | r6
        L46:
            int r4 = r4 + 1
            goto L26
        L49:
            if (r5 == 0) goto L50
            java.util.List r9 = dedup(r0, r1)
            return r9
        L50:
            return r0
    }
}
