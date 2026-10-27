package com.google.android.gms.common.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ResolvableApiException extends com.google.android.gms.common.api.ApiException {
    public ResolvableApiException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.NonNull
    public android.app.PendingIntent getResolution() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.getStatus()
            android.app.PendingIntent r0 = r0.getResolution()
            return r0
    }

    public void startResolutionForResult(@androidx.annotation.NonNull android.app.Activity r2, int r3) throws android.content.IntentSender.SendIntentException {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.getStatus()
            r0.startResolutionForResult(r2, r3)
            return
    }
}
