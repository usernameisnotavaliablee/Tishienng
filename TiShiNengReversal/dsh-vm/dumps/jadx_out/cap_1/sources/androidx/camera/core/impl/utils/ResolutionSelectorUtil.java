package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ResolutionSelectorUtil {
    private ResolutionSelectorUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static androidx.camera.core.resolutionselector.ResolutionSelector overrideResolutionSelectors(@androidx.annotation.Nullable androidx.camera.core.resolutionselector.ResolutionSelector r1, @androidx.annotation.Nullable androidx.camera.core.resolutionselector.ResolutionSelector r2) {
            if (r2 != 0) goto L3
            return r1
        L3:
            if (r1 != 0) goto L6
            return r2
        L6:
            androidx.camera.core.resolutionselector.ResolutionSelector$Builder r1 = androidx.camera.core.resolutionselector.ResolutionSelector.Builder.fromResolutionSelector(r1)
            androidx.camera.core.resolutionselector.AspectRatioStrategy r0 = r2.getAspectRatioStrategy()
            if (r0 == 0) goto L17
            androidx.camera.core.resolutionselector.AspectRatioStrategy r0 = r2.getAspectRatioStrategy()
            r1.setAspectRatioStrategy(r0)
        L17:
            androidx.camera.core.resolutionselector.ResolutionStrategy r0 = r2.getResolutionStrategy()
            if (r0 == 0) goto L24
            androidx.camera.core.resolutionselector.ResolutionStrategy r0 = r2.getResolutionStrategy()
            r1.setResolutionStrategy(r0)
        L24:
            androidx.camera.core.resolutionselector.ResolutionFilter r0 = r2.getResolutionFilter()
            if (r0 == 0) goto L31
            androidx.camera.core.resolutionselector.ResolutionFilter r0 = r2.getResolutionFilter()
            r1.setResolutionFilter(r0)
        L31:
            int r0 = r2.getAllowedResolutionMode()
            if (r0 == 0) goto L3e
            int r2 = r2.getAllowedResolutionMode()
            r1.setAllowedResolutionMode(r2)
        L3e:
            androidx.camera.core.resolutionselector.ResolutionSelector r1 = r1.build()
            return r1
    }
}
