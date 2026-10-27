package xyz.adscope.amps.tool.task;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSTimerOutTask {
    private static final int AD_REQUEST_TIME_OUT_MESSAGE = 100010;
    private static final int CONFIG_TIME_OUT = 10000;
    private static final int CONFIG_TIME_OUT_MESSAGE = 100012;
    private static final int INIT_ASYNC_TIME_OUT = 5000;
    private static final int INIT_SYNC_TIME_OUT = 3000;
    private static final int INIT_TIME_OUT_MESSAGE = 100011;
    private static final java.lang.String TAG = "TimerOutTask";
    private xyz.adscope.amps.model.AMPSGlobalModel adScopeCycleModel;
    private long configTimeOut;
    private java.util.TimerTask configTimeOutTask;
    private java.util.Timer configTimer;
    private xyz.adscope.amps.init.inter.IAMPSInitCallback initCallback;
    private long initTimeOut;
    private java.util.TimerTask initTimeTask;
    private java.util.Timer initTimer;
    private boolean isExecuteConfig;
    private boolean isExecuteInit;
    private android.os.Handler mHandler;




    public AMPSTimerOutTask() {
            r2 = this;
            r2.<init>()
            xyz.adscope.amps.tool.task.AMPSTimerOutTask$1 r0 = new xyz.adscope.amps.tool.task.AMPSTimerOutTask$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.mHandler = r0
            return
    }

    static /* synthetic */ boolean access$000(xyz.adscope.amps.tool.task.AMPSTimerOutTask r0) {
            boolean r0 = r0.isExecuteInit
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.init.inter.IAMPSInitCallback access$100(xyz.adscope.amps.tool.task.AMPSTimerOutTask r0) {
            xyz.adscope.amps.init.inter.IAMPSInitCallback r0 = r0.initCallback
            return r0
    }

    static /* synthetic */ boolean access$200(xyz.adscope.amps.tool.task.AMPSTimerOutTask r0) {
            boolean r0 = r0.isExecuteConfig
            return r0
    }

    static /* synthetic */ android.os.Handler access$300(xyz.adscope.amps.tool.task.AMPSTimerOutTask r0) {
            android.os.Handler r0 = r0.mHandler
            return r0
    }

    public void buildConfigTimerTask() {
            r4 = this;
            java.util.Timer r0 = r4.configTimer
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r4.configTimer = r0
        Lb:
            java.util.TimerTask r0 = r4.configTimeOutTask
            if (r0 != 0) goto L16
            xyz.adscope.amps.tool.task.AMPSTimerOutTask$3 r0 = new xyz.adscope.amps.tool.task.AMPSTimerOutTask$3
            r0.<init>(r4)
            r4.configTimeOutTask = r0
        L16:
            r0 = 10000(0x2710, double:4.9407E-320)
            r4.configTimeOut = r0
            java.util.Timer r2 = r4.configTimer
            java.util.TimerTask r3 = r4.configTimeOutTask
            r2.schedule(r3, r0)
            return
    }

    public void buildInitTimerTask(boolean r4) {
            r3 = this;
            java.util.Timer r0 = r3.initTimer
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r3.initTimer = r0
        Lb:
            java.util.TimerTask r0 = r3.initTimeTask
            if (r0 != 0) goto L16
            xyz.adscope.amps.tool.task.AMPSTimerOutTask$2 r0 = new xyz.adscope.amps.tool.task.AMPSTimerOutTask$2
            r0.<init>(r3)
            r3.initTimeTask = r0
        L16:
            if (r4 == 0) goto L1d
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.initTimeOut = r0
            goto L21
        L1d:
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.initTimeOut = r0
        L21:
            java.util.Timer r4 = r3.initTimer
            java.util.TimerTask r0 = r3.initTimeTask
            long r1 = r3.initTimeOut
            r4.schedule(r0, r1)
            return
    }

    public void cancelTimerTask() {
            r2 = this;
            java.util.TimerTask r0 = r2.initTimeTask
            r1 = 0
            if (r0 == 0) goto La
            r0.cancel()
            r2.initTimeTask = r1
        La:
            java.util.Timer r0 = r2.initTimer
            if (r0 == 0) goto L13
            r0.cancel()
            r2.initTimer = r1
        L13:
            java.util.TimerTask r0 = r2.configTimeOutTask
            if (r0 == 0) goto L1c
            r0.cancel()
            r2.configTimeOutTask = r1
        L1c:
            java.util.Timer r0 = r2.configTimer
            if (r0 == 0) goto L25
            r0.cancel()
            r2.configTimer = r1
        L25:
            return
    }

    public void setIsExecuteConfig(boolean r1) {
            r0 = this;
            r0.isExecuteConfig = r1
            return
    }
}
