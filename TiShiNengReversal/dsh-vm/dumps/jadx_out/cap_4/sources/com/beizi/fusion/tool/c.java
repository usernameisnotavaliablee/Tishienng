package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c implements java.lang.Runnable {
    private static java.lang.String a = "AppLinkRunnable";
    private com.beizi.fusion.model.TaskBean.BackTaskArrayBean b;
    private android.content.Context c;

    static {
            return
    }

    public c(android.content.Context r1, com.beizi.fusion.model.TaskBean.BackTaskArrayBean r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.b = r2
            return
    }

    private void a() {
            r18 = this;
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb2
            r1.<init>()     // Catch: java.lang.Exception -> Lb2
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r2 = r0.b     // Catch: java.lang.Exception -> Lb2
            java.util.List r2 = r2.getApps()     // Catch: java.lang.Exception -> Lb2
            if (r2 == 0) goto Lb2
            int r3 = r2.size()     // Catch: java.lang.Exception -> Lb2
            if (r3 <= 0) goto Lb2
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Lb2
        L19:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Lb2
            r4 = 0
            if (r3 == 0) goto L57
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Lb2
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean$AppLinkBean r3 = (com.beizi.fusion.model.TaskBean.BackTaskArrayBean.AppLinkBean) r3     // Catch: java.lang.Exception -> Lb2
            java.lang.String r5 = r3.getTestLink()     // Catch: java.lang.Exception -> Lb2
            android.content.Context r6 = r0.c     // Catch: java.lang.Exception -> Lb2
            boolean r5 = com.beizi.fusion.tool.ap.a(r6, r5)     // Catch: java.lang.Exception -> Lb2
            if (r5 == 0) goto L38
            r4 = 1
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> Lb2
            goto L3c
        L38:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> Lb2
        L3c:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb2
            r5.<init>()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = "appLinkId"
            java.lang.String r3 = r3.getAppLinkId()     // Catch: java.lang.Exception -> Lb2
            r5.put(r6, r3)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = "isLink"
            r5.put(r3, r4)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> Lb2
            r1.add(r3)     // Catch: java.lang.Exception -> Lb2
            goto L19
        L57:
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r2 = r0.b     // Catch: java.lang.Exception -> Lb2
            java.util.List r2 = r2.getReport()     // Catch: java.lang.Exception -> Lb2
            if (r2 == 0) goto Lb2
            int r3 = r2.size()     // Catch: java.lang.Exception -> Lb2
            if (r3 <= 0) goto Lb2
        L65:
            int r3 = r2.size()     // Catch: java.lang.Exception -> Lb2
            if (r4 >= r3) goto Lb2
            java.lang.Object r3 = r2.get(r4)     // Catch: java.lang.Exception -> Lb2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Exception -> Lb2
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lb2
            if (r3 != 0) goto Laf
            android.content.Context r3 = r0.c     // Catch: java.lang.Exception -> Lb2
            com.beizi.fusion.events.EventCar r3 = com.beizi.fusion.events.EventCar.getInstance(r3)     // Catch: java.lang.Exception -> Lb2
            com.beizi.fusion.events.EventBean r5 = new com.beizi.fusion.events.EventBean     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = com.beizi.fusion.c.b.b     // Catch: java.lang.Exception -> Lb2
            java.lang.String r7 = ""
            java.lang.String r8 = "590.200"
            java.lang.String r9 = ""
            com.beizi.fusion.c.b r10 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r14 = ""
            java.lang.String r15 = r1.toString()     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r16 = r2.get(r4)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r16 = (java.lang.String) r16     // Catch: java.lang.Exception -> Lb2
            r17 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> Lb2
            r3.goRoadWithoutThread(r5)     // Catch: java.lang.Exception -> Lb2
        Laf:
            int r4 = r4 + 1
            goto L65
        Lb2:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r0 = r12.b
            if (r0 == 0) goto L91
            android.content.Context r0 = r12.c     // Catch: java.lang.Exception -> L1b
            java.lang.Long r0 = com.beizi.fusion.tool.ap.o(r0)     // Catch: java.lang.Exception -> L1b
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L1b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1b
            long r2 = r2 - r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L1b
            goto L91
        L1b:
            r0 = 0
        L1c:
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r1 = r12.b
            int r1 = r1.getRepeatCount()
            if (r0 >= r1) goto L65
            com.beizi.fusion.model.TaskBean$BackTaskArrayBean r1 = r12.b
            java.lang.String r1 = r1.getMethod()
            java.lang.String r2 = "GET"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L62
            r12.a()     // Catch: java.lang.Exception -> L36
            goto L62
        L36:
            android.content.Context r1 = r12.c
            com.beizi.fusion.events.EventCar r1 = com.beizi.fusion.events.EventCar.getInstance(r1)
            com.beizi.fusion.events.EventBean r2 = new com.beizi.fusion.events.EventBean
            java.lang.String r3 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r4 = com.beizi.fusion.c.b.a()
            java.lang.String r7 = r4.b()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r11 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = "510.500"
            java.lang.String r6 = ""
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.goRoadWithoutThread(r2)
        L62:
            int r0 = r0 + 1
            goto L1c
        L65:
            android.content.Context r0 = r12.c
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
            r0.goRoadWithoutThread(r1)
        L91:
            return
    }
}
