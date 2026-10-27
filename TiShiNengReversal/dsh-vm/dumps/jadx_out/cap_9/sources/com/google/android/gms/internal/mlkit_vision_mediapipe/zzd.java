package com.google.android.gms.internal.mlkit_vision_mediapipe;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzd<API extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf<API>> {
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd zza;

    protected zzd(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private static void zzg(java.lang.String r5, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Date r1 = new java.util.Date
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = r6.zze()
            long r2 = r2.toMillis(r3)
            r1.<init>(r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
            r2.<init>(r3)
            java.lang.String r1 = r2.format(r1)
            r0.append(r1)
            java.lang.String r1 = ": logging error ["
            r0.append(r1)
            r1 = 1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzz r6 = r6.zzf()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbc.zza(r1, r6, r0)
            java.lang.String r6 = "]: "
            r0.append(r6)
            r0.append(r5)
            java.io.PrintStream r5 = java.lang.System.err
            r5.getClass()
            java.io.PrintStream r5 = java.lang.System.err
            r5.flush()
            return
    }

    public abstract com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf zza(java.util.logging.Level r1);

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf zzb() {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf r0 = r1.zza(r0)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf zzc() {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf r0 = r1.zza(r0)
            return r0
    }

    protected final java.lang.String zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r0 = r1.zza
            java.lang.String r0 = r0.zza()
            return r0
    }

    final void zze(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb r4) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzea r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzea.zzc()     // Catch: java.lang.RuntimeException -> L1d
            int r1 = r0.zzb()     // Catch: java.lang.Throwable -> L12
            r2 = 100
            if (r1 > r2) goto L14
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r1 = r3.zza     // Catch: java.lang.Throwable -> L12
            r1.zzc(r4)     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r1 = move-exception
            goto L1f
        L14:
            java.lang.String r1 = "unbounded recursion in log statement"
            zzg(r1, r4)     // Catch: java.lang.Throwable -> L12
        L19:
            r0.close()     // Catch: java.lang.RuntimeException -> L1d
            return
        L1d:
            r0 = move-exception
            goto L2a
        L1f:
            if (r0 == 0) goto L29
            r0.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.RuntimeException -> L1d
        L29:
            throw r1     // Catch: java.lang.RuntimeException -> L1d
        L2a:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r1 = r3.zza     // Catch: java.lang.RuntimeException -> L30 com.google.android.gms.internal.mlkit_vision_mediapipe.zzbe -> L32
            r1.zzb(r0, r4)     // Catch: java.lang.RuntimeException -> L30 com.google.android.gms.internal.mlkit_vision_mediapipe.zzbe -> L32
            goto L57
        L30:
            r0 = move-exception
            goto L34
        L32:
            r4 = move-exception
            goto L58
        L34:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ": "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            zzg(r0, r4)
        L57:
            return
        L58:
            throw r4
    }

    protected final boolean zzf(java.util.logging.Level r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r0 = r1.zza
            boolean r2 = r0.zzd(r2)
            return r2
    }
}
