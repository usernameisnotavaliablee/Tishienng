package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class i {
    @androidx.annotation.NonNull
    public static androidx.camera.core.CameraSelector a(androidx.camera.core.impl.CameraInfoInternal r2) {
            androidx.camera.core.CameraSelector$Builder r0 = new androidx.camera.core.CameraSelector$Builder
            r0.<init>()
            androidx.camera.core.impl.h r1 = new androidx.camera.core.impl.h
            r1.<init>(r2)
            androidx.camera.core.CameraSelector$Builder r0 = r0.addCameraFilter(r1)
            androidx.camera.core.impl.LensFacingCameraFilter r1 = new androidx.camera.core.impl.LensFacingCameraFilter
            int r2 = r2.getLensFacing()
            r1.<init>(r2)
            androidx.camera.core.CameraSelector$Builder r2 = r0.addCameraFilter(r1)
            androidx.camera.core.CameraSelector r2 = r2.build()
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.CameraInfoInternal b(androidx.camera.core.impl.CameraInfoInternal r0) {
            return r0
    }

    public static /* synthetic */ java.util.List c(androidx.camera.core.impl.CameraInfoInternal r2, java.util.List r3) {
            java.lang.String r2 = r2.getCameraId()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            androidx.camera.core.CameraInfo r0 = (androidx.camera.core.CameraInfo) r0
            boolean r1 = r0 instanceof androidx.camera.core.impl.CameraInfoInternal
            androidx.core.util.Preconditions.checkArgument(r1)
            r1 = r0
            androidx.camera.core.impl.CameraInfoInternal r1 = (androidx.camera.core.impl.CameraInfoInternal) r1
            java.lang.String r1 = r1.getCameraId()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8
            java.util.List r2 = java.util.Collections.singletonList(r0)
            return r2
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to find camera with id "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " from list of available cameras."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }
}
