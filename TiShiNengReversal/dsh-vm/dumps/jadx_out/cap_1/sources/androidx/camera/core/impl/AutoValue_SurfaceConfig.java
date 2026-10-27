package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_SurfaceConfig extends androidx.camera.core.impl.SurfaceConfig {
    private final androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize;
    private final androidx.camera.core.impl.SurfaceConfig.ConfigType configType;
    private final long streamUseCase;

    AutoValue_SurfaceConfig(androidx.camera.core.impl.SurfaceConfig.ConfigType r1, androidx.camera.core.impl.SurfaceConfig.ConfigSize r2, long r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L16
            r0.configType = r1
            if (r2 == 0) goto Le
            r0.configSize = r2
            r0.streamUseCase = r3
            return
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null configSize"
            r1.<init>(r2)
            throw r1
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null configType"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.camera.core.impl.SurfaceConfig
            r2 = 0
            if (r1 == 0) goto L2e
            androidx.camera.core.impl.SurfaceConfig r8 = (androidx.camera.core.impl.SurfaceConfig) r8
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = r7.configType
            androidx.camera.core.impl.SurfaceConfig$ConfigType r3 = r8.getConfigType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = r7.configSize
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = r8.getConfigSize()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            long r3 = r7.streamUseCase
            long r5 = r8.getStreamUseCase()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2e
            return r0
        L2e:
            return r2
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.SurfaceConfig.ConfigSize getConfigSize() {
            r1 = this;
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r0 = r1.configSize
            return r0
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType() {
            r1 = this;
            androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = r1.configType
            return r0
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public long getStreamUseCase() {
            r2 = this;
            long r0 = r2.streamUseCase
            return r0
    }

    public int hashCode() {
            r5 = this;
            androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = r5.configType
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = r5.configSize
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r1 = r5.streamUseCase
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
            java.lang.String r1 = "SurfaceConfig{configType="
            r0.append(r1)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = r3.configType
            r0.append(r1)
            java.lang.String r1 = ", configSize="
            r0.append(r1)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = r3.configSize
            r0.append(r1)
            java.lang.String r1 = ", streamUseCase="
            r0.append(r1)
            long r1 = r3.streamUseCase
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
