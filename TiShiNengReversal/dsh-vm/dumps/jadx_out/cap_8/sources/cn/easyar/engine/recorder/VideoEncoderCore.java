package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class VideoEncoderCore {
    private static final boolean DEBUG = false;
    private static final int FRAME_RATE = 30;
    private static final int IFRAME_INTERVAL = 5;
    private static final java.lang.String MIME_TYPE = "video/avc";
    private static final java.lang.String TAG = "EasyAR";
    private android.media.MediaCodec.BufferInfo mBufferInfo;
    private android.media.MediaCodec mEncoder;
    private android.view.Surface mInputSurface;
    private cn.easyar.engine.recorder.Muxer mMuxer;
    private int mTrackIndex;

    public VideoEncoderCore(int r3, int r4, int r5, cn.easyar.engine.recorder.Muxer r6) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo
            r0.<init>()
            r2.mBufferInfo = r0
            java.lang.String r0 = "video/avc"
            android.media.MediaFormat r3 = android.media.MediaFormat.createVideoFormat(r0, r3, r4)
            java.lang.String r4 = "color-format"
            r1 = 2130708361(0x7f000789, float:1.701803E38)
            r3.setInteger(r4, r1)
            java.lang.String r4 = "bitrate"
            r3.setInteger(r4, r5)
            java.lang.String r4 = "frame-rate"
            r5 = 30
            r3.setInteger(r4, r5)
            java.lang.String r4 = "i-frame-interval"
            r5 = 5
            r3.setInteger(r4, r5)
            java.lang.String r4 = "width"
            r3.getInteger(r4)
            java.lang.String r4 = "height"
            r3.getInteger(r4)
            android.media.MediaCodec r4 = android.media.MediaCodec.createEncoderByType(r0)
            r2.mEncoder = r4
            r5 = 0
            r0 = 1
            r4.configure(r3, r5, r5, r0)
            android.media.MediaCodec r3 = r2.mEncoder
            android.view.Surface r3 = r3.createInputSurface()
            r2.mInputSurface = r3
            android.media.MediaCodec r3 = r2.mEncoder
            r3.start()
            r2.mMuxer = r6
            r3 = -1
            r2.mTrackIndex = r3
            return
    }

    public void drainEncoder(boolean r9) {
            r8 = this;
            cn.easyar.engine.recorder.Muxer r0 = r8.mMuxer
            monitor-enter(r0)
            if (r9 == 0) goto Le
            android.media.MediaCodec r1 = r8.mEncoder     // Catch: java.lang.Throwable -> Lb
            r1.signalEndOfInputStream()     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r9 = move-exception
            goto L103
        Le:
            cn.easyar.engine.recorder.Muxer r1 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.isStarted()     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            if (r1 != 0) goto L39
            if (r9 == 0) goto L2f
            cn.easyar.engine.recorder.Muxer r9 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            boolean r9 = r9.endBeforeStart()     // Catch: java.lang.Throwable -> Lb
            if (r9 != 0) goto L28
            cn.easyar.engine.recorder.Muxer r9 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            r1 = 1
            r9.endBeforeStart(r1)     // Catch: java.lang.Throwable -> Lb
            goto L2d
        L28:
            cn.easyar.engine.recorder.Muxer r9 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            r9.release(r2)     // Catch: java.lang.Throwable -> Lb
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L2f:
            cn.easyar.engine.recorder.Muxer r1 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.endBeforeStart()     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L39:
            android.media.MediaCodec r1 = r8.mEncoder     // Catch: java.lang.Throwable -> Lb
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch: java.lang.Throwable -> Lb
        L3f:
            android.media.MediaCodec r3 = r8.mEncoder     // Catch: java.lang.Throwable -> Lb
            android.media.MediaCodec$BufferInfo r4 = r8.mBufferInfo     // Catch: java.lang.Throwable -> Lb
            r5 = 10000(0x2710, double:4.9407E-320)
            int r3 = r3.dequeueOutputBuffer(r4, r5)     // Catch: java.lang.Throwable -> Lb
            r4 = -1
            if (r3 != r4) goto L50
            if (r9 != 0) goto L3f
            goto Le5
        L50:
            r4 = -3
            if (r3 != r4) goto L5a
            android.media.MediaCodec r1 = r8.mEncoder     // Catch: java.lang.Throwable -> Lb
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch: java.lang.Throwable -> Lb
            goto L3f
        L5a:
            r4 = -2
            if (r3 != r4) goto L7c
            cn.easyar.engine.recorder.Muxer r3 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            boolean r3 = r3.isStarted()     // Catch: java.lang.Throwable -> Lb
            if (r3 != 0) goto L74
            android.media.MediaCodec r3 = r8.mEncoder     // Catch: java.lang.Throwable -> Lb
            android.media.MediaFormat r3 = r3.getOutputFormat()     // Catch: java.lang.Throwable -> Lb
            cn.easyar.engine.recorder.Muxer r4 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            int r3 = r4.addTrack(r3)     // Catch: java.lang.Throwable -> Lb
            r8.mTrackIndex = r3     // Catch: java.lang.Throwable -> Lb
            goto L3f
        L74:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "format changed twice"
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            throw r9     // Catch: java.lang.Throwable -> Lb
        L7c:
            if (r3 >= 0) goto L7f
            goto L3f
        L7f:
            r4 = r1[r3]     // Catch: java.lang.Throwable -> Lb
            if (r4 == 0) goto Le7
            android.media.MediaCodec$BufferInfo r5 = r8.mBufferInfo     // Catch: java.lang.Throwable -> Lb
            int r6 = r5.flags     // Catch: java.lang.Throwable -> Lb
            r7 = r6 & 2
            if (r7 == 0) goto L8d
            r5.size = r2     // Catch: java.lang.Throwable -> Lb
        L8d:
            int r5 = r5.size     // Catch: java.lang.Throwable -> Lb
            if (r5 == 0) goto Lc3
            cn.easyar.engine.recorder.Muxer r5 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            r5.isStarted()     // Catch: java.lang.Throwable -> Lb
            android.media.MediaCodec$BufferInfo r5 = r8.mBufferInfo     // Catch: java.lang.Throwable -> Lb
            int r5 = r5.offset     // Catch: java.lang.Throwable -> Lb
            r4.position(r5)     // Catch: java.lang.Throwable -> Lb
            android.media.MediaCodec$BufferInfo r5 = r8.mBufferInfo     // Catch: java.lang.Throwable -> Lb
            int r6 = r5.offset     // Catch: java.lang.Throwable -> Lb
            int r5 = r5.size     // Catch: java.lang.Throwable -> Lb
            int r6 = r6 + r5
            r4.limit(r6)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto Lb1
            android.media.MediaCodec$BufferInfo r5 = r8.mBufferInfo     // Catch: java.lang.Throwable -> Lb
            int r6 = r5.flags     // Catch: java.lang.Throwable -> Lb
            r6 = r6 | 4
            r5.flags = r6     // Catch: java.lang.Throwable -> Lb
        Lb1:
            cn.easyar.engine.recorder.Muxer r5 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            boolean r5 = r5.isStarted()     // Catch: java.lang.Throwable -> Lb
            if (r5 == 0) goto Ld8
            cn.easyar.engine.recorder.Muxer r5 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            int r6 = r8.mTrackIndex     // Catch: java.lang.Throwable -> Lb
            android.media.MediaCodec$BufferInfo r7 = r8.mBufferInfo     // Catch: java.lang.Throwable -> Lb
            r5.writeSampleData(r6, r4, r7)     // Catch: java.lang.Throwable -> Lb
            goto Ld8
        Lc3:
            r5 = r6 & 4
            if (r5 == 0) goto Ld8
            cn.easyar.engine.recorder.Muxer r5 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            boolean r5 = r5.isStarted()     // Catch: java.lang.Throwable -> Lb
            if (r5 == 0) goto Ld8
            cn.easyar.engine.recorder.Muxer r5 = r8.mMuxer     // Catch: java.lang.Throwable -> Lb
            int r6 = r8.mTrackIndex     // Catch: java.lang.Throwable -> Lb
            android.media.MediaCodec$BufferInfo r7 = r8.mBufferInfo     // Catch: java.lang.Throwable -> Lb
            r5.writeSampleData(r6, r4, r7)     // Catch: java.lang.Throwable -> Lb
        Ld8:
            android.media.MediaCodec r4 = r8.mEncoder     // Catch: java.lang.Throwable -> Lb
            r4.releaseOutputBuffer(r3, r2)     // Catch: java.lang.Throwable -> Lb
            android.media.MediaCodec$BufferInfo r3 = r8.mBufferInfo     // Catch: java.lang.Throwable -> Lb
            int r3 = r3.flags     // Catch: java.lang.Throwable -> Lb
            r3 = r3 & 4
            if (r3 == 0) goto L3f
        Le5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Le7:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r1.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "encoderOutputBuffer "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb
            r1.append(r3)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = " was null"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            throw r9     // Catch: java.lang.Throwable -> Lb
        L103:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r9
    }

    public android.view.Surface getInputSurface() {
            r1 = this;
            android.view.Surface r0 = r1.mInputSurface
            return r0
    }

    public void release() {
            r1 = this;
            android.media.MediaCodec r0 = r1.mEncoder
            if (r0 == 0) goto Lf
            r0.stop()
            android.media.MediaCodec r0 = r1.mEncoder
            r0.release()
            r0 = 0
            r1.mEncoder = r0
        Lf:
            return
    }
}
