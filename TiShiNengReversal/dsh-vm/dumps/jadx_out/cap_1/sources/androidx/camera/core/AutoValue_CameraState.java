package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_CameraState extends androidx.camera.core.CameraState {
    private final androidx.camera.core.CameraState.StateError error;
    private final androidx.camera.core.CameraState.Type type;

    AutoValue_CameraState(androidx.camera.core.CameraState.Type r1, @androidx.annotation.Nullable androidx.camera.core.CameraState.StateError r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.type = r1
            r0.error = r2
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null type"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.CameraState
            r2 = 0
            if (r1 == 0) goto L2d
            androidx.camera.core.CameraState r5 = (androidx.camera.core.CameraState) r5
            androidx.camera.core.CameraState$Type r1 = r4.type
            androidx.camera.core.CameraState$Type r3 = r5.getType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2d
            androidx.camera.core.CameraState$StateError r1 = r4.error
            if (r1 != 0) goto L22
            androidx.camera.core.CameraState$StateError r5 = r5.getError()
            if (r5 != 0) goto L2d
            goto L2c
        L22:
            androidx.camera.core.CameraState$StateError r5 = r5.getError()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2d
        L2c:
            return r0
        L2d:
            return r2
    }

    @Override // androidx.camera.core.CameraState
    @androidx.annotation.Nullable
    public androidx.camera.core.CameraState.StateError getError() {
            r1 = this;
            androidx.camera.core.CameraState$StateError r0 = r1.error
            return r0
    }

    @Override // androidx.camera.core.CameraState
    @androidx.annotation.NonNull
    public androidx.camera.core.CameraState.Type getType() {
            r1 = this;
            androidx.camera.core.CameraState$Type r0 = r1.type
            return r0
    }

    public int hashCode() {
            r2 = this;
            androidx.camera.core.CameraState$Type r0 = r2.type
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.core.CameraState$StateError r1 = r2.error
            if (r1 != 0) goto L12
            r1 = 0
            goto L16
        L12:
            int r1 = r1.hashCode()
        L16:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CameraState{type="
            r0.append(r1)
            androidx.camera.core.CameraState$Type r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            androidx.camera.core.CameraState$StateError r1 = r2.error
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
