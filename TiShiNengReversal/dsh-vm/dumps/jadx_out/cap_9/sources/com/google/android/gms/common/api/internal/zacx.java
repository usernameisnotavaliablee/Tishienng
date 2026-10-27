package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zacx implements com.google.android.gms.tasks.Continuation {
    zacx() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Object then(@androidx.annotation.NonNull com.google.android.gms.tasks.Task r4) throws java.lang.Exception {
            r3 = this;
            java.lang.Object r4 = r4.getResult()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Le
            r4 = 0
            return r4
        Le:
            com.google.android.gms.common.api.ApiException r4 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 13
            java.lang.String r2 = "listener already unregistered"
            r0.<init>(r1, r2)
            r4.<init>(r0)
            throw r4
    }
}
