package cn.jpush.android.d;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static cn.jpush.android.api.CustomMessage a(android.content.Intent r5) {
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = "msgid"
            java.lang.String r2 = r5.getStringExtra(r2)     // Catch: java.lang.Throwable -> L6a
            cn.jpush.android.api.CustomMessage r3 = new cn.jpush.android.api.CustomMessage     // Catch: java.lang.Throwable -> L6a
            r3.<init>()     // Catch: java.lang.Throwable -> L6a
            r3.messageId = r2     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "appId"
            java.lang.String r1 = r5.getStringExtra(r1)     // Catch: java.lang.Throwable -> L4e
            r3.appId = r1     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "senderId"
            java.lang.String r1 = r5.getStringExtra(r1)     // Catch: java.lang.Throwable -> L4e
            r3.senderId = r1     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "data"
            java.lang.String r1 = r5.getStringExtra(r1)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L51
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "message"
            java.lang.String r1 = r4.optString(r1, r0)     // Catch: java.lang.Throwable -> L4e
            r3.message = r1     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "content_type"
            java.lang.String r1 = r4.optString(r1, r0)     // Catch: java.lang.Throwable -> L4e
            r3.contentType = r1     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "title"
            java.lang.String r1 = r4.optString(r1, r0)     // Catch: java.lang.Throwable -> L4e
            r3.title = r1     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "extras"
            java.lang.String r0 = r4.optString(r1, r0)     // Catch: java.lang.Throwable -> L4e
            r3.extra = r0     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r5 = move-exception
            r1 = r3
            goto L6b
        L51:
            int r0 = cn.jpush.android.local.JPushConstants.SDK_VERSION_CODE     // Catch: java.lang.Throwable -> L4e
            r1 = 387(0x183, float:5.42E-43)
            if (r0 < r1) goto L60
            java.lang.String r0 = "platform"
            r1 = 0
            byte r0 = r5.getByteExtra(r0, r1)     // Catch: java.lang.Throwable -> L4e
            r3.platform = r0     // Catch: java.lang.Throwable -> L4e
        L60:
            java.lang.String r0 = "_j_data_"
            java.lang.String r5 = r5.getStringExtra(r0)     // Catch: java.lang.Throwable -> L4e
            cn.jpush.android.d.d.a(r2, r5)     // Catch: java.lang.Throwable -> L4e
            return r3
        L6a:
            r5 = move-exception
        L6b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "processMessage failed:"
            r0.append(r2)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "MessageHelper"
            cn.jpush.android.helper.Logger.w(r0, r5)
            return r1
    }

    private static cn.jpush.android.b.b a(cn.jpush.android.d.d r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r2.f1762i     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "geofence"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L16
            cn.jpush.android.b.b r0 = cn.jpush.android.b.b.a(r0)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L16
            r0.t = r2     // Catch: java.lang.Throwable -> L16
            return r0
        L16:
            r2 = 0
            return r2
    }

    private static void a(android.content.Context r8, int r9, long r10, long r12, java.lang.String r14) {
            r0 = 0
            byte r9 = (byte) r9
            byte[] r7 = cn.jpush.android.z.b.a(r0, r9, r10, r14)
            r3 = 4
            r4 = 3
            java.lang.String r2 = "JPUSH"
            r1 = r8
            r5 = r12
            cn.jpush.android.helper.JCoreHelper.sendData(r1, r2, r3, r4, r5, r7)
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6a
            r8.<init>(r14)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r9 = "data_msgtype"
            int r8 = r8.optInt(r9)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r9 = "MessageHelper"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r12.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r13 = " data_msgtype="
            r12.append(r13)     // Catch: java.lang.Throwable -> L6a
            r12.append(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L6a
            cn.jpush.android.helper.Logger.d(r9, r12)     // Catch: java.lang.Throwable -> L6a
            r9 = 1
            java.lang.String r12 = ""
            if (r9 == r8) goto L56
            r9 = 3
            if (r9 == r8) goto L56
            r9 = 5
            if (r9 != r8) goto L3c
            goto L56
        L3c:
            r9 = 32
            if (r9 != r8) goto L6a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r8.<init>()     // Catch: java.lang.Throwable -> L6a
            r8.append(r10)     // Catch: java.lang.Throwable -> L6a
            r8.append(r12)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6a
            r9 = 1000(0x3e8, double:4.94E-321)
            r11 = 4
            cn.jpush.android.helper.c.a(r1, r8, r9, r11)     // Catch: java.lang.Throwable -> L6a
            return
        L56:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r8.<init>()     // Catch: java.lang.Throwable -> L6a
            r8.append(r10)     // Catch: java.lang.Throwable -> L6a
            r8.append(r12)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6a
            r9 = 1108(0x454, double:5.474E-321)
            cn.jpush.android.helper.c.a(r8, r9, r1)     // Catch: java.lang.Throwable -> L6a
        L6a:
            return
    }

    public static void a(android.content.Context r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, byte r10) {
            java.lang.String r0 = r3.getPackageName()
            boolean r0 = r6.equals(r0)
            java.lang.String r1 = "MessageHelper"
            if (r0 != 0) goto L2d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "msg appId is not mine pkgname,appid:"
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = ",pkgname:"
            r4.append(r5)
            java.lang.String r3 = r3.getPackageName()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.e(r1, r3)
            return
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "action:receivedPushMessage msgId = "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.d.d r5 = cn.jpush.android.d.d.a(r5, r6, r7, r8)
            if (r5 != 0) goto L48
            goto L7a
        L48:
            r5.a = r4
            boolean r6 = a(r4, r5)
            if (r6 == 0) goto L65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "ssp notification, msgType: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            cn.jpush.android.helper.Logger.d(r1, r3)
            return
        L65:
            cn.jpush.android.d.a r6 = r5.a()
            boolean r6 = cn.jpush.android.d.c.a(r3, r6)
            if (r6 == 0) goto L70
            goto L7a
        L70:
            java.lang.String r6 = r5.f1757d
            java.lang.String r7 = r5.f1761h
            boolean r6 = cn.jpush.android.x.d.a(r3, r6, r7, r4)
            if (r6 == 0) goto L7b
        L7a:
            return
        L7b:
            if (r10 == 0) goto L7f
            r5.ai = r10
        L7f:
            r5.a = r4
            cn.jpush.android.b.b r6 = a(r5)
            if (r6 == 0) goto L97
            java.lang.String r7 = r6.a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L97
            cn.jpush.android.b.d r3 = cn.jpush.android.b.d.a()
            r3.a(r6)
            return
        L97:
            cn.jpush.android.d.d r6 = cn.jpush.android.d.d.a(r3, r5)
            if (r6 == 0) goto Lb0
            java.lang.String r7 = "notify inapp message received"
            cn.jpush.android.helper.Logger.dd(r1, r7)
            r6.a = r4
            r6.az = r4
            cn.jpush.android.q.a r4 = cn.jpush.android.q.a.a()
            java.lang.String r6 = r5.f1757d
            r4.a(r3, r5, r6)
            return
        Lb0:
            r6 = 115(0x73, float:1.61E-43)
            if (r4 != r6) goto Lc2
            cn.jpush.android.q.a r4 = cn.jpush.android.q.a.a()
            cn.jpush.android.d.d r6 = cn.jpush.android.d.d.a(r5)
            java.lang.String r5 = r5.f1757d
            r4.a(r3, r6, r5)
            return
        Lc2:
            a(r3, r5)
            return
    }

    public static void a(android.content.Context r5, cn.jpush.android.d.d r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "processBasicEntity type:"
            r0.append(r1)
            int r1 = r6.f1759f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MessageHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = r6.f1764k
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L27
            int r0 = r6.f1763j
            r4 = 4
            if (r0 != r4) goto L25
            r0 = 3
            goto L28
        L25:
            r0 = 1
            goto L28
        L27:
            r0 = 2
        L28:
            r6.f1759f = r0
            r0 = r0 & r2
            if (r0 == 0) goto L4c
            java.lang.String r0 = "processBasicEntity user-defined message."
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.String r0 = r6.n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L49
            java.lang.String r0 = r6.q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L43
            goto L49
        L43:
            java.lang.String r0 = "no message or extra send to user"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            goto L4c
        L49:
            b(r5, r6)
        L4c:
            int r0 = r6.f1759f
            r0 = r0 & r3
            if (r0 == 0) goto L80
            java.lang.String r0 = "processBasicEntity notification"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = cn.jpush.android.cache.a.e(r5)
            if (r0 == 0) goto L62
            java.lang.String r5 = "Service is stoped, give up all the message"
            cn.jpush.android.helper.Logger.i(r1, r5)
            return
        L62:
            r6.a(r5)
            boolean r0 = cn.jpush.android.x.b.b(r5)
            if (r0 != 0) goto L78
            java.lang.String r6 = r6.f1757d
            r2 = 986(0x3da, double:4.87E-321)
            cn.jpush.android.helper.c.a(r6, r2, r5)
            java.lang.String r5 = "push is invalidPushTime，Intercept the message"
            cn.jpush.android.helper.Logger.ii(r1, r5)
            return
        L78:
            java.lang.String r0 = r6.f1757d
            cn.jpush.android.x.d.b(r5, r0)
            cn.jpush.android.x.b.a(r5, r6)
        L80:
            return
    }

    public static void a(android.content.Context r16, cn.jpush.android.z.c r17) {
            java.lang.String r0 = r17.c()
            java.lang.String r7 = cn.jpush.android.d.d.d(r0)
            int r2 = r17.a()
            long r3 = r17.b()
            long r5 = r17.getRid()
            r1 = r16
            a(r1, r2, r3, r5, r7)
            long r13 = r17.b()
            int r9 = r17.a()
            java.lang.String r0 = r17.c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "msgType = "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ", msgId = "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = ", jdata = "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MessageHelper"
            cn.jpush.android.helper.Logger.d(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "msgContent: \n"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.v(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "msgContent size:"
            r1.append(r3)
            byte[] r3 = r0.getBytes()
            int r3 = r3.length
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.d(r2, r1)
            java.io.LineNumberReader r1 = new java.io.LineNumberReader
            java.io.StringReader r3 = new java.io.StringReader
            r3.<init>(r0)
            r1.<init>(r3)
            java.lang.String r11 = r1.readLine()     // Catch: java.lang.Throwable -> L92
            java.lang.String r12 = r1.readLine()     // Catch: java.lang.Throwable -> L92
            if (r11 != 0) goto L95
            java.lang.String r0 = "NO appId"
        L8e:
            cn.jpush.android.helper.Logger.e(r2, r0)     // Catch: java.lang.Throwable -> L92
            return
        L92:
            r0 = move-exception
            goto L150
        L95:
            if (r12 != 0) goto L9a
            java.lang.String r0 = "NO senderId"
            goto L8e
        L9a:
            int r1 = r11.length()     // Catch: java.lang.Throwable -> L92
            int r3 = r12.length()     // Catch: java.lang.Throwable -> L92
            int r1 = r1 + r3
            int r3 = r1 + 2
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L92
            int r1 = r1 + 3
            if (r4 <= r1) goto L14d
            java.lang.String r10 = r0.substring(r3)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = cn.jpush.android.helper.JCoreHelper.getAppKey(r16)     // Catch: java.lang.Throwable -> L92
            boolean r0 = r12.equals(r0)     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto Ld9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r0.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = "msg senderId is not mine appkey,senderId:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            r0.append(r12)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = ",appkey:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = cn.jpush.android.helper.JCoreHelper.getAppKey(r16)     // Catch: java.lang.Throwable -> L92
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L92
            goto L8e
        Ld9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r0.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = "Message Fields - appId:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            r0.append(r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = ", senderId:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            r0.append(r12)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = ", msgContent:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            r0.append(r10)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = ", contentLen: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            int r1 = r10.length()     // Catch: java.lang.Throwable -> L92
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L92
            cn.jpush.android.helper.Logger.v(r2, r0)     // Catch: java.lang.Throwable -> L92
            if (r9 == 0) goto L146
            r0 = 2
            if (r9 == r0) goto L146
            r0 = 20
            if (r9 == r0) goto L13b
            r0 = 115(0x73, float:1.61E-43)
            if (r9 == r0) goto L146
            r0 = 100
            if (r9 == r0) goto L146
            r0 = 101(0x65, float:1.42E-43)
            if (r9 == r0) goto L146
            r0 = 103(0x67, float:1.44E-43)
            if (r9 == r0) goto L146
            r0 = 104(0x68, float:1.46E-43)
            if (r9 == r0) goto L146
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r0.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = "unknown msg type, type: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            r0.append(r9)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L92
        L137:
            cn.jpush.android.helper.Logger.d(r2, r0)     // Catch: java.lang.Throwable -> L92
            return
        L13b:
            r11 = -1
            r13 = -1
            r9 = r10
            r10 = 0
            r8 = r16
            cn.jpush.android.ab.b.a(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L92
            return
        L146:
            r15 = 0
            r8 = r16
            a(r8, r9, r10, r11, r12, r13, r15)     // Catch: java.lang.Throwable -> L92
            return
        L14d:
            java.lang.String r0 = "No msgContent"
            goto L137
        L150:
            java.lang.String r1 = "Parse msgContent failed"
            cn.jpush.android.helper.Logger.e(r2, r1, r0)
            return
    }

    public static boolean a(int r2, cn.jpush.android.d.d r3) {
            java.lang.String r0 = ""
            r1 = 0
            if (r3 != 0) goto L6
            return r1
        L6:
            if (r2 == 0) goto L9
            return r1
        L9:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = r3.f1762i     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "m_content"
            org.json.JSONObject r2 = r2.optJSONObject(r3)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1e
            java.lang.String r3 = "n_source"
            java.lang.String r0 = r2.optString(r3, r0)     // Catch: java.lang.Throwable -> L1e
        L1e:
            java.lang.String r2 = "ssp"
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            return r2
    }

    public static void b(android.content.Context r8, cn.jpush.android.d.d r9) {
            java.lang.String r0 = "%s.permission.JPUSH_MESSAGE"
            java.lang.String r1 = "MessageHelper"
            java.lang.String r2 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r8)     // Catch: java.lang.Throwable -> L5d
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5d
            if (r3 != 0) goto L66
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L5d
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r8, r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "custom_msg"
            java.lang.String r2 = cn.jpush.android.ad.a.e(r8, r2)     // Catch: java.lang.Throwable -> L5d
            r0.setAction(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "data"
            java.lang.String r3 = r9.f1762i     // Catch: java.lang.Throwable -> L5d
            r0.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "msgid"
            java.lang.String r3 = r9.f1757d     // Catch: java.lang.Throwable -> L5d
            r0.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "appId"
            java.lang.String r3 = r9.f1755b     // Catch: java.lang.Throwable -> L5d
            r0.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "senderId"
            java.lang.String r3 = r9.f1756c     // Catch: java.lang.Throwable -> L5d
            r0.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "platform"
            byte r3 = r9.ai     // Catch: java.lang.Throwable -> L5d
            r0.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "_j_data_"
            java.lang.String r3 = r9.f1760g     // Catch: java.lang.Throwable -> L5d
            r0.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L5d
            cn.jpush.android.service.JPushMessageReceiver r2 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r8)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L61
            cn.jpush.android.service.JPushMessageReceiver r2 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r8)     // Catch: java.lang.Throwable -> L5d
            cn.jpush.android.api.CustomMessage r0 = a(r0)     // Catch: java.lang.Throwable -> L5d
            r2.onMessage(r8, r0)     // Catch: java.lang.Throwable -> L5d
            goto Le4
        L5d:
            r0 = move-exception
            r8 = r0
            goto Lfc
        L61:
            cn.jpush.android.helper.a.a(r8, r0)     // Catch: java.lang.Throwable -> L5d
            goto Le4
        L66:
            java.lang.String r2 = "not found user push message,use old action to user"
            cn.jpush.android.helper.Logger.dd(r1, r2)     // Catch: java.lang.Throwable -> L5d
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "cn.jpush.android.intent.MESSAGE_RECEIVED"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "cn.jpush.android.APPKEY"
            java.lang.String r4 = r9.f1756c     // Catch: java.lang.Throwable -> L5d
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "cn.jpush.android.MESSAGE"
            java.lang.String r4 = r9.n     // Catch: java.lang.Throwable -> L5d
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "cn.jpush.android.CONTENT_TYPE"
            java.lang.String r4 = r9.o     // Catch: java.lang.Throwable -> L5d
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "cn.jpush.android.TITLE"
            java.lang.String r4 = r9.p     // Catch: java.lang.Throwable -> L5d
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "cn.jpush.android.EXTRA"
            java.lang.String r4 = r9.q     // Catch: java.lang.Throwable -> L5d
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "cn.jpush.android.MSG_ID"
            java.lang.String r4 = r9.f1757d     // Catch: java.lang.Throwable -> L5d
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L5d
            int r3 = cn.jpush.android.local.JPushConstants.SDK_VERSION_CODE     // Catch: java.lang.Throwable -> L5d
            r4 = 387(0x183, float:5.42E-43)
            if (r3 < r4) goto La9
            java.lang.String r3 = "cn.jpush.android.TYPE_PLATFORM"
            byte r4 = r9.ai     // Catch: java.lang.Throwable -> L5d
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L5d
        La9:
            java.lang.String r3 = r9.f1755b     // Catch: java.lang.Throwable -> L5d
            r2.addCategory(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = r8.getPackageName()     // Catch: java.lang.Throwable -> L5d
            r2.setPackage(r3)     // Catch: java.lang.Throwable -> L5d
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = r9.f1755b     // Catch: java.lang.Throwable -> L5d
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L5d
            r7 = 0
            r6[r7] = r4     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = java.lang.String.format(r3, r0, r6)     // Catch: java.lang.Throwable -> L5d
            r8.sendBroadcast(r2, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "Send broadcast to app: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = r9.f1755b     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L5d
            r5[r7] = r4     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = java.lang.String.format(r3, r0, r5)     // Catch: java.lang.Throwable -> L5d
            r2.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5d
            cn.jpush.android.helper.Logger.i(r1, r0)     // Catch: java.lang.Throwable -> L5d
        Le4:
            byte r4 = r9.ai     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto Lf3
            java.lang.String r2 = r9.f1757d     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = ""
            r5 = 1106(0x452, double:5.464E-321)
            r7 = r8
            cn.jpush.android.helper.c.a(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L5d
            return
        Lf3:
            r7 = r8
            java.lang.String r8 = r9.f1757d     // Catch: java.lang.Throwable -> L5d
            r2 = 1106(0x452, double:5.464E-321)
            cn.jpush.android.helper.c.a(r8, r2, r7)     // Catch: java.lang.Throwable -> L5d
            return
        Lfc:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "sendBroadcastToApp error:"
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jpush.android.helper.Logger.e(r1, r8)
            return
    }
}
