package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zabh extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabi zaa;

    zabh(com.google.android.gms.common.api.internal.zabi r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what
            r1 = 1
            if (r0 == r1) goto Le
            r1 = 2
            if (r0 == r1) goto L9
            return
        L9:
            java.lang.Object r3 = r3.obj
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
        Le:
            java.lang.Object r3 = r3.obj
            com.google.android.gms.common.api.internal.zabg r3 = (com.google.android.gms.common.api.internal.zabg) r3
            com.google.android.gms.common.api.internal.zabi r0 = r2.zaa
            r3.zab(r0)
            return
    }
}
