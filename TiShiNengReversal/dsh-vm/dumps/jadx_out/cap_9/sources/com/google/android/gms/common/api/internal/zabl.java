package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zabl implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    zabl(com.google.android.gms.common.api.internal.GoogleApiManager r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean r4) {
            r3 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            r2 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            android.os.Message r4 = r0.obtainMessage(r2, r4)
            r1.sendMessage(r4)
            return
    }
}
