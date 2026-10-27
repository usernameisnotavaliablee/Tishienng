package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_OutputSurface extends androidx.camera.core.impl.OutputSurface {
    private final int imageFormat;
    private final android.util.Size size;
    private final android.view.Surface surface;

    AutoValue_OutputSurface(android.view.Surface r1, android.util.Size r2, int r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L16
            r0.surface = r1
            if (r2 == 0) goto Le
            r0.size = r2
            r0.imageFormat = r3
            return
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null size"
            r1.<init>(r2)
            throw r1
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null surface"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.impl.OutputSurface
            r2 = 0
            if (r1 == 0) goto L2c
            androidx.camera.core.impl.OutputSurface r5 = (androidx.camera.core.impl.OutputSurface) r5
            android.view.Surface r1 = r4.surface
            android.view.Surface r3 = r5.getSurface()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            android.util.Size r1 = r4.size
            android.util.Size r3 = r5.getSize()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            int r1 = r4.imageFormat
            int r5 = r5.getImageFormat()
            if (r1 != r5) goto L2c
            return r0
        L2c:
            return r2
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public int getImageFormat() {
            r1 = this;
            int r0 = r1.imageFormat
            return r0
    }

    @Override // androidx.camera.core.impl.OutputSurface
    @androidx.annotation.NonNull
    public android.util.Size getSize() {
            r1 = this;
            android.util.Size r0 = r1.size
            return r0
    }

    @Override // androidx.camera.core.impl.OutputSurface
    @androidx.annotation.NonNull
    public android.view.Surface getSurface() {
            r1 = this;
            android.view.Surface r0 = r1.surface
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.view.Surface r0 = r3.surface
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            android.util.Size r2 = r3.size
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.imageFormat
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OutputSurface{surface="
            r0.append(r1)
            android.view.Surface r1 = r2.surface
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            android.util.Size r1 = r2.size
            r0.append(r1)
            java.lang.String r1 = ", imageFormat="
            r0.append(r1)
            int r1 = r2.imageFormat
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
