package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzmo implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzms zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zzmo(com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmn r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r1 = -1
            r0.zzb = r1
            return
    }

    private final java.util.Iterator zza() {
            r1 = this;
            java.util.Iterator r0 = r1.zzd
            if (r0 != 0) goto L14
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r1.zza
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzms.zzh(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.zzd = r0
        L14:
            java.util.Iterator r0 = r1.zzd
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.zzb
            r1 = 1
            int r0 = r0 + r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r2 = r4.zza
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzms.zzb(r2)
            if (r0 < r3) goto L23
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzms.zzh(r2)
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L22
            java.util.Iterator r0 = r4.zza()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L22
            return r1
        L22:
            return r2
        L23:
            return r1
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r3 = this;
            r0 = 1
            r3.zzc = r0
            int r1 = r3.zzb
            int r1 = r1 + r0
            r3.zzb = r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r3.zza
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzms.zzb(r0)
            if (r1 >= r2) goto L19
            java.lang.Object[] r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzms.zzk(r0)
            r0 = r0[r1]
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmm r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmm) r0
            return r0
        L19:
            java.util.Iterator r0 = r3.zza()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.zzc
            if (r0 == 0) goto L26
            r0 = 0
            r3.zzc = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r3.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms.zzi(r0)
            int r0 = r3.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r1 = r3.zza
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzms.zzb(r1)
            if (r0 >= r2) goto L1e
            int r2 = r0 + (-1)
            r3.zzb = r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms.zze(r1, r0)
            return
        L1e:
            java.util.Iterator r0 = r3.zza()
            r0.remove()
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remove() was called before next()"
            r0.<init>(r1)
            throw r0
    }
}
