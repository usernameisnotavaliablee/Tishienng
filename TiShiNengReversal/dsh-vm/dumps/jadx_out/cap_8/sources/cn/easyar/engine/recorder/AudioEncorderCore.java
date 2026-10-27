package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AudioEncorderCore {
    private static final boolean DEBUG = false;
    protected static final java.lang.String MIME_TYPE = "audio/mp4a-latm";
    final int MAX_EOS_SPINS;
    private final java.lang.String TAG;
    protected android.media.MediaCodec.BufferInfo mBufferInfo;
    protected int mChannelConfig;
    protected android.media.MediaCodec mEncoder;
    int mEosSpinCount;
    protected volatile boolean mForceEos;
    protected cn.easyar.engine.recorder.Muxer mMuxer;
    protected int mSampleRate;
    protected int mTrackIndex;

    public AudioEncorderCore(int r3, int r4, int r5, cn.easyar.engine.recorder.Muxer r6) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "EasyAR"
            r2.TAG = r0
            r0 = 0
            r2.mForceEos = r0
            r2.mEosSpinCount = r0
            r0 = 10
            r2.MAX_EOS_SPINS = r0
            r2.mSampleRate = r5
            android.media.MediaCodec$BufferInfo r5 = new android.media.MediaCodec$BufferInfo
            r5.<init>()
            r2.mBufferInfo = r5
            r2.mMuxer = r6
            int r5 = r2.mSampleRate
            java.lang.String r6 = "audio/mp4a-latm"
            android.media.MediaFormat r5 = android.media.MediaFormat.createAudioFormat(r6, r5, r3)
            java.lang.String r0 = "aac-profile"
            r1 = 2
            r5.setInteger(r0, r1)
            java.lang.String r0 = "sample-rate"
            int r1 = r2.mSampleRate
            r5.setInteger(r0, r1)
            java.lang.String r0 = "channel-count"
            r5.setInteger(r0, r3)
            java.lang.String r3 = "bitrate"
            r5.setInteger(r3, r4)
            java.lang.String r3 = "max-input-size"
            r4 = 16384(0x4000, float:2.2959E-41)
            r5.setInteger(r3, r4)
            android.media.MediaCodec r3 = android.media.MediaCodec.createEncoderByType(r6)
            r2.mEncoder = r3
            r4 = 0
            r6 = 1
            r3.configure(r5, r4, r4, r6)
            android.media.MediaCodec r3 = r2.mEncoder
            r3.start()
            r3 = -1
            r2.mTrackIndex = r3
            return
    }

    public static boolean isKitKat() {
            r0 = 1
            return r0
    }

    public void drainEncoder(boolean r10) {
            r9 = this;
            cn.easyar.engine.recorder.Muxer r0 = r9.mMuxer
            monitor-enter(r0)
            cn.easyar.engine.recorder.Muxer r1 = r9.mMuxer     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isStarted()     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L31
            if (r10 == 0) goto L27
            cn.easyar.engine.recorder.Muxer r10 = r9.mMuxer     // Catch: java.lang.Throwable -> L1d
            boolean r10 = r10.endBeforeStart()     // Catch: java.lang.Throwable -> L1d
            if (r10 != 0) goto L20
            cn.easyar.engine.recorder.Muxer r10 = r9.mMuxer     // Catch: java.lang.Throwable -> L1d
            r10.endBeforeStart(r3)     // Catch: java.lang.Throwable -> L1d
            goto L25
        L1d:
            r10 = move-exception
            goto Lc9
        L20:
            cn.easyar.engine.recorder.Muxer r10 = r9.mMuxer     // Catch: java.lang.Throwable -> L1d
            r10.release(r2)     // Catch: java.lang.Throwable -> L1d
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L27:
            cn.easyar.engine.recorder.Muxer r1 = r9.mMuxer     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.endBeforeStart()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L31:
            android.media.MediaCodec r1 = r9.mEncoder     // Catch: java.lang.Throwable -> L1d
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch: java.lang.Throwable -> L1d
        L37:
            android.media.MediaCodec r4 = r9.mEncoder     // Catch: java.lang.Throwable -> L1d
            android.media.MediaCodec$BufferInfo r5 = r9.mBufferInfo     // Catch: java.lang.Throwable -> L1d
            r6 = 1000(0x3e8, double:4.94E-321)
            int r4 = r4.dequeueOutputBuffer(r5, r6)     // Catch: java.lang.Throwable -> L1d
            r5 = -1
            if (r4 != r5) goto L51
            if (r10 != 0) goto L47
            goto Lab
        L47:
            int r4 = r9.mEosSpinCount     // Catch: java.lang.Throwable -> L1d
            int r4 = r4 + r3
            r9.mEosSpinCount = r4     // Catch: java.lang.Throwable -> L1d
            r5 = 10
            if (r4 <= r5) goto L37
            goto Lab
        L51:
            r5 = -3
            if (r4 != r5) goto L5b
            android.media.MediaCodec r1 = r9.mEncoder     // Catch: java.lang.Throwable -> L1d
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch: java.lang.Throwable -> L1d
            goto L37
        L5b:
            r5 = -2
            if (r4 != r5) goto L6d
            android.media.MediaCodec r4 = r9.mEncoder     // Catch: java.lang.Throwable -> L1d
            android.media.MediaFormat r4 = r4.getOutputFormat()     // Catch: java.lang.Throwable -> L1d
            cn.easyar.engine.recorder.Muxer r5 = r9.mMuxer     // Catch: java.lang.Throwable -> L1d
            int r4 = r5.addTrack(r4)     // Catch: java.lang.Throwable -> L1d
            r9.mTrackIndex = r4     // Catch: java.lang.Throwable -> L1d
            goto L37
        L6d:
            if (r4 >= 0) goto L70
            goto L37
        L70:
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto Lad
            android.media.MediaCodec$BufferInfo r6 = r9.mBufferInfo     // Catch: java.lang.Throwable -> L1d
            int r7 = r6.size     // Catch: java.lang.Throwable -> L1d
            if (r7 < 0) goto L9e
            int r6 = r6.offset     // Catch: java.lang.Throwable -> L1d
            r5.position(r6)     // Catch: java.lang.Throwable -> L1d
            android.media.MediaCodec$BufferInfo r6 = r9.mBufferInfo     // Catch: java.lang.Throwable -> L1d
            int r7 = r6.offset     // Catch: java.lang.Throwable -> L1d
            int r6 = r6.size     // Catch: java.lang.Throwable -> L1d
            int r7 = r7 + r6
            r5.limit(r7)     // Catch: java.lang.Throwable -> L1d
            boolean r6 = r9.mForceEos     // Catch: java.lang.Throwable -> L1d
            if (r6 == 0) goto L95
            android.media.MediaCodec$BufferInfo r6 = r9.mBufferInfo     // Catch: java.lang.Throwable -> L1d
            int r7 = r6.flags     // Catch: java.lang.Throwable -> L1d
            r7 = r7 | 4
            r6.flags = r7     // Catch: java.lang.Throwable -> L1d
        L95:
            cn.easyar.engine.recorder.Muxer r6 = r9.mMuxer     // Catch: java.lang.Throwable -> L1d
            int r7 = r9.mTrackIndex     // Catch: java.lang.Throwable -> L1d
            android.media.MediaCodec$BufferInfo r8 = r9.mBufferInfo     // Catch: java.lang.Throwable -> L1d
            r6.writeSampleData(r7, r5, r8)     // Catch: java.lang.Throwable -> L1d
        L9e:
            android.media.MediaCodec r5 = r9.mEncoder     // Catch: java.lang.Throwable -> L1d
            r5.releaseOutputBuffer(r4, r2)     // Catch: java.lang.Throwable -> L1d
            android.media.MediaCodec$BufferInfo r4 = r9.mBufferInfo     // Catch: java.lang.Throwable -> L1d
            int r4 = r4.flags     // Catch: java.lang.Throwable -> L1d
            r4 = r4 & 4
            if (r4 == 0) goto L37
        Lab:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        Lad:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "encoderOutputBuffer "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1d
            r1.append(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = " was null"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            throw r10     // Catch: java.lang.Throwable -> L1d
        Lc9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r10
    }

    public android.media.MediaCodec getMediaCodec() {
            r1 = this;
            android.media.MediaCodec r0 = r1.mEncoder
            return r0
    }

    public void release() {
            r2 = this;
            cn.easyar.engine.recorder.Muxer r0 = r2.mMuxer
            if (r0 == 0) goto L9
            int r1 = r2.mTrackIndex
            r0.onEncoderReleased(r1)
        L9:
            android.media.MediaCodec r0 = r2.mEncoder
            if (r0 == 0) goto L18
            r0.stop()
            android.media.MediaCodec r0 = r2.mEncoder
            r0.release()
            r0 = 0
            r2.mEncoder = r0
        L18:
            return
    }

    public void signalEndOfStream() {
            r1 = this;
            r0 = 1
            r1.mForceEos = r0
            return
    }
}
