package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CameraUnavailableException extends java.lang.Exception {
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_MAX_IN_USE = 5;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 6;
    public static final int CAMERA_UNKNOWN_ERROR = 0;
    private final int mReason;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface Reason {
    }

    public CameraUnavailableException(int r1) {
            r0 = this;
            r0.<init>()
            r0.mReason = r1
            return
    }

    public CameraUnavailableException(int r1, @androidx.annotation.Nullable java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.mReason = r1
            return
    }

    public CameraUnavailableException(int r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.Throwable r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.mReason = r1
            return
    }

    public CameraUnavailableException(int r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r2)
            r0.mReason = r1
            return
    }

    public int getReason() {
            r1 = this;
            int r0 = r1.mReason
            return r0
    }
}
