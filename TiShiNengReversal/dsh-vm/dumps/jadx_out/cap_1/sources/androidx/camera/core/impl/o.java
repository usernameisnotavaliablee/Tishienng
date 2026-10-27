package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class o {
    public static boolean a(@androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionPriority r2, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionPriority r3) {
            androidx.camera.core.impl.Config$OptionPriority r0 = androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE
            r1 = 1
            if (r2 != r0) goto L8
            if (r3 != r0) goto L8
            return r1
        L8:
            androidx.camera.core.impl.Config$OptionPriority r0 = androidx.camera.core.impl.Config.OptionPriority.REQUIRED
            if (r2 != r0) goto Lf
            if (r3 != r0) goto Lf
            return r1
        Lf:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.Config b(@androidx.annotation.Nullable androidx.camera.core.impl.Config r3, @androidx.annotation.Nullable androidx.camera.core.impl.Config r4) {
            if (r3 != 0) goto L9
            if (r4 != 0) goto L9
            androidx.camera.core.impl.OptionsBundle r3 = androidx.camera.core.impl.OptionsBundle.emptyBundle()
            return r3
        L9:
            if (r4 == 0) goto L10
            androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.from(r4)
            goto L14
        L10:
            androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
        L14:
            if (r3 == 0) goto L2e
            java.util.Set r1 = r3.listOptions()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.Config$Option r2 = (androidx.camera.core.impl.Config.Option) r2
            c(r0, r4, r3, r2)
            goto L1e
        L2e:
            androidx.camera.core.impl.OptionsBundle r3 = androidx.camera.core.impl.OptionsBundle.from(r0)
            return r3
    }

    public static void c(@androidx.annotation.NonNull androidx.camera.core.impl.MutableOptionsBundle r2, @androidx.annotation.NonNull androidx.camera.core.impl.Config r3, @androidx.annotation.NonNull androidx.camera.core.impl.Config r4, @androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r5) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
            boolean r0 = java.util.Objects.equals(r5, r0)
            if (r0 == 0) goto L21
            r0 = 0
            java.lang.Object r1 = r4.retrieveOption(r5, r0)
            androidx.camera.core.resolutionselector.ResolutionSelector r1 = (androidx.camera.core.resolutionselector.ResolutionSelector) r1
            java.lang.Object r3 = r3.retrieveOption(r5, r0)
            androidx.camera.core.resolutionselector.ResolutionSelector r3 = (androidx.camera.core.resolutionselector.ResolutionSelector) r3
            androidx.camera.core.impl.Config$OptionPriority r4 = r4.getOptionPriority(r5)
            androidx.camera.core.resolutionselector.ResolutionSelector r3 = androidx.camera.core.impl.utils.ResolutionSelectorUtil.overrideResolutionSelectors(r3, r1)
            r2.insertOption(r5, r4, r3)
            return
        L21:
            androidx.camera.core.impl.Config$OptionPriority r3 = r4.getOptionPriority(r5)
            java.lang.Object r4 = r4.retrieveOption(r5)
            r2.insertOption(r5, r3, r4)
            return
    }
}
