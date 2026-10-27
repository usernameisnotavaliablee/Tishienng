package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class CameraThreadConfig {
    public CameraThreadConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.CameraThreadConfig create(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull android.os.Handler r2) {
            androidx.camera.core.impl.AutoValue_CameraThreadConfig r0 = new androidx.camera.core.impl.AutoValue_CameraThreadConfig
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public abstract java.util.concurrent.Executor getCameraExecutor();

    @androidx.annotation.NonNull
    public abstract android.os.Handler getSchedulerHandler();
}
