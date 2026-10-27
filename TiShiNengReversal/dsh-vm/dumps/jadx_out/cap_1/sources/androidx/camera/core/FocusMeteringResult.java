package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FocusMeteringResult {
    private boolean mIsFocusSuccessful;

    private FocusMeteringResult(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.mIsFocusSuccessful = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static androidx.camera.core.FocusMeteringResult create(boolean r1) {
            androidx.camera.core.FocusMeteringResult r0 = new androidx.camera.core.FocusMeteringResult
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static androidx.camera.core.FocusMeteringResult emptyInstance() {
            androidx.camera.core.FocusMeteringResult r0 = new androidx.camera.core.FocusMeteringResult
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public boolean isFocusSuccessful() {
            r1 = this;
            boolean r0 = r1.mIsFocusSuccessful
            return r0
    }
}
