package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_SurfaceRequest_TransformationInfo extends androidx.camera.core.SurfaceRequest.TransformationInfo {
    private final android.graphics.Rect getCropRect;
    private final boolean getMirroring;
    private final int getRotationDegrees;
    private final android.graphics.Matrix getSensorToBufferTransform;
    private final int getTargetRotation;
    private final boolean hasCameraTransform;

    AutoValue_SurfaceRequest_TransformationInfo(android.graphics.Rect r1, int r2, int r3, boolean r4, android.graphics.Matrix r5, boolean r6) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L1c
            r0.getCropRect = r1
            r0.getRotationDegrees = r2
            r0.getTargetRotation = r3
            r0.hasCameraTransform = r4
            if (r5 == 0) goto L14
            r0.getSensorToBufferTransform = r5
            r0.getMirroring = r6
            return
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null getSensorToBufferTransform"
            r1.<init>(r2)
            throw r1
        L1c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null getCropRect"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.SurfaceRequest.TransformationInfo
            r2 = 0
            if (r1 == 0) goto L44
            androidx.camera.core.SurfaceRequest$TransformationInfo r5 = (androidx.camera.core.SurfaceRequest.TransformationInfo) r5
            android.graphics.Rect r1 = r4.getCropRect
            android.graphics.Rect r3 = r5.getCropRect()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            int r1 = r4.getRotationDegrees
            int r3 = r5.getRotationDegrees()
            if (r1 != r3) goto L44
            int r1 = r4.getTargetRotation
            int r3 = r5.getTargetRotation()
            if (r1 != r3) goto L44
            boolean r1 = r4.hasCameraTransform
            boolean r3 = r5.hasCameraTransform()
            if (r1 != r3) goto L44
            android.graphics.Matrix r1 = r4.getSensorToBufferTransform
            android.graphics.Matrix r3 = r5.getSensorToBufferTransform()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            boolean r1 = r4.getMirroring
            boolean r5 = r5.getMirroring()
            if (r1 != r5) goto L44
            return r0
        L44:
            return r2
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    @androidx.annotation.NonNull
    public android.graphics.Rect getCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.getCropRect
            return r0
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean getMirroring() {
            r1 = this;
            boolean r0 = r1.getMirroring
            return r0
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getRotationDegrees() {
            r1 = this;
            int r0 = r1.getRotationDegrees
            return r0
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.graphics.Matrix getSensorToBufferTransform() {
            r1 = this;
            android.graphics.Matrix r0 = r1.getSensorToBufferTransform
            return r0
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getTargetRotation() {
            r1 = this;
            int r0 = r1.getTargetRotation
            return r0
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean hasCameraTransform() {
            r1 = this;
            boolean r0 = r1.hasCameraTransform
            return r0
    }

    public int hashCode() {
            r5 = this;
            android.graphics.Rect r0 = r5.getCropRect
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r5.getRotationDegrees
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r5.getTargetRotation
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r5.hasCameraTransform
            r3 = 1237(0x4d5, float:1.733E-42)
            r4 = 1231(0x4cf, float:1.725E-42)
            if (r2 == 0) goto L21
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L23
        L21:
            r2 = 1237(0x4d5, float:1.733E-42)
        L23:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.graphics.Matrix r2 = r5.getSensorToBufferTransform
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r1 = r5.getMirroring
            if (r1 == 0) goto L35
            r3 = 1231(0x4cf, float:1.725E-42)
        L35:
            r0 = r0 ^ r3
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TransformationInfo{getCropRect="
            r0.append(r1)
            android.graphics.Rect r1 = r2.getCropRect
            r0.append(r1)
            java.lang.String r1 = ", getRotationDegrees="
            r0.append(r1)
            int r1 = r2.getRotationDegrees
            r0.append(r1)
            java.lang.String r1 = ", getTargetRotation="
            r0.append(r1)
            int r1 = r2.getTargetRotation
            r0.append(r1)
            java.lang.String r1 = ", hasCameraTransform="
            r0.append(r1)
            boolean r1 = r2.hasCameraTransform
            r0.append(r1)
            java.lang.String r1 = ", getSensorToBufferTransform="
            r0.append(r1)
            android.graphics.Matrix r1 = r2.getSensorToBufferTransform
            r0.append(r1)
            java.lang.String r1 = ", getMirroring="
            r0.append(r1)
            boolean r1 = r2.getMirroring
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
