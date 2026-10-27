package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzz implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa {
    public static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzz zza = null;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzw r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzw
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzz.zza = r0
            return
    }

    public zzz() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LogSite{ class="
            r0.append(r1)
            java.lang.String r1 = r2.zzb()
            r0.append(r1)
            java.lang.String r1 = ", method="
            r0.append(r1)
            java.lang.String r1 = r2.zzd()
            r0.append(r1)
            java.lang.String r1 = ", line="
            r0.append(r1)
            int r1 = r2.zza()
            r0.append(r1)
            java.lang.String r1 = r2.zzc()
            if (r1 == 0) goto L3b
            java.lang.String r1 = ", file="
            r0.append(r1)
            java.lang.String r1 = r2.zzc()
            r0.append(r1)
        L3b:
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public abstract int zza();

    public abstract java.lang.String zzb();

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public abstract java.lang.String zzc();

    public abstract java.lang.String zzd();
}
