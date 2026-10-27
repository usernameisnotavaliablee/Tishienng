package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzlh {
    protected volatile com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw zza;
    private volatile com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo zzb;

    public zzlh() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlh
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlh r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlh) r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r2.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r1 = r3.zza
            if (r0 != 0) goto L22
            if (r1 == 0) goto L15
            goto L22
        L15:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = r2.zzb()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r3 = r3.zzb()
            boolean r3 = r0.equals(r3)
            return r3
        L22:
            if (r0 == 0) goto L2c
            if (r1 != 0) goto L27
            goto L2c
        L27:
            boolean r3 = r0.equals(r1)
            return r3
        L2c:
            if (r0 == 0) goto L3c
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r1 = r0.zzm()
            r3.zzd(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r3 = r3.zza
            boolean r3 = r0.equals(r3)
            return r3
        L3c:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r3 = r1.zzm()
            r2.zzd(r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r3 = r2.zza
            boolean r3 = r3.equals(r1)
            return r3
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = r1.zzb
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = r1.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjn) r0
            byte[] r0 = r0.zza
            int r0 = r0.length
            return r0
        Lc:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r1.zza
            if (r0 == 0) goto L17
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r1.zza
            int r0 = r0.zzn()
            return r0
        L17:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo zzb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = r1.zzb
            if (r0 == 0) goto L7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = r1.zzb
            return r0
        L7:
            monitor-enter(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = r1.zzb     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = r1.zzb     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            goto L27
        L12:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r1.zza     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L1b
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb     // Catch: java.lang.Throwable -> L10
            r1.zzb = r0     // Catch: java.lang.Throwable -> L10
            goto L23
        L1b:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r1.zza     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = r0.zzj()     // Catch: java.lang.Throwable -> L10
            r1.zzb = r0     // Catch: java.lang.Throwable -> L10
        L23:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = r1.zzb     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L27:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r2.zza
            r1 = 0
            r2.zzb = r1
            r2.zza = r3
            return r0
    }

    protected final void zzd(com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r1.zza
            if (r0 == 0) goto L5
            goto L1c
        L5:
            monitor-enter(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r2 = move-exception
            goto L1d
        Le:
            r1.zza = r2     // Catch: java.lang.Throwable -> Lc com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L15
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb     // Catch: java.lang.Throwable -> Lc com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L15
            r1.zzb = r0     // Catch: java.lang.Throwable -> Lc com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L15
            goto L1b
        L15:
            r1.zza = r2     // Catch: java.lang.Throwable -> Lc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb     // Catch: java.lang.Throwable -> Lc
            r1.zzb = r2     // Catch: java.lang.Throwable -> Lc
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
        L1c:
            return
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}
