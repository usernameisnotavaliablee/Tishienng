package androidx.camera.core.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SurfaceSorter {
    private static final int PRIORITY_MEDIA_CODEC_SURFACE = 2;
    private static final int PRIORITY_OTHERS = 1;
    private static final int PRIORITY_PREVIEW_SURFACE = 0;
    private final boolean mHasQuirk;

    public SurfaceSorter() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk> r0 = androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.mHasQuirk = r0
            return
    }

    public static /* synthetic */ int a(androidx.camera.core.internal.compat.workaround.SurfaceSorter r0, androidx.camera.core.impl.SessionConfig.OutputConfig r1, androidx.camera.core.impl.SessionConfig.OutputConfig r2) {
            r0.getClass()
            androidx.camera.core.impl.DeferrableSurface r1 = r1.getSurface()
            int r1 = r0.getSurfacePriority(r1)
            androidx.camera.core.impl.DeferrableSurface r2 = r2.getSurface()
            int r0 = r0.getSurfacePriority(r2)
            int r1 = r1 - r0
            return r1
    }

    private int getSurfacePriority(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r3) {
            r2 = this;
            java.lang.Class r0 = r3.getContainerClass()
            java.lang.Class<android.media.MediaCodec> r1 = android.media.MediaCodec.class
            if (r0 != r1) goto La
            r3 = 2
            return r3
        La:
            java.lang.Class r3 = r3.getContainerClass()
            java.lang.Class<androidx.camera.core.Preview> r0 = androidx.camera.core.Preview.class
            if (r3 != r0) goto L14
            r3 = 0
            return r3
        L14:
            r3 = 1
            return r3
    }

    public void sort(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> r2) {
            r1 = this;
            boolean r0 = r1.mHasQuirk
            if (r0 != 0) goto L5
            return
        L5:
            androidx.camera.core.internal.compat.workaround.a r0 = new androidx.camera.core.internal.compat.workaround.a
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            return
    }
}
