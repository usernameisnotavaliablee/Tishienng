package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k {
    private static com.beizi.fusion.tool.k b;
    private java.lang.String a;
    private android.content.Context c;


    private k(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "ClipUtil"
            r1.a = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.c = r2
            return
    }

    static /* synthetic */ android.content.Context a(com.beizi.fusion.tool.k r0) {
            android.content.Context r0 = r0.c
            return r0
    }

    public static com.beizi.fusion.tool.k a(android.content.Context r2) {
            com.beizi.fusion.tool.k r0 = com.beizi.fusion.tool.k.b
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.fusion.tool.k> r0 = com.beizi.fusion.tool.k.class
            monitor-enter(r0)
            com.beizi.fusion.tool.k r1 = com.beizi.fusion.tool.k.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.fusion.tool.k r1 = new com.beizi.fusion.tool.k     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.tool.k.b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.beizi.fusion.tool.k r2 = com.beizi.fusion.tool.k.b
            return r2
    }

    public void a(com.beizi.fusion.model.TaskBean.BackTaskArrayBean r12) {
            r11 = this;
            if (r12 == 0) goto L55
            java.lang.String r0 = r12.getContentUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L55
            android.content.Context r0 = r11.c
            com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
            java.lang.String r2 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r3 = com.beizi.fusion.c.b.a()
            java.lang.String r6 = r3.b()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "510.200"
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.goRoad(r1)
            java.util.List r0 = r12.getReport()
            if (r0 == 0) goto L54
            int r1 = r0.size()
            if (r1 <= 0) goto L54
            com.beizi.fusion.tool.e r1 = com.beizi.fusion.tool.e.b()
            java.util.concurrent.ExecutorService r1 = r1.e()
            com.beizi.fusion.tool.k$1 r2 = new com.beizi.fusion.tool.k$1
            r2.<init>(r11, r0, r12)
            r1.execute(r2)
        L54:
            return
        L55:
            android.content.Context r12 = r11.c
            com.beizi.fusion.events.EventCar r12 = com.beizi.fusion.events.EventCar.getInstance(r12)
            com.beizi.fusion.events.EventBean r0 = new com.beizi.fusion.events.EventBean
            java.lang.String r1 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r2 = com.beizi.fusion.c.b.a()
            java.lang.String r5 = r2.b()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r2)
            java.lang.String r9 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = "510.500"
            java.lang.String r4 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.goRoad(r0)
            return
    }
}
