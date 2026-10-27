package com.bxkj.student.run.app.step;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AlarmReceiver extends android.content.BroadcastReceiver {
    public AlarmReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.bxkj.student.run.app.step.LongRunningService> r0 = com.bxkj.student.run.app.step.LongRunningService.class
            r3.<init>(r2, r0)
            r2.startService(r3)
            return
    }
}
