package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaab extends com.google.android.gms.common.moduleinstall.internal.zag {
    private final com.google.android.gms.common.api.internal.ListenerHolder zaa;

    public zaab(com.google.android.gms.common.api.internal.ListenerHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate r2) {
            r1 = this;
            com.google.android.gms.common.moduleinstall.internal.zaaa r0 = new com.google.android.gms.common.moduleinstall.internal.zaaa
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.ListenerHolder r2 = r1.zaa
            r2.notifyListener(r0)
            return
    }
}
