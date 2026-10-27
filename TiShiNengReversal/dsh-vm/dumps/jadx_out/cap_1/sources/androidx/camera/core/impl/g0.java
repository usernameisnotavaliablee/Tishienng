package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class g0 {
    public static boolean a(androidx.camera.core.impl.ReadableConfig r0, @androidx.annotation.NonNull androidx.camera.core.impl.Config.Option r1) {
            androidx.camera.core.impl.Config r0 = r0.getConfig()
            boolean r0 = r0.containsOption(r1)
            return r0
    }

    public static void b(androidx.camera.core.impl.ReadableConfig r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionMatcher r2) {
            androidx.camera.core.impl.Config r0 = r0.getConfig()
            r0.findOptions(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.Config.OptionPriority c(androidx.camera.core.impl.ReadableConfig r0, @androidx.annotation.NonNull androidx.camera.core.impl.Config.Option r1) {
            androidx.camera.core.impl.Config r0 = r0.getConfig()
            androidx.camera.core.impl.Config$OptionPriority r0 = r0.getOptionPriority(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.Set d(androidx.camera.core.impl.ReadableConfig r0, @androidx.annotation.NonNull androidx.camera.core.impl.Config.Option r1) {
            androidx.camera.core.impl.Config r0 = r0.getConfig()
            java.util.Set r0 = r0.getPriorities(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.Set e(androidx.camera.core.impl.ReadableConfig r0) {
            androidx.camera.core.impl.Config r0 = r0.getConfig()
            java.util.Set r0 = r0.listOptions()
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.Object f(androidx.camera.core.impl.ReadableConfig r0, @androidx.annotation.NonNull androidx.camera.core.impl.Config.Option r1) {
            androidx.camera.core.impl.Config r0 = r0.getConfig()
            java.lang.Object r0 = r0.retrieveOption(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.Object g(androidx.camera.core.impl.ReadableConfig r0, @androidx.annotation.NonNull androidx.camera.core.impl.Config.Option r1, @androidx.annotation.Nullable java.lang.Object r2) {
            androidx.camera.core.impl.Config r0 = r0.getConfig()
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.Object h(androidx.camera.core.impl.ReadableConfig r0, @androidx.annotation.NonNull androidx.camera.core.impl.Config.Option r1, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionPriority r2) {
            androidx.camera.core.impl.Config r0 = r0.getConfig()
            java.lang.Object r0 = r0.retrieveOptionWithPriority(r1, r2)
            return r0
    }
}
