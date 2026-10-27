package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class m extends com.huawei.agconnect.config.impl.l {
    private final java.util.Map<java.lang.String, java.lang.String> c;
    private final java.lang.Object d;
    private com.huawei.agconnect.config.impl.i e;
    private boolean f;
    private final java.lang.String g;

    m(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r3.<init>(r4, r5)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.c = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r3.d = r4
            r4 = 1
            r3.f = r4
            r3.g = r5
            java.lang.String r4 = "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"
            java.lang.String r4 = r3.a(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"
            java.lang.String r5 = r3.a(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"
            java.lang.String r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"
            java.lang.String r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L3e
            if (r5 == 0) goto L3e
            if (r0 == 0) goto L3e
            if (r1 == 0) goto L3e
            com.huawei.agconnect.config.impl.h r2 = new com.huawei.agconnect.config.impl.h     // Catch: java.lang.Throwable -> L42
            r2.<init>(r4, r5, r0, r1)     // Catch: java.lang.Throwable -> L42
            r3.e = r2     // Catch: java.lang.Throwable -> L42
            return
        L3e:
            r4 = 0
            r3.f = r4     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r4 = 0
            r3.e = r4
            return
    }

    private java.lang.String a(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = super.a(r2, r0)
            return r2
    }

    @Override // com.huawei.agconnect.config.impl.l, com.huawei.agconnect.config.impl.f
    public java.lang.String a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.f
            if (r0 != 0) goto Lc
            java.lang.String r4 = r3.a(r4)
            if (r4 == 0) goto Lb
            return r4
        Lb:
            return r5
        Lc:
            com.huawei.agconnect.config.impl.i r0 = r3.e
            if (r0 != 0) goto L11
            return r5
        L11:
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r1
        L20:
            r4 = move-exception
            goto L36
        L22:
            java.lang.String r1 = r3.a(r4)     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r5
        L2a:
            com.huawei.agconnect.config.impl.i r2 = r3.e     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r2.a(r1, r5)     // Catch: java.lang.Throwable -> L20
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.c     // Catch: java.lang.Throwable -> L20
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L20
            goto L28
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SecurityResourcesReader{mKey=, encrypt="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
