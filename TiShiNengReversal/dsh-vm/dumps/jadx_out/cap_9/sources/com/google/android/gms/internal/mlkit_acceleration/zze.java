package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zze extends java.lang.Exception {
    private final int zza;

    private zze(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.zza = r1
            return
    }

    private zze(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.zza = r1
            return
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zze zzb(java.lang.String r2) {
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = new com.google.android.gms.internal.mlkit_acceleration.zze
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zze zzc(int r3, java.lang.String r4) {
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = new com.google.android.gms.internal.mlkit_acceleration.zze
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "EGL error "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " during "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r3, r4)
            return r0
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zze zzd(java.lang.String r1, java.lang.Throwable r2) {
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = new com.google.android.gms.internal.mlkit_acceleration.zze
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zze zze(javax.microedition.khronos.egl.EGL10 r3, java.lang.String r4) {
            int r3 = r3.eglGetError()
            r0 = 12288(0x3000, float:1.7219E-41)
            if (r3 == r0) goto L27
            com.google.android.gms.internal.mlkit_acceleration.zze r0 = new com.google.android.gms.internal.mlkit_acceleration.zze
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "EGL error "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " during "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r3, r4)
            return r0
        L27:
            java.lang.String r3 = "EGL context not available during "
            java.lang.String r3 = r3.concat(r4)
            com.google.android.gms.internal.mlkit_acceleration.zze r4 = new com.google.android.gms.internal.mlkit_acceleration.zze
            r0 = 0
            r4.<init>(r0, r3)
            return r4
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }
}
