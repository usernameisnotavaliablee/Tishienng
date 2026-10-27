package com.google.android.gms.internal.mlkit_acceleration;

import com.google.android.gms.internal.mlkit_acceleration.zzcb;
import com.google.android.gms.internal.mlkit_acceleration.zzcc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzcc<MessageType extends com.google.android.gms.internal.mlkit_acceleration.zzcc<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.mlkit_acceleration.zzcb<MessageType, BuilderType>> implements com.google.android.gms.internal.mlkit_acceleration.zzfa {
    protected int zza;

    public zzcc() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    int zzt(com.google.android.gms.internal.mlkit_acceleration.zzfm r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfa
    public final com.google.android.gms.internal.mlkit_acceleration.zzcs zzu() {
            r5 = this;
            int r0 = r5.zzx()     // Catch: java.io.IOException -> L19
            com.google.android.gms.internal.mlkit_acceleration.zzcs r1 = com.google.android.gms.internal.mlkit_acceleration.zzcs.zzb     // Catch: java.io.IOException -> L19
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L19
            r2 = 0
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzy(r1, r2, r0)     // Catch: java.io.IOException -> L19
            r5.zzM(r0)     // Catch: java.io.IOException -> L19
            r0.zzz()     // Catch: java.io.IOException -> L19
            com.google.android.gms.internal.mlkit_acceleration.zzcp r0 = new com.google.android.gms.internal.mlkit_acceleration.zzcp     // Catch: java.io.IOException -> L19
            r0.<init>(r1)     // Catch: java.io.IOException -> L19
            return r0
        L19:
            r0 = move-exception
            java.lang.Class r1 = r5.getClass()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Serializing "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " to a ByteString threw an IOException (should never happen)."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
    }

    public final byte[] zzv() {
            r5 = this;
            int r0 = r5.zzx()     // Catch: java.io.IOException -> L12
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L12
            r2 = 0
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzy(r1, r2, r0)     // Catch: java.io.IOException -> L12
            r5.zzM(r0)     // Catch: java.io.IOException -> L12
            r0.zzz()     // Catch: java.io.IOException -> L12
            return r1
        L12:
            r0 = move-exception
            java.lang.Class r1 = r5.getClass()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Serializing "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " to a byte array threw an IOException (should never happen)."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
    }
}
