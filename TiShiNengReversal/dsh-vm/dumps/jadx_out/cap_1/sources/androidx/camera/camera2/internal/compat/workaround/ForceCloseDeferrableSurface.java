package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ForceCloseDeferrableSurface {
    private final boolean mHasConfigureSurfaceToSecondarySessionFailQuirk;
    private final boolean mHasPreviewOrientationIncorrectQuirk;
    private final boolean mHasTextureViewIsClosedQuirk;

    public ForceCloseDeferrableSurface(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r3) {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk.class
            boolean r3 = r3.contains(r0)
            r1.mHasTextureViewIsClosedQuirk = r3
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.class
            boolean r3 = r2.contains(r3)
            r1.mHasPreviewOrientationIncorrectQuirk = r3
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class
            boolean r2 = r2.contains(r3)
            r1.mHasConfigureSurfaceToSecondarySessionFailQuirk = r2
            return
    }

    public void onSessionEnd(@androidx.annotation.Nullable java.util.List<androidx.camera.core.impl.DeferrableSurface> r2) {
            r1 = this;
            boolean r0 = r1.shouldForceClose()
            if (r0 == 0) goto L23
            if (r2 == 0) goto L23
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            r0.close()
            goto Lc
        L1c:
            java.lang.String r2 = "ForceCloseDeferrableSurface"
            java.lang.String r0 = "deferrableSurface closed"
            androidx.camera.core.Logger.d(r2, r0)
        L23:
            return
    }

    public boolean shouldForceClose() {
            r1 = this;
            boolean r0 = r1.mHasTextureViewIsClosedQuirk
            if (r0 != 0) goto Lf
            boolean r0 = r1.mHasPreviewOrientationIncorrectQuirk
            if (r0 != 0) goto Lf
            boolean r0 = r1.mHasConfigureSurfaceToSecondarySessionFailQuirk
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }
}
