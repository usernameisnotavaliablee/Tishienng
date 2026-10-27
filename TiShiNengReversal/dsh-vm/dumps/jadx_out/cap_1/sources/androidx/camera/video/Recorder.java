package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Recorder implements androidx.camera.video.VideoOutput {
    private static final int AUDIO_CACHE_SIZE = 60;
    private static final java.util.concurrent.Executor AUDIO_EXECUTOR = null;

    @androidx.annotation.VisibleForTesting
    static final androidx.camera.video.internal.encoder.EncoderFactory DEFAULT_ENCODER_FACTORY = null;
    public static final androidx.camera.video.QualitySelector DEFAULT_QUALITY_SELECTOR = null;
    private static final java.lang.String MEDIA_COLUMN = "_data";
    private static final androidx.camera.video.MediaSpec MEDIA_SPEC_DEFAULT = null;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final java.lang.Exception PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = null;
    private static final java.util.Set<androidx.camera.video.Recorder.State> PENDING_STATES = null;
    private static final long SOURCE_NON_STREAMING_TIMEOUT_MS = 1000;
    private static final java.lang.String TAG = "Recorder";
    private static final java.util.Set<androidx.camera.video.Recorder.State> VALID_NON_PENDING_STATES_WHILE_PENDING = null;
    private static final androidx.camera.video.VideoSpec VIDEO_SPEC_DEFAULT = null;

    @androidx.annotation.GuardedBy("mLock")
    androidx.camera.video.Recorder.RecordingRecord mActiveRecordingRecord;
    android.view.Surface mActiveSurface;
    double mAudioAmplitude;
    androidx.camera.video.internal.encoder.Encoder mAudioEncoder;
    private final androidx.camera.video.internal.encoder.EncoderFactory mAudioEncoderFactory;
    java.lang.Throwable mAudioErrorCause;
    androidx.camera.video.internal.encoder.OutputConfig mAudioOutputConfig;
    androidx.camera.video.internal.audio.AudioSource mAudioSource;
    androidx.camera.video.Recorder.AudioState mAudioState;
    java.lang.Integer mAudioTrackIndex;
    long mDurationLimitNs;
    private final boolean mEncoderNotUsePersistentInputSurface;
    final java.util.List<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> mEncodingFutures;
    private final java.util.concurrent.Executor mExecutor;
    long mFileSizeLimitInBytes;

    @androidx.annotation.VisibleForTesting
    long mFirstRecordingAudioDataTimeUs;

    @androidx.annotation.VisibleForTesting
    int mFirstRecordingVideoBitrate;

    @androidx.annotation.VisibleForTesting
    long mFirstRecordingVideoDataTimeUs;
    androidx.camera.video.Recorder.RecordingRecord mInProgressRecording;
    boolean mInProgressRecordingStopping;

    @androidx.annotation.Nullable
    private androidx.camera.core.SurfaceRequest.TransformationInfo mInProgressTransformationInfo;
    boolean mIsAudioSourceSilenced;

    @androidx.annotation.GuardedBy("mLock")
    private long mLastGeneratedRecordingId;
    android.view.Surface mLatestSurface;
    androidx.camera.core.SurfaceRequest mLatestSurfaceRequest;
    private final java.lang.Object mLock;
    android.media.MediaMuxer mMediaMuxer;
    final androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> mMediaSpec;
    private boolean mNeedsResetBeforeNextStart;

    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.video.Recorder.State mNonPendingState;

    @androidx.annotation.NonNull
    android.net.Uri mOutputUri;

    @androidx.annotation.NonNull
    final androidx.camera.core.internal.utils.RingBuffer<androidx.camera.video.internal.encoder.EncodedData> mPendingAudioRingBuffer;
    androidx.camera.video.internal.encoder.EncodedData mPendingFirstVideoData;

    @androidx.annotation.GuardedBy("mLock")
    androidx.camera.video.Recorder.RecordingRecord mPendingRecordingRecord;
    long mPreviousRecordingAudioDataTimeUs;
    long mPreviousRecordingVideoDataTimeUs;
    long mRecordingBytes;
    long mRecordingDurationNs;
    int mRecordingStopError;
    java.lang.Throwable mRecordingStopErrorCause;
    private androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy mResolvedEncoderProfiles;
    final java.util.concurrent.Executor mSequentialExecutor;
    private boolean mShouldSendResumeEvent;
    java.util.concurrent.ScheduledFuture<?> mSourceNonStreamingTimeout;
    androidx.camera.video.VideoOutput.SourceState mSourceState;

    @androidx.annotation.Nullable
    private androidx.camera.core.SurfaceRequest.TransformationInfo mSourceTransformationInfo;

    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.video.Recorder.State mState;

    @androidx.annotation.GuardedBy("mLock")
    int mStreamId;
    private final androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.StreamInfo> mStreamInfo;
    private final java.util.concurrent.Executor mUserProvidedExecutor;
    androidx.camera.video.internal.encoder.Encoder mVideoEncoder;

    @androidx.annotation.VisibleForTesting
    android.util.Range<java.lang.Integer> mVideoEncoderBitrateRange;
    private final androidx.camera.video.internal.encoder.EncoderFactory mVideoEncoderFactory;

    @androidx.annotation.NonNull
    androidx.camera.video.VideoEncoderSession mVideoEncoderSession;

    @androidx.annotation.Nullable
    androidx.camera.video.VideoEncoderSession mVideoEncoderSessionToRelease;
    androidx.camera.video.internal.encoder.OutputConfig mVideoOutputConfig;
    androidx.camera.core.impl.Timebase mVideoSourceTimebase;
    java.lang.Integer mVideoTrackIndex;








    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.Recorder$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$Recorder$AudioState = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$Recorder$State = null;

        static {
                androidx.camera.video.Recorder$AudioState[] r0 = androidx.camera.video.Recorder.AudioState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$AudioState = r0
                r1 = 1
                androidx.camera.video.Recorder$AudioState r2 = androidx.camera.video.Recorder.AudioState.ERROR_ENCODER     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$AudioState     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.video.Recorder$AudioState r3 = androidx.camera.video.Recorder.AudioState.ERROR_SOURCE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$AudioState     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.video.Recorder$AudioState r4 = androidx.camera.video.Recorder.AudioState.ENABLED     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$AudioState     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.video.Recorder$AudioState r5 = androidx.camera.video.Recorder.AudioState.DISABLED     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$AudioState     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.video.Recorder$AudioState r6 = androidx.camera.video.Recorder.AudioState.IDLING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                r5 = 6
                int[] r6 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$AudioState     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.camera.video.Recorder$AudioState r7 = androidx.camera.video.Recorder.AudioState.INITIALIZING     // Catch: java.lang.NoSuchFieldError -> L49
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                androidx.camera.video.Recorder$State[] r6 = androidx.camera.video.Recorder.State.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State = r6
                androidx.camera.video.Recorder$State r7 = androidx.camera.video.Recorder.State.PAUSED     // Catch: java.lang.NoSuchFieldError -> L5a
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                r6[r7] = r1     // Catch: java.lang.NoSuchFieldError -> L5a
            L5a:
                int[] r1 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.NoSuchFieldError -> L64
                androidx.camera.video.Recorder$State r6 = androidx.camera.video.Recorder.State.RECORDING     // Catch: java.lang.NoSuchFieldError -> L64
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r1[r6] = r0     // Catch: java.lang.NoSuchFieldError -> L64
            L64:
                int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.NoSuchFieldError -> L6e
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.PENDING_PAUSED     // Catch: java.lang.NoSuchFieldError -> L6e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
            L6e:
                int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.NoSuchFieldError -> L82
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.RESETTING     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L82
            L82:
                int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.NoSuchFieldError -> L8c
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.STOPPING     // Catch: java.lang.NoSuchFieldError -> L8c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8c
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> L8c
            L8c:
                int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.NoSuchFieldError -> L97
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.CONFIGURING     // Catch: java.lang.NoSuchFieldError -> L97
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L97
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L97
            L97:
                int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.NoSuchFieldError -> La3
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.ERROR     // Catch: java.lang.NoSuchFieldError -> La3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La3
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La3
            La3:
                int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.NoSuchFieldError -> Laf
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.IDLING     // Catch: java.lang.NoSuchFieldError -> Laf
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Laf
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Laf
            Laf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum AudioState extends java.lang.Enum<androidx.camera.video.Recorder.AudioState> {
        private static final /* synthetic */ androidx.camera.video.Recorder.AudioState[] $VALUES = null;
        public static final androidx.camera.video.Recorder.AudioState DISABLED = null;
        public static final androidx.camera.video.Recorder.AudioState ENABLED = null;
        public static final androidx.camera.video.Recorder.AudioState ERROR_ENCODER = null;
        public static final androidx.camera.video.Recorder.AudioState ERROR_SOURCE = null;
        public static final androidx.camera.video.Recorder.AudioState IDLING = null;
        public static final androidx.camera.video.Recorder.AudioState INITIALIZING = null;

        private static /* synthetic */ androidx.camera.video.Recorder.AudioState[] $values() {
                r0 = 6
                androidx.camera.video.Recorder$AudioState[] r0 = new androidx.camera.video.Recorder.AudioState[r0]
                androidx.camera.video.Recorder$AudioState r1 = androidx.camera.video.Recorder.AudioState.INITIALIZING
                r2 = 0
                r0[r2] = r1
                androidx.camera.video.Recorder$AudioState r1 = androidx.camera.video.Recorder.AudioState.IDLING
                r2 = 1
                r0[r2] = r1
                androidx.camera.video.Recorder$AudioState r1 = androidx.camera.video.Recorder.AudioState.DISABLED
                r2 = 2
                r0[r2] = r1
                androidx.camera.video.Recorder$AudioState r1 = androidx.camera.video.Recorder.AudioState.ENABLED
                r2 = 3
                r0[r2] = r1
                androidx.camera.video.Recorder$AudioState r1 = androidx.camera.video.Recorder.AudioState.ERROR_ENCODER
                r2 = 4
                r0[r2] = r1
                androidx.camera.video.Recorder$AudioState r1 = androidx.camera.video.Recorder.AudioState.ERROR_SOURCE
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.video.Recorder$AudioState r0 = new androidx.camera.video.Recorder$AudioState
                java.lang.String r1 = "INITIALIZING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.AudioState.INITIALIZING = r0
                androidx.camera.video.Recorder$AudioState r0 = new androidx.camera.video.Recorder$AudioState
                java.lang.String r1 = "IDLING"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.AudioState.IDLING = r0
                androidx.camera.video.Recorder$AudioState r0 = new androidx.camera.video.Recorder$AudioState
                java.lang.String r1 = "DISABLED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.AudioState.DISABLED = r0
                androidx.camera.video.Recorder$AudioState r0 = new androidx.camera.video.Recorder$AudioState
                java.lang.String r1 = "ENABLED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.AudioState.ENABLED = r0
                androidx.camera.video.Recorder$AudioState r0 = new androidx.camera.video.Recorder$AudioState
                java.lang.String r1 = "ERROR_ENCODER"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.AudioState.ERROR_ENCODER = r0
                androidx.camera.video.Recorder$AudioState r0 = new androidx.camera.video.Recorder$AudioState
                java.lang.String r1 = "ERROR_SOURCE"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.AudioState.ERROR_SOURCE = r0
                androidx.camera.video.Recorder$AudioState[] r0 = $values()
                androidx.camera.video.Recorder.AudioState.$VALUES = r0
                return
        }

        AudioState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.video.Recorder.AudioState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.video.Recorder$AudioState> r0 = androidx.camera.video.Recorder.AudioState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.video.Recorder$AudioState r1 = (androidx.camera.video.Recorder.AudioState) r1
                return r1
        }

        public static androidx.camera.video.Recorder.AudioState[] values() {
                androidx.camera.video.Recorder$AudioState[] r0 = androidx.camera.video.Recorder.AudioState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.video.Recorder$AudioState[] r0 = (androidx.camera.video.Recorder.AudioState[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Builder {
        private androidx.camera.video.internal.encoder.EncoderFactory mAudioEncoderFactory;
        private java.util.concurrent.Executor mExecutor;
        private final androidx.camera.video.MediaSpec.Builder mMediaSpecBuilder;
        private androidx.camera.video.internal.encoder.EncoderFactory mVideoEncoderFactory;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mExecutor = r0
                androidx.camera.video.internal.encoder.EncoderFactory r0 = androidx.camera.video.Recorder.DEFAULT_ENCODER_FACTORY
                r1.mVideoEncoderFactory = r0
                r1.mAudioEncoderFactory = r0
                androidx.camera.video.MediaSpec$Builder r0 = androidx.camera.video.MediaSpec.builder()
                r1.mMediaSpecBuilder = r0
                return
        }

        public static /* synthetic */ void a(androidx.camera.video.QualitySelector r0, androidx.camera.video.VideoSpec.Builder r1) {
                r1.setQualitySelector(r0)
                return
        }

        public static /* synthetic */ void b(int r0, androidx.camera.video.AudioSpec.Builder r1) {
                r1.setSource(r0)
                return
        }

        public static /* synthetic */ void c(int r2, androidx.camera.video.VideoSpec.Builder r3) {
                android.util.Range r0 = new android.util.Range
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.<init>(r1, r2)
                r3.setBitrate(r0)
                return
        }

        public static /* synthetic */ void d(int r0, androidx.camera.video.VideoSpec.Builder r1) {
                r1.setAspectRatio(r0)
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.Recorder build() {
                r5 = this;
                androidx.camera.video.Recorder r0 = new androidx.camera.video.Recorder
                java.util.concurrent.Executor r1 = r5.mExecutor
                androidx.camera.video.MediaSpec$Builder r2 = r5.mMediaSpecBuilder
                androidx.camera.video.MediaSpec r2 = r2.build()
                androidx.camera.video.internal.encoder.EncoderFactory r3 = r5.mVideoEncoderFactory
                androidx.camera.video.internal.encoder.EncoderFactory r4 = r5.mAudioEncoderFactory
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.Recorder.Builder setAspectRatio(int r3) {
                r2 = this;
                androidx.camera.video.MediaSpec$Builder r0 = r2.mMediaSpecBuilder
                androidx.camera.video.x r1 = new androidx.camera.video.x
                r1.<init>(r3)
                r0.configureVideo(r1)
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        androidx.camera.video.Recorder.Builder setAudioEncoderFactory(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderFactory r1) {
                r0 = this;
                r0.mAudioEncoderFactory = r1
                return r0
        }

        @androidx.annotation.NonNull
        androidx.camera.video.Recorder.Builder setAudioSource(int r3) {
                r2 = this;
                androidx.camera.video.MediaSpec$Builder r0 = r2.mMediaSpecBuilder
                androidx.camera.video.w r1 = new androidx.camera.video.w
                r1.<init>(r3)
                r0.configureAudio(r1)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.Recorder.Builder setExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r2) {
                r1 = this;
                java.lang.String r0 = "The specified executor can't be null."
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                r1.mExecutor = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.Recorder.Builder setQualitySelector(@androidx.annotation.NonNull androidx.camera.video.QualitySelector r3) {
                r2 = this;
                java.lang.String r0 = "The specified quality selector can't be null."
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                androidx.camera.video.MediaSpec$Builder r0 = r2.mMediaSpecBuilder
                androidx.camera.video.y r1 = new androidx.camera.video.y
                r1.<init>(r3)
                r0.configureVideo(r1)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.Recorder.Builder setTargetVideoEncodingBitRate(@androidx.annotation.IntRange(from = 1) int r4) {
                r3 = this;
                if (r4 <= 0) goto Ld
                androidx.camera.video.MediaSpec$Builder r0 = r3.mMediaSpecBuilder
                androidx.camera.video.v r1 = new androidx.camera.video.v
                r1.<init>(r4)
                r0.configureVideo(r1)
                return r3
            Ld:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "The requested target bitrate "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " is not supported. Target bitrate must be greater than 0."
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        androidx.camera.video.Recorder.Builder setVideoEncoderFactory(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderFactory r1) {
                r0 = this;
                r0.mVideoEncoderFactory = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    @androidx.annotation.RequiresApi(21)
    static abstract class RecordingRecord implements java.lang.AutoCloseable {
        private final java.util.concurrent.atomic.AtomicReference<androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier> mAudioSourceSupplier;
        private final androidx.camera.core.impl.utils.CloseGuardHelper mCloseGuard;
        private final java.util.concurrent.atomic.AtomicBoolean mInitialized;
        private final java.util.concurrent.atomic.AtomicReference<androidx.camera.video.Recorder.RecordingRecord.MediaMuxerSupplier> mMediaMuxerSupplier;
        private final java.util.concurrent.atomic.AtomicBoolean mMuted;
        private final java.util.concurrent.atomic.AtomicReference<androidx.core.util.Consumer<android.net.Uri>> mRecordingFinalizer;



        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private interface AudioSourceSupplier {
            @androidx.annotation.NonNull
            @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
            androidx.camera.video.internal.audio.AudioSource get(@androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2) throws androidx.camera.video.internal.audio.AudioSourceAccessException;
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private interface MediaMuxerSupplier {
            @androidx.annotation.NonNull
            android.media.MediaMuxer get(int r1, @androidx.annotation.NonNull androidx.core.util.Consumer<android.net.Uri> r2) throws java.io.IOException;
        }

        RecordingRecord() {
                r3 = this;
                r3.<init>()
                androidx.camera.core.impl.utils.CloseGuardHelper r0 = androidx.camera.core.impl.utils.CloseGuardHelper.create()
                r3.mCloseGuard = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r3.mInitialized = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r2 = 0
                r0.<init>(r2)
                r3.mMediaMuxerSupplier = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>(r2)
                r3.mAudioSourceSupplier = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                androidx.camera.video.e0 r2 = new androidx.camera.video.e0
                r2.<init>()
                r0.<init>(r2)
                r3.mRecordingFinalizer = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>(r1)
                r3.mMuted = r0
                return
        }

        public static /* synthetic */ void a(java.lang.String r4, android.net.Uri r5) {
                r0 = 0
                r1 = 1
                java.lang.String r2 = "Recorder"
                if (r5 != 0) goto L14
                java.lang.Object[] r5 = new java.lang.Object[r1]
                r5[r0] = r4
                java.lang.String r4 = "File scanning operation failed [path: %s]"
                java.lang.String r4 = java.lang.String.format(r4, r5)
                androidx.camera.core.Logger.e(r2, r4)
                return
            L14:
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r0] = r4
                r3[r1] = r5
                java.lang.String r4 = "File scan completed successfully [path: %s, URI: %s]"
                java.lang.String r4 = java.lang.String.format(r4, r3)
                androidx.camera.core.Logger.d(r2, r4)
                return
        }

        public static /* synthetic */ void b(android.net.Uri r0) {
                return
        }

        public static /* synthetic */ void c(androidx.camera.video.MediaStoreOutputOptions r1, android.content.Context r2, android.net.Uri r3) {
                android.net.Uri r0 = android.net.Uri.EMPTY
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L9
                return
            L9:
                android.content.ContentResolver r1 = r1.getContentResolver()
                java.lang.String r0 = "_data"
                java.lang.String r1 = androidx.camera.video.internal.utils.OutputUtil.getAbsolutePathFromUri(r1, r3, r0)
                if (r1 == 0) goto L23
                java.lang.String[] r1 = new java.lang.String[]{r1}
                androidx.camera.video.d0 r3 = new androidx.camera.video.d0
                r3.<init>()
                r0 = 0
                android.media.MediaScannerConnection.scanFile(r2, r1, r0, r3)
                return
            L23:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Skipping media scanner scan. Unable to retrieve file path from URI: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "Recorder"
                androidx.camera.core.Logger.d(r2, r1)
                return
        }

        public static /* synthetic */ void d(androidx.camera.video.MediaStoreOutputOptions r3, android.net.Uri r4) {
                android.net.Uri r0 = android.net.Uri.EMPTY
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L9
                return
            L9:
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                r1 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "is_pending"
                r0.put(r2, r1)
                android.content.ContentResolver r3 = r3.getContentResolver()
                r1 = 0
                r3.update(r4, r0, r1, r1)
                return
        }

        public static /* synthetic */ void e(androidx.camera.video.Recorder.RecordingRecord r0, androidx.camera.video.VideoRecordEvent r1) {
                androidx.core.util.Consumer r0 = r0.getEventListener()
                r0.accept(r1)
                return
        }

        public static /* synthetic */ android.media.MediaMuxer f(androidx.camera.video.OutputOptions r6, android.os.ParcelFileDescriptor r7, int r8, androidx.core.util.Consumer r9) {
                android.net.Uri r0 = android.net.Uri.EMPTY
                boolean r1 = r6 instanceof androidx.camera.video.FileOutputOptions
                java.lang.String r2 = "Failed to create folder for "
                java.lang.String r3 = "Recorder"
                if (r1 == 0) goto L3b
                androidx.camera.video.FileOutputOptions r6 = (androidx.camera.video.FileOutputOptions) r6
                java.io.File r6 = r6.getFile()
                boolean r7 = androidx.camera.video.internal.utils.OutputUtil.createParentFolder(r6)
                if (r7 != 0) goto L2c
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r0 = r6.getAbsolutePath()
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                androidx.camera.core.Logger.w(r3, r7)
            L2c:
                android.media.MediaMuxer r7 = new android.media.MediaMuxer
                java.lang.String r0 = r6.getAbsolutePath()
                r7.<init>(r0, r8)
                android.net.Uri r0 = android.net.Uri.fromFile(r6)
                goto Le4
            L3b:
                boolean r1 = r6 instanceof androidx.camera.video.FileDescriptorOutputOptions
                r4 = 26
                if (r1 == 0) goto L57
                int r6 = android.os.Build.VERSION.SDK_INT
                if (r6 < r4) goto L4f
                java.io.FileDescriptor r6 = r7.getFileDescriptor()
                android.media.MediaMuxer r7 = androidx.camera.video.internal.compat.Api26Impl.createMediaMuxer(r6, r8)
                goto Le4
            L4f:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r7 = "MediaMuxer doesn't accept FileDescriptor as output destination."
                r6.<init>(r7)
                throw r6
            L57:
                boolean r7 = r6 instanceof androidx.camera.video.MediaStoreOutputOptions
                if (r7 == 0) goto L108
                androidx.camera.video.MediaStoreOutputOptions r6 = (androidx.camera.video.MediaStoreOutputOptions) r6
                android.content.ContentValues r7 = new android.content.ContentValues
                android.content.ContentValues r0 = r6.getContentValues()
                r7.<init>(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L76
                r1 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r5 = "is_pending"
                r7.put(r5, r1)
            L76:
                android.content.ContentResolver r1 = r6.getContentResolver()     // Catch: java.lang.RuntimeException -> Lf0
                android.net.Uri r5 = r6.getCollectionUri()     // Catch: java.lang.RuntimeException -> Lf0
                android.net.Uri r7 = r1.insert(r5, r7)     // Catch: java.lang.RuntimeException -> Lf0
                if (r7 == 0) goto Le8
                if (r0 >= r4) goto Lcd
                android.content.ContentResolver r6 = r6.getContentResolver()
                java.lang.String r0 = "_data"
                java.lang.String r6 = androidx.camera.video.internal.utils.OutputUtil.getAbsolutePathFromUri(r6, r7, r0)
                if (r6 == 0) goto Lb6
                java.io.File r0 = new java.io.File
                r0.<init>(r6)
                boolean r0 = androidx.camera.video.internal.utils.OutputUtil.createParentFolder(r0)
                if (r0 != 0) goto Laf
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                androidx.camera.core.Logger.w(r3, r0)
            Laf:
                android.media.MediaMuxer r0 = new android.media.MediaMuxer
                r0.<init>(r6, r8)
                r8 = r0
                goto Le2
            Lb6:
                java.io.IOException r6 = new java.io.IOException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "Unable to get path from uri "
                r8.append(r9)
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                r6.<init>(r7)
                throw r6
            Lcd:
                android.content.ContentResolver r6 = r6.getContentResolver()
                java.lang.String r0 = "rw"
                android.os.ParcelFileDescriptor r6 = r6.openFileDescriptor(r7, r0)
                java.io.FileDescriptor r0 = r6.getFileDescriptor()
                android.media.MediaMuxer r8 = androidx.camera.video.internal.compat.Api26Impl.createMediaMuxer(r0, r8)
                r6.close()
            Le2:
                r0 = r7
                r7 = r8
            Le4:
                r9.accept(r0)
                return r7
            Le8:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r7 = "Unable to create MediaStore entry."
                r6.<init>(r7)
                throw r6
            Lf0:
                r6 = move-exception
                java.io.IOException r7 = new java.io.IOException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "Unable to create MediaStore entry by "
                r8.append(r9)
                r8.append(r6)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8, r6)
                throw r7
            L108:
                java.lang.AssertionError r7 = new java.lang.AssertionError
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "Invalid output options type: "
                r8.append(r9)
                java.lang.Class r6 = r6.getClass()
                java.lang.String r6 = r6.getSimpleName()
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                r7.<init>(r6)
                throw r7
        }

        private void finalizeRecordingInternal(@androidx.annotation.Nullable androidx.core.util.Consumer<android.net.Uri> r2, @androidx.annotation.NonNull android.net.Uri r3) {
                r1 = this;
                if (r2 == 0) goto Lb
                androidx.camera.core.impl.utils.CloseGuardHelper r0 = r1.mCloseGuard
                r0.close()
                r2.accept(r3)
                return
            Lb:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "Recording "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = " has already been finalized"
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @androidx.annotation.NonNull
        static androidx.camera.video.Recorder.RecordingRecord from(@androidx.annotation.NonNull androidx.camera.video.PendingRecording r8, long r9) {
                androidx.camera.video.AutoValue_Recorder_RecordingRecord r0 = new androidx.camera.video.AutoValue_Recorder_RecordingRecord
                androidx.camera.video.OutputOptions r1 = r8.getOutputOptions()
                java.util.concurrent.Executor r2 = r8.getListenerExecutor()
                androidx.core.util.Consumer r3 = r8.getEventListener()
                boolean r4 = r8.isAudioEnabled()
                boolean r5 = r8.isPersistent()
                r6 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r0
        }

        public static /* synthetic */ void g(android.os.ParcelFileDescriptor r1, android.net.Uri r2) {
                r1.close()     // Catch: java.io.IOException -> L4
                return
            L4:
                r1 = move-exception
                java.lang.String r2 = "Recorder"
                java.lang.String r0 = "Failed to close dup'd ParcelFileDescriptor"
                androidx.camera.core.Logger.e(r2, r0, r1)
                return
        }

        @Override // java.lang.AutoCloseable
        public void close() {
                r1 = this;
                android.net.Uri r0 = android.net.Uri.EMPTY
                r1.finalizeRecording(r0)
                return
        }

        protected void finalize() throws java.lang.Throwable {
                r2 = this;
                androidx.camera.core.impl.utils.CloseGuardHelper r0 = r2.mCloseGuard     // Catch: java.lang.Throwable -> L16
                r0.warnIfOpen()     // Catch: java.lang.Throwable -> L16
                java.util.concurrent.atomic.AtomicReference<androidx.core.util.Consumer<android.net.Uri>> r0 = r2.mRecordingFinalizer     // Catch: java.lang.Throwable -> L16
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L16
                androidx.core.util.Consumer r0 = (androidx.core.util.Consumer) r0     // Catch: java.lang.Throwable -> L16
                if (r0 == 0) goto L18
                android.net.Uri r1 = android.net.Uri.EMPTY     // Catch: java.lang.Throwable -> L16
                r2.finalizeRecordingInternal(r0, r1)     // Catch: java.lang.Throwable -> L16
                goto L18
            L16:
                r0 = move-exception
                goto L1c
            L18:
                super.finalize()
                return
            L1c:
                super.finalize()
                throw r0
        }

        void finalizeRecording(@androidx.annotation.NonNull android.net.Uri r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.mInitialized
                boolean r0 = r0.get()
                if (r0 != 0) goto L9
                return
            L9:
                java.util.concurrent.atomic.AtomicReference<androidx.core.util.Consumer<android.net.Uri>> r0 = r2.mRecordingFinalizer
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                androidx.core.util.Consumer r0 = (androidx.core.util.Consumer) r0
                r2.finalizeRecordingInternal(r0, r3)
                return
        }

        @androidx.annotation.Nullable
        abstract java.util.concurrent.Executor getCallbackExecutor();

        @androidx.annotation.Nullable
        abstract androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> getEventListener();

        @androidx.annotation.NonNull
        abstract androidx.camera.video.OutputOptions getOutputOptions();

        abstract long getRecordingId();

        abstract boolean hasAudioEnabled();

        void initializeRecording(@androidx.annotation.NonNull android.content.Context r7) throws java.io.IOException {
                r6 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r6.mInitialized
                r1 = 1
                boolean r0 = r0.getAndSet(r1)
                if (r0 != 0) goto L7a
                androidx.camera.video.OutputOptions r0 = r6.getOutputOptions()
                boolean r1 = r0 instanceof androidx.camera.video.FileDescriptorOutputOptions
                r2 = 0
                if (r1 == 0) goto L1e
                r3 = r0
                androidx.camera.video.FileDescriptorOutputOptions r3 = (androidx.camera.video.FileDescriptorOutputOptions) r3
                android.os.ParcelFileDescriptor r3 = r3.getParcelFileDescriptor()
                android.os.ParcelFileDescriptor r3 = r3.dup()
                goto L1f
            L1e:
                r3 = r2
            L1f:
                androidx.camera.core.impl.utils.CloseGuardHelper r4 = r6.mCloseGuard
                java.lang.String r5 = "finalizeRecording"
                r4.open(r5)
                androidx.camera.video.z r4 = new androidx.camera.video.z
                r4.<init>(r0, r3)
                java.util.concurrent.atomic.AtomicReference<androidx.camera.video.Recorder$RecordingRecord$MediaMuxerSupplier> r5 = r6.mMediaMuxerSupplier
                r5.set(r4)
                boolean r4 = r6.hasAudioEnabled()
                if (r4 == 0) goto L51
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 31
                if (r4 < r5) goto L47
                androidx.camera.video.Recorder$RecordingRecord$1 r4 = new androidx.camera.video.Recorder$RecordingRecord$1
                r4.<init>(r6, r7)
                java.util.concurrent.atomic.AtomicReference<androidx.camera.video.Recorder$RecordingRecord$AudioSourceSupplier> r5 = r6.mAudioSourceSupplier
                r5.set(r4)
                goto L51
            L47:
                androidx.camera.video.Recorder$RecordingRecord$2 r4 = new androidx.camera.video.Recorder$RecordingRecord$2
                r4.<init>(r6)
                java.util.concurrent.atomic.AtomicReference<androidx.camera.video.Recorder$RecordingRecord$AudioSourceSupplier> r5 = r6.mAudioSourceSupplier
                r5.set(r4)
            L51:
                boolean r4 = r0 instanceof androidx.camera.video.MediaStoreOutputOptions
                if (r4 == 0) goto L6b
                androidx.camera.video.MediaStoreOutputOptions r0 = (androidx.camera.video.MediaStoreOutputOptions) r0
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 < r2) goto L64
                androidx.camera.video.a0 r7 = new androidx.camera.video.a0
                r7.<init>(r0)
                r2 = r7
                goto L72
            L64:
                androidx.camera.video.b0 r1 = new androidx.camera.video.b0
                r1.<init>(r0, r7)
                r2 = r1
                goto L72
            L6b:
                if (r1 == 0) goto L72
                androidx.camera.video.c0 r2 = new androidx.camera.video.c0
                r2.<init>(r3)
            L72:
                if (r2 == 0) goto L79
                java.util.concurrent.atomic.AtomicReference<androidx.core.util.Consumer<android.net.Uri>> r7 = r6.mRecordingFinalizer
                r7.set(r2)
            L79:
                return
            L7a:
                java.lang.AssertionError r7 = new java.lang.AssertionError
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Recording "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r1 = " has already been initialized"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
        }

        boolean isMuted() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.mMuted
                boolean r0 = r0.get()
                return r0
        }

        abstract boolean isPersistent();

        void mute(boolean r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.mMuted
                r0.set(r2)
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
        androidx.camera.video.internal.audio.AudioSource performOneTimeAudioSourceCreation(@androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) throws androidx.camera.video.internal.audio.AudioSourceAccessException {
                r2 = this;
                boolean r0 = r2.hasAudioEnabled()
                if (r0 == 0) goto L2d
                java.util.concurrent.atomic.AtomicReference<androidx.camera.video.Recorder$RecordingRecord$AudioSourceSupplier> r0 = r2.mAudioSourceSupplier
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                androidx.camera.video.Recorder$RecordingRecord$AudioSourceSupplier r0 = (androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier) r0
                if (r0 == 0) goto L16
                androidx.camera.video.internal.audio.AudioSource r3 = r0.get(r3, r4)
                return r3
            L16:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "One-time audio source creation has already occurred for recording "
                r4.append(r0)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L2d:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "Recording does not have audio enabled. Unable to create audio source for recording "
                r4.append(r0)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
        }

        @androidx.annotation.NonNull
        android.media.MediaMuxer performOneTimeMediaMuxerCreation(int r3, @androidx.annotation.NonNull androidx.core.util.Consumer<android.net.Uri> r4) throws java.io.IOException {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.mInitialized
                boolean r0 = r0.get()
                if (r0 == 0) goto L47
                java.util.concurrent.atomic.AtomicReference<androidx.camera.video.Recorder$RecordingRecord$MediaMuxerSupplier> r0 = r2.mMediaMuxerSupplier
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                androidx.camera.video.Recorder$RecordingRecord$MediaMuxerSupplier r0 = (androidx.camera.video.Recorder.RecordingRecord.MediaMuxerSupplier) r0
                if (r0 == 0) goto L30
                android.media.MediaMuxer r3 = r0.get(r3, r4)     // Catch: java.lang.RuntimeException -> L18
                return r3
            L18:
                r3 = move-exception
                java.io.IOException r4 = new java.io.IOException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to create MediaMuxer by "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0, r3)
                throw r4
            L30:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "One-time media muxer creation has already occurred for recording "
                r4.append(r0)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L47:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "Recording "
                r4.append(r0)
                r4.append(r2)
                java.lang.String r0 = " has not been initialized"
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
        }

        void updateVideoRecordEvent(@androidx.annotation.NonNull androidx.camera.video.VideoRecordEvent r5) {
                r4 = this;
                androidx.camera.video.OutputOptions r0 = r5.getOutputOptions()
                androidx.camera.video.OutputOptions r1 = r4.getOutputOptions()
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L7c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Sending VideoRecordEvent "
                r0.append(r1)
                java.lang.Class r1 = r5.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                boolean r1 = r5 instanceof androidx.camera.video.VideoRecordEvent.Finalize
                if (r1 == 0) goto L57
                r1 = r5
                androidx.camera.video.VideoRecordEvent$Finalize r1 = (androidx.camera.video.VideoRecordEvent.Finalize) r1
                boolean r2 = r1.hasError()
                if (r2 == 0) goto L57
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                int r0 = r1.getError()
                java.lang.String r0 = androidx.camera.video.VideoRecordEvent.Finalize.errorToString(r0)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                r1[r3] = r0
                java.lang.String r0 = " [error: %s]"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
            L57:
                java.lang.String r1 = "Recorder"
                androidx.camera.core.Logger.d(r1, r0)
                java.util.concurrent.Executor r0 = r4.getCallbackExecutor()
                if (r0 == 0) goto L7b
                androidx.core.util.Consumer r0 = r4.getEventListener()
                if (r0 == 0) goto L7b
                java.util.concurrent.Executor r0 = r4.getCallbackExecutor()     // Catch: java.util.concurrent.RejectedExecutionException -> L75
                androidx.camera.video.f0 r2 = new androidx.camera.video.f0     // Catch: java.util.concurrent.RejectedExecutionException -> L75
                r2.<init>(r4, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L75
                r0.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L75
                return
            L75:
                r5 = move-exception
                java.lang.String r0 = "The callback executor is invalid."
                androidx.camera.core.Logger.e(r1, r0, r5)
            L7b:
                return
            L7c:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Attempted to update event listener with event from incorrect recording [Recording: "
                r1.append(r2)
                androidx.camera.video.OutputOptions r5 = r5.getOutputOptions()
                r1.append(r5)
                java.lang.String r5 = ", Expected: "
                r1.append(r5)
                androidx.camera.video.OutputOptions r5 = r4.getOutputOptions()
                r1.append(r5)
                java.lang.String r5 = "]"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum State extends java.lang.Enum<androidx.camera.video.Recorder.State> {
        private static final /* synthetic */ androidx.camera.video.Recorder.State[] $VALUES = null;
        public static final androidx.camera.video.Recorder.State CONFIGURING = null;
        public static final androidx.camera.video.Recorder.State ERROR = null;
        public static final androidx.camera.video.Recorder.State IDLING = null;
        public static final androidx.camera.video.Recorder.State PAUSED = null;
        public static final androidx.camera.video.Recorder.State PENDING_PAUSED = null;
        public static final androidx.camera.video.Recorder.State PENDING_RECORDING = null;
        public static final androidx.camera.video.Recorder.State RECORDING = null;
        public static final androidx.camera.video.Recorder.State RESETTING = null;
        public static final androidx.camera.video.Recorder.State STOPPING = null;

        private static /* synthetic */ androidx.camera.video.Recorder.State[] $values() {
                r0 = 9
                androidx.camera.video.Recorder$State[] r0 = new androidx.camera.video.Recorder.State[r0]
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.CONFIGURING
                r2 = 0
                r0[r2] = r1
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.PENDING_RECORDING
                r2 = 1
                r0[r2] = r1
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.PENDING_PAUSED
                r2 = 2
                r0[r2] = r1
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.IDLING
                r2 = 3
                r0[r2] = r1
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.RECORDING
                r2 = 4
                r0[r2] = r1
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.PAUSED
                r2 = 5
                r0[r2] = r1
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.STOPPING
                r2 = 6
                r0[r2] = r1
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.RESETTING
                r2 = 7
                r0[r2] = r1
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.ERROR
                r2 = 8
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.video.Recorder$State r0 = new androidx.camera.video.Recorder$State
                java.lang.String r1 = "CONFIGURING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.State.CONFIGURING = r0
                androidx.camera.video.Recorder$State r0 = new androidx.camera.video.Recorder$State
                java.lang.String r1 = "PENDING_RECORDING"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.State.PENDING_RECORDING = r0
                androidx.camera.video.Recorder$State r0 = new androidx.camera.video.Recorder$State
                java.lang.String r1 = "PENDING_PAUSED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.State.PENDING_PAUSED = r0
                androidx.camera.video.Recorder$State r0 = new androidx.camera.video.Recorder$State
                java.lang.String r1 = "IDLING"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.State.IDLING = r0
                androidx.camera.video.Recorder$State r0 = new androidx.camera.video.Recorder$State
                java.lang.String r1 = "RECORDING"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.State.RECORDING = r0
                androidx.camera.video.Recorder$State r0 = new androidx.camera.video.Recorder$State
                java.lang.String r1 = "PAUSED"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.State.PAUSED = r0
                androidx.camera.video.Recorder$State r0 = new androidx.camera.video.Recorder$State
                java.lang.String r1 = "STOPPING"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.State.STOPPING = r0
                androidx.camera.video.Recorder$State r0 = new androidx.camera.video.Recorder$State
                java.lang.String r1 = "RESETTING"
                r2 = 7
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.State.RESETTING = r0
                androidx.camera.video.Recorder$State r0 = new androidx.camera.video.Recorder$State
                java.lang.String r1 = "ERROR"
                r2 = 8
                r0.<init>(r1, r2)
                androidx.camera.video.Recorder.State.ERROR = r0
                androidx.camera.video.Recorder$State[] r0 = $values()
                androidx.camera.video.Recorder.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.video.Recorder.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.video.Recorder$State> r0 = androidx.camera.video.Recorder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.video.Recorder$State r1 = (androidx.camera.video.Recorder.State) r1
                return r1
        }

        public static androidx.camera.video.Recorder.State[] values() {
                androidx.camera.video.Recorder$State[] r0 = androidx.camera.video.Recorder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.video.Recorder$State[] r0 = (androidx.camera.video.Recorder.State[]) r0
                return r0
        }
    }

    static {
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.PENDING_RECORDING
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.PENDING_PAUSED
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.video.Recorder.PENDING_STATES = r0
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.CONFIGURING
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.IDLING
            androidx.camera.video.Recorder$State r2 = androidx.camera.video.Recorder.State.RESETTING
            androidx.camera.video.Recorder$State r3 = androidx.camera.video.Recorder.State.STOPPING
            androidx.camera.video.Recorder$State r4 = androidx.camera.video.Recorder.State.ERROR
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1, r2, r3, r4)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.video.Recorder.VALID_NON_PENDING_STATES_WHILE_PENDING = r0
            androidx.camera.video.Quality r0 = androidx.camera.video.Quality.FHD
            r1 = 3
            androidx.camera.video.Quality[] r1 = new androidx.camera.video.Quality[r1]
            r2 = 0
            r1[r2] = r0
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.HD
            r3 = 1
            r1[r3] = r2
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.SD
            r3 = 2
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            androidx.camera.video.FallbackStrategy r0 = androidx.camera.video.FallbackStrategy.higherQualityOrLowerThan(r0)
            androidx.camera.video.QualitySelector r0 = androidx.camera.video.QualitySelector.fromOrderedList(r1, r0)
            androidx.camera.video.Recorder.DEFAULT_QUALITY_SELECTOR = r0
            androidx.camera.video.VideoSpec$Builder r1 = androidx.camera.video.VideoSpec.builder()
            androidx.camera.video.VideoSpec$Builder r0 = r1.setQualitySelector(r0)
            r1 = -1
            androidx.camera.video.VideoSpec$Builder r0 = r0.setAspectRatio(r1)
            androidx.camera.video.VideoSpec r0 = r0.build()
            androidx.camera.video.Recorder.VIDEO_SPEC_DEFAULT = r0
            androidx.camera.video.MediaSpec$Builder r2 = androidx.camera.video.MediaSpec.builder()
            androidx.camera.video.MediaSpec$Builder r1 = r2.setOutputFormat(r1)
            androidx.camera.video.MediaSpec$Builder r0 = r1.setVideoSpec(r0)
            androidx.camera.video.MediaSpec r0 = r0.build()
            androidx.camera.video.Recorder.MEDIA_SPEC_DEFAULT = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "The video frame producer became inactive before any data was received."
            r0.<init>(r1)
            androidx.camera.video.Recorder.PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = r0
            androidx.camera.video.k r0 = new androidx.camera.video.k
            r0.<init>()
            androidx.camera.video.Recorder.DEFAULT_ENCODER_FACTORY = r0
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor()
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(r0)
            androidx.camera.video.Recorder.AUDIO_EXECUTOR = r0
            return
    }

    Recorder(@androidx.annotation.Nullable java.util.concurrent.Executor r8, @androidx.annotation.NonNull androidx.camera.video.MediaSpec r9, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderFactory r10, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderFactory r11) {
            r7 = this;
            r7.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.mLock = r0
            java.lang.Class<androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk> r0 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            r7.mEncoderNotUsePersistentInputSurface = r0
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.CONFIGURING
            r7.mState = r0
            r0 = 0
            r7.mNonPendingState = r0
            r7.mStreamId = r2
            r7.mActiveRecordingRecord = r0
            r7.mPendingRecordingRecord = r0
            r3 = 0
            r7.mLastGeneratedRecordingId = r3
            r7.mInProgressRecording = r0
            r7.mInProgressRecordingStopping = r2
            r7.mInProgressTransformationInfo = r0
            r7.mSourceTransformationInfo = r0
            r7.mResolvedEncoderProfiles = r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r7.mEncodingFutures = r5
            r7.mAudioTrackIndex = r0
            r7.mVideoTrackIndex = r0
            r7.mLatestSurface = r0
            r7.mActiveSurface = r0
            r7.mMediaMuxer = r0
            r7.mAudioSource = r0
            r7.mVideoEncoder = r0
            r7.mVideoOutputConfig = r0
            r7.mAudioEncoder = r0
            r7.mAudioOutputConfig = r0
            androidx.camera.video.Recorder$AudioState r5 = androidx.camera.video.Recorder.AudioState.INITIALIZING
            r7.mAudioState = r5
            android.net.Uri r5 = android.net.Uri.EMPTY
            r7.mOutputUri = r5
            r7.mRecordingBytes = r3
            r7.mRecordingDurationNs = r3
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7.mFirstRecordingVideoDataTimeUs = r5
            r7.mFirstRecordingVideoBitrate = r2
            r7.mVideoEncoderBitrateRange = r0
            r7.mFirstRecordingAudioDataTimeUs = r5
            r7.mPreviousRecordingVideoDataTimeUs = r5
            r7.mPreviousRecordingAudioDataTimeUs = r5
            r7.mFileSizeLimitInBytes = r3
            r7.mDurationLimitNs = r3
            r7.mRecordingStopError = r1
            r7.mRecordingStopErrorCause = r0
            r7.mPendingFirstVideoData = r0
            androidx.camera.core.internal.utils.ArrayRingBuffer r1 = new androidx.camera.core.internal.utils.ArrayRingBuffer
            r3 = 60
            r1.<init>(r3)
            r7.mPendingAudioRingBuffer = r1
            r7.mAudioErrorCause = r0
            r7.mIsAudioSourceSilenced = r2
            androidx.camera.video.VideoOutput$SourceState r1 = androidx.camera.video.VideoOutput.SourceState.INACTIVE
            r7.mSourceState = r1
            r7.mSourceNonStreamingTimeout = r0
            r7.mNeedsResetBeforeNextStart = r2
            r7.mVideoEncoderSessionToRelease = r0
            r0 = 0
            r7.mAudioAmplitude = r0
            r7.mShouldSendResumeEvent = r2
            r7.mUserProvidedExecutor = r8
            if (r8 == 0) goto L98
            goto L9c
        L98:
            java.util.concurrent.Executor r8 = androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor()
        L9c:
            r7.mExecutor = r8
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(r8)
            r7.mSequentialExecutor = r0
            androidx.camera.video.MediaSpec r9 = r7.composeRecorderMediaSpec(r9)
            androidx.camera.core.impl.MutableStateObservable r9 = androidx.camera.core.impl.MutableStateObservable.withInitialState(r9)
            r7.mMediaSpec = r9
            int r9 = r7.mStreamId
            androidx.camera.video.Recorder$State r1 = r7.mState
            androidx.camera.video.StreamInfo$StreamState r1 = r7.internalStateToStreamState(r1)
            androidx.camera.video.StreamInfo r9 = androidx.camera.video.StreamInfo.of(r9, r1)
            androidx.camera.core.impl.MutableStateObservable r9 = androidx.camera.core.impl.MutableStateObservable.withInitialState(r9)
            r7.mStreamInfo = r9
            r7.mVideoEncoderFactory = r10
            r7.mAudioEncoderFactory = r11
            androidx.camera.video.VideoEncoderSession r9 = new androidx.camera.video.VideoEncoderSession
            r9.<init>(r10, r0, r8)
            r7.mVideoEncoderSession = r9
            return
    }

    public static /* synthetic */ void a(androidx.camera.video.Recorder r0, androidx.camera.video.Recorder.RecordingRecord r1) {
            r0.pauseInternal(r1)
            return
    }

    public static /* synthetic */ void b(androidx.camera.video.internal.encoder.Encoder r2) {
            java.lang.String r0 = "Recorder"
            java.lang.String r1 = "The source didn't become non-streaming before timeout. Waited 1000ms"
            androidx.camera.core.Logger.d(r0, r1)
            java.lang.Class<androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk> r0 = androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 == 0) goto L12
            notifyEncoderSourceStopped(r2)
        L12:
            return
    }

    public static /* synthetic */ void c(androidx.camera.video.Recorder r0, androidx.camera.video.Recorder.RecordingRecord r1) {
            r0.resumeInternal(r1)
            return
    }

    private void clearPendingAudioRingBuffer() {
            r1 = this;
        L0:
            androidx.camera.core.internal.utils.RingBuffer<androidx.camera.video.internal.encoder.EncodedData> r0 = r1.mPendingAudioRingBuffer
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le
            androidx.camera.core.internal.utils.RingBuffer<androidx.camera.video.internal.encoder.EncodedData> r0 = r1.mPendingAudioRingBuffer
            r0.dequeue()
            goto L0
        Le:
            return
    }

    @androidx.annotation.NonNull
    private androidx.camera.video.MediaSpec composeRecorderMediaSpec(@androidx.annotation.NonNull androidx.camera.video.MediaSpec r3) {
            r2 = this;
            androidx.camera.video.MediaSpec$Builder r0 = r3.toBuilder()
            androidx.camera.video.VideoSpec r3 = r3.getVideoSpec()
            int r3 = r3.getAspectRatio()
            r1 = -1
            if (r3 != r1) goto L17
            androidx.camera.video.b r3 = new androidx.camera.video.b
            r3.<init>()
            r0.configureVideo(r3)
        L17:
            androidx.camera.video.MediaSpec r3 = r0.build()
            return r3
    }

    private void configureInternal(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r8, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r9) {
            r7 = this;
            boolean r0 = r8.isServiced()
            java.lang.String r1 = "Recorder"
            if (r0 == 0) goto Le
            java.lang.String r8 = "Ignore the SurfaceRequest since it is already served."
            androidx.camera.core.Logger.w(r1, r8)
            return
        Le:
            java.util.concurrent.Executor r0 = r7.mSequentialExecutor
            androidx.camera.video.o r2 = new androidx.camera.video.o
            r2.<init>(r7)
            r8.setTransformationInfoListener(r0, r2)
            android.util.Size r0 = r8.getResolution()
            androidx.camera.core.DynamicRange r2 = r8.getDynamicRange()
            androidx.camera.core.impl.CameraInternal r3 = r8.getCamera()
            androidx.camera.core.CameraInfo r3 = r3.getCameraInfo()
            androidx.camera.video.VideoCapabilities r3 = getVideoCapabilities(r3)
            androidx.camera.video.Quality r4 = r3.findHighestSupportedQualityFor(r0, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Using supported quality of "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = " for surface size "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.video.Quality r0 = androidx.camera.video.Quality.NONE
            if (r4 == r0) goto L61
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r0 = r3.getProfiles(r4, r2)
            r7.mResolvedEncoderProfiles = r0
            if (r0 == 0) goto L59
            goto L61
        L59:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "Camera advertised available quality but did not produce EncoderProfiles  for advertised quality."
            r8.<init>(r9)
            throw r8
        L61:
            r7.setupVideo(r8, r9)
            return
    }

    public static /* synthetic */ void d(androidx.camera.video.Recorder r4, androidx.camera.core.SurfaceRequest r5, androidx.camera.core.impl.Timebase r6) {
            r4.getClass()
            boolean r0 = r5.isServiced()
            if (r0 != 0) goto L3e
            androidx.camera.video.VideoEncoderSession r0 = r4.mVideoEncoderSession
            boolean r0 = r0.isConfiguredSurfaceRequest(r5)
            if (r0 == 0) goto L18
            boolean r0 = r4.isPersistentRecordingInProgress()
            if (r0 != 0) goto L18
            goto L3e
        L18:
            androidx.camera.video.VideoEncoderSession r0 = new androidx.camera.video.VideoEncoderSession
            androidx.camera.video.internal.encoder.EncoderFactory r1 = r4.mVideoEncoderFactory
            java.util.concurrent.Executor r2 = r4.mSequentialExecutor
            java.util.concurrent.Executor r3 = r4.mExecutor
            r0.<init>(r1, r2, r3)
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> r1 = r4.mMediaSpec
            java.lang.Object r1 = r4.getObservableData(r1)
            androidx.camera.video.MediaSpec r1 = (androidx.camera.video.MediaSpec) r1
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r2 = r4.mResolvedEncoderProfiles
            com.google.common.util.concurrent.ListenableFuture r5 = r0.configure(r5, r6, r1, r2)
            r4.mVideoEncoderSession = r0
            androidx.camera.video.Recorder$1 r6 = new androidx.camera.video.Recorder$1
            r6.<init>(r4, r0)
            java.util.concurrent.Executor r4 = r4.mSequentialExecutor
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r5, r6, r4)
            return
        L3e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Ignore the SurfaceRequest "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = " isServiced: "
            r6.append(r0)
            boolean r5 = r5.isServiced()
            r6.append(r5)
            java.lang.String r5 = " VideoEncoderSession: "
            r6.append(r5)
            androidx.camera.video.VideoEncoderSession r4 = r4.mVideoEncoderSession
            r6.append(r4)
            java.lang.String r4 = " has been configured with a persistent in-progress recording."
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r5 = "Recorder"
            androidx.camera.core.Logger.w(r5, r4)
            return
    }

    public static /* synthetic */ void e(androidx.camera.video.Recorder r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2, java.lang.Throwable r3) {
            java.lang.Throwable r0 = r1.mAudioErrorCause
            if (r0 != 0) goto L1c
            boolean r0 = r3 instanceof androidx.camera.video.internal.encoder.EncodeException
            if (r0 == 0) goto Le
            androidx.camera.video.Recorder$AudioState r0 = androidx.camera.video.Recorder.AudioState.ERROR_ENCODER
            r1.setAudioState(r0)
            goto L13
        Le:
            androidx.camera.video.Recorder$AudioState r0 = androidx.camera.video.Recorder.AudioState.ERROR_SOURCE
            r1.setAudioState(r0)
        L13:
            r1.mAudioErrorCause = r3
            r1.updateInProgressStatusEvent()
            r1 = 0
            r2.set(r1)
        L1c:
            return
    }

    public static /* synthetic */ void f(androidx.camera.video.Recorder r0, androidx.camera.core.SurfaceRequest r1, androidx.camera.core.impl.Timebase r2) {
            r0.onSurfaceRequestedInternal(r1, r2)
            return
    }

    private void finalizePendingRecording(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r7, int r8, @androidx.annotation.Nullable java.lang.Throwable r9) {
            r6 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            r7.finalizeRecording(r0)
            androidx.camera.video.OutputOptions r1 = r7.getOutputOptions()
            java.lang.Throwable r2 = r6.mAudioErrorCause
            r3 = 0
            r5 = 1
            androidx.camera.video.AudioStats r2 = androidx.camera.video.AudioStats.of(r5, r2, r3)
            r3 = 0
            androidx.camera.video.RecordingStats r2 = androidx.camera.video.RecordingStats.of(r3, r3, r2)
            androidx.camera.video.OutputResults r0 = androidx.camera.video.OutputResults.of(r0)
            androidx.camera.video.VideoRecordEvent$Finalize r8 = androidx.camera.video.VideoRecordEvent.finalizeWithError(r1, r2, r0, r8, r9)
            r7.updateVideoRecordEvent(r8)
            return
    }

    public static /* synthetic */ void g(androidx.camera.video.Recorder r0, android.net.Uri r1) {
            r0.mOutputUri = r1
            return
    }

    @androidx.annotation.NonNull
    private java.util.List<androidx.camera.video.internal.encoder.EncodedData> getAudioDataToWriteAndClearCache(long r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            androidx.camera.core.internal.utils.RingBuffer<androidx.camera.video.internal.encoder.EncodedData> r1 = r5.mPendingAudioRingBuffer
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L21
            androidx.camera.core.internal.utils.RingBuffer<androidx.camera.video.internal.encoder.EncodedData> r1 = r5.mPendingAudioRingBuffer
            java.lang.Object r1 = r1.dequeue()
            androidx.camera.video.internal.encoder.EncodedData r1 = (androidx.camera.video.internal.encoder.EncodedData) r1
            long r2 = r1.getPresentationTimeUs()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L5
            r0.add(r1)
            goto L5
        L21:
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.VideoCapabilities getVideoCapabilities(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r0) {
            androidx.camera.video.RecorderVideoCapabilities r0 = androidx.camera.video.RecorderVideoCapabilities.from(r0)
            return r0
    }

    public static /* synthetic */ void h(androidx.camera.video.Recorder r0, androidx.camera.video.VideoOutput.SourceState r1) {
            r0.onSourceStateChangedInternal(r1)
            return
    }

    public static /* synthetic */ void i(androidx.camera.video.Recorder r0, androidx.camera.video.Recorder.RecordingRecord r1, long r2, int r4, java.lang.Throwable r5) {
            r0.stopInternal(r1, r2, r4, r5)
            return
    }

    private int internalAudioStateToAudioStatsState(@androidx.annotation.NonNull androidx.camera.video.Recorder.AudioState r6) {
            r5 = this;
            int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$AudioState
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 3
            r2 = 1
            if (r0 == r2) goto L44
            r3 = 4
            r4 = 2
            if (r0 == r4) goto L43
            if (r0 == r1) goto L30
            if (r0 == r3) goto L2f
            r1 = 6
            if (r0 != r1) goto L18
            goto L2f
        L18:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid internal audio state: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L2f:
            return r2
        L30:
            androidx.camera.video.Recorder$RecordingRecord r6 = r5.mInProgressRecording
            if (r6 == 0) goto L3c
            boolean r6 = r6.isMuted()
            if (r6 == 0) goto L3c
            r6 = 5
            return r6
        L3c:
            boolean r6 = r5.mIsAudioSourceSilenced
            if (r6 == 0) goto L41
            return r4
        L41:
            r6 = 0
            return r6
        L43:
            return r3
        L44:
            return r1
    }

    @androidx.annotation.NonNull
    private androidx.camera.video.StreamInfo.StreamState internalStateToStreamState(@androidx.annotation.NonNull androidx.camera.video.Recorder.State r3) {
            r2 = this;
            java.lang.Class<androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk> r0 = androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk r0 = (androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk) r0
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.RECORDING
            if (r3 == r1) goto L16
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.STOPPING
            if (r3 != r1) goto L13
            if (r0 != 0) goto L13
            goto L16
        L13:
            androidx.camera.video.StreamInfo$StreamState r3 = androidx.camera.video.StreamInfo.StreamState.INACTIVE
            return r3
        L16:
            androidx.camera.video.StreamInfo$StreamState r3 = androidx.camera.video.StreamInfo.StreamState.ACTIVE
            return r3
    }

    private static boolean isSameRecording(@androidx.annotation.NonNull androidx.camera.video.Recording r4, @androidx.annotation.Nullable androidx.camera.video.Recorder.RecordingRecord r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            long r1 = r4.getRecordingId()
            long r4 = r5.getRecordingId()
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L12
            r4 = 1
            return r4
        L12:
            return r0
    }

    public static /* synthetic */ void j(androidx.camera.video.VideoSpec.Builder r1) {
            androidx.camera.video.VideoSpec r0 = androidx.camera.video.Recorder.VIDEO_SPEC_DEFAULT
            int r0 = r0.getAspectRatio()
            r1.setAspectRatio(r0)
            return
    }

    public static /* synthetic */ void k(androidx.camera.video.Recorder r1, androidx.camera.video.internal.encoder.Encoder r2) {
            java.util.concurrent.Executor r1 = r1.mSequentialExecutor
            androidx.camera.video.n r0 = new androidx.camera.video.n
            r0.<init>(r2)
            r1.execute(r0)
            return
    }

    public static /* synthetic */ void l(androidx.camera.video.Recorder r0, androidx.camera.video.Recorder.RecordingRecord r1, boolean r2) {
            r0.muteInternal(r1, r2)
            return
    }

    public static /* synthetic */ void m(androidx.camera.video.Recorder r2) {
            androidx.camera.core.SurfaceRequest r0 = r2.mLatestSurfaceRequest
            if (r0 == 0) goto La
            androidx.camera.core.impl.Timebase r1 = r2.mVideoSourceTimebase
            r2.configureInternal(r0, r1)
            return
        La:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r0 = "surface request is required to retry initialization."
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.video.Recorder.RecordingRecord makePendingRecordingActiveLocked(@androidx.annotation.NonNull androidx.camera.video.Recorder.State r3) {
            r2 = this;
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.PENDING_PAUSED
            if (r3 != r0) goto L6
            r3 = 1
            goto Lb
        L6:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.PENDING_RECORDING
            if (r3 != r0) goto L36
            r3 = 0
        Lb:
            androidx.camera.video.Recorder$RecordingRecord r0 = r2.mActiveRecordingRecord
            if (r0 != 0) goto L2e
            androidx.camera.video.Recorder$RecordingRecord r0 = r2.mPendingRecordingRecord
            if (r0 == 0) goto L26
            r2.mActiveRecordingRecord = r0
            r1 = 0
            r2.mPendingRecordingRecord = r1
            if (r3 == 0) goto L20
            androidx.camera.video.Recorder$State r3 = androidx.camera.video.Recorder.State.PAUSED
            r2.setState(r3)
            return r0
        L20:
            androidx.camera.video.Recorder$State r3 = androidx.camera.video.Recorder.State.RECORDING
            r2.setState(r3)
            return r0
        L26:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "Pending recording should exist when in a PENDING state."
            r3.<init>(r0)
            throw r3
        L2e:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "Cannot make pending recording active because another recording is already active."
            r3.<init>(r0)
            throw r3
        L36:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "makePendingRecordingActiveLocked() can only be called from a pending state."
            r3.<init>(r0)
            throw r3
    }

    private void muteInternal(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r2, boolean r3) {
            r1 = this;
            boolean r0 = r2.isMuted()
            if (r0 != r3) goto L7
            goto L19
        L7:
            r2.mute(r3)
            androidx.camera.video.Recorder$RecordingRecord r0 = r1.mInProgressRecording
            if (r0 != r2) goto L19
            boolean r2 = r1.mInProgressRecordingStopping
            if (r2 != 0) goto L19
            androidx.camera.video.internal.audio.AudioSource r2 = r1.mAudioSource
            if (r2 == 0) goto L19
            r2.mute(r3)
        L19:
            return
    }

    public static /* synthetic */ java.lang.Object n(androidx.camera.video.Recorder r2, androidx.camera.video.Recorder.RecordingRecord r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            androidx.camera.video.internal.encoder.Encoder r0 = r2.mVideoEncoder
            androidx.camera.video.Recorder$4 r1 = new androidx.camera.video.Recorder$4
            r1.<init>(r2, r4, r3)
            java.util.concurrent.Executor r2 = r2.mSequentialExecutor
            r0.setEncoderCallback(r1, r2)
            java.lang.String r2 = "videoEncodingFuture"
            return r2
    }

    static void notifyEncoderSourceStopped(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.Encoder r1) {
            boolean r0 = r1 instanceof androidx.camera.video.internal.encoder.EncoderImpl
            if (r0 == 0) goto L9
            androidx.camera.video.internal.encoder.EncoderImpl r1 = (androidx.camera.video.internal.encoder.EncoderImpl) r1
            r1.signalSourceStopped()
        L9:
            return
    }

    public static /* synthetic */ java.lang.Object o(androidx.camera.video.Recorder r4, androidx.camera.video.Recorder.RecordingRecord r5, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r6) {
            r4.getClass()
            androidx.camera.video.c r0 = new androidx.camera.video.c
            r0.<init>(r4, r6)
            androidx.camera.video.internal.audio.AudioSource r1 = r4.mAudioSource
            java.util.concurrent.Executor r2 = r4.mSequentialExecutor
            androidx.camera.video.Recorder$5 r3 = new androidx.camera.video.Recorder$5
            r3.<init>(r4, r0)
            r1.setAudioSourceCallback(r2, r3)
            androidx.camera.video.internal.encoder.Encoder r1 = r4.mAudioEncoder
            androidx.camera.video.Recorder$6 r2 = new androidx.camera.video.Recorder$6
            r2.<init>(r4, r6, r0, r5)
            java.util.concurrent.Executor r4 = r4.mSequentialExecutor
            r1.setEncoderCallback(r2, r4)
            java.lang.String r4 = "audioEncodingFuture"
            return r4
    }

    private void onRecordingFinalized(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r8) {
            r7 = this;
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            androidx.camera.video.Recorder$RecordingRecord r1 = r7.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L40
            if (r1 != r8) goto Ldd
            r8 = 0
            r7.mActiveRecordingRecord = r8     // Catch: java.lang.Throwable -> L40
            int[] r1 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L40
            androidx.camera.video.Recorder$State r2 = r7.mState     // Catch: java.lang.Throwable -> L40
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L40
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L40
            r2 = 9
            if (r1 == r2) goto Lc4
            r2 = 1
            r3 = 0
            switch(r1) {
                case 1: goto L76;
                case 2: goto L76;
                case 3: goto L29;
                case 4: goto L27;
                case 5: goto L1f;
                case 6: goto L76;
                default: goto L1d;
            }     // Catch: java.lang.Throwable -> L40
        L1d:
            goto L97
        L1f:
            r2 = r8
            r4 = r2
            r1 = 0
            r3 = 1
        L23:
            r5 = 0
            r6 = 0
            goto L9b
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            androidx.camera.video.VideoOutput$SourceState r4 = r7.mSourceState     // Catch: java.lang.Throwable -> L40
            androidx.camera.video.VideoOutput$SourceState r5 = androidx.camera.video.VideoOutput.SourceState.INACTIVE     // Catch: java.lang.Throwable -> L40
            if (r4 != r5) goto L43
            androidx.camera.video.Recorder$RecordingRecord r2 = r7.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L40
            r7.mPendingRecordingRecord = r8     // Catch: java.lang.Throwable -> L40
            androidx.camera.video.Recorder$State r4 = androidx.camera.video.Recorder.State.CONFIGURING     // Catch: java.lang.Throwable -> L40
            r7.setState(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.Exception r4 = androidx.camera.video.Recorder.PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE     // Catch: java.lang.Throwable -> L40
            r5 = 4
            r6 = r1
            r1 = 0
            goto L9b
        L40:
            r8 = move-exception
            goto Le5
        L43:
            boolean r4 = r7.mEncoderNotUsePersistentInputSurface     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L60
            r7.mActiveSurface = r8     // Catch: java.lang.Throwable -> L40
            androidx.camera.core.SurfaceRequest r4 = r7.mLatestSurfaceRequest     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L54
            boolean r4 = r4.isServiced()     // Catch: java.lang.Throwable -> L40
            if (r4 != 0) goto L54
            goto L55
        L54:
            r2 = 0
        L55:
            androidx.camera.video.Recorder$State r4 = androidx.camera.video.Recorder.State.CONFIGURING     // Catch: java.lang.Throwable -> L40
            r7.updateNonPendingState(r4)     // Catch: java.lang.Throwable -> L40
            r4 = r8
            r6 = r1
            r1 = r2
            r5 = 0
        L5e:
            r2 = r4
            goto L9b
        L60:
            androidx.camera.video.internal.encoder.Encoder r2 = r7.mVideoEncoder     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L70
            androidx.camera.video.Recorder$State r2 = r7.mState     // Catch: java.lang.Throwable -> L40
            androidx.camera.video.Recorder$RecordingRecord r2 = r7.makePendingRecordingActiveLocked(r2)     // Catch: java.lang.Throwable -> L40
            r4 = r8
            r6 = r1
            r1 = 0
            r5 = 0
            r8 = r2
            goto L5e
        L70:
            r2 = r8
            r4 = r2
            r6 = r1
            r1 = 0
            r5 = 0
            goto L9b
        L76:
            boolean r1 = r7.mEncoderNotUsePersistentInputSurface     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L92
            r7.mActiveSurface = r8     // Catch: java.lang.Throwable -> L40
            androidx.camera.core.SurfaceRequest r1 = r7.mLatestSurfaceRequest     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L87
            boolean r1 = r1.isServiced()     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L87
            goto L88
        L87:
            r2 = 0
        L88:
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.CONFIGURING     // Catch: java.lang.Throwable -> L40
            r7.setState(r1)     // Catch: java.lang.Throwable -> L40
            r4 = r8
            r1 = r2
            r5 = 0
            r6 = 0
            goto L5e
        L92:
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.IDLING     // Catch: java.lang.Throwable -> L40
            r7.setState(r1)     // Catch: java.lang.Throwable -> L40
        L97:
            r2 = r8
            r4 = r2
            r1 = 0
            goto L23
        L9b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto La6
            androidx.camera.core.SurfaceRequest r8 = r7.mLatestSurfaceRequest
            androidx.camera.core.impl.Timebase r0 = r7.mVideoSourceTimebase
            r7.configureInternal(r8, r0)
            return
        La6:
            if (r3 == 0) goto Lac
            r7.reset()
            return
        Lac:
            if (r8 == 0) goto Lbe
            boolean r0 = r7.mEncoderNotUsePersistentInputSurface
            if (r0 != 0) goto Lb6
            r7.startRecording(r8, r6)
            return
        Lb6:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r0 = "Attempt to start a pending recording while the Recorder is waiting for a new surface request."
            r8.<init>(r0)
            throw r8
        Lbe:
            if (r2 == 0) goto Lc3
            r7.finalizePendingRecording(r2, r5, r4)
        Lc3:
            return
        Lc4:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "Unexpected state on finalize of recording: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L40
            androidx.camera.video.Recorder$State r2 = r7.mState     // Catch: java.lang.Throwable -> L40
            r1.append(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L40
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L40
            throw r8     // Catch: java.lang.Throwable -> L40
        Ldd:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "Active recording did not match finalized recording on finalize."
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L40
            throw r8     // Catch: java.lang.Throwable -> L40
        Le5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r8
    }

    private void onResetVideo() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L18
            androidx.camera.video.Recorder$State r2 = r3.mState     // Catch: java.lang.Throwable -> L18
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L18
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L18
            r2 = 0
            switch(r1) {
                case 1: goto L1a;
                case 2: goto L1a;
                case 3: goto L12;
                case 4: goto L12;
                case 5: goto L22;
                case 6: goto L22;
                case 7: goto L11;
                case 8: goto L1a;
                case 9: goto L22;
                default: goto L11;
            }     // Catch: java.lang.Throwable -> L18
        L11:
            goto L27
        L12:
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.CONFIGURING     // Catch: java.lang.Throwable -> L18
            r3.updateNonPendingState(r1)     // Catch: java.lang.Throwable -> L18
            goto L27
        L18:
            r1 = move-exception
            goto L3f
        L1a:
            boolean r1 = r3.isPersistentRecordingInProgress()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L22
            r1 = 0
            goto L28
        L22:
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.CONFIGURING     // Catch: java.lang.Throwable -> L18
            r3.setState(r1)     // Catch: java.lang.Throwable -> L18
        L27:
            r1 = 1
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            r3.mNeedsResetBeforeNextStart = r2
            if (r1 == 0) goto L3e
            androidx.camera.core.SurfaceRequest r0 = r3.mLatestSurfaceRequest
            if (r0 == 0) goto L3e
            boolean r0 = r0.isServiced()
            if (r0 != 0) goto L3e
            androidx.camera.core.SurfaceRequest r0 = r3.mLatestSurfaceRequest
            androidx.camera.core.impl.Timebase r1 = r3.mVideoSourceTimebase
            r3.configureInternal(r0, r1)
        L3e:
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    private void onSurfaceRequestedInternal(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r2, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r3) {
            r1 = this;
            androidx.camera.core.SurfaceRequest r0 = r1.mLatestSurfaceRequest
            if (r0 == 0) goto Lf
            boolean r0 = r0.isServiced()
            if (r0 != 0) goto Lf
            androidx.camera.core.SurfaceRequest r0 = r1.mLatestSurfaceRequest
            r0.willNotProvideSurface()
        Lf:
            r1.mLatestSurfaceRequest = r2
            r1.mVideoSourceTimebase = r3
            r1.configureInternal(r2, r3)
            return
    }

    public static /* synthetic */ void p(androidx.camera.video.Recorder r0, androidx.camera.core.SurfaceRequest.TransformationInfo r1) {
            r0.mSourceTransformationInfo = r1
            return
    }

    private void pauseInternal(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r3) {
            r2 = this;
            androidx.camera.video.Recorder$RecordingRecord r0 = r2.mInProgressRecording
            if (r0 != r3) goto L29
            boolean r3 = r2.mInProgressRecordingStopping
            if (r3 != 0) goto L29
            boolean r3 = r2.isAudioEnabled()
            if (r3 == 0) goto L13
            androidx.camera.video.internal.encoder.Encoder r3 = r2.mAudioEncoder
            r3.pause()
        L13:
            androidx.camera.video.internal.encoder.Encoder r3 = r2.mVideoEncoder
            r3.pause()
            androidx.camera.video.Recorder$RecordingRecord r3 = r2.mInProgressRecording
            androidx.camera.video.OutputOptions r0 = r3.getOutputOptions()
            androidx.camera.video.RecordingStats r1 = r2.getInProgressRecordingStats()
            androidx.camera.video.VideoRecordEvent$Pause r0 = androidx.camera.video.VideoRecordEvent.pause(r0, r1)
            r3.updateVideoRecordEvent(r0)
        L29:
            return
    }

    @androidx.annotation.NonNull
    private androidx.camera.video.PendingRecording prepareRecordingInternal(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.camera.video.OutputOptions r3) {
            r1 = this;
            java.lang.String r0 = "The OutputOptions cannot be null."
            androidx.core.util.Preconditions.checkNotNull(r3, r0)
            androidx.camera.video.PendingRecording r0 = new androidx.camera.video.PendingRecording
            r0.<init>(r2, r1, r3)
            return r0
    }

    private void releaseCurrentAudioSource() {
            r4 = this;
            androidx.camera.video.internal.audio.AudioSource r0 = r4.mAudioSource
            if (r0 == 0) goto L31
            r1 = 0
            r4.mAudioSource = r1
            int r1 = r0.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "Releasing audio source: 0x%x"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "Recorder"
            androidx.camera.core.Logger.d(r2, r1)
            com.google.common.util.concurrent.ListenableFuture r1 = r0.release()
            androidx.camera.video.Recorder$3 r2 = new androidx.camera.video.Recorder$3
            r2.<init>(r4, r0)
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r1, r2, r0)
            return
        L31:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Cannot release null audio source."
            r0.<init>(r1)
            throw r0
    }

    private void reset() {
            r2 = this;
            androidx.camera.video.internal.encoder.Encoder r0 = r2.mAudioEncoder
            if (r0 == 0) goto L15
            java.lang.String r0 = "Recorder"
            java.lang.String r1 = "Releasing audio encoder."
            androidx.camera.core.Logger.d(r0, r1)
            androidx.camera.video.internal.encoder.Encoder r0 = r2.mAudioEncoder
            r0.release()
            r0 = 0
            r2.mAudioEncoder = r0
            r2.mAudioOutputConfig = r0
        L15:
            androidx.camera.video.internal.audio.AudioSource r0 = r2.mAudioSource
            if (r0 == 0) goto L1c
            r2.releaseCurrentAudioSource()
        L1c:
            androidx.camera.video.Recorder$AudioState r0 = androidx.camera.video.Recorder.AudioState.INITIALIZING
            r2.setAudioState(r0)
            r2.resetVideo()
            return
    }

    private void resetVideo() {
            r2 = this;
            androidx.camera.video.internal.encoder.Encoder r0 = r2.mVideoEncoder
            if (r0 == 0) goto Le
            java.lang.String r0 = "Recorder"
            java.lang.String r1 = "Releasing video encoder."
            androidx.camera.core.Logger.d(r0, r1)
            r2.tryReleaseVideoEncoder()
        Le:
            r2.onResetVideo()
            return
    }

    @androidx.annotation.GuardedBy("mLock")
    private void restoreNonPendingState() {
            r3 = this;
            java.util.Set<androidx.camera.video.Recorder$State> r0 = androidx.camera.video.Recorder.PENDING_STATES
            androidx.camera.video.Recorder$State r1 = r3.mState
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L10
            androidx.camera.video.Recorder$State r0 = r3.mNonPendingState
            r3.setState(r0)
            return
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot restore non-pending state when in state "
            r1.append(r2)
            androidx.camera.video.Recorder$State r2 = r3.mState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private void resumeInternal(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r3) {
            r2 = this;
            androidx.camera.video.Recorder$RecordingRecord r0 = r2.mInProgressRecording
            if (r0 != r3) goto L2f
            boolean r3 = r2.mInProgressRecordingStopping
            if (r3 != 0) goto L2f
            boolean r3 = r2.isAudioEnabled()
            if (r3 == 0) goto L13
            androidx.camera.video.internal.encoder.Encoder r3 = r2.mAudioEncoder
            r3.start()
        L13:
            androidx.camera.video.internal.encoder.Encoder r3 = r2.mVideoEncoder
            if (r3 == 0) goto L2c
            r3.start()
            androidx.camera.video.Recorder$RecordingRecord r3 = r2.mInProgressRecording
            androidx.camera.video.OutputOptions r0 = r3.getOutputOptions()
            androidx.camera.video.RecordingStats r1 = r2.getInProgressRecordingStats()
            androidx.camera.video.VideoRecordEvent$Resume r0 = androidx.camera.video.VideoRecordEvent.resume(r0, r1)
            r3.updateVideoRecordEvent(r0)
            return
        L2c:
            r3 = 1
            r2.mShouldSendResumeEvent = r3
        L2f:
            return
    }

    @androidx.annotation.NonNull
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> safeToCloseVideoEncoder() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Try to safely release video encoder: "
            r0.append(r1)
            androidx.camera.video.internal.encoder.Encoder r1 = r2.mVideoEncoder
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Recorder"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.video.VideoEncoderSession r0 = r2.mVideoEncoderSession
            com.google.common.util.concurrent.ListenableFuture r0 = r0.signalTermination()
            return r0
    }

    @androidx.annotation.GuardedBy("mLock")
    private void setStreamId(int r4) {
            r3 = this;
            int r0 = r3.mStreamId
            if (r0 != r4) goto L5
            return
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Transitioning streamId: "
            r0.append(r1)
            int r1 = r3.mStreamId
            r0.append(r1)
            java.lang.String r1 = " --> "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Recorder"
            androidx.camera.core.Logger.d(r1, r0)
            r3.mStreamId = r4
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.StreamInfo> r0 = r3.mStreamInfo
            androidx.camera.video.Recorder$State r1 = r3.mState
            androidx.camera.video.StreamInfo$StreamState r1 = r3.internalStateToStreamState(r1)
            androidx.camera.core.SurfaceRequest$TransformationInfo r2 = r3.mInProgressTransformationInfo
            androidx.camera.video.StreamInfo r4 = androidx.camera.video.StreamInfo.of(r4, r1, r2)
            r0.setState(r4)
            return
    }

    @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    private void setupAudio(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r7) throws androidx.camera.video.internal.audio.AudioSourceAccessException, androidx.camera.video.internal.encoder.InvalidConfigException {
            r6 = this;
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> r0 = r6.mMediaSpec
            java.lang.Object r0 = r6.getObservableData(r0)
            androidx.camera.video.MediaSpec r0 = (androidx.camera.video.MediaSpec) r0
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r1 = r6.mResolvedEncoderProfiles
            androidx.camera.video.internal.config.AudioMimeInfo r1 = androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioMimeInfo(r0, r1)
            androidx.camera.core.impl.Timebase r2 = androidx.camera.core.impl.Timebase.UPTIME
            androidx.camera.video.AudioSpec r3 = r0.getAudioSpec()
            androidx.camera.video.internal.audio.AudioSettings r3 = androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioSettings(r1, r3)
            androidx.camera.video.internal.audio.AudioSource r4 = r6.mAudioSource
            if (r4 == 0) goto L1f
            r6.releaseCurrentAudioSource()
        L1f:
            androidx.camera.video.internal.audio.AudioSource r7 = r6.setupAudioSource(r7, r3)
            r6.mAudioSource = r7
            int r7 = r7.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r7
            java.lang.String r7 = "Set up new audio source: 0x%x"
            java.lang.String r7 = java.lang.String.format(r7, r4)
            java.lang.String r4 = "Recorder"
            androidx.camera.core.Logger.d(r4, r7)
            androidx.camera.video.AudioSpec r7 = r0.getAudioSpec()
            androidx.camera.video.internal.encoder.AudioEncoderConfig r7 = androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioEncoderConfig(r1, r2, r3, r7)
            androidx.camera.video.internal.encoder.EncoderFactory r0 = r6.mAudioEncoderFactory
            java.util.concurrent.Executor r1 = r6.mExecutor
            androidx.camera.video.internal.encoder.Encoder r7 = r0.createEncoder(r1, r7)
            r6.mAudioEncoder = r7
            androidx.camera.video.internal.encoder.Encoder$EncoderInput r7 = r7.getInput()
            boolean r0 = r7 instanceof androidx.camera.video.internal.encoder.Encoder.ByteBufferInput
            if (r0 == 0) goto L60
            androidx.camera.video.internal.audio.AudioSource r0 = r6.mAudioSource
            androidx.camera.video.internal.encoder.Encoder$ByteBufferInput r7 = (androidx.camera.video.internal.encoder.Encoder.ByteBufferInput) r7
            r0.setBufferProvider(r7)
            return
        L60:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r0 = "The EncoderInput of audio isn't a ByteBufferInput."
            r7.<init>(r0)
            throw r7
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    private androidx.camera.video.internal.audio.AudioSource setupAudioSource(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r2, @androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r3) throws androidx.camera.video.internal.audio.AudioSourceAccessException {
            r1 = this;
            java.util.concurrent.Executor r0 = androidx.camera.video.Recorder.AUDIO_EXECUTOR
            androidx.camera.video.internal.audio.AudioSource r2 = r2.performOneTimeAudioSourceCreation(r3, r0)
            return r2
    }

    private void setupVideo(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r3, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r4) {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r2.safeToCloseVideoEncoder()
            androidx.camera.video.h r1 = new androidx.camera.video.h
            r1.<init>(r2, r3, r4)
            java.util.concurrent.Executor r3 = r2.mSequentialExecutor
            r0.addListener(r1, r3)
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private void startInternal(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r8) {
            r7 = this;
            androidx.camera.video.Recorder$RecordingRecord r0 = r7.mInProgressRecording
            if (r0 != 0) goto L120
            androidx.camera.video.OutputOptions r0 = r8.getOutputOptions()
            long r0 = r0.getFileSizeLimit()
            java.lang.String r2 = "Recorder"
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L41
            androidx.camera.video.OutputOptions r0 = r8.getOutputOptions()
            long r0 = r0.getFileSizeLimit()
            double r0 = (double) r0
            r5 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r0 = r0 * r5
            long r0 = java.lang.Math.round(r0)
            r7.mFileSizeLimitInBytes = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "File size limit in bytes: "
            r0.append(r1)
            long r5 = r7.mFileSizeLimitInBytes
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r2, r0)
            goto L43
        L41:
            r7.mFileSizeLimitInBytes = r3
        L43:
            androidx.camera.video.OutputOptions r0 = r8.getOutputOptions()
            long r0 = r0.getDurationLimitMillis()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L76
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            androidx.camera.video.OutputOptions r1 = r8.getOutputOptions()
            long r3 = r1.getDurationLimitMillis()
            long r0 = r0.toNanos(r3)
            r7.mDurationLimitNs = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Duration limit in nanoseconds: "
            r0.append(r1)
            long r3 = r7.mDurationLimitNs
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r2, r0)
            goto L78
        L76:
            r7.mDurationLimitNs = r3
        L78:
            r7.mInProgressRecording = r8
            int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$AudioState
            androidx.camera.video.Recorder$AudioState r1 = r7.mAudioState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L107;
                case 2: goto L107;
                case 3: goto L107;
                case 4: goto L107;
                case 5: goto Lca;
                case 6: goto L88;
                default: goto L87;
            }
        L87:
            goto Ld8
        L88:
            boolean r0 = r8.hasAudioEnabled()
            if (r0 == 0) goto Ld8
            boolean r0 = r7.isAudioSupported()
            if (r0 == 0) goto Lc2
            androidx.camera.video.Recorder$RecordingRecord r0 = r7.mInProgressRecording     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> La1 androidx.camera.video.internal.audio.AudioSourceAccessException -> La3
            boolean r0 = r0.isPersistent()     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> La1 androidx.camera.video.internal.audio.AudioSourceAccessException -> La3
            if (r0 == 0) goto La5
            androidx.camera.video.internal.encoder.Encoder r0 = r7.mAudioEncoder     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> La1 androidx.camera.video.internal.audio.AudioSourceAccessException -> La3
            if (r0 != 0) goto La8
            goto La5
        La1:
            r0 = move-exception
            goto Lae
        La3:
            r0 = move-exception
            goto Lae
        La5:
            r7.setupAudio(r8)     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> La1 androidx.camera.video.internal.audio.AudioSourceAccessException -> La3
        La8:
            androidx.camera.video.Recorder$AudioState r0 = androidx.camera.video.Recorder.AudioState.ENABLED     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> La1 androidx.camera.video.internal.audio.AudioSourceAccessException -> La3
            r7.setAudioState(r0)     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> La1 androidx.camera.video.internal.audio.AudioSourceAccessException -> La3
            goto Ld8
        Lae:
            java.lang.String r1 = "Unable to create audio resource with error: "
            androidx.camera.core.Logger.e(r2, r1, r0)
            boolean r1 = r0 instanceof androidx.camera.video.internal.encoder.InvalidConfigException
            if (r1 == 0) goto Lba
            androidx.camera.video.Recorder$AudioState r1 = androidx.camera.video.Recorder.AudioState.ERROR_ENCODER
            goto Lbc
        Lba:
            androidx.camera.video.Recorder$AudioState r1 = androidx.camera.video.Recorder.AudioState.ERROR_SOURCE
        Lbc:
            r7.setAudioState(r1)
            r7.mAudioErrorCause = r0
            goto Ld8
        Lc2:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r0 = "The Recorder doesn't support recording with audio"
            r8.<init>(r0)
            throw r8
        Lca:
            boolean r0 = r8.hasAudioEnabled()
            if (r0 == 0) goto Ld3
            androidx.camera.video.Recorder$AudioState r0 = androidx.camera.video.Recorder.AudioState.ENABLED
            goto Ld5
        Ld3:
            androidx.camera.video.Recorder$AudioState r0 = androidx.camera.video.Recorder.AudioState.DISABLED
        Ld5:
            r7.setAudioState(r0)
        Ld8:
            r0 = 0
            r7.updateEncoderCallbacks(r8, r0)
            boolean r0 = r7.isAudioEnabled()
            if (r0 == 0) goto Lf0
            androidx.camera.video.internal.audio.AudioSource r0 = r7.mAudioSource
            boolean r8 = r8.isMuted()
            r0.start(r8)
            androidx.camera.video.internal.encoder.Encoder r8 = r7.mAudioEncoder
            r8.start()
        Lf0:
            androidx.camera.video.internal.encoder.Encoder r8 = r7.mVideoEncoder
            r8.start()
            androidx.camera.video.Recorder$RecordingRecord r8 = r7.mInProgressRecording
            androidx.camera.video.OutputOptions r0 = r8.getOutputOptions()
            androidx.camera.video.RecordingStats r1 = r7.getInProgressRecordingStats()
            androidx.camera.video.VideoRecordEvent$Start r0 = androidx.camera.video.VideoRecordEvent.start(r0, r1)
            r8.updateVideoRecordEvent(r0)
            return
        L107:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Incorrectly invoke startInternal in audio state "
            r0.append(r1)
            androidx.camera.video.Recorder$AudioState r1 = r7.mAudioState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L120:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r0 = "Attempted to start a new recording while another was in progress."
            r8.<init>(r0)
            throw r8
    }

    private void startRecording(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r1, boolean r2) {
            r0 = this;
            r0.startInternal(r1)
            if (r2 == 0) goto L8
            r0.pauseInternal(r1)
        L8:
            return
    }

    private static int supportedMuxerFormatOrDefaultFrom(@androidx.annotation.Nullable androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r3, int r4) {
            if (r3 == 0) goto L1c
            int r3 = r3.getRecommendedFileFormat()
            r0 = 0
            r1 = 2
            r2 = 1
            if (r3 == r2) goto L14
            if (r3 == r1) goto L13
            r0 = 9
            if (r3 == r0) goto L12
            goto L1c
        L12:
            return r2
        L13:
            return r0
        L14:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 >= r4) goto L1b
            return r0
        L1b:
            return r1
        L1c:
            return r4
    }

    private void tryReleaseVideoEncoder() {
            r2 = this;
            androidx.camera.video.VideoEncoderSession r0 = r2.mVideoEncoderSessionToRelease
            if (r0 == 0) goto L3a
            androidx.camera.video.internal.encoder.Encoder r0 = r0.getVideoEncoder()
            androidx.camera.video.internal.encoder.Encoder r1 = r2.mVideoEncoder
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            androidx.core.util.Preconditions.checkState(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Releasing video encoder: "
            r0.append(r1)
            androidx.camera.video.internal.encoder.Encoder r1 = r2.mVideoEncoder
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Recorder"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.video.VideoEncoderSession r0 = r2.mVideoEncoderSessionToRelease
            r0.terminateNow()
            r0 = 0
            r2.mVideoEncoderSessionToRelease = r0
            r2.mVideoEncoder = r0
            r2.mVideoOutputConfig = r0
            r2.setLatestSurface(r0)
            return
        L3a:
            r2.safeToCloseVideoEncoder()
            return
    }

    private void updateEncoderCallbacks(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r3, boolean r4) {
            r2 = this;
            java.util.List<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r0 = r2.mEncodingFutures
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.List<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r0 = r2.mEncodingFutures
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.allAsList(r0)
            boolean r1 = r0.isDone()
            if (r1 != 0) goto L18
            r1 = 1
            r0.cancel(r1)
        L18:
            java.util.List<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r0 = r2.mEncodingFutures
            r0.clear()
        L1d:
            java.util.List<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r0 = r2.mEncodingFutures
            androidx.camera.video.d r1 = new androidx.camera.video.d
            r1.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)
            r0.add(r1)
            boolean r0 = r2.isAudioEnabled()
            if (r0 == 0) goto L41
            if (r4 != 0) goto L41
            java.util.List<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r4 = r2.mEncodingFutures
            androidx.camera.video.e r0 = new androidx.camera.video.e
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            r4.add(r3)
        L41:
            java.util.List<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r3 = r2.mEncodingFutures
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.allAsList(r3)
            androidx.camera.video.Recorder$7 r4 = new androidx.camera.video.Recorder$7
            r4.<init>(r2)
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r3, r4, r0)
            return
    }

    @androidx.annotation.GuardedBy("mLock")
    private void updateNonPendingState(@androidx.annotation.NonNull androidx.camera.video.Recorder.State r4) {
            r3 = this;
            java.util.Set<androidx.camera.video.Recorder$State> r0 = androidx.camera.video.Recorder.PENDING_STATES
            androidx.camera.video.Recorder$State r1 = r3.mState
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L41
            java.util.Set<androidx.camera.video.Recorder$State> r0 = androidx.camera.video.Recorder.VALID_NON_PENDING_STATES_WHILE_PENDING
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L2a
            androidx.camera.video.Recorder$State r0 = r3.mNonPendingState
            if (r0 == r4) goto L29
            r3.mNonPendingState = r4
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.StreamInfo> r0 = r3.mStreamInfo
            int r1 = r3.mStreamId
            androidx.camera.video.StreamInfo$StreamState r4 = r3.internalStateToStreamState(r4)
            androidx.camera.core.SurfaceRequest$TransformationInfo r2 = r3.mInProgressTransformationInfo
            androidx.camera.video.StreamInfo r4 = androidx.camera.video.StreamInfo.of(r1, r4, r2)
            r0.setState(r4)
        L29:
            return
        L2a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid state transition. State is not a valid non-pending state while in a pending state: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L41:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can only updated non-pending state from a pending state, but state is "
            r0.append(r1)
            androidx.camera.video.Recorder$State r1 = r3.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    void finalizeInProgressRecording(int r7, @androidx.annotation.Nullable java.lang.Throwable r8) {
            r6 = this;
            androidx.camera.video.Recorder$RecordingRecord r0 = r6.mInProgressRecording
            if (r0 == 0) goto Lcb
            android.media.MediaMuxer r0 = r6.mMediaMuxer
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L34
            r0.stop()     // Catch: java.lang.IllegalStateException -> L13
            android.media.MediaMuxer r0 = r6.mMediaMuxer     // Catch: java.lang.IllegalStateException -> L13
            r0.release()     // Catch: java.lang.IllegalStateException -> L13
            goto L31
        L13:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "MediaMuxer failed to stop or release with error: "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "Recorder"
            androidx.camera.core.Logger.e(r3, r0)
            if (r7 != 0) goto L31
            r7 = 1
        L31:
            r6.mMediaMuxer = r2
            goto L38
        L34:
            if (r7 != 0) goto L38
            r7 = 8
        L38:
            androidx.camera.video.Recorder$RecordingRecord r0 = r6.mInProgressRecording
            android.net.Uri r3 = r6.mOutputUri
            r0.finalizeRecording(r3)
            androidx.camera.video.Recorder$RecordingRecord r0 = r6.mInProgressRecording
            androidx.camera.video.OutputOptions r0 = r0.getOutputOptions()
            androidx.camera.video.RecordingStats r3 = r6.getInProgressRecordingStats()
            android.net.Uri r4 = r6.mOutputUri
            androidx.camera.video.OutputResults r4 = androidx.camera.video.OutputResults.of(r4)
            androidx.camera.video.Recorder$RecordingRecord r5 = r6.mInProgressRecording
            if (r7 != 0) goto L58
            androidx.camera.video.VideoRecordEvent$Finalize r7 = androidx.camera.video.VideoRecordEvent.finalize(r0, r3, r4)
            goto L5c
        L58:
            androidx.camera.video.VideoRecordEvent$Finalize r7 = androidx.camera.video.VideoRecordEvent.finalizeWithError(r0, r3, r4, r7, r8)
        L5c:
            r5.updateVideoRecordEvent(r7)
            androidx.camera.video.Recorder$RecordingRecord r7 = r6.mInProgressRecording
            r6.mInProgressRecording = r2
            r8 = 0
            r6.mInProgressRecordingStopping = r8
            r6.mAudioTrackIndex = r2
            r6.mVideoTrackIndex = r2
            java.util.List<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r8 = r6.mEncodingFutures
            r8.clear()
            android.net.Uri r8 = android.net.Uri.EMPTY
            r6.mOutputUri = r8
            r3 = 0
            r6.mRecordingBytes = r3
            r6.mRecordingDurationNs = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.mFirstRecordingVideoDataTimeUs = r3
            r6.mFirstRecordingAudioDataTimeUs = r3
            r6.mPreviousRecordingVideoDataTimeUs = r3
            r6.mPreviousRecordingAudioDataTimeUs = r3
            r6.mRecordingStopError = r1
            r6.mRecordingStopErrorCause = r2
            r6.mAudioErrorCause = r2
            r3 = 0
            r6.mAudioAmplitude = r3
            r6.clearPendingAudioRingBuffer()
            r6.setInProgressTransformationInfo(r2)
            int[] r8 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$AudioState
            androidx.camera.video.Recorder$AudioState r0 = r6.mAudioState
            int r0 = r0.ordinal()
            r8 = r8[r0]
            if (r8 == r1) goto Lc2
            r0 = 2
            if (r8 == r0) goto Lc2
            r0 = 3
            if (r8 == r0) goto Lb7
            r0 = 4
            if (r8 == r0) goto Lb7
            r0 = 5
            if (r8 == r0) goto Laf
            goto Lc7
        Laf:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "Incorrectly finalize recording when audio state is IDLING"
            r7.<init>(r8)
            throw r7
        Lb7:
            androidx.camera.video.Recorder$AudioState r8 = androidx.camera.video.Recorder.AudioState.IDLING
            r6.setAudioState(r8)
            androidx.camera.video.internal.audio.AudioSource r8 = r6.mAudioSource
            r8.stop()
            goto Lc7
        Lc2:
            androidx.camera.video.Recorder$AudioState r8 = androidx.camera.video.Recorder.AudioState.INITIALIZING
            r6.setAudioState(r8)
        Lc7:
            r6.onRecordingFinalized(r7)
            return
        Lcb:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "Attempted to finalize in-progress recording, but no recording is in progress."
            r7.<init>(r8)
            throw r7
    }

    public int getAspectRatio() {
            r1 = this;
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> r0 = r1.mMediaSpec
            java.lang.Object r0 = r1.getObservableData(r0)
            androidx.camera.video.MediaSpec r0 = (androidx.camera.video.MediaSpec) r0
            androidx.camera.video.VideoSpec r0 = r0.getVideoSpec()
            int r0 = r0.getAspectRatio()
            return r0
    }

    int getAudioSource() {
            r1 = this;
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> r0 = r1.mMediaSpec
            java.lang.Object r0 = r1.getObservableData(r0)
            androidx.camera.video.MediaSpec r0 = (androidx.camera.video.MediaSpec) r0
            androidx.camera.video.AudioSpec r0 = r0.getAudioSpec()
            int r0 = r0.getSource()
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mUserProvidedExecutor
            return r0
    }

    @androidx.annotation.NonNull
    androidx.camera.video.RecordingStats getInProgressRecordingStats() {
            r8 = this;
            long r0 = r8.mRecordingDurationNs
            long r2 = r8.mRecordingBytes
            androidx.camera.video.Recorder$AudioState r4 = r8.mAudioState
            int r4 = r8.internalAudioStateToAudioStatsState(r4)
            java.lang.Throwable r5 = r8.mAudioErrorCause
            double r6 = r8.mAudioAmplitude
            androidx.camera.video.AudioStats r4 = androidx.camera.video.AudioStats.of(r4, r5, r6)
            androidx.camera.video.RecordingStats r0 = androidx.camera.video.RecordingStats.of(r0, r2, r4)
            return r0
    }

    @Override // androidx.camera.video.VideoOutput
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.camera.video.VideoCapabilities getMediaCapabilities(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r1) {
            r0 = this;
            androidx.camera.video.VideoCapabilities r1 = getVideoCapabilities(r1)
            return r1
    }

    @Override // androidx.camera.video.VideoOutput
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.camera.core.impl.Observable<androidx.camera.video.MediaSpec> getMediaSpec() {
            r1 = this;
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> r0 = r1.mMediaSpec
            return r0
    }

    <T> T getObservableData(@androidx.annotation.NonNull androidx.camera.core.impl.StateObservable<T> r2) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r2 = r2.fetchData()
            java.lang.Object r2 = r2.get()     // Catch: java.lang.InterruptedException -> L9 java.util.concurrent.ExecutionException -> Lb
            return r2
        L9:
            r2 = move-exception
            goto Lc
        Lb:
            r2 = move-exception
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.video.QualitySelector getQualitySelector() {
            r1 = this;
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> r0 = r1.mMediaSpec
            java.lang.Object r0 = r1.getObservableData(r0)
            androidx.camera.video.MediaSpec r0 = (androidx.camera.video.MediaSpec) r0
            androidx.camera.video.VideoSpec r0 = r0.getVideoSpec()
            androidx.camera.video.QualitySelector r0 = r0.getQualitySelector()
            return r0
    }

    @Override // androidx.camera.video.VideoOutput
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.camera.core.impl.Observable<androidx.camera.video.StreamInfo> getStreamInfo() {
            r1 = this;
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.StreamInfo> r0 = r1.mStreamInfo
            return r0
    }

    public int getTargetVideoEncodingBitRate() {
            r1 = this;
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> r0 = r1.mMediaSpec
            java.lang.Object r0 = r1.getObservableData(r0)
            androidx.camera.video.MediaSpec r0 = (androidx.camera.video.MediaSpec) r0
            androidx.camera.video.VideoSpec r0 = r0.getVideoSpec()
            android.util.Range r0 = r0.getBitrate()
            java.lang.Comparable r0 = r0.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    boolean isAudioEnabled() {
            r2 = this;
            androidx.camera.video.Recorder$AudioState r0 = r2.mAudioState
            androidx.camera.video.Recorder$AudioState r1 = androidx.camera.video.Recorder.AudioState.ENABLED
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    boolean isAudioSupported() {
            r1 = this;
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> r0 = r1.mMediaSpec
            java.lang.Object r0 = r1.getObservableData(r0)
            androidx.camera.video.MediaSpec r0 = (androidx.camera.video.MediaSpec) r0
            androidx.camera.video.AudioSpec r0 = r0.getAudioSpec()
            int r0 = r0.getChannelCount()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    boolean isPersistentRecordingInProgress() {
            r1 = this;
            androidx.camera.video.Recorder$RecordingRecord r0 = r1.mInProgressRecording
            if (r0 == 0) goto Lc
            boolean r0 = r0.isPersistent()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    void mute(@androidx.annotation.NonNull androidx.camera.video.Recording r4, boolean r5) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.video.Recorder$RecordingRecord r1 = r3.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r1 = isSameRecording(r4, r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            androidx.camera.video.Recorder$RecordingRecord r1 = r3.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r1 = isSameRecording(r4, r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            java.lang.String r5 = "Recorder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "mute() called on a recording that is no longer active: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.OutputOptions r4 = r4.getOutputOptions()     // Catch: java.lang.Throwable -> L2f
            r1.append(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            androidx.camera.core.Logger.d(r5, r4)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r4 = move-exception
            goto L4a
        L31:
            androidx.camera.video.Recorder$RecordingRecord r1 = r3.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r4 = isSameRecording(r4, r1)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L3c
            androidx.camera.video.Recorder$RecordingRecord r4 = r3.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L2f
            goto L3e
        L3c:
            androidx.camera.video.Recorder$RecordingRecord r4 = r3.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
        L3e:
            java.util.concurrent.Executor r1 = r3.mSequentialExecutor     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.j r2 = new androidx.camera.video.j     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L2f
            r1.execute(r2)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r4
    }

    void onConfigured() {
            r9 = this;
            java.lang.Object r0 = r9.mLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L1c
            androidx.camera.video.Recorder$State r2 = r9.mState     // Catch: java.lang.Throwable -> L1c
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L1c
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L1c
            r2 = 1
            r3 = 0
            r4 = 0
            switch(r1) {
                case 1: goto L79;
                case 2: goto L77;
                case 3: goto L52;
                case 4: goto L50;
                case 5: goto L37;
                case 6: goto L25;
                case 7: goto L1f;
                case 8: goto L14;
                case 9: goto L37;
                default: goto L13;
            }     // Catch: java.lang.Throwable -> L1c
        L13:
            goto L29
        L14:
            java.lang.String r1 = "Recorder"
            java.lang.String r5 = "onConfigured() was invoked when the Recorder had encountered error"
            androidx.camera.core.Logger.e(r1, r5)     // Catch: java.lang.Throwable -> L1c
            goto L29
        L1c:
            r1 = move-exception
            goto Lbf
        L1f:
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.IDLING     // Catch: java.lang.Throwable -> L1c
            r9.setState(r1)     // Catch: java.lang.Throwable -> L1c
            goto L29
        L25:
            boolean r1 = r9.mEncoderNotUsePersistentInputSurface     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L2f
        L29:
            r5 = r3
            r6 = r5
            r1 = 0
        L2c:
            r7 = 0
        L2d:
            r8 = 0
            goto L87
        L2f:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L37:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r2.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "Incorrectly invoke onConfigured() in state "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.video.Recorder$State r3 = r9.mState     // Catch: java.lang.Throwable -> L1c
            r2.append(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            androidx.camera.video.Recorder$RecordingRecord r5 = r9.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L5a
            r5 = r3
            r6 = r5
            goto L2c
        L5a:
            androidx.camera.video.VideoOutput$SourceState r5 = r9.mSourceState     // Catch: java.lang.Throwable -> L1c
            androidx.camera.video.VideoOutput$SourceState r6 = androidx.camera.video.VideoOutput.SourceState.INACTIVE     // Catch: java.lang.Throwable -> L1c
            if (r5 != r6) goto L6b
            androidx.camera.video.Recorder$RecordingRecord r5 = r9.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L1c
            r9.mPendingRecordingRecord = r3     // Catch: java.lang.Throwable -> L1c
            r9.restoreNonPendingState()     // Catch: java.lang.Throwable -> L1c
            java.lang.Exception r6 = androidx.camera.video.Recorder.PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE     // Catch: java.lang.Throwable -> L1c
            r7 = 4
            goto L2d
        L6b:
            androidx.camera.video.Recorder$State r5 = r9.mState     // Catch: java.lang.Throwable -> L1c
            androidx.camera.video.Recorder$RecordingRecord r5 = r9.makePendingRecordingActiveLocked(r5)     // Catch: java.lang.Throwable -> L1c
            r6 = r3
            r7 = 0
            r8 = 0
            r3 = r5
            r5 = r6
            goto L87
        L77:
            r1 = 0
            goto L7a
        L79:
            r1 = 1
        L7a:
            boolean r5 = r9.isPersistentRecordingInProgress()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording"
            androidx.core.util.Preconditions.checkState(r5, r6)     // Catch: java.lang.Throwable -> L1c
            r5 = r3
            r6 = r5
            r7 = 0
            r8 = 1
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            if (r8 == 0) goto Lb3
            androidx.camera.video.Recorder$RecordingRecord r0 = r9.mInProgressRecording
            r9.updateEncoderCallbacks(r0, r2)
            androidx.camera.video.internal.encoder.Encoder r0 = r9.mVideoEncoder
            r0.start()
            boolean r0 = r9.mShouldSendResumeEvent
            if (r0 == 0) goto Lab
            androidx.camera.video.Recorder$RecordingRecord r0 = r9.mInProgressRecording
            androidx.camera.video.OutputOptions r2 = r0.getOutputOptions()
            androidx.camera.video.RecordingStats r3 = r9.getInProgressRecordingStats()
            androidx.camera.video.VideoRecordEvent$Resume r2 = androidx.camera.video.VideoRecordEvent.resume(r2, r3)
            r0.updateVideoRecordEvent(r2)
            r9.mShouldSendResumeEvent = r4
        Lab:
            if (r1 == 0) goto Lbe
            androidx.camera.video.internal.encoder.Encoder r0 = r9.mVideoEncoder
            r0.pause()
            return
        Lb3:
            if (r3 == 0) goto Lb9
            r9.startRecording(r3, r1)
            return
        Lb9:
            if (r5 == 0) goto Lbe
            r9.finalizePendingRecording(r5, r7, r6)
        Lbe:
            return
        Lbf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    void onEncoderSetupError(@androidx.annotation.Nullable java.lang.Throwable r5) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L28
            androidx.camera.video.Recorder$State r2 = r4.mState     // Catch: java.lang.Throwable -> L28
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L28
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L28
            r2 = 0
            switch(r1) {
                case 1: goto L2a;
                case 2: goto L2a;
                case 3: goto L12;
                case 4: goto L12;
                case 5: goto L2a;
                case 6: goto L2a;
                case 7: goto L17;
                case 8: goto L11;
                case 9: goto L2a;
                default: goto L11;
            }     // Catch: java.lang.Throwable -> L28
        L11:
            goto L20
        L12:
            androidx.camera.video.Recorder$RecordingRecord r1 = r4.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L28
            r4.mPendingRecordingRecord = r2     // Catch: java.lang.Throwable -> L28
            r2 = r1
        L17:
            r1 = -1
            r4.setStreamId(r1)     // Catch: java.lang.Throwable -> L28
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.ERROR     // Catch: java.lang.Throwable -> L28
            r4.setState(r1)     // Catch: java.lang.Throwable -> L28
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L27
            r0 = 7
            r4.finalizePendingRecording(r2, r0, r5)
        L27:
            return
        L28:
            r5 = move-exception
            goto L4b
        L2a:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Encountered encoder setup error while in unexpected state "
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            androidx.camera.video.Recorder$State r3 = r4.mState     // Catch: java.lang.Throwable -> L28
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = ": "
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            r2.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r5
    }

    void onInProgressRecordingInternalError(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r10, int r11, @androidx.annotation.Nullable java.lang.Throwable r12) {
            r9 = this;
            androidx.camera.video.Recorder$RecordingRecord r0 = r9.mInProgressRecording
            if (r10 != r0) goto L53
            java.lang.Object r1 = r9.mLock
            monitor-enter(r1)
            int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r2 = r9.mState     // Catch: java.lang.Throwable -> L2f
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L2f
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            switch(r0) {
                case 1: goto L32;
                case 2: goto L32;
                case 3: goto L38;
                case 4: goto L38;
                case 5: goto L38;
                case 6: goto L38;
                case 7: goto L16;
                case 8: goto L16;
                case 9: goto L16;
                default: goto L15;
            }     // Catch: java.lang.Throwable -> L2f
        L15:
            goto L3c
        L16:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r11.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r12 = "In-progress recording error occurred while in unexpected state: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r12 = r9.mState     // Catch: java.lang.Throwable -> L2f
            r11.append(r12)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L2f
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L2f
            throw r10     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            r10 = r0
            goto L51
        L32:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.STOPPING     // Catch: java.lang.Throwable -> L2f
            r9.setState(r0)     // Catch: java.lang.Throwable -> L2f
            r2 = 1
        L38:
            androidx.camera.video.Recorder$RecordingRecord r0 = r9.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            if (r10 != r0) goto L49
        L3c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L48
            r5 = -1
            r3 = r9
            r4 = r10
            r7 = r11
            r8 = r12
            r3.stopInternal(r4, r5, r7, r8)
        L48:
            return
        L49:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2f
            java.lang.String r11 = "Internal error occurred for recording but it is not the active recording."
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L2f
            throw r10     // Catch: java.lang.Throwable -> L2f
        L51:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r10
        L53:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Internal error occurred on recording that is not the current in-progress recording."
            r10.<init>(r11)
            throw r10
    }

    @Override // androidx.camera.video.VideoOutput
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void onSourceStateChanged(@androidx.annotation.NonNull androidx.camera.video.VideoOutput.SourceState r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mSequentialExecutor
            androidx.camera.video.g r1 = new androidx.camera.video.g
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    void onSourceStateChangedInternal(@androidx.annotation.NonNull androidx.camera.video.VideoOutput.SourceState r4) {
            r3 = this;
            androidx.camera.video.VideoOutput$SourceState r0 = r3.mSourceState
            r3.mSourceState = r4
            java.lang.String r1 = "Recorder"
            if (r0 == r4) goto L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Video source has transitioned to state: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.video.VideoOutput$SourceState r0 = androidx.camera.video.VideoOutput.SourceState.INACTIVE
            r1 = 0
            if (r4 != r0) goto L3e
            android.view.Surface r4 = r3.mActiveSurface
            r0 = 0
            r2 = 4
            if (r4 != 0) goto L2b
            r3.requestReset(r2, r0, r1)
            return
        L2b:
            r4 = 1
            r3.mNeedsResetBeforeNextStart = r4
            androidx.camera.video.Recorder$RecordingRecord r4 = r3.mInProgressRecording
            if (r4 == 0) goto L53
            boolean r4 = r4.isPersistent()
            if (r4 != 0) goto L53
            androidx.camera.video.Recorder$RecordingRecord r4 = r3.mInProgressRecording
            r3.onInProgressRecordingInternalError(r4, r2, r0)
            return
        L3e:
            androidx.camera.video.VideoOutput$SourceState r0 = androidx.camera.video.VideoOutput.SourceState.ACTIVE_NON_STREAMING
            if (r4 != r0) goto L53
            java.util.concurrent.ScheduledFuture<?> r4 = r3.mSourceNonStreamingTimeout
            if (r4 == 0) goto L53
            boolean r4 = r4.cancel(r1)
            if (r4 == 0) goto L53
            androidx.camera.video.internal.encoder.Encoder r4 = r3.mVideoEncoder
            if (r4 == 0) goto L53
            notifyEncoderSourceStopped(r4)
        L53:
            return
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Video source transitions to the same state: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            androidx.camera.core.Logger.d(r1, r4)
            return
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r2) {
            r1 = this;
            androidx.camera.core.impl.Timebase r0 = androidx.camera.core.impl.Timebase.UPTIME
            r1.onSurfaceRequested(r2, r0)
            return
    }

    @Override // androidx.camera.video.VideoOutput
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void onSurfaceRequested(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r5, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r6) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            java.lang.String r1 = "Recorder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "Surface is requested in state: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            androidx.camera.video.Recorder$State r3 = r4.mState     // Catch: java.lang.Throwable -> L31
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = ", Current surface: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            int r3 = r4.mStreamId     // Catch: java.lang.Throwable -> L31
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L31
            androidx.camera.core.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L31
            androidx.camera.video.Recorder$State r1 = r4.mState     // Catch: java.lang.Throwable -> L31
            androidx.camera.video.Recorder$State r2 = androidx.camera.video.Recorder.State.ERROR     // Catch: java.lang.Throwable -> L31
            if (r1 != r2) goto L33
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.CONFIGURING     // Catch: java.lang.Throwable -> L31
            r4.setState(r1)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r5 = move-exception
            goto L3f
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.Executor r0 = r4.mSequentialExecutor
            androidx.camera.video.f r1 = new androidx.camera.video.f
            r1.<init>(r4, r5, r6)
            r0.execute(r1)
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r5
    }

    void onVideoEncoderReady(@androidx.annotation.NonNull androidx.camera.video.VideoEncoderSession r3) {
            r2 = this;
            androidx.camera.video.internal.encoder.Encoder r0 = r3.getVideoEncoder()
            r2.mVideoEncoder = r0
            androidx.camera.video.internal.encoder.EncoderInfo r0 = r0.getEncoderInfo()
            androidx.camera.video.internal.encoder.VideoEncoderInfo r0 = (androidx.camera.video.internal.encoder.VideoEncoderInfo) r0
            android.util.Range r0 = r0.getSupportedBitrateRange()
            r2.mVideoEncoderBitrateRange = r0
            androidx.camera.video.internal.encoder.Encoder r0 = r2.mVideoEncoder
            int r0 = r0.getConfiguredBitrate()
            r2.mFirstRecordingVideoBitrate = r0
            android.view.Surface r0 = r3.getActiveSurface()
            r2.mActiveSurface = r0
            r2.setLatestSurface(r0)
            java.util.concurrent.Executor r0 = r2.mSequentialExecutor
            androidx.camera.video.q r1 = new androidx.camera.video.q
            r1.<init>(r2)
            r3.setOnSurfaceUpdateListener(r0, r1)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.getReadyToReleaseFuture()
            androidx.camera.video.Recorder$2 r1 = new androidx.camera.video.Recorder$2
            r1.<init>(r2, r3)
            java.util.concurrent.Executor r3 = r2.mSequentialExecutor
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r3)
            return
    }

    void pause(@androidx.annotation.NonNull androidx.camera.video.Recording r5) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            androidx.camera.video.Recorder$RecordingRecord r1 = r4.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r1 = isSameRecording(r5, r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            androidx.camera.video.Recorder$RecordingRecord r1 = r4.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r1 = isSameRecording(r5, r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            java.lang.String r1 = "Recorder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "pause() called on a recording that is no longer active: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.OutputOptions r5 = r5.getOutputOptions()     // Catch: java.lang.Throwable -> L2f
            r2.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            androidx.camera.core.Logger.d(r1, r5)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r5 = move-exception
            goto L7b
        L31:
            int[] r5 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r1 = r4.mState     // Catch: java.lang.Throwable -> L2f
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L2f
            r5 = r5[r1]     // Catch: java.lang.Throwable -> L2f
            r1 = 2
            if (r5 == r1) goto L68
            r1 = 4
            if (r5 == r1) goto L62
            r1 = 7
            if (r5 == r1) goto L49
            r1 = 9
            if (r5 == r1) goto L49
            goto L79
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "Called pause() from invalid state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r2 = r4.mState     // Catch: java.lang.Throwable -> L2f
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            throw r5     // Catch: java.lang.Throwable -> L2f
        L62:
            androidx.camera.video.Recorder$State r5 = androidx.camera.video.Recorder.State.PENDING_PAUSED     // Catch: java.lang.Throwable -> L2f
            r4.setState(r5)     // Catch: java.lang.Throwable -> L2f
            goto L79
        L68:
            androidx.camera.video.Recorder$State r5 = androidx.camera.video.Recorder.State.PAUSED     // Catch: java.lang.Throwable -> L2f
            r4.setState(r5)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$RecordingRecord r5 = r4.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.Executor r1 = r4.mSequentialExecutor     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.p r2 = new androidx.camera.video.p     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2f
            r1.execute(r2)     // Catch: java.lang.Throwable -> L2f
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r5
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(26)
    public androidx.camera.video.PendingRecording prepareRecording(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull androidx.camera.video.FileDescriptorOutputOptions r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            androidx.camera.video.PendingRecording r3 = r2.prepareRecordingInternal(r3, r4)
            return r3
        Lb:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "File descriptors as output destinations are not supported on pre-Android O (API 26) devices."
            r3.<init>(r4)
            throw r3
    }

    @androidx.annotation.NonNull
    public androidx.camera.video.PendingRecording prepareRecording(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.camera.video.FileOutputOptions r2) {
            r0 = this;
            androidx.camera.video.PendingRecording r1 = r0.prepareRecordingInternal(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.camera.video.PendingRecording prepareRecording(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.camera.video.MediaStoreOutputOptions r2) {
            r0 = this;
            androidx.camera.video.PendingRecording r1 = r0.prepareRecordingInternal(r1, r2)
            return r1
    }

    void requestReset(int r11, @androidx.annotation.Nullable java.lang.Throwable r12, boolean r13) {
            r10 = this;
            java.lang.Object r1 = r10.mLock
            monitor-enter(r1)
            int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L1a
            androidx.camera.video.Recorder$State r2 = r10.mState     // Catch: java.lang.Throwable -> L1a
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L1a
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            r3 = 0
            switch(r0) {
                case 1: goto L23;
                case 2: goto L23;
                case 3: goto L1d;
                case 4: goto L1d;
                case 5: goto L12;
                case 6: goto L13;
                case 7: goto L54;
                case 8: goto L54;
                case 9: goto L54;
                default: goto L12;
            }     // Catch: java.lang.Throwable -> L1a
        L12:
            goto L18
        L13:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.RESETTING     // Catch: java.lang.Throwable -> L1a
            r10.setState(r0)     // Catch: java.lang.Throwable -> L1a
        L18:
            r2 = 0
            goto L54
        L1a:
            r0 = move-exception
            r11 = r0
            goto L76
        L1d:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.RESETTING     // Catch: java.lang.Throwable -> L1a
            r10.updateNonPendingState(r0)     // Catch: java.lang.Throwable -> L1a
            goto L54
        L23:
            androidx.camera.video.Recorder$RecordingRecord r0 = r10.mInProgressRecording     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "In-progress recording shouldn't be null when in state "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1a
            androidx.camera.video.Recorder$State r5 = r10.mState     // Catch: java.lang.Throwable -> L1a
            r4.append(r5)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1a
            androidx.core.util.Preconditions.checkState(r0, r4)     // Catch: java.lang.Throwable -> L1a
            androidx.camera.video.Recorder$RecordingRecord r0 = r10.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L1a
            androidx.camera.video.Recorder$RecordingRecord r4 = r10.mInProgressRecording     // Catch: java.lang.Throwable -> L1a
            if (r0 != r4) goto L6e
            boolean r0 = r10.isPersistentRecordingInProgress()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L4d
            goto L54
        L4d:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.RESETTING     // Catch: java.lang.Throwable -> L1a
            r10.setState(r0)     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            r3 = 1
        L54:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L61
            if (r13 == 0) goto L5d
            r10.resetVideo()
            return
        L5d:
            r10.reset()
            return
        L61:
            if (r3 == 0) goto L6d
            androidx.camera.video.Recorder$RecordingRecord r5 = r10.mInProgressRecording
            r6 = -1
            r4 = r10
            r8 = r11
            r9 = r12
            r4.stopInternal(r5, r6, r8, r9)
        L6d:
            return
        L6e:
            java.lang.AssertionError r11 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L1a
            java.lang.String r12 = "In-progress recording does not match the active recording. Unable to reset encoder."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L1a
            throw r11     // Catch: java.lang.Throwable -> L1a
        L76:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r11
    }

    void resume(@androidx.annotation.NonNull androidx.camera.video.Recording r5) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            androidx.camera.video.Recorder$RecordingRecord r1 = r4.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r1 = isSameRecording(r5, r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            androidx.camera.video.Recorder$RecordingRecord r1 = r4.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r1 = isSameRecording(r5, r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            java.lang.String r1 = "Recorder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "resume() called on a recording that is no longer active: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.OutputOptions r5 = r5.getOutputOptions()     // Catch: java.lang.Throwable -> L2f
            r2.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            androidx.camera.core.Logger.d(r1, r5)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r5 = move-exception
            goto L7b
        L31:
            int[] r5 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r1 = r4.mState     // Catch: java.lang.Throwable -> L2f
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L2f
            r5 = r5[r1]     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            if (r5 == r1) goto L68
            r1 = 3
            if (r5 == r1) goto L62
            r1 = 7
            if (r5 == r1) goto L49
            r1 = 9
            if (r5 == r1) goto L49
            goto L79
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "Called resume() from invalid state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r2 = r4.mState     // Catch: java.lang.Throwable -> L2f
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            throw r5     // Catch: java.lang.Throwable -> L2f
        L62:
            androidx.camera.video.Recorder$State r5 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch: java.lang.Throwable -> L2f
            r4.setState(r5)     // Catch: java.lang.Throwable -> L2f
            goto L79
        L68:
            androidx.camera.video.Recorder$State r5 = androidx.camera.video.Recorder.State.RECORDING     // Catch: java.lang.Throwable -> L2f
            r4.setState(r5)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$RecordingRecord r5 = r4.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.Executor r1 = r4.mSequentialExecutor     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.i r2 = new androidx.camera.video.i     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2f
            r1.execute(r2)     // Catch: java.lang.Throwable -> L2f
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r5
    }

    void setAudioState(@androidx.annotation.NonNull androidx.camera.video.Recorder.AudioState r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Transitioning audio state: "
            r0.append(r1)
            androidx.camera.video.Recorder$AudioState r1 = r2.mAudioState
            r0.append(r1)
            java.lang.String r1 = " --> "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Recorder"
            androidx.camera.core.Logger.d(r1, r0)
            r2.mAudioState = r3
            return
    }

    void setInProgressTransformationInfo(@androidx.annotation.Nullable androidx.camera.core.SurfaceRequest.TransformationInfo r5) {
            r4 = this;
            java.lang.String r0 = "Recorder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Update stream transformation info: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            androidx.camera.core.Logger.d(r0, r1)
            r4.mInProgressTransformationInfo = r5
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.StreamInfo> r1 = r4.mStreamInfo     // Catch: java.lang.Throwable -> L2e
            int r2 = r4.mStreamId     // Catch: java.lang.Throwable -> L2e
            androidx.camera.video.Recorder$State r3 = r4.mState     // Catch: java.lang.Throwable -> L2e
            androidx.camera.video.StreamInfo$StreamState r3 = r4.internalStateToStreamState(r3)     // Catch: java.lang.Throwable -> L2e
            androidx.camera.video.StreamInfo r5 = androidx.camera.video.StreamInfo.of(r2, r3, r5)     // Catch: java.lang.Throwable -> L2e
            r1.setState(r5)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r5
    }

    void setLatestSurface(@androidx.annotation.Nullable android.view.Surface r2) {
            r1 = this;
            android.view.Surface r0 = r1.mLatestSurface
            if (r0 != r2) goto L5
            return
        L5:
            r1.mLatestSurface = r2
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            if (r2 == 0) goto L13
            int r2 = r2.hashCode()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r2 = move-exception
            goto L19
        L13:
            r2 = 0
        L14:
            r1.setStreamId(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    @androidx.annotation.GuardedBy("mLock")
    void setState(@androidx.annotation.NonNull androidx.camera.video.Recorder.State r4) {
            r3 = this;
            androidx.camera.video.Recorder$State r0 = r3.mState
            if (r0 == r4) goto L7d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Transitioning Recorder internal state: "
            r0.append(r1)
            androidx.camera.video.Recorder$State r1 = r3.mState
            r0.append(r1)
            java.lang.String r1 = " --> "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Recorder"
            androidx.camera.core.Logger.d(r1, r0)
            java.util.Set<androidx.camera.video.Recorder$State> r0 = androidx.camera.video.Recorder.PENDING_STATES
            boolean r1 = r0.contains(r4)
            r2 = 0
            if (r1 == 0) goto L61
            androidx.camera.video.Recorder$State r1 = r3.mState
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L67
            java.util.Set<androidx.camera.video.Recorder$State> r0 = androidx.camera.video.Recorder.VALID_NON_PENDING_STATES_WHILE_PENDING
            androidx.camera.video.Recorder$State r1 = r3.mState
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L48
            androidx.camera.video.Recorder$State r0 = r3.mState
            r3.mNonPendingState = r0
            androidx.camera.video.StreamInfo$StreamState r2 = r3.internalStateToStreamState(r0)
            goto L67
        L48:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.append(r1)
            androidx.camera.video.Recorder$State r1 = r3.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L61:
            androidx.camera.video.Recorder$State r0 = r3.mNonPendingState
            if (r0 == 0) goto L67
            r3.mNonPendingState = r2
        L67:
            r3.mState = r4
            if (r2 != 0) goto L6f
            androidx.camera.video.StreamInfo$StreamState r2 = r3.internalStateToStreamState(r4)
        L6f:
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.StreamInfo> r4 = r3.mStreamInfo
            int r0 = r3.mStreamId
            androidx.camera.core.SurfaceRequest$TransformationInfo r1 = r3.mInProgressTransformationInfo
            androidx.camera.video.StreamInfo r0 = androidx.camera.video.StreamInfo.of(r0, r2, r1)
            r4.setState(r0)
            return
        L7d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Attempted to transition to state "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", but Recorder is already in state "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    void setupAndStartMediaMuxer(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r11) {
            r10 = this;
            android.media.MediaMuxer r0 = r10.mMediaMuxer
            if (r0 != 0) goto L152
            boolean r0 = r10.isAudioEnabled()
            if (r0 == 0) goto L1b
            androidx.camera.core.internal.utils.RingBuffer<androidx.camera.video.internal.encoder.EncodedData> r0 = r10.mPendingAudioRingBuffer
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            goto L1b
        L13:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = "Audio is enabled but no audio sample is ready. Cannot start media muxer."
            r11.<init>(r0)
            throw r11
        L1b:
            androidx.camera.video.internal.encoder.EncodedData r0 = r10.mPendingFirstVideoData
            if (r0 == 0) goto L14a
            r1 = 0
            r10.mPendingFirstVideoData = r1     // Catch: java.lang.Throwable -> L44
            long r2 = r0.getPresentationTimeUs()     // Catch: java.lang.Throwable -> L44
            java.util.List r2 = r10.getAudioDataToWriteAndClearCache(r2)     // Catch: java.lang.Throwable -> L44
            long r3 = r0.size()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r5 = r2.iterator()     // Catch: java.lang.Throwable -> L44
        L32:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L47
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L44
            androidx.camera.video.internal.encoder.EncodedData r6 = (androidx.camera.video.internal.encoder.EncodedData) r6     // Catch: java.lang.Throwable -> L44
            long r6 = r6.size()     // Catch: java.lang.Throwable -> L44
            long r3 = r3 + r6
            goto L32
        L44:
            r11 = move-exception
            goto L13f
        L47:
            long r5 = r10.mFileSizeLimitInBytes     // Catch: java.lang.Throwable -> L44
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L78
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L78
            java.lang.String r2 = "Recorder"
            java.lang.String r5 = "Initial data exceeds file size limit %d > %d"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L44
            long r6 = r10.mFileSizeLimitInBytes     // Catch: java.lang.Throwable -> L44
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L44
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L44
            r8 = 0
            r7[r8] = r3     // Catch: java.lang.Throwable -> L44
            r3 = 1
            r7[r3] = r4     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = java.lang.String.format(r5, r7)     // Catch: java.lang.Throwable -> L44
            androidx.camera.core.Logger.d(r2, r3)     // Catch: java.lang.Throwable -> L44
            r10.onInProgressRecordingInternalError(r11, r6, r1)     // Catch: java.lang.Throwable -> L44
            r0.close()
            return
        L78:
            r1 = 5
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> r3 = r10.mMediaSpec     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            java.lang.Object r3 = r10.getObservableData(r3)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            androidx.camera.video.MediaSpec r3 = (androidx.camera.video.MediaSpec) r3     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            int r4 = r3.getOutputFormat()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            r5 = -1
            if (r4 != r5) goto L9c
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r3 = r10.mResolvedEncoderProfiles     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            androidx.camera.video.MediaSpec r4 = androidx.camera.video.Recorder.MEDIA_SPEC_DEFAULT     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            int r4 = r4.getOutputFormat()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            int r4 = androidx.camera.video.MediaSpec.outputFormatToMuxerFormat(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            int r3 = supportedMuxerFormatOrDefaultFrom(r3, r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            goto La4
        L99:
            r2 = move-exception
            goto L138
        L9c:
            int r3 = r3.getOutputFormat()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            int r3 = androidx.camera.video.MediaSpec.outputFormatToMuxerFormat(r3)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
        La4:
            androidx.camera.video.s r4 = new androidx.camera.video.s     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            android.media.MediaMuxer r3 = r11.performOneTimeMediaMuxerCreation(r3, r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L99
            androidx.camera.core.SurfaceRequest$TransformationInfo r4 = r10.mSourceTransformationInfo     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto Lbb
            r10.setInProgressTransformationInfo(r4)     // Catch: java.lang.Throwable -> L44
            int r4 = r4.getRotationDegrees()     // Catch: java.lang.Throwable -> L44
            r3.setOrientationHint(r4)     // Catch: java.lang.Throwable -> L44
        Lbb:
            androidx.camera.video.OutputOptions r4 = r11.getOutputOptions()     // Catch: java.lang.Throwable -> L44
            android.location.Location r4 = r4.getLocation()     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto Lf2
            double r5 = r4.getLatitude()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            double r7 = r4.getLongitude()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            android.util.Pair r4 = androidx.camera.video.internal.workaround.CorrectNegativeLatLongForMediaMuxer.adjustGeoLocation(r5, r7)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            java.lang.Object r5 = r4.first     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            java.lang.Double r5 = (java.lang.Double) r5     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            double r5 = r5.doubleValue()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            java.lang.Object r4 = r4.second     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            java.lang.Double r4 = (java.lang.Double) r4     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            double r6 = r4.doubleValue()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            float r4 = (float) r6     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            r3.setLocation(r5, r4)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> Le7
            goto Lf2
        Le7:
            r2 = move-exception
            r3.release()     // Catch: java.lang.Throwable -> L44
            r10.onInProgressRecordingInternalError(r11, r1, r2)     // Catch: java.lang.Throwable -> L44
            r0.close()
            return
        Lf2:
            androidx.camera.video.internal.encoder.OutputConfig r1 = r10.mVideoOutputConfig     // Catch: java.lang.Throwable -> L44
            android.media.MediaFormat r1 = r1.getMediaFormat()     // Catch: java.lang.Throwable -> L44
            int r1 = r3.addTrack(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L44
            r10.mVideoTrackIndex = r1     // Catch: java.lang.Throwable -> L44
            boolean r1 = r10.isAudioEnabled()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L118
            androidx.camera.video.internal.encoder.OutputConfig r1 = r10.mAudioOutputConfig     // Catch: java.lang.Throwable -> L44
            android.media.MediaFormat r1 = r1.getMediaFormat()     // Catch: java.lang.Throwable -> L44
            int r1 = r3.addTrack(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L44
            r10.mAudioTrackIndex = r1     // Catch: java.lang.Throwable -> L44
        L118:
            r3.start()     // Catch: java.lang.Throwable -> L44
            r10.mMediaMuxer = r3     // Catch: java.lang.Throwable -> L44
            r10.writeVideoData(r0, r11)     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L44
        L124:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L134
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L44
            androidx.camera.video.internal.encoder.EncodedData r2 = (androidx.camera.video.internal.encoder.EncodedData) r2     // Catch: java.lang.Throwable -> L44
            r10.writeAudioData(r2, r11)     // Catch: java.lang.Throwable -> L44
            goto L124
        L134:
            r0.close()
            return
        L138:
            r10.onInProgressRecordingInternalError(r11, r1, r2)     // Catch: java.lang.Throwable -> L44
            r0.close()
            return
        L13f:
            if (r0 == 0) goto L149
            r0.close()     // Catch: java.lang.Throwable -> L145
            goto L149
        L145:
            r0 = move-exception
            r11.addSuppressed(r0)
        L149:
            throw r11
        L14a:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = "Media muxer cannot be started without an encoded video frame."
            r11.<init>(r0)
            throw r11
        L152:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = "Unable to set up media muxer when one already exists."
            r11.<init>(r0)
            throw r11
    }

    @androidx.annotation.NonNull
    androidx.camera.video.Recording start(@androidx.annotation.NonNull androidx.camera.video.PendingRecording r10) {
            r9 = this;
            java.lang.String r0 = "The given PendingRecording cannot be null."
            androidx.core.util.Preconditions.checkNotNull(r10, r0)
            java.lang.Object r0 = r9.mLock
            monitor-enter(r0)
            long r1 = r9.mLastGeneratedRecordingId     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            long r1 = r1 + r3
            r9.mLastGeneratedRecordingId = r1     // Catch: java.lang.Throwable -> L2f
            int[] r3 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r4 = r9.mState     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L2f
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            r5 = 0
            switch(r3) {
                case 1: goto L84;
                case 2: goto L84;
                case 3: goto L78;
                case 4: goto L78;
                case 5: goto L1f;
                case 6: goto L1f;
                case 7: goto L1f;
                case 8: goto L1f;
                case 9: goto L1f;
                default: goto L1e;
            }     // Catch: java.lang.Throwable -> L2f
        L1e:
            goto L74
        L1f:
            androidx.camera.video.Recorder$State r3 = r9.mState     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r6 = androidx.camera.video.Recorder.State.IDLING     // Catch: java.lang.Throwable -> L2f
            if (r3 != r6) goto L38
            androidx.camera.video.Recorder$RecordingRecord r3 = r9.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L32
            androidx.camera.video.Recorder$RecordingRecord r3 = r9.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L32
            r3 = 1
            goto L33
        L2f:
            r10 = move-exception
            goto Lbb
        L32:
            r3 = 0
        L33:
            java.lang.String r7 = "Expected recorder to be idle but a recording is either pending or in progress."
            androidx.core.util.Preconditions.checkState(r3, r7)     // Catch: java.lang.Throwable -> L2f
        L38:
            androidx.camera.video.Recorder$RecordingRecord r3 = androidx.camera.video.Recorder.RecordingRecord.from(r10, r1)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            android.content.Context r7 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            r3.initializeRecording(r7)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            r9.mPendingRecordingRecord = r3     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            androidx.camera.video.Recorder$State r3 = r9.mState     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            if (r3 != r6) goto L5b
            androidx.camera.video.Recorder$State r3 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            r9.setState(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            java.util.concurrent.Executor r3 = r9.mSequentialExecutor     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            androidx.camera.video.l r6 = new androidx.camera.video.l     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            r3.execute(r6)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            goto L74
        L59:
            r3 = move-exception
            goto L76
        L5b:
            androidx.camera.video.Recorder$State r6 = androidx.camera.video.Recorder.State.ERROR     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            if (r3 != r6) goto L6f
            androidx.camera.video.Recorder$State r3 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            r9.setState(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            java.util.concurrent.Executor r3 = r9.mSequentialExecutor     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            androidx.camera.video.m r6 = new androidx.camera.video.m     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            r3.execute(r6)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            goto L74
        L6f:
            androidx.camera.video.Recorder$State r3 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
            r9.setState(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L59
        L74:
            r3 = r4
            goto L87
        L76:
            r5 = 5
            goto L87
        L78:
            androidx.camera.video.Recorder$RecordingRecord r3 = r9.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$RecordingRecord r3 = (androidx.camera.video.Recorder.RecordingRecord) r3     // Catch: java.lang.Throwable -> L2f
        L80:
            r8 = r4
            r4 = r3
            r3 = r8
            goto L87
        L84:
            androidx.camera.video.Recorder$RecordingRecord r3 = r9.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            goto L80
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto Lb3
            if (r5 == 0) goto Lae
            java.lang.String r0 = "Recorder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Recording was started when the Recorder had encountered error "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            androidx.camera.core.Logger.e(r0, r4)
            androidx.camera.video.Recorder$RecordingRecord r0 = androidx.camera.video.Recorder.RecordingRecord.from(r10, r1)
            r9.finalizePendingRecording(r0, r5, r3)
            androidx.camera.video.Recording r10 = androidx.camera.video.Recording.createFinalizedFrom(r10, r1)
            return r10
        Lae:
            androidx.camera.video.Recording r10 = androidx.camera.video.Recording.from(r10, r1)
            return r10
        Lb3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "A recording is already in progress. Previous recordings must be stopped before a new recording can be started."
            r10.<init>(r0)
            throw r10
        Lbb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r10
    }

    void stop(@androidx.annotation.NonNull androidx.camera.video.Recording r13, int r14, @androidx.annotation.Nullable java.lang.Throwable r15) {
            r12 = this;
            java.lang.Object r1 = r12.mLock
            monitor-enter(r1)
            androidx.camera.video.Recorder$RecordingRecord r0 = r12.mPendingRecordingRecord     // Catch: java.lang.Throwable -> La7
            boolean r0 = isSameRecording(r13, r0)     // Catch: java.lang.Throwable -> La7
            if (r0 != 0) goto L34
            androidx.camera.video.Recorder$RecordingRecord r0 = r12.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r0 = isSameRecording(r13, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L34
            java.lang.String r14 = "Recorder"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r15.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            r15.append(r0)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.OutputOptions r13 = r13.getOutputOptions()     // Catch: java.lang.Throwable -> L2f
            r15.append(r13)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r13 = r15.toString()     // Catch: java.lang.Throwable -> L2f
            androidx.camera.core.Logger.d(r14, r13)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r0 = move-exception
            r13 = r0
            r6 = r12
            goto Laa
        L34:
            int[] r0 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> La7
            androidx.camera.video.Recorder$State r2 = r12.mState     // Catch: java.lang.Throwable -> La7
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> La7
            r0 = r0[r2]     // Catch: java.lang.Throwable -> La7
            r2 = 0
            switch(r0) {
                case 1: goto L6b;
                case 2: goto L6b;
                case 3: goto L56;
                case 4: goto L56;
                case 5: goto L4c;
                case 6: goto L4c;
                case 7: goto L44;
                case 8: goto L42;
                case 9: goto L44;
                default: goto L42;
            }
        L42:
            r6 = r12
            goto L68
        L44:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r14 = "Calling stop() while idling or initializing is invalid."
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L2f
            throw r13     // Catch: java.lang.Throwable -> L2f
        L4c:
            androidx.camera.video.Recorder$RecordingRecord r0 = r12.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r13 = isSameRecording(r13, r0)     // Catch: java.lang.Throwable -> L2f
            androidx.core.util.Preconditions.checkState(r13)     // Catch: java.lang.Throwable -> L2f
            goto L42
        L56:
            androidx.camera.video.Recorder$RecordingRecord r0 = r12.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r13 = isSameRecording(r13, r0)     // Catch: java.lang.Throwable -> L2f
            androidx.core.util.Preconditions.checkState(r13)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$RecordingRecord r13 = r12.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L2f
            r12.mPendingRecordingRecord = r2     // Catch: java.lang.Throwable -> L2f
            r12.restoreNonPendingState()     // Catch: java.lang.Throwable -> L2f
            r6 = r12
            r2 = r13
        L68:
            r10 = r14
            r11 = r15
            goto L89
        L6b:
            androidx.camera.video.Recorder$State r13 = androidx.camera.video.Recorder.State.STOPPING     // Catch: java.lang.Throwable -> La7
            r12.setState(r13)     // Catch: java.lang.Throwable -> La7
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> La7
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La7
            long r8 = r13.toMicros(r3)     // Catch: java.lang.Throwable -> La7
            androidx.camera.video.Recorder$RecordingRecord r7 = r12.mActiveRecordingRecord     // Catch: java.lang.Throwable -> La7
            java.util.concurrent.Executor r13 = r12.mSequentialExecutor     // Catch: java.lang.Throwable -> La7
            androidx.camera.video.u r5 = new androidx.camera.video.u     // Catch: java.lang.Throwable -> La7
            r6 = r12
            r10 = r14
            r11 = r15
            r5.<init>(r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> La4
            r13.execute(r5)     // Catch: java.lang.Throwable -> La4
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto La3
            r13 = 10
            if (r10 != r13) goto L97
            java.lang.String r13 = "Recorder"
            java.lang.String r14 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            androidx.camera.core.Logger.e(r13, r14)
        L97:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Recording was stopped before any data could be produced."
            r13.<init>(r14, r11)
            r14 = 8
            r12.finalizePendingRecording(r2, r14, r13)
        La3:
            return
        La4:
            r0 = move-exception
        La5:
            r13 = r0
            goto Laa
        La7:
            r0 = move-exception
            r6 = r12
            goto La5
        Laa:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            throw r13
    }

    void stopInternal(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r3, long r4, int r6, @androidx.annotation.Nullable java.lang.Throwable r7) {
            r2 = this;
            androidx.camera.video.Recorder$RecordingRecord r0 = r2.mInProgressRecording
            if (r0 != r3) goto L4d
            boolean r3 = r2.mInProgressRecordingStopping
            if (r3 != 0) goto L4d
            r3 = 1
            r2.mInProgressRecordingStopping = r3
            r2.mRecordingStopError = r6
            r2.mRecordingStopErrorCause = r7
            boolean r3 = r2.isAudioEnabled()
            if (r3 == 0) goto L1d
            r2.clearPendingAudioRingBuffer()
            androidx.camera.video.internal.encoder.Encoder r3 = r2.mAudioEncoder
            r3.stop(r4)
        L1d:
            androidx.camera.video.internal.encoder.EncodedData r3 = r2.mPendingFirstVideoData
            if (r3 == 0) goto L27
            r3.close()
            r3 = 0
            r2.mPendingFirstVideoData = r3
        L27:
            androidx.camera.video.VideoOutput$SourceState r3 = r2.mSourceState
            androidx.camera.video.VideoOutput$SourceState r6 = androidx.camera.video.VideoOutput.SourceState.ACTIVE_NON_STREAMING
            if (r3 == r6) goto L43
            androidx.camera.video.internal.encoder.Encoder r3 = r2.mVideoEncoder
            java.util.concurrent.ScheduledExecutorService r6 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.video.t r7 = new androidx.camera.video.t
            r7.<init>(r2, r3)
            r0 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r3 = r6.schedule(r7, r0, r3)
            r2.mSourceNonStreamingTimeout = r3
            goto L48
        L43:
            androidx.camera.video.internal.encoder.Encoder r3 = r2.mVideoEncoder
            notifyEncoderSourceStopped(r3)
        L48:
            androidx.camera.video.internal.encoder.Encoder r3 = r2.mVideoEncoder
            r3.stop(r4)
        L4d:
            return
    }

    void tryServicePendingRecording() {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.video.Recorder.AnonymousClass8.$SwitchMap$androidx$camera$video$Recorder$State     // Catch: java.lang.Throwable -> L38
            androidx.camera.video.Recorder$State r2 = r8.mState     // Catch: java.lang.Throwable -> L38
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L38
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L38
            r2 = 3
            r3 = 4
            r4 = 0
            r5 = 0
            if (r1 == r2) goto L1b
            if (r1 == r3) goto L19
        L15:
            r1 = r5
            r2 = r1
            r3 = 0
            goto L4c
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            androidx.camera.video.Recorder$RecordingRecord r2 = r8.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L4a
            boolean r2 = r8.mNeedsResetBeforeNextStart     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L25
            goto L4a
        L25:
            androidx.camera.video.VideoOutput$SourceState r2 = r8.mSourceState     // Catch: java.lang.Throwable -> L38
            androidx.camera.video.VideoOutput$SourceState r6 = androidx.camera.video.VideoOutput.SourceState.INACTIVE     // Catch: java.lang.Throwable -> L38
            if (r2 != r6) goto L3a
            androidx.camera.video.Recorder$RecordingRecord r2 = r8.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L38
            r8.mPendingRecordingRecord = r5     // Catch: java.lang.Throwable -> L38
            r8.restoreNonPendingState()     // Catch: java.lang.Throwable -> L38
            java.lang.Exception r4 = androidx.camera.video.Recorder.PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE     // Catch: java.lang.Throwable -> L38
            r7 = r4
            r4 = r1
            r1 = r7
            goto L4c
        L38:
            r1 = move-exception
            goto L59
        L3a:
            androidx.camera.video.internal.encoder.Encoder r2 = r8.mVideoEncoder     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L4a
            androidx.camera.video.Recorder$State r2 = r8.mState     // Catch: java.lang.Throwable -> L38
            androidx.camera.video.Recorder$RecordingRecord r2 = r8.makePendingRecordingActiveLocked(r2)     // Catch: java.lang.Throwable -> L38
            r4 = r1
            r1 = r5
            r3 = 0
            r5 = r2
            r2 = r1
            goto L4c
        L4a:
            r4 = r1
            goto L15
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L53
            r8.startRecording(r5, r4)
            return
        L53:
            if (r2 == 0) goto L58
            r8.finalizePendingRecording(r2, r3, r1)
        L58:
            return
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r1
    }

    void updateInProgressStatusEvent() {
            r3 = this;
            androidx.camera.video.Recorder$RecordingRecord r0 = r3.mInProgressRecording
            if (r0 == 0) goto L13
            androidx.camera.video.OutputOptions r1 = r0.getOutputOptions()
            androidx.camera.video.RecordingStats r2 = r3.getInProgressRecordingStats()
            androidx.camera.video.VideoRecordEvent$Status r1 = androidx.camera.video.VideoRecordEvent.status(r1, r2)
            r0.updateVideoRecordEvent(r1)
        L13:
            return
    }

    void writeAudioData(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncodedData r22, @androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r23) {
            r21 = this;
            r0 = r21
            r1 = r23
            long r2 = r0.mRecordingBytes
            long r4 = r22.size()
            long r2 = r2 + r4
            long r4 = r0.mFileSizeLimitInBytes
            r6 = 1
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r10 = "Recorder"
            r11 = 0
            int r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r13 == 0) goto L3a
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 <= 0) goto L3a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r0.mFileSizeLimitInBytes
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r2
            r4[r6] = r3
            java.lang.String r2 = "Reach file size limit %d > %d"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            androidx.camera.core.Logger.d(r10, r2)
            r0.onInProgressRecordingInternalError(r1, r8, r9)
            return
        L3a:
            long r4 = r22.getPresentationTimeUs()
            long r13 = r0.mFirstRecordingAudioDataTimeUs
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L65
            r0.mFirstRecordingAudioDataTimeUs = r4
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            long r11 = r0.mFirstRecordingAudioDataTimeUs
            java.lang.String r9 = androidx.camera.video.internal.DebugUtils.readableUs(r11)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r7] = r1
            r8[r6] = r9
            java.lang.String r1 = "First audio time: %d (%s)"
            java.lang.String r1 = java.lang.String.format(r1, r8)
            androidx.camera.core.Logger.d(r10, r1)
            goto Lb7
        L65:
            r17 = 1
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS
            r18 = r11
            long r11 = r0.mFirstRecordingVideoDataTimeUs
            long r11 = java.lang.Math.min(r11, r13)
            long r11 = r4 - r11
            long r11 = r6.toNanos(r11)
            long r13 = r0.mPreviousRecordingAudioDataTimeUs
            int r20 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r20 == 0) goto L7f
            r13 = 1
            goto L80
        L7f:
            r13 = 0
        L80:
            java.lang.String r14 = "There should be a previous data for adjusting the duration."
            androidx.core.util.Preconditions.checkState(r13, r14)
            long r13 = r0.mPreviousRecordingAudioDataTimeUs
            long r13 = r4 - r13
            long r13 = r6.toNanos(r13)
            long r11 = r11 + r13
            long r13 = r0.mDurationLimitNs
            int r6 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r6 == 0) goto Lb7
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 <= 0) goto Lb7
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            long r3 = r0.mDurationLimitNs
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r2
            r4[r17] = r3
            java.lang.String r2 = "Audio data reaches duration limit %d > %d"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            androidx.camera.core.Logger.d(r10, r2)
            r2 = 9
            r0.onInProgressRecordingInternalError(r1, r2, r9)
            return
        Lb7:
            android.media.MediaMuxer r1 = r0.mMediaMuxer
            java.lang.Integer r6 = r0.mAudioTrackIndex
            int r6 = r6.intValue()
            java.nio.ByteBuffer r7 = r22.getByteBuffer()
            android.media.MediaCodec$BufferInfo r8 = r22.getBufferInfo()
            r1.writeSampleData(r6, r7, r8)
            r0.mRecordingBytes = r2
            r0.mPreviousRecordingAudioDataTimeUs = r4
            return
    }

    void writeVideoData(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncodedData r22, @androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r23) {
            r21 = this;
            r0 = r21
            r1 = r23
            java.lang.Integer r2 = r0.mVideoTrackIndex
            if (r2 == 0) goto Lda
            long r2 = r0.mRecordingBytes
            long r4 = r22.size()
            long r2 = r2 + r4
            long r4 = r0.mFileSizeLimitInBytes
            r6 = 1
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r10 = "Recorder"
            r11 = 0
            int r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r13 == 0) goto L3e
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 <= 0) goto L3e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r0.mFileSizeLimitInBytes
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r2
            r4[r6] = r3
            java.lang.String r2 = "Reach file size limit %d > %d"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            androidx.camera.core.Logger.d(r10, r2)
            r0.onInProgressRecordingInternalError(r1, r8, r9)
            return
        L3e:
            long r4 = r22.getPresentationTimeUs()
            long r13 = r0.mFirstRecordingVideoDataTimeUs
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L69
            r0.mFirstRecordingVideoDataTimeUs = r4
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            long r13 = r0.mFirstRecordingVideoDataTimeUs
            java.lang.String r9 = androidx.camera.video.internal.DebugUtils.readableUs(r13)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r7] = r1
            r8[r6] = r9
            java.lang.String r1 = "First video time: %d (%s)"
            java.lang.String r1 = java.lang.String.format(r1, r8)
            androidx.camera.core.Logger.d(r10, r1)
            goto Lbd
        L69:
            r17 = 1
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS
            r18 = r11
            long r11 = r0.mFirstRecordingAudioDataTimeUs
            long r11 = java.lang.Math.min(r13, r11)
            long r11 = r4 - r11
            long r11 = r6.toNanos(r11)
            long r13 = r0.mPreviousRecordingVideoDataTimeUs
            int r20 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r20 == 0) goto L83
            r13 = 1
            goto L84
        L83:
            r13 = 0
        L84:
            java.lang.String r14 = "There should be a previous data for adjusting the duration."
            androidx.core.util.Preconditions.checkState(r13, r14)
            long r13 = r0.mPreviousRecordingVideoDataTimeUs
            long r13 = r4 - r13
            long r13 = r6.toNanos(r13)
            long r13 = r13 + r11
            r6 = r10
            long r9 = r0.mDurationLimitNs
            int r16 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r16 == 0) goto Lbd
            int r16 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r16 <= 0) goto Lbd
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            long r3 = r0.mDurationLimitNs
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r2
            r4[r17] = r3
            java.lang.String r2 = "Video data reaches duration limit %d > %d"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            androidx.camera.core.Logger.d(r6, r2)
            r2 = 9
            r15 = 0
            r0.onInProgressRecordingInternalError(r1, r2, r15)
            return
        Lbd:
            android.media.MediaMuxer r1 = r0.mMediaMuxer
            java.lang.Integer r6 = r0.mVideoTrackIndex
            int r6 = r6.intValue()
            java.nio.ByteBuffer r7 = r22.getByteBuffer()
            android.media.MediaCodec$BufferInfo r8 = r22.getBufferInfo()
            r1.writeSampleData(r6, r7, r8)
            r0.mRecordingBytes = r2
            r0.mRecordingDurationNs = r11
            r0.mPreviousRecordingVideoDataTimeUs = r4
            r0.updateInProgressStatusEvent()
            return
        Lda:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Video data comes before the track is added to MediaMuxer."
            r1.<init>(r2)
            throw r1
    }
}
