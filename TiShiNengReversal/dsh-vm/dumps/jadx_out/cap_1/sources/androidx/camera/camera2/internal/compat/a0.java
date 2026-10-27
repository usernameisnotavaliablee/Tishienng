package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class a0 {
    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl a(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.os.Handler r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            androidx.camera.camera2.internal.compat.CameraManagerCompatApi30Impl r3 = new androidx.camera.camera2.internal.compat.CameraManagerCompatApi30Impl
            r3.<init>(r2)
            return r3
        Lc:
            r1 = 29
            if (r0 < r1) goto L16
            androidx.camera.camera2.internal.compat.CameraManagerCompatApi29Impl r3 = new androidx.camera.camera2.internal.compat.CameraManagerCompatApi29Impl
            r3.<init>(r2)
            return r3
        L16:
            r1 = 28
            if (r0 < r1) goto L1f
            androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl r2 = androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl.create(r2)
            return r2
        L1f:
            androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl r2 = androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.create(r2, r3)
            return r2
    }
}
