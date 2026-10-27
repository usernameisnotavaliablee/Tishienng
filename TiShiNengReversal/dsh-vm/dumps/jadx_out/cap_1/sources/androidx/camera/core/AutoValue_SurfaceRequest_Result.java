package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_SurfaceRequest_Result extends androidx.camera.core.SurfaceRequest.Result {
    private final int resultCode;
    private final android.view.Surface surface;

    AutoValue_SurfaceRequest_Result(int r1, android.view.Surface r2) {
            r0 = this;
            r0.<init>()
            r0.resultCode = r1
            if (r2 == 0) goto La
            r0.surface = r2
            return
        La:
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
            boolean r1 = r5 instanceof androidx.camera.core.SurfaceRequest.Result
            r2 = 0
            if (r1 == 0) goto L20
            androidx.camera.core.SurfaceRequest$Result r5 = (androidx.camera.core.SurfaceRequest.Result) r5
            int r1 = r4.resultCode
            int r3 = r5.getResultCode()
            if (r1 != r3) goto L20
            android.view.Surface r1 = r4.surface
            android.view.Surface r5 = r5.getSurface()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public int getResultCode() {
            r1 = this;
            int r0 = r1.resultCode
            return r0
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    @androidx.annotation.NonNull
    public android.view.Surface getSurface() {
            r1 = this;
            android.view.Surface r0 = r1.surface
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.resultCode
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            android.view.Surface r1 = r2.surface
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Result{resultCode="
            r0.append(r1)
            int r1 = r2.resultCode
            r0.append(r1)
            java.lang.String r1 = ", surface="
            r0.append(r1)
            android.view.Surface r1 = r2.surface
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
