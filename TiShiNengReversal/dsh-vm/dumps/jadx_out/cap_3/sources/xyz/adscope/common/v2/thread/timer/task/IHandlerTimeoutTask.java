package xyz.adscope.common.v2.thread.timer.task;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class IHandlerTimeoutTask extends xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask {
    public static final int SCHEDULE_TIMEOUT_MSG = 1001;
    public static final int TIMEOUT_INIT_CONFIG = 10000;
    public static final int TIMEOUT_REQUEST_AD_DEFAULT = 10000;
    private final android.os.Handler mTaskHandler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.thread.timer.task.IHandlerTimeoutTask$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TimeoutHandler extends xyz.adscope.common.v2.handle.WeakReferenceHandler {
        private final xyz.adscope.common.v2.thread.timer.task.IHandlerTimeoutTask task;

        private TimeoutHandler(android.content.Context r1, xyz.adscope.common.v2.thread.timer.task.IHandlerTimeoutTask r2) {
                r0 = this;
                r0.<init>(r1)
                r0.task = r2
                return
        }

        /* synthetic */ TimeoutHandler(android.content.Context r1, xyz.adscope.common.v2.thread.timer.task.IHandlerTimeoutTask r2, xyz.adscope.common.v2.thread.timer.task.IHandlerTimeoutTask.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // xyz.adscope.common.v2.handle.WeakReferenceHandler
        public void scopeHandleMessage(android.os.Message r2) {
                r1 = this;
                if (r2 == 0) goto L14
                int r2 = r2.what
                r0 = 1001(0x3e9, float:1.403E-42)
                if (r2 != r0) goto L14
                xyz.adscope.common.v2.thread.timer.task.IHandlerTimeoutTask r2 = r1.task
                if (r2 == 0) goto L14
                r2.handleMessageExecute()
                xyz.adscope.common.v2.thread.timer.task.IHandlerTimeoutTask r2 = r1.task
                r2.cancelCountDown()
            L14:
                return
        }
    }

    public IHandlerTimeoutTask(android.content.Context r1, long r2) {
            r0 = this;
            r0.<init>(r2)
            xyz.adscope.common.v2.thread.timer.task.IHandlerTimeoutTask$TimeoutHandler r2 = new xyz.adscope.common.v2.thread.timer.task.IHandlerTimeoutTask$TimeoutHandler
            r3 = 0
            r2.<init>(r1, r0, r3)
            r0.mTaskHandler = r2
            return
    }

    @Override // xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask
    public void cancelCountDown() {
            r2 = this;
            android.os.Handler r0 = r2.mTaskHandler
            if (r0 == 0) goto L11
            r1 = 1001(0x3e9, float:1.403E-42)
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L11
            android.os.Handler r0 = r2.mTaskHandler
            r0.removeMessages(r1)
        L11:
            super.cancelCountDown()
            return
    }

    protected abstract void handleMessageExecute();

    @Override // xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask
    protected void onScheduleTimeout() {
            r2 = this;
            android.os.Handler r0 = r2.mTaskHandler
            r1 = 1001(0x3e9, float:1.403E-42)
            r0.sendEmptyMessage(r1)
            return
    }
}
