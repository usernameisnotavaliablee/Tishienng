package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class OutputSurface {
    public OutputSurface() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.OutputSurface create(@androidx.annotation.NonNull android.view.Surface r1, @androidx.annotation.NonNull android.util.Size r2, int r3) {
            androidx.camera.core.impl.AutoValue_OutputSurface r0 = new androidx.camera.core.impl.AutoValue_OutputSurface
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract int getImageFormat();

    @androidx.annotation.NonNull
    public abstract android.util.Size getSize();

    @androidx.annotation.NonNull
    public abstract android.view.Surface getSurface();
}
