package com.beizi.fusion.events;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class EventCar {
    private static com.beizi.fusion.events.EventCar a;
    private android.content.Context b;
    private java.util.List<com.beizi.fusion.model.Messenger.EventsBean> c;
    private long d;
    private long e;


    private EventCar(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 128(0x80, double:6.3E-322)
            r2.d = r0
            r0 = 172800000(0xa4cb800, double:8.53745436E-316)
            r2.e = r0
            r2.b = r3
            com.beizi.fusion.model.RequestInfo r3 = com.beizi.fusion.model.RequestInfo.getInstance(r3)
            com.beizi.fusion.model.RequestInfo r3 = r3.init()
            boolean r0 = r3.isInit()
            if (r0 != 0) goto L1f
            r3.init()
        L1f:
            return
    }

    private static java.lang.String a(java.io.File r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L21
            r1.<init>(r3)     // Catch: java.lang.Exception -> L21
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L21
            r3.<init>(r1)     // Catch: java.lang.Exception -> L21
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L21
            r2.<init>(r3)     // Catch: java.lang.Exception -> L21
        L14:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Exception -> L21
            if (r3 == 0) goto L1e
            r0.append(r3)     // Catch: java.lang.Exception -> L21
            goto L14
        L1e:
            r1.close()     // Catch: java.lang.Exception -> L21
        L21:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private java.lang.String a(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L24
            java.lang.String r0 = "."
            int r0 = r3.indexOf(r0)
            int r0 = r0 + 1
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "*"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L24:
            return r3
    }

    private void a(com.beizi.fusion.events.EventBean r9) {
            r8 = this;
            android.content.Context r0 = r8.b     // Catch: java.lang.Throwable -> Lb8
            com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.model.ResponseInfo.getInstance(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r9.getEventCode()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> Lb8
            com.beizi.fusion.model.Messenger r2 = r0.getMessenger()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto Lb8
            com.beizi.fusion.model.Messenger r2 = r0.getMessenger()     // Catch: java.lang.Throwable -> Lb8
            java.util.List r2 = r2.getEvents()     // Catch: java.lang.Throwable -> Lb8
            r8.c = r2     // Catch: java.lang.Throwable -> Lb8
            com.beizi.fusion.model.Messenger r2 = r0.getMessenger()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = r2.getFileMaxSize()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lb8
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> Lb8
            r8.d = r2     // Catch: java.lang.Throwable -> Lb8
            com.beizi.fusion.model.Messenger r0 = r0.getMessenger()     // Catch: java.lang.Throwable -> Lb8
            long r2 = r0.getExpireTime()     // Catch: java.lang.Throwable -> Lb8
            r8.e = r2     // Catch: java.lang.Throwable -> Lb8
            java.util.List<com.beizi.fusion.model.Messenger$EventsBean> r0 = r8.c     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto Lb8
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb8
            if (r0 <= 0) goto Lb8
            r0 = 0
            r2 = 0
        L46:
            java.util.List<com.beizi.fusion.model.Messenger$EventsBean> r3 = r8.c     // Catch: java.lang.Throwable -> Lb8
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lb8
            if (r2 >= r3) goto Lb8
            java.util.List<com.beizi.fusion.model.Messenger$EventsBean> r3 = r8.c     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Lb8
            com.beizi.fusion.model.Messenger$EventsBean r3 = (com.beizi.fusion.model.Messenger.EventsBean) r3     // Catch: java.lang.Throwable -> Lb8
            java.util.List r4 = r3.getCodes()     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto Lb5
            int r5 = r4.size()     // Catch: java.lang.Throwable -> Lb8
            if (r5 <= 0) goto Lb5
            r5 = 0
        L63:
            int r6 = r4.size()     // Catch: java.lang.Throwable -> Lb8
            if (r5 >= r6) goto Lb5
            java.lang.String r6 = r9.getEventCode()     // Catch: java.lang.Throwable -> Lb8
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb8
            if (r6 != 0) goto Lb2
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> Lb8
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Throwable -> Lb8
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb8
            if (r6 != 0) goto Lb2
            java.lang.String r6 = r9.getEventCode()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r7 = r4.get(r5)     // Catch: java.lang.Throwable -> Lb8
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> Lb8
            if (r6 != 0) goto L97
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> Lb8
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Throwable -> Lb8
            if (r6 == 0) goto Lb2
        L97:
            java.lang.String r6 = r3.getIsOnline()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = "1"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> Lb8
            if (r6 == 0) goto Lae
            java.lang.String r6 = r3.getUploadUrl()     // Catch: java.lang.Throwable -> Lb8
            r9.setUrl(r6)     // Catch: java.lang.Throwable -> Lb8
            r8.a(r3, r9)     // Catch: java.lang.Throwable -> Lb8
            goto Lb2
        Lae:
            r6 = 1
            r8.a(r3, r9, r6)     // Catch: java.lang.Throwable -> Lb8
        Lb2:
            int r5 = r5 + 1
            goto L63
        Lb5:
            int r2 = r2 + 1
            goto L46
        Lb8:
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.events.EventCar r0, com.beizi.fusion.events.EventBean r1) {
            r0.a(r1)
            return
    }

    private void a(com.beizi.fusion.model.Messenger.EventsBean r6, com.beizi.fusion.events.EventBean r7) {
            r5 = this;
            java.lang.String r0 = "590.200"
            if (r7 == 0) goto L7e
            java.lang.String r1 = r7.getUrl()     // Catch: java.lang.Throwable -> L7e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L7e
            java.lang.String r1 = r7.getUrl()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = r7.getEventCode()     // Catch: java.lang.Throwable -> L7e
            boolean r2 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L20
            java.lang.String r1 = r7.getTaskReqUrl()     // Catch: java.lang.Throwable -> L7e
        L20:
            java.lang.String r2 = "?"
            int r2 = r1.indexOf(r2)     // Catch: java.lang.Throwable -> L7e
            r3 = 0
            java.lang.String r3 = r1.substring(r3, r2)     // Catch: java.lang.Throwable -> L7e
            r4 = 1
            int r2 = r2 + r4
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = r7.getEventCode()     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L46
            android.content.Context r0 = r5.b     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = r7.getAppLinks()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = com.beizi.fusion.tool.ao.a(r0, r1, r7, r2)     // Catch: java.lang.Throwable -> L7e
            goto L4c
        L46:
            android.content.Context r0 = r5.b     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = com.beizi.fusion.tool.ao.a(r0, r1, r7)     // Catch: java.lang.Throwable -> L7e
        L4c:
            java.lang.String r0 = com.beizi.fusion.tool.t.a(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = com.beizi.fusion.tool.y.a()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = com.beizi.fusion.tool.b.a(r1, r0)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L7e
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = com.beizi.fusion.tool.v.a(r3, r0)     // Catch: java.lang.Throwable -> L7e
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L7b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = "code"
            int r0 = r1.optInt(r0)     // Catch: java.lang.Throwable -> L7e
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L7e
            r5.a(r6, r7, r4)     // Catch: java.lang.Throwable -> L7e
            goto L7e
        L7b:
            r5.a(r6, r7, r4)     // Catch: java.lang.Throwable -> L7e
        L7e:
            return
    }

    private void a(com.beizi.fusion.model.Messenger.EventsBean r18, com.beizi.fusion.events.EventBean r19, boolean r20) {
            r17 = this;
            r1 = r17
            r19.getEventCode()
            android.content.Context r0 = r1.b     // Catch: java.lang.Throwable -> L18d
            java.io.File r0 = com.beizi.fusion.tool.g.a(r0)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r2 = "BeiZis"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18d
            r3.<init>()     // Catch: java.lang.Throwable -> L18d
            java.lang.String r4 = "doOffline storagePath == "
            r3.append(r4)     // Catch: java.lang.Throwable -> L18d
            r3.append(r0)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L18d
            com.beizi.fusion.tool.aa.a(r2, r3)     // Catch: java.lang.Throwable -> L18d
            if (r0 == 0) goto L18d
            if (r20 == 0) goto L2a
            java.lang.String r2 = r18.getOfflineUrl()     // Catch: java.lang.Throwable -> L18d
            goto L2e
        L2a:
            java.lang.String r2 = r18.getUploadUrl()     // Catch: java.lang.Throwable -> L18d
        L2e:
            java.lang.String r3 = "?"
            int r3 = r2.indexOf(r3)     // Catch: java.lang.Throwable -> L18d
            r4 = 0
            java.lang.String r3 = r2.substring(r4, r3)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r5 = "?"
            int r5 = r2.indexOf(r5)     // Catch: java.lang.Throwable -> L18d
            r6 = 1
            int r5 = r5 + r6
            java.lang.String r2 = r2.substring(r5)     // Catch: java.lang.Throwable -> L18d
            android.content.Context r5 = r1.b     // Catch: java.lang.Throwable -> L18d
            r7 = r19
            java.lang.String r2 = com.beizi.fusion.tool.ao.a(r5, r2, r7)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r5 = com.beizi.fusion.tool.y.a()     // Catch: java.lang.Throwable -> L18d
            java.lang.String r2 = com.beizi.fusion.tool.b.a(r5, r2)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r5 = r18.toString()     // Catch: java.lang.Throwable -> L18d
            java.lang.String r5 = com.beizi.fusion.tool.ao.a(r5)     // Catch: java.lang.Throwable -> L18d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18d
            r7.<init>()     // Catch: java.lang.Throwable -> L18d
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L18d
            r7.append(r0)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r0 = "/BeiZi/offline/"
            r7.append(r0)     // Catch: java.lang.Throwable -> L18d
            r7.append(r5)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r0 = "/"
            r7.append(r0)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L18d
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L18d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L18d
            boolean r7 = r5.exists()     // Catch: java.lang.Throwable -> L18d
            if (r7 != 0) goto L88
            r5.mkdirs()     // Catch: java.lang.Throwable -> L18d
        L88:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L18d
            java.lang.String r8 = "10000.txt"
            r7.<init>(r5, r8)     // Catch: java.lang.Throwable -> L18d
            java.lang.Class<com.beizi.fusion.events.EventCar> r8 = com.beizi.fusion.events.EventCar.class
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L18d
            boolean r9 = r7.exists()     // Catch: java.lang.Throwable -> Lb2
            if (r9 != 0) goto Lb5
            r7.createNewFile()     // Catch: java.lang.Throwable -> Lb2
            java.io.FileWriter r9 = new java.io.FileWriter     // Catch: java.lang.Throwable -> Lb2
            r9.<init>(r7, r6)     // Catch: java.lang.Throwable -> Lb2
            java.io.BufferedWriter r7 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Lb2
            r7.<init>(r9)     // Catch: java.lang.Throwable -> Lb2
            r7.write(r3)     // Catch: java.lang.Throwable -> Lb2
            r7.newLine()     // Catch: java.lang.Throwable -> Lb2
            r7.close()     // Catch: java.lang.Throwable -> Lb2
            r9.close()     // Catch: java.lang.Throwable -> Lb2
            goto Lb5
        Lb2:
            r0 = move-exception
            goto L18b
        Lb5:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb2
            java.io.File[] r3 = r5.listFiles()
            int r7 = r3.length
            r8 = 0
            r11 = r8
            r10 = 0
        Lbf:
            if (r10 >= r7) goto Lec
            r13 = r3[r10]
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "."
            int r14 = r14.indexOf(r15)
            java.lang.String r13 = r13.getName()
            java.lang.String r13 = r13.substring(r4, r14)
            java.lang.Long r14 = java.lang.Long.valueOf(r13)
            long r14 = r14.longValue()
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 <= 0) goto Le9
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            long r11 = r11.longValue()
        Le9:
            int r10 = r10 + 1
            goto Lbf
        Lec:
            int r3 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r3 == 0) goto L157
            r3 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r7 == 0) goto L157
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r11)
            java.lang.String r0 = ".txt"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L157
            long r7 = r3.length()
            long r9 = r1.d
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L157
            java.io.FileWriter r0 = new java.io.FileWriter
            r0.<init>(r3, r6)
            java.io.BufferedWriter r4 = new java.io.BufferedWriter
            r4.<init>(r0)
            r4.write(r2)
            r4.newLine()
            r4.close()
            r0.close()
            long r6 = java.lang.System.currentTimeMillis()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r4 = ".txt"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.<init>(r5, r2)
            r3.renameTo(r0)
            return
        L157:
            long r3 = java.lang.System.currentTimeMillis()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = ".txt"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r0.<init>(r5, r3)
            r0.createNewFile()
            java.io.FileWriter r3 = new java.io.FileWriter
            r3.<init>(r0, r6)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r3)
            r0.write(r2)
            r0.newLine()
            r0.close()
            r3.close()
            return
        L18b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb2
            throw r0
        L18d:
            return
    }

    public static com.beizi.fusion.events.EventCar getInstance(android.content.Context r2) {
            com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.a
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.fusion.events.EventCar> r0 = com.beizi.fusion.events.EventCar.class
            monitor-enter(r0)
            com.beizi.fusion.events.EventCar r1 = com.beizi.fusion.events.EventCar.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.fusion.events.EventCar r1 = new com.beizi.fusion.events.EventCar     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.events.EventCar.a = r1     // Catch: java.lang.Throwable -> L13
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
            com.beizi.fusion.events.EventCar r2 = com.beizi.fusion.events.EventCar.a
            return r2
    }

    public void doUpLoadLogs() {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "BeiZis"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L119
            r2.<init>()     // Catch: java.lang.Exception -> L119
            java.lang.String r3 = "===================doUpLoadLogs===================:"
            r2.append(r3)     // Catch: java.lang.Exception -> L119
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L119
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L119
            r2.append(r3)     // Catch: java.lang.Exception -> L119
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L119
            com.beizi.fusion.tool.aa.a(r1, r2)     // Catch: java.lang.Exception -> L119
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L119
            android.content.Context r4 = r0.b     // Catch: java.lang.Exception -> L119
            java.io.File r4 = com.beizi.fusion.tool.g.a(r4)     // Catch: java.lang.Exception -> L119
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L119
            r5.<init>()     // Catch: java.lang.Exception -> L119
            java.lang.String r6 = "doUpLoadLogs storagePath == "
            r5.append(r6)     // Catch: java.lang.Exception -> L119
            r5.append(r4)     // Catch: java.lang.Exception -> L119
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L119
            com.beizi.fusion.tool.aa.a(r1, r5)     // Catch: java.lang.Exception -> L119
            if (r4 == 0) goto L119
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L119
            r1.<init>()     // Catch: java.lang.Exception -> L119
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Exception -> L119
            r1.append(r4)     // Catch: java.lang.Exception -> L119
            java.lang.String r4 = "/BeiZi/offline/"
            r1.append(r4)     // Catch: java.lang.Exception -> L119
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L119
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L119
            r4.<init>(r1)     // Catch: java.lang.Exception -> L119
            java.io.File[] r4 = r4.listFiles()     // Catch: java.lang.Exception -> L119
            if (r4 == 0) goto L119
            int r5 = r4.length     // Catch: java.lang.Exception -> L119
            if (r5 <= 0) goto L119
            int r5 = r4.length     // Catch: java.lang.Exception -> L119
            r6 = 0
            r7 = 0
        L66:
            if (r7 >= r5) goto L119
            r8 = r4[r7]     // Catch: java.lang.Exception -> L119
            boolean r9 = r8.isDirectory()     // Catch: java.lang.Exception -> L119
            if (r9 == 0) goto La0
            java.lang.String r9 = ""
            java.io.File r10 = new java.io.File     // Catch: java.lang.Exception -> L119
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L119
            r11.<init>()     // Catch: java.lang.Exception -> L119
            java.lang.String r12 = r8.getName()     // Catch: java.lang.Exception -> L119
            r11.append(r12)     // Catch: java.lang.Exception -> L119
            java.lang.String r12 = "/10000.txt"
            r11.append(r12)     // Catch: java.lang.Exception -> L119
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L119
            r10.<init>(r1, r11)     // Catch: java.lang.Exception -> L119
            boolean r11 = r10.exists()     // Catch: java.lang.Exception -> L119
            if (r11 == 0) goto L97
            java.lang.String r9 = a(r10)     // Catch: java.lang.Exception -> L119
            goto L9a
        L97:
            com.beizi.fusion.tool.ai.a(r8)     // Catch: java.lang.Exception -> L119
        L9a:
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L119
            if (r10 == 0) goto La4
        La0:
            r16 = r7
            goto L114
        La4:
            java.io.File[] r10 = r8.listFiles()     // Catch: java.lang.Exception -> L119
            int r11 = r10.length     // Catch: java.lang.Exception -> L119
            r12 = 0
        Laa:
            if (r12 >= r11) goto L107
            r13 = r10[r12]     // Catch: java.lang.Exception -> L119
            java.lang.String r14 = r13.getName()     // Catch: java.lang.Exception -> L119
            java.lang.String r15 = "10000.txt"
            boolean r14 = r14.equals(r15)     // Catch: java.lang.Exception -> L119
            if (r14 == 0) goto Lbd
            r16 = r7
            goto L101
        Lbd:
            java.lang.String r14 = r13.getName()     // Catch: java.lang.Exception -> L119
            java.lang.String r15 = "."
            int r14 = r14.indexOf(r15)     // Catch: java.lang.Exception -> L119
            java.lang.String r15 = r13.getName()     // Catch: java.lang.Exception -> L119
            java.lang.String r14 = r15.substring(r6, r14)     // Catch: java.lang.Exception -> L119
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Exception -> L119
            long r14 = r14.longValue()     // Catch: java.lang.Exception -> L119
            long r14 = r2 - r14
            r16 = r7
            long r6 = r0.e     // Catch: java.lang.Exception -> L119
            int r17 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r17 >= 0) goto Lfe
            java.lang.String r6 = com.beizi.fusion.tool.v.a(r9, r13)     // Catch: java.lang.Exception -> L119
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L119
            if (r7 != 0) goto L101
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L101 java.lang.Exception -> L119
            r7.<init>(r6)     // Catch: org.json.JSONException -> L101 java.lang.Exception -> L119
            java.lang.String r6 = "code"
            int r6 = r7.optInt(r6)     // Catch: org.json.JSONException -> L101 java.lang.Exception -> L119
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != r7) goto L101
            r13.delete()     // Catch: org.json.JSONException -> L101 java.lang.Exception -> L119
            goto L101
        Lfe:
            r13.delete()     // Catch: java.lang.Exception -> L119
        L101:
            int r12 = r12 + 1
            r7 = r16
            r6 = 0
            goto Laa
        L107:
            r16 = r7
            java.io.File[] r6 = r8.listFiles()     // Catch: java.lang.Exception -> L119
            int r6 = r6.length     // Catch: java.lang.Exception -> L119
            r7 = 1
            if (r6 > r7) goto L114
            com.beizi.fusion.tool.ai.a(r8)     // Catch: java.lang.Exception -> L119
        L114:
            int r7 = r16 + 1
            r6 = 0
            goto L66
        L119:
            return
    }

    public void goRoad(com.beizi.fusion.events.EventBean r3) {
            r2 = this;
            com.beizi.fusion.tool.e r0 = com.beizi.fusion.tool.e.b()
            java.util.concurrent.ExecutorService r0 = r0.e()
            com.beizi.fusion.events.EventCar$1 r1 = new com.beizi.fusion.events.EventCar$1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    public void goRoadWithoutThread(com.beizi.fusion.events.EventBean r1) {
            r0 = this;
            r0.a(r1)
            return
    }
}
