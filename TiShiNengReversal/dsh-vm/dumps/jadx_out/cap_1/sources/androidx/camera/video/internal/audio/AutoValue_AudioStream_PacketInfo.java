package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_AudioStream_PacketInfo extends androidx.camera.video.internal.audio.AudioStream.PacketInfo {
    private final int sizeInBytes;
    private final long timestampNs;

    AutoValue_AudioStream_PacketInfo(int r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.sizeInBytes = r1
            r0.timestampNs = r2
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.camera.video.internal.audio.AudioStream.PacketInfo
            r2 = 0
            if (r1 == 0) goto L1e
            androidx.camera.video.internal.audio.AudioStream$PacketInfo r8 = (androidx.camera.video.internal.audio.AudioStream.PacketInfo) r8
            int r1 = r7.sizeInBytes
            int r3 = r8.getSizeInBytes()
            if (r1 != r3) goto L1e
            long r3 = r7.timestampNs
            long r5 = r8.getTimestampNs()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L1e
            return r0
        L1e:
            return r2
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public int getSizeInBytes() {
            r1 = this;
            int r0 = r1.sizeInBytes
            return r0
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public long getTimestampNs() {
            r2 = this;
            long r0 = r2.timestampNs
            return r0
    }

    public int hashCode() {
            r5 = this;
            int r0 = r5.sizeInBytes
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            long r1 = r5.timestampNs
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PacketInfo{sizeInBytes="
            r0.append(r1)
            int r1 = r3.sizeInBytes
            r0.append(r1)
            java.lang.String r1 = ", timestampNs="
            r0.append(r1)
            long r1 = r3.timestampNs
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
