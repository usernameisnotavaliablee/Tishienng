package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class ab implements com.kwad.framework.filedownloader.w {
    private final android.util.SparseArray<android.os.Handler> amA;

    ab() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.amA = r0
            return
    }

    private static void a(android.os.Handler r1) {
            r0 = 2
            r1.sendEmptyMessage(r0)
            return
    }

    private static void b(android.os.Handler r1) {
            r0 = 3
            r1.sendEmptyMessage(r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.w
    public final boolean bA(int r2) {
            r1 = this;
            android.util.SparseArray<android.os.Handler> r0 = r1.amA
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // com.kwad.framework.filedownloader.w
    public final void q(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            android.util.SparseArray<android.os.Handler> r1 = r2.amA
            int r0 = r0.intValue()
            java.lang.Object r0 = r1.get(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            b(r0)
            goto L4
        L20:
            return
    }

    @Override // com.kwad.framework.filedownloader.w
    public final void xO() {
            r3 = this;
            r0 = 0
        L1:
            android.util.SparseArray<android.os.Handler> r1 = r3.amA
            int r1 = r1.size()
            if (r0 >= r1) goto L1d
            android.util.SparseArray<android.os.Handler> r1 = r3.amA
            int r1 = r1.keyAt(r0)
            android.util.SparseArray<android.os.Handler> r2 = r3.amA
            java.lang.Object r1 = r2.get(r1)
            android.os.Handler r1 = (android.os.Handler) r1
            a(r1)
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }

    @Override // com.kwad.framework.filedownloader.w
    public final int xP() {
            r1 = this;
            android.util.SparseArray<android.os.Handler> r0 = r1.amA
            int r0 = r0.size()
            return r0
    }
}
