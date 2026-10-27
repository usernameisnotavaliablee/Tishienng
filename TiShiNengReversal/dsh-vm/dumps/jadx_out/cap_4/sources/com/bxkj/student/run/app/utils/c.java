package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    private final long a;
    private android.content.Context b;
    public android.app.AlarmManager c;
    public android.app.PendingIntent d;

    public c(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.a = r0
            r2.b = r3
            java.lang.String r0 = "alarm"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.AlarmManager r3 = (android.app.AlarmManager) r3
            r2.c = r3
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "WANG_LEI"
            r3.<init>(r0)
            java.lang.String r0 = "msg"
            java.lang.String r1 = "赶紧起床"
            r3.putExtra(r0, r1)
            android.content.Context r0 = r2.b
            r1 = 0
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r0, r1, r3, r1)
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

    @android.annotation.SuppressLint({"NewApi"})
    public void c() {
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
