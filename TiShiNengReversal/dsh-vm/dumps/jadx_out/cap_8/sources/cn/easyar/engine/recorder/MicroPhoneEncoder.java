package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MicroPhoneEncoder implements java.lang.Runnable {
    protected static final int AUDIO_FORMAT = 2;
    private static final boolean DEBUG = false;
    protected static final int SAMPLES_PER_FRAME = 1024;
    private static final java.lang.String TAG = "EasyAR";
    private static final boolean TRACE = false;
    long audioAbsolutePtsUs;
    int audioInputBufferIndex;
    int audioInputLength;
    private volatile boolean isEnd;
    private android.media.AudioRecord mAudioRecord;
    private cn.easyar.engine.recorder.AudioEncorderCore mEncoderCore;
    android.media.MediaCodec mMediaCodec;
    private final java.lang.Object mReadyFence;
    private final java.lang.Object mRecordingFence;
    private boolean mRecordingRequested;
    private boolean mThreadReady;
    private boolean mThreadRunning;
    long startPTS;
    long totalSamplesNum;

    public MicroPhoneEncoder(cn.easyar.engine.recorder.AVRecorderConfig r3) throws java.lang.RuntimeException {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.isEnd = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mReadyFence = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mRecordingFence = r0
            r0 = 0
            r2.startPTS = r0
            r2.totalSamplesNum = r0
            r2.init(r3)
            return
    }

    private long getJitterFreePTS(long r12, long r14) {
            r11 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r14 * r0
            cn.easyar.engine.recorder.AudioEncorderCore r4 = r11.mEncoderCore
            int r4 = r4.mSampleRate
            long r5 = (long) r4
            long r2 = r2 / r5
            long r12 = r12 - r2
            long r5 = r11.totalSamplesNum
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L18
            r11.startPTS = r12
            r11.totalSamplesNum = r7
        L18:
            long r5 = r11.startPTS
            long r9 = r11.totalSamplesNum
            long r9 = r9 * r0
            long r0 = (long) r4
            long r9 = r9 / r0
            long r5 = r5 + r9
            long r0 = r12 - r5
            r9 = 2
            long r2 = r2 * r9
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L30
            r11.startPTS = r12
            r11.totalSamplesNum = r7
            goto L31
        L30:
            r12 = r5
        L31:
            long r0 = r11.totalSamplesNum
            long r0 = r0 + r14
            r11.totalSamplesNum = r0
            return r12
    }

    private void init(cn.easyar.engine.recorder.AVRecorderConfig r10) throws java.lang.RuntimeException {
            r9 = this;
            int r0 = r10.getNumAudioChannels()
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L17
            if (r0 != r2) goto Lf
            r0 = 12
            r6 = 12
            goto L1b
        Lf:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid channel count. Must be 1 or 2"
            r10.<init>(r0)
            throw r10
        L17:
            r0 = 16
            r6 = 16
        L1b:
            int r0 = r10.getAudioSamplerate()
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r6, r2)
            r1 = 0
            cn.easyar.engine.recorder.AudioEncorderCore r2 = new cn.easyar.engine.recorder.AudioEncorderCore     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            int r3 = r10.getNumAudioChannels()     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            int r4 = r10.getAudioBitrate()     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            int r5 = r10.getAudioSamplerate()     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            cn.easyar.engine.recorder.Muxer r7 = r10.getMuxer()     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            r2.<init>(r3, r4, r5, r7)     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            r9.mEncoderCore = r2     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            android.media.AudioRecord r3 = new android.media.AudioRecord     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            int r5 = r10.getAudioSamplerate()     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            int r8 = r0 * 4
            r4 = 5
            r7 = 2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            r9.mAudioRecord = r3     // Catch: java.lang.IllegalStateException -> L52 java.lang.IllegalArgumentException -> L68 java.io.IOException -> L77
            r10 = 0
            r9.mThreadReady = r10
            r9.mThreadRunning = r10
            r9.mRecordingRequested = r10
            return
        L52:
            cn.easyar.engine.recorder.AudioEncorderCore r10 = r9.mEncoderCore
            r10.release()
            android.media.AudioRecord r10 = r9.mAudioRecord
            r10.release()
            r9.mEncoderCore = r1
            r9.mAudioRecord = r1
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "IllegalStateException"
            r10.<init>(r0)
            throw r10
        L68:
            cn.easyar.engine.recorder.AudioEncorderCore r10 = r9.mEncoderCore
            r10.release()
            r9.mEncoderCore = r1
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "IllegalArgumentException"
            r10.<init>(r0)
            throw r10
        L77:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "IOException"
            r10.<init>(r0)
            throw r10
    }

    @android.annotation.TargetApi(18)
    private void sendAudioToEncoder(boolean r12) {
            r11 = this;
            android.media.MediaCodec r0 = r11.mMediaCodec
            if (r0 != 0) goto Lc
            cn.easyar.engine.recorder.AudioEncorderCore r0 = r11.mEncoderCore
            android.media.MediaCodec r0 = r0.getMediaCodec()
            r11.mMediaCodec = r0
        Lc:
            android.media.MediaCodec r0 = r11.mMediaCodec     // Catch: java.lang.Exception -> L58
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch: java.lang.Exception -> L58
            android.media.MediaCodec r1 = r11.mMediaCodec     // Catch: java.lang.Exception -> L58
            r2 = -1
            int r1 = r1.dequeueInputBuffer(r2)     // Catch: java.lang.Exception -> L58
            r11.audioInputBufferIndex = r1     // Catch: java.lang.Exception -> L58
            if (r1 < 0) goto L58
            r0 = r0[r1]     // Catch: java.lang.Exception -> L58
            r0.clear()     // Catch: java.lang.Exception -> L58
            android.media.AudioRecord r1 = r11.mAudioRecord     // Catch: java.lang.Exception -> L58
            r2 = 2048(0x800, float:2.87E-42)
            int r0 = r1.read(r0, r2)     // Catch: java.lang.Exception -> L58
            r11.audioInputLength = r0     // Catch: java.lang.Exception -> L58
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> L58
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r11.audioAbsolutePtsUs = r0     // Catch: java.lang.Exception -> L58
            int r2 = r11.audioInputLength     // Catch: java.lang.Exception -> L58
            int r2 = r2 / 2
            long r2 = (long) r2     // Catch: java.lang.Exception -> L58
            long r8 = r11.getJitterFreePTS(r0, r2)     // Catch: java.lang.Exception -> L58
            r11.audioAbsolutePtsUs = r8     // Catch: java.lang.Exception -> L58
            int r7 = r11.audioInputLength     // Catch: java.lang.Exception -> L58
            if (r12 == 0) goto L4f
            android.media.MediaCodec r4 = r11.mMediaCodec     // Catch: java.lang.Exception -> L58
            int r5 = r11.audioInputBufferIndex     // Catch: java.lang.Exception -> L58
            r6 = 0
            r10 = 4
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch: java.lang.Exception -> L58
            return
        L4f:
            android.media.MediaCodec r4 = r11.mMediaCodec     // Catch: java.lang.Exception -> L58
            int r5 = r11.audioInputBufferIndex     // Catch: java.lang.Exception -> L58
            r6 = 0
            r10 = 0
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch: java.lang.Exception -> L58
        L58:
            return
    }

    private void startThread() {
            r3 = this;
            java.lang.Object r0 = r3.mReadyFence
            monitor-enter(r0)
            boolean r1 = r3.mThreadRunning     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L26
        Lb:
            java.lang.Thread r1 = new java.lang.Thread     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = "MicrophoneEncoder"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L9
            r2 = 10
            r1.setPriority(r2)     // Catch: java.lang.Throwable -> L9
            r1.start()     // Catch: java.lang.Throwable -> L9
        L1a:
            boolean r1 = r3.mThreadReady     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto L24
            java.lang.Object r1 = r3.mReadyFence     // Catch: java.lang.Throwable -> L9 java.lang.InterruptedException -> L1a
            r1.wait()     // Catch: java.lang.Throwable -> L9 java.lang.InterruptedException -> L1a
            goto L1a
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public boolean isRecording() {
            r1 = this;
            boolean r0 = r1.mRecordingRequested
            return r0
    }

    public void releaseRecording() {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    @android.annotation.TargetApi(18)
    public void run() {
            r3 = this;
            java.lang.Object r0 = r3.mReadyFence
            monitor-enter(r0)
            r1 = 1
            r3.mThreadReady = r1     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = r3.mReadyFence     // Catch: java.lang.Throwable -> L51
            r2.notify()     // Catch: java.lang.Throwable -> L51
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = r3.mRecordingFence
            monitor-enter(r2)
        Lf:
            boolean r0 = r3.mRecordingRequested     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            boolean r0 = r3.isEnd     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            java.lang.Object r0 = r3.mRecordingFence     // Catch: java.lang.InterruptedException -> Lf java.lang.Throwable -> L1d
            r0.wait()     // Catch: java.lang.InterruptedException -> Lf java.lang.Throwable -> L1d
            goto Lf
        L1d:
            r0 = move-exception
            goto L4f
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
        L20:
            boolean r0 = r3.mRecordingRequested
            r2 = 0
            if (r0 == 0) goto L2e
            cn.easyar.engine.recorder.AudioEncorderCore r0 = r3.mEncoderCore
            r0.drainEncoder(r2)
            r3.sendAudioToEncoder(r2)
            goto L20
        L2e:
            r3.mThreadReady = r2
            r3.sendAudioToEncoder(r1)
            cn.easyar.engine.recorder.AudioEncorderCore r0 = r3.mEncoderCore
            r0.drainEncoder(r1)
            cn.easyar.engine.recorder.AudioEncorderCore r0 = r3.mEncoderCore
            r0.release()
            android.media.AudioRecord r0 = r3.mAudioRecord
            r0.stop()
            android.media.AudioRecord r0 = r3.mAudioRecord
            r0.release()
            r0 = 0
            r3.mAudioRecord = r0
            r3.mEncoderCore = r0
            r3.mThreadRunning = r2
            return
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L51:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r1
    }

    public void startRecording() throws java.lang.IllegalStateException {
            r3 = this;
            android.media.AudioRecord r0 = r3.mAudioRecord     // Catch: java.lang.IllegalStateException -> L1e
            r0.startRecording()     // Catch: java.lang.IllegalStateException -> L1e
            r3.startThread()
            java.lang.Object r0 = r3.mRecordingFence
            monitor-enter(r0)
            r1 = 0
            r3.totalSamplesNum = r1     // Catch: java.lang.Throwable -> L1b
            r3.startPTS = r1     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            r3.mRecordingRequested = r1     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r3.mRecordingFence     // Catch: java.lang.Throwable -> L1b
            r1.notify()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        L1e:
            cn.easyar.engine.recorder.AudioEncorderCore r0 = r3.mEncoderCore
            r0.release()
            android.media.AudioRecord r0 = r3.mAudioRecord
            r0.release()
            r0 = 0
            r3.mEncoderCore = r0
            r3.mAudioRecord = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public void stopRecording() {
            r2 = this;
            java.lang.Object r0 = r2.mRecordingFence
            monitor-enter(r0)
            r1 = 0
            r2.mRecordingRequested = r1     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r2.isEnd = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r2.mRecordingFence     // Catch: java.lang.Throwable -> L10
            r1.notify()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }
}
