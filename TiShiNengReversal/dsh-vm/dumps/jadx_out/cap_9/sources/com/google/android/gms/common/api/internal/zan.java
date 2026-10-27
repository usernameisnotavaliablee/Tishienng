package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zan extends com.google.android.gms.common.api.internal.zabw {
    final /* synthetic */ android.app.Dialog zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zao zab;

    zan(com.google.android.gms.common.api.internal.zao r1, android.app.Dialog r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
            r1 = this;
            com.google.android.gms.common.api.internal.zao r0 = r1.zab
            com.google.android.gms.common.api.internal.zap r0 = r0.zaa
            com.google.android.gms.common.api.internal.zap.zag(r0)
            android.app.Dialog r0 = r1.zaa
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L14
            android.app.Dialog r0 = r1.zaa
            r0.dismiss()
        L14:
            return
    }
}
