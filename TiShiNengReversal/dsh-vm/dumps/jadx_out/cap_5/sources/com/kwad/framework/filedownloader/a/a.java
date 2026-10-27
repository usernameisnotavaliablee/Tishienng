package com.kwad.framework.filedownloader.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements com.kwad.framework.filedownloader.f.c.a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.framework.filedownloader.f.c.a
    public final int V(long r4) {
            r3 = this;
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L9
            r4 = 1
            return r4
        L9:
            r0 = 5242880(0x500000, double:2.590327E-317)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L12
            r4 = 2
            return r4
        L12:
            r0 = 52428800(0x3200000, double:2.5903269E-316)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1b
            r4 = 3
            return r4
        L1b:
            r0 = 104857600(0x6400000, double:5.1806538E-316)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L24
            r4 = 4
            return r4
        L24:
            r4 = 5
            return r4
    }
}
