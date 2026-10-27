package xyz.adscope.amps.tool.task.scheduler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSConfigSchedulerTask implements xyz.adscope.amps.tool.task.inter.ISchedulerTask {
    private static final long INITIAL_DELAY_TIME = 10000;
    private static final int UPDATE_THREAD_COUNT = 2;
    private xyz.adscope.amps.config.AMPSConfigManager adConfigManager;
    private xyz.adscope.amps.model.AMPSGlobalModel ampsGlobalModel;
    private long heartbeatTime;
    private boolean isStart;
    private java.util.concurrent.ScheduledExecutorService mHeartTask;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ConfigTaskRunnable implements java.lang.Runnable {
        final /* synthetic */ xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask this$0;

        ConfigTaskRunnable(xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r0 = r3.this$0
                xyz.adscope.amps.config.AMPSConfigManager r0 = xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask.access$000(r0)
                if (r0 == 0) goto L24
                xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r0 = r3.this$0
                xyz.adscope.amps.config.AMPSConfigManager r0 = xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask.access$000(r0)
                boolean r0 = r0.checkConfig()
                if (r0 == 0) goto L24
                xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r0 = r3.this$0
                xyz.adscope.amps.config.AMPSConfigManager r0 = xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask.access$000(r0)
                xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r1 = r3.this$0
                xyz.adscope.amps.model.AMPSGlobalModel r1 = xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask.access$100(r1)
                r2 = 0
                r0.requestConfigureFile(r1, r2)
            L24:
                return
        }
    }

    public AMPSConfigSchedulerTask(xyz.adscope.amps.config.AMPSConfigManager r3) {
            r2 = this;
            r2.<init>()
            r0 = 60000(0xea60, double:2.9644E-319)
            r2.heartbeatTime = r0
            r0 = 0
            r2.isStart = r0
            r2.adConfigManager = r3
            r3 = 2
            java.util.concurrent.ScheduledExecutorService r3 = java.util.concurrent.Executors.newScheduledThreadPool(r3)
            r2.mHeartTask = r3
            return
    }

    static /* synthetic */ xyz.adscope.amps.config.AMPSConfigManager access$000(xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r0) {
            xyz.adscope.amps.config.AMPSConfigManager r0 = r0.adConfigManager
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.model.AMPSGlobalModel access$100(xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r0) {
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r0.ampsGlobalModel
            return r0
    }

    public void setAdScopeGlobalModel(xyz.adscope.amps.model.AMPSGlobalModel r1) {
            r0 = this;
            r0.ampsGlobalModel = r1
            return
    }

    @Override // xyz.adscope.amps.tool.task.inter.ISchedulerTask
    public void startSchedulerTask() {
            r9 = this;
            boolean r0 = r9.isStart
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r9.isStart = r0
            long r0 = r9.heartbeatTime
            xyz.adscope.amps.config.AMPSConfigResponseInfo r2 = xyz.adscope.amps.config.AMPSConfigResponseInfo.getInstance()
            long r2 = r2.getCheckTime()
            long r0 = java.lang.Math.max(r0, r2)
            r9.heartbeatTime = r0
            java.util.concurrent.ScheduledExecutorService r2 = r9.mHeartTask
            xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask$ConfigTaskRunnable r3 = new xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask$ConfigTaskRunnable
            r3.<init>(r9)
            long r6 = r9.heartbeatTime
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4 = 10000(0x2710, double:4.9407E-320)
            r2.scheduleWithFixedDelay(r3, r4, r6, r8)
            return
    }

    @Override // xyz.adscope.amps.tool.task.inter.ISchedulerTask
    public void stopSchedulerTask() {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r1.mHeartTask
            if (r0 == 0) goto L7
            r0.shutdownNow()
        L7:
            return
    }
}
