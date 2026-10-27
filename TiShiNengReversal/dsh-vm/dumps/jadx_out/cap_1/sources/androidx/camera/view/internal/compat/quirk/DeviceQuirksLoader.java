package androidx.camera.view.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static java.util.List<androidx.camera.core.impl.Quirk> loadQuirks() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.load()
            if (r1 == 0) goto L13
            androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk r1 = new androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk
            r1.<init>()
            r0.add(r1)
        L13:
            boolean r1 = androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk.load()
            if (r1 == 0) goto L21
            androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk r1 = new androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk
            r1.<init>()
            r0.add(r1)
        L21:
            return r0
    }
}
