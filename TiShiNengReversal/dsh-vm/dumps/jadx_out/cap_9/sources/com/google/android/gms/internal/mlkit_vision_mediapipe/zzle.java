package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzle implements java.util.Map.Entry {
    private final java.util.Map.Entry zza;

    /* synthetic */ zzle(java.util.Map.Entry r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzld r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            java.util.Map$Entry r0 = r1.zza
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r2 = this;
            java.util.Map$Entry r0 = r2.zza
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            throw r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw
            if (r0 == 0) goto L13
            java.util.Map$Entry r0 = r1.zza
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r2 = r0.zzc(r2)
            return r2
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite"
            r2.<init>(r0)
            throw r2
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg zza() {
            r1 = this;
            java.util.Map$Entry r0 = r1.zza
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg) r0
            return r0
    }
}
