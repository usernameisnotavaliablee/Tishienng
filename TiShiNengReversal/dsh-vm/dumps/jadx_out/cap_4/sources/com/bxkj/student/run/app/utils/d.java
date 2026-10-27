package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setAction(r2)
            r2 = 0
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r1, r2, r0, r2)
            java.lang.String r0 = "alarm"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AlarmManager r1 = (android.app.AlarmManager) r1
            r1.cancel(r2)
            return
    }

    public static void b(android.content.Context r8, long r9, long r11, java.lang.String r13, int r14) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setAction(r13)
            r13 = 0
            android.app.PendingIntent r7 = android.app.PendingIntent.getBroadcast(r8, r13, r0, r13)
            java.lang.String r13 = "alarm"
            java.lang.Object r8 = r8.getSystemService(r13)
            r1 = r8
            android.app.AlarmManager r1 = (android.app.AlarmManager) r1
            r3 = r9
            r5 = r11
            r2 = r14
            r1.setRepeating(r2, r3, r5, r7)
            return
    }
}
