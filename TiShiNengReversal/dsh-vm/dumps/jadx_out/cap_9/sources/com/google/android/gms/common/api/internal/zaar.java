package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaar extends com.google.android.gms.signin.internal.zac {
    private final java.lang.ref.WeakReference zaa;

    zaar(com.google.android.gms.common.api.internal.zaaw r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zaa = r0
            return
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @androidx.annotation.BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak r4) {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.zaa
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zaaw r0 = (com.google.android.gms.common.api.internal.zaaw) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.google.android.gms.common.api.internal.zabi r1 = com.google.android.gms.common.api.internal.zaaw.zak(r0)
            com.google.android.gms.common.api.internal.zaaq r2 = new com.google.android.gms.common.api.internal.zaaq
            r2.<init>(r3, r0, r0, r4)
            r1.zal(r2)
            return
    }
}
