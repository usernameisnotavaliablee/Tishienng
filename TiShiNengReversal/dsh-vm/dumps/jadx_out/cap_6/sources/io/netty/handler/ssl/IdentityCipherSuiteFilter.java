package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class IdentityCipherSuiteFilter implements io.netty.handler.ssl.CipherSuiteFilter {
    public static final io.netty.handler.ssl.IdentityCipherSuiteFilter INSTANCE = null;
    public static final io.netty.handler.ssl.IdentityCipherSuiteFilter INSTANCE_DEFAULTING_TO_SUPPORTED_CIPHERS = null;
    private final boolean defaultToDefaultCiphers;

    static {
            io.netty.handler.ssl.IdentityCipherSuiteFilter r0 = new io.netty.handler.ssl.IdentityCipherSuiteFilter
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE = r0
            io.netty.handler.ssl.IdentityCipherSuiteFilter r0 = new io.netty.handler.ssl.IdentityCipherSuiteFilter
            r1 = 0
            r0.<init>(r1)
            io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE_DEFAULTING_TO_SUPPORTED_CIPHERS = r0
            return
    }

    private IdentityCipherSuiteFilter(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.defaultToDefaultCiphers = r1
            return
    }

    @Override // io.netty.handler.ssl.CipherSuiteFilter
    public java.lang.String[] filterCipherSuites(java.lang.Iterable<java.lang.String> r2, java.util.List<java.lang.String> r3, java.util.Set<java.lang.String> r4) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L19
            boolean r2 = r1.defaultToDefaultCiphers
            if (r2 == 0) goto L10
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.Object[] r2 = r3.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
        L10:
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.Object[] r2 = r4.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
        L19:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r4.size()
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L35
            goto L39
        L35:
            r3.add(r4)
            goto L26
        L39:
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.Object[] r2 = r3.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }
}
