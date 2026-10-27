package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaam extends com.google.android.gms.common.api.internal.zabg {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaao zab;

    zaam(com.google.android.gms.common.api.internal.zaao r1, com.google.android.gms.common.api.internal.zabf r2, com.google.android.gms.common.ConnectionResult r3) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    public final void zaa() {
            r2 = this;
            com.google.android.gms.common.api.internal.zaao r0 = r2.zab
            com.google.android.gms.common.api.internal.zaaw r0 = r0.zaa
            com.google.android.gms.common.ConnectionResult r1 = r2.zaa
            com.google.android.gms.common.api.internal.zaaw.zas(r0, r1)
            return
    }
}
