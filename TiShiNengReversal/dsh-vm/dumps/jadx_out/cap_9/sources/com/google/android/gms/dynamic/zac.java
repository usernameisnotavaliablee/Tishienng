package com.google.android.gms.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zac implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ android.os.Bundle zaa;
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zab;

    zac(com.google.android.gms.dynamic.DeferredLifecycleHelper r1, android.os.Bundle r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate r2) {
            r1 = this;
            com.google.android.gms.dynamic.DeferredLifecycleHelper r2 = r1.zab
            com.google.android.gms.dynamic.LifecycleDelegate r2 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(r2)
            android.os.Bundle r0 = r1.zaa
            r2.onCreate(r0)
            return
    }
}
