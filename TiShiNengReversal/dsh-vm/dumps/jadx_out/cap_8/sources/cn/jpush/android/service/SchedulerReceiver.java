package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SchedulerReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String DELAY_NOTIFY = "delay_notify";
    private static final java.lang.String TAG = "SchedulerReceiver";

    public SchedulerReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            java.lang.String r0 = "delay_notify"
            java.lang.String r1 = "SchedulerReceiver"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "onReceive action="
            r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r6.getAction()     // Catch: java.lang.Throwable -> L2d
            r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            cn.jpush.android.helper.Logger.dd(r1, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r6.getAction()     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L2f
            java.lang.String r6 = "JPUSH"
            r2 = 0
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r5, r6, r0, r2)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r5 = move-exception
            goto L30
        L2f:
            return
        L30:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "onReceive e:"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jpush.android.helper.Logger.w(r1, r5)
            return
    }
}
