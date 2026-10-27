package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_CameraThreadConfig extends androidx.camera.core.impl.CameraThreadConfig {
    private final java.util.concurrent.Executor cameraExecutor;
    private final android.os.Handler schedulerHandler;

    AutoValue_CameraThreadConfig(java.util.concurrent.Executor r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            r0.cameraExecutor = r1
            if (r2 == 0) goto Lc
            r0.schedulerHandler = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null schedulerHandler"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null cameraExecutor"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.impl.CameraThreadConfig
            r2 = 0
            if (r1 == 0) goto L24
            androidx.camera.core.impl.CameraThreadConfig r5 = (androidx.camera.core.impl.CameraThreadConfig) r5
            java.util.concurrent.Executor r1 = r4.cameraExecutor
            java.util.concurrent.Executor r3 = r5.getCameraExecutor()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            android.os.Handler r1 = r4.schedulerHandler
            android.os.Handler r5 = r5.getSchedulerHandler()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            return r0
        L24:
            return r2
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    @androidx.annotation.NonNull
    public java.util.concurrent.Executor getCameraExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.cameraExecutor
            return r0
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    @androidx.annotation.NonNull
    public android.os.Handler getSchedulerHandler() {
            r1 = this;
            android.os.Handler r0 = r1.schedulerHandler
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.cameraExecutor
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            android.os.Handler r1 = r2.schedulerHandler
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CameraThreadConfig{cameraExecutor="
            r0.append(r1)
            java.util.concurrent.Executor r1 = r2.cameraExecutor
            r0.append(r1)
            java.lang.String r1 = ", schedulerHandler="
            r0.append(r1)
            android.os.Handler r1 = r2.schedulerHandler
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
