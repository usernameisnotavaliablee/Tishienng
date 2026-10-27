package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LensFacingCameraFilter implements androidx.camera.core.CameraFilter {
    private final int mLensFacing;

    public LensFacingCameraFilter(int r1) {
            r0 = this;
            r0.<init>()
            r0.mLensFacing = r1
            return
    }

    @Override // androidx.camera.core.CameraFilter
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.CameraInfo> filter(@androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraInfo> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r5.next()
            androidx.camera.core.CameraInfo r1 = (androidx.camera.core.CameraInfo) r1
            boolean r2 = r1 instanceof androidx.camera.core.impl.CameraInfoInternal
            java.lang.String r3 = "The camera info doesn't contain internal implementation."
            androidx.core.util.Preconditions.checkArgument(r2, r3)
            int r2 = r1.getLensFacing()
            int r3 = r4.mLensFacing
            if (r2 != r3) goto L9
            r0.add(r1)
            goto L9
        L28:
            return r0
    }

    @Override // androidx.camera.core.CameraFilter
    public /* synthetic */ androidx.camera.core.impl.Identifier getIdentifier() {
            r1 = this;
            androidx.camera.core.impl.Identifier r0 = androidx.camera.core.e.a(r1)
            return r0
    }

    public int getLensFacing() {
            r1 = this;
            int r0 = r1.mLensFacing
            return r0
    }
}
