package com.bxkj.student.run.app.step;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LongRunningService extends android.app.Service {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.bxkj.student.run.app.step.LongRunningService a;

        a(com.bxkj.student.run.app.step.LongRunningService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                r0.toString()
                return
        }
    }

    public LongRunningService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r6, int r7, int r8) {
            r5 = this;
            java.lang.Thread r0 = new java.lang.Thread
            com.bxkj.student.run.app.step.LongRunningService$a r1 = new com.bxkj.student.run.app.step.LongRunningService$a
            r1.<init>(r5)
            r0.<init>(r1)
            r0.start()
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r1 = r1 + r3
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.bxkj.student.run.app.step.AlarmReceiver> r4 = com.bxkj.student.run.app.step.AlarmReceiver.class
            r3.<init>(r5, r4)
            r4 = 0
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r5, r4, r3, r4)
            r4 = 2
            r0.setExact(r4, r1, r3)
            int r6 = super.onStartCommand(r6, r7, r8)
            return r6
    }
}
