package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzhr {
    private final long zza;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp zzb;

    zzhr(long r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "Invalid profiler, tearDown() might have been called already."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)
            r3.zza = r4
            r3.zzb = r6
            return
    }

    private final native byte[][] zzb(long r1);

    public final java.util.List zza() {
            r7 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r7.zzb
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = r7.zzb     // Catch: java.lang.Throwable -> L27
            long r1 = r1.zza()     // Catch: java.lang.Throwable -> L27
            r3 = 0
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            java.lang.String r2 = "Invalid context, tearDown() might have been called already."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r1, r2)     // Catch: java.lang.Throwable -> L27
            long r1 = r7.zza     // Catch: java.lang.Throwable -> L27
            byte[][] r1 = r7.zzb(r1)     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return r2
        L27:
            r1 = move-exception
            goto L41
        L29:
            int r3 = r1.length     // Catch: java.lang.Throwable -> L27
        L2a:
            if (r5 >= r3) goto L3f
            r4 = r1[r5]     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzfw r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzfw.zzc(r4)     // Catch: java.lang.Throwable -> L27 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L38
            r2.add(r4)     // Catch: java.lang.Throwable -> L27 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L38
            int r5 = r5 + 1
            goto L2a
        L38:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L27
            throw r2     // Catch: java.lang.Throwable -> L27
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return r2
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
    }
}
