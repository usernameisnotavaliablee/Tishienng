package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_ImmutableImageInfo extends androidx.camera.core.ImmutableImageInfo {
    private final int rotationDegrees;
    private final android.graphics.Matrix sensorToBufferTransformMatrix;
    private final androidx.camera.core.impl.TagBundle tagBundle;
    private final long timestamp;

    AutoValue_ImmutableImageInfo(androidx.camera.core.impl.TagBundle r1, long r2, int r4, android.graphics.Matrix r5) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L18
            r0.tagBundle = r1
            r0.timestamp = r2
            r0.rotationDegrees = r4
            if (r5 == 0) goto L10
            r0.sensorToBufferTransformMatrix = r5
            return
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null sensorToBufferTransformMatrix"
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null tagBundle"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.camera.core.ImmutableImageInfo
            r2 = 0
            if (r1 == 0) goto L36
            androidx.camera.core.ImmutableImageInfo r8 = (androidx.camera.core.ImmutableImageInfo) r8
            androidx.camera.core.impl.TagBundle r1 = r7.tagBundle
            androidx.camera.core.impl.TagBundle r3 = r8.getTagBundle()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L36
            long r3 = r7.timestamp
            long r5 = r8.getTimestamp()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L36
            int r1 = r7.rotationDegrees
            int r3 = r8.getRotationDegrees()
            if (r1 != r3) goto L36
            android.graphics.Matrix r1 = r7.sensorToBufferTransformMatrix
            android.graphics.Matrix r8 = r8.getSensorToBufferTransformMatrix()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L36
            return r0
        L36:
            return r2
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public int getRotationDegrees() {
            r1 = this;
            int r0 = r1.rotationDegrees
            return r0
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    @androidx.annotation.NonNull
    public android.graphics.Matrix getSensorToBufferTransformMatrix() {
            r1 = this;
            android.graphics.Matrix r0 = r1.sensorToBufferTransformMatrix
            return r0
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.TagBundle getTagBundle() {
            r1 = this;
            androidx.camera.core.impl.TagBundle r0 = r1.tagBundle
            return r0
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public long getTimestamp() {
            r2 = this;
            long r0 = r2.timestamp
            return r0
    }

    public int hashCode() {
            r6 = this;
            androidx.camera.core.impl.TagBundle r0 = r6.tagBundle
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            long r2 = r6.timestamp
            r4 = 32
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            int r2 = r6.rotationDegrees
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.graphics.Matrix r1 = r6.sensorToBufferTransformMatrix
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ImmutableImageInfo{tagBundle="
            r0.append(r1)
            androidx.camera.core.impl.TagBundle r1 = r3.tagBundle
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.timestamp
            r0.append(r1)
            java.lang.String r1 = ", rotationDegrees="
            r0.append(r1)
            int r1 = r3.rotationDegrees
            r0.append(r1)
            java.lang.String r1 = ", sensorToBufferTransformMatrix="
            r0.append(r1)
            android.graphics.Matrix r1 = r3.sensorToBufferTransformMatrix
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
