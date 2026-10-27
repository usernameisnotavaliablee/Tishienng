package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    private final long a;
    private android.content.Context b;
    private android.app.AlarmManager c;
    private android.app.PendingIntent d;

    public b(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.a = r0
            r2.b = r3
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            r2.c = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bxkj.student.run.app.location.service.LocationService> r1 = com.bxkj.student.run.app.location.service.LocationService.class
            r0.<init>(r3, r1)
            java.lang.String r3 = "REQUEST_LOCATION"
            r0.setAction(r3)
            java.lang.String r3 = "msg"
            java.lang.String r1 = "心跳包"
            r0.putExtra(r3, r1)
            android.content.Context r3 = r2.b
            r1 = 0
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r3, r1, r0, r1)
            r2.d = r3
            return
    }

    public void a() {
            r2 = this;
            android.app.AlarmManager r0 = r2.c
            if (r0 == 0) goto Lb
            android.app.PendingIntent r1 = r2.d
            if (r1 == 0) goto Lb
            r0.cancel(r1)
        Lb:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void b() {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 0
            if (r0 < r1) goto L16
            android.app.AlarmManager r0 = r7.c
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 + r2
            android.app.PendingIntent r1 = r7.d
            com.bxkj.base.chat.heart.a.a(r0, r4, r5, r1)
            return
        L16:
            android.app.AlarmManager r0 = r7.c
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 + r2
            android.app.PendingIntent r1 = r7.d
            r0.setExact(r4, r5, r1)
            return
    }
}
