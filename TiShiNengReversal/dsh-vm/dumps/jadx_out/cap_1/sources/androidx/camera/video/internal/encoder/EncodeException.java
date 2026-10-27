package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class EncodeException extends java.lang.Exception {
    public static final int ERROR_CODEC = 1;
    public static final int ERROR_UNKNOWN = 0;
    private final int mErrorType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorType {
    }

    public EncodeException(int r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.Throwable r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.mErrorType = r1
            return
    }

    public int getErrorType() {
            r1 = this;
            int r0 = r1.mErrorType
            return r0
    }
}
