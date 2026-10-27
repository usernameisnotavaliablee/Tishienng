package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzai {
    private final java.lang.String zza;
    private final java.lang.Class zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final long zze;

    protected zzai(java.lang.String r2, java.lang.Class r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    private zzai(java.lang.String r4, java.lang.Class r5, boolean r6, boolean r7) {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zzb(r4)
            r3.zza = r4
            r3.zzb = r5
            r3.zzc = r6
            r3.zzd = r7
            int r4 = java.lang.System.identityHashCode(r3)
            r5 = 0
            r6 = 0
        L15:
            r0 = 5
            if (r5 >= r0) goto L24
            r0 = r4 & 63
            r1 = 1
            long r0 = r1 << r0
            long r6 = r6 | r0
            int r4 = r4 >>> 6
            int r5 = r5 + 1
            goto L15
        L24:
            r3.zze = r6
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzai zzd(java.lang.String r2, java.lang.Class r3) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzai
            r1 = 0
            r0.<init>(r2, r3, r1, r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Class r0 = r3.zzb
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            java.lang.String r1 = r3.zza
            r2.append(r1)
            java.lang.String r1 = "["
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    protected void zza(java.util.Iterator r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzah r3) {
            r1 = this;
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r2.next()
            r1.zzb(r0, r3)
            goto L0
        Le:
            return
    }

    protected void zzb(java.lang.Object r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzah r3) {
            r1 = this;
            java.lang.String r0 = r1.zza
            r3.zza(r0, r2)
            return
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    public final java.lang.Object zze(java.lang.Object r2) {
            r1 = this;
            java.lang.Class r0 = r1.zzb
            java.lang.Object r2 = r0.cast(r2)
            return r2
    }

    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final void zzg(java.lang.Object r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzah r4) {
            r2 = this;
            boolean r0 = r2.zzd
            if (r0 == 0) goto L12
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzch.zza()
            r1 = 20
            if (r0 <= r1) goto L12
            java.lang.String r0 = r2.zza
            r4.zza(r0, r3)
            return
        L12:
            r2.zzb(r3, r4)
            return
    }

    public final void zzh(java.util.Iterator r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzah r4) {
            r2 = this;
            boolean r0 = r2.zzc
            if (r0 == 0) goto L25
            boolean r0 = r2.zzd
            if (r0 == 0) goto L21
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzch.zza()
            r1 = 20
            if (r0 <= r1) goto L21
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.String r0 = r2.zza
            java.lang.Object r1 = r3.next()
            r4.zza(r0, r1)
            goto L10
        L20:
            return
        L21:
            r2.zza(r3, r4)
            return
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "non repeating key"
            r3.<init>(r4)
            throw r3
    }

    public final boolean zzi() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }
}
