package com.beizi.ad.internal.i.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g extends com.beizi.ad.internal.i.a.e {
    private final long a;

    public g(long r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lc
            r3.a = r4
            return
        Lc:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Max size must be positive number!"
            r4.<init>(r5)
            throw r4
    }

    @Override // com.beizi.ad.internal.i.a.e, com.beizi.ad.internal.i.a.a
    public /* bridge */ /* synthetic */ void a(java.io.File r1) throws java.io.IOException {
            r0 = this;
            super.a(r1)
            return
    }

    @Override // com.beizi.ad.internal.i.a.e
    protected boolean a(java.io.File r3, long r4, int r6) {
            r2 = this;
            long r0 = r2.a
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 > 0) goto L8
            r3 = 1
            return r3
        L8:
            r3 = 0
            return r3
    }
}
