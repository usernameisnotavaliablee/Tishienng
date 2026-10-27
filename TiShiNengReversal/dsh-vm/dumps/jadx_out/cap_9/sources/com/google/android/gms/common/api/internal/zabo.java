package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zabo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabp zaa;

    zabo(com.google.android.gms.common.api.internal.zabp r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.common.api.internal.zabp r0 = r3.zaa
            com.google.android.gms.common.api.internal.zabq r0 = r0.zaa
            com.google.android.gms.common.api.Api$Client r1 = com.google.android.gms.common.api.internal.zabq.zae(r0)
            com.google.android.gms.common.api.Api$Client r0 = com.google.android.gms.common.api.internal.zabq.zae(r0)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = " disconnecting because it was signed out."
            java.lang.String r0 = r0.concat(r2)
            r1.disconnect(r0)
            return
    }
}
