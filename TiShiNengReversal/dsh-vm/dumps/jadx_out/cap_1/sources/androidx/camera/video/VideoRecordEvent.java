package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class VideoRecordEvent {
    private final androidx.camera.video.OutputOptions mOutputOptions;
    private final androidx.camera.video.RecordingStats mRecordingStats;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Finalize extends androidx.camera.video.VideoRecordEvent {
        public static final int ERROR_DURATION_LIMIT_REACHED = 9;
        public static final int ERROR_ENCODING_FAILED = 6;
        public static final int ERROR_FILE_SIZE_LIMIT_REACHED = 2;
        public static final int ERROR_INSUFFICIENT_STORAGE = 3;
        public static final int ERROR_INVALID_OUTPUT_OPTIONS = 5;
        public static final int ERROR_NONE = 0;
        public static final int ERROR_NO_VALID_DATA = 8;
        public static final int ERROR_RECORDER_ERROR = 7;
        public static final int ERROR_RECORDING_GARBAGE_COLLECTED = 10;
        public static final int ERROR_SOURCE_INACTIVE = 4;
        public static final int ERROR_UNKNOWN = 1;
        private final java.lang.Throwable mCause;
        private final int mError;
        private final androidx.camera.video.OutputResults mOutputResults;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public @interface VideoRecordError {
        }

        Finalize(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2, @androidx.annotation.NonNull androidx.camera.video.OutputResults r3, int r4, @androidx.annotation.Nullable java.lang.Throwable r5) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mOutputResults = r3
                r0.mError = r4
                r0.mCause = r5
                return
        }

        @androidx.annotation.NonNull
        static java.lang.String errorToString(int r2) {
                switch(r2) {
                    case 0: goto L38;
                    case 1: goto L35;
                    case 2: goto L32;
                    case 3: goto L2f;
                    case 4: goto L2c;
                    case 5: goto L29;
                    case 6: goto L26;
                    case 7: goto L23;
                    case 8: goto L20;
                    case 9: goto L1d;
                    case 10: goto L1a;
                    default: goto L3;
                }
            L3:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown("
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = ")"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
            L1a:
                java.lang.String r2 = "ERROR_RECORDING_GARBAGE_COLLECTED"
                return r2
            L1d:
                java.lang.String r2 = "ERROR_DURATION_LIMIT_REACHED"
                return r2
            L20:
                java.lang.String r2 = "ERROR_NO_VALID_DATA"
                return r2
            L23:
                java.lang.String r2 = "ERROR_RECORDER_ERROR"
                return r2
            L26:
                java.lang.String r2 = "ERROR_ENCODING_FAILED"
                return r2
            L29:
                java.lang.String r2 = "ERROR_INVALID_OUTPUT_OPTIONS"
                return r2
            L2c:
                java.lang.String r2 = "ERROR_SOURCE_INACTIVE"
                return r2
            L2f:
                java.lang.String r2 = "ERROR_INSUFFICIENT_STORAGE"
                return r2
            L32:
                java.lang.String r2 = "ERROR_FILE_SIZE_LIMIT_REACHED"
                return r2
            L35:
                java.lang.String r2 = "ERROR_UNKNOWN"
                return r2
            L38:
                java.lang.String r2 = "ERROR_NONE"
                return r2
        }

        @androidx.annotation.Nullable
        public java.lang.Throwable getCause() {
                r1 = this;
                java.lang.Throwable r0 = r1.mCause
                return r0
        }

        public int getError() {
                r1 = this;
                int r0 = r1.mError
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.OutputResults getOutputResults() {
                r1 = this;
                androidx.camera.video.OutputResults r0 = r1.mOutputResults
                return r0
        }

        public boolean hasError() {
                r1 = this;
                int r0 = r1.mError
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Pause extends androidx.camera.video.VideoRecordEvent {
        Pause(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Resume extends androidx.camera.video.VideoRecordEvent {
        Resume(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Start extends androidx.camera.video.VideoRecordEvent {
        Start(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Status extends androidx.camera.video.VideoRecordEvent {
        Status(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    VideoRecordEvent(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.camera.video.OutputOptions r1 = (androidx.camera.video.OutputOptions) r1
            r0.mOutputOptions = r1
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.camera.video.RecordingStats r1 = (androidx.camera.video.RecordingStats) r1
            r0.mRecordingStats = r1
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.VideoRecordEvent.Finalize finalize(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r6, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r7, @androidx.annotation.NonNull androidx.camera.video.OutputResults r8) {
            androidx.camera.video.VideoRecordEvent$Finalize r0 = new androidx.camera.video.VideoRecordEvent$Finalize
            r4 = 0
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.VideoRecordEvent.Finalize finalizeWithError(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r8, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r9, @androidx.annotation.NonNull androidx.camera.video.OutputResults r10, int r11, @androidx.annotation.Nullable java.lang.Throwable r12) {
            if (r11 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "An error type is required."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            androidx.camera.video.VideoRecordEvent$Finalize r2 = new androidx.camera.video.VideoRecordEvent$Finalize
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.VideoRecordEvent.Pause pause(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2) {
            androidx.camera.video.VideoRecordEvent$Pause r0 = new androidx.camera.video.VideoRecordEvent$Pause
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.VideoRecordEvent.Resume resume(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2) {
            androidx.camera.video.VideoRecordEvent$Resume r0 = new androidx.camera.video.VideoRecordEvent$Resume
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.VideoRecordEvent.Start start(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2) {
            androidx.camera.video.VideoRecordEvent$Start r0 = new androidx.camera.video.VideoRecordEvent$Start
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.VideoRecordEvent.Status status(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r1, @androidx.annotation.NonNull androidx.camera.video.RecordingStats r2) {
            androidx.camera.video.VideoRecordEvent$Status r0 = new androidx.camera.video.VideoRecordEvent$Status
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.video.OutputOptions getOutputOptions() {
            r1 = this;
            androidx.camera.video.OutputOptions r0 = r1.mOutputOptions
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.video.RecordingStats getRecordingStats() {
            r1 = this;
            androidx.camera.video.RecordingStats r0 = r1.mRecordingStats
            return r0
    }
}
