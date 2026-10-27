package com.google.android.gms.internal.mlkit_vision_mediapipe;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zziu;
import com.google.android.gms.internal.mlkit_vision_mediapipe.zziv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zziv<MessageType extends com.google.android.gms.internal.mlkit_vision_mediapipe.zziv<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.mlkit_vision_mediapipe.zziu<MessageType, BuilderType>> implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw {
    protected int zza;

    public zziv() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    int zzi(com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo zzj() {
            r5 = this;
            int r0 = r5.zzn()     // Catch: java.io.IOException -> L1a
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb     // Catch: java.io.IOException -> L1a
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L1a
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjt r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzjt     // Catch: java.io.IOException -> L1a
            r3 = 0
            r2.<init>(r1, r3, r0)     // Catch: java.io.IOException -> L1a
            r5.zzL(r2)     // Catch: java.io.IOException -> L1a
            r2.zzB()     // Catch: java.io.IOException -> L1a
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn     // Catch: java.io.IOException -> L1a
            r0.<init>(r1)     // Catch: java.io.IOException -> L1a
            return r0
        L1a:
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

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw
    public final byte[] zzk() {
            r5 = this;
            int r0 = r5.zzn()     // Catch: java.io.IOException -> L13
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjt r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzjt     // Catch: java.io.IOException -> L13
            r3 = 0
            r2.<init>(r1, r3, r0)     // Catch: java.io.IOException -> L13
            r5.zzL(r2)     // Catch: java.io.IOException -> L13
            r2.zzB()     // Catch: java.io.IOException -> L13
            return r1
        L13:
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
