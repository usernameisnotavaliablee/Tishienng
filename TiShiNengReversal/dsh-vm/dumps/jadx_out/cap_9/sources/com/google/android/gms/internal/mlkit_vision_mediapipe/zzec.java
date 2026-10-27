package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzec implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb {
    zzec() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final int zzc(java.lang.StackTraceElement[] r2, java.lang.Class r3, int r4) {
            java.lang.String r3 = r3.getName()
            r4 = 3
            r0 = 0
        L6:
            int r1 = r2.length
            if (r4 >= r1) goto L1d
            r1 = r2[r4]
            java.lang.String r1 = r1.getClassName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L17
            r0 = 1
            goto L1a
        L17:
            if (r0 == 0) goto L1a
            return r4
        L1a:
            int r4 = r4 + 1
            goto L6
        L1d:
            r2 = -1
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb
    public final java.lang.StackTraceElement zza(java.lang.Class r2, int r3) {
            r1 = this;
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>()
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            r0 = 3
            int r2 = zzc(r3, r2, r0)
            r0 = -1
            if (r2 == r0) goto L14
            r2 = r3[r2]
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzeb
    public final java.lang.StackTraceElement[] zzb(java.lang.Class r4, int r5, int r6) {
            r3 = this;
            r6 = 1
            r0 = 0
            r1 = -1
            if (r5 == r1) goto L9
            if (r5 <= 0) goto L8
            goto L9
        L8:
            r6 = 0
        L9:
            java.lang.String r2 = "maxDepth must be > 0 or -1"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zzc(r6, r2)
            java.lang.Throwable r6 = new java.lang.Throwable
            r6.<init>()
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()
            r2 = 3
            int r4 = zzc(r6, r4, r2)
            if (r4 != r1) goto L21
            java.lang.StackTraceElement[] r4 = new java.lang.StackTraceElement[r0]
            return r4
        L21:
            int r1 = r6.length
            int r1 = r1 - r4
            if (r5 <= 0) goto L27
            if (r5 < r1) goto L28
        L27:
            r5 = r1
        L28:
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r6, r4, r1, r0, r5)
            return r1
    }
}
