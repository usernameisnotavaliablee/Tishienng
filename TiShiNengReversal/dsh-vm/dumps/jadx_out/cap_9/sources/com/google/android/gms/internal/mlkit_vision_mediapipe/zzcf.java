package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzcf {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzch zza = null;

    static {
            java.lang.String[] r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzch.zzo()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzch r0 = zzb(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcf.zza = r0
            return
    }

    public zzcf() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzch zza() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzch r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcf.zza
            return r0
    }

    private static com.google.android.gms.internal.mlkit_vision_mediapipe.zzch zzb(java.lang.String[] r8) {
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzco.zza     // Catch: java.lang.NoClassDefFoundError -> L4
            goto L6
        L4:
            r1 = r0
        L6:
            if (r1 == 0) goto L9
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.length
            r3 = 0
            r4 = 0
        L11:
            if (r4 >= r2) goto L40
            r5 = r8[r4]
            java.lang.Class r6 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Constructor r6 = r6.getConstructor(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.newInstance(r0)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzch r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzch) r6     // Catch: java.lang.Throwable -> L24
            return r6
        L24:
            r6 = move-exception
            boolean r7 = r6 instanceof java.lang.reflect.InvocationTargetException
            if (r7 == 0) goto L2d
            java.lang.Throwable r6 = r6.getCause()
        L2d:
            r7 = 10
            r1.append(r7)
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            r1.append(r6)
            int r4 = r4 + 1
            goto L11
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "No logging platforms found:"
            java.lang.StringBuilder r0 = r1.insert(r3, r0)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }
}
