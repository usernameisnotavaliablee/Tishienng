package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Muxer {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "EasyAR";
    private boolean endBeforeStart;
    private int mExpectedNumTracks;
    protected long mFirstPts;
    protected int mFormat;
    protected long[] mLastPts;
    private volatile cn.easyar.engine.recorder.RecordListener mListener;
    private android.media.MediaMuxer mMuxer;
    protected volatile int mNumTracks;
    protected volatile int mNumTracksFinished;
    private java.lang.Object mObject;
    protected java.lang.String mOutputPath;
    private volatile boolean mStarted;

    protected Muxer(java.lang.String r6, int r7) throws java.io.IOException {
            r5 = this;
            r5.<init>()
            r0 = 2
            r5.mExpectedNumTracks = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.mObject = r0
            r0 = 0
            r5.endBeforeStart = r0
            r5.mOutputPath = r6
            r5.mFormat = r7
            r5.mNumTracks = r0
            r5.mNumTracksFinished = r0
            r1 = 0
            r5.mFirstPts = r1
            int r7 = r5.mExpectedNumTracks
            long[] r7 = new long[r7]
            r5.mLastPts = r7
            r7 = 0
        L23:
            long[] r3 = r5.mLastPts
            int r4 = r3.length
            if (r7 >= r4) goto L2d
            r3[r7] = r1
            int r7 = r7 + 1
            goto L23
        L2d:
            android.media.MediaMuxer r7 = new android.media.MediaMuxer
            java.lang.String r6 = r6.toString()
            r7.<init>(r6, r0)
            r5.mMuxer = r7
            return
    }

    private long getSafePts(long r6, int r8) {
            r5 = this;
            long[] r0 = r5.mLastPts     // Catch: java.lang.Exception -> L10
            r1 = r0[r8]     // Catch: java.lang.Exception -> L10
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto Le
            r3 = 9643(0x25ab, double:4.7643E-320)
            long r1 = r1 + r3
            r0[r8] = r1     // Catch: java.lang.Exception -> L10
            return r1
        Le:
            r0[r8] = r6     // Catch: java.lang.Exception -> L10
        L10:
            return r6
    }

    @android.annotation.TargetApi(18)
    public int addTrack(android.media.MediaFormat r3) {
            r2 = this;
            boolean r0 = r2.mStarted
            if (r0 != 0) goto L23
            java.lang.Object r0 = r2.mObject
            monitor-enter(r0)
            android.media.MediaMuxer r1 = r2.mMuxer     // Catch: java.lang.Throwable -> L1d
            int r3 = r1.addTrack(r3)     // Catch: java.lang.Throwable -> L1d
            int r1 = r2.mNumTracks     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + 1
            r2.mNumTracks = r1     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r2.allTracksAdded()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r2.start()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r3
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
        L23:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "format changed twice"
            r3.<init>(r0)
            throw r3
    }

    protected boolean allTracksAdded() {
            r2 = this;
            int r0 = r2.mNumTracks
            int r1 = r2.mExpectedNumTracks
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    protected boolean allTracksFinished() {
            r2 = this;
            int r0 = r2.mNumTracks
            int r1 = r2.mNumTracksFinished
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public void endBeforeStart(boolean r1) {
            r0 = this;
            r0.endBeforeStart = r1
            return
    }

    public boolean endBeforeStart() {
            r1 = this;
            boolean r0 = r1.endBeforeStart
            return r0
    }

    protected long getNextRelativePts(long r6, int r8) {
            r5 = this;
            long r0 = r5.mFirstPts
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r5.mFirstPts = r6
            return r2
        Lb:
            long r6 = r6 - r0
            long r6 = r5.getSafePts(r6, r8)
            return r6
    }

    public java.lang.String getOutputPath() {
            r1 = this;
            java.lang.String r0 = r1.mOutputPath
            return r0
    }

    public boolean isStarted() {
            r1 = this;
            boolean r0 = r1.mStarted
            return r0
    }

    public void onEncoderReleased(int r1) {
            r0 = this;
            return
    }

    public void release(boolean r3) {
            r2 = this;
            android.media.MediaMuxer r0 = r2.mMuxer
            if (r0 != 0) goto L5
            return
        L5:
            cn.easyar.engine.recorder.RecordListener r0 = r2.mListener
            if (r3 == 0) goto Lc
            r3 = 1024(0x400, float:1.435E-42)
            goto Le
        Lc:
            r3 = 1025(0x401, float:1.436E-42)
        Le:
            java.lang.String r1 = r2.mOutputPath
            r0.onMessage(r3, r1)
            android.media.MediaMuxer r3 = r2.mMuxer
            r3.release()
            r3 = 0
            r2.mListener = r3
            r2.mMuxer = r3
            return
    }

    protected void setExpectedTracks(int r1) {
            r0 = this;
            r0.mExpectedNumTracks = r1
            return
    }

    public void setListener(cn.easyar.engine.recorder.RecordListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    protected void signalEndOfTrack() {
            r1 = this;
            int r0 = r1.mNumTracksFinished
            int r0 = r0 + 1
            r1.mNumTracksFinished = r0
            return
    }

    @android.annotation.TargetApi(18)
    protected void start() {
            r1 = this;
            android.media.MediaMuxer r0 = r1.mMuxer
            r0.start()
            r0 = 1
            r1.mStarted = r0
            return
    }

    @android.annotation.TargetApi(18)
    protected void stop() {
            r3 = this;
            java.lang.String r0 = "EasyAR"
            monitor-enter(r0)
            r1 = 1
            boolean r2 = r3.mStarted     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            if (r2 == 0) goto L10
            android.media.MediaMuxer r2 = r3.mMuxer     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            r2.stop()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            goto L10
        Le:
            r2 = move-exception
            goto L16
        L10:
            r3.release(r1)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L14:
            r1 = move-exception
            goto L1f
        L16:
            r3.release(r1)     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L14
        L1a:
            r1 = 0
            r3.mStarted = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    public void writeSampleData(int r3, java.nio.ByteBuffer r4, android.media.MediaCodec.BufferInfo r5) {
            r2 = this;
            int r0 = r5.flags
            r0 = r0 & 4
            if (r0 == 0) goto L9
            r2.signalEndOfTrack()
        L9:
            int r0 = r5.flags
            r0 = r0 & 2
            if (r0 == 0) goto L10
            goto L3d
        L10:
            boolean r0 = r2.mStarted
            if (r0 != 0) goto L15
            goto L3d
        L15:
            int r0 = r5.size
            if (r0 != 0) goto L23
            boolean r3 = r2.allTracksFinished()
            if (r3 == 0) goto L3d
            r2.stop()
            return
        L23:
            long r0 = r5.presentationTimeUs
            long r0 = r2.getNextRelativePts(r0, r3)
            r5.presentationTimeUs = r0
            java.lang.Object r0 = r2.mObject
            monitor-enter(r0)
            android.media.MediaMuxer r1 = r2.mMuxer     // Catch: java.lang.Throwable -> L3e
            r1.writeSampleData(r3, r4, r5)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r2.allTracksFinished()
            if (r3 == 0) goto L3d
            r2.stop()
        L3d:
            return
        L3e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r3
    }
}
