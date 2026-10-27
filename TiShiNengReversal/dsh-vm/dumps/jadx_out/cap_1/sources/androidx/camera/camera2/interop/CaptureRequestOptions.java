package androidx.camera.camera2.interop;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.camera.camera2.interop.ExperimentalCamera2Interop
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CaptureRequestOptions implements androidx.camera.core.impl.ReadableConfig {
    private final androidx.camera.core.impl.Config mConfig;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Builder implements androidx.camera.core.ExtendableBuilder<androidx.camera.camera2.interop.CaptureRequestOptions> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableOptionsBundle;

        public Builder() {
                r1 = this;
                r1.<init>()
                androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
                r1.mMutableOptionsBundle = r0
                return
        }

        public static /* synthetic */ boolean a(androidx.camera.camera2.interop.CaptureRequestOptions.Builder r1, androidx.camera.core.impl.Config r2, androidx.camera.core.impl.Config.Option r3) {
                androidx.camera.core.impl.MutableConfig r1 = r1.getMutableConfig()
                androidx.camera.core.impl.Config$OptionPriority r0 = r2.getOptionPriority(r3)
                java.lang.Object r2 = r2.retrieveOption(r3)
                r1.insertOption(r3, r0, r2)
                r1 = 1
                return r1
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public static androidx.camera.camera2.interop.CaptureRequestOptions.Builder from(@androidx.annotation.NonNull androidx.camera.core.impl.Config r3) {
                androidx.camera.camera2.interop.CaptureRequestOptions$Builder r0 = new androidx.camera.camera2.interop.CaptureRequestOptions$Builder
                r0.<init>()
                androidx.camera.camera2.interop.i r1 = new androidx.camera.camera2.interop.i
                r1.<init>(r0, r3)
                java.lang.String r2 = "camera2.captureRequest.option."
                r3.findOptions(r2, r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public androidx.camera.camera2.interop.CaptureRequestOptions build() {
                r2 = this;
                androidx.camera.camera2.interop.CaptureRequestOptions r0 = new androidx.camera.camera2.interop.CaptureRequestOptions
                androidx.camera.core.impl.MutableOptionsBundle r1 = r2.mMutableOptionsBundle
                androidx.camera.core.impl.OptionsBundle r1 = androidx.camera.core.impl.OptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.camera2.interop.CaptureRequestOptions build() {
                r1 = this;
                androidx.camera.camera2.interop.CaptureRequestOptions r0 = r1.build()
                return r0
        }

        @androidx.annotation.NonNull
        public <ValueT> androidx.camera.camera2.interop.CaptureRequestOptions.Builder clearCaptureRequestOption(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest.Key<ValueT> r2) {
                r1 = this;
                androidx.camera.core.impl.Config$Option r2 = androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(r2)
                androidx.camera.core.impl.MutableOptionsBundle r0 = r1.mMutableOptionsBundle
                r0.removeOption(r2)
                return r1
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
                r1 = this;
                androidx.camera.core.impl.MutableOptionsBundle r0 = r1.mMutableOptionsBundle
                return r0
        }

        @androidx.annotation.NonNull
        public <ValueT> androidx.camera.camera2.interop.CaptureRequestOptions.Builder setCaptureRequestOption(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest.Key<ValueT> r2, @androidx.annotation.NonNull ValueT r3) {
                r1 = this;
                androidx.camera.core.impl.Config$Option r2 = androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(r2)
                androidx.camera.core.impl.MutableOptionsBundle r0 = r1.mMutableOptionsBundle
                r0.insertOption(r2, r3)
                return r1
        }
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public CaptureRequestOptions(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1) {
            r0 = this;
            r0.<init>()
            r0.mConfig = r1
            return
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ boolean containsOption(androidx.camera.core.impl.Config.Option r1) {
            r0 = this;
            boolean r1 = androidx.camera.core.impl.g0.a(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ void findOptions(java.lang.String r1, androidx.camera.core.impl.Config.OptionMatcher r2) {
            r0 = this;
            androidx.camera.core.impl.g0.b(r0, r1, r2)
            return
    }

    @androidx.annotation.Nullable
    public <ValueT> ValueT getCaptureRequestOption(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest.Key<ValueT> r3) {
            r2 = this;
            androidx.camera.core.impl.Config$Option r3 = androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(r3)
            androidx.camera.core.impl.Config r0 = r2.mConfig
            r1 = 0
            java.lang.Object r3 = r0.retrieveOption(r3, r1)
            return r3
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public <ValueT> ValueT getCaptureRequestOption(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest.Key<ValueT> r2, @androidx.annotation.Nullable ValueT r3) {
            r1 = this;
            androidx.camera.core.impl.Config$Option r2 = androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(r2)
            androidx.camera.core.impl.Config r0 = r1.mConfig
            java.lang.Object r2 = r0.retrieveOption(r2, r3)
            return r2
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.camera.core.impl.Config getConfig() {
            r1 = this;
            androidx.camera.core.impl.Config r0 = r1.mConfig
            return r0
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option r1) {
            r0 = this;
            androidx.camera.core.impl.Config$OptionPriority r1 = androidx.camera.core.impl.g0.c(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.util.Set getPriorities(androidx.camera.core.impl.Config.Option r1) {
            r0 = this;
            java.util.Set r1 = androidx.camera.core.impl.g0.d(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.util.Set listOptions() {
            r1 = this;
            java.util.Set r0 = androidx.camera.core.impl.g0.e(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.lang.Object retrieveOption(androidx.camera.core.impl.Config.Option r1) {
            r0 = this;
            java.lang.Object r1 = androidx.camera.core.impl.g0.f(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.lang.Object retrieveOption(androidx.camera.core.impl.Config.Option r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = androidx.camera.core.impl.g0.g(r0, r1, r2)
            return r1
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.lang.Object retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option r1, androidx.camera.core.impl.Config.OptionPriority r2) {
            r0 = this;
            java.lang.Object r1 = androidx.camera.core.impl.g0.h(r0, r1, r2)
            return r1
    }
}
