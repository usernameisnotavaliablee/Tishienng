package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class f {
    public final java.io.File a;
    public final com.danikula.videocache.file.c b;
    public final com.danikula.videocache.file.a c;
    public final com.danikula.videocache.sourcestorage.c d;

    f(java.io.File r1, com.danikula.videocache.file.c r2, com.danikula.videocache.file.a r3, com.danikula.videocache.sourcestorage.c r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    java.io.File a(java.lang.String r3) {
            r2 = this;
            com.danikula.videocache.file.c r0 = r2.b
            java.lang.String r3 = r0.generate(r3)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.a
            r0.<init>(r1, r3)
            return r0
    }
}
