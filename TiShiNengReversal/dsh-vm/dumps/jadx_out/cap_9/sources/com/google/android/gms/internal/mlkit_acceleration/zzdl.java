package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdl {
    private static final com.google.android.gms.internal.mlkit_acceleration.zzdj zza = null;
    private static final com.google.android.gms.internal.mlkit_acceleration.zzdj zzb = null;

    static {
            com.google.android.gms.internal.mlkit_acceleration.zzdk r0 = new com.google.android.gms.internal.mlkit_acceleration.zzdk
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzdl.zza = r0
            r0 = 0
            java.lang.String r1 = "com.google.protobuf.ExtensionSchemaFull"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Exception -> L19
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L19
            com.google.android.gms.internal.mlkit_acceleration.zzdj r1 = (com.google.android.gms.internal.mlkit_acceleration.zzdj) r1     // Catch: java.lang.Exception -> L19
            r0 = r1
        L19:
            com.google.android.gms.internal.mlkit_acceleration.zzdl.zzb = r0
            return
    }

    public zzdl() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzdj zza() {
            com.google.android.gms.internal.mlkit_acceleration.zzdj r0 = com.google.android.gms.internal.mlkit_acceleration.zzdl.zzb
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Protobuf runtime is not correctly loaded."
            r0.<init>(r1)
            throw r0
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzdj zzb() {
            com.google.android.gms.internal.mlkit_acceleration.zzdj r0 = com.google.android.gms.internal.mlkit_acceleration.zzdl.zza
            return r0
    }
}
