package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BitmapInStreamingChecker {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;
    private final java.util.LinkedList zzb;
    private long zzc;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "StreamingFormatChecker"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.vision.common.internal.BitmapInStreamingChecker.zza = r0
            return
    }

    public BitmapInStreamingChecker() {
            r2 = this;
            r2.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.zzb = r0
            r0 = -1
            r2.zzc = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void check(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r7) {
            r6 = this;
            int r7 = r7.getFormat()
            r0 = -1
            if (r7 == r0) goto L8
            goto L67
        L8:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.LinkedList r7 = r6.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r7.add(r2)
            java.util.LinkedList r7 = r6.zzb
            int r7 = r7.size()
            r2 = 5
            if (r7 <= r2) goto L23
            java.util.LinkedList r7 = r6.zzb
            r7.removeFirst()
        L23:
            java.util.LinkedList r7 = r6.zzb
            int r7 = r7.size()
            if (r7 != r2) goto L67
            java.util.LinkedList r7 = r6.zzb
            java.lang.Object r7 = r7.peekFirst()
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.lang.Long r7 = (java.lang.Long) r7
            long r2 = r7.longValue()
            long r2 = r0 - r2
            r4 = 5000(0x1388, double:2.4703E-320)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L67
            long r2 = r6.zzc
            r4 = -1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L5c
            long r2 = r0 - r2
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 5
            long r4 = r7.toMillis(r4)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L5c
            goto L67
        L5c:
            r6.zzc = r0
            com.google.android.gms.common.internal.GmsLogger r7 = com.google.mlkit.vision.common.internal.BitmapInStreamingChecker.zza
            java.lang.String r0 = "StreamingFormatChecker"
            java.lang.String r1 = "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."
            r7.w(r0, r1)
        L67:
            return
    }
}
