package androidx.camera.core.streamsharing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ResolutionUtils {
    private ResolutionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.List<android.util.Size> getMergedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Size> r2, @androidx.annotation.NonNull android.util.Size r3, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> r4) {
            java.util.Iterator r3 = r4.iterator()
        L4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1c
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.UseCaseConfig r4 = (androidx.camera.core.impl.UseCaseConfig) r4
            androidx.camera.core.impl.Config$Option<java.util.List<android.util.Size>> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS
            r1 = 0
            java.lang.Object r4 = r4.retrieveOption(r0, r1)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L4
            return r4
        L1c:
            return r2
    }
}
