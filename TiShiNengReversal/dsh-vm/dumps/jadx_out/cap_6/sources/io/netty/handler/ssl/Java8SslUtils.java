package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Java8SslUtils {
    private Java8SslUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean checkSniHostnameMatch(java.util.Collection<?> r3, byte[] r4) {
            r0 = 1
            if (r3 == 0) goto L2e
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L2e
            javax.net.ssl.SNIHostName r4 = io.netty.handler.ssl.f.a(r4)
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            javax.net.ssl.SNIMatcher r1 = io.netty.handler.ssl.l.a(r1)
            int r2 = io.netty.handler.ssl.m.a(r1)
            if (r2 != 0) goto L11
            boolean r1 = io.netty.handler.ssl.n.a(r1, r4)
            if (r1 == 0) goto L11
            return r0
        L2c:
            r3 = 0
            return r3
        L2e:
            return r0
    }

    static java.util.List getSniHostName(byte[] r1) {
            if (r1 == 0) goto Lf
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            javax.net.ssl.SNIHostName r1 = io.netty.handler.ssl.f.a(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            return r1
        Lf:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
    }

    static java.util.List getSniHostNames(java.util.List<java.lang.String> r2) {
            if (r2 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L2b
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            javax.net.ssl.SNIHostName r1 = com.bytedance.sdk.component.cw.xt.j.ae.c.a(r1)
            r0.add(r1)
            goto L16
        L2a:
            return r0
        L2b:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
    }

    static java.util.List<java.lang.String> getSniHostNames(javax.net.ssl.SSLParameters r3) {
            java.util.List r3 = io.netty.handler.ssl.c.a(r3)
            if (r3 == 0) goto L62
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld
            goto L62
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r3.next()
            javax.net.ssl.SNIServerName r1 = io.netty.handler.ssl.g.a(r1)
            boolean r2 = io.netty.handler.ssl.h.a(r1)
            if (r2 == 0) goto L3a
            javax.net.ssl.SNIHostName r1 = io.netty.handler.ssl.i.a(r1)
            java.lang.String r1 = io.netty.handler.ssl.j.a(r1)
            r0.add(r1)
            goto L1a
        L3a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Only "
            r0.append(r2)
            java.lang.Class r2 = io.netty.handler.ssl.k.a()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = " instances are supported, but found: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L61:
            return r0
        L62:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
    }

    static boolean getUseCipherSuitesOrder(javax.net.ssl.SSLParameters r0) {
            boolean r0 = io.netty.handler.ssl.e.a(r0)
            return r0
    }

    static void setSNIMatchers(javax.net.ssl.SSLParameters r0, java.util.Collection<?> r1) {
            io.netty.handler.ssl.d.a(r0, r1)
            return
    }

    static void setSniHostNames(javax.net.ssl.SSLParameters r0, java.util.List<java.lang.String> r1) {
            java.util.List r1 = getSniHostNames(r1)
            com.bytedance.sdk.component.cw.xt.j.ae.b.a(r0, r1)
            return
    }

    static void setUseCipherSuitesOrder(javax.net.ssl.SSLParameters r0, boolean r1) {
            io.netty.handler.ssl.o.a(r0, r1)
            return
    }
}
