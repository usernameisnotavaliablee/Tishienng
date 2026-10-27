package xyz.adscope.amps.init;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSInitUserAgent {
    public static final int USER_AGENT_MESSAGE = 1;
    private java.util.concurrent.ScheduledExecutorService executor;
    private android.content.Context mContext;
    private android.os.Handler mHandler;



    public AMPSInitUserAgent() {
            r2 = this;
            r2.<init>()
            xyz.adscope.amps.init.AMPSInitUserAgent$1 r0 = new xyz.adscope.amps.init.AMPSInitUserAgent$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.mHandler = r0
            return
    }

    static /* synthetic */ android.content.Context access$000(xyz.adscope.amps.init.AMPSInitUserAgent r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ void access$100(xyz.adscope.amps.init.AMPSInitUserAgent r0) {
            r0.stopSchedulerTask()
            return
    }

    static /* synthetic */ android.os.Handler access$200(xyz.adscope.amps.init.AMPSInitUserAgent r0) {
            android.os.Handler r0 = r0.mHandler
            return r0
    }

    private void stopSchedulerTask() {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r1.executor
            if (r0 == 0) goto L7
            r0.shutdown()
        L7:
            return
    }

    public void getUserAgent(android.content.Context r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.util.concurrent.ScheduledExecutorService r0 = xyz.adscope.amps.tool.thread.AMPSThreadPool.getScheduledExecutorService()
            r4.executor = r0
            r4.mContext = r5
            xyz.adscope.amps.init.AMPSInitUserAgent$2 r5 = new xyz.adscope.amps.init.AMPSInitUserAgent$2
            r5.<init>(r4)
            r1 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r5, r1, r3)
            return
    }
}
