package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzgc extends java.lang.RuntimeException {
    public zzgc(com.google.android.gms.internal.mlkit_acceleration.zzfa r1) {
            r0 = this;
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r0.<init>(r1)
            return
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzed zza() {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1)
            return r0
    }
}
