package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Recording implements java.lang.AutoCloseable {
    private final androidx.camera.core.impl.utils.CloseGuardHelper mCloseGuard;
    private final java.util.concurrent.atomic.AtomicBoolean mIsClosed;
    private final boolean mIsPersistent;
    private final androidx.camera.video.OutputOptions mOutputOptions;
    private final androidx.camera.video.Recorder mRecorder;
    private final long mRecordingId;

    Recording(@androidx.annotation.NonNull androidx.camera.video.Recorder r3, long r4, @androidx.annotation.NonNull androidx.camera.video.OutputOptions r6, boolean r7, boolean r8) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.mIsClosed = r0
            androidx.camera.core.impl.utils.CloseGuardHelper r1 = androidx.camera.core.impl.utils.CloseGuardHelper.create()
            r2.mCloseGuard = r1
            r2.mRecorder = r3
            r2.mRecordingId = r4
            r2.mOutputOptions = r6
            r2.mIsPersistent = r7
            if (r8 == 0) goto L20
            r3 = 1
            r0.set(r3)
            return
        L20:
            java.lang.String r3 = "stop"
            r1.open(r3)
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.Recording createFinalizedFrom(@androidx.annotation.NonNull androidx.camera.video.PendingRecording r8, long r9) {
            java.lang.String r0 = "The given PendingRecording cannot be null."
            androidx.core.util.Preconditions.checkNotNull(r8, r0)
            androidx.camera.video.Recording r1 = new androidx.camera.video.Recording
            androidx.camera.video.Recorder r2 = r8.getRecorder()
            androidx.camera.video.OutputOptions r5 = r8.getOutputOptions()
            boolean r6 = r8.isPersistent()
            r7 = 1
            r3 = r9
            r1.<init>(r2, r3, r5, r6, r7)
            return r1
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.Recording from(@androidx.annotation.NonNull androidx.camera.video.PendingRecording r8, long r9) {
            java.lang.String r0 = "The given PendingRecording cannot be null."
            androidx.core.util.Preconditions.checkNotNull(r8, r0)
            androidx.camera.video.Recording r1 = new androidx.camera.video.Recording
            androidx.camera.video.Recorder r2 = r8.getRecorder()
            androidx.camera.video.OutputOptions r5 = r8.getOutputOptions()
            boolean r6 = r8.isPersistent()
            r7 = 0
            r3 = r9
            r1.<init>(r2, r3, r5, r6, r7)
            return r1
    }

    private void stopWithError(int r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            r2 = this;
            androidx.camera.core.impl.utils.CloseGuardHelper r0 = r2.mCloseGuard
            r0.close()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsClosed
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            androidx.camera.video.Recorder r0 = r2.mRecorder
            r0.stop(r2, r3, r4)
            return
    }

    @Override // java.lang.AutoCloseable
    public void close() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.stopWithError(r0, r1)
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r2 = this;
            androidx.camera.core.impl.utils.CloseGuardHelper r0 = r2.mCloseGuard     // Catch: java.lang.Throwable -> L15
            r0.warnIfOpen()     // Catch: java.lang.Throwable -> L15
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Recording stopped due to being garbage collected."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r1 = 10
            r2.stopWithError(r1, r0)     // Catch: java.lang.Throwable -> L15
            super.finalize()
            return
        L15:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    @androidx.annotation.NonNull
    androidx.camera.video.OutputOptions getOutputOptions() {
            r1 = this;
            androidx.camera.video.OutputOptions r0 = r1.mOutputOptions
            return r0
    }

    long getRecordingId() {
            r2 = this;
            long r0 = r2.mRecordingId
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isClosed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.mIsClosed
            boolean r0 = r0.get()
            return r0
    }

    @androidx.camera.video.ExperimentalPersistentRecording
    public boolean isPersistent() {
            r1 = this;
            boolean r0 = r1.mIsPersistent
            return r0
    }

    public void mute(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.mIsClosed
            boolean r0 = r0.get()
            if (r0 != 0) goto Le
            androidx.camera.video.Recorder r0 = r1.mRecorder
            r0.mute(r1, r2)
            return
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The recording has been stopped."
            r2.<init>(r0)
            throw r2
    }

    public void pause() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsClosed
            boolean r0 = r0.get()
            if (r0 != 0) goto Le
            androidx.camera.video.Recorder r0 = r2.mRecorder
            r0.pause(r2)
            return
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The recording has been stopped."
            r0.<init>(r1)
            throw r0
    }

    public void resume() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsClosed
            boolean r0 = r0.get()
            if (r0 != 0) goto Le
            androidx.camera.video.Recorder r0 = r2.mRecorder
            r0.resume(r2)
            return
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The recording has been stopped."
            r0.<init>(r1)
            throw r0
    }

    public void stop() {
            r0 = this;
            r0.close()
            return
    }
}
