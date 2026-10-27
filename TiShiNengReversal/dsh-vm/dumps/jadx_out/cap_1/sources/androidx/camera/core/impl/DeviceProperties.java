package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class DeviceProperties {
    public DeviceProperties() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.DeviceProperties create() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = android.os.Build.MODEL
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.camera.core.impl.DeviceProperties r0 = create(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.DeviceProperties create(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, int r3) {
            androidx.camera.core.impl.AutoValue_DeviceProperties r0 = new androidx.camera.core.impl.AutoValue_DeviceProperties
            r0.<init>(r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public abstract java.lang.String manufacturer();

    @androidx.annotation.NonNull
    public abstract java.lang.String model();

    public abstract int sdkVersion();
}
