package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_CameraState_StateError extends androidx.camera.core.CameraState.StateError {
    private final java.lang.Throwable cause;
    private final int code;

    AutoValue_CameraState_StateError(int r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            r0.cause = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.CameraState.StateError
            r2 = 0
            if (r1 == 0) goto L29
            androidx.camera.core.CameraState$StateError r5 = (androidx.camera.core.CameraState.StateError) r5
            int r1 = r4.code
            int r3 = r5.getCode()
            if (r1 != r3) goto L29
            java.lang.Throwable r1 = r4.cause
            if (r1 != 0) goto L1e
            java.lang.Throwable r5 = r5.getCause()
            if (r5 != 0) goto L29
            goto L28
        L1e:
            java.lang.Throwable r5 = r5.getCause()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L29
        L28:
            return r0
        L29:
            return r2
    }

    @Override // androidx.camera.core.CameraState.StateError
    @androidx.annotation.Nullable
    public java.lang.Throwable getCause() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            return r0
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.code
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.Throwable r1 = r2.cause
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "StateError{code="
            r0.append(r1)
            int r1 = r2.code
            r0.append(r1)
            java.lang.String r1 = ", cause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.cause
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
