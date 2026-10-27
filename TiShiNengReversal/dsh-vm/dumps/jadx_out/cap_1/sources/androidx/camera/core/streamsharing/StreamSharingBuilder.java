package androidx.camera.core.streamsharing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class StreamSharingBuilder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.streamsharing.StreamSharing, androidx.camera.core.streamsharing.StreamSharingConfig, androidx.camera.core.streamsharing.StreamSharingBuilder> {
    private static final java.lang.String UNSUPPORTED_MESSAGE = "Operation not supported by StreamSharingBuilder.";
    private final androidx.camera.core.impl.MutableOptionsBundle mMutableConfig;

    StreamSharingBuilder() {
            r1 = this;
            androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
            r1.<init>(r0)
            return
    }

    StreamSharingBuilder(@androidx.annotation.NonNull androidx.camera.core.impl.MutableOptionsBundle r4) {
            r3 = this;
            r3.<init>()
            r3.mMutableConfig = r4
            androidx.camera.core.impl.Config$Option<java.lang.Class<?>> r0 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS
            r1 = 0
            java.lang.Object r4 = r4.retrieveOption(r0, r1)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<androidx.camera.core.streamsharing.StreamSharing> r0 = androidx.camera.core.streamsharing.StreamSharing.class
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

    @Override // androidx.camera.core.ExtendableBuilder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharing build() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation not supported by StreamSharingBuilder."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.camera.core.ExtendableBuilder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.lang.Object build() {
            r1 = this;
            androidx.camera.core.streamsharing.StreamSharing r0 = r1.build()
            return r0
    }

    @Override // androidx.camera.core.ExtendableBuilder
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.MutableConfig getMutableConfig() {
            r1 = this;
            androidx.camera.core.impl.MutableOptionsBundle r0 = r1.mMutableConfig
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingConfig getUseCaseConfig() {
            r1 = this;
            androidx.camera.core.streamsharing.StreamSharingConfig r0 = r1.getUseCaseConfig2()
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    /* renamed from: getUseCaseConfig, reason: avoid collision after fix types in other method */
    public androidx.camera.core.streamsharing.StreamSharingConfig getUseCaseConfig2() {
            r2 = this;
            androidx.camera.core.streamsharing.StreamSharingConfig r0 = new androidx.camera.core.streamsharing.StreamSharingConfig
            androidx.camera.core.impl.MutableOptionsBundle r1 = r2.mMutableConfig
            androidx.camera.core.impl.OptionsBundle r1 = androidx.camera.core.impl.OptionsBundle.from(r1)
            r0.<init>(r1)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by StreamSharingBuilder."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setCameraSelector(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by StreamSharingBuilder."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setCaptureOptionUnpacker(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.streamsharing.StreamSharingBuilder setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r3) {
            r2 = this;
            androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE
            r0.insertOption(r1, r3)
            return r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setCaptureType(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by StreamSharingBuilder."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setDefaultCaptureConfig(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by StreamSharingBuilder."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setDefaultSessionConfig(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setHighResolutionDisabled(boolean r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by StreamSharingBuilder."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setHighResolutionDisabled(boolean r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setHighResolutionDisabled(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by StreamSharingBuilder."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setSessionOptionUnpacker(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setSurfaceOccupancyPriority(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by StreamSharingBuilder."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setSurfaceOccupancyPriority(int r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setSurfaceOccupancyPriority(r1)
            return r1
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setTargetClass(@androidx.annotation.NonNull java.lang.Class<androidx.camera.core.streamsharing.StreamSharing> r4) {
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
    public /* bridge */ /* synthetic */ java.lang.Object setTargetClass(@androidx.annotation.NonNull java.lang.Class r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setTargetClass(r1)
            return r1
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setTargetName(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.String> r1 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME
            r0.insertOption(r1, r3)
            return r2
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.lang.Object setTargetName(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setTargetName(r1)
            return r1
    }

    @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setUseCaseEventCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.EventCallback r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by StreamSharingBuilder."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.lang.Object setUseCaseEventCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.EventCallback r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setUseCaseEventCallback(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public androidx.camera.core.streamsharing.StreamSharingBuilder setZslDisabled(boolean r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by StreamSharingBuilder."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setZslDisabled(boolean r1) {
            r0 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r1 = r0.setZslDisabled(r1)
            return r1
    }
}
