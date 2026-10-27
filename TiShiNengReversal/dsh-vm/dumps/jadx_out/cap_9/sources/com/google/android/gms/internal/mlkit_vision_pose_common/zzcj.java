package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzcj extends java.io.OutputStream {
    private long zza;

    zzcj() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            return
    }

    @Override // java.io.OutputStream
    public final void write(int r5) {
            r4 = this;
            long r0 = r4.zza
            r2 = 1
            long r0 = r0 + r2
            r4.zza = r0
            return
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r5) {
            r4 = this;
            long r0 = r4.zza
            int r5 = r5.length
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.zza = r0
            return
    }

    @Override // java.io.OutputStream
    public final void write(@androidx.annotation.NonNull byte[] r3, int r4, int r5) {
            r2 = this;
            if (r4 < 0) goto L13
            int r3 = r3.length
            if (r4 > r3) goto L13
            if (r5 < 0) goto L13
            int r4 = r4 + r5
            if (r4 > r3) goto L13
            if (r4 < 0) goto L13
            long r3 = r2.zza
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.zza = r3
            return
        L13:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    final long zza() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }
}
