package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraUnavailableExceptionHelper {
    private CameraUnavailableExceptionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.CameraUnavailableException createFrom(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r2) {
            int r0 = r2.getReason()
            r1 = 1
            if (r0 == r1) goto L1a
            r1 = 2
            if (r0 == r1) goto L1a
            r1 = 3
            if (r0 == r1) goto L1a
            r1 = 4
            if (r0 == r1) goto L1a
            r1 = 5
            if (r0 == r1) goto L1a
            r1 = 10001(0x2711, float:1.4014E-41)
            if (r0 == r1) goto L19
            r1 = 0
            goto L1a
        L19:
            r1 = 6
        L1a:
            androidx.camera.core.CameraUnavailableException r0 = new androidx.camera.core.CameraUnavailableException
            r0.<init>(r1, r2)
            return r0
    }
}
