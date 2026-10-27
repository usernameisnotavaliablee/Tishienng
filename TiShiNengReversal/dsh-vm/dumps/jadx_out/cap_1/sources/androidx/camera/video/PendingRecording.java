package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PendingRecording {
    private boolean mAudioEnabled;
    private final android.content.Context mContext;
    private androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> mEventListener;
    private boolean mIsPersistent;
    private java.util.concurrent.Executor mListenerExecutor;
    private final androidx.camera.video.OutputOptions mOutputOptions;
    private final androidx.camera.video.Recorder mRecorder;

    PendingRecording(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.camera.video.Recorder r3, @androidx.annotation.NonNull androidx.camera.video.OutputOptions r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mAudioEnabled = r0
            r1.mIsPersistent = r0
            android.content.Context r2 = androidx.camera.core.impl.utils.ContextUtil.getApplicationContext(r2)
            r1.mContext = r2
            r1.mRecorder = r3
            r1.mOutputOptions = r4
            return
    }

    @androidx.annotation.NonNull
    @androidx.camera.video.ExperimentalPersistentRecording
    public androidx.camera.video.PendingRecording asPersistentRecording() {
            r1 = this;
            r0 = 1
            r1.mIsPersistent = r0
            return r1
    }

    @androidx.annotation.NonNull
    android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @androidx.annotation.Nullable
    androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> getEventListener() {
            r1 = this;
            androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r0 = r1.mEventListener
            return r0
    }

    @androidx.annotation.Nullable
    java.util.concurrent.Executor getListenerExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mListenerExecutor
            return r0
    }

    @androidx.annotation.NonNull
    androidx.camera.video.OutputOptions getOutputOptions() {
            r1 = this;
            androidx.camera.video.OutputOptions r0 = r1.mOutputOptions
            return r0
    }

    @androidx.annotation.NonNull
    androidx.camera.video.Recorder getRecorder() {
            r1 = this;
            androidx.camera.video.Recorder r0 = r1.mRecorder
            return r0
    }

    boolean isAudioEnabled() {
            r1 = this;
            boolean r0 = r1.mAudioEnabled
            return r0
    }

    boolean isPersistent() {
            r1 = this;
            boolean r0 = r1.mIsPersistent
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public androidx.camera.video.Recording start(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r3) {
            r1 = this;
            java.lang.String r0 = "Listener Executor can't be null."
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Event listener can't be null"
            androidx.core.util.Preconditions.checkNotNull(r3, r0)
            r1.mListenerExecutor = r2
            r1.mEventListener = r3
            androidx.camera.video.Recorder r2 = r1.mRecorder
            androidx.camera.video.Recording r2 = r2.start(r1)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    public androidx.camera.video.PendingRecording withAudioEnabled() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "android.permission.RECORD_AUDIO"
            int r0 = androidx.core.content.PermissionChecker.checkSelfPermission(r0, r1)
            r1 = -1
            if (r0 == r1) goto L1a
            androidx.camera.video.Recorder r0 = r2.mRecorder
            boolean r0 = r0.isAudioSupported()
            java.lang.String r1 = "The Recorder this recording is associated to doesn't support audio."
            androidx.core.util.Preconditions.checkState(r0, r1)
            r0 = 1
            r2.mAudioEnabled = r0
            return r2
        L1a:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted."
            r0.<init>(r1)
            throw r0
    }
}
