package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_SurfaceProcessorNode_OutConfig extends androidx.camera.core.processing.SurfaceProcessorNode.OutConfig {
    private final android.graphics.Rect cropRect;
    private final int format;
    private final boolean mirroring;
    private final int rotationDegrees;
    private final android.util.Size size;
    private final int targets;
    private final java.util.UUID uuid;

    AutoValue_SurfaceProcessorNode_OutConfig(java.util.UUID r1, int r2, int r3, android.graphics.Rect r4, android.util.Size r5, int r6, boolean r7) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L28
            r0.uuid = r1
            r0.targets = r2
            r0.format = r3
            if (r4 == 0) goto L20
            r0.cropRect = r4
            if (r5 == 0) goto L18
            r0.size = r5
            r0.rotationDegrees = r6
            r0.mirroring = r7
            return
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null size"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null cropRect"
            r1.<init>(r2)
            throw r1
        L28:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null uuid"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
            r2 = 0
            if (r1 == 0) goto L50
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r5 = (androidx.camera.core.processing.SurfaceProcessorNode.OutConfig) r5
            java.util.UUID r1 = r4.uuid
            java.util.UUID r3 = r5.getUuid()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            int r1 = r4.targets
            int r3 = r5.getTargets()
            if (r1 != r3) goto L50
            int r1 = r4.format
            int r3 = r5.getFormat()
            if (r1 != r3) goto L50
            android.graphics.Rect r1 = r4.cropRect
            android.graphics.Rect r3 = r5.getCropRect()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            android.util.Size r1 = r4.size
            android.util.Size r3 = r5.getSize()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            int r1 = r4.rotationDegrees
            int r3 = r5.getRotationDegrees()
            if (r1 != r3) goto L50
            boolean r1 = r4.mirroring
            boolean r5 = r5.getMirroring()
            if (r1 != r5) goto L50
            return r0
        L50:
            return r2
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    @androidx.annotation.NonNull
    public android.graphics.Rect getCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.cropRect
            return r0
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public int getFormat() {
            r1 = this;
            int r0 = r1.format
            return r0
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public boolean getMirroring() {
            r1 = this;
            boolean r0 = r1.mirroring
            return r0
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public int getRotationDegrees() {
            r1 = this;
            int r0 = r1.rotationDegrees
            return r0
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    @androidx.annotation.NonNull
    public android.util.Size getSize() {
            r1 = this;
            android.util.Size r0 = r1.size
            return r0
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public int getTargets() {
            r1 = this;
            int r0 = r1.targets
            return r0
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    @androidx.annotation.NonNull
    java.util.UUID getUuid() {
            r1 = this;
            java.util.UUID r0 = r1.uuid
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.util.UUID r0 = r3.uuid
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.targets
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.format
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.graphics.Rect r2 = r3.cropRect
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r2 = r3.size
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.rotationDegrees
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r1 = r3.mirroring
            if (r1 == 0) goto L34
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L36
        L34:
            r1 = 1237(0x4d5, float:1.733E-42)
        L36:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OutConfig{uuid="
            r0.append(r1)
            java.util.UUID r1 = r2.uuid
            r0.append(r1)
            java.lang.String r1 = ", targets="
            r0.append(r1)
            int r1 = r2.targets
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            int r1 = r2.format
            r0.append(r1)
            java.lang.String r1 = ", cropRect="
            r0.append(r1)
            android.graphics.Rect r1 = r2.cropRect
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            android.util.Size r1 = r2.size
            r0.append(r1)
            java.lang.String r1 = ", rotationDegrees="
            r0.append(r1)
            int r1 = r2.rotationDegrees
            r0.append(r1)
            java.lang.String r1 = ", mirroring="
            r0.append(r1)
            boolean r1 = r2.mirroring
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
