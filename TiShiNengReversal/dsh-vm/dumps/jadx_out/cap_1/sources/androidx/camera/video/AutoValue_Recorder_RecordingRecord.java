package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_Recorder_RecordingRecord extends androidx.camera.video.Recorder.RecordingRecord {
    private final java.util.concurrent.Executor getCallbackExecutor;
    private final androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> getEventListener;
    private final androidx.camera.video.OutputOptions getOutputOptions;
    private final long getRecordingId;
    private final boolean hasAudioEnabled;
    private final boolean isPersistent;

    AutoValue_Recorder_RecordingRecord(androidx.camera.video.OutputOptions r1, @androidx.annotation.Nullable java.util.concurrent.Executor r2, @androidx.annotation.Nullable androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r3, boolean r4, boolean r5, long r6) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L12
            r0.getOutputOptions = r1
            r0.getCallbackExecutor = r2
            r0.getEventListener = r3
            r0.hasAudioEnabled = r4
            r0.isPersistent = r5
            r0.getRecordingId = r6
            return
        L12:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null getOutputOptions"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.camera.video.Recorder.RecordingRecord
            r2 = 0
            if (r1 == 0) goto L5c
            androidx.camera.video.Recorder$RecordingRecord r8 = (androidx.camera.video.Recorder.RecordingRecord) r8
            androidx.camera.video.OutputOptions r1 = r7.getOutputOptions
            androidx.camera.video.OutputOptions r3 = r8.getOutputOptions()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5c
            java.util.concurrent.Executor r1 = r7.getCallbackExecutor
            if (r1 != 0) goto L22
            java.util.concurrent.Executor r1 = r8.getCallbackExecutor()
            if (r1 != 0) goto L5c
            goto L2c
        L22:
            java.util.concurrent.Executor r3 = r8.getCallbackExecutor()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5c
        L2c:
            androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r1 = r7.getEventListener
            if (r1 != 0) goto L37
            androidx.core.util.Consumer r1 = r8.getEventListener()
            if (r1 != 0) goto L5c
            goto L41
        L37:
            androidx.core.util.Consumer r3 = r8.getEventListener()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5c
        L41:
            boolean r1 = r7.hasAudioEnabled
            boolean r3 = r8.hasAudioEnabled()
            if (r1 != r3) goto L5c
            boolean r1 = r7.isPersistent
            boolean r3 = r8.isPersistent()
            if (r1 != r3) goto L5c
            long r3 = r7.getRecordingId
            long r5 = r8.getRecordingId()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L5c
            return r0
        L5c:
            return r2
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    @androidx.annotation.Nullable
    java.util.concurrent.Executor getCallbackExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.getCallbackExecutor
            return r0
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    @androidx.annotation.Nullable
    androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> getEventListener() {
            r1 = this;
            androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r0 = r1.getEventListener
            return r0
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    @androidx.annotation.NonNull
    androidx.camera.video.OutputOptions getOutputOptions() {
            r1 = this;
            androidx.camera.video.OutputOptions r0 = r1.getOutputOptions
            return r0
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    long getRecordingId() {
            r2 = this;
            long r0 = r2.getRecordingId
            return r0
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    boolean hasAudioEnabled() {
            r1 = this;
            boolean r0 = r1.hasAudioEnabled
            return r0
    }

    public int hashCode() {
            r5 = this;
            androidx.camera.video.OutputOptions r0 = r5.getOutputOptions
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.concurrent.Executor r2 = r5.getCallbackExecutor
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r2 = r5.getEventListener
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r3 = r2.hashCode()
        L23:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            boolean r2 = r5.hasAudioEnabled
            r3 = 1237(0x4d5, float:1.733E-42)
            r4 = 1231(0x4cf, float:1.725E-42)
            if (r2 == 0) goto L31
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L33
        L31:
            r2 = 1237(0x4d5, float:1.733E-42)
        L33:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r5.isPersistent
            if (r2 == 0) goto L3c
            r3 = 1231(0x4cf, float:1.725E-42)
        L3c:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r1 = r5.getRecordingId
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    boolean isPersistent() {
            r1 = this;
            boolean r0 = r1.isPersistent
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RecordingRecord{getOutputOptions="
            r0.append(r1)
            androidx.camera.video.OutputOptions r1 = r3.getOutputOptions
            r0.append(r1)
            java.lang.String r1 = ", getCallbackExecutor="
            r0.append(r1)
            java.util.concurrent.Executor r1 = r3.getCallbackExecutor
            r0.append(r1)
            java.lang.String r1 = ", getEventListener="
            r0.append(r1)
            androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r1 = r3.getEventListener
            r0.append(r1)
            java.lang.String r1 = ", hasAudioEnabled="
            r0.append(r1)
            boolean r1 = r3.hasAudioEnabled
            r0.append(r1)
            java.lang.String r1 = ", isPersistent="
            r0.append(r1)
            boolean r1 = r3.isPersistent
            r0.append(r1)
            java.lang.String r1 = ", getRecordingId="
            r0.append(r1)
            long r1 = r3.getRecordingId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
