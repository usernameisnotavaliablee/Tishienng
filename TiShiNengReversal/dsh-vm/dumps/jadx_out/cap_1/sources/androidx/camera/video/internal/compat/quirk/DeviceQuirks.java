package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DeviceQuirks {

    @androidx.annotation.NonNull
    private static final androidx.camera.core.impl.Quirks QUIRKS = null;

    static {
            androidx.camera.core.impl.Quirks r0 = new androidx.camera.core.impl.Quirks
            java.util.List r1 = androidx.camera.video.internal.compat.quirk.DeviceQuirksLoader.loadQuirks()
            r0.<init>(r1)
            androidx.camera.video.internal.compat.quirk.DeviceQuirks.QUIRKS = r0
            return
    }

    private DeviceQuirks() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static <T extends androidx.camera.core.impl.Quirk> T get(@androidx.annotation.NonNull java.lang.Class<T> r1) {
            androidx.camera.core.impl.Quirks r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.QUIRKS
            androidx.camera.core.impl.Quirk r1 = r0.get(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.Quirks getAll() {
            androidx.camera.core.impl.Quirks r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.QUIRKS
            return r0
    }

    @androidx.annotation.NonNull
    public static <T extends androidx.camera.core.impl.Quirk> java.util.List<T> getAll(@androidx.annotation.NonNull java.lang.Class<T> r1) {
            androidx.camera.core.impl.Quirks r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.QUIRKS
            java.util.List r1 = r0.getAll(r1)
            return r1
    }
}
