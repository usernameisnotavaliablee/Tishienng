package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class Camera2CapturePipeline {
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AeState> AE_CONVERGED_STATE_SET = null;
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AeState> AE_TORCH_AS_FLASH_CONVERGED_STATE_SET = null;
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AfState> AF_CONVERGED_STATE_SET = null;
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AwbState> AWB_CONVERGED_STATE_SET = null;
    private static final java.lang.String TAG = "Camera2CapturePipeline";

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.Quirks mCameraQuirk;

    @androidx.annotation.NonNull
    private final java.util.concurrent.Executor mExecutor;
    private final boolean mHasFlashUnit;
    private final boolean mIsLegacyDevice;
    private int mTemplate;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash mUseTorchAsFlash;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AePreCaptureTask implements androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask {
        private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted;
        private final androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        AePreCaptureTask(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r2, int r3, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mIsExecuted = r0
                r1.mCameraControl = r2
                r1.mFlashMode = r3
                r1.mOverrideAeModeForStillCapture = r4
                return
        }

        public static /* synthetic */ java.lang.Boolean a(java.lang.Void r0) {
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
        }

        public static /* synthetic */ java.lang.Object b(androidx.camera.camera2.internal.Camera2CapturePipeline.AePreCaptureTask r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
                androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r1.mCameraControl
                androidx.camera.camera2.internal.FocusMeteringControl r0 = r0.getFocusMeteringControl()
                r0.triggerAePrecapture(r2)
                androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture r1 = r1.mOverrideAeModeForStillCapture
                r1.onAePrecaptureStarted()
                java.lang.String r1 = "AePreCapture"
                return r1
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
                r1 = this;
                int r0 = r1.mFlashMode
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
                r3 = this;
                boolean r0 = r3.mIsExecuted
                if (r0 == 0) goto L1b
                java.lang.String r0 = "Camera2CapturePipeline"
                java.lang.String r1 = "cancel TriggerAePreCapture"
                androidx.camera.core.Logger.d(r0, r1)
                androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r3.mCameraControl
                androidx.camera.camera2.internal.FocusMeteringControl r0 = r0.getFocusMeteringControl()
                r1 = 0
                r2 = 1
                r0.cancelAfAeTrigger(r1, r2)
                androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture r0 = r3.mOverrideAeModeForStillCapture
                r0.onAePrecaptureFinished()
            L1b:
                return
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @androidx.annotation.NonNull
        public com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> preCapture(@androidx.annotation.Nullable android.hardware.camera2.TotalCaptureResult r3) {
                r2 = this;
                int r0 = r2.mFlashMode
                boolean r3 = androidx.camera.camera2.internal.Camera2CapturePipeline.isFlashRequired(r0, r3)
                if (r3 == 0) goto L2d
                java.lang.String r3 = "Camera2CapturePipeline"
                java.lang.String r0 = "Trigger AE"
                androidx.camera.core.Logger.d(r3, r0)
                r3 = 1
                r2.mIsExecuted = r3
                androidx.camera.camera2.internal.p0 r3 = new androidx.camera.camera2.internal.p0
                r3.<init>(r2)
                com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r3)
                androidx.camera.core.impl.utils.futures.FutureChain r3 = androidx.camera.core.impl.utils.futures.FutureChain.from(r3)
                androidx.camera.camera2.internal.q0 r0 = new androidx.camera.camera2.internal.q0
                r0.<init>()
                java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
                androidx.camera.core.impl.utils.futures.FutureChain r3 = r3.transform(r0, r1)
                return r3
            L2d:
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AfTask implements androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask {
        private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted;

        AfTask(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mIsExecuted = r0
                r1.mCameraControl = r2
                return
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
                r3 = this;
                boolean r0 = r3.mIsExecuted
                if (r0 == 0) goto L16
                java.lang.String r0 = "Camera2CapturePipeline"
                java.lang.String r1 = "cancel TriggerAF"
                androidx.camera.core.Logger.d(r0, r1)
                androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r3.mCameraControl
                androidx.camera.camera2.internal.FocusMeteringControl r0 = r0.getFocusMeteringControl()
                r1 = 1
                r2 = 0
                r0.cancelAfAeTrigger(r1, r2)
            L16:
                return
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @androidx.annotation.NonNull
        public com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> preCapture(@androidx.annotation.Nullable android.hardware.camera2.TotalCaptureResult r5) {
                r4 = this;
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
                if (r5 != 0) goto L9
                goto L48
            L9:
                android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AF_MODE
                java.lang.Object r1 = r5.get(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 != 0) goto L14
                goto L48
            L14:
                int r1 = r1.intValue()
                r2 = 1
                if (r1 == r2) goto L1f
                r3 = 2
                if (r1 == r3) goto L1f
                goto L48
            L1f:
                java.lang.String r1 = "TriggerAf? AF mode auto"
                java.lang.String r3 = "Camera2CapturePipeline"
                androidx.camera.core.Logger.d(r3, r1)
                android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                java.lang.Object r5 = r5.get(r1)
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 == 0) goto L48
                int r5 = r5.intValue()
                if (r5 != 0) goto L48
                java.lang.String r5 = "Trigger AF"
                androidx.camera.core.Logger.d(r3, r5)
                r4.mIsExecuted = r2
                androidx.camera.camera2.internal.Camera2CameraControlImpl r5 = r4.mCameraControl
                androidx.camera.camera2.internal.FocusMeteringControl r5 = r5.getFocusMeteringControl()
                r1 = 0
                r2 = 0
                r5.triggerAf(r1, r2)
            L48:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS = 0;
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = 0;
        private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
        private final java.util.concurrent.Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask mPipelineSubTask;
        final java.util.List<androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask> mTasks;
        private final int mTemplate;
        private long mTimeout3A;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1, reason: invalid class name */
        class AnonymousClass1 implements androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask {
            final /* synthetic */ androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline this$0;

            AnonymousClass1(androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            public static /* synthetic */ java.lang.Boolean a(java.util.List r1) {
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r1 = r1.contains(r0)
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    return r1
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public boolean isCaptureResultNeeded() {
                    r2 = this;
                    androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline r0 = r2.this$0
                    java.util.List<androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask> r0 = r0.mTasks
                    java.util.Iterator r0 = r0.iterator()
                L8:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L1c
                    java.lang.Object r1 = r0.next()
                    androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask r1 = (androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask) r1
                    boolean r1 = r1.isCaptureResultNeeded()
                    if (r1 == 0) goto L8
                    r0 = 1
                    return r0
                L1c:
                    r0 = 0
                    return r0
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public void postCapture() {
                    r2 = this;
                    androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline r0 = r2.this$0
                    java.util.List<androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask> r0 = r0.mTasks
                    java.util.Iterator r0 = r0.iterator()
                L8:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L18
                    java.lang.Object r1 = r0.next()
                    androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask r1 = (androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask) r1
                    r1.postCapture()
                    goto L8
                L18:
                    return
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            @androidx.annotation.NonNull
            public com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> preCapture(@androidx.annotation.Nullable android.hardware.camera2.TotalCaptureResult r4) {
                    r3 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline r1 = r3.this$0
                    java.util.List<androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask> r1 = r1.mTasks
                    java.util.Iterator r1 = r1.iterator()
                Ld:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L21
                    java.lang.Object r2 = r1.next()
                    androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask r2 = (androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask) r2
                    com.google.common.util.concurrent.ListenableFuture r2 = r2.preCapture(r4)
                    r0.add(r2)
                    goto Ld
                L21:
                    com.google.common.util.concurrent.ListenableFuture r4 = androidx.camera.core.impl.utils.futures.Futures.allAsList(r0)
                    androidx.camera.camera2.internal.x0 r0 = new androidx.camera.camera2.internal.x0
                    r0.<init>()
                    java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
                    com.google.common.util.concurrent.ListenableFuture r4 = androidx.camera.core.impl.utils.futures.Futures.transform(r4, r0, r1)
                    return r4
            }
        }


        static {
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                r1 = 1
                long r1 = r0.toNanos(r1)
                androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.CHECK_3A_TIMEOUT_IN_NS = r1
                r1 = 5
                long r0 = r0.toNanos(r1)
                androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = r0
                return
        }

        Pipeline(int r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r5, boolean r6, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture r7) {
                r2 = this;
                r2.<init>()
                long r0 = androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.CHECK_3A_TIMEOUT_IN_NS
                r2.mTimeout3A = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mTasks = r0
                androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1 r0 = new androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1
                r0.<init>(r2)
                r2.mPipelineSubTask = r0
                r2.mTemplate = r3
                r2.mExecutor = r4
                r2.mCameraControl = r5
                r2.mIsLegacyDevice = r6
                r2.mOverrideAeModeForStillCapture = r7
                return
        }

        public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture a(androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline r2, int r3, android.hardware.camera2.TotalCaptureResult r4) {
                r2.getClass()
                boolean r3 = androidx.camera.camera2.internal.Camera2CapturePipeline.isFlashRequired(r3, r4)
                if (r3 == 0) goto Le
                long r0 = androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS
                r2.setTimeout3A(r0)
            Le:
                androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask r2 = r2.mPipelineSubTask
                com.google.common.util.concurrent.ListenableFuture r2 = r2.preCapture(r4)
                return r2
        }

        @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
        private void applyAeModeQuirk(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.Builder r4) {
                r3 = this;
                androidx.camera.camera2.impl.Camera2ImplConfig$Builder r0 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
                r0.<init>()
                android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
                r2 = 3
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.setCaptureRequestOption(r1, r2)
                androidx.camera.camera2.impl.Camera2ImplConfig r0 = r0.build()
                r4.addImplementationOptions(r0)
                return
        }

        private void applyStillCaptureTemplate(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.Builder r4, @androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r5) {
                r3 = this;
                int r0 = r3.mTemplate
                r1 = 3
                r2 = -1
                if (r0 != r1) goto Lc
                boolean r0 = r3.mIsLegacyDevice
                if (r0 != 0) goto Lc
                r5 = 4
                goto L1d
            Lc:
                int r0 = r5.getTemplateType()
                if (r0 == r2) goto L1c
                int r5 = r5.getTemplateType()
                r0 = 5
                if (r5 != r0) goto L1a
                goto L1c
            L1a:
                r5 = -1
                goto L1d
            L1c:
                r5 = 2
            L1d:
                if (r5 == r2) goto L22
                r4.setTemplateType(r5)
            L22:
                return
        }

        public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture b(androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline r2, java.lang.Boolean r3) {
                r2.getClass()
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L19
                long r0 = r2.mTimeout3A
                androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = r2.mCameraControl
                androidx.camera.camera2.internal.r0 r3 = new androidx.camera.camera2.internal.r0
                r3.<init>()
                com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.camera2.internal.Camera2CapturePipeline.waitForResult(r0, r2, r3)
                return r2
            L19:
                r2 = 0
                com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r2)
                return r2
        }

        public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture c(androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline r0, java.util.List r1, int r2, android.hardware.camera2.TotalCaptureResult r3) {
                com.google.common.util.concurrent.ListenableFuture r0 = r0.submitConfigsInternal(r1, r2)
                return r0
        }

        public static /* synthetic */ java.lang.Object d(androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline r1, androidx.camera.core.impl.CaptureConfig.Builder r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
                r1.getClass()
                androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$2 r0 = new androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$2
                r0.<init>(r1, r3)
                r2.addCameraCaptureCallback(r0)
                java.lang.String r1 = "submitStillCapture"
                return r1
        }

        public static /* synthetic */ boolean e(android.hardware.camera2.TotalCaptureResult r1) {
                r0 = 0
                boolean r1 = androidx.camera.camera2.internal.Camera2CapturePipeline.is3AConverged(r1, r0)
                return r1
        }

        private void setTimeout3A(long r1) {
                r0 = this;
                r0.mTimeout3A = r1
                return
        }

        void addTask(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask r2) {
                r1 = this;
                java.util.List<androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask> r0 = r1.mTasks
                r0.add(r2)
                return
        }

        @androidx.annotation.NonNull
        com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> executeCapture(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r5, int r6) {
                r4 = this;
                r0 = 0
                com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
                java.util.List<androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask> r2 = r4.mTasks
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L3c
                androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask r1 = r4.mPipelineSubTask
                boolean r1 = r1.isCaptureResultNeeded()
                if (r1 == 0) goto L1e
                r1 = 0
                androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r4.mCameraControl
                com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.camera2.internal.Camera2CapturePipeline.waitForResult(r1, r3, r0)
                goto L22
            L1e:
                com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            L22:
                androidx.camera.core.impl.utils.futures.FutureChain r0 = androidx.camera.core.impl.utils.futures.FutureChain.from(r0)
                androidx.camera.camera2.internal.t0 r1 = new androidx.camera.camera2.internal.t0
                r1.<init>(r4, r6)
                java.util.concurrent.Executor r2 = r4.mExecutor
                androidx.camera.core.impl.utils.futures.FutureChain r0 = r0.transformAsync(r1, r2)
                androidx.camera.camera2.internal.u0 r1 = new androidx.camera.camera2.internal.u0
                r1.<init>(r4)
                java.util.concurrent.Executor r2 = r4.mExecutor
                androidx.camera.core.impl.utils.futures.FutureChain r1 = r0.transformAsync(r1, r2)
            L3c:
                androidx.camera.core.impl.utils.futures.FutureChain r0 = androidx.camera.core.impl.utils.futures.FutureChain.from(r1)
                androidx.camera.camera2.internal.v0 r1 = new androidx.camera.camera2.internal.v0
                r1.<init>(r4, r5, r6)
                java.util.concurrent.Executor r5 = r4.mExecutor
                androidx.camera.core.impl.utils.futures.FutureChain r5 = r0.transformAsync(r1, r5)
                androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask r6 = r4.mPipelineSubTask
                java.util.Objects.requireNonNull(r6)
                androidx.camera.camera2.internal.w0 r0 = new androidx.camera.camera2.internal.w0
                r0.<init>(r6)
                java.util.concurrent.Executor r6 = r4.mExecutor
                r5.addListener(r0, r6)
                return r5
        }

        @androidx.annotation.NonNull
        com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitConfigsInternal(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r7, int r8) {
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r7 = r7.iterator()
            Le:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L87
                java.lang.Object r2 = r7.next()
                androidx.camera.core.impl.CaptureConfig r2 = (androidx.camera.core.impl.CaptureConfig) r2
                androidx.camera.core.impl.CaptureConfig$Builder r3 = androidx.camera.core.impl.CaptureConfig.Builder.from(r2)
                int r4 = r2.getTemplateType()
                r5 = 5
                if (r4 != r5) goto L5e
                androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r6.mCameraControl
                androidx.camera.camera2.internal.ZslControl r4 = r4.getZslControl()
                boolean r4 = r4.isZslDisabledByFlashMode()
                if (r4 != 0) goto L5e
                androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r6.mCameraControl
                androidx.camera.camera2.internal.ZslControl r4 = r4.getZslControl()
                boolean r4 = r4.isZslDisabledByUserCaseConfig()
                if (r4 != 0) goto L5e
                androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r6.mCameraControl
                androidx.camera.camera2.internal.ZslControl r4 = r4.getZslControl()
                androidx.camera.core.ImageProxy r4 = r4.dequeueImageFromBuffer()
                if (r4 == 0) goto L5e
                androidx.camera.camera2.internal.Camera2CameraControlImpl r5 = r6.mCameraControl
                androidx.camera.camera2.internal.ZslControl r5 = r5.getZslControl()
                boolean r5 = r5.enqueueImageToImageWriter(r4)
                if (r5 == 0) goto L5e
                androidx.camera.core.ImageInfo r4 = r4.getImageInfo()
                androidx.camera.core.impl.CameraCaptureResult r4 = androidx.camera.core.impl.CameraCaptureResults.retrieveCameraCaptureResult(r4)
                goto L5f
            L5e:
                r4 = 0
            L5f:
                if (r4 == 0) goto L65
                r3.setCameraCaptureResult(r4)
                goto L68
            L65:
                r6.applyStillCaptureTemplate(r3, r2)
            L68:
                androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture r2 = r6.mOverrideAeModeForStillCapture
                boolean r2 = r2.shouldSetAeModeAlwaysFlash(r8)
                if (r2 == 0) goto L73
                r6.applyAeModeQuirk(r3)
            L73:
                androidx.camera.camera2.internal.s0 r2 = new androidx.camera.camera2.internal.s0
                r2.<init>(r6, r3)
                com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r2)
                r0.add(r2)
                androidx.camera.core.impl.CaptureConfig r2 = r3.build()
                r1.add(r2)
                goto Le
            L87:
                androidx.camera.camera2.internal.Camera2CameraControlImpl r7 = r6.mCameraControl
                r7.submitCaptureRequestsInternal(r1)
                com.google.common.util.concurrent.ListenableFuture r7 = androidx.camera.core.impl.utils.futures.Futures.allAsList(r0)
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        @androidx.annotation.NonNull
        com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> preCapture(@androidx.annotation.Nullable android.hardware.camera2.TotalCaptureResult r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ResultListener implements androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener {
        static final long NO_TIMEOUT = 0;
        private final androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker mChecker;
        private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<android.hardware.camera2.TotalCaptureResult> mCompleter;
        private final com.google.common.util.concurrent.ListenableFuture<android.hardware.camera2.TotalCaptureResult> mFuture;
        private final long mTimeLimitNs;
        private volatile java.lang.Long mTimestampOfFirstUpdateNs;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        interface Checker {
            boolean check(@androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r1);
        }

        ResultListener(long r2, @androidx.annotation.Nullable androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker r4) {
                r1 = this;
                r1.<init>()
                androidx.camera.camera2.internal.y0 r0 = new androidx.camera.camera2.internal.y0
                r0.<init>(r1)
                com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
                r1.mFuture = r0
                r0 = 0
                r1.mTimestampOfFirstUpdateNs = r0
                r1.mTimeLimitNs = r2
                r1.mChecker = r4
                return
        }

        public static /* synthetic */ java.lang.Object a(androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
                r0.mCompleter = r1
                java.lang.String r0 = "waitFor3AResult"
                return r0
        }

        @androidx.annotation.NonNull
        public com.google.common.util.concurrent.ListenableFuture<android.hardware.camera2.TotalCaptureResult> getFuture() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<android.hardware.camera2.TotalCaptureResult> r0 = r1.mFuture
                return r0
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(@androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r9) {
                r8 = this;
                android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
                java.lang.Object r0 = r9.get(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                if (r0 == 0) goto L10
                java.lang.Long r1 = r8.mTimestampOfFirstUpdateNs
                if (r1 != 0) goto L10
                r8.mTimestampOfFirstUpdateNs = r0
            L10:
                java.lang.Long r1 = r8.mTimestampOfFirstUpdateNs
                r2 = 0
                long r4 = r8.mTimeLimitNs
                r6 = 1
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L53
                if (r1 == 0) goto L53
                if (r0 == 0) goto L53
                long r2 = r0.longValue()
                long r4 = r1.longValue()
                long r2 = r2 - r4
                long r4 = r8.mTimeLimitNs
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 <= 0) goto L53
                androidx.concurrent.futures.CallbackToFutureAdapter$Completer<android.hardware.camera2.TotalCaptureResult> r9 = r8.mCompleter
                r2 = 0
                r9.set(r2)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r2 = "Wait for capture result timeout, current:"
                r9.append(r2)
                r9.append(r0)
                java.lang.String r0 = " first: "
                r9.append(r0)
                r9.append(r1)
                java.lang.String r9 = r9.toString()
                java.lang.String r0 = "Camera2CapturePipeline"
                androidx.camera.core.Logger.d(r0, r9)
                return r6
            L53:
                androidx.camera.camera2.internal.Camera2CapturePipeline$ResultListener$Checker r0 = r8.mChecker
                if (r0 == 0) goto L5f
                boolean r0 = r0.check(r9)
                if (r0 != 0) goto L5f
                r9 = 0
                return r9
            L5f:
                androidx.concurrent.futures.CallbackToFutureAdapter$Completer<android.hardware.camera2.TotalCaptureResult> r0 = r8.mCompleter
                r0.set(r9)
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TorchTask implements androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask {
        private static final long CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS = 0;
        private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
        private final java.util.concurrent.Executor mExecutor;
        private final int mFlashMode;
        private boolean mIsExecuted;

        static {
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                r1 = 2
                long r0 = r0.toNanos(r1)
                androidx.camera.camera2.internal.Camera2CapturePipeline.TorchTask.CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS = r0
                return
        }

        TorchTask(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r2, int r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mIsExecuted = r0
                r1.mCameraControl = r2
                r1.mFlashMode = r3
                r1.mExecutor = r4
                return
        }

        public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture a(androidx.camera.camera2.internal.Camera2CapturePipeline.TorchTask r2, java.lang.Void r3) {
                long r0 = androidx.camera.camera2.internal.Camera2CapturePipeline.TorchTask.CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS
                androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = r2.mCameraControl
                androidx.camera.camera2.internal.c1 r3 = new androidx.camera.camera2.internal.c1
                r3.<init>()
                com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.camera2.internal.Camera2CapturePipeline.waitForResult(r0, r2, r3)
                return r2
        }

        public static /* synthetic */ java.lang.Object b(androidx.camera.camera2.internal.Camera2CapturePipeline.TorchTask r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
                androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r1.mCameraControl
                androidx.camera.camera2.internal.TorchControl r1 = r1.getTorchControl()
                r0 = 1
                r1.enableTorchInternal(r2, r0)
                java.lang.String r1 = "TorchOn"
                return r1
        }

        public static /* synthetic */ boolean c(android.hardware.camera2.TotalCaptureResult r1) {
                r0 = 1
                boolean r1 = androidx.camera.camera2.internal.Camera2CapturePipeline.is3AConverged(r1, r0)
                return r1
        }

        public static /* synthetic */ java.lang.Boolean d(android.hardware.camera2.TotalCaptureResult r0) {
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
                r1 = this;
                int r0 = r1.mFlashMode
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
                r3 = this;
                boolean r0 = r3.mIsExecuted
                if (r0 == 0) goto L16
                androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r3.mCameraControl
                androidx.camera.camera2.internal.TorchControl r0 = r0.getTorchControl()
                r1 = 0
                r2 = 0
                r0.enableTorchInternal(r1, r2)
                java.lang.String r0 = "Camera2CapturePipeline"
                java.lang.String r1 = "Turn off torch"
                androidx.camera.core.Logger.d(r0, r1)
            L16:
                return
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @androidx.annotation.NonNull
        public com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> preCapture(@androidx.annotation.Nullable android.hardware.camera2.TotalCaptureResult r3) {
                r2 = this;
                int r0 = r2.mFlashMode
                boolean r3 = androidx.camera.camera2.internal.Camera2CapturePipeline.isFlashRequired(r0, r3)
                if (r3 == 0) goto L46
                androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r2.mCameraControl
                boolean r3 = r3.isTorchOn()
                java.lang.String r0 = "Camera2CapturePipeline"
                if (r3 == 0) goto L18
                java.lang.String r3 = "Torch already on, not turn on"
                androidx.camera.core.Logger.d(r0, r3)
                goto L46
            L18:
                java.lang.String r3 = "Turn on torch"
                androidx.camera.core.Logger.d(r0, r3)
                r3 = 1
                r2.mIsExecuted = r3
                androidx.camera.camera2.internal.z0 r3 = new androidx.camera.camera2.internal.z0
                r3.<init>(r2)
                com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r3)
                androidx.camera.core.impl.utils.futures.FutureChain r3 = androidx.camera.core.impl.utils.futures.FutureChain.from(r3)
                androidx.camera.camera2.internal.a1 r0 = new androidx.camera.camera2.internal.a1
                r0.<init>(r2)
                java.util.concurrent.Executor r1 = r2.mExecutor
                androidx.camera.core.impl.utils.futures.FutureChain r3 = r3.transformAsync(r0, r1)
                androidx.camera.camera2.internal.b1 r0 = new androidx.camera.camera2.internal.b1
                r0.<init>()
                java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
                androidx.camera.core.impl.utils.futures.FutureChain r3 = r3.transform(r0, r1)
                return r3
            L46:
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r3)
                return r3
        }
    }

    static {
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r2 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r3 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1, r2, r3)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.camera2.internal.Camera2CapturePipeline.AF_CONVERGED_STATE_SET = r0
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.camera2.internal.Camera2CapturePipeline.AWB_CONVERGED_STATE_SET = r0
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r2 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1, r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.camera2.internal.Camera2CapturePipeline.AE_CONVERGED_STATE_SET = r0
            java.util.EnumSet r0 = java.util.EnumSet.copyOf(r0)
            r0.remove(r1)
            r0.remove(r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.camera2.internal.Camera2CapturePipeline.AE_TORCH_AS_FLASH_CONVERGED_STATE_SET = r0
            return
    }

    Camera2CapturePipeline(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r3, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r4, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r5, @androidx.annotation.NonNull java.util.concurrent.Executor r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mTemplate = r0
            r2.mCameraControl = r3
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L1a
            int r3 = r3.intValue()
            r1 = 2
            if (r3 != r1) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r2.mIsLegacyDevice = r0
            r2.mExecutor = r6
            r2.mCameraQuirk = r5
            androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash r3 = new androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash
            r3.<init>(r5)
            r2.mUseTorchAsFlash = r3
            androidx.camera.camera2.internal.n0 r3 = new androidx.camera.camera2.internal.n0
            r3.<init>(r4)
            boolean r3 = androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker.isFlashAvailable(r3)
            r2.mHasFlashUnit = r3
            return
    }

    static boolean is3AConverged(@androidx.annotation.Nullable android.hardware.camera2.TotalCaptureResult r6, boolean r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            androidx.camera.camera2.internal.Camera2CameraCaptureResult r1 = new androidx.camera.camera2.internal.Camera2CameraCaptureResult
            r1.<init>(r6)
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r2 = r1.getAfMode()
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r3 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.OFF
            r4 = 1
            if (r2 == r3) goto L29
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r2 = r1.getAfMode()
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r3 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN
            if (r2 == r3) goto L29
            java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData$AfState> r2 = androidx.camera.camera2.internal.Camera2CapturePipeline.AF_CONVERGED_STATE_SET
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r3 = r1.getAfState()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L27
            goto L29
        L27:
            r2 = 0
            goto L2a
        L29:
            r2 = 1
        L2a:
            android.hardware.camera2.CaptureResult$Key r3 = android.hardware.camera2.CaptureResult.CONTROL_AE_MODE
            java.lang.Object r3 = r6.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L3a
            r3 = 1
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r7 == 0) goto L50
            if (r3 != 0) goto L4e
            java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData$AeState> r7 = androidx.camera.camera2.internal.Camera2CapturePipeline.AE_TORCH_AS_FLASH_CONVERGED_STATE_SET
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r3 = r1.getAeState()
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L4c
            goto L4e
        L4c:
            r7 = 0
            goto L5f
        L4e:
            r7 = 1
            goto L5f
        L50:
            if (r3 != 0) goto L4e
            java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData$AeState> r7 = androidx.camera.camera2.internal.Camera2CapturePipeline.AE_CONVERGED_STATE_SET
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r3 = r1.getAeState()
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L4c
            goto L4e
        L5f:
            android.hardware.camera2.CaptureResult$Key r3 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE
            java.lang.Object r6 = r6.get(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L6e
            goto L7a
        L6e:
            java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData$AwbState> r6 = androidx.camera.camera2.internal.Camera2CapturePipeline.AWB_CONVERGED_STATE_SET
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r3 = r1.getAwbState()
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L7c
        L7a:
            r6 = 1
            goto L7d
        L7c:
            r6 = 0
        L7d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "checkCaptureResult, AE="
            r3.append(r5)
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r5 = r1.getAeState()
            r3.append(r5)
            java.lang.String r5 = " AF ="
            r3.append(r5)
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r5 = r1.getAfState()
            r3.append(r5)
            java.lang.String r5 = " AWB="
            r3.append(r5)
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r1 = r1.getAwbState()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "Camera2CapturePipeline"
            androidx.camera.core.Logger.d(r3, r1)
            if (r2 == 0) goto Lb6
            if (r7 == 0) goto Lb6
            if (r6 == 0) goto Lb6
            return r4
        Lb6:
            return r0
    }

    static boolean isFlashRequired(int r2, @androidx.annotation.Nullable android.hardware.camera2.TotalCaptureResult r3) {
            r0 = 0
            r1 = 1
            if (r2 == 0) goto L11
            if (r2 == r1) goto L10
            r3 = 2
            if (r2 != r3) goto La
            return r0
        La:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>(r2)
            throw r3
        L10:
            return r1
        L11:
            if (r3 == 0) goto L1c
            android.hardware.camera2.CaptureResult$Key r2 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L27
            int r2 = r2.intValue()
            r3 = 4
            if (r2 != r3) goto L27
            return r1
        L27:
            return r0
    }

    private boolean isTorchAsFlash(int r4) {
            r3 = this;
            androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash r0 = r3.mUseTorchAsFlash
            boolean r0 = r0.shouldUseTorchAsFlash()
            r1 = 1
            if (r0 != 0) goto L13
            int r0 = r3.mTemplate
            r2 = 3
            if (r0 == r2) goto L13
            if (r4 != r1) goto L11
            goto L13
        L11:
            r4 = 0
            return r4
        L13:
            return r1
    }

    @androidx.annotation.NonNull
    static com.google.common.util.concurrent.ListenableFuture<android.hardware.camera2.TotalCaptureResult> waitForResult(long r1, @androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r3, @androidx.annotation.Nullable androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker r4) {
            androidx.camera.camera2.internal.Camera2CapturePipeline$ResultListener r0 = new androidx.camera.camera2.internal.Camera2CapturePipeline$ResultListener
            r0.<init>(r1, r4)
            r3.addCaptureResultListener(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = r0.getFuture()
            return r1
    }

    public void setTemplate(int r1) {
            r0 = this;
            r0.mTemplate = r1
            return
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptures(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r7, int r8, int r9, int r10) {
            r6 = this;
            androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture r5 = new androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture
            androidx.camera.core.impl.Quirks r0 = r6.mCameraQuirk
            r5.<init>(r0)
            androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline r0 = new androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline
            int r1 = r6.mTemplate
            java.util.concurrent.Executor r2 = r6.mExecutor
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r6.mCameraControl
            boolean r4 = r6.mIsLegacyDevice
            r0.<init>(r1, r2, r3, r4, r5)
            if (r8 != 0) goto L20
            androidx.camera.camera2.internal.Camera2CapturePipeline$AfTask r8 = new androidx.camera.camera2.internal.Camera2CapturePipeline$AfTask
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r6.mCameraControl
            r8.<init>(r1)
            r0.addTask(r8)
        L20:
            boolean r8 = r6.mHasFlashUnit
            if (r8 == 0) goto L41
            boolean r8 = r6.isTorchAsFlash(r10)
            if (r8 == 0) goto L37
            androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask r8 = new androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask
            androidx.camera.camera2.internal.Camera2CameraControlImpl r10 = r6.mCameraControl
            java.util.concurrent.Executor r1 = r6.mExecutor
            r8.<init>(r10, r9, r1)
            r0.addTask(r8)
            goto L41
        L37:
            androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask r8 = new androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask
            androidx.camera.camera2.internal.Camera2CameraControlImpl r10 = r6.mCameraControl
            r8.<init>(r10, r9, r5)
            r0.addTask(r8)
        L41:
            com.google.common.util.concurrent.ListenableFuture r7 = r0.executeCapture(r7, r9)
            com.google.common.util.concurrent.ListenableFuture r7 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r7)
            return r7
    }
}
