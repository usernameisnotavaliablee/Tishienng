package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaak implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;

    zaak(com.google.android.gms.common.api.internal.zaaw r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zaa
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.api.internal.zaaw.zaf(r0)
            android.content.Context r0 = com.google.android.gms.common.api.internal.zaaw.zac(r0)
            r1.cancelAvailabilityErrorNotifications(r0)
            return
    }
}
