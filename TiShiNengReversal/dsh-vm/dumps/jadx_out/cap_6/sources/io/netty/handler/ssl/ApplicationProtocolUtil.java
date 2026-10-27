package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class ApplicationProtocolUtil {
    private static final int DEFAULT_LIST_SIZE = 2;

    private ApplicationProtocolUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.List<java.lang.String> toList(int r2, java.lang.Iterable<java.lang.String> r3) {
            if (r3 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L25
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L25
            r0.add(r3)
            goto Ld
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "protocol cannot be null or empty"
            r2.<init>(r3)
            throw r2
        L2d:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L34
            return r0
        L34:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "protocols cannot empty"
            r2.<init>(r3)
            throw r2
    }

    static java.util.List<java.lang.String> toList(int r4, java.lang.String... r5) {
            if (r5 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            int r4 = r5.length
            r1 = 0
        Lb:
            if (r1 >= r4) goto L25
            r2 = r5[r1]
            if (r2 == 0) goto L1d
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L1d
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "protocol cannot be null or empty"
            r4.<init>(r5)
            throw r4
        L25:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L2c
            return r0
        L2c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "protocols cannot empty"
            r4.<init>(r5)
            throw r4
    }

    static java.util.List<java.lang.String> toList(java.lang.Iterable<java.lang.String> r1) {
            r0 = 2
            java.util.List r1 = toList(r0, r1)
            return r1
    }

    static java.util.List<java.lang.String> toList(java.lang.String... r1) {
            r0 = 2
            java.util.List r1 = toList(r0, r1)
            return r1
    }
}
