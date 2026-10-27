package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdl {
    private static final java.util.Comparator zza = null;
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl zzb = null;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj zzc;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzde r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzde
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl.zza = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r1.<init>(r2)
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl.zzb = r0
            return
    }

    private zzdl(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r1) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl zza() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Comparator zzc() {
            java.util.Comparator r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl.zza
            return r0
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl
            if (r0 == 0) goto L12
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r2 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0 = r1.zzc
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0 = r1.zzc
            int r0 = r0.hashCode()
            int r0 = ~r0
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0 = r1.zzc
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl r4) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0 = r4.zzc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L20
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0 = r3.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r4
        L11:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0 = r3.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r4 = r4.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj
            r2.<init>(r0, r4)
            r1.<init>(r2)
            return r1
        L20:
            return r3
    }

    public final java.util.Map zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0 = r1.zzc
            return r0
    }

    public final boolean zze() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0 = r1.zzc
            boolean r0 = r0.isEmpty()
            return r0
    }
}
