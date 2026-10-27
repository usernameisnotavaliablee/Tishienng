package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdx {
    private static final java.lang.String[] zza = null;
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb zzb = null;

    static {
            java.lang.String r0 = "com.google.common.flogger.util.StackWalkerStackGetter"
            java.lang.String r1 = "com.google.common.flogger.util.JavaLangAccessStackGetter"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdx.zza = r0
            r0 = 0
        Lb:
            r1 = 2
            if (r0 >= r1) goto L30
            java.lang.String[] r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdx.zza
            r1 = r1[r0]
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb> r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb.class
            java.lang.Class r1 = r1.asSubclass(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb) r1     // Catch: java.lang.Throwable -> L29
            r2 = r1
            goto L2a
        L29:
        L2a:
            if (r2 == 0) goto L2d
            goto L35
        L2d:
            int r0 = r0 + 1
            goto Lb
        L30:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzec r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzec
            r2.<init>()
        L35:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdx.zzb = r2
            return
    }

    public zzdx() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public static java.lang.StackTraceElement zza(java.lang.Class r1, int r2) {
            java.lang.String r2 = "target"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r1, r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdx.zzb
            r0 = 2
            java.lang.StackTraceElement r1 = r2.zza(r1, r0)
            return r1
    }

    public static java.lang.StackTraceElement[] zzb(java.lang.Class r1, int r2, int r3) {
            if (r2 > 0) goto Le
            r3 = -1
            if (r2 != r3) goto L6
            goto Le
        L6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid maximum depth: 0"
            r1.<init>(r2)
            throw r1
        Le:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdx.zzb
            r0 = 2
            java.lang.StackTraceElement[] r1 = r3.zzb(r1, r2, r0)
            return r1
    }
}
