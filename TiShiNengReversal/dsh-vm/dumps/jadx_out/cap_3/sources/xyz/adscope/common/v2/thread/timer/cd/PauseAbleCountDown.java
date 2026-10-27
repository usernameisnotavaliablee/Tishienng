package xyz.adscope.common.v2.thread.timer.cd;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class PauseAbleCountDown {
    private static final int MSG = 1;
    private boolean mCancelled;
    private final long mCountdownInterval;
    private final android.os.Handler mHandler;
    private long mLastPauseTime;
    private final long mMillisInFuture;
    private long mPauseInterval;
    private boolean mPaused;
    private boolean mStarted;
    private long mStopTimeInFuture;


    public PauseAbleCountDown(long r3, long r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mPaused = r0
            r2.mCancelled = r0
            r2.mStarted = r0
            xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown$1 r0 = new xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.mHandler = r0
            r2.mMillisInFuture = r3
            r2.mCountdownInterval = r5
            return
    }

    static /* synthetic */ boolean access$000(xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r0) {
            boolean r0 = r0.mCancelled
            return r0
    }

    static /* synthetic */ boolean access$100(xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r0) {
            boolean r0 = r0.mPaused
            return r0
    }

    static /* synthetic */ long access$200(xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r2) {
            long r0 = r2.mStopTimeInFuture
            return r0
    }

    static /* synthetic */ long access$300(xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r2) {
            long r0 = r2.mPauseInterval
            return r0
    }

    static /* synthetic */ long access$302(xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r0, long r1) {
            r0.mPauseInterval = r1
            return r1
    }

    static /* synthetic */ boolean access$402(xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r0, boolean r1) {
            r0.mStarted = r1
            return r1
    }

    static /* synthetic */ long access$500(xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r2) {
            long r0 = r2.mCountdownInterval
            return r0
    }

    public final synchronized void cancel() {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r2.mCancelled = r0     // Catch: java.lang.Throwable -> Le
            android.os.Handler r1 = r2.mHandler     // Catch: java.lang.Throwable -> Le
            r1.removeMessages(r0)     // Catch: java.lang.Throwable -> Le
            r2.onCancel()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public abstract void onCancel();

    public abstract void onFinish();

    public abstract void onTick(long r1);

    public final synchronized void pause() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mStarted     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r0 = 1
            r2.mPaused = r0     // Catch: java.lang.Throwable -> Lf
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf
            r2.mLastPauseTime = r0     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L13
        L11:
            monitor-exit(r2)
            return
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public final synchronized void resume() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mPaused     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            r0 = 0
            r4.mPaused = r0     // Catch: java.lang.Throwable -> L1f
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L1f
            long r2 = r4.mLastPauseTime     // Catch: java.lang.Throwable -> L1f
            long r0 = r0 - r2
            long r2 = r4.mPauseInterval     // Catch: java.lang.Throwable -> L1f
            long r0 = r0 + r2
            r4.mPauseInterval = r0     // Catch: java.lang.Throwable -> L1f
            android.os.Handler r0 = r4.mHandler     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            android.os.Message r1 = r0.obtainMessage(r1)     // Catch: java.lang.Throwable -> L1f
            r0.sendMessage(r1)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r0 = move-exception
            goto L23
        L21:
            monitor-exit(r4)
            return
        L23:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            throw r0
    }

    public final synchronized xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown start() {
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r7.mPauseInterval = r0     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r7.mStarted     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto Lb
            monitor-exit(r7)
            return r7
        Lb:
            r2 = 0
            r7.mCancelled = r2     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            r7.mStarted = r3     // Catch: java.lang.Throwable -> L1e
            long r4 = r7.mMillisInFuture     // Catch: java.lang.Throwable -> L1e
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 > 0) goto L20
            r7.mStarted = r2     // Catch: java.lang.Throwable -> L1e
            r7.onFinish()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r7)
            return r7
        L1e:
            r0 = move-exception
            goto L34
        L20:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L1e
            long r4 = r7.mMillisInFuture     // Catch: java.lang.Throwable -> L1e
            long r0 = r0 + r4
            r7.mStopTimeInFuture = r0     // Catch: java.lang.Throwable -> L1e
            android.os.Handler r0 = r7.mHandler     // Catch: java.lang.Throwable -> L1e
            android.os.Message r1 = r0.obtainMessage(r3)     // Catch: java.lang.Throwable -> L1e
            r0.sendMessage(r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r7)
            return r7
        L34:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }
}
