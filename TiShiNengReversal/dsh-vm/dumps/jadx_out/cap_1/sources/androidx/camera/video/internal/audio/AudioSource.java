package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AudioSource {

    @androidx.annotation.VisibleForTesting
    static final long DEFAULT_START_RETRY_INTERVAL_MS = 3000;
    private static final java.lang.String TAG = "AudioSource";

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.video.internal.encoder.InputBuffer> mAcquireBufferCallback;
    long mAmplitudeTimestamp;
    double mAudioAmplitude;
    private final int mAudioFormat;

    @androidx.annotation.Nullable
    androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback mAudioSourceCallback;
    final androidx.camera.video.internal.audio.AudioStream mAudioStream;
    boolean mAudioStreamSilenced;

    @androidx.annotation.Nullable
    androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> mBufferProvider;

    @androidx.annotation.NonNull
    androidx.camera.video.internal.BufferProvider.State mBufferProviderState;

    @androidx.annotation.Nullable
    java.util.concurrent.Executor mCallbackExecutor;
    final java.util.concurrent.Executor mExecutor;
    boolean mInSilentStartState;
    boolean mIsSendingAudio;
    private long mLatestFailedStartTimeNs;
    boolean mMuted;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> mNotifiedSilenceState;
    final java.util.concurrent.atomic.AtomicBoolean mNotifiedSuspendState;
    final androidx.camera.video.internal.audio.SilentAudioStream mSilentAudioStream;
    private final long mStartRetryIntervalNs;

    @androidx.annotation.NonNull
    androidx.camera.video.internal.audio.AudioSource.InternalState mState;

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.Observable.Observer<androidx.camera.video.internal.BufferProvider.State> mStateObserver;

    @androidx.annotation.Nullable
    private byte[] mZeroBytes;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.internal.audio.AudioSource$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState = null;

        static {
                androidx.camera.video.internal.audio.AudioSource$InternalState[] r0 = androidx.camera.video.internal.audio.AudioSource.InternalState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.video.internal.audio.AudioSource.AnonymousClass3.$SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState = r0
                androidx.camera.video.internal.audio.AudioSource$InternalState r1 = androidx.camera.video.internal.audio.AudioSource.InternalState.CONFIGURED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.video.internal.audio.AudioSource.AnonymousClass3.$SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.video.internal.audio.AudioSource$InternalState r1 = androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.video.internal.audio.AudioSource.AnonymousClass3.$SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.video.internal.audio.AudioSource$InternalState r1 = androidx.camera.video.internal.audio.AudioSource.InternalState.RELEASED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface AudioSourceCallback {
        void onAmplitudeValue(double r1);

        void onError(@androidx.annotation.NonNull java.lang.Throwable r1);

        void onSilenceStateChanged(boolean r1);

        @androidx.annotation.VisibleForTesting
        void onSuspendStateChanged(boolean r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class AudioStreamCallback implements androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback {
        final /* synthetic */ androidx.camera.video.internal.audio.AudioSource this$0;

        AudioStreamCallback(androidx.camera.video.internal.audio.AudioSource r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback
        public void onSilenceStateChanged(boolean r3) {
                r2 = this;
                androidx.camera.video.internal.audio.AudioSource r0 = r2.this$0
                r0.mAudioStreamSilenced = r3
                androidx.camera.video.internal.audio.AudioSource$InternalState r3 = r0.mState
                androidx.camera.video.internal.audio.AudioSource$InternalState r1 = androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED
                if (r3 != r1) goto Ld
                r0.notifySilenced()
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum InternalState extends java.lang.Enum<androidx.camera.video.internal.audio.AudioSource.InternalState> {
        private static final /* synthetic */ androidx.camera.video.internal.audio.AudioSource.InternalState[] $VALUES = null;
        public static final androidx.camera.video.internal.audio.AudioSource.InternalState CONFIGURED = null;
        public static final androidx.camera.video.internal.audio.AudioSource.InternalState RELEASED = null;
        public static final androidx.camera.video.internal.audio.AudioSource.InternalState STARTED = null;

        private static /* synthetic */ androidx.camera.video.internal.audio.AudioSource.InternalState[] $values() {
                r0 = 3
                androidx.camera.video.internal.audio.AudioSource$InternalState[] r0 = new androidx.camera.video.internal.audio.AudioSource.InternalState[r0]
                androidx.camera.video.internal.audio.AudioSource$InternalState r1 = androidx.camera.video.internal.audio.AudioSource.InternalState.CONFIGURED
                r2 = 0
                r0[r2] = r1
                androidx.camera.video.internal.audio.AudioSource$InternalState r1 = androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED
                r2 = 1
                r0[r2] = r1
                androidx.camera.video.internal.audio.AudioSource$InternalState r1 = androidx.camera.video.internal.audio.AudioSource.InternalState.RELEASED
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.video.internal.audio.AudioSource$InternalState r0 = new androidx.camera.video.internal.audio.AudioSource$InternalState
                java.lang.String r1 = "CONFIGURED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.video.internal.audio.AudioSource.InternalState.CONFIGURED = r0
                androidx.camera.video.internal.audio.AudioSource$InternalState r0 = new androidx.camera.video.internal.audio.AudioSource$InternalState
                java.lang.String r1 = "STARTED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED = r0
                androidx.camera.video.internal.audio.AudioSource$InternalState r0 = new androidx.camera.video.internal.audio.AudioSource$InternalState
                java.lang.String r1 = "RELEASED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.video.internal.audio.AudioSource.InternalState.RELEASED = r0
                androidx.camera.video.internal.audio.AudioSource$InternalState[] r0 = $values()
                androidx.camera.video.internal.audio.AudioSource.InternalState.$VALUES = r0
                return
        }

        InternalState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.video.internal.audio.AudioSource.InternalState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.video.internal.audio.AudioSource$InternalState> r0 = androidx.camera.video.internal.audio.AudioSource.InternalState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.video.internal.audio.AudioSource$InternalState r1 = (androidx.camera.video.internal.audio.AudioSource.InternalState) r1
                return r1
        }

        public static androidx.camera.video.internal.audio.AudioSource.InternalState[] values() {
                androidx.camera.video.internal.audio.AudioSource$InternalState[] r0 = androidx.camera.video.internal.audio.AudioSource.InternalState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.video.internal.audio.AudioSource$InternalState[] r0 = (androidx.camera.video.internal.audio.AudioSource.InternalState[]) r0
                return r0
        }
    }

    @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioSource(@androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r8, @androidx.annotation.NonNull java.util.concurrent.Executor r9, @androidx.annotation.Nullable android.content.Context r10) throws androidx.camera.video.internal.audio.AudioSourceAccessException {
            r7 = this;
            androidx.camera.video.internal.audio.d r4 = new androidx.camera.video.internal.audio.d
            r4.<init>()
            r5 = 3000(0xbb8, double:1.482E-320)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    @androidx.annotation.VisibleForTesting
    AudioSource(@androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.Nullable android.content.Context r5, @androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioStreamFactory r6, long r7) throws androidx.camera.video.internal.audio.AudioSourceAccessException {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.mNotifiedSilenceState = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.mNotifiedSuspendState = r0
            androidx.camera.video.internal.audio.AudioSource$InternalState r0 = androidx.camera.video.internal.audio.AudioSource.InternalState.CONFIGURED
            r2.mState = r0
            androidx.camera.video.internal.BufferProvider$State r0 = androidx.camera.video.internal.BufferProvider.State.INACTIVE
            r2.mBufferProviderState = r0
            r0 = 0
            r2.mAmplitudeTimestamp = r0
            java.util.concurrent.Executor r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(r4)
            r2.mExecutor = r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = r0.toNanos(r7)
            r2.mStartRetryIntervalNs = r7
            androidx.camera.video.internal.audio.BufferedAudioStream r7 = new androidx.camera.video.internal.audio.BufferedAudioStream     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L4e java.lang.IllegalArgumentException -> L50
            androidx.camera.video.internal.audio.AudioStream r5 = r6.create(r3, r5)     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L4e java.lang.IllegalArgumentException -> L50
            r7.<init>(r5, r3)     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L4e java.lang.IllegalArgumentException -> L50
            r2.mAudioStream = r7     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L4e java.lang.IllegalArgumentException -> L50
            androidx.camera.video.internal.audio.AudioSource$AudioStreamCallback r5 = new androidx.camera.video.internal.audio.AudioSource$AudioStreamCallback
            r5.<init>(r2)
            r7.setCallback(r5, r4)
            androidx.camera.video.internal.audio.SilentAudioStream r4 = new androidx.camera.video.internal.audio.SilentAudioStream
            r4.<init>(r3)
            r2.mSilentAudioStream = r4
            int r3 = r3.getAudioFormat()
            r2.mAudioFormat = r3
            return
        L4e:
            r3 = move-exception
            goto L51
        L50:
            r3 = move-exception
        L51:
            androidx.camera.video.internal.audio.AudioSourceAccessException r4 = new androidx.camera.video.internal.audio.AudioSourceAccessException
            java.lang.String r5 = "Unable to create AudioStream"
            r4.<init>(r5, r3)
            throw r4
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.video.internal.audio.AudioSource r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.video.internal.audio.i r1 = new androidx.camera.video.internal.audio.i
            r1.<init>(r2, r3)
            r0.execute(r1)
            java.lang.String r2 = "AudioSource-release"
            return r2
    }

    public static /* synthetic */ void b(androidx.camera.video.internal.audio.AudioSource r2, java.util.concurrent.Executor r3, androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback r4) {
            r2.getClass()
            int[] r0 = androidx.camera.video.internal.audio.AudioSource.AnonymousClass3.$SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState
            androidx.camera.video.internal.audio.AudioSource$InternalState r1 = r2.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1f
            r2 = 2
            if (r0 == r2) goto L17
            r2 = 3
            if (r0 == r2) goto L17
            return
        L17:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "The audio recording callback must be registered before the audio source is started."
            r2.<init>(r3)
            throw r2
        L1f:
            r2.mCallbackExecutor = r3
            r2.mAudioSourceCallback = r4
            return
    }

    public static /* synthetic */ void c(androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback r0, java.lang.Throwable r1) {
            r0.onError(r1)
            return
    }

    public static /* synthetic */ void d(androidx.camera.video.internal.audio.AudioSource r2, androidx.camera.video.internal.BufferProvider r3) {
            r2.getClass()
            int[] r0 = androidx.camera.video.internal.audio.AudioSource.AnonymousClass3.$SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState
            androidx.camera.video.internal.audio.AudioSource$InternalState r1 = r2.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 2
            if (r0 == r1) goto L1f
            r2 = 3
            if (r0 == r2) goto L17
            goto L26
        L17:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "AudioSource is released"
            r2.<init>(r3)
            throw r2
        L1f:
            androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> r0 = r2.mBufferProvider
            if (r0 == r3) goto L26
            r2.resetBufferProvider(r3)
        L26:
            return
    }

    public static /* synthetic */ void e(androidx.camera.video.internal.audio.AudioSource r2, boolean r3) {
            r2.getClass()
            int[] r0 = androidx.camera.video.internal.audio.AudioSource.AnonymousClass3.$SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState
            androidx.camera.video.internal.audio.AudioSource$InternalState r1 = r2.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 2
            if (r0 == r1) goto L1f
            r2 = 3
            if (r0 == r2) goto L17
            goto L2f
        L17:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "AudioSource is released"
            r2.<init>(r3)
            throw r2
        L1f:
            boolean r0 = r2.mMuted
            if (r0 != r3) goto L24
            goto L2f
        L24:
            r2.mMuted = r3
            androidx.camera.video.internal.audio.AudioSource$InternalState r3 = r2.mState
            androidx.camera.video.internal.audio.AudioSource$InternalState r0 = androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED
            if (r3 != r0) goto L2f
            r2.notifySilenced()
        L2f:
            return
    }

    public static /* synthetic */ void f(androidx.camera.video.internal.audio.AudioSource r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            r3.getClass()
            int[] r0 = androidx.camera.video.internal.audio.AudioSource.AnonymousClass3.$SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState     // Catch: java.lang.Throwable -> L2e
            androidx.camera.video.internal.audio.AudioSource$InternalState r1 = r3.mState     // Catch: java.lang.Throwable -> L2e
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L2e
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L15
            r1 = 2
            if (r0 == r1) goto L15
            goto L2a
        L15:
            r3.resetBufferProvider(r2)     // Catch: java.lang.Throwable -> L2e
            androidx.camera.video.internal.audio.SilentAudioStream r0 = r3.mSilentAudioStream     // Catch: java.lang.Throwable -> L2e
            r0.release()     // Catch: java.lang.Throwable -> L2e
            androidx.camera.video.internal.audio.AudioStream r0 = r3.mAudioStream     // Catch: java.lang.Throwable -> L2e
            r0.release()     // Catch: java.lang.Throwable -> L2e
            r3.stopSendingAudio()     // Catch: java.lang.Throwable -> L2e
            androidx.camera.video.internal.audio.AudioSource$InternalState r0 = androidx.camera.video.internal.audio.AudioSource.InternalState.RELEASED     // Catch: java.lang.Throwable -> L2e
            r3.setState(r0)     // Catch: java.lang.Throwable -> L2e
        L2a:
            r4.set(r2)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r3 = move-exception
            r4.setException(r3)
            return
    }

    @androidx.annotation.Nullable
    private static androidx.camera.video.internal.BufferProvider.State fetchBufferProviderState(@androidx.annotation.NonNull androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> r2) {
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r2 = r2.fetchData()     // Catch: java.lang.Throwable -> L12
            boolean r1 = r2.isDone()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L12
            androidx.camera.video.internal.BufferProvider$State r2 = (androidx.camera.video.internal.BufferProvider.State) r2     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            return r0
    }

    public static /* synthetic */ void g(androidx.camera.video.internal.audio.AudioSource r2) {
            r2.getClass()
            int[] r0 = androidx.camera.video.internal.audio.AudioSource.AnonymousClass3.$SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState
            androidx.camera.video.internal.audio.AudioSource$InternalState r1 = r2.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            if (r0 == r1) goto L1c
            r2 = 3
            if (r0 == r2) goto L14
            return
        L14:
            java.lang.String r2 = "AudioSource"
            java.lang.String r0 = "AudioSource is released. Calling stop() is a no-op."
            androidx.camera.core.Logger.w(r2, r0)
            return
        L1c:
            androidx.camera.video.internal.audio.AudioSource$InternalState r0 = androidx.camera.video.internal.audio.AudioSource.InternalState.CONFIGURED
            r2.setState(r0)
            r2.updateSendingAudio()
            return
    }

    private static long getCurrentSystemTimeNs() {
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    public static /* synthetic */ void h(androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback r0, boolean r1) {
            r0.onSilenceStateChanged(r1)
            return
    }

    public static /* synthetic */ void i(androidx.camera.video.internal.audio.AudioSource r2, androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback r3) {
            double r0 = r2.mAudioAmplitude
            r3.onAmplitudeValue(r0)
            return
    }

    public static boolean isSettingsSupported(int r0, int r1, int r2) {
            boolean r0 = androidx.camera.video.internal.audio.AudioStreamImpl.isSettingsSupported(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ void j(androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback r0, boolean r1) {
            r0.onSuspendStateChanged(r1)
            return
    }

    public static /* synthetic */ void k(androidx.camera.video.internal.audio.AudioSource r2, boolean r3) {
            r2.getClass()
            int[] r0 = androidx.camera.video.internal.audio.AudioSource.AnonymousClass3.$SwitchMap$androidx$camera$video$internal$audio$AudioSource$InternalState
            androidx.camera.video.internal.audio.AudioSource$InternalState r1 = r2.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1c
            r2 = 3
            if (r0 == r2) goto L14
            return
        L14:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "AudioSource is released"
            r2.<init>(r3)
            throw r2
        L1c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r2.mNotifiedSilenceState
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mNotifiedSuspendState
            r1 = 0
            r0.set(r1)
            androidx.camera.video.internal.audio.AudioSource$InternalState r0 = androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED
            r2.setState(r0)
            r2.mute(r3)
            r2.updateSendingAudio()
            return
    }

    public static /* synthetic */ void l(androidx.camera.video.internal.audio.AudioSource r1) {
            boolean r0 = r1.mMuted
            r1.start(r0)
            return
    }

    private void resetBufferProvider(@androidx.annotation.Nullable androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> r3) {
            r2 = this;
            androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> r0 = r2.mBufferProvider
            if (r0 == 0) goto L1c
            androidx.camera.core.impl.Observable$Observer<androidx.camera.video.internal.BufferProvider$State> r1 = r2.mStateObserver
            java.util.Objects.requireNonNull(r1)
            androidx.camera.core.impl.Observable$Observer r1 = (androidx.camera.core.impl.Observable.Observer) r1
            r0.removeObserver(r1)
            r0 = 0
            r2.mBufferProvider = r0
            r2.mStateObserver = r0
            r2.mAcquireBufferCallback = r0
            androidx.camera.video.internal.BufferProvider$State r0 = androidx.camera.video.internal.BufferProvider.State.INACTIVE
            r2.mBufferProviderState = r0
            r2.updateSendingAudio()
        L1c:
            if (r3 == 0) goto L42
            r2.mBufferProvider = r3
            androidx.camera.video.internal.audio.AudioSource$1 r0 = new androidx.camera.video.internal.audio.AudioSource$1
            r0.<init>(r2, r3)
            r2.mStateObserver = r0
            androidx.camera.video.internal.audio.AudioSource$2 r0 = new androidx.camera.video.internal.audio.AudioSource$2
            r0.<init>(r2, r3)
            r2.mAcquireBufferCallback = r0
            androidx.camera.video.internal.BufferProvider$State r3 = fetchBufferProviderState(r3)
            if (r3 == 0) goto L39
            r2.mBufferProviderState = r3
            r2.updateSendingAudio()
        L39:
            androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> r3 = r2.mBufferProvider
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.core.impl.Observable$Observer<androidx.camera.video.internal.BufferProvider$State> r1 = r2.mStateObserver
            r3.addObserver(r0, r1)
        L42:
            return
    }

    private void startSendingAudio() {
            r4 = this;
            java.lang.String r0 = "AudioSource"
            boolean r1 = r4.mIsSendingAudio
            if (r1 == 0) goto L7
            return
        L7:
            r1 = 1
            java.lang.String r2 = "startSendingAudio"
            androidx.camera.core.Logger.d(r0, r2)     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L16
            androidx.camera.video.internal.audio.AudioStream r2 = r4.mAudioStream     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L16
            r2.start()     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L16
            r2 = 0
            r4.mInSilentStartState = r2     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L16
            goto L2c
        L16:
            r2 = move-exception
            java.lang.String r3 = "Failed to start AudioStream"
            androidx.camera.core.Logger.w(r0, r3, r2)
            r4.mInSilentStartState = r1
            androidx.camera.video.internal.audio.SilentAudioStream r0 = r4.mSilentAudioStream
            r0.start()
            long r2 = getCurrentSystemTimeNs()
            r4.mLatestFailedStartTimeNs = r2
            r4.notifySilenced()
        L2c:
            r4.mIsSendingAudio = r1
            r4.sendNextAudio()
            return
    }

    private void stopSendingAudio() {
            r2 = this;
            boolean r0 = r2.mIsSendingAudio
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.mIsSendingAudio = r0
            java.lang.String r0 = "AudioSource"
            java.lang.String r1 = "stopSendingAudio"
            androidx.camera.core.Logger.d(r0, r1)
            androidx.camera.video.internal.audio.AudioStream r0 = r2.mAudioStream
            r0.stop()
            return
    }

    @androidx.annotation.NonNull
    androidx.camera.video.internal.audio.AudioStream getCurrentAudioStream() {
            r1 = this;
            boolean r0 = r1.mInSilentStartState
            if (r0 == 0) goto L7
            androidx.camera.video.internal.audio.SilentAudioStream r0 = r1.mSilentAudioStream
            return r0
        L7:
            androidx.camera.video.internal.audio.AudioStream r0 = r1.mAudioStream
            return r0
    }

    boolean isStartRetryIntervalReached() {
            r7 = this;
            long r0 = r7.mLatestFailedStartTimeNs
            r2 = 0
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            androidx.core.util.Preconditions.checkState(r0)
            long r0 = getCurrentSystemTimeNs()
            long r2 = r7.mLatestFailedStartTimeNs
            long r0 = r0 - r2
            long r2 = r7.mStartRetryIntervalNs
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L1e
            return r5
        L1e:
            return r4
    }

    public void mute(boolean r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.video.internal.audio.a r1 = new androidx.camera.video.internal.audio.a
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    void notifyError(@androidx.annotation.NonNull java.lang.Throwable r4) {
            r3 = this;
            java.util.concurrent.Executor r0 = r3.mCallbackExecutor
            androidx.camera.video.internal.audio.AudioSource$AudioSourceCallback r1 = r3.mAudioSourceCallback
            if (r0 == 0) goto L10
            if (r1 == 0) goto L10
            androidx.camera.video.internal.audio.c r2 = new androidx.camera.video.internal.audio.c
            r2.<init>(r1, r4)
            r0.execute(r2)
        L10:
            return
    }

    void notifySilenced() {
            r5 = this;
            java.util.concurrent.Executor r0 = r5.mCallbackExecutor
            androidx.camera.video.internal.audio.AudioSource$AudioSourceCallback r1 = r5.mAudioSourceCallback
            if (r0 == 0) goto L34
            if (r1 == 0) goto L34
            boolean r2 = r5.mMuted
            if (r2 != 0) goto L17
            boolean r2 = r5.mInSilentStartState
            if (r2 != 0) goto L17
            boolean r2 = r5.mAudioStreamSilenced
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r3 = r5.mNotifiedSilenceState
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r3 = r3.getAndSet(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 != 0) goto L34
            androidx.camera.video.internal.audio.h r3 = new androidx.camera.video.internal.audio.h
            r3.<init>(r1, r2)
            r0.execute(r3)
        L34:
            return
    }

    void notifySuspended(boolean r4) {
            r3 = this;
            java.util.concurrent.Executor r0 = r3.mCallbackExecutor
            androidx.camera.video.internal.audio.AudioSource$AudioSourceCallback r1 = r3.mAudioSourceCallback
            if (r0 == 0) goto L18
            if (r1 == 0) goto L18
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.mNotifiedSuspendState
            boolean r2 = r2.getAndSet(r4)
            if (r2 == r4) goto L18
            androidx.camera.video.internal.audio.m r2 = new androidx.camera.video.internal.audio.m
            r2.<init>(r1, r4)
            r0.execute(r2)
        L18:
            return
    }

    void overrideBySilence(@androidx.annotation.NonNull java.nio.ByteBuffer r4, int r5) {
            r3 = this;
            byte[] r0 = r3.mZeroBytes
            if (r0 == 0) goto L7
            int r0 = r0.length
            if (r0 >= r5) goto Lb
        L7:
            byte[] r0 = new byte[r5]
            r3.mZeroBytes = r0
        Lb:
            int r0 = r4.position()
            byte[] r1 = r3.mZeroBytes
            r2 = 0
            r4.put(r1, r2, r5)
            int r5 = r4.position()
            java.nio.Buffer r4 = r4.limit(r5)
            r4.position(r0)
            return
    }

    void postMaxAmplitude(java.nio.ByteBuffer r7) {
            r6 = this;
            java.util.concurrent.Executor r0 = r6.mCallbackExecutor
            androidx.camera.video.internal.audio.AudioSource$AudioSourceCallback r1 = r6.mAudioSourceCallback
            int r2 = r6.mAudioFormat
            r3 = 2
            if (r2 != r3) goto L37
            java.nio.ShortBuffer r7 = r7.asShortBuffer()
            r2 = 0
        Lf:
            boolean r4 = r7.hasRemaining()
            if (r4 == 0) goto L23
            short r4 = r7.get()
            int r4 = java.lang.Math.abs(r4)
            double r4 = (double) r4
            double r2 = java.lang.Math.max(r2, r4)
            goto Lf
        L23:
            r4 = 4674736138332667904(0x40dfffc000000000, double:32767.0)
            double r2 = r2 / r4
            r6.mAudioAmplitude = r2
            if (r0 == 0) goto L37
            if (r1 == 0) goto L37
            androidx.camera.video.internal.audio.l r7 = new androidx.camera.video.internal.audio.l
            r7.<init>(r6, r1)
            r0.execute(r7)
        L37:
            return
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release() {
            r1 = this;
            androidx.camera.video.internal.audio.f r0 = new androidx.camera.video.internal.audio.f
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r0
    }

    void retryStartAudioStream() {
            r3 = this;
            java.lang.String r0 = "AudioSource"
            boolean r1 = r3.mInSilentStartState
            androidx.core.util.Preconditions.checkState(r1)
            androidx.camera.video.internal.audio.AudioStream r1 = r3.mAudioStream     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L1a
            r1.start()     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L1a
            java.lang.String r1 = "Retry start AudioStream succeed"
            androidx.camera.core.Logger.d(r0, r1)     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L1a
            androidx.camera.video.internal.audio.SilentAudioStream r1 = r3.mSilentAudioStream     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L1a
            r1.stop()     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L1a
            r1 = 0
            r3.mInSilentStartState = r1     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> L1a
            return
        L1a:
            r1 = move-exception
            java.lang.String r2 = "Retry start AudioStream failed"
            androidx.camera.core.Logger.w(r0, r2, r1)
            long r0 = getCurrentSystemTimeNs()
            r3.mLatestFailedStartTimeNs = r0
            return
    }

    void sendNextAudio() {
            r3 = this;
            androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> r0 = r3.mBufferProvider
            java.util.Objects.requireNonNull(r0)
            androidx.camera.video.internal.BufferProvider r0 = (androidx.camera.video.internal.BufferProvider) r0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.acquireBuffer()
            androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.video.internal.encoder.InputBuffer> r1 = r3.mAcquireBufferCallback
            java.util.Objects.requireNonNull(r1)
            androidx.camera.core.impl.utils.futures.FutureCallback r1 = (androidx.camera.core.impl.utils.futures.FutureCallback) r1
            java.util.concurrent.Executor r2 = r3.mExecutor
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r2)
            return
    }

    public void setAudioSourceCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.video.internal.audio.k r1 = new androidx.camera.video.internal.audio.k
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    public void setBufferProvider(@androidx.annotation.NonNull androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.video.internal.audio.b r1 = new androidx.camera.video.internal.audio.b
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    void setState(androidx.camera.video.internal.audio.AudioSource.InternalState r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Transitioning internal state: "
            r0.append(r1)
            androidx.camera.video.internal.audio.AudioSource$InternalState r1 = r2.mState
            r0.append(r1)
            java.lang.String r1 = " --> "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AudioSource"
            androidx.camera.core.Logger.d(r1, r0)
            r2.mState = r3
            return
    }

    public void start() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.video.internal.audio.j r1 = new androidx.camera.video.internal.audio.j
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public void start(boolean r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.video.internal.audio.g r1 = new androidx.camera.video.internal.audio.g
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    public void stop() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.video.internal.audio.e r1 = new androidx.camera.video.internal.audio.e
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    void updateSendingAudio() {
            r2 = this;
            androidx.camera.video.internal.audio.AudioSource$InternalState r0 = r2.mState
            androidx.camera.video.internal.audio.AudioSource$InternalState r1 = androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED
            if (r0 != r1) goto L1e
            androidx.camera.video.internal.BufferProvider$State r0 = r2.mBufferProviderState
            androidx.camera.video.internal.BufferProvider$State r1 = androidx.camera.video.internal.BufferProvider.State.ACTIVE
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            r1 = r0 ^ 1
            r2.notifySuspended(r1)
            if (r0 == 0) goto L1a
            r2.startSendingAudio()
            return
        L1a:
            r2.stopSendingAudio()
            return
        L1e:
            r2.stopSendingAudio()
            return
    }
}
