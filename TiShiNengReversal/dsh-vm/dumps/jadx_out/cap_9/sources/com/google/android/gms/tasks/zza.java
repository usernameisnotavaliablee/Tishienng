package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zza implements com.google.android.gms.tasks.OnSuccessListener {
    final /* synthetic */ com.google.android.gms.tasks.OnTokenCanceledListener zza;

    zza(com.google.android.gms.tasks.zzb r1, com.google.android.gms.tasks.OnTokenCanceledListener r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            com.google.android.gms.tasks.OnTokenCanceledListener r1 = r0.zza
            r1.onCanceled()
            return
    }
}
