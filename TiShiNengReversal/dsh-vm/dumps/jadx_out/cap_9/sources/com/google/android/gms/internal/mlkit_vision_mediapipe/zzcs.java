package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzcs extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzck {
    static final boolean zza = false;
    static final boolean zzb = false;
    static final boolean zzc = false;
    private static final java.util.concurrent.atomic.AtomicReference zzd = null;
    private static final java.util.concurrent.atomic.AtomicLong zze = null;
    private static final java.util.concurrent.ConcurrentLinkedQueue zzf = null;
    private volatile com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd zzg;

    static {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            java.lang.String r3 = "robolectric"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zza = r0
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r3 = "goldfish"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            java.lang.String r3 = "ranchu"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L27
        L25:
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzb = r0
            java.lang.String r0 = android.os.Build.TYPE
            java.lang.String r3 = "eng"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3c
            java.lang.String r3 = "userdebug"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3d
        L3c:
            r1 = 1
        L3d:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzc = r1
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzd = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zze = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzf = r0
            return
    }

    private zzcs(java.lang.String r2) {
            r1 = this;
            r1.<init>(r2)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zza
            if (r2 != 0) goto L28
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzb
            if (r2 == 0) goto Lc
            goto L28
        Lc:
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzc
            if (r2 == 0) goto L24
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcv r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcy.zzf()
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcv r2 = r2.zzb(r0)
            java.lang.String r0 = r1.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r2 = r2.zza(r0)
            r1.zzg = r2
            return
        L24:
            r2 = 0
            r1.zzg = r2
            return
        L28:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcl r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzcl
            r2.<init>()
            java.lang.String r0 = r1.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r2 = r2.zza(r0)
            r1.zzg = r2
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd zze(java.lang.String r5) {
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzd
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L13
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcm r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzcm) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r5 = r0.zza(r5)
            return r5
        L13:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs
            int r1 = r5.length()
        L19:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L2f
            char r2 = r5.charAt(r1)
            r3 = 46
            r4 = 36
            if (r2 != r4) goto L2c
            java.lang.String r5 = r5.replace(r4, r3)
            goto L2f
        L2c:
            if (r2 == r3) goto L2f
            goto L19
        L2f:
            r0.<init>(r5)
            java.util.concurrent.ConcurrentLinkedQueue r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcq.zza
            r5.offer(r0)
            java.util.concurrent.atomic.AtomicReference r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzd
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L5f
        L3f:
            java.util.concurrent.ConcurrentLinkedQueue r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcq.zza
            java.lang.Object r5 = r5.poll()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs) r5
            if (r5 == 0) goto L5c
            java.util.concurrent.atomic.AtomicReference r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzd
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcm r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzcm) r1
            java.lang.String r2 = r5.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r1 = r1.zza(r2)
            r5.zzg = r1
            goto L3f
        L5c:
            zzf()
        L5f:
            return r0
    }

    private static void zzf() {
        L0:
            java.util.concurrent.ConcurrentLinkedQueue r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzf
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzcr) r0
            if (r0 == 0) goto L2b
            java.util.concurrent.atomic.AtomicLong r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zze
            r1.getAndDecrement()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r1 = r0.zzb()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb r0 = r0.zza()
            boolean r2 = r0.zzp()
            if (r2 != 0) goto L27
            java.util.logging.Level r2 = r0.zzk()
            boolean r2 = r1.zzd(r2)
            if (r2 == 0) goto L0
        L27:
            r1.zzc(r0)
            goto L0
        L2b:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzck, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd
    public final void zzb(java.lang.RuntimeException r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r0 = r1.zzg
            if (r0 == 0) goto L9
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r0 = r1.zzg
            r0.zzb(r2, r3)
        L9:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd
    @android.annotation.SuppressLint({"LongLogTag"})
    public final void zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb r6) {
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r0 = r5.zzg
            if (r0 == 0) goto La
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r0 = r5.zzg
            r0.zzc(r6)
            return
        La:
            java.util.concurrent.atomic.AtomicLong r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zze
            long r0 = r0.incrementAndGet()
            r2 = 20
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1b
            java.util.concurrent.ConcurrentLinkedQueue r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzf
            r0.poll()
        L1b:
            java.util.concurrent.ConcurrentLinkedQueue r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zzf
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcr r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzcr
            r1.<init>(r5, r6)
            r0.offer(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r6 = r5.zzg
            if (r6 == 0) goto L2c
            zzf()
        L2c:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd
    public final boolean zzd(java.util.logging.Level r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r0 = r1.zzg
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r0 = r1.zzg
            boolean r2 = r0.zzd(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }
}
