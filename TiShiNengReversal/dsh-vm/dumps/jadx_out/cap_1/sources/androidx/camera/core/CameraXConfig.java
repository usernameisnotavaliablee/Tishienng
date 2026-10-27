package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraXConfig implements androidx.camera.core.internal.TargetConfig<androidx.camera.core.CameraX> {
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.CameraSelector> OPTION_AVAILABLE_CAMERAS_LIMITER = null;
    static final androidx.camera.core.impl.Config.Option<java.util.concurrent.Executor> OPTION_CAMERA_EXECUTOR = null;
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CameraFactory.Provider> OPTION_CAMERA_FACTORY_PROVIDER = null;
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider> OPTION_DEVICE_SURFACE_MANAGER_PROVIDER = null;
    static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_MIN_LOGGING_LEVEL = null;
    static final androidx.camera.core.impl.Config.Option<android.os.Handler> OPTION_SCHEDULER_HANDLER = null;
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.UseCaseConfigFactory.Provider> OPTION_USECASE_CONFIG_FACTORY_PROVIDER = null;
    private final androidx.camera.core.impl.OptionsBundle mConfig;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder implements androidx.camera.core.internal.TargetConfig.Builder<androidx.camera.core.CameraX, androidx.camera.core.CameraXConfig.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableConfig;

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
                r1 = this;
                androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
                r1.<init>(r0)
                return
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle r4) {
                r3 = this;
                r3.<init>()
                r3.mMutableConfig = r4
                androidx.camera.core.impl.Config$Option<java.lang.Class<?>> r0 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS
                r1 = 0
                java.lang.Object r4 = r4.retrieveOption(r0, r1)
                java.lang.Class r4 = (java.lang.Class) r4
                java.lang.Class<androidx.camera.core.CameraX> r0 = androidx.camera.core.CameraX.class
                if (r4 == 0) goto L38
                boolean r1 = r4.equals(r0)
                if (r1 == 0) goto L19
                goto L38
            L19:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid target class configuration for "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = ": "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L38:
                r3.setTargetClass(r0)
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.CameraXConfig.Builder fromConfig(@androidx.annotation.NonNull androidx.camera.core.CameraXConfig r1) {
                androidx.camera.core.CameraXConfig$Builder r0 = new androidx.camera.core.CameraXConfig$Builder
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        private androidx.camera.core.impl.MutableConfig getMutableConfig() {
                r1 = this;
                androidx.camera.core.impl.MutableOptionsBundle r0 = r1.mMutableConfig
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraXConfig build() {
                r2 = this;
                androidx.camera.core.CameraXConfig r0 = new androidx.camera.core.CameraXConfig
                androidx.camera.core.impl.MutableOptionsBundle r1 = r2.mMutableConfig
                androidx.camera.core.impl.OptionsBundle r1 = androidx.camera.core.impl.OptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraXConfig.Builder setAvailableCamerasLimiter(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.CameraSelector> r1 = androidx.camera.core.CameraXConfig.OPTION_AVAILABLE_CAMERAS_LIMITER
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraXConfig.Builder setCameraExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.concurrent.Executor> r1 = androidx.camera.core.CameraXConfig.OPTION_CAMERA_EXECUTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.CameraXConfig.Builder setCameraFactoryProvider(@androidx.annotation.NonNull androidx.camera.core.impl.CameraFactory.Provider r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CameraFactory$Provider> r1 = androidx.camera.core.CameraXConfig.OPTION_CAMERA_FACTORY_PROVIDER
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.CameraXConfig.Builder setDeviceSurfaceManagerProvider(@androidx.annotation.NonNull androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CameraDeviceSurfaceManager$Provider> r1 = androidx.camera.core.CameraXConfig.OPTION_DEVICE_SURFACE_MANAGER_PROVIDER
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraXConfig.Builder setMinimumLoggingLevel(@androidx.annotation.IntRange(from = 3, to = 6) int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.CameraXConfig.OPTION_MIN_LOGGING_LEVEL
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraXConfig.Builder setSchedulerHandler(@androidx.annotation.NonNull android.os.Handler r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.os.Handler> r1 = androidx.camera.core.CameraXConfig.OPTION_SCHEDULER_HANDLER
                r0.insertOption(r1, r3)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.CameraXConfig.Builder setTargetClass(@androidx.annotation.NonNull java.lang.Class<androidx.camera.core.CameraX> r4) {
                r3 = this;
                androidx.camera.core.impl.MutableConfig r0 = r3.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Class<?>> r1 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS
                r0.insertOption(r1, r4)
                androidx.camera.core.impl.MutableConfig r0 = r3.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.String> r1 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME
                r2 = 0
                java.lang.Object r0 = r0.retrieveOption(r1, r2)
                if (r0 != 0) goto L35
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = r4.getCanonicalName()
                r0.append(r4)
                java.lang.String r4 = "-"
                r0.append(r4)
                java.util.UUID r4 = java.util.UUID.randomUUID()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.setTargetName(r4)
            L35:
                return r3
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.CameraXConfig.Builder setTargetClass(@androidx.annotation.NonNull java.lang.Class<androidx.camera.core.CameraX> r1) {
                r0 = this;
                androidx.camera.core.CameraXConfig$Builder r1 = r0.setTargetClass(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.CameraXConfig.Builder setTargetName(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.String> r1 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.CameraXConfig.Builder setTargetName(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                androidx.camera.core.CameraXConfig$Builder r1 = r0.setTargetName(r1)
                return r1
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.CameraXConfig.Builder setUseCaseConfigFactoryProvider(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.Provider r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$Provider> r1 = androidx.camera.core.CameraXConfig.OPTION_USECASE_CONFIG_FACTORY_PROVIDER
                r0.insertOption(r1, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Provider {
        @androidx.annotation.NonNull
        androidx.camera.core.CameraXConfig getCameraXConfig();
    }

    static {
            java.lang.String r0 = "camerax.core.appConfig.cameraFactoryProvider"
            java.lang.Class<androidx.camera.core.impl.CameraFactory$Provider> r1 = androidx.camera.core.impl.CameraFactory.Provider.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.CameraXConfig.OPTION_CAMERA_FACTORY_PROVIDER = r0
            java.lang.String r0 = "camerax.core.appConfig.deviceSurfaceManagerProvider"
            java.lang.Class<androidx.camera.core.impl.CameraDeviceSurfaceManager$Provider> r1 = androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.CameraXConfig.OPTION_DEVICE_SURFACE_MANAGER_PROVIDER = r0
            java.lang.String r0 = "camerax.core.appConfig.useCaseConfigFactoryProvider"
            java.lang.Class<androidx.camera.core.impl.UseCaseConfigFactory$Provider> r1 = androidx.camera.core.impl.UseCaseConfigFactory.Provider.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.CameraXConfig.OPTION_USECASE_CONFIG_FACTORY_PROVIDER = r0
            java.lang.String r0 = "camerax.core.appConfig.cameraExecutor"
            java.lang.Class<java.util.concurrent.Executor> r1 = java.util.concurrent.Executor.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.CameraXConfig.OPTION_CAMERA_EXECUTOR = r0
            java.lang.String r0 = "camerax.core.appConfig.schedulerHandler"
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.CameraXConfig.OPTION_SCHEDULER_HANDLER = r0
            java.lang.String r0 = "camerax.core.appConfig.minimumLoggingLevel"
            java.lang.Class r1 = java.lang.Integer.TYPE
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.CameraXConfig.OPTION_MIN_LOGGING_LEVEL = r0
            java.lang.String r0 = "camerax.core.appConfig.availableCamerasLimiter"
            java.lang.Class<androidx.camera.core.CameraSelector> r1 = androidx.camera.core.CameraSelector.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.CameraXConfig.OPTION_AVAILABLE_CAMERAS_LIMITER = r0
            return
    }

    CameraXConfig(androidx.camera.core.impl.OptionsBundle r1) {
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
    public androidx.camera.core.CameraSelector getAvailableCamerasLimiter(@androidx.annotation.Nullable androidx.camera.core.CameraSelector r3) {
            r2 = this;
            androidx.camera.core.impl.OptionsBundle r0 = r2.mConfig
            androidx.camera.core.impl.Config$Option<androidx.camera.core.CameraSelector> r1 = androidx.camera.core.CameraXConfig.OPTION_AVAILABLE_CAMERAS_LIMITER
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            androidx.camera.core.CameraSelector r3 = (androidx.camera.core.CameraSelector) r3
            return r3
    }

    @androidx.annotation.Nullable
    public java.util.concurrent.Executor getCameraExecutor(@androidx.annotation.Nullable java.util.concurrent.Executor r3) {
            r2 = this;
            androidx.camera.core.impl.OptionsBundle r0 = r2.mConfig
            androidx.camera.core.impl.Config$Option<java.util.concurrent.Executor> r1 = androidx.camera.core.CameraXConfig.OPTION_CAMERA_EXECUTOR
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            return r3
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.CameraFactory.Provider getCameraFactoryProvider(@androidx.annotation.Nullable androidx.camera.core.impl.CameraFactory.Provider r3) {
            r2 = this;
            androidx.camera.core.impl.OptionsBundle r0 = r2.mConfig
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CameraFactory$Provider> r1 = androidx.camera.core.CameraXConfig.OPTION_CAMERA_FACTORY_PROVIDER
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            androidx.camera.core.impl.CameraFactory$Provider r3 = (androidx.camera.core.impl.CameraFactory.Provider) r3
            return r3
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.Config getConfig() {
            r1 = this;
            androidx.camera.core.impl.OptionsBundle r0 = r1.mConfig
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider getDeviceSurfaceManagerProvider(@androidx.annotation.Nullable androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider r3) {
            r2 = this;
            androidx.camera.core.impl.OptionsBundle r0 = r2.mConfig
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CameraDeviceSurfaceManager$Provider> r1 = androidx.camera.core.CameraXConfig.OPTION_DEVICE_SURFACE_MANAGER_PROVIDER
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            androidx.camera.core.impl.CameraDeviceSurfaceManager$Provider r3 = (androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider) r3
            return r3
    }

    public int getMinimumLoggingLevel() {
            r3 = this;
            androidx.camera.core.impl.OptionsBundle r0 = r3.mConfig
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.CameraXConfig.OPTION_MIN_LOGGING_LEVEL
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
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

    @androidx.annotation.Nullable
    public android.os.Handler getSchedulerHandler(@androidx.annotation.Nullable android.os.Handler r3) {
            r2 = this;
            androidx.camera.core.impl.OptionsBundle r0 = r2.mConfig
            androidx.camera.core.impl.Config$Option<android.os.Handler> r1 = androidx.camera.core.CameraXConfig.OPTION_SCHEDULER_HANDLER
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            android.os.Handler r3 = (android.os.Handler) r3
            return r3
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ java.lang.Class<androidx.camera.core.CameraX> getTargetClass() {
            r1 = this;
            java.lang.Class r0 = androidx.camera.core.internal.d.a(r1)
            return r0
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ java.lang.Class<androidx.camera.core.CameraX> getTargetClass(java.lang.Class<androidx.camera.core.CameraX> r1) {
            r0 = this;
            java.lang.Class r1 = androidx.camera.core.internal.d.b(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ java.lang.String getTargetName() {
            r1 = this;
            java.lang.String r0 = androidx.camera.core.internal.d.c(r1)
            return r0
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ java.lang.String getTargetName(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = androidx.camera.core.internal.d.d(r0, r1)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.UseCaseConfigFactory.Provider getUseCaseConfigFactoryProvider(@androidx.annotation.Nullable androidx.camera.core.impl.UseCaseConfigFactory.Provider r3) {
            r2 = this;
            androidx.camera.core.impl.OptionsBundle r0 = r2.mConfig
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$Provider> r1 = androidx.camera.core.CameraXConfig.OPTION_USECASE_CONFIG_FACTORY_PROVIDER
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            androidx.camera.core.impl.UseCaseConfigFactory$Provider r3 = (androidx.camera.core.impl.UseCaseConfigFactory.Provider) r3
            return r3
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
