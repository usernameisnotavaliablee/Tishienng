package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class TaskCompletionSource<TResult> {
    private final com.google.android.gms.tasks.zzw zza;

    public TaskCompletionSource() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r1.zza = r0
            return
    }

    public TaskCompletionSource(@androidx.annotation.NonNull com.google.android.gms.tasks.CancellationToken r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.tasks.zzs r0 = new com.google.android.gms.tasks.zzs
            r0.<init>(r1)
            r2.onCanceledRequested(r0)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.tasks.zzw zza(com.google.android.gms.tasks.TaskCompletionSource r0) {
            com.google.android.gms.tasks.zzw r0 = r0.zza
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<TResult> getTask() {
            r1 = this;
            com.google.android.gms.tasks.zzw r0 = r1.zza
            return r0
    }

    public void setException(@androidx.annotation.NonNull java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw r0 = r1.zza
            r0.zza(r2)
            return
    }

    public void setResult(@androidx.annotation.Nullable TResult r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw r0 = r1.zza
            r0.zzb(r2)
            return
    }

    public boolean trySetException(@androidx.annotation.NonNull java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw r0 = r1.zza
            boolean r2 = r0.zzd(r2)
            return r2
    }

    public boolean trySetResult(@androidx.annotation.Nullable TResult r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw r0 = r1.zza
            boolean r2 = r0.zze(r2)
            return r2
    }
}
