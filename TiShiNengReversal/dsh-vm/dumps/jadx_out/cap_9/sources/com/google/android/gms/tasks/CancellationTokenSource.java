package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CancellationTokenSource {
    private final com.google.android.gms.tasks.zzb zza;

    public CancellationTokenSource() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzb r0 = new com.google.android.gms.tasks.zzb
            r0.<init>()
            r1.zza = r0
            return
    }

    public void cancel() {
            r1 = this;
            com.google.android.gms.tasks.zzb r0 = r1.zza
            r0.zza()
            return
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.CancellationToken getToken() {
            r1 = this;
            com.google.android.gms.tasks.zzb r0 = r1.zza
            return r0
    }
}
