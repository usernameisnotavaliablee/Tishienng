package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class VideoEncoderSession {
    private static final java.lang.String TAG = "VideoEncoderSession";
    private android.view.Surface mActiveSurface;
    private final java.util.concurrent.Executor mExecutor;
    private java.util.concurrent.Executor mOnSurfaceUpdateExecutor;
    private androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener mOnSurfaceUpdateListener;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.video.internal.encoder.Encoder> mReadyToReleaseCompleter;
    private com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.Encoder> mReadyToReleaseFuture;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mReleasedCompleter;
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mReleasedFuture;
    private final java.util.concurrent.Executor mSequentialExecutor;
    private androidx.camera.core.SurfaceRequest mSurfaceRequest;
    private androidx.camera.video.internal.encoder.Encoder mVideoEncoder;
    private final androidx.camera.video.internal.encoder.EncoderFactory mVideoEncoderFactory;
    private androidx.camera.video.VideoEncoderSession.VideoEncoderState mVideoEncoderState;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.VideoEncoderSession$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState = null;

        static {
                androidx.camera.video.VideoEncoderSession$VideoEncoderState[] r0 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState = r0
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.NOT_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.INITIALIZING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.READY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.PENDING_RELEASE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.RELEASED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum VideoEncoderState extends java.lang.Enum<androidx.camera.video.VideoEncoderSession.VideoEncoderState> {
        private static final /* synthetic */ androidx.camera.video.VideoEncoderSession.VideoEncoderState[] $VALUES = null;
        public static final androidx.camera.video.VideoEncoderSession.VideoEncoderState INITIALIZING = null;
        public static final androidx.camera.video.VideoEncoderSession.VideoEncoderState NOT_INITIALIZED = null;
        public static final androidx.camera.video.VideoEncoderSession.VideoEncoderState PENDING_RELEASE = null;
        public static final androidx.camera.video.VideoEncoderSession.VideoEncoderState READY = null;
        public static final androidx.camera.video.VideoEncoderSession.VideoEncoderState RELEASED = null;

        private static /* synthetic */ androidx.camera.video.VideoEncoderSession.VideoEncoderState[] $values() {
                r0 = 5
                androidx.camera.video.VideoEncoderSession$VideoEncoderState[] r0 = new androidx.camera.video.VideoEncoderSession.VideoEncoderState[r0]
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.NOT_INITIALIZED
                r2 = 0
                r0[r2] = r1
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.INITIALIZING
                r2 = 1
                r0[r2] = r1
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.PENDING_RELEASE
                r2 = 2
                r0[r2] = r1
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.READY
                r2 = 3
                r0[r2] = r1
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.RELEASED
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = new androidx.camera.video.VideoEncoderSession$VideoEncoderState
                java.lang.String r1 = "NOT_INITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.video.VideoEncoderSession.VideoEncoderState.NOT_INITIALIZED = r0
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = new androidx.camera.video.VideoEncoderSession$VideoEncoderState
                java.lang.String r1 = "INITIALIZING"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.video.VideoEncoderSession.VideoEncoderState.INITIALIZING = r0
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = new androidx.camera.video.VideoEncoderSession$VideoEncoderState
                java.lang.String r1 = "PENDING_RELEASE"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.video.VideoEncoderSession.VideoEncoderState.PENDING_RELEASE = r0
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = new androidx.camera.video.VideoEncoderSession$VideoEncoderState
                java.lang.String r1 = "READY"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.video.VideoEncoderSession.VideoEncoderState.READY = r0
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = new androidx.camera.video.VideoEncoderSession$VideoEncoderState
                java.lang.String r1 = "RELEASED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.video.VideoEncoderSession.VideoEncoderState.RELEASED = r0
                androidx.camera.video.VideoEncoderSession$VideoEncoderState[] r0 = $values()
                androidx.camera.video.VideoEncoderSession.VideoEncoderState.$VALUES = r0
                return
        }

        VideoEncoderState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.video.VideoEncoderSession.VideoEncoderState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.video.VideoEncoderSession$VideoEncoderState> r0 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = (androidx.camera.video.VideoEncoderSession.VideoEncoderState) r1
                return r1
        }

        public static androidx.camera.video.VideoEncoderSession.VideoEncoderState[] values() {
                androidx.camera.video.VideoEncoderSession$VideoEncoderState[] r0 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.video.VideoEncoderSession$VideoEncoderState[] r0 = (androidx.camera.video.VideoEncoderSession.VideoEncoderState[]) r0
                return r0
        }
    }

    VideoEncoderSession(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderFactory r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5, @androidx.annotation.NonNull java.util.concurrent.Executor r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mVideoEncoder = r0
            r3.mActiveSurface = r0
            r3.mSurfaceRequest = r0
            r3.mOnSurfaceUpdateExecutor = r0
            r3.mOnSurfaceUpdateListener = r0
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.NOT_INITIALIZED
            r3.mVideoEncoderState = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot close the encoder before configuring."
            r1.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r1)
            r3.mReleasedFuture = r1
            r3.mReleasedCompleter = r0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r1)
            r3.mReadyToReleaseFuture = r1
            r3.mReadyToReleaseCompleter = r0
            r3.mExecutor = r6
            r3.mSequentialExecutor = r5
            r3.mVideoEncoderFactory = r4
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.video.VideoEncoderSession r0, androidx.camera.core.SurfaceRequest r1, androidx.camera.core.impl.Timebase r2, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r3, androidx.camera.video.MediaSpec r4, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r5) {
            r0.configureVideoEncoderInternal(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ConfigureVideoEncoderFuture "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static /* synthetic */ void b(androidx.camera.video.VideoEncoderSession r0, androidx.camera.core.SurfaceRequest.Result r1) {
            r0.onSurfaceRequestComplete(r1)
            return
    }

    public static /* synthetic */ void c(androidx.camera.video.VideoEncoderSession r0, android.view.Surface r1) {
            androidx.camera.video.internal.encoder.Encoder$SurfaceInput$OnSurfaceUpdateListener r0 = r0.mOnSurfaceUpdateListener
            r0.onSurfaceUpdate(r1)
            return
    }

    private void closeInternal() {
            r3 = this;
            int[] r0 = androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = r3.mVideoEncoderState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L5f
            r1 = 2
            if (r0 == r1) goto L5f
            r1 = 3
            java.lang.String r2 = "VideoEncoderSession"
            if (r0 == r1) goto L3f
            r1 = 4
            if (r0 == r1) goto L3f
            r1 = 5
            if (r0 != r1) goto L21
            java.lang.String r0 = "closeInternal in RELEASED state, No-op"
            androidx.camera.core.Logger.d(r2, r0)
            return
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "State "
            r1.append(r2)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r2 = r3.mVideoEncoderState
            r1.append(r2)
            java.lang.String r2 = " is not handled"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "closeInternal in "
            r0.append(r1)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = r3.mVideoEncoderState
            r0.append(r1)
            java.lang.String r1 = " state"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r2, r0)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.PENDING_RELEASE
            r3.mVideoEncoderState = r0
            return
        L5f:
            r3.terminateNow()
            return
    }

    private void configureVideoEncoderInternal(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r7, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r8, @androidx.annotation.Nullable androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r9, @androidx.annotation.NonNull androidx.camera.video.MediaSpec r10, @androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.video.internal.encoder.Encoder> r11) {
            r6 = this;
            androidx.camera.core.DynamicRange r4 = r7.getDynamicRange()
            androidx.camera.video.internal.config.VideoMimeInfo r0 = androidx.camera.video.internal.config.VideoConfigUtil.resolveVideoMimeInfo(r10, r4, r9)
            androidx.camera.video.VideoSpec r2 = r10.getVideoSpec()
            android.util.Size r3 = r7.getResolution()
            android.util.Range r5 = r7.getExpectedFrameRate()
            r1 = r8
            androidx.camera.video.internal.encoder.VideoEncoderConfig r8 = androidx.camera.video.internal.config.VideoConfigUtil.resolveVideoEncoderConfig(r0, r1, r2, r3, r4, r5)
            androidx.camera.video.internal.encoder.EncoderFactory r9 = r6.mVideoEncoderFactory     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L43
            java.util.concurrent.Executor r10 = r6.mExecutor     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L43
            androidx.camera.video.internal.encoder.Encoder r8 = r9.createEncoder(r10, r8)     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L43
            r6.mVideoEncoder = r8     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L43
            androidx.camera.video.internal.encoder.Encoder$EncoderInput r8 = r8.getInput()
            boolean r9 = r8 instanceof androidx.camera.video.internal.encoder.Encoder.SurfaceInput
            if (r9 != 0) goto L36
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "The EncoderInput of video isn't a SurfaceInput."
            r7.<init>(r8)
            r11.setException(r7)
            return
        L36:
            androidx.camera.video.internal.encoder.Encoder$SurfaceInput r8 = (androidx.camera.video.internal.encoder.Encoder.SurfaceInput) r8
            java.util.concurrent.Executor r9 = r6.mSequentialExecutor
            androidx.camera.video.r0 r10 = new androidx.camera.video.r0
            r10.<init>(r6, r11, r7)
            r8.setOnSurfaceUpdateListener(r9, r10)
            return
        L43:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "VideoEncoderSession"
            java.lang.String r9 = "Unable to initialize video encoder."
            androidx.camera.core.Logger.e(r8, r9, r7)
            r11.setException(r7)
            return
    }

    public static /* synthetic */ java.lang.Object d(androidx.camera.video.VideoEncoderSession r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            r1.mReleasedCompleter = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ReleasedFuture "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    public static /* synthetic */ void e(androidx.camera.video.VideoEncoderSession r1) {
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r1.mReleasedCompleter
            r0 = 0
            r1.set(r0)
            return
    }

    public static /* synthetic */ java.lang.Object f(androidx.camera.video.VideoEncoderSession r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            r1.mReadyToReleaseCompleter = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ReadyToReleaseFuture "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    public static /* synthetic */ void g(androidx.camera.video.VideoEncoderSession r4, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r5, androidx.camera.core.SurfaceRequest r6, android.view.Surface r7) {
            r4.getClass()
            int[] r0 = androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = r4.mVideoEncoderState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            java.lang.String r3 = "VideoEncoderSession"
            if (r0 == r1) goto Lba
            r1 = 2
            if (r0 == r1) goto L64
            r6 = 3
            if (r0 == r6) goto L3f
            r6 = 4
            if (r0 == r6) goto Lba
            r6 = 5
            if (r0 != r6) goto L21
            goto Lba
        L21:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "State "
            r6.append(r7)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r4 = r4.mVideoEncoderState
            r6.append(r4)
            java.lang.String r4 = " is not handled"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        L3f:
            androidx.camera.video.internal.encoder.Encoder$SurfaceInput$OnSurfaceUpdateListener r5 = r4.mOnSurfaceUpdateListener
            if (r5 == 0) goto L4f
            java.util.concurrent.Executor r5 = r4.mOnSurfaceUpdateExecutor
            if (r5 == 0) goto L4f
            androidx.camera.video.x0 r6 = new androidx.camera.video.x0
            r6.<init>(r4, r7)
            r5.execute(r6)
        L4f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Surface is updated in READY state: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            androidx.camera.core.Logger.w(r3, r4)
            return
        L64:
            boolean r0 = r6.isServiced()
            if (r0 == 0) goto L90
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Not provide surface, "
            r7.append(r0)
            java.lang.String r0 = "EMPTY"
            java.lang.String r6 = java.util.Objects.toString(r6, r0)
            r7.append(r6)
            java.lang.String r6 = " is already serviced."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            androidx.camera.core.Logger.d(r3, r6)
            r5.set(r2)
            r4.closeInternal()
            return
        L90:
            r4.mActiveSurface = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "provide surface: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r3, r0)
            java.util.concurrent.Executor r0 = r4.mSequentialExecutor
            androidx.camera.video.w0 r1 = new androidx.camera.video.w0
            r1.<init>(r4)
            r6.provideSurface(r7, r0, r1)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r6 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.READY
            r4.mVideoEncoderState = r6
            androidx.camera.video.internal.encoder.Encoder r4 = r4.mVideoEncoder
            r5.set(r4)
            return
        Lba:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Not provide surface in "
            r6.append(r7)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r4 = r4.mVideoEncoderState
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            androidx.camera.core.Logger.d(r3, r4)
            r5.set(r2)
            return
    }

    private void onSurfaceRequestComplete(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest.Result r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Surface can be closed: "
            r0.append(r1)
            android.view.Surface r1 = r3.getSurface()
            int r1 = r1.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoEncoderSession"
            androidx.camera.core.Logger.d(r1, r0)
            android.view.Surface r3 = r3.getSurface()
            android.view.Surface r0 = r2.mActiveSurface
            if (r3 != r0) goto L34
            r3 = 0
            r2.mActiveSurface = r3
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.video.internal.encoder.Encoder> r3 = r2.mReadyToReleaseCompleter
            androidx.camera.video.internal.encoder.Encoder r0 = r2.mVideoEncoder
            r3.set(r0)
            r2.closeInternal()
            return
        L34:
            r3.release()
            return
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.Encoder> configure(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r8, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r9, @androidx.annotation.NonNull androidx.camera.video.MediaSpec r10, @androidx.annotation.Nullable androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r11) {
            r7 = this;
            int[] r0 = androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = r7.mVideoEncoderState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2a
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "configure() shouldn't be called in "
            r9.append(r10)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r10 = r7.mVideoEncoderState
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            com.google.common.util.concurrent.ListenableFuture r8 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r8)
            return r8
        L2a:
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.INITIALIZING
            r7.mVideoEncoderState = r0
            r7.mSurfaceRequest = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Create VideoEncoderSession: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoEncoderSession"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.video.t0 r0 = new androidx.camera.video.t0
            r0.<init>(r7)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            r7.mReleasedFuture = r0
            androidx.camera.video.u0 r0 = new androidx.camera.video.u0
            r0.<init>(r7)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            r7.mReadyToReleaseFuture = r0
            androidx.camera.video.v0 r1 = new androidx.camera.video.v0
            r2 = r7
            r3 = r8
            r4 = r9
            r6 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.ListenableFuture r8 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)
            androidx.camera.video.VideoEncoderSession$1 r9 = new androidx.camera.video.VideoEncoderSession$1
            r9.<init>(r7)
            java.util.concurrent.Executor r10 = r2.mSequentialExecutor
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r8, r9, r10)
            com.google.common.util.concurrent.ListenableFuture r8 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r8)
            return r8
    }

    @androidx.annotation.Nullable
    android.view.Surface getActiveSurface() {
            r2 = this;
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = r2.mVideoEncoderState
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.READY
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            android.view.Surface r0 = r2.mActiveSurface
            return r0
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.Encoder> getReadyToReleaseFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.Encoder> r0 = r1.mReadyToReleaseFuture
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    @androidx.annotation.Nullable
    androidx.camera.video.internal.encoder.Encoder getVideoEncoder() {
            r1 = this;
            androidx.camera.video.internal.encoder.Encoder r0 = r1.mVideoEncoder
            return r0
    }

    boolean isConfiguredSurfaceRequest(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r5) {
            r4 = this;
            int[] r0 = androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = r4.mVideoEncoderState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L3e
            r3 = 2
            if (r0 == r3) goto L39
            r3 = 3
            if (r0 == r3) goto L39
            r5 = 4
            if (r0 == r5) goto L3e
            r5 = 5
            if (r0 != r5) goto L1b
            goto L3e
        L1b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "State "
            r0.append(r1)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = r4.mVideoEncoderState
            r0.append(r1)
            java.lang.String r1 = " is not handled"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L39:
            androidx.camera.core.SurfaceRequest r0 = r4.mSurfaceRequest
            if (r0 != r5) goto L3e
            return r2
        L3e:
            return r1
    }

    void setOnSurfaceUpdateListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener r2) {
            r0 = this;
            r0.mOnSurfaceUpdateExecutor = r1
            r0.mOnSurfaceUpdateListener = r2
            return
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> signalTermination() {
            r1 = this;
            r1.closeInternal()
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mReleasedFuture
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    void terminateNow() {
            r4 = this;
            int[] r0 = androidx.camera.video.VideoEncoderSession.AnonymousClass2.$SwitchMap$androidx$camera$video$VideoEncoderSession$VideoEncoderState
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = r4.mVideoEncoderState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto La0
            r1 = 2
            java.lang.String r2 = "VideoEncoderSession"
            if (r0 == r1) goto L55
            r1 = 3
            if (r0 == r1) goto L55
            r1 = 4
            if (r0 == r1) goto L55
            r1 = 5
            if (r0 != r1) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "terminateNow in "
            r0.append(r1)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r1 = r4.mVideoEncoderState
            r0.append(r1)
            java.lang.String r1 = ", No-op"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r2, r0)
            return
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "State "
            r1.append(r2)
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r2 = r4.mVideoEncoderState
            r1.append(r2)
            java.lang.String r2 = " is not handled"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L55:
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.RELEASED
            r4.mVideoEncoderState = r0
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.video.internal.encoder.Encoder> r0 = r4.mReadyToReleaseCompleter
            androidx.camera.video.internal.encoder.Encoder r1 = r4.mVideoEncoder
            r0.set(r1)
            r0 = 0
            r4.mSurfaceRequest = r0
            androidx.camera.video.internal.encoder.Encoder r1 = r4.mVideoEncoder
            if (r1 == 0) goto L95
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "VideoEncoder is releasing: "
            r1.append(r3)
            androidx.camera.video.internal.encoder.Encoder r3 = r4.mVideoEncoder
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            androidx.camera.core.Logger.d(r2, r1)
            androidx.camera.video.internal.encoder.Encoder r1 = r4.mVideoEncoder
            r1.release()
            androidx.camera.video.internal.encoder.Encoder r1 = r4.mVideoEncoder
            com.google.common.util.concurrent.ListenableFuture r1 = r1.getReleasedFuture()
            androidx.camera.video.s0 r2 = new androidx.camera.video.s0
            r2.<init>(r4)
            java.util.concurrent.Executor r3 = r4.mSequentialExecutor
            r1.addListener(r2, r3)
            r4.mVideoEncoder = r0
            return
        L95:
            java.lang.String r1 = "There's no VideoEncoder to release! Finish release completer."
            androidx.camera.core.Logger.w(r2, r1)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r4.mReleasedCompleter
            r1.set(r0)
            return
        La0:
            androidx.camera.video.VideoEncoderSession$VideoEncoderState r0 = androidx.camera.video.VideoEncoderSession.VideoEncoderState.RELEASED
            r4.mVideoEncoderState = r0
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoEncoderSession@"
            r0.append(r1)
            int r1 = r3.hashCode()
            r0.append(r1)
            java.lang.String r1 = " for "
            r0.append(r1)
            androidx.camera.core.SurfaceRequest r1 = r3.mSurfaceRequest
            java.lang.String r2 = "SURFACE_REQUEST_NOT_CONFIGURED"
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
