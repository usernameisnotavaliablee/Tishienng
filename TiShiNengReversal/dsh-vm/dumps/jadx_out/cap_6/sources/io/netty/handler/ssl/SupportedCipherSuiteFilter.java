package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SupportedCipherSuiteFilter implements io.netty.handler.ssl.CipherSuiteFilter {
    public static final io.netty.handler.ssl.SupportedCipherSuiteFilter INSTANCE = null;

    static {
            io.netty.handler.ssl.SupportedCipherSuiteFilter r0 = new io.netty.handler.ssl.SupportedCipherSuiteFilter
            r0.<init>()
            io.netty.handler.ssl.SupportedCipherSuiteFilter.INSTANCE = r0
            return
    }

    private SupportedCipherSuiteFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.ssl.CipherSuiteFilter
    public java.lang.String[] filterCipherSuites(java.lang.Iterable<java.lang.String> r4, java.util.List<java.lang.String> r5, java.util.Set<java.lang.String> r6) {
            r3 = this;
            if (r5 == 0) goto L4b
            if (r6 == 0) goto L43
            if (r4 != 0) goto L13
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r5.size()
            r4.<init>(r0)
            r2 = r5
            r5 = r4
            r4 = r2
            goto L1c
        L13:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r6.size()
            r5.<init>(r0)
        L1c:
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L2f
            goto L39
        L2f:
            boolean r1 = r6.contains(r0)
            if (r1 == 0) goto L20
            r5.add(r0)
            goto L20
        L39:
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r4 = r5.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            return r4
        L43:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "supportedCiphers"
            r4.<init>(r5)
            throw r4
        L4b:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "defaultCiphers"
            r4.<init>(r5)
            throw r4
    }
}
