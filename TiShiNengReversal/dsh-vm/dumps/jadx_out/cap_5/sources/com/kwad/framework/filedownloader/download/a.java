package com.kwad.framework.filedownloader.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    final long anh;
    final long ani;
    final long anj;
    final long contentLength;

    a(long r1, long r3, long r5, long r7) {
            r0 = this;
            r0.<init>()
            r0.anh = r1
            r0.ani = r3
            r0.anj = r5
            r0.contentLength = r7
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            long r0 = r5.anh
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r5.anj
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = r5.ani
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.lang.String r0 = "range[%d, %d) current offset[%d]"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r3)
            return r0
    }
}
