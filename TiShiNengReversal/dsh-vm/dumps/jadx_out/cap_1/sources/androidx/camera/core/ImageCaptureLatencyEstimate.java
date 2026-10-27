package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageCaptureLatencyEstimate {
    public static final long UNDEFINED_CAPTURE_LATENCY = -1;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.ImageCaptureLatencyEstimate UNDEFINED_IMAGE_CAPTURE_LATENCY = null;
    public static final long UNDEFINED_PROCESSING_LATENCY = -1;
    public final long captureLatencyMillis;
    public final long processingLatencyMillis;

    static {
            androidx.camera.core.ImageCaptureLatencyEstimate r0 = new androidx.camera.core.ImageCaptureLatencyEstimate
            r1 = -1
            r0.<init>(r1, r1)
            androidx.camera.core.ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY = r0
            return
    }

    ImageCaptureLatencyEstimate(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.captureLatencyMillis = r1
            r0.processingLatencyMillis = r3
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.camera.core.ImageCaptureLatencyEstimate
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.camera.core.ImageCaptureLatencyEstimate r8 = (androidx.camera.core.ImageCaptureLatencyEstimate) r8
            long r3 = r7.captureLatencyMillis
            long r5 = r8.captureLatencyMillis
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L1d
            long r3 = r7.processingLatencyMillis
            long r5 = r8.processingLatencyMillis
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.captureLatencyMillis
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r4.processingLatencyMillis
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = java.util.Objects.hash(r2)
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "captureLatencyMillis="
            r0.append(r1)
            long r1 = r3.captureLatencyMillis
            r0.append(r1)
            java.lang.String r1 = ", processingLatencyMillis="
            r0.append(r1)
            long r1 = r3.processingLatencyMillis
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
