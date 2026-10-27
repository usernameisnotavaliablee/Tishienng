package xyz.adscope.amps.tool.task;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSManagerTask {
    private static final int BIDDING_TIME_OUT_MESSAGE = 200001;
    private static final int DISPATCH_FLOOR_AD_SOURCE_MESSAGE = 200003;
    private static final int REQUEST_TIME_OUT_MESSAGE = 200002;
    private long mBiddingTimeoutTime;
    private java.util.Timer mBiddingTimeoutTimer;
    private java.util.TimerTask mBiddingTimeoutTimerTask;
    private long mDispatchFloorAdSourceTime;
    private java.util.Timer mDispatchFloorAdSourceTimer;
    private java.util.TimerTask mDispatchFloorAdSourceTimerTask;
    private android.os.Handler mHandler;
    private xyz.adscope.amps.tool.task.inter.IBiddingTimeoutTimerCallBack mIBiddingTimeoutTimerCallBack;
    private xyz.adscope.amps.tool.task.inter.IDispatchFloorAdSourceTimerCallBack mIDispatchFloorAdSourceTimerCallBack;
    private xyz.adscope.amps.tool.task.inter.IRequestTimeoutTimerCallBack mIRequestTimeoutTimerCallBack;
    private long mRequestTimeoutTime;
    private java.util.Timer mRequestTimeoutTimer;
    private java.util.TimerTask mRequestTimeoutTimerTask;





    public AMPSManagerTask() {
            r2 = this;
            r2.<init>()
            xyz.adscope.amps.tool.task.AMPSManagerTask$1 r0 = new xyz.adscope.amps.tool.task.AMPSManagerTask$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.mHandler = r0
            return
    }

    static /* synthetic */ xyz.adscope.amps.tool.task.inter.IBiddingTimeoutTimerCallBack access$000(xyz.adscope.amps.tool.task.AMPSManagerTask r0) {
            xyz.adscope.amps.tool.task.inter.IBiddingTimeoutTimerCallBack r0 = r0.mIBiddingTimeoutTimerCallBack
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.tool.task.inter.IRequestTimeoutTimerCallBack access$100(xyz.adscope.amps.tool.task.AMPSManagerTask r0) {
            xyz.adscope.amps.tool.task.inter.IRequestTimeoutTimerCallBack r0 = r0.mIRequestTimeoutTimerCallBack
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.tool.task.inter.IDispatchFloorAdSourceTimerCallBack access$200(xyz.adscope.amps.tool.task.AMPSManagerTask r0) {
            xyz.adscope.amps.tool.task.inter.IDispatchFloorAdSourceTimerCallBack r0 = r0.mIDispatchFloorAdSourceTimerCallBack
            return r0
    }

    static /* synthetic */ android.os.Handler access$300(xyz.adscope.amps.tool.task.AMPSManagerTask r0) {
            android.os.Handler r0 = r0.mHandler
            return r0
    }

    private void buildBiddingTimerTask() {
            r4 = this;
            java.util.Timer r0 = r4.mBiddingTimeoutTimer
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r4.mBiddingTimeoutTimer = r0
        Lb:
            java.util.TimerTask r0 = r4.mBiddingTimeoutTimerTask
            if (r0 != 0) goto L16
            xyz.adscope.amps.tool.task.AMPSManagerTask$2 r0 = new xyz.adscope.amps.tool.task.AMPSManagerTask$2
            r0.<init>(r4)
            r4.mBiddingTimeoutTimerTask = r0
        L16:
            java.util.Timer r0 = r4.mBiddingTimeoutTimer
            if (r0 == 0) goto L24
            java.util.TimerTask r1 = r4.mBiddingTimeoutTimerTask
            if (r1 != 0) goto L1f
            goto L24
        L1f:
            long r2 = r4.mBiddingTimeoutTime
            r0.schedule(r1, r2)
        L24:
            return
    }

    private void buildDispatchFloorAdSourceTimerTask() {
            r4 = this;
            java.util.Timer r0 = r4.mDispatchFloorAdSourceTimer
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r4.mDispatchFloorAdSourceTimer = r0
        Lb:
            java.util.TimerTask r0 = r4.mDispatchFloorAdSourceTimerTask
            if (r0 != 0) goto L16
            xyz.adscope.amps.tool.task.AMPSManagerTask$4 r0 = new xyz.adscope.amps.tool.task.AMPSManagerTask$4
            r0.<init>(r4)
            r4.mDispatchFloorAdSourceTimerTask = r0
        L16:
            java.util.Timer r0 = r4.mDispatchFloorAdSourceTimer
            if (r0 == 0) goto L24
            java.util.TimerTask r1 = r4.mDispatchFloorAdSourceTimerTask
            if (r1 != 0) goto L1f
            goto L24
        L1f:
            long r2 = r4.mDispatchFloorAdSourceTime
            r0.schedule(r1, r2)
        L24:
            return
    }

    private void buildRequestedTimerTask() {
            r4 = this;
            java.util.Timer r0 = r4.mRequestTimeoutTimer
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r4.mRequestTimeoutTimer = r0
        Lb:
            java.util.TimerTask r0 = r4.mRequestTimeoutTimerTask
            if (r0 != 0) goto L16
            xyz.adscope.amps.tool.task.AMPSManagerTask$3 r0 = new xyz.adscope.amps.tool.task.AMPSManagerTask$3
            r0.<init>(r4)
            r4.mRequestTimeoutTimerTask = r0
        L16:
            java.util.Timer r0 = r4.mRequestTimeoutTimer
            if (r0 == 0) goto L24
            java.util.TimerTask r1 = r4.mRequestTimeoutTimerTask
            if (r1 != 0) goto L1f
            goto L24
        L1f:
            long r2 = r4.mRequestTimeoutTime
            r0.schedule(r1, r2)
        L24:
            return
    }

    public void cancelBiddingTimerTask() {
            r2 = this;
            java.util.TimerTask r0 = r2.mBiddingTimeoutTimerTask
            r1 = 0
            if (r0 == 0) goto La
            r0.cancel()
            r2.mBiddingTimeoutTimerTask = r1
        La:
            java.util.Timer r0 = r2.mBiddingTimeoutTimer
            if (r0 == 0) goto L13
            r0.cancel()
            r2.mBiddingTimeoutTimer = r1
        L13:
            return
    }

    public void cancelDispatchFloorAdSourceTimerTask() {
            r2 = this;
            java.util.TimerTask r0 = r2.mDispatchFloorAdSourceTimerTask
            r1 = 0
            if (r0 == 0) goto La
            r0.cancel()
            r2.mDispatchFloorAdSourceTimerTask = r1
        La:
            java.util.Timer r0 = r2.mDispatchFloorAdSourceTimer
            if (r0 == 0) goto L13
            r0.cancel()
            r2.mDispatchFloorAdSourceTimer = r1
        L13:
            return
    }

    public void cancelRequestedTimerTask() {
            r2 = this;
            java.util.TimerTask r0 = r2.mRequestTimeoutTimerTask
            r1 = 0
            if (r0 == 0) goto La
            r0.cancel()
            r2.mRequestTimeoutTimerTask = r1
        La:
            java.util.Timer r0 = r2.mRequestTimeoutTimer
            if (r0 == 0) goto L13
            r0.cancel()
            r2.mRequestTimeoutTimer = r1
        L13:
            return
    }

    public void startBiddingTimerTask(long r1, xyz.adscope.amps.tool.task.inter.IBiddingTimeoutTimerCallBack r3) {
            r0 = this;
            r0.mBiddingTimeoutTime = r1
            r0.mIBiddingTimeoutTimerCallBack = r3
            r0.buildBiddingTimerTask()
            return
    }

    public void startDispatchFloorAdSourceTimerTask(long r1, xyz.adscope.amps.tool.task.inter.IDispatchFloorAdSourceTimerCallBack r3) {
            r0 = this;
            r0.mDispatchFloorAdSourceTime = r1
            r0.mIDispatchFloorAdSourceTimerCallBack = r3
            r0.buildDispatchFloorAdSourceTimerTask()
            return
    }

    public void startRequestedTimerTask(long r1, xyz.adscope.amps.tool.task.inter.IRequestTimeoutTimerCallBack r3) {
            r0 = this;
            r0.mRequestTimeoutTime = r1
            r0.mIRequestTimeoutTimerCallBack = r3
            r0.buildRequestedTimerTask()
            return
    }
}
