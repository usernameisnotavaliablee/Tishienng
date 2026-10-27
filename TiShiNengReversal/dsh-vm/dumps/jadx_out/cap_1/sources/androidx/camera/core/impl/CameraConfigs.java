package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CameraConfigs {
    private static final androidx.camera.core.impl.CameraConfig EMPTY_CONFIG = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class EmptyCameraConfig implements androidx.camera.core.impl.CameraConfig {
        private final androidx.camera.core.impl.Identifier mIdentifier;

        EmptyCameraConfig() {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.camera.core.impl.Identifier r0 = androidx.camera.core.impl.Identifier.create(r0)
                r1.mIdentifier = r0
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

        @Override // androidx.camera.core.impl.CameraConfig
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.Identifier getCompatibilityId() {
                r1 = this;
                androidx.camera.core.impl.Identifier r0 = r1.mIdentifier
                return r0
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.Config getConfig() {
                r1 = this;
                androidx.camera.core.impl.OptionsBundle r0 = androidx.camera.core.impl.OptionsBundle.emptyBundle()
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

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ androidx.camera.core.impl.SessionProcessor getSessionProcessor() {
                r1 = this;
                androidx.camera.core.impl.SessionProcessor r0 = androidx.camera.core.impl.b.a(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ androidx.camera.core.impl.SessionProcessor getSessionProcessor(androidx.camera.core.impl.SessionProcessor r1) {
                r0 = this;
                androidx.camera.core.impl.SessionProcessor r1 = androidx.camera.core.impl.b.b(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ int getUseCaseCombinationRequiredRule() {
                r1 = this;
                int r0 = androidx.camera.core.impl.b.c(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ androidx.camera.core.impl.UseCaseConfigFactory getUseCaseConfigFactory() {
                r1 = this;
                androidx.camera.core.impl.UseCaseConfigFactory r0 = androidx.camera.core.impl.b.d(r1)
                return r0
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

    static {
            androidx.camera.core.impl.CameraConfigs$EmptyCameraConfig r0 = new androidx.camera.core.impl.CameraConfigs$EmptyCameraConfig
            r0.<init>()
            androidx.camera.core.impl.CameraConfigs.EMPTY_CONFIG = r0
            return
    }

    private CameraConfigs() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.CameraConfig emptyConfig() {
            androidx.camera.core.impl.CameraConfig r0 = androidx.camera.core.impl.CameraConfigs.EMPTY_CONFIG
            return r0
    }
}
