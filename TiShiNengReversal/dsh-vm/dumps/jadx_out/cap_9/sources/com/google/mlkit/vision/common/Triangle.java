package com.google.mlkit.vision.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Triangle<T> {
    private final com.google.android.gms.internal.mlkit_vision_common.zzp zza;

    @com.google.android.gms.common.annotation.KeepForSdk
    public Triangle(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull T r2, @androidx.annotation.NonNull T r3) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = com.google.android.gms.internal.mlkit_vision_common.zzp.zzj(r1, r2, r3)
            r0.zza = r1
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<T> getAllPoints() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzp r0 = r1.zza
            return r0
    }
}
