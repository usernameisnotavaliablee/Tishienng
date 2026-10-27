package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzr extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzai {
    zzr(java.lang.String r1, java.lang.Class r2, boolean r3) {
            r0 = this;
            java.lang.String r1 = "group_by"
            r3 = 1
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzai
    public final void zza(java.util.Iterator r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzah r5) {
            r3 = this;
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.next()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L18
            java.lang.String r4 = r3.zzf()
            r5.zza(r4, r0)
            return
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 91
            r1.append(r2)
            r1.append(r0)
        L25:
            r0 = 44
            r1.append(r0)
            java.lang.Object r0 = r4.next()
            r1.append(r0)
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L25
            java.lang.String r4 = r3.zzf()
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.zza(r4, r0)
        L47:
            return
    }
}
