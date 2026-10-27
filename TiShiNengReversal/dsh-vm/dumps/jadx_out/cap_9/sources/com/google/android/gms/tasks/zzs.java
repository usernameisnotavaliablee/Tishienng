package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzs implements com.google.android.gms.tasks.OnTokenCanceledListener {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzs(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            com.google.android.gms.tasks.zzw r0 = com.google.android.gms.tasks.TaskCompletionSource.zza(r0)
            r0.zzc()
            return
    }
}
