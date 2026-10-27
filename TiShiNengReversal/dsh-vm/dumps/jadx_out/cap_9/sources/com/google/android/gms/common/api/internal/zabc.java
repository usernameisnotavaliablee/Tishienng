package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zabc extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zaa;

    zabc(com.google.android.gms.common.api.internal.zabe r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r2) {
            r1 = this;
            int r2 = r2.what
            r0 = 1
            if (r2 == r0) goto Lf
            r0 = 2
            if (r2 == r0) goto L9
            return
        L9:
            com.google.android.gms.common.api.internal.zabe r2 = r1.zaa
            com.google.android.gms.common.api.internal.zabe.zai(r2)
            return
        Lf:
            com.google.android.gms.common.api.internal.zabe r2 = r1.zaa
            com.google.android.gms.common.api.internal.zabe.zaj(r2)
            return
    }
}
