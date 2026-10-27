package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_RecordingStats extends androidx.camera.video.RecordingStats {
    private final androidx.camera.video.AudioStats audioStats;
    private final long numBytesRecorded;
    private final long recordedDurationNanos;

    AutoValue_RecordingStats(long r1, long r3, androidx.camera.video.AudioStats r5) {
            r0 = this;
            r0.<init>()
            r0.recordedDurationNanos = r1
            r0.numBytesRecorded = r3
            if (r5 == 0) goto Lc
            r0.audioStats = r5
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null audioStats"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.camera.video.RecordingStats
            r2 = 0
            if (r1 == 0) goto L2c
            androidx.camera.video.RecordingStats r8 = (androidx.camera.video.RecordingStats) r8
            long r3 = r7.recordedDurationNanos
            long r5 = r8.getRecordedDurationNanos()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2c
            long r3 = r7.numBytesRecorded
            long r5 = r8.getNumBytesRecorded()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2c
            androidx.camera.video.AudioStats r1 = r7.audioStats
            androidx.camera.video.AudioStats r8 = r8.getAudioStats()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L2c
            return r0
        L2c:
            return r2
    }

    @Override // androidx.camera.video.RecordingStats
    @androidx.annotation.NonNull
    public androidx.camera.video.AudioStats getAudioStats() {
            r1 = this;
            androidx.camera.video.AudioStats r0 = r1.audioStats
            return r0
    }

    @Override // androidx.camera.video.RecordingStats
    public long getNumBytesRecorded() {
            r2 = this;
            long r0 = r2.numBytesRecorded
            return r0
    }

    @Override // androidx.camera.video.RecordingStats
    public long getRecordedDurationNanos() {
            r2 = this;
            long r0 = r2.recordedDurationNanos
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.recordedDurationNanos
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            long r3 = r7.numBytesRecorded
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r2 = (int) r3
            r1 = r1 ^ r2
            int r1 = r1 * r0
            androidx.camera.video.AudioStats r0 = r7.audioStats
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RecordingStats{recordedDurationNanos="
            r0.append(r1)
            long r1 = r3.recordedDurationNanos
            r0.append(r1)
            java.lang.String r1 = ", numBytesRecorded="
            r0.append(r1)
            long r1 = r3.numBytesRecorded
            r0.append(r1)
            java.lang.String r1 = ", audioStats="
            r0.append(r1)
            androidx.camera.video.AudioStats r1 = r3.audioStats
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
