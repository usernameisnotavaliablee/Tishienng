package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class aq implements java.lang.Runnable {
    private static java.lang.String a = "TaskRunnable";
    private com.beizi.fusion.model.TaskBean.BackTaskArrayBean b;
    private android.content.Context c;

    static {
            return
    }

    public aq(android.content.Context r1, com.beizi.fusion.model.TaskBean.BackTaskArrayBean r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.b = r2
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r17 = this;
            r0 = r17
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r1 = r0.b
            if (r1 == 0) goto L144
            r1 = 0
            r2 = 0
        L8:
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r3 = r0.b
            int r3 = r3.getRepeatCount()
            if (r2 >= r3) goto L118
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r3 = r0.b
            java.lang.String r3 = r3.getMethod()
            java.lang.String r4 = "GET"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L114
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r3 = r0.b
            java.lang.String r3 = r3.getContentUrl()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L114
            android.content.Context r3 = r0.c     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r4 = r0.b     // Catch: java.lang.Exception -> Le8
            java.lang.String r4 = r4.getContentUrl()     // Catch: java.lang.Exception -> Le8
            r5 = 0
            java.lang.String r3 = com.beizi.fusion.tool.ao.a(r3, r4, r5)     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r4 = r0.b     // Catch: java.lang.Exception -> Le8
            java.lang.String r4 = r4.getUserAgent()     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.tool.v.a(r3, r4)     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r3 = r0.b     // Catch: java.lang.Exception -> Le8
            long r3 = r3.getSleepTime()     // Catch: java.lang.Exception -> Le8
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r3 = r0.b     // Catch: java.lang.Exception -> Le8
            java.util.List r3 = r3.getReport()     // Catch: java.lang.Exception -> Le8
            if (r3 == 0) goto L114
            int r4 = r3.size()     // Catch: java.lang.Exception -> Le8
            if (r4 <= 0) goto L114
            r4 = 0
        L58:
            int r6 = r3.size()     // Catch: java.lang.Exception -> Le8
            if (r4 >= r6) goto L114
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Exception -> Le8
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Exception -> Le8
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Le8
            if (r6 != 0) goto Le4
            android.content.Context r6 = r0.c     // Catch: java.lang.Exception -> Le8
            java.lang.Object r7 = r3.get(r4)     // Catch: java.lang.Exception -> Le8
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> Le8
            java.lang.String r6 = com.beizi.fusion.tool.ao.a(r6, r7, r5)     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r7 = r0.b     // Catch: java.lang.Exception -> Le8
            java.lang.String r7 = r7.getUserAgent()     // Catch: java.lang.Exception -> Le8
            java.lang.String r6 = com.beizi.fusion.tool.v.a(r6, r7)     // Catch: java.lang.Exception -> Le8
            if (r6 == 0) goto Laf
            android.content.Context r6 = r0.c     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.events.EventCar r6 = com.beizi.fusion.events.EventCar.getInstance(r6)     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.events.EventBean r7 = new com.beizi.fusion.events.EventBean     // Catch: java.lang.Exception -> Le8
            java.lang.String r8 = com.beizi.fusion.c.b.b     // Catch: java.lang.Exception -> Le8
            java.lang.String r9 = ""
            java.lang.String r10 = "520.200"
            java.lang.String r11 = ""
            com.beizi.fusion.c.b r12 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> Le8
            java.lang.String r12 = r12.b()     // Catch: java.lang.Exception -> Le8
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            long r15 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Le8
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch: java.lang.Exception -> Le8
            java.lang.String r16 = ""
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> Le8
            r6.goRoadWithoutThread(r7)     // Catch: java.lang.Exception -> Le8
            goto Ldb
        Laf:
            android.content.Context r6 = r0.c     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.events.EventCar r6 = com.beizi.fusion.events.EventCar.getInstance(r6)     // Catch: java.lang.Exception -> Le8
            com.beizi.fusion.events.EventBean r7 = new com.beizi.fusion.events.EventBean     // Catch: java.lang.Exception -> Le8
            java.lang.String r8 = com.beizi.fusion.c.b.b     // Catch: java.lang.Exception -> Le8
            java.lang.String r9 = ""
            java.lang.String r10 = "520.500"
            java.lang.String r11 = ""
            com.beizi.fusion.c.b r12 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> Le8
            java.lang.String r12 = r12.b()     // Catch: java.lang.Exception -> Le8
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            long r15 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Le8
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch: java.lang.Exception -> Le8
            java.lang.String r16 = ""
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> Le8
            r6.goRoadWithoutThread(r7)     // Catch: java.lang.Exception -> Le8
        Ldb:
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r6 = r0.b     // Catch: java.lang.Exception -> Le8
            long r6 = r6.getSleepTime()     // Catch: java.lang.Exception -> Le8
            java.lang.Thread.sleep(r6)     // Catch: java.lang.Exception -> Le8
        Le4:
            int r4 = r4 + 1
            goto L58
        Le8:
            android.content.Context r3 = r0.c
            com.beizi.fusion.events.EventCar r3 = com.beizi.fusion.events.EventCar.getInstance(r3)
            com.beizi.fusion.events.EventBean r4 = new com.beizi.fusion.events.EventBean
            java.lang.String r5 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r6 = com.beizi.fusion.c.b.a()
            java.lang.String r9 = r6.b()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r12 = java.lang.String.valueOf(r6)
            java.lang.String r13 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "510.500"
            java.lang.String r8 = ""
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3.goRoadWithoutThread(r4)
        L114:
            int r2 = r2 + 1
            goto L8
        L118:
            android.content.Context r1 = r0.c
            com.beizi.fusion.events.EventCar r1 = com.beizi.fusion.events.EventCar.getInstance(r1)
            com.beizi.fusion.events.EventBean r2 = new com.beizi.fusion.events.EventBean
            java.lang.String r3 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r4 = com.beizi.fusion.c.b.a()
            java.lang.String r7 = r4.b()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r11 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = "510.200"
            java.lang.String r6 = ""
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.goRoadWithoutThread(r2)
        L144:
            return
    }
}
