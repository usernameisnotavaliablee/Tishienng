package xyz.adscope.amps.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSReportTimer {
    private xyz.adscope.amps.report.AMPSReportTimer.AMPSReportTimerListener reportTimerListener;
    private long time;
    private java.util.TimerTask timeTask;
    private java.util.Timer timer;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface AMPSReportTimerListener {
        void onTrigger();
    }

    public AMPSReportTimer(xyz.adscope.amps.report.AMPSReportTimer.AMPSReportTimerListener r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.time = r0
            r2.reportTimerListener = r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L15
            long r3 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Exception -> L15
            r2.time = r3     // Catch: java.lang.Exception -> L15
        L15:
            return
    }

    static /* synthetic */ xyz.adscope.amps.report.AMPSReportTimer.AMPSReportTimerListener access$000(xyz.adscope.amps.report.AMPSReportTimer r0) {
            xyz.adscope.amps.report.AMPSReportTimer$AMPSReportTimerListener r0 = r0.reportTimerListener
            return r0
    }

    public void buildReportTimerTask() {
            r4 = this;
            java.util.Timer r0 = r4.timer
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r4.timer = r0
        Lb:
            java.util.TimerTask r0 = r4.timeTask
            if (r0 != 0) goto L16
            xyz.adscope.amps.report.AMPSReportTimer$1 r0 = new xyz.adscope.amps.report.AMPSReportTimer$1
            r0.<init>(r4)
            r4.timeTask = r0
        L16:
            java.util.Timer r0 = r4.timer
            java.util.TimerTask r1 = r4.timeTask
            long r2 = r4.time
            r0.schedule(r1, r2)
            return
    }

    public void cancelTimerTask() {
            r2 = this;
            java.util.TimerTask r0 = r2.timeTask
            r1 = 0
            if (r0 == 0) goto La
            r0.cancel()
            r2.timeTask = r1
        La:
            java.util.Timer r0 = r2.timer
            if (r0 == 0) goto L13
            r0.cancel()
            r2.timer = r1
        L13:
            r2.reportTimerListener = r1
            return
    }
}
