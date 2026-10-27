package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MeteringRepeatingSession {
    private static final java.lang.String TAG = "MeteringRepeating";

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.MeteringRepeatingSession.MeteringRepeatingConfig mConfigWithDefaults;
    private androidx.camera.core.impl.DeferrableSurface mDeferrableSurface;

    @androidx.annotation.NonNull
    private final android.util.Size mMeteringRepeatingSize;

    @androidx.annotation.NonNull
    private androidx.camera.core.impl.SessionConfig mSessionConfig;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize mSupportedRepeatingSurfaceSize;

    @androidx.annotation.Nullable
    private final androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback mSurfaceResetCallback;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MeteringRepeatingConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.core.UseCase> {

        @androidx.annotation.NonNull
        private final androidx.camera.core.impl.Config mConfig;

        MeteringRepeatingConfig() {
                r3 = this;
                r3.<init>()
                androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER
                androidx.camera.camera2.internal.Camera2SessionOptionUnpacker r2 = new androidx.camera.camera2.internal.Camera2SessionOptionUnpacker
                r2.<init>()
                r0.insertOption(r1, r2)
                r3.mConfig = r0
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

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.CameraSelector getCameraSelector() {
                r1 = this;
                androidx.camera.core.CameraSelector r0 = androidx.camera.core.impl.n0.a(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.CameraSelector getCameraSelector(androidx.camera.core.CameraSelector r1) {
                r0 = this;
                androidx.camera.core.CameraSelector r1 = androidx.camera.core.impl.n0.b(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$OptionUnpacker r0 = androidx.camera.core.impl.n0.c(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.core.impl.CaptureConfig$OptionUnpacker r1 = androidx.camera.core.impl.n0.d(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.UseCaseConfigFactory.CaptureType getCaptureType() {
                r1 = this;
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING
                return r0
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.Config getConfig() {
                r1 = this;
                androidx.camera.core.impl.Config r0 = r1.mConfig
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig() {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig r0 = androidx.camera.core.impl.n0.f(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig r1) {
                r0 = this;
                androidx.camera.core.impl.CaptureConfig r1 = androidx.camera.core.impl.n0.g(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.impl.SessionConfig getDefaultSessionConfig() {
                r1 = this;
                androidx.camera.core.impl.SessionConfig r0 = androidx.camera.core.impl.n0.h(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.impl.SessionConfig getDefaultSessionConfig(androidx.camera.core.impl.SessionConfig r1) {
                r0 = this;
                androidx.camera.core.impl.SessionConfig r1 = androidx.camera.core.impl.n0.i(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ androidx.camera.core.DynamicRange getDynamicRange() {
                r1 = this;
                androidx.camera.core.DynamicRange r0 = androidx.camera.core.impl.y.a(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ int getInputFormat() {
                r1 = this;
                int r0 = androidx.camera.core.impl.y.b(r1)
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

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
                r1 = this;
                androidx.camera.core.impl.SessionConfig$OptionUnpacker r0 = androidx.camera.core.impl.n0.j(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.core.impl.SessionConfig$OptionUnpacker r1 = androidx.camera.core.impl.n0.k(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ int getSurfaceOccupancyPriority() {
                r1 = this;
                int r0 = androidx.camera.core.impl.n0.l(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ int getSurfaceOccupancyPriority(int r1) {
                r0 = this;
                int r1 = androidx.camera.core.impl.n0.m(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ java.lang.Class getTargetClass() {
                r1 = this;
                java.lang.Class r0 = androidx.camera.core.internal.d.a(r1)
                return r0
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ java.lang.Class getTargetClass(java.lang.Class r1) {
                r0 = this;
                java.lang.Class r1 = androidx.camera.core.internal.d.b(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ android.util.Range getTargetFrameRate() {
                r1 = this;
                android.util.Range r0 = androidx.camera.core.impl.n0.n(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ android.util.Range getTargetFrameRate(android.util.Range r1) {
                r0 = this;
                android.util.Range r1 = androidx.camera.core.impl.n0.o(r0, r1)
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

        @Override // androidx.camera.core.internal.UseCaseEventConfig
        public /* synthetic */ androidx.camera.core.UseCase.EventCallback getUseCaseEventCallback() {
                r1 = this;
                androidx.camera.core.UseCase$EventCallback r0 = androidx.camera.core.internal.f.a(r1)
                return r0
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig
        public /* synthetic */ androidx.camera.core.UseCase.EventCallback getUseCaseEventCallback(androidx.camera.core.UseCase.EventCallback r1) {
                r0 = this;
                androidx.camera.core.UseCase$EventCallback r1 = androidx.camera.core.internal.f.b(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ boolean hasDynamicRange() {
                r1 = this;
                boolean r0 = androidx.camera.core.impl.y.c(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ boolean isHigResolutionDisabled(boolean r1) {
                r0 = this;
                boolean r1 = androidx.camera.core.impl.n0.p(r0, r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ boolean isZslDisabled(boolean r1) {
                r0 = this;
                boolean r1 = androidx.camera.core.impl.n0.q(r0, r1)
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface SurfaceResetCallback {
        void onSurfaceReset();
    }

    MeteringRepeatingSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.DisplayInfoManager r3, @androidx.annotation.Nullable androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback r4) {
            r1 = this;
            r1.<init>()
            androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize r0 = new androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize
            r0.<init>()
            r1.mSupportedRepeatingSurfaceSize = r0
            androidx.camera.camera2.internal.MeteringRepeatingSession$MeteringRepeatingConfig r0 = new androidx.camera.camera2.internal.MeteringRepeatingSession$MeteringRepeatingConfig
            r0.<init>()
            r1.mConfigWithDefaults = r0
            r1.mSurfaceResetCallback = r4
            android.util.Size r2 = r1.getProperPreviewSize(r2, r3)
            r1.mMeteringRepeatingSize = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "MeteringSession SurfaceTexture size: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MeteringRepeating"
            androidx.camera.core.Logger.d(r3, r2)
            androidx.camera.core.impl.SessionConfig r2 = r1.createSessionConfig()
            r1.mSessionConfig = r2
            return
    }

    public static /* synthetic */ void a(androidx.camera.camera2.internal.MeteringRepeatingSession r0, androidx.camera.core.impl.SessionConfig r1, androidx.camera.core.impl.SessionConfig.SessionError r2) {
            androidx.camera.core.impl.SessionConfig r1 = r0.createSessionConfig()
            r0.mSessionConfig = r1
            androidx.camera.camera2.internal.MeteringRepeatingSession$SurfaceResetCallback r0 = r0.mSurfaceResetCallback
            if (r0 == 0) goto Ld
            r0.onSurfaceReset()
        Ld:
            return
    }

    public static /* synthetic */ int b(android.util.Size r4, android.util.Size r5) {
            int r0 = r4.getWidth()
            long r0 = (long) r0
            int r4 = r4.getHeight()
            long r2 = (long) r4
            long r0 = r0 * r2
            int r4 = r5.getWidth()
            long r2 = (long) r4
            int r4 = r5.getHeight()
            long r4 = (long) r4
            long r2 = r2 * r4
            long r0 = r0 - r2
            int r4 = java.lang.Long.signum(r0)
            return r4
    }

    @androidx.annotation.NonNull
    private android.util.Size getProperPreviewSize(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r12, @androidx.annotation.NonNull androidx.camera.camera2.internal.DisplayInfoManager r13) {
            r11 = this;
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r12 = r12.getStreamConfigurationMapCompat()
            r0 = 34
            android.util.Size[] r12 = r12.getOutputSizes(r0)
            r0 = 0
            if (r12 != 0) goto L1a
            java.lang.String r12 = "MeteringRepeating"
            java.lang.String r13 = "Can not get output size list."
            androidx.camera.core.Logger.e(r12, r13)
            android.util.Size r12 = new android.util.Size
            r12.<init>(r0, r0)
            return r12
        L1a:
            androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize r1 = r11.mSupportedRepeatingSurfaceSize
            android.util.Size[] r12 = r1.getSupportedSizes(r12)
            java.util.List r1 = java.util.Arrays.asList(r12)
            androidx.camera.camera2.internal.v1 r2 = new androidx.camera.camera2.internal.v1
            r2.<init>()
            java.util.Collections.sort(r1, r2)
            android.util.Size r13 = r13.getPreviewSize()
            int r2 = r13.getWidth()
            long r2 = (long) r2
            int r13 = r13.getHeight()
            long r4 = (long) r13
            long r2 = r2 * r4
            r4 = 307200(0x4b000, double:1.51777E-318)
            long r2 = java.lang.Math.min(r2, r4)
            int r13 = r12.length
            r4 = 0
            r5 = 0
        L46:
            if (r5 >= r13) goto L64
            r6 = r12[r5]
            int r7 = r6.getWidth()
            long r7 = (long) r7
            int r9 = r6.getHeight()
            long r9 = (long) r9
            long r7 = r7 * r9
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 != 0) goto L5b
            return r6
        L5b:
            if (r9 <= 0) goto L60
            if (r4 == 0) goto L64
            return r4
        L60:
            int r5 = r5 + 1
            r4 = r6
            goto L46
        L64:
            java.lang.Object r12 = r1.get(r0)
            android.util.Size r12 = (android.util.Size) r12
            return r12
    }

    void clear() {
            r2 = this;
            java.lang.String r0 = "MeteringRepeating"
            java.lang.String r1 = "MeteringRepeating clear!"
            androidx.camera.core.Logger.d(r0, r1)
            androidx.camera.core.impl.DeferrableSurface r0 = r2.mDeferrableSurface
            if (r0 == 0) goto Le
            r0.close()
        Le:
            r0 = 0
            r2.mDeferrableSurface = r0
            return
    }

    @androidx.annotation.NonNull
    androidx.camera.core.impl.SessionConfig createSessionConfig() {
            r5 = this;
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r1 = 0
            r0.<init>(r1)
            android.util.Size r1 = r5.mMeteringRepeatingSize
            int r1 = r1.getWidth()
            android.util.Size r2 = r5.mMeteringRepeatingSize
            int r2 = r2.getHeight()
            r0.setDefaultBufferSize(r1, r2)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r0)
            androidx.camera.camera2.internal.MeteringRepeatingSession$MeteringRepeatingConfig r2 = r5.mConfigWithDefaults
            android.util.Size r3 = r5.mMeteringRepeatingSize
            androidx.camera.core.impl.SessionConfig$Builder r2 = androidx.camera.core.impl.SessionConfig.Builder.createFrom(r2, r3)
            r3 = 1
            r2.setTemplateType(r3)
            androidx.camera.core.impl.ImmediateSurface r3 = new androidx.camera.core.impl.ImmediateSurface
            r3.<init>(r1)
            r5.mDeferrableSurface = r3
            com.google.common.util.concurrent.ListenableFuture r3 = r3.getTerminationFuture()
            androidx.camera.camera2.internal.MeteringRepeatingSession$1 r4 = new androidx.camera.camera2.internal.MeteringRepeatingSession$1
            r4.<init>(r5, r1, r0)
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r3, r4, r0)
            androidx.camera.core.impl.DeferrableSurface r0 = r5.mDeferrableSurface
            r2.addSurface(r0)
            androidx.camera.camera2.internal.u1 r0 = new androidx.camera.camera2.internal.u1
            r0.<init>(r5)
            r2.addErrorListener(r0)
            androidx.camera.core.impl.SessionConfig r0 = r2.build()
            return r0
    }

    @androidx.annotation.NonNull
    java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "MeteringRepeating"
            return r0
    }

    @androidx.annotation.NonNull
    androidx.camera.core.impl.SessionConfig getSessionConfig() {
            r1 = this;
            androidx.camera.core.impl.SessionConfig r0 = r1.mSessionConfig
            return r0
    }

    @androidx.annotation.NonNull
    androidx.camera.core.impl.UseCaseConfig<?> getUseCaseConfig() {
            r1 = this;
            androidx.camera.camera2.internal.MeteringRepeatingSession$MeteringRepeatingConfig r0 = r1.mConfigWithDefaults
            return r0
    }
}
