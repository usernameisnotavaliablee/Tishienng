package com.danikula.videocache.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class h extends com.danikula.videocache.file.e {
    private final long c;

    public h(long r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lc
            r3.c = r4
            return
        Lc:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Max size must be positive number!"
            r4.<init>(r5)
            throw r4
    }

    @Override // com.danikula.videocache.file.e
    protected boolean b(java.io.File r3, long r4, int r6) {
            r2 = this;
            long r0 = r2.c
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 > 0) goto L8
            r3 = 1
            return r3
        L8:
            r3 = 0
            return r3
    }
}
