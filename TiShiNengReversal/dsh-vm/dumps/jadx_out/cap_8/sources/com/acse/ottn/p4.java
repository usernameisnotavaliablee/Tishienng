package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class p4 {
    public static com.acse.ottn.p4 a;

    public p4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.p4 a() {
            com.acse.ottn.p4 r0 = com.acse.ottn.p4.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.p4> r0 = com.acse.ottn.p4.class
            monitor-enter(r0)
            com.acse.ottn.p4 r1 = com.acse.ottn.p4.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.p4 r1 = new com.acse.ottn.p4     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.p4.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.p4 r0 = com.acse.ottn.p4.a
            return r0
    }

    public void a(int r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "click_location_content"
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L86
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L86
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L86
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r0, r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r1 = "重要通知"
            r2 = 4
            java.lang.String r3 = "1"
            android.app.NotificationChannel r1 = cn.jiguang.av.b0.a(r3, r1, r2)
            cn.jiguang.av.z.a(r0, r1)
            androidx.core.app.NotificationCompat$Builder r1 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            r1.<init>(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r8 = "-->"
            r2.append(r8)
            com.acse.ottn.s0 r8 = com.acse.ottn.s0.d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r4 = ""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r8 = r8.f(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            androidx.core.app.NotificationCompat$Builder r8 = r1.setContentText(r8)
            androidx.core.app.NotificationCompat$Builder r8 = r8.setContentTitle(r9)
            int r9 = com.acse.ottn.R.mipmap.up_green
            androidx.core.app.NotificationCompat$Builder r8 = r8.setSmallIcon(r9)
            long r2 = java.lang.System.currentTimeMillis()
            r8.setWhen(r2)
            android.app.Notification r8 = r1.build()
            r0.notify(r7, r8)
        L86:
            return
    }

    public void a(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            int r1 = com.acse.ottn.R.layout.toast_layout
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.acse.ottn.R.id.toast_layout
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r1.setLayoutParams(r2)
            int r1 = com.acse.ottn.R.id.toast_text
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r6)
            android.widget.Toast r6 = new android.widget.Toast
            r6.<init>(r5)
            r5 = 119(0x77, float:1.67E-43)
            r1 = 0
            r6.setGravity(r5, r1, r1)
            r5 = 1
            r6.setDuration(r5)
            r6.setView(r0)
            r6.show()
            return
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.p4 r0 = com.acse.ottn.p4.a
            return r0
    }

    public void b(int r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            boolean r0 = com.acse.ottn.l0.f2433d
            if (r0 == 0) goto L7e
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L7e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L7e
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
            java.lang.Object r0 = androidx.core.content.pm.z0.a(r0, r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r1 = "重要通知"
            r2 = 4
            java.lang.String r3 = "1"
            android.app.NotificationChannel r1 = cn.jiguang.av.b0.a(r3, r1, r2)
            cn.jiguang.av.z.a(r0, r1)
            androidx.core.app.NotificationCompat$Builder r1 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            r1.<init>(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r8 = "-->"
            r2.append(r8)
            com.acse.ottn.s0 r8 = com.acse.ottn.s0.d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r4 = ""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r8 = r8.f(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            androidx.core.app.NotificationCompat$Builder r8 = r1.setContentText(r8)
            androidx.core.app.NotificationCompat$Builder r8 = r8.setContentTitle(r9)
            int r9 = com.acse.ottn.R.mipmap.up_green
            androidx.core.app.NotificationCompat$Builder r8 = r8.setSmallIcon(r9)
            long r2 = java.lang.System.currentTimeMillis()
            r8.setWhen(r2)
            android.app.Notification r8 = r1.build()
            r0.notify(r7, r8)
        L7e:
            return
    }
}
