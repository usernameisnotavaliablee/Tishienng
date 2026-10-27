package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(26)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Api26Impl {

    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.Api26Impl INSTANCE = null;

    static {
            androidx.activity.Api26Impl r0 = new androidx.activity.Api26Impl
            r0.<init>()
            androidx.activity.Api26Impl.INSTANCE = r0
            return
    }

    private Api26Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void setPipParamsSourceRectHint(@org.jetbrains.annotations.NotNull android.app.Activity r2, @org.jetbrains.annotations.NotNull android.graphics.Rect r3) {
            r1 = this;
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder
            r0.<init>()
            android.app.PictureInPictureParams$Builder r3 = r0.setSourceRectHint(r3)
            android.app.PictureInPictureParams r3 = r3.build()
            r2.setPictureInPictureParams(r3)
            return
    }
}
