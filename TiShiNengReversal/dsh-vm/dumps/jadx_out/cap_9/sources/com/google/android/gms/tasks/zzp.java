package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzp<TResult, TContinuationResult> implements com.google.android.gms.tasks.OnSuccessListener<TContinuationResult>, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnCanceledListener, com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.tasks.SuccessContinuation zzb;
    private final com.google.android.gms.tasks.zzw zzc;

    public zzp(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.gms.tasks.SuccessContinuation r2, @androidx.annotation.NonNull com.google.android.gms.tasks.zzw r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.tasks.SuccessContinuation zza(com.google.android.gms.tasks.zzp r0) {
            com.google.android.gms.tasks.SuccessContinuation r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
            r1 = this;
            com.google.android.gms.tasks.zzw r0 = r1.zzc
            r0.zzc()
            return
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@androidx.annotation.NonNull java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw r0 = r1.zzc
            r0.zza(r2)
            return
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw r0 = r1.zzc
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@androidx.annotation.NonNull com.google.android.gms.tasks.Task r2) {
            r1 = this;
            com.google.android.gms.tasks.zzo r0 = new com.google.android.gms.tasks.zzo
            r0.<init>(r1, r2)
            java.util.concurrent.Executor r2 = r1.zza
            r2.execute(r0)
            return
    }
}
