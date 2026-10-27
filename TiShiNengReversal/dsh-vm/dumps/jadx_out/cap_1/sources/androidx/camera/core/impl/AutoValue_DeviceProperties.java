package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_DeviceProperties extends androidx.camera.core.impl.DeviceProperties {
    private final java.lang.String manufacturer;
    private final java.lang.String model;
    private final int sdkVersion;

    AutoValue_DeviceProperties(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L16
            r0.manufacturer = r1
            if (r2 == 0) goto Le
            r0.model = r2
            r0.sdkVersion = r3
            return
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null model"
            r1.<init>(r2)
            throw r1
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null manufacturer"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.impl.DeviceProperties
            r2 = 0
            if (r1 == 0) goto L2c
            androidx.camera.core.impl.DeviceProperties r5 = (androidx.camera.core.impl.DeviceProperties) r5
            java.lang.String r1 = r4.manufacturer
            java.lang.String r3 = r5.manufacturer()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            java.lang.String r1 = r4.model
            java.lang.String r3 = r5.model()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            int r1 = r4.sdkVersion
            int r5 = r5.sdkVersion()
            if (r1 != r5) goto L2c
            return r0
        L2c:
            return r2
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.manufacturer
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.model
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.sdkVersion
            r0 = r0 ^ r1
            return r0
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    @androidx.annotation.NonNull
    public java.lang.String manufacturer() {
            r1 = this;
            java.lang.String r0 = r1.manufacturer
            return r0
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    @androidx.annotation.NonNull
    public java.lang.String model() {
            r1 = this;
            java.lang.String r0 = r1.model
            return r0
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public int sdkVersion() {
            r1 = this;
            int r0 = r1.sdkVersion
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DeviceProperties{manufacturer="
            r0.append(r1)
            java.lang.String r1 = r2.manufacturer
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            java.lang.String r1 = r2.model
            r0.append(r1)
            java.lang.String r1 = ", sdkVersion="
            r0.append(r1)
            int r1 = r2.sdkVersion
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
