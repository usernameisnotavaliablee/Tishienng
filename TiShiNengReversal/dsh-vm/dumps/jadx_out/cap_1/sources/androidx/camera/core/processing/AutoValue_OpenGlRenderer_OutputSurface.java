package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_OpenGlRenderer_OutputSurface extends androidx.camera.core.processing.OpenGlRenderer.OutputSurface {
    private final android.opengl.EGLSurface eglSurface;
    private final int height;
    private final int width;

    AutoValue_OpenGlRenderer_OutputSurface(android.opengl.EGLSurface r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lc
            r0.eglSurface = r1
            r0.width = r2
            r0.height = r3
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null eglSurface"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.processing.OpenGlRenderer.OutputSurface
            r2 = 0
            if (r1 == 0) goto L28
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r5 = (androidx.camera.core.processing.OpenGlRenderer.OutputSurface) r5
            android.opengl.EGLSurface r1 = r4.eglSurface
            android.opengl.EGLSurface r3 = r5.getEglSurface()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L28
            int r1 = r4.width
            int r3 = r5.getWidth()
            if (r1 != r3) goto L28
            int r1 = r4.height
            int r5 = r5.getHeight()
            if (r1 != r5) goto L28
            return r0
        L28:
            return r2
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.OutputSurface
    @androidx.annotation.NonNull
    android.opengl.EGLSurface getEglSurface() {
            r1 = this;
            android.opengl.EGLSurface r0 = r1.eglSurface
            return r0
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.OutputSurface
    int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.OutputSurface
    int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.opengl.EGLSurface r0 = r3.eglSurface
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.width
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.height
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OutputSurface{eglSurface="
            r0.append(r1)
            android.opengl.EGLSurface r1 = r2.eglSurface
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.width
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.height
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
