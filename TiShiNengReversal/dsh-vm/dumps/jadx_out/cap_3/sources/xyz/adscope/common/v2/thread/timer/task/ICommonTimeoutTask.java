package xyz.adscope.common.v2.thread.timer.task;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class ICommonTimeoutTask {
    protected final long mTimeoutMillion;
    private final xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask.InnerTimerTask mTimer;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class InnerTimerTask implements xyz.adscope.common.v2.thread.timer.task.IBaseTimerTask {
        private java.util.TimerTask mTask;
        private java.util.Timer mTimer;
        final /* synthetic */ xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask this$0;


        private InnerTimerTask(xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ InnerTimerTask(xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r1, xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void resetTimer() {
                r1 = this;
                r1.cancel()
                java.util.Timer r0 = new java.util.Timer
                r0.<init>()
                r1.mTimer = r0
                xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask$InnerTimerTask$1 r0 = new xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask$InnerTimerTask$1
                r0.<init>(r1)
                r1.mTask = r0
                return
        }

        @Override // xyz.adscope.common.v2.thread.timer.task.IBaseTimerTask
        public synchronized void cancel() {
                r1 = this;
                monitor-enter(r1)
                java.util.TimerTask r0 = r1.mTask     // Catch: java.lang.Throwable -> L9
                if (r0 == 0) goto Lb
                r0.cancel()     // Catch: java.lang.Throwable -> L9
                goto Lb
            L9:
                r0 = move-exception
                goto L1e
            Lb:
                java.util.Timer r0 = r1.mTimer     // Catch: java.lang.Throwable -> L9
                if (r0 == 0) goto L17
                r0.cancel()     // Catch: java.lang.Throwable -> L9
                java.util.Timer r0 = r1.mTimer     // Catch: java.lang.Throwable -> L9
                r0.purge()     // Catch: java.lang.Throwable -> L9
            L17:
                r0 = 0
                r1.mTimer = r0     // Catch: java.lang.Throwable -> L9
                r1.mTask = r0     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return
            L1e:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r0
        }

        @Override // xyz.adscope.common.v2.thread.timer.task.IBaseTimerTask
        public void schedule(long r3) {
                r2 = this;
                r2.resetTimer()
                java.util.Timer r0 = r2.mTimer
                if (r0 == 0) goto Lc
                java.util.TimerTask r1 = r2.mTask
                r0.schedule(r1, r3)
            Lc:
                return
        }

        @Override // xyz.adscope.common.v2.thread.timer.task.IBaseTimerTask
        public void schedule(long r7, long r9) {
                r6 = this;
                r6.resetTimer()
                java.util.Timer r0 = r6.mTimer
                if (r0 == 0) goto Le
                java.util.TimerTask r1 = r6.mTask
                r2 = r7
                r4 = r9
                r0.schedule(r1, r2, r4)
            Le:
                return
        }
    }

    public ICommonTimeoutTask(long r1) {
            r0 = this;
            r0.<init>()
            r0.mTimeoutMillion = r1
            xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask$InnerTimerTask r1 = new xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask$InnerTimerTask
            r2 = 0
            r1.<init>(r0, r2)
            r0.mTimer = r1
            return
    }

    public void cancelCountDown() {
            r1 = this;
            xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask$InnerTimerTask r0 = r1.mTimer
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    protected abstract void onScheduleTimeout();

    public void startCountDown() {
            r3 = this;
            xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask$InnerTimerTask r0 = r3.mTimer
            if (r0 == 0) goto L9
            long r1 = r3.mTimeoutMillion
            r0.schedule(r1)
        L9:
            return
    }
}
