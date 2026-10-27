package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_AudioStats extends androidx.camera.video.AudioStats {
    private final double audioAmplitudeInternal;
    private final int audioState;
    private final java.lang.Throwable errorCause;

    AutoValue_AudioStats(int r1, double r2, @androidx.annotation.Nullable java.lang.Throwable r4) {
            r0 = this;
            r0.<init>()
            r0.audioState = r1
            r0.audioAmplitudeInternal = r2
            r0.errorCause = r4
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.camera.video.AudioStats
            r2 = 0
            if (r1 == 0) goto L3b
            androidx.camera.video.AudioStats r8 = (androidx.camera.video.AudioStats) r8
            int r1 = r7.audioState
            int r3 = r8.getAudioState()
            if (r1 != r3) goto L3b
            double r3 = r7.audioAmplitudeInternal
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.getAudioAmplitudeInternal()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3b
            java.lang.Throwable r1 = r7.errorCause
            if (r1 != 0) goto L30
            java.lang.Throwable r8 = r8.getErrorCause()
            if (r8 != 0) goto L3b
            goto L3a
        L30:
            java.lang.Throwable r8 = r8.getErrorCause()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L3b
        L3a:
            return r0
        L3b:
            return r2
    }

    @Override // androidx.camera.video.AudioStats
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    double getAudioAmplitudeInternal() {
            r2 = this;
            double r0 = r2.audioAmplitudeInternal
            return r0
    }

    @Override // androidx.camera.video.AudioStats
    public int getAudioState() {
            r1 = this;
            int r0 = r1.audioState
            return r0
    }

    @Override // androidx.camera.video.AudioStats
    @androidx.annotation.Nullable
    public java.lang.Throwable getErrorCause() {
            r1 = this;
            java.lang.Throwable r0 = r1.errorCause
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.audioState
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            double r2 = r6.audioAmplitudeInternal
            long r2 = java.lang.Double.doubleToLongBits(r2)
            r4 = 32
            long r2 = r2 >>> r4
            double r4 = r6.audioAmplitudeInternal
            long r4 = java.lang.Double.doubleToLongBits(r4)
            long r2 = r2 ^ r4
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            java.lang.Throwable r1 = r6.errorCause
            if (r1 != 0) goto L22
            r1 = 0
            goto L26
        L22:
            int r1 = r1.hashCode()
        L26:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioStats{audioState="
            r0.append(r1)
            int r1 = r3.audioState
            r0.append(r1)
            java.lang.String r1 = ", audioAmplitudeInternal="
            r0.append(r1)
            double r1 = r3.audioAmplitudeInternal
            r0.append(r1)
            java.lang.String r1 = ", errorCause="
            r0.append(r1)
            java.lang.Throwable r1 = r3.errorCause
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
