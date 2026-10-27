package com.danikula.videocache.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class g extends com.danikula.videocache.file.e {
    private final int c;

    public g(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 <= 0) goto L8
            r1.c = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Max count must be positive number!"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.danikula.videocache.file.e
    protected boolean b(java.io.File r1, long r2, int r4) {
            r0 = this;
            int r1 = r0.c
            if (r4 > r1) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }
}
