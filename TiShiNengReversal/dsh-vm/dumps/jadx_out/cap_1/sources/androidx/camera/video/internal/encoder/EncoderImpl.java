package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class EncoderImpl implements androidx.camera.video.internal.encoder.Encoder {
    private static final boolean DEBUG = false;
    private static final int FAKE_BUFFER_INDEX = -9999;
    private static final long NO_LIMIT_LONG = Long.MAX_VALUE;
    private static final android.util.Range<java.lang.Long> NO_RANGE = null;
    private static final long STOP_TIMEOUT_MS = 1000;
    private final java.util.Queue<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.video.internal.encoder.InputBuffer>> mAcquisitionQueue;
    final java.util.Deque<android.util.Range<java.lang.Long>> mActivePauseResumeTimeRanges;
    final java.util.Set<androidx.camera.video.internal.encoder.EncodedDataImpl> mEncodedDataSet;

    @androidx.annotation.GuardedBy("mLock")
    androidx.camera.video.internal.encoder.EncoderCallback mEncoderCallback;

    @androidx.annotation.GuardedBy("mLock")
    java.util.concurrent.Executor mEncoderCallbackExecutor;
    final java.util.concurrent.Executor mEncoderExecutor;
    final androidx.camera.video.internal.workaround.EncoderFinder mEncoderFinder;
    private final androidx.camera.video.internal.encoder.EncoderInfo mEncoderInfo;
    final androidx.camera.video.internal.encoder.Encoder.EncoderInput mEncoderInput;
    final java.util.Queue<java.lang.Integer> mFreeInputBufferIndexQueue;
    private final java.util.Set<androidx.camera.video.internal.encoder.InputBuffer> mInputBufferSet;
    final androidx.camera.core.impl.Timebase mInputTimebase;
    private boolean mIsFlushedAfterEndOfStream;
    final boolean mIsVideoEncoder;
    java.lang.Long mLastDataStopTimestamp;
    final java.lang.Object mLock;
    final android.media.MediaCodec mMediaCodec;
    private androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mMediaCodecCallback;
    boolean mMediaCodecEosSignalled;
    private final android.media.MediaFormat mMediaFormat;
    boolean mPendingCodecStop;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mReleasedCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mReleasedFuture;
    private boolean mSourceStoppedSignalled;
    android.util.Range<java.lang.Long> mStartStopTimeRangeUs;
    androidx.camera.video.internal.encoder.EncoderImpl.InternalState mState;
    java.util.concurrent.Future<?> mStopTimeoutFuture;
    final java.lang.String mTag;
    final androidx.camera.video.internal.encoder.TimeProvider mTimeProvider;
    long mTotalPausedDurationUs;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState = null;

        static {
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STARTED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STOPPING     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_RELEASE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.RELEASED     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        static android.view.Surface createPersistentInputSurface() {
                android.view.Surface r0 = androidx.camera.video.internal.encoder.u.a()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setInputSurface(@androidx.annotation.NonNull android.media.MediaCodec r0, @androidx.annotation.NonNull android.view.Surface r1) {
                androidx.camera.video.internal.encoder.t.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ByteBufferInput implements androidx.camera.video.internal.encoder.Encoder.ByteBufferInput {
        private final java.util.List<com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer>> mAcquisitionList;
        private androidx.camera.video.internal.BufferProvider.State mBufferProviderState;
        private final java.util.Map<androidx.camera.core.impl.Observable.Observer<? super androidx.camera.video.internal.BufferProvider.State>, java.util.concurrent.Executor> mStateObservers;
        final /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl this$0;

        ByteBufferInput(androidx.camera.video.internal.encoder.EncoderImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                r0.mStateObservers = r1
                androidx.camera.video.internal.BufferProvider$State r1 = androidx.camera.video.internal.BufferProvider.State.INACTIVE
                r0.mBufferProviderState = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.mAcquisitionList = r1
                return
        }

        public static /* synthetic */ void a(androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
                androidx.camera.video.internal.BufferProvider$State r0 = r0.mBufferProviderState
                r1.set(r0)
                return
        }

        public static /* synthetic */ void b(java.util.Map.Entry r0, androidx.camera.video.internal.BufferProvider.State r1) {
                java.lang.Object r0 = r0.getKey()
                androidx.camera.core.impl.Observable$Observer r0 = (androidx.camera.core.impl.Observable.Observer) r0
                r0.onNewData(r1)
                return
        }

        public static /* synthetic */ java.lang.Object c(androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r2.this$0
                java.util.concurrent.Executor r0 = r0.mEncoderExecutor
                androidx.camera.video.internal.encoder.z r1 = new androidx.camera.video.internal.encoder.z
                r1.<init>(r2, r3)
                r0.execute(r1)
                java.lang.String r2 = "fetchData"
                return r2
        }

        private void cancelInputBuffer(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer> r4) {
                r3 = this;
                r0 = 1
                boolean r0 = r4.cancel(r0)
                if (r0 != 0) goto L35
                boolean r0 = r4.isDone()
                androidx.core.util.Preconditions.checkState(r0)
                java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.CancellationException -> L18 java.lang.InterruptedException -> L1a java.util.concurrent.ExecutionException -> L1c
                androidx.camera.video.internal.encoder.InputBuffer r4 = (androidx.camera.video.internal.encoder.InputBuffer) r4     // Catch: java.util.concurrent.CancellationException -> L18 java.lang.InterruptedException -> L1a java.util.concurrent.ExecutionException -> L1c
                r4.cancel()     // Catch: java.util.concurrent.CancellationException -> L18 java.lang.InterruptedException -> L1a java.util.concurrent.ExecutionException -> L1c
                return
            L18:
                r4 = move-exception
                goto L1d
            L1a:
                r4 = move-exception
                goto L1d
            L1c:
                r4 = move-exception
            L1d:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r3.this$0
                java.lang.String r0 = r0.mTag
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unable to cancel the input buffer: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                androidx.camera.core.Logger.w(r0, r4)
            L35:
                return
        }

        public static /* synthetic */ void d(androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput r3, androidx.camera.core.impl.Observable.Observer r4, java.util.concurrent.Executor r5) {
                java.util.Map<androidx.camera.core.impl.Observable$Observer<? super androidx.camera.video.internal.BufferProvider$State>, java.util.concurrent.Executor> r0 = r3.mStateObservers
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r4)
                androidx.camera.core.impl.Observable$Observer r1 = (androidx.camera.core.impl.Observable.Observer) r1
                java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r5)
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
                r0.put(r1, r2)
                androidx.camera.video.internal.BufferProvider$State r3 = r3.mBufferProviderState
                androidx.camera.video.internal.encoder.d0 r0 = new androidx.camera.video.internal.encoder.d0
                r0.<init>(r4, r3)
                r5.execute(r0)
                return
        }

        public static /* synthetic */ void e(androidx.camera.core.impl.Observable.Observer r0, androidx.camera.video.internal.BufferProvider.State r1) {
                r0.onNewData(r1)
                return
        }

        public static /* synthetic */ void f(androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput r0, androidx.camera.core.impl.Observable.Observer r1) {
                java.util.Map<androidx.camera.core.impl.Observable$Observer<? super androidx.camera.video.internal.BufferProvider$State>, java.util.concurrent.Executor> r0 = r0.mStateObservers
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                r0.remove(r1)
                return
        }

        public static /* synthetic */ void g(androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput r0, com.google.common.util.concurrent.ListenableFuture r1) {
                java.util.List<com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer>> r0 = r0.mAcquisitionList
                r0.remove(r1)
                return
        }

        public static /* synthetic */ java.lang.Object h(androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r2.this$0
                java.util.concurrent.Executor r0 = r0.mEncoderExecutor
                androidx.camera.video.internal.encoder.y r1 = new androidx.camera.video.internal.encoder.y
                r1.<init>(r2, r3)
                r0.execute(r1)
                java.lang.String r2 = "acquireBuffer"
                return r2
        }

        public static /* synthetic */ void i(androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
                androidx.camera.video.internal.BufferProvider$State r0 = r3.mBufferProviderState
                androidx.camera.video.internal.BufferProvider$State r1 = androidx.camera.video.internal.BufferProvider.State.ACTIVE
                if (r0 != r1) goto L2d
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r3.this$0
                com.google.common.util.concurrent.ListenableFuture r0 = r0.acquireInputBuffer()
                androidx.camera.core.impl.utils.futures.Futures.propagate(r0, r4)
                androidx.camera.video.internal.encoder.a0 r1 = new androidx.camera.video.internal.encoder.a0
                r1.<init>(r3, r0)
                java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
                r4.addCancellationListener(r1, r2)
                java.util.List<com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer>> r4 = r3.mAcquisitionList
                r4.add(r0)
                androidx.camera.video.internal.encoder.b0 r4 = new androidx.camera.video.internal.encoder.b0
                r4.<init>(r3, r0)
                androidx.camera.video.internal.encoder.EncoderImpl r3 = r3.this$0
                java.util.concurrent.Executor r3 = r3.mEncoderExecutor
                r0.addListener(r4, r3)
                return
            L2d:
                androidx.camera.video.internal.BufferProvider$State r1 = androidx.camera.video.internal.BufferProvider.State.INACTIVE
                if (r0 != r1) goto L3c
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "BufferProvider is not active."
                r3.<init>(r0)
                r4.setException(r3)
                return
            L3c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown state: "
                r1.append(r2)
                androidx.camera.video.internal.BufferProvider$State r3 = r3.mBufferProviderState
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                r4.setException(r0)
                return
        }

        public static /* synthetic */ void j(androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput r0, com.google.common.util.concurrent.ListenableFuture r1) {
                r0.cancelInputBuffer(r1)
                return
        }

        @Override // androidx.camera.video.internal.BufferProvider
        @androidx.annotation.NonNull
        public com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer> acquireBuffer() {
                r1 = this;
                androidx.camera.video.internal.encoder.x r0 = new androidx.camera.video.internal.encoder.x
                r0.<init>(r1)
                com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
                return r0
        }

        @Override // androidx.camera.core.impl.Observable
        public void addObserver(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super androidx.camera.video.internal.BufferProvider.State> r4) {
                r2 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r2.this$0
                java.util.concurrent.Executor r0 = r0.mEncoderExecutor
                androidx.camera.video.internal.encoder.v r1 = new androidx.camera.video.internal.encoder.v
                r1.<init>(r2, r4, r3)
                r0.execute(r1)
                return
        }

        @Override // androidx.camera.core.impl.Observable
        @androidx.annotation.NonNull
        public com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.BufferProvider.State> fetchData() {
                r1 = this;
                androidx.camera.video.internal.encoder.w r0 = new androidx.camera.video.internal.encoder.w
                r0.<init>(r1)
                com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
                return r0
        }

        @Override // androidx.camera.core.impl.Observable
        public void removeObserver(@androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super androidx.camera.video.internal.BufferProvider.State> r3) {
                r2 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r2.this$0
                java.util.concurrent.Executor r0 = r0.mEncoderExecutor
                androidx.camera.video.internal.encoder.e0 r1 = new androidx.camera.video.internal.encoder.e0
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        void setActive(boolean r5) {
                r4 = this;
                if (r5 == 0) goto L5
                androidx.camera.video.internal.BufferProvider$State r5 = androidx.camera.video.internal.BufferProvider.State.ACTIVE
                goto L7
            L5:
                androidx.camera.video.internal.BufferProvider$State r5 = androidx.camera.video.internal.BufferProvider.State.INACTIVE
            L7:
                androidx.camera.video.internal.BufferProvider$State r0 = r4.mBufferProviderState
                if (r0 != r5) goto Lc
                goto L5e
            Lc:
                r4.mBufferProviderState = r5
                androidx.camera.video.internal.BufferProvider$State r0 = androidx.camera.video.internal.BufferProvider.State.INACTIVE
                if (r5 != r0) goto L2e
                java.util.List<com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer>> r0 = r4.mAcquisitionList
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L29
                java.lang.Object r1 = r0.next()
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                r2 = 1
                r1.cancel(r2)
                goto L18
            L29:
                java.util.List<com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer>> r0 = r4.mAcquisitionList
                r0.clear()
            L2e:
                java.util.Map<androidx.camera.core.impl.Observable$Observer<? super androidx.camera.video.internal.BufferProvider$State>, java.util.concurrent.Executor> r0 = r4.mStateObservers
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L38:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L5e
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()     // Catch: java.util.concurrent.RejectedExecutionException -> L53
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch: java.util.concurrent.RejectedExecutionException -> L53
                androidx.camera.video.internal.encoder.c0 r3 = new androidx.camera.video.internal.encoder.c0     // Catch: java.util.concurrent.RejectedExecutionException -> L53
                r3.<init>(r1, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L53
                r2.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L53
                goto L38
            L53:
                r1 = move-exception
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r4.this$0
                java.lang.String r2 = r2.mTag
                java.lang.String r3 = "Unable to post to the supplied executor."
                androidx.camera.core.Logger.e(r2, r3, r1)
                goto L38
            L5e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum InternalState extends java.lang.Enum<androidx.camera.video.internal.encoder.EncoderImpl.InternalState> {
        private static final /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl.InternalState[] $VALUES = null;
        public static final androidx.camera.video.internal.encoder.EncoderImpl.InternalState CONFIGURED = null;
        public static final androidx.camera.video.internal.encoder.EncoderImpl.InternalState ERROR = null;
        public static final androidx.camera.video.internal.encoder.EncoderImpl.InternalState PAUSED = null;
        public static final androidx.camera.video.internal.encoder.EncoderImpl.InternalState PENDING_RELEASE = null;
        public static final androidx.camera.video.internal.encoder.EncoderImpl.InternalState PENDING_START = null;
        public static final androidx.camera.video.internal.encoder.EncoderImpl.InternalState PENDING_START_PAUSED = null;
        public static final androidx.camera.video.internal.encoder.EncoderImpl.InternalState RELEASED = null;
        public static final androidx.camera.video.internal.encoder.EncoderImpl.InternalState STARTED = null;
        public static final androidx.camera.video.internal.encoder.EncoderImpl.InternalState STOPPING = null;

        private static /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl.InternalState[] $values() {
                r0 = 9
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState[] r0 = new androidx.camera.video.internal.encoder.EncoderImpl.InternalState[r0]
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED
                r2 = 0
                r0[r2] = r1
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STARTED
                r2 = 1
                r0[r2] = r1
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED
                r2 = 2
                r0[r2] = r1
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STOPPING
                r2 = 3
                r0[r2] = r1
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START
                r2 = 4
                r0[r2] = r1
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED
                r2 = 5
                r0[r2] = r1
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_RELEASE
                r2 = 6
                r0[r2] = r1
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR
                r2 = 7
                r0[r2] = r1
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.RELEASED
                r2 = 8
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = new androidx.camera.video.internal.encoder.EncoderImpl$InternalState
                java.lang.String r1 = "CONFIGURED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = new androidx.camera.video.internal.encoder.EncoderImpl$InternalState
                java.lang.String r1 = "STARTED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STARTED = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = new androidx.camera.video.internal.encoder.EncoderImpl$InternalState
                java.lang.String r1 = "PAUSED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = new androidx.camera.video.internal.encoder.EncoderImpl$InternalState
                java.lang.String r1 = "STOPPING"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STOPPING = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = new androidx.camera.video.internal.encoder.EncoderImpl$InternalState
                java.lang.String r1 = "PENDING_START"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = new androidx.camera.video.internal.encoder.EncoderImpl$InternalState
                java.lang.String r1 = "PENDING_START_PAUSED"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = new androidx.camera.video.internal.encoder.EncoderImpl$InternalState
                java.lang.String r1 = "PENDING_RELEASE"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_RELEASE = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = new androidx.camera.video.internal.encoder.EncoderImpl$InternalState
                java.lang.String r1 = "ERROR"
                r2 = 7
                r0.<init>(r1, r2)
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = new androidx.camera.video.internal.encoder.EncoderImpl$InternalState
                java.lang.String r1 = "RELEASED"
                r2 = 8
                r0.<init>(r1, r2)
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.RELEASED = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState[] r0 = $values()
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState.$VALUES = r0
                return
        }

        InternalState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.video.internal.encoder.EncoderImpl.InternalState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.video.internal.encoder.EncoderImpl$InternalState> r0 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = (androidx.camera.video.internal.encoder.EncoderImpl.InternalState) r1
                return r1
        }

        public static androidx.camera.video.internal.encoder.EncoderImpl.InternalState[] values() {
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState[] r0 = (androidx.camera.video.internal.encoder.EncoderImpl.InternalState[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    class MediaCodecCallback extends android.media.MediaCodec.Callback {
        private boolean mHasEndData;
        private boolean mHasFirstData;
        private boolean mHasSendStartCallback;
        private boolean mIsKeyFrameRequired;
        private boolean mIsOutputBufferInPauseState;
        private long mLastPresentationTimeUs;
        private long mLastSentAdjustedTimeUs;
        private boolean mStopped;

        @androidx.annotation.Nullable
        private final androidx.camera.video.internal.workaround.VideoTimebaseConverter mVideoTimestampConverter;
        final /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl this$0;


        MediaCodecCallback(androidx.camera.video.internal.encoder.EncoderImpl r4) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                r0 = 0
                r3.mHasSendStartCallback = r0
                r3.mHasFirstData = r0
                r3.mHasEndData = r0
                r1 = 0
                r3.mLastPresentationTimeUs = r1
                r3.mLastSentAdjustedTimeUs = r1
                r3.mIsOutputBufferInPauseState = r0
                r3.mIsKeyFrameRequired = r0
                r3.mStopped = r0
                boolean r0 = r4.mIsVideoEncoder
                r1 = 0
                if (r0 == 0) goto L39
                java.lang.Class<androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk> r0 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.class
                androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
                if (r0 == 0) goto L2d
                java.lang.String r0 = r4.mTag
                java.lang.String r2 = "CameraUseInconsistentTimebaseQuirk is enabled"
                androidx.camera.core.Logger.w(r0, r2)
                goto L2f
            L2d:
                androidx.camera.core.impl.Timebase r1 = r4.mInputTimebase
            L2f:
                androidx.camera.video.internal.workaround.VideoTimebaseConverter r0 = new androidx.camera.video.internal.workaround.VideoTimebaseConverter
                androidx.camera.video.internal.encoder.TimeProvider r4 = r4.mTimeProvider
                r0.<init>(r4, r1)
                r3.mVideoTimestampConverter = r0
                return
            L39:
                r3.mVideoTimestampConverter = r1
                return
        }

        public static /* synthetic */ void a(androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback r7, android.media.MediaCodec.BufferInfo r8, android.media.MediaCodec r9, int r10) {
                boolean r0 = r7.mStopped
                if (r0 == 0) goto Le
                androidx.camera.video.internal.encoder.EncoderImpl r7 = r7.this$0
                java.lang.String r7 = r7.mTag
                java.lang.String r8 = "Receives frame after codec is reset."
                androidx.camera.core.Logger.w(r7, r8)
                return
            Le:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
                androidx.camera.video.internal.encoder.EncoderImpl r1 = r7.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r1.mState
                int r1 = r1.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto Lf1;
                    case 2: goto L38;
                    case 3: goto L38;
                    case 4: goto L38;
                    case 5: goto L38;
                    case 6: goto L38;
                    case 7: goto L38;
                    case 8: goto Lf1;
                    case 9: goto Lf1;
                    default: goto L1d;
                }
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "Unknown state: "
                r9.append(r10)
                androidx.camera.video.internal.encoder.EncoderImpl r7 = r7.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r7 = r7.mState
                r9.append(r7)
                java.lang.String r7 = r9.toString()
                r8.<init>(r7)
                throw r8
            L38:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                java.lang.Object r0 = r0.mLock
                monitor-enter(r0)
                androidx.camera.video.internal.encoder.EncoderImpl r1 = r7.this$0     // Catch: java.lang.Throwable -> Lee
                androidx.camera.video.internal.encoder.EncoderCallback r2 = r1.mEncoderCallback     // Catch: java.lang.Throwable -> Lee
                java.util.concurrent.Executor r1 = r1.mEncoderCallbackExecutor     // Catch: java.lang.Throwable -> Lee
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
                boolean r0 = r7.mHasSendStartCallback
                r3 = 1
                if (r0 != 0) goto L61
                r7.mHasSendStartCallback = r3
                java.util.Objects.requireNonNull(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L57
                androidx.camera.video.internal.encoder.j0 r0 = new androidx.camera.video.internal.encoder.j0     // Catch: java.util.concurrent.RejectedExecutionException -> L57
                r0.<init>(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L57
                r1.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L57
                goto L61
            L57:
                r0 = move-exception
                androidx.camera.video.internal.encoder.EncoderImpl r4 = r7.this$0
                java.lang.String r4 = r4.mTag
                java.lang.String r5 = "Unable to post to the supplied executor."
                androidx.camera.core.Logger.e(r4, r5, r0)
            L61:
                boolean r0 = r7.checkBufferInfo(r8)
                if (r0 == 0) goto Lc3
                boolean r0 = r7.mHasFirstData
                if (r0 != 0) goto Lab
                r7.mHasFirstData = r3
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                java.lang.String r0 = r0.mTag
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "data timestampUs = "
                r4.append(r5)
                long r5 = r8.presentationTimeUs
                r4.append(r5)
                java.lang.String r5 = ", data timebase = "
                r4.append(r5)
                androidx.camera.video.internal.encoder.EncoderImpl r5 = r7.this$0
                androidx.camera.core.impl.Timebase r5 = r5.mInputTimebase
                r4.append(r5)
                java.lang.String r5 = ", current system uptimeMs = "
                r4.append(r5)
                long r5 = android.os.SystemClock.uptimeMillis()
                r4.append(r5)
                java.lang.String r5 = ", current system realtimeMs = "
                r4.append(r5)
                long r5 = android.os.SystemClock.elapsedRealtime()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                androidx.camera.core.Logger.d(r0, r4)
            Lab:
                android.media.MediaCodec$BufferInfo r0 = r7.resolveOutputBufferInfo(r8)
                long r4 = r0.presentationTimeUs
                r7.mLastSentAdjustedTimeUs = r4
                androidx.camera.video.internal.encoder.EncodedDataImpl r4 = new androidx.camera.video.internal.encoder.EncodedDataImpl     // Catch: android.media.MediaCodec.CodecException -> Lbc
                r4.<init>(r9, r10, r0)     // Catch: android.media.MediaCodec.CodecException -> Lbc
                r7.sendEncodedData(r4, r2, r1)     // Catch: android.media.MediaCodec.CodecException -> Lbc
                goto Ld7
            Lbc:
                r8 = move-exception
                androidx.camera.video.internal.encoder.EncoderImpl r7 = r7.this$0
                r7.handleEncodeError(r8)
                goto Lf1
            Lc3:
                r9 = -9999(0xffffffffffffd8f1, float:NaN)
                if (r10 == r9) goto Ld7
                androidx.camera.video.internal.encoder.EncoderImpl r9 = r7.this$0     // Catch: android.media.MediaCodec.CodecException -> Ld0
                android.media.MediaCodec r9 = r9.mMediaCodec     // Catch: android.media.MediaCodec.CodecException -> Ld0
                r0 = 0
                r9.releaseOutputBuffer(r10, r0)     // Catch: android.media.MediaCodec.CodecException -> Ld0
                goto Ld7
            Ld0:
                r8 = move-exception
                androidx.camera.video.internal.encoder.EncoderImpl r7 = r7.this$0
                r7.handleEncodeError(r8)
                goto Lf1
            Ld7:
                boolean r9 = r7.mHasEndData
                if (r9 != 0) goto Lf1
                boolean r8 = r7.isEndOfStream(r8)
                if (r8 == 0) goto Lf1
                r7.mHasEndData = r3
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                androidx.camera.video.internal.encoder.k0 r9 = new androidx.camera.video.internal.encoder.k0
                r9.<init>(r7, r1, r2)
                r8.stopMediaCodec(r9)
                goto Lf1
            Lee:
                r7 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
                throw r7
            Lf1:
                return
        }

        public static /* synthetic */ android.media.MediaFormat b(android.media.MediaFormat r0) {
                return r0
        }

        public static /* synthetic */ void c(androidx.camera.video.internal.encoder.EncoderCallback r0, androidx.camera.video.internal.encoder.EncodedDataImpl r1) {
                r0.onEncodedData(r1)
                return
        }

        private boolean checkBufferInfo(@androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r8) {
                r7 = this;
                boolean r0 = r7.mHasEndData
                r1 = 0
                if (r0 == 0) goto Lf
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                java.lang.String r8 = r8.mTag
                java.lang.String r0 = "Drop buffer by already reach end of stream."
                androidx.camera.core.Logger.d(r8, r0)
                return r1
            Lf:
                int r0 = r8.size
                if (r0 > 0) goto L1d
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                java.lang.String r8 = r8.mTag
                java.lang.String r0 = "Drop buffer by invalid buffer size."
                androidx.camera.core.Logger.d(r8, r0)
                return r1
            L1d:
                int r0 = r8.flags
                r0 = r0 & 2
                if (r0 == 0) goto L2d
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                java.lang.String r8 = r8.mTag
                java.lang.String r0 = "Drop buffer by codec config."
                androidx.camera.core.Logger.d(r8, r0)
                return r1
            L2d:
                androidx.camera.video.internal.workaround.VideoTimebaseConverter r0 = r7.mVideoTimestampConverter
                if (r0 == 0) goto L39
                long r2 = r8.presentationTimeUs
                long r2 = r0.convertToUptimeUs(r2)
                r8.presentationTimeUs = r2
            L39:
                long r2 = r8.presentationTimeUs
                long r4 = r7.mLastPresentationTimeUs
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L4b
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                java.lang.String r8 = r8.mTag
                java.lang.String r0 = "Drop buffer by out of order buffer from MediaCodec."
                androidx.camera.core.Logger.d(r8, r0)
                return r1
            L4b:
                r7.mLastPresentationTimeUs = r2
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                android.util.Range<java.lang.Long> r0 = r0.mStartStopTimeRangeUs
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                boolean r0 = r0.contains(r2)
                r2 = 1
                if (r0 != 0) goto L9a
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                java.lang.String r0 = r0.mTag
                java.lang.String r3 = "Drop buffer by not in start-stop range."
                androidx.camera.core.Logger.d(r0, r3)
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                boolean r3 = r0.mPendingCodecStop
                if (r3 == 0) goto L99
                long r3 = r8.presentationTimeUs
                android.util.Range<java.lang.Long> r0 = r0.mStartStopTimeRangeUs
                java.lang.Comparable r0 = r0.getUpper()
                java.lang.Long r0 = (java.lang.Long) r0
                long r5 = r0.longValue()
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 < 0) goto L99
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                java.util.concurrent.Future<?> r0 = r0.mStopTimeoutFuture
                if (r0 == 0) goto L86
                r0.cancel(r2)
            L86:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                long r2 = r8.presentationTimeUs
                java.lang.Long r8 = java.lang.Long.valueOf(r2)
                r0.mLastDataStopTimestamp = r8
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                r8.signalCodecStop()
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                r8.mPendingCodecStop = r1
            L99:
                return r1
            L9a:
                boolean r0 = r7.updatePauseRangeStateAndCheckIfBufferPaused(r8)
                if (r0 == 0) goto Laa
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                java.lang.String r8 = r8.mTag
                java.lang.String r0 = "Drop buffer by pause."
                androidx.camera.core.Logger.d(r8, r0)
                return r1
            Laa:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                long r3 = r0.getAdjustedTimeUs(r8)
                long r5 = r7.mLastSentAdjustedTimeUs
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 > 0) goto Lce
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                java.lang.String r0 = r0.mTag
                java.lang.String r3 = "Drop buffer by adjusted time is less than the last sent time."
                androidx.camera.core.Logger.d(r0, r3)
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                boolean r0 = r0.mIsVideoEncoder
                if (r0 == 0) goto Lcd
                boolean r8 = androidx.camera.video.internal.encoder.EncoderImpl.isKeyFrame(r8)
                if (r8 == 0) goto Lcd
                r7.mIsKeyFrameRequired = r2
            Lcd:
                return r1
            Lce:
                boolean r0 = r7.mHasFirstData
                if (r0 != 0) goto Lde
                boolean r0 = r7.mIsKeyFrameRequired
                if (r0 != 0) goto Lde
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                boolean r0 = r0.mIsVideoEncoder
                if (r0 == 0) goto Lde
                r7.mIsKeyFrameRequired = r2
            Lde:
                boolean r0 = r7.mIsKeyFrameRequired
                if (r0 == 0) goto Lf9
                boolean r8 = androidx.camera.video.internal.encoder.EncoderImpl.isKeyFrame(r8)
                if (r8 != 0) goto Lf7
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                java.lang.String r8 = r8.mTag
                java.lang.String r0 = "Drop buffer by not a key frame."
                androidx.camera.core.Logger.d(r8, r0)
                androidx.camera.video.internal.encoder.EncoderImpl r8 = r7.this$0
                r8.requestKeyFrameToMediaCodec()
                return r1
            Lf7:
                r7.mIsKeyFrameRequired = r1
            Lf9:
                return r2
        }

        public static /* synthetic */ void d(androidx.camera.video.internal.encoder.EncoderCallback r1, android.media.MediaFormat r2) {
                androidx.camera.video.internal.encoder.m0 r0 = new androidx.camera.video.internal.encoder.m0
                r0.<init>(r2)
                r1.onOutputConfigUpdate(r0)
                return
        }

        public static /* synthetic */ void e(androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback r2, java.util.concurrent.Executor r3, androidx.camera.video.internal.encoder.EncoderCallback r4) {
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r2.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r0.mState
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR
                if (r0 != r1) goto L9
                return
            L9:
                java.util.Objects.requireNonNull(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L15
                androidx.camera.video.internal.encoder.i0 r0 = new androidx.camera.video.internal.encoder.i0     // Catch: java.util.concurrent.RejectedExecutionException -> L15
                r0.<init>(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L15
                r3.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L15
                return
            L15:
                r3 = move-exception
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r2.this$0
                java.lang.String r2 = r2.mTag
                java.lang.String r4 = "Unable to post to the supplied executor."
                androidx.camera.core.Logger.e(r2, r4, r3)
                return
        }

        public static /* synthetic */ void f(androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback r3, android.media.MediaFormat r4) {
                boolean r0 = r3.mStopped
                if (r0 == 0) goto Le
                androidx.camera.video.internal.encoder.EncoderImpl r3 = r3.this$0
                java.lang.String r3 = r3.mTag
                java.lang.String r4 = "Receives onOutputFormatChanged after codec is reset."
                androidx.camera.core.Logger.w(r3, r4)
                return
            Le:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
                androidx.camera.video.internal.encoder.EncoderImpl r1 = r3.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r1.mState
                int r1 = r1.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L5b;
                    case 2: goto L38;
                    case 3: goto L38;
                    case 4: goto L38;
                    case 5: goto L38;
                    case 6: goto L38;
                    case 7: goto L38;
                    case 8: goto L5b;
                    case 9: goto L5b;
                    default: goto L1d;
                }
            L1d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown state: "
                r0.append(r1)
                androidx.camera.video.internal.encoder.EncoderImpl r3 = r3.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r3 = r3.mState
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
            L38:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r3.this$0
                java.lang.Object r0 = r0.mLock
                monitor-enter(r0)
                androidx.camera.video.internal.encoder.EncoderImpl r1 = r3.this$0     // Catch: java.lang.Throwable -> L58
                androidx.camera.video.internal.encoder.EncoderCallback r2 = r1.mEncoderCallback     // Catch: java.lang.Throwable -> L58
                java.util.concurrent.Executor r1 = r1.mEncoderCallbackExecutor     // Catch: java.lang.Throwable -> L58
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
                androidx.camera.video.internal.encoder.n0 r0 = new androidx.camera.video.internal.encoder.n0     // Catch: java.util.concurrent.RejectedExecutionException -> L4d
                r0.<init>(r2, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L4d
                r1.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L4d
                return
            L4d:
                r4 = move-exception
                androidx.camera.video.internal.encoder.EncoderImpl r3 = r3.this$0
                java.lang.String r3 = r3.mTag
                java.lang.String r0 = "Unable to post to the supplied executor."
                androidx.camera.core.Logger.e(r3, r0, r4)
                return
            L58:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
                throw r3
            L5b:
                return
        }

        public static /* synthetic */ void g(androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback r2, int r3) {
                boolean r0 = r2.mStopped
                if (r0 == 0) goto Le
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r2.this$0
                java.lang.String r2 = r2.mTag
                java.lang.String r3 = "Receives input frame after codec is reset."
                androidx.camera.core.Logger.w(r2, r3)
                return
            Le:
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
                androidx.camera.video.internal.encoder.EncoderImpl r1 = r2.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r1.mState
                int r1 = r1.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L48;
                    case 2: goto L38;
                    case 3: goto L38;
                    case 4: goto L38;
                    case 5: goto L38;
                    case 6: goto L38;
                    case 7: goto L38;
                    case 8: goto L48;
                    case 9: goto L48;
                    default: goto L1d;
                }
            L1d:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown state: "
                r0.append(r1)
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r2.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r2 = r2.mState
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r3.<init>(r2)
                throw r3
            L38:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r2.this$0
                java.util.Queue<java.lang.Integer> r0 = r0.mFreeInputBufferIndexQueue
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.offer(r3)
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r2.this$0
                r2.matchAcquisitionsAndFreeBufferIndexes()
            L48:
                return
        }

        public static /* synthetic */ void h(androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback r2, android.media.MediaCodec.CodecException r3) {
                r2.getClass()
                int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
                androidx.camera.video.internal.encoder.EncoderImpl r1 = r2.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r1.mState
                int r1 = r1.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L32;
                    case 2: goto L2d;
                    case 3: goto L2d;
                    case 4: goto L2d;
                    case 5: goto L2d;
                    case 6: goto L2d;
                    case 7: goto L2d;
                    case 8: goto L32;
                    case 9: goto L32;
                    default: goto L12;
                }
            L12:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown state: "
                r0.append(r1)
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r2.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r2 = r2.mState
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r3.<init>(r2)
                throw r3
            L2d:
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r2.this$0
                r2.handleEncodeError(r3)
            L32:
                return
        }

        private boolean isEndOfStream(@androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r2) {
                r1 = this;
                boolean r0 = androidx.camera.video.internal.encoder.EncoderImpl.hasEndOfStreamFlag(r2)
                if (r0 != 0) goto Lf
                boolean r2 = r1.isEosSignalledAndStopTimeReached(r2)
                if (r2 == 0) goto Ld
                goto Lf
            Ld:
                r2 = 0
                return r2
            Lf:
                r2 = 1
                return r2
        }

        private boolean isEosSignalledAndStopTimeReached(@androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r6) {
                r5 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r5.this$0
                boolean r1 = r0.mMediaCodecEosSignalled
                if (r1 == 0) goto L1a
                long r1 = r6.presentationTimeUs
                android.util.Range<java.lang.Long> r6 = r0.mStartStopTimeRangeUs
                java.lang.Comparable r6 = r6.getUpper()
                java.lang.Long r6 = (java.lang.Long) r6
                long r3 = r6.longValue()
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L1a
                r6 = 1
                return r6
            L1a:
                r6 = 0
                return r6
        }

        @androidx.annotation.NonNull
        private android.media.MediaCodec.BufferInfo resolveOutputBufferInfo(@androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r8) {
                r7 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r7.this$0
                long r4 = r0.getAdjustedTimeUs(r8)
                long r0 = r8.presentationTimeUs
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 != 0) goto Ld
                return r8
            Ld:
                long r0 = r7.mLastSentAdjustedTimeUs
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L15
                r0 = 1
                goto L16
            L15:
                r0 = 0
            L16:
                androidx.core.util.Preconditions.checkState(r0)
                android.media.MediaCodec$BufferInfo r1 = new android.media.MediaCodec$BufferInfo
                r1.<init>()
                int r2 = r8.offset
                int r3 = r8.size
                int r6 = r8.flags
                r1.set(r2, r3, r4, r6)
                return r1
        }

        private void sendEncodedData(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncodedDataImpl r4, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderCallback r5, @androidx.annotation.NonNull java.util.concurrent.Executor r6) {
                r3 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r3.this$0
                java.util.Set<androidx.camera.video.internal.encoder.EncodedDataImpl> r0 = r0.mEncodedDataSet
                r0.add(r4)
                com.google.common.util.concurrent.ListenableFuture r0 = r4.getClosedFuture()
                androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$1 r1 = new androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$1
                r1.<init>(r3, r4)
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r3.this$0
                java.util.concurrent.Executor r2 = r2.mEncoderExecutor
                androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r2)
                androidx.camera.video.internal.encoder.l0 r0 = new androidx.camera.video.internal.encoder.l0     // Catch: java.util.concurrent.RejectedExecutionException -> L20
                r0.<init>(r5, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L20
                r6.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L20
                return
            L20:
                r5 = move-exception
                androidx.camera.video.internal.encoder.EncoderImpl r6 = r3.this$0
                java.lang.String r6 = r6.mTag
                java.lang.String r0 = "Unable to post to the supplied executor."
                androidx.camera.core.Logger.e(r6, r0, r5)
                r4.close()
                return
        }

        private boolean updatePauseRangeStateAndCheckIfBufferPaused(@androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r7) {
                r6 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                long r1 = r7.presentationTimeUs
                r0.updateTotalPausedDuration(r1)
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                long r1 = r7.presentationTimeUs
                boolean r0 = r0.isInPauseRange(r1)
                boolean r1 = r6.mIsOutputBufferInPauseState
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L93
                if (r0 == 0) goto L93
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                java.lang.String r0 = r0.mTag
                java.lang.String r1 = "Switch to pause state"
                androidx.camera.core.Logger.d(r0, r1)
                r6.mIsOutputBufferInPauseState = r3
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                java.lang.Object r4 = r0.mLock
                monitor-enter(r4)
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0     // Catch: java.lang.Throwable -> L90
                java.util.concurrent.Executor r1 = r0.mEncoderCallbackExecutor     // Catch: java.lang.Throwable -> L90
                androidx.camera.video.internal.encoder.EncoderCallback r0 = r0.mEncoderCallback     // Catch: java.lang.Throwable -> L90
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L90
                java.util.Objects.requireNonNull(r0)
                androidx.camera.video.internal.encoder.o0 r4 = new androidx.camera.video.internal.encoder.o0
                r4.<init>(r0)
                r1.execute(r4)
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r0.mState
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r4 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED
                if (r1 != r4) goto L6f
                boolean r0 = r0.mIsVideoEncoder
                if (r0 != 0) goto L4e
                java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk> r0 = androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class
                androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
                if (r0 == 0) goto L4e
                goto L6f
            L4e:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                boolean r0 = r0.mIsVideoEncoder
                if (r0 == 0) goto L5d
                java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk> r0 = androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class
                androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
                if (r0 == 0) goto L5d
                goto L6f
            L5d:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                androidx.camera.video.internal.encoder.Encoder$EncoderInput r0 = r0.mEncoderInput
                boolean r1 = r0 instanceof androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput
                if (r1 == 0) goto L6a
                androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput r0 = (androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) r0
                r0.setActive(r2)
            L6a:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                r0.setMediaCodecPaused(r3)
            L6f:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                long r4 = r7.presentationTimeUs
                java.lang.Long r7 = java.lang.Long.valueOf(r4)
                r0.mLastDataStopTimestamp = r7
                androidx.camera.video.internal.encoder.EncoderImpl r7 = r6.this$0
                boolean r0 = r7.mPendingCodecStop
                if (r0 == 0) goto Lb0
                java.util.concurrent.Future<?> r7 = r7.mStopTimeoutFuture
                if (r7 == 0) goto L86
                r7.cancel(r3)
            L86:
                androidx.camera.video.internal.encoder.EncoderImpl r7 = r6.this$0
                r7.signalCodecStop()
                androidx.camera.video.internal.encoder.EncoderImpl r7 = r6.this$0
                r7.mPendingCodecStop = r2
                goto Lb0
            L90:
                r7 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L90
                throw r7
            L93:
                if (r1 == 0) goto Lb0
                if (r0 != 0) goto Lb0
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                java.lang.String r0 = r0.mTag
                java.lang.String r1 = "Switch to resume state"
                androidx.camera.core.Logger.d(r0, r1)
                r6.mIsOutputBufferInPauseState = r2
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r6.this$0
                boolean r0 = r0.mIsVideoEncoder
                if (r0 == 0) goto Lb0
                boolean r7 = androidx.camera.video.internal.encoder.EncoderImpl.isKeyFrame(r7)
                if (r7 != 0) goto Lb0
                r6.mIsKeyFrameRequired = r3
            Lb0:
                boolean r7 = r6.mIsOutputBufferInPauseState
                return r7
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(@androidx.annotation.NonNull android.media.MediaCodec r2, @androidx.annotation.NonNull android.media.MediaCodec.CodecException r3) {
                r1 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r1.this$0
                java.util.concurrent.Executor r2 = r2.mEncoderExecutor
                androidx.camera.video.internal.encoder.p0 r0 = new androidx.camera.video.internal.encoder.p0
                r0.<init>(r1, r3)
                r2.execute(r0)
                return
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(@androidx.annotation.NonNull android.media.MediaCodec r2, int r3) {
                r1 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r1.this$0
                java.util.concurrent.Executor r2 = r2.mEncoderExecutor
                androidx.camera.video.internal.encoder.f0 r0 = new androidx.camera.video.internal.encoder.f0
                r0.<init>(r1, r3)
                r2.execute(r0)
                return
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(@androidx.annotation.NonNull android.media.MediaCodec r3, int r4, @androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r5) {
                r2 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r2.this$0
                java.util.concurrent.Executor r0 = r0.mEncoderExecutor
                androidx.camera.video.internal.encoder.h0 r1 = new androidx.camera.video.internal.encoder.h0
                r1.<init>(r2, r5, r3, r4)
                r0.execute(r1)
                return
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(@androidx.annotation.NonNull android.media.MediaCodec r2, @androidx.annotation.NonNull android.media.MediaFormat r3) {
                r1 = this;
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r1.this$0
                java.util.concurrent.Executor r2 = r2.mEncoderExecutor
                androidx.camera.video.internal.encoder.g0 r0 = new androidx.camera.video.internal.encoder.g0
                r0.<init>(r1, r3)
                r2.execute(r0)
                return
        }

        void stop() {
                r1 = this;
                r0 = 1
                r1.mStopped = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    class SurfaceInput implements androidx.camera.video.internal.encoder.Encoder.SurfaceInput {
        private final java.lang.Object mLock;

        @androidx.annotation.GuardedBy("mLock")
        private final java.util.Set<android.view.Surface> mObsoleteSurfaces;

        @androidx.annotation.GuardedBy("mLock")
        private android.view.Surface mSurface;

        @androidx.annotation.GuardedBy("mLock")
        private java.util.concurrent.Executor mSurfaceUpdateExecutor;

        @androidx.annotation.GuardedBy("mLock")
        private androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener mSurfaceUpdateListener;
        final /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl this$0;

        SurfaceInput(androidx.camera.video.internal.encoder.EncoderImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r0.mLock = r1
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r0.mObsoleteSurfaces = r1
                return
        }

        public static /* synthetic */ void a(androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener r0, android.view.Surface r1) {
                r0.onSurfaceUpdate(r1)
                return
        }

        private void notifySurfaceUpdate(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener r3, @androidx.annotation.NonNull android.view.Surface r4) {
                r1 = this;
                androidx.camera.video.internal.encoder.q0 r0 = new androidx.camera.video.internal.encoder.q0     // Catch: java.util.concurrent.RejectedExecutionException -> L9
                r0.<init>(r3, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L9
                r2.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L9
                return
            L9:
                r2 = move-exception
                androidx.camera.video.internal.encoder.EncoderImpl r3 = r1.this$0
                java.lang.String r3 = r3.mTag
                java.lang.String r4 = "Unable to post to the supplied executor."
                androidx.camera.core.Logger.e(r3, r4, r2)
                return
        }

        void releaseSurface() {
                r4 = this;
                java.lang.Object r0 = r4.mLock
                monitor-enter(r0)
                android.view.Surface r1 = r4.mSurface     // Catch: java.lang.Throwable -> L2f
                r2 = 0
                r4.mSurface = r2     // Catch: java.lang.Throwable -> L2f
                java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L2f
                java.util.Set<android.view.Surface> r3 = r4.mObsoleteSurfaces     // Catch: java.lang.Throwable -> L2f
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L2f
                java.util.Set<android.view.Surface> r3 = r4.mObsoleteSurfaces     // Catch: java.lang.Throwable -> L2f
                r3.clear()     // Catch: java.lang.Throwable -> L2f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
                if (r1 == 0) goto L1a
                r1.release()
            L1a:
                java.util.Iterator r0 = r2.iterator()
            L1e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                android.view.Surface r1 = (android.view.Surface) r1
                r1.release()
                goto L1e
            L2e:
                return
            L2f:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
                throw r1
        }

        @android.annotation.SuppressLint({"NewApi"})
        void resetSurface() {
                r4 = this;
                java.lang.Class<androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk> r0 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.class
                androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
                androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk r0 = (androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk) r0
                java.lang.Object r1 = r4.mLock
                monitor-enter(r1)
                if (r0 != 0) goto L25
                android.view.Surface r0 = r4.mSurface     // Catch: java.lang.Throwable -> L18
                if (r0 != 0) goto L1a
                android.view.Surface r0 = androidx.camera.video.internal.encoder.EncoderImpl.Api23Impl.createPersistentInputSurface()     // Catch: java.lang.Throwable -> L18
                r4.mSurface = r0     // Catch: java.lang.Throwable -> L18
                goto L1b
            L18:
                r0 = move-exception
                goto L47
            L1a:
                r0 = 0
            L1b:
                androidx.camera.video.internal.encoder.EncoderImpl r2 = r4.this$0     // Catch: java.lang.Throwable -> L18
                android.media.MediaCodec r2 = r2.mMediaCodec     // Catch: java.lang.Throwable -> L18
                android.view.Surface r3 = r4.mSurface     // Catch: java.lang.Throwable -> L18
                androidx.camera.video.internal.encoder.EncoderImpl.Api23Impl.setInputSurface(r2, r3)     // Catch: java.lang.Throwable -> L18
                goto L38
            L25:
                android.view.Surface r0 = r4.mSurface     // Catch: java.lang.Throwable -> L18
                if (r0 == 0) goto L2e
                java.util.Set<android.view.Surface> r2 = r4.mObsoleteSurfaces     // Catch: java.lang.Throwable -> L18
                r2.add(r0)     // Catch: java.lang.Throwable -> L18
            L2e:
                androidx.camera.video.internal.encoder.EncoderImpl r0 = r4.this$0     // Catch: java.lang.Throwable -> L18
                android.media.MediaCodec r0 = r0.mMediaCodec     // Catch: java.lang.Throwable -> L18
                android.view.Surface r0 = r0.createInputSurface()     // Catch: java.lang.Throwable -> L18
                r4.mSurface = r0     // Catch: java.lang.Throwable -> L18
            L38:
                androidx.camera.video.internal.encoder.Encoder$SurfaceInput$OnSurfaceUpdateListener r2 = r4.mSurfaceUpdateListener     // Catch: java.lang.Throwable -> L18
                java.util.concurrent.Executor r3 = r4.mSurfaceUpdateExecutor     // Catch: java.lang.Throwable -> L18
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
                if (r0 == 0) goto L46
                if (r2 == 0) goto L46
                if (r3 == 0) goto L46
                r4.notifySurfaceUpdate(r3, r2, r0)
            L46:
                return
            L47:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
                throw r0
        }

        @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput
        public void setOnSurfaceUpdateListener(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener r4) {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L1c
                androidx.camera.video.internal.encoder.Encoder$SurfaceInput$OnSurfaceUpdateListener r1 = (androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener) r1     // Catch: java.lang.Throwable -> L1c
                r2.mSurfaceUpdateListener = r1     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L1c
                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1     // Catch: java.lang.Throwable -> L1c
                r2.mSurfaceUpdateExecutor = r1     // Catch: java.lang.Throwable -> L1c
                android.view.Surface r1 = r2.mSurface     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L1b
                r2.notifySurfaceUpdate(r3, r4, r1)
            L1b:
                return
            L1c:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                throw r3
        }
    }

    static {
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Range r0 = android.util.Range.create(r0, r0)
            androidx.camera.video.internal.encoder.EncoderImpl.NO_RANGE = r0
            return
    }

    public EncoderImpl(@androidx.annotation.NonNull java.util.concurrent.Executor r5, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderConfig r6) throws androidx.camera.video.internal.encoder.InvalidConfigException {
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.mLock = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r4.mFreeInputBufferIndexQueue = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r4.mAcquisitionQueue = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.mInputBufferSet = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.mEncodedDataSet = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r4.mActivePauseResumeTimeRanges = r0
            androidx.camera.video.internal.encoder.SystemTimeProvider r0 = new androidx.camera.video.internal.encoder.SystemTimeProvider
            r0.<init>()
            r4.mTimeProvider = r0
            androidx.camera.video.internal.encoder.EncoderCallback r0 = androidx.camera.video.internal.encoder.EncoderCallback.EMPTY
            r4.mEncoderCallback = r0
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r4.mEncoderCallbackExecutor = r0
            android.util.Range<java.lang.Long> r0 = androidx.camera.video.internal.encoder.EncoderImpl.NO_RANGE
            r4.mStartStopTimeRangeUs = r0
            r0 = 0
            r4.mTotalPausedDurationUs = r0
            r0 = 0
            r4.mPendingCodecStop = r0
            r1 = 0
            r4.mLastDataStopTimestamp = r1
            r4.mStopTimeoutFuture = r1
            r4.mMediaCodecCallback = r1
            r4.mIsFlushedAfterEndOfStream = r0
            r4.mSourceStoppedSignalled = r0
            r4.mMediaCodecEosSignalled = r0
            androidx.camera.video.internal.workaround.EncoderFinder r1 = new androidx.camera.video.internal.workaround.EncoderFinder
            r1.<init>()
            r4.mEncoderFinder = r1
            androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.core.util.Preconditions.checkNotNull(r6)
            java.util.concurrent.Executor r5 = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(r5)
            r4.mEncoderExecutor = r5
            boolean r5 = r6 instanceof androidx.camera.video.internal.encoder.AudioEncoderConfig
            if (r5 == 0) goto L7b
            java.lang.String r5 = "AudioEncoder"
            r4.mTag = r5
            r4.mIsVideoEncoder = r0
            androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput r5 = new androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput
            r5.<init>(r4)
            r4.mEncoderInput = r5
            goto L8d
        L7b:
            boolean r5 = r6 instanceof androidx.camera.video.internal.encoder.VideoEncoderConfig
            if (r5 == 0) goto L130
            java.lang.String r5 = "VideoEncoder"
            r4.mTag = r5
            r5 = 1
            r4.mIsVideoEncoder = r5
            androidx.camera.video.internal.encoder.EncoderImpl$SurfaceInput r5 = new androidx.camera.video.internal.encoder.EncoderImpl$SurfaceInput
            r5.<init>(r4)
            r4.mEncoderInput = r5
        L8d:
            androidx.camera.core.impl.Timebase r5 = r6.getInputTimebase()
            r4.mInputTimebase = r5
            java.lang.String r0 = r4.mTag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mInputTimebase = "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            androidx.camera.core.Logger.d(r0, r5)
            android.media.MediaFormat r5 = r6.toMediaFormat()
            r4.mMediaFormat = r5
            java.lang.String r0 = r4.mTag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mMediaFormat = "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            androidx.camera.core.Logger.d(r0, r2)
            android.media.MediaCodec r0 = r1.findEncoder(r5)
            r4.mMediaCodec = r0
            java.lang.String r1 = r4.mTag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Selected encoder: "
            r2.append(r3)
            java.lang.String r3 = r0.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.camera.core.Logger.i(r1, r2)
            boolean r1 = r4.mIsVideoEncoder
            android.media.MediaCodecInfo r0 = r0.getCodecInfo()
            java.lang.String r6 = r6.getMimeType()
            androidx.camera.video.internal.encoder.EncoderInfo r6 = createEncoderInfo(r1, r0, r6)
            r4.mEncoderInfo = r6
            boolean r0 = r4.mIsVideoEncoder
            if (r0 == 0) goto Lfe
            androidx.camera.video.internal.encoder.VideoEncoderInfo r6 = (androidx.camera.video.internal.encoder.VideoEncoderInfo) r6
            r4.clampVideoBitrateIfNotSupported(r6, r5)
        Lfe:
            r4.reset()     // Catch: android.media.MediaCodec.CodecException -> L129
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>()
            androidx.camera.video.internal.encoder.j r6 = new androidx.camera.video.internal.encoder.j
            r6.<init>(r5)
            com.google.common.util.concurrent.ListenableFuture r6 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r6)
            com.google.common.util.concurrent.ListenableFuture r6 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r6)
            r4.mReleasedFuture = r6
            java.lang.Object r5 = r5.get()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r5 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r5
            java.lang.Object r5 = androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r5 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r5
            r4.mReleasedCompleter = r5
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r5 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED
            r4.setState(r5)
            return
        L129:
            r5 = move-exception
            androidx.camera.video.internal.encoder.InvalidConfigException r6 = new androidx.camera.video.internal.encoder.InvalidConfigException
            r6.<init>(r5)
            throw r6
        L130:
            androidx.camera.video.internal.encoder.InvalidConfigException r5 = new androidx.camera.video.internal.encoder.InvalidConfigException
            java.lang.String r6 = "Unknown encoder config type"
            r5.<init>(r6)
            throw r5
    }

    public static /* synthetic */ void a(androidx.camera.video.internal.encoder.EncoderImpl r2) {
            boolean r0 = r2.mPendingCodecStop
            if (r0 == 0) goto L14
            java.lang.String r0 = r2.mTag
            java.lang.String r1 = "The data didn't reach the expected timestamp before timeout, stop the codec."
            androidx.camera.core.Logger.w(r0, r1)
            r0 = 0
            r2.mLastDataStopTimestamp = r0
            r2.signalCodecStop()
            r0 = 0
            r2.mPendingCodecStop = r0
        L14:
            return
    }

    public static /* synthetic */ void b(androidx.camera.video.internal.encoder.EncoderImpl r0, androidx.camera.video.internal.encoder.InputBufferImpl r1) {
            java.util.Set<androidx.camera.video.internal.encoder.InputBuffer> r0 = r0.mInputBufferSet
            r0.remove(r1)
            return
    }

    public static /* synthetic */ void c(androidx.camera.video.internal.encoder.EncoderImpl r2) {
            java.util.concurrent.Executor r0 = r2.mEncoderExecutor
            androidx.camera.video.internal.encoder.l r1 = new androidx.camera.video.internal.encoder.l
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    private void clampVideoBitrateIfNotSupported(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.VideoEncoderInfo r4, @androidx.annotation.NonNull android.media.MediaFormat r5) {
            r3 = this;
            boolean r0 = r3.mIsVideoEncoder
            androidx.core.util.Preconditions.checkState(r0)
            java.lang.String r0 = "bitrate"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L46
            int r1 = r5.getInteger(r0)
            android.util.Range r4 = r4.getSupportedBitrateRange()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Comparable r4 = r4.clamp(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r1 == r4) goto L46
            r5.setInteger(r0, r4)
            java.lang.String r5 = r3.mTag
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "updated bitrate from "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            androidx.camera.core.Logger.d(r5, r4)
        L46:
            return
    }

    @androidx.annotation.NonNull
    private static androidx.camera.video.internal.encoder.EncoderInfo createEncoderInfo(boolean r0, @androidx.annotation.NonNull android.media.MediaCodecInfo r1, @androidx.annotation.NonNull java.lang.String r2) throws androidx.camera.video.internal.encoder.InvalidConfigException {
            if (r0 == 0) goto L8
            androidx.camera.video.internal.encoder.VideoEncoderInfoImpl r0 = new androidx.camera.video.internal.encoder.VideoEncoderInfoImpl
            r0.<init>(r1, r2)
            return r0
        L8:
            androidx.camera.video.internal.encoder.AudioEncoderInfoImpl r0 = new androidx.camera.video.internal.encoder.AudioEncoderInfoImpl
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ void d(androidx.camera.video.internal.encoder.EncoderImpl r2, java.util.List r3, java.lang.Runnable r4) {
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r2.mState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR
            if (r0 == r1) goto L2b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L13
            java.lang.String r3 = r2.mTag
            java.lang.String r0 = "encoded data and input buffers are returned"
            androidx.camera.core.Logger.d(r3, r0)
        L13:
            androidx.camera.video.internal.encoder.Encoder$EncoderInput r3 = r2.mEncoderInput
            boolean r3 = r3 instanceof androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput
            if (r3 == 0) goto L26
            boolean r3 = r2.mSourceStoppedSignalled
            if (r3 != 0) goto L26
            android.media.MediaCodec r3 = r2.mMediaCodec
            r3.flush()
            r3 = 1
            r2.mIsFlushedAfterEndOfStream = r3
            goto L2b
        L26:
            android.media.MediaCodec r3 = r2.mMediaCodec
            r3.stop()
        L2b:
            if (r4 == 0) goto L30
            r4.run()
        L30:
            r2.handleStopped()
            return
    }

    public static /* synthetic */ void e(androidx.camera.video.internal.encoder.EncoderImpl r2) {
            r2.getClass()
            int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r2.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            if (r0 == r1) goto L20
            r2 = 7
            if (r0 == r2) goto L18
            r2 = 9
            if (r0 == r2) goto L18
            return
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Encoder is released"
            r2.<init>(r0)
            throw r2
        L20:
            r2.requestKeyFrameToMediaCodec()
            return
    }

    public static /* synthetic */ void f(androidx.camera.video.internal.encoder.EncoderImpl r0, int r1, java.lang.String r2, java.lang.Throwable r3) {
            r0.notifyError(r1, r2, r3)
            return
    }

    public static /* synthetic */ void g(androidx.camera.video.internal.encoder.EncoderImpl r3, long r4) {
            r3.getClass()
            int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r3.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L6c;
                case 2: goto L37;
                case 3: goto L6c;
                case 4: goto L6c;
                case 5: goto L6c;
                case 6: goto L31;
                case 7: goto L29;
                case 8: goto L6c;
                case 9: goto L29;
                default: goto L10;
            }
        L10:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unknown state: "
            r5.append(r0)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r3 = r3.mState
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Encoder is released"
            r3.<init>(r4)
            throw r3
        L31:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r4 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED
            r3.setState(r4)
            return
        L37:
            java.lang.String r0 = r3.mTag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pause on "
            r1.append(r2)
            java.lang.String r2 = androidx.camera.video.internal.DebugUtils.readableUs(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.camera.core.Logger.d(r0, r1)
            java.util.Deque<android.util.Range<java.lang.Long>> r0 = r3.mActivePauseResumeTimeRanges
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            android.util.Range r4 = android.util.Range.create(r4, r5)
            r0.addLast(r4)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r4 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED
            r3.setState(r4)
        L6c:
            return
    }

    public static /* synthetic */ void h(androidx.camera.video.internal.encoder.EncoderCallback r1, int r2, java.lang.String r3, java.lang.Throwable r4) {
            androidx.camera.video.internal.encoder.EncodeException r0 = new androidx.camera.video.internal.encoder.EncodeException
            r0.<init>(r2, r3, r4)
            r1.onEncodeError(r0)
            return
    }

    static boolean hasEndOfStreamFlag(@androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r0) {
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static /* synthetic */ void i(androidx.camera.video.internal.encoder.EncoderImpl r0) {
            r0.signalEndOfInputStream()
            return
    }

    static boolean isKeyFrame(@androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r1) {
            int r1 = r1.flags
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    public static /* synthetic */ void j(androidx.camera.video.internal.encoder.EncoderImpl r1) {
            r0 = 1
            r1.mSourceStoppedSignalled = r0
            boolean r0 = r1.mIsFlushedAfterEndOfStream
            if (r0 == 0) goto Lf
            android.media.MediaCodec r0 = r1.mMediaCodec
            r0.stop()
            r1.reset()
        Lf:
            return
    }

    public static /* synthetic */ void k(androidx.camera.video.internal.encoder.EncoderImpl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            java.util.Queue<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.video.internal.encoder.InputBuffer>> r0 = r0.mAcquisitionQueue
            r0.remove(r1)
            return
    }

    public static /* synthetic */ void l(androidx.camera.video.internal.encoder.EncoderImpl r7, long r8, long r10) {
            r7.getClass()
            int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r7.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Lc1;
                case 2: goto L37;
                case 3: goto L37;
                case 4: goto Lc1;
                case 5: goto L31;
                case 6: goto L31;
                case 7: goto L29;
                case 8: goto Lc1;
                case 9: goto L29;
                default: goto L10;
            }
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unknown state: "
            r9.append(r10)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r7 = r7.mState
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Encoder is released"
            r7.<init>(r8)
            throw r7
        L31:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r8 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED
            r7.setState(r8)
            return
        L37:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r7.mState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STOPPING
            r7.setState(r1)
            android.util.Range<java.lang.Long> r1 = r7.mStartStopTimeRangeUs
            java.lang.Comparable r1 = r1.getLower()
            java.lang.Long r1 = (java.lang.Long) r1
            long r2 = r1.longValue()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto Lb9
            r4 = -1
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 != 0) goto L5a
            goto L65
        L5a:
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L66
            java.lang.String r8 = r7.mTag
            java.lang.String r9 = "The expected stop time is less than the start time. Use current time as stop time."
            androidx.camera.core.Logger.w(r8, r9)
        L65:
            r8 = r10
        L66:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 < 0) goto Lb1
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            android.util.Range r10 = android.util.Range.create(r1, r10)
            r7.mStartStopTimeRangeUs = r10
            java.lang.String r10 = r7.mTag
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Stop on "
            r11.append(r1)
            java.lang.String r8 = androidx.camera.video.internal.DebugUtils.readableUs(r8)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            androidx.camera.core.Logger.d(r10, r8)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r8 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED
            if (r0 != r8) goto L9a
            java.lang.Long r8 = r7.mLastDataStopTimestamp
            if (r8 == 0) goto L9a
            r7.signalCodecStop()
            return
        L9a:
            r8 = 1
            r7.mPendingCodecStop = r8
            java.util.concurrent.ScheduledExecutorService r8 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.video.internal.encoder.s r9 = new androidx.camera.video.internal.encoder.s
            r9.<init>(r7)
            r10 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r8 = r8.schedule(r9, r10, r0)
            r7.mStopTimeoutFuture = r8
            return
        Lb1:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "The start time should be before the stop time."
            r7.<init>(r8)
            throw r7
        Lb9:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "There should be a \"start\" before \"stop\""
            r7.<init>(r8)
            throw r7
        Lc1:
            return
    }

    public static /* synthetic */ void m(androidx.camera.video.internal.encoder.EncoderImpl r8, long r9) {
            r8.getClass()
            int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r8.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r4 = 1
            switch(r0) {
                case 1: goto Ld4;
                case 2: goto Ld3;
                case 3: goto L3e;
                case 4: goto L38;
                case 5: goto L38;
                case 6: goto Ld3;
                case 7: goto L30;
                case 8: goto Ld3;
                case 9: goto L30;
                default: goto L17;
            }
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Unknown state: "
            r10.append(r0)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r8 = r8.mState
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Encoder is released"
            r8.<init>(r9)
            throw r8
        L38:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r9 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START
            r8.setState(r9)
            return
        L3e:
            r8.mLastDataStopTimestamp = r3
            java.util.Deque<android.util.Range<java.lang.Long>> r0 = r8.mActivePauseResumeTimeRanges
            java.lang.Object r0 = r0.removeLast()
            android.util.Range r0 = (android.util.Range) r0
            r3 = 0
            if (r0 == 0) goto L5b
            java.lang.Comparable r5 = r0.getUpper()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L5b
            r1 = 1
            goto L5c
        L5b:
            r1 = 0
        L5c:
            java.lang.String r2 = "There should be a \"pause\" before \"resume\""
            androidx.core.util.Preconditions.checkState(r1, r2)
            java.lang.Comparable r0 = r0.getLower()
            java.lang.Long r0 = (java.lang.Long) r0
            long r1 = r0.longValue()
            java.util.Deque<android.util.Range<java.lang.Long>> r5 = r8.mActivePauseResumeTimeRanges
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            android.util.Range r0 = android.util.Range.create(r0, r6)
            r5.addLast(r0)
            java.lang.String r0 = r8.mTag
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Resume on "
            r5.append(r6)
            java.lang.String r6 = androidx.camera.video.internal.DebugUtils.readableUs(r9)
            r5.append(r6)
            java.lang.String r6 = "\nPaused duration = "
            r5.append(r6)
            long r9 = r9 - r1
            java.lang.String r9 = androidx.camera.video.internal.DebugUtils.readableUs(r9)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            androidx.camera.core.Logger.d(r0, r9)
            boolean r9 = r8.mIsVideoEncoder
            if (r9 != 0) goto Lac
            java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk> r9 = androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class
            androidx.camera.core.impl.Quirk r9 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r9)
            if (r9 == 0) goto Lac
            goto Lc7
        Lac:
            boolean r9 = r8.mIsVideoEncoder
            if (r9 == 0) goto Lb9
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk> r9 = androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class
            androidx.camera.core.impl.Quirk r9 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r9)
            if (r9 == 0) goto Lb9
            goto Lc7
        Lb9:
            r8.setMediaCodecPaused(r3)
            androidx.camera.video.internal.encoder.Encoder$EncoderInput r9 = r8.mEncoderInput
            boolean r10 = r9 instanceof androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput
            if (r10 == 0) goto Lc7
            androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput r9 = (androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) r9
            r9.setActive(r4)
        Lc7:
            boolean r9 = r8.mIsVideoEncoder
            if (r9 == 0) goto Lce
            r8.requestKeyFrameToMediaCodec()
        Lce:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r9 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STARTED
            r8.setState(r9)
        Ld3:
            return
        Ld4:
            r8.mLastDataStopTimestamp = r3
            java.lang.String r0 = r8.mTag
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Start on "
            r3.append(r5)
            java.lang.String r5 = androidx.camera.video.internal.DebugUtils.readableUs(r9)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            androidx.camera.core.Logger.d(r0, r3)
            boolean r0 = r8.mIsFlushedAfterEndOfStream     // Catch: android.media.MediaCodec.CodecException -> Lf8
            if (r0 == 0) goto Lfa
            r8.reset()     // Catch: android.media.MediaCodec.CodecException -> Lf8
            goto Lfa
        Lf8:
            r9 = move-exception
            goto L11e
        Lfa:
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: android.media.MediaCodec.CodecException -> Lf8
            java.lang.Long r10 = java.lang.Long.valueOf(r1)     // Catch: android.media.MediaCodec.CodecException -> Lf8
            android.util.Range r9 = android.util.Range.create(r9, r10)     // Catch: android.media.MediaCodec.CodecException -> Lf8
            r8.mStartStopTimeRangeUs = r9     // Catch: android.media.MediaCodec.CodecException -> Lf8
            android.media.MediaCodec r9 = r8.mMediaCodec     // Catch: android.media.MediaCodec.CodecException -> Lf8
            r9.start()     // Catch: android.media.MediaCodec.CodecException -> Lf8
            androidx.camera.video.internal.encoder.Encoder$EncoderInput r9 = r8.mEncoderInput
            boolean r10 = r9 instanceof androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput
            if (r10 == 0) goto L118
            androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput r9 = (androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) r9
            r9.setActive(r4)
        L118:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r9 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STARTED
            r8.setState(r9)
            return
        L11e:
            r8.handleEncodeError(r9)
            return
    }

    public static /* synthetic */ java.lang.Object n(java.util.concurrent.atomic.AtomicReference r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.set(r1)
            java.lang.String r0 = "mReleasedFuture"
            return r0
    }

    public static /* synthetic */ java.lang.Object o(java.util.concurrent.atomic.AtomicReference r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.set(r1)
            java.lang.String r0 = "acquireInputBuffer"
            return r0
    }

    public static /* synthetic */ void p(androidx.camera.video.internal.encoder.EncoderImpl r3) {
            r3.getClass()
            int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r3.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L30;
                case 2: goto L30;
                case 3: goto L30;
                case 4: goto L2a;
                case 5: goto L2a;
                case 6: goto L2a;
                case 7: goto L29;
                case 8: goto L30;
                case 9: goto L29;
                default: goto L10;
            }
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown state: "
            r1.append(r2)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r3 = r3.mState
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L29:
            return
        L2a:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_RELEASE
            r3.setState(r0)
            return
        L30:
            r3.releaseInternal()
            return
    }

    private void releaseInternal() {
            r2 = this;
            boolean r0 = r2.mIsFlushedAfterEndOfStream
            if (r0 == 0) goto Lc
            android.media.MediaCodec r0 = r2.mMediaCodec
            r0.stop()
            r0 = 0
            r2.mIsFlushedAfterEndOfStream = r0
        Lc:
            android.media.MediaCodec r0 = r2.mMediaCodec
            r0.release()
            androidx.camera.video.internal.encoder.Encoder$EncoderInput r0 = r2.mEncoderInput
            boolean r1 = r0 instanceof androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput
            if (r1 == 0) goto L1c
            androidx.camera.video.internal.encoder.EncoderImpl$SurfaceInput r0 = (androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput) r0
            r0.releaseSurface()
        L1c:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.RELEASED
            r2.setState(r0)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mReleasedCompleter
            r1 = 0
            r0.set(r1)
            return
    }

    private void reset() {
            r4 = this;
            android.util.Range<java.lang.Long> r0 = androidx.camera.video.internal.encoder.EncoderImpl.NO_RANGE
            r4.mStartStopTimeRangeUs = r0
            r0 = 0
            r4.mTotalPausedDurationUs = r0
            java.util.Deque<android.util.Range<java.lang.Long>> r0 = r4.mActivePauseResumeTimeRanges
            r0.clear()
            java.util.Queue<java.lang.Integer> r0 = r4.mFreeInputBufferIndexQueue
            r0.clear()
            java.util.Queue<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.video.internal.encoder.InputBuffer>> r0 = r4.mAcquisitionQueue
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r1 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r1
            r1.setCancelled()
            goto L18
        L28:
            java.util.Queue<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.video.internal.encoder.InputBuffer>> r0 = r4.mAcquisitionQueue
            r0.clear()
            android.media.MediaCodec r0 = r4.mMediaCodec
            r0.reset()
            r0 = 0
            r4.mIsFlushedAfterEndOfStream = r0
            r4.mSourceStoppedSignalled = r0
            r4.mMediaCodecEosSignalled = r0
            r4.mPendingCodecStop = r0
            java.util.concurrent.Future<?> r0 = r4.mStopTimeoutFuture
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L46
            r0.cancel(r1)
            r4.mStopTimeoutFuture = r2
        L46:
            androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback r0 = r4.mMediaCodecCallback
            if (r0 == 0) goto L4d
            r0.stop()
        L4d:
            androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback r0 = new androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback
            r0.<init>(r4)
            r4.mMediaCodecCallback = r0
            android.media.MediaCodec r3 = r4.mMediaCodec
            r3.setCallback(r0)
            android.media.MediaCodec r0 = r4.mMediaCodec
            android.media.MediaFormat r3 = r4.mMediaFormat
            r0.configure(r3, r2, r2, r1)
            androidx.camera.video.internal.encoder.Encoder$EncoderInput r0 = r4.mEncoderInput
            boolean r1 = r0 instanceof androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput
            if (r1 == 0) goto L6b
            androidx.camera.video.internal.encoder.EncoderImpl$SurfaceInput r0 = (androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput) r0
            r0.resetSurface()
        L6b:
            return
    }

    private void setState(androidx.camera.video.internal.encoder.EncoderImpl.InternalState r4) {
            r3 = this;
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r3.mState
            if (r0 != r4) goto L5
            return
        L5:
            java.lang.String r0 = r3.mTag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Transitioning encoder internal state: "
            r1.append(r2)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r2 = r3.mState
            r1.append(r2)
            java.lang.String r2 = " --> "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.camera.core.Logger.d(r0, r1)
            r3.mState = r4
            return
    }

    private void signalEndOfInputStream() {
            r3 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r3.acquireInputBuffer()
            androidx.camera.video.internal.encoder.EncoderImpl$1 r1 = new androidx.camera.video.internal.encoder.EncoderImpl$1
            r1.<init>(r3)
            java.util.concurrent.Executor r2 = r3.mEncoderExecutor
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r2)
            return
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer> acquireInputBuffer() {
            r4 = this;
            int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r4.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L6b;
                case 2: goto L3e;
                case 3: goto L3e;
                case 4: goto L3e;
                case 5: goto L3e;
                case 6: goto L3e;
                case 7: goto L3e;
                case 8: goto L32;
                case 9: goto L26;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown state: "
            r1.append(r2)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r2 = r4.mState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Encoder is released."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r0)
            return r0
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Encoder is in error state."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r0)
            return r0
        L3e:
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            androidx.camera.video.internal.encoder.g r1 = new androidx.camera.video.internal.encoder.g
            r1.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)
            java.lang.Object r0 = r0.get()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
            java.util.Queue<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.video.internal.encoder.InputBuffer>> r2 = r4.mAcquisitionQueue
            r2.offer(r0)
            androidx.camera.video.internal.encoder.h r2 = new androidx.camera.video.internal.encoder.h
            r2.<init>(r4, r0)
            java.util.concurrent.Executor r3 = r4.mEncoderExecutor
            r0.addCancellationListener(r2, r3)
            r4.matchAcquisitionsAndFreeBufferIndexes()
            return r1
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Encoder is not started yet."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r0)
            return r0
    }

    long generatePresentationTimeUs() {
            r2 = this;
            androidx.camera.video.internal.encoder.TimeProvider r0 = r2.mTimeProvider
            long r0 = r0.uptimeUs()
            return r0
    }

    long getAdjustedTimeUs(@androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r6) {
            r5 = this;
            long r0 = r5.mTotalPausedDurationUs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lc
            long r2 = r6.presentationTimeUs
            long r2 = r2 - r0
            return r2
        Lc:
            long r0 = r6.presentationTimeUs
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public int getConfiguredBitrate() {
            r2 = this;
            android.media.MediaFormat r0 = r2.mMediaFormat
            java.lang.String r1 = "bitrate"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L11
            android.media.MediaFormat r0 = r2.mMediaFormat
            int r0 = r0.getInteger(r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @androidx.annotation.NonNull
    public androidx.camera.video.internal.encoder.EncoderInfo getEncoderInfo() {
            r1 = this;
            androidx.camera.video.internal.encoder.EncoderInfo r0 = r1.mEncoderInfo
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @androidx.annotation.NonNull
    public androidx.camera.video.internal.encoder.Encoder.EncoderInput getInput() {
            r1 = this;
            androidx.camera.video.internal.encoder.Encoder$EncoderInput r0 = r1.mEncoderInput
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getReleasedFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mReleasedFuture
            return r0
    }

    void handleEncodeError(int r4, @androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable java.lang.Throwable r6) {
            r3 = this;
            int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r3.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L40;
                case 2: goto L32;
                case 3: goto L32;
                case 4: goto L32;
                case 5: goto L32;
                case 6: goto L32;
                case 7: goto L32;
                case 8: goto Le;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            java.lang.String r0 = r3.mTag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Get more than one error: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "("
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            androidx.camera.core.Logger.w(r0, r4, r6)
            return
        L32:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR
            r3.setState(r0)
            androidx.camera.video.internal.encoder.q r0 = new androidx.camera.video.internal.encoder.q
            r0.<init>(r3, r4, r5, r6)
            r3.stopMediaCodec(r0)
            return
        L40:
            r3.notifyError(r4, r5, r6)
            r3.reset()
            return
    }

    void handleEncodeError(@androidx.annotation.NonNull android.media.MediaCodec.CodecException r3) {
            r2 = this;
            r0 = 1
            java.lang.String r1 = r3.getMessage()
            r2.handleEncodeError(r0, r1, r3)
            return
    }

    void handleStopped() {
            r2 = this;
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r2.mState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_RELEASE
            if (r0 != r1) goto La
            r2.releaseInternal()
            return
        La:
            boolean r1 = r2.mIsFlushedAfterEndOfStream
            if (r1 != 0) goto L11
            r2.reset()
        L11:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED
            r2.setState(r1)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START
            if (r0 == r1) goto L1e
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED
            if (r0 != r1) goto L28
        L1e:
            r2.start()
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED
            if (r0 != r1) goto L28
            r2.pause()
        L28:
            return
    }

    boolean isInPauseRange(long r6) {
            r5 = this;
            java.util.Deque<android.util.Range<java.lang.Long>> r0 = r5.mActivePauseResumeTimeRanges
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            android.util.Range r1 = (android.util.Range) r1
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L1f
            r6 = 1
            return r6
        L1f:
            java.lang.Comparable r1 = r1.getLower()
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 >= 0) goto L6
        L2d:
            return r2
    }

    void matchAcquisitionsAndFreeBufferIndexes() {
            r4 = this;
        L0:
            java.util.Queue<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.video.internal.encoder.InputBuffer>> r0 = r4.mAcquisitionQueue
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L53
            java.util.Queue<java.lang.Integer> r0 = r4.mFreeInputBufferIndexQueue
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L53
            java.util.Queue<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.video.internal.encoder.InputBuffer>> r0 = r4.mAcquisitionQueue
            java.lang.Object r0 = r0.poll()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
            java.util.Objects.requireNonNull(r0)
            java.util.Queue<java.lang.Integer> r1 = r4.mFreeInputBufferIndexQueue
            java.lang.Object r1 = r1.poll()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.Objects.requireNonNull(r1)
            int r1 = r1.intValue()
            androidx.camera.video.internal.encoder.InputBufferImpl r2 = new androidx.camera.video.internal.encoder.InputBufferImpl     // Catch: android.media.MediaCodec.CodecException -> L4f
            android.media.MediaCodec r3 = r4.mMediaCodec     // Catch: android.media.MediaCodec.CodecException -> L4f
            r2.<init>(r3, r1)     // Catch: android.media.MediaCodec.CodecException -> L4f
            boolean r0 = r0.set(r2)
            if (r0 == 0) goto L4b
            java.util.Set<androidx.camera.video.internal.encoder.InputBuffer> r0 = r4.mInputBufferSet
            r0.add(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r2.getTerminationFuture()
            androidx.camera.video.internal.encoder.i r1 = new androidx.camera.video.internal.encoder.i
            r1.<init>(r4, r2)
            java.util.concurrent.Executor r2 = r4.mEncoderExecutor
            r0.addListener(r1, r2)
            goto L0
        L4b:
            r2.cancel()
            goto L0
        L4f:
            r0 = move-exception
            r4.handleEncodeError(r0)
        L53:
            return
    }

    void notifyError(int r4, @androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable java.lang.Throwable r6) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.video.internal.encoder.EncoderCallback r1 = r3.mEncoderCallback     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.Executor r2 = r3.mEncoderCallbackExecutor     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            androidx.camera.video.internal.encoder.d r0 = new androidx.camera.video.internal.encoder.d     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            r0.<init>(r1, r4, r5, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            r2.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            return
        L11:
            r4 = move-exception
            java.lang.String r5 = r3.mTag
            java.lang.String r6 = "Unable to post to the supplied executor."
            androidx.camera.core.Logger.e(r5, r6, r4)
            return
        L1a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void pause() {
            r4 = this;
            long r0 = r4.generatePresentationTimeUs()
            java.util.concurrent.Executor r2 = r4.mEncoderExecutor
            androidx.camera.video.internal.encoder.k r3 = new androidx.camera.video.internal.encoder.k
            r3.<init>(r4, r0)
            r2.execute(r3)
            return
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void release() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mEncoderExecutor
            androidx.camera.video.internal.encoder.m r1 = new androidx.camera.video.internal.encoder.m
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void requestKeyFrame() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mEncoderExecutor
            androidx.camera.video.internal.encoder.n r1 = new androidx.camera.video.internal.encoder.n
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    void requestKeyFrameToMediaCodec() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "request-sync"
            r2 = 0
            r0.putInt(r1, r2)
            android.media.MediaCodec r1 = r3.mMediaCodec
            r1.setParameters(r0)
            return
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void setEncoderCallback(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderCallback r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.mEncoderCallback = r2     // Catch: java.lang.Throwable -> L9
            r1.mEncoderCallbackExecutor = r3     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    void setMediaCodecPaused(boolean r3) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "drop-input-frames"
            r0.putInt(r1, r3)
            android.media.MediaCodec r3 = r2.mMediaCodec
            r3.setParameters(r0)
            return
    }

    void signalCodecStop() {
            r3 = this;
            androidx.camera.video.internal.encoder.Encoder$EncoderInput r0 = r3.mEncoderInput
            boolean r1 = r0 instanceof androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput
            if (r1 == 0) goto L3a
            androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput r0 = (androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) r0
            r1 = 0
            r0.setActive(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set<androidx.camera.video.internal.encoder.InputBuffer> r1 = r3.mInputBufferSet
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            androidx.camera.video.internal.encoder.InputBuffer r2 = (androidx.camera.video.internal.encoder.InputBuffer) r2
            com.google.common.util.concurrent.ListenableFuture r2 = r2.getTerminationFuture()
            r0.add(r2)
            goto L17
        L2b:
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.successfulAsList(r0)
            androidx.camera.video.internal.encoder.r r1 = new androidx.camera.video.internal.encoder.r
            r1.<init>(r3)
            java.util.concurrent.Executor r2 = r3.mEncoderExecutor
            r0.addListener(r1, r2)
            return
        L3a:
            boolean r0 = r0 instanceof androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput
            if (r0 == 0) goto L4b
            android.media.MediaCodec r0 = r3.mMediaCodec     // Catch: android.media.MediaCodec.CodecException -> L47
            r0.signalEndOfInputStream()     // Catch: android.media.MediaCodec.CodecException -> L47
            r0 = 1
            r3.mMediaCodecEosSignalled = r0     // Catch: android.media.MediaCodec.CodecException -> L47
            return
        L47:
            r0 = move-exception
            r3.handleEncodeError(r0)
        L4b:
            return
    }

    public void signalSourceStopped() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mEncoderExecutor
            androidx.camera.video.internal.encoder.o r1 = new androidx.camera.video.internal.encoder.o
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void start() {
            r4 = this;
            long r0 = r4.generatePresentationTimeUs()
            java.util.concurrent.Executor r2 = r4.mEncoderExecutor
            androidx.camera.video.internal.encoder.e r3 = new androidx.camera.video.internal.encoder.e
            r3.<init>(r4, r0)
            r2.execute(r3)
            return
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop() {
            r2 = this;
            r0 = -1
            r2.stop(r0)
            return
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop(long r8) {
            r7 = this;
            long r4 = r7.generatePresentationTimeUs()
            java.util.concurrent.Executor r6 = r7.mEncoderExecutor
            androidx.camera.video.internal.encoder.f r0 = new androidx.camera.video.internal.encoder.f
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r4)
            r6.execute(r0)
            return
    }

    void stopMediaCodec(@androidx.annotation.Nullable java.lang.Runnable r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set<androidx.camera.video.internal.encoder.EncodedDataImpl> r1 = r4.mEncodedDataSet
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            androidx.camera.video.internal.encoder.EncodedDataImpl r2 = (androidx.camera.video.internal.encoder.EncodedDataImpl) r2
            com.google.common.util.concurrent.ListenableFuture r2 = r2.getClosedFuture()
            r0.add(r2)
            goto Lb
        L1f:
            java.util.Set<androidx.camera.video.internal.encoder.InputBuffer> r1 = r4.mInputBufferSet
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            androidx.camera.video.internal.encoder.InputBuffer r2 = (androidx.camera.video.internal.encoder.InputBuffer) r2
            com.google.common.util.concurrent.ListenableFuture r2 = r2.getTerminationFuture()
            r0.add(r2)
            goto L25
        L39:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L69
            java.lang.String r1 = r4.mTag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Waiting for resources to return. encoded data = "
            r2.append(r3)
            java.util.Set<androidx.camera.video.internal.encoder.EncodedDataImpl> r3 = r4.mEncodedDataSet
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = ", input buffers = "
            r2.append(r3)
            java.util.Set<androidx.camera.video.internal.encoder.InputBuffer> r3 = r4.mInputBufferSet
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.camera.core.Logger.d(r1, r2)
        L69:
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.successfulAsList(r0)
            androidx.camera.video.internal.encoder.p r2 = new androidx.camera.video.internal.encoder.p
            r2.<init>(r4, r0, r5)
            java.util.concurrent.Executor r5 = r4.mEncoderExecutor
            r1.addListener(r2, r5)
            return
    }

    void updateTotalPausedDuration(long r8) {
            r7 = this;
        L0:
            java.util.Deque<android.util.Range<java.lang.Long>> r0 = r7.mActivePauseResumeTimeRanges
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5a
            java.util.Deque<android.util.Range<java.lang.Long>> r0 = r7.mActivePauseResumeTimeRanges
            java.lang.Object r0 = r0.getFirst()
            android.util.Range r0 = (android.util.Range) r0
            java.lang.Comparable r1 = r0.getUpper()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 <= 0) goto L5a
            java.util.Deque<android.util.Range<java.lang.Long>> r1 = r7.mActivePauseResumeTimeRanges
            r1.removeFirst()
            long r1 = r7.mTotalPausedDurationUs
            java.lang.Comparable r3 = r0.getUpper()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            java.lang.Comparable r0 = r0.getLower()
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            long r3 = r3 - r5
            long r1 = r1 + r3
            r7.mTotalPausedDurationUs = r1
            java.lang.String r0 = r7.mTag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Total paused duration = "
            r1.append(r2)
            long r2 = r7.mTotalPausedDurationUs
            java.lang.String r2 = androidx.camera.video.internal.DebugUtils.readableUs(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.camera.core.Logger.d(r0, r1)
            goto L0
        L5a:
            return
    }
}
