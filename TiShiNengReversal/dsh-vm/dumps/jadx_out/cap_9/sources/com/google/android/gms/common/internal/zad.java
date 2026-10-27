package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zad extends com.google.android.gms.common.internal.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ android.app.Activity zab;
    final /* synthetic */ int zac;

    zad(android.content.Intent r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
            r3 = this;
            android.content.Intent r0 = r3.zaa
            if (r0 == 0) goto Lb
            android.app.Activity r1 = r3.zab
            int r2 = r3.zac
            r1.startActivityForResult(r0, r2)
        Lb:
            return
    }
}
