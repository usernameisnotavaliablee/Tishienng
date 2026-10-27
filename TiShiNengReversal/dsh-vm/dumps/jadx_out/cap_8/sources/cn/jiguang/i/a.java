package cn.jiguang.i;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public static java.lang.String a = ".permission.JPUSH_MESSAGE";

    /* renamed from: b, reason: collision with root package name */
    private static long f1298b;



    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ int a(java.lang.Object r0) {
            int r0 = b(r0)
            return r0
    }

    public static java.lang.Object a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            r0 = 0
            java.lang.String r1 = "JCommonActionHelper"
            if (r8 != 0) goto Le
            java.lang.String r8 = "context is null,give up continue"
            cn.jiguang.w.f.i(r1, r8)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r8 = move-exception
            goto L1ee
        Le:
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L1a
            java.lang.String r8 = "action is null,give up continue"
            cn.jiguang.w.f.i(r1, r8)     // Catch: java.lang.Throwable -> Lb
            return r0
        L1a:
            int r2 = r9.hashCode()     // Catch: java.lang.Throwable -> Lb
            r3 = 1800(0x708, float:2.522E-42)
            r4 = 1
            switch(r2) {
                case -879126258: goto Lc1;
                case -24181482: goto Lb4;
                case 385278662: goto L9e;
                case 781805572: goto L91;
                case 805881853: goto L84;
                case 1282759650: goto L62;
                case 1567409176: goto L55;
                case 1660517635: goto L33;
                case 1976348689: goto L26;
                default: goto L24;
            }     // Catch: java.lang.Throwable -> Lb
        L24:
            goto Lce
        L26:
            java.lang.String r2 = "get_imei"
            boolean r2 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lce
            java.lang.String r8 = cn.jiguang.f.b.m()     // Catch: java.lang.Throwable -> Lb
            return r8
        L33:
            java.lang.String r2 = "on_register"
            boolean r2 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lce
            boolean r2 = cn.jiguang.f.b.b(r3)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L44
            cn.jiguang.k.a.a(r8, r4)     // Catch: java.lang.Throwable -> Lb
        L44:
            long r5 = cn.jiguang.d.a.f(r8)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = cn.jiguang.d.a.j(r8)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r7 = cn.jiguang.d.a.b(r8)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.f.b.a(r5, r2, r7)     // Catch: java.lang.Throwable -> Lb
            goto Lce
        L55:
            java.lang.String r2 = "filter_pkg_list"
            boolean r2 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lce
            java.lang.Object r8 = cn.jiguang.m.a.a(r8, r10)     // Catch: java.lang.Throwable -> Lb
            return r8
        L62:
            java.lang.String r2 = "on_logged"
            boolean r2 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lce
            java.lang.String r2 = "action on logged..."
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.e.a r2 = cn.jiguang.e.a.T()     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = cn.jiguang.e.b.a(r8, r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Lb
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.f.b.a(r5)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.f.b.b(r4)     // Catch: java.lang.Throwable -> Lb
            goto Lce
        L84:
            java.lang.String r2 = "getwakeenable"
            boolean r2 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lce
            java.lang.Object r8 = cn.jiguang.m.a.c(r8)     // Catch: java.lang.Throwable -> Lb
            return r8
        L91:
            java.lang.String r2 = "deviceinfo"
            boolean r2 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lce
            org.json.JSONObject r8 = cn.jiguang.f.b.B()     // Catch: java.lang.Throwable -> Lb
            return r8
        L9e:
            java.lang.String r2 = "periodtask"
            boolean r2 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lce
            java.lang.String r2 = "action period task.."
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.i.a$1 r2 = new cn.jiguang.i.a$1     // Catch: java.lang.Throwable -> Lb
            r2.<init>(r8, r10)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.z.b.a(r2)     // Catch: java.lang.Throwable -> Lb
            goto Lce
        Lb4:
            java.lang.String r2 = "get_loc_info"
            boolean r2 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lce
            android.os.Bundle r8 = cn.jiguang.f.b.z()     // Catch: java.lang.Throwable -> Lb
            return r8
        Lc1:
            java.lang.String r2 = "tcp_a1"
            boolean r2 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Lce
            java.lang.String r2 = "action service  create.."
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> Lb
        Lce:
            boolean r2 = r10 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Ld5
            android.os.Bundle r10 = (android.os.Bundle) r10     // Catch: java.lang.Throwable -> Lb
            goto Ld6
        Ld5:
            r10 = r0
        Ld6:
            if (r10 == 0) goto L206
            int r2 = r9.hashCode()     // Catch: java.lang.Throwable -> Lb
            switch(r2) {
                case -1921540966: goto L1d8;
                case -1485564867: goto L1c0;
                case -955011762: goto L1bc;
                case -955005568: goto L1b8;
                case -691876648: goto L19f;
                case -504314929: goto L182;
                case -50423372: goto L167;
                case 98618: goto L15a;
                case 112894784: goto L12d;
                case 1196294537: goto L10d;
                case 1391522972: goto L106;
                case 1995819041: goto Lf3;
                case 2063320150: goto Le1;
                default: goto Ldf;
            }     // Catch: java.lang.Throwable -> Lb
        Ldf:
            goto L206
        Le1:
            java.lang.String r2 = "set_sdktype_info"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            cn.jiguang.l.a r9 = new cn.jiguang.l.a     // Catch: java.lang.Throwable -> Lb
            r9.<init>()     // Catch: java.lang.Throwable -> Lb
            r9.a(r8, r10)     // Catch: java.lang.Throwable -> Lb
            goto L206
        Lf3:
            java.lang.String r2 = "set_wake_enable"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            java.lang.String r9 = "enable"
            boolean r9 = r10.getBoolean(r9)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.h.b.a(r8, r9)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L106:
            java.lang.String r8 = "lbsforenry"
        L108:
            r9.equals(r8)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L10d:
            java.lang.String r2 = "action_net_changed"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            java.lang.String r9 = "connected"
            boolean r9 = r10.getBoolean(r9)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            cn.jiguang.av.a r9 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> Lb
            r9.a(r8, r4)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.av.a r9 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> Lb
            r9.b(r8, r4)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L12d:
            java.lang.String r2 = "waked"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            java.lang.String r9 = "type"
            r2 = -1
            int r9 = r10.getInt(r9, r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = "from_package"
            java.lang.String r3 = r10.getString(r3)     // Catch: java.lang.Throwable -> Lb
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L150
            java.lang.String r8 = "[waked]empty packageName waked from "
        L14b:
            cn.jiguang.w.f.i(r1, r8)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L150:
            if (r9 != r2) goto L155
            java.lang.String r8 = "[waked]wrong waked type"
            goto L14b
        L155:
            cn.jiguang.p.g.a(r8, r10, r9)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L15a:
            java.lang.String r2 = "cmd"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            a(r8, r10)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L167:
            java.lang.String r2 = "GET_ANDROID_ID"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            java.lang.String r9 = "s_a_id"
            int r9 = r10.getInt(r9)     // Catch: java.lang.Throwable -> Lb
            r10 = 2000(0x7d0, float:2.803E-42)
            if (r9 != r10) goto L206
            cn.jiguang.av.a r9 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> Lb
            r9.c(r8, r4)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L182:
            java.lang.String r2 = "open_log"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            java.lang.String r9 = "aes"
            java.lang.String r9 = r10.getString(r9)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r10 = cn.jiguang.h.c.a.f1296j     // Catch: java.lang.Throwable -> Lb
            java.lang.String r9 = cn.jiguang.av.t.b(r9, r10)     // Catch: java.lang.Throwable -> Lb
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb
            r10.<init>(r9)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.d.a.a(r8, r10, r4)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L19f:
            java.lang.String r8 = "set_ctrl_url"
            boolean r8 = r9.equals(r8)     // Catch: java.lang.Throwable -> Lb
            if (r8 == 0) goto L206
            java.lang.String r8 = "test_wake_controll_url"
            java.lang.String r8 = r10.getString(r8)     // Catch: java.lang.Throwable -> Lb
            java.util.LinkedList r8 = a(r8)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.p.b.a(r8)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.f.b.b(r10)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L1b8:
            java.lang.String r8 = "lbsenable"
            goto L108
        L1bc:
            java.lang.String r8 = "init_local_ctrl"
            goto L108
        L1c0:
            java.lang.String r2 = "notification_state"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            boolean r9 = cn.jiguang.f.b.b(r3)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            java.lang.String r9 = "scence"
            int r9 = r10.getInt(r9)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.k.a.a(r8, r9)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L1d8:
            java.lang.String r2 = "foreground_state_change"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L206
            java.lang.String r9 = "foreground"
            boolean r9 = r10.getBoolean(r9)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.p.f r10 = cn.jiguang.p.f.a()     // Catch: java.lang.Throwable -> Lb
            r10.a(r8, r9)     // Catch: java.lang.Throwable -> Lb
            goto L206
        L1ee:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onEvent throwable:"
            r9.append(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jiguang.w.f.i(r1, r8)
        L206:
            return r0
    }

    public static java.lang.String a(android.content.Context r7) {
            cn.jiguang.ai.a r0 = cn.jiguang.ai.a.a(r7)     // Catch: org.json.JSONException -> Lf7
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lf7
            r1.<init>()     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "sim_slots"
            org.json.JSONArray r3 = cn.jiguang.f.b.D()     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "packagename"
            java.lang.String r3 = r7.getPackageName()     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "appkey"
            java.lang.String r3 = cn.jiguang.v.a.a(r7)     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "platform"
            r3 = 0
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "apkversion"
            java.lang.String r4 = r0.a     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "systemversion"
            java.lang.String r4 = r0.f473b     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "modelnumber"
            java.lang.String r4 = r0.f474c     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "basebandversion"
            java.lang.String r4 = r0.f475d     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "buildnumber"
            java.lang.String r4 = r0.f476e     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "channel"
            java.lang.String r4 = r0.f477f     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lf7
            r2.<init>()     // Catch: org.json.JSONException -> Lf7
            java.lang.String r4 = "PushSDKVer"
            cn.jiguang.ad.b r5 = cn.jiguang.ad.b.a()     // Catch: org.json.JSONException -> Lf7
            java.lang.String r5 = r5.b(r3)     // Catch: org.json.JSONException -> Lf7
            r2.put(r4, r5)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r4 = "StatisticSDKVer"
            cn.jiguang.ad.b r5 = cn.jiguang.ad.b.a()     // Catch: org.json.JSONException -> Lf7
            r6 = 1
            java.lang.String r5 = r5.b(r6)     // Catch: org.json.JSONException -> Lf7
            r2.put(r4, r5)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r4 = "ShareSDKVer"
            cn.jiguang.ad.b r5 = cn.jiguang.ad.b.a()     // Catch: org.json.JSONException -> Lf7
            r6 = 2
            java.lang.String r5 = r5.b(r6)     // Catch: org.json.JSONException -> Lf7
            r2.put(r4, r5)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r4 = "CoreSDKVer"
            cn.jiguang.ad.b r5 = cn.jiguang.ad.b.a()     // Catch: org.json.JSONException -> Lf7
            r6 = 3
            java.lang.String r5 = r5.b(r6)     // Catch: org.json.JSONException -> Lf7
            r2.put(r4, r5)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r4 = "SspSDKVer"
            cn.jiguang.ad.b r5 = cn.jiguang.ad.b.a()     // Catch: org.json.JSONException -> Lf7
            r6 = 4
            java.lang.String r5 = r5.b(r6)     // Catch: org.json.JSONException -> Lf7
            r2.put(r4, r5)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r4 = "VerificationSDKVer"
            cn.jiguang.ad.b r5 = cn.jiguang.ad.b.a()     // Catch: org.json.JSONException -> Lf7
            r6 = 5
            java.lang.String r5 = r5.b(r6)     // Catch: org.json.JSONException -> Lf7
            r2.put(r4, r5)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r4 = "sdkver"
            r1.put(r4, r2)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "installation"
            int r4 = r0.f478g     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "business"
            cn.jiguang.ad.b r4 = cn.jiguang.ad.b.a()     // Catch: org.json.JSONException -> Lf7
            short r4 = r4.b()     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "device_id_status"
            int r4 = cn.jiguang.av.g.a     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "device_id"
            java.lang.String r4 = cn.jiguang.av.g.b(r7)     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "resolution"
            java.lang.String r4 = r0.f479h     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r2 = "android_id"
            java.lang.String r0 = r0.f480i     // Catch: org.json.JSONException -> Lf7
            r1.put(r2, r0)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r0 = "mac_address"
            cn.jiguang.av.a r2 = cn.jiguang.av.a.a()     // Catch: org.json.JSONException -> Lf7
            java.lang.String r4 = ""
            java.lang.String r7 = r2.a(r7, r4, r3)     // Catch: org.json.JSONException -> Lf7
            r1.put(r0, r7)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r7 = r1.toString()     // Catch: org.json.JSONException -> Lf7
            return r7
        Lf7:
            r7 = 0
            return r7
    }

    private static java.util.LinkedList<java.lang.String> a(java.lang.String r5) {
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L25
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L26
            if (r1 <= 0) goto L25
            java.lang.String r1 = ","
            java.lang.String[] r5 = r5.split(r1)     // Catch: java.lang.Throwable -> L26
            int r1 = r5.length     // Catch: java.lang.Throwable -> L26
            r2 = 0
        L15:
            if (r2 >= r1) goto L25
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L26
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L22
            r0.add(r3)     // Catch: java.lang.Throwable -> L26
        L22:
            int r2 = r2 + 1
            goto L15
        L25:
            return r0
        L26:
            r5 = 0
            return r5
    }

    private static org.json.JSONObject a(android.os.Bundle r3) {
            java.lang.String r0 = "JCommonActionHelper"
            java.lang.String r1 = "RESPONSE_BODY"
            byte[] r3 = r3.getByteArray(r1)     // Catch: java.lang.Exception -> L3c
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch: java.lang.Exception -> L3c
            long r1 = r3.getLong()     // Catch: java.lang.Exception -> L3c
            cn.jiguang.i.a.f1298b = r1     // Catch: java.lang.Exception -> L3c
            short r1 = r3.getShort()     // Catch: java.lang.Exception -> L3c
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L3c
            r3.get(r1)     // Catch: java.lang.Exception -> L3c
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = "UTF-8"
            r3.<init>(r1, r2)     // Catch: java.lang.Exception -> L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c
            r1.<init>()     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = "parseBundle2Json content: "
            r1.append(r2)     // Catch: java.lang.Exception -> L3c
            r1.append(r3)     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3c
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Exception -> L3c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3c
            r1.<init>(r3)     // Catch: java.lang.Exception -> L3c
            return r1
        L3c:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parseBundle2Json exception:"
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jiguang.w.f.i(r0, r3)
            r3 = 0
            return r3
    }

    public static void a(android.content.Context r8, int r9) {
            long r2 = cn.jiguang.i.b.a()
            java.lang.String r9 = b(r8, r9)
            long r0 = cn.jiguang.i.a.f1298b
            byte[] r6 = cn.jiguang.i.b.a(r0, r9)
            cn.jiguang.ad.i r0 = cn.jiguang.ad.i.a()
            r5 = 1
            java.lang.String r7 = "JCOMMON"
            r4 = 25
            r1 = r8
            r0.a(r1, r2, r4, r5, r6, r7)
            return
    }

    private static void a(android.content.Context r1, android.os.Bundle r2) {
            org.json.JSONObject r0 = a(r2)
            a(r1, r0)
            cn.jiguang.f.b.c(r2)
            return
    }

    static /* synthetic */ void a(android.content.Context r0, java.lang.Object r1) {
            b(r0, r1)
            return
    }

    public static void a(android.content.Context r2, org.json.JSONObject r3) {
            if (r3 != 0) goto L3
            goto L18
        L3:
            java.lang.String r0 = "cmd"
            int r0 = r3.optInt(r0)
            a(r2, r0)
            r1 = 50
            if (r0 == r1) goto L22
            r1 = 70
            if (r0 == r1) goto L1e
            r1 = 82
            if (r0 == r1) goto L19
        L18:
            return
        L19:
            r0 = 1
            cn.jiguang.d.a.a(r2, r3, r0)
            return
        L1e:
            cn.jiguang.m.a.a(r2)
            return
        L22:
            cn.jiguang.m.b.a(r2, r3)
            return
    }

    private static int b(java.lang.Object r1) {
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 == 0) goto L10
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = "login"
            boolean r1 = r1.getBoolean(r0)
            if (r1 == 0) goto L10
            r1 = 2
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.lang.String b(android.content.Context r5, int r6) {
            r0 = 0
            r1 = 53
            if (r6 == r1) goto L6
            return r0
        L6:
            java.lang.String r6 = a(r5)     // Catch: org.json.JSONException -> L47
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L47
            r2.<init>(r6)     // Catch: org.json.JSONException -> L47
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L47
            r6.<init>()     // Catch: org.json.JSONException -> L47
            java.lang.String r3 = "rom_type"
            cn.jiguang.ad.b r4 = cn.jiguang.ad.b.a()     // Catch: org.json.JSONException -> L47
            byte r4 = r4.b(r5)     // Catch: org.json.JSONException -> L47
            r6.put(r3, r4)     // Catch: org.json.JSONException -> L47
            java.lang.String r3 = "regid"
            cn.jiguang.ad.b r4 = cn.jiguang.ad.b.a()     // Catch: org.json.JSONException -> L47
            java.lang.String r5 = r4.c(r5)     // Catch: org.json.JSONException -> L47
            r6.put(r3, r5)     // Catch: org.json.JSONException -> L47
            java.lang.String r5 = "rom_info"
            r2.put(r5, r6)     // Catch: org.json.JSONException -> L47
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L47
            r5.<init>()     // Catch: org.json.JSONException -> L47
            java.lang.String r6 = "cmd"
            r5.put(r6, r1)     // Catch: org.json.JSONException -> L47
            java.lang.String r6 = "content"
            r5.put(r6, r2)     // Catch: org.json.JSONException -> L47
            java.lang.String r5 = r5.toString()     // Catch: org.json.JSONException -> L47
            return r5
        L47:
            return r0
    }

    private static void b(android.content.Context r4, java.lang.Object r5) {
            r0 = 1800(0x708, float:2.522E-42)
            boolean r1 = cn.jiguang.f.b.b(r0)
            if (r1 == 0) goto L14
            cn.jiguang.i.a$2 r1 = new cn.jiguang.i.a$2
            r1.<init>(r4, r5)
            long r2 = cn.jiguang.f.b.f(r0)
            cn.jiguang.z.b.a(r1, r2)
        L14:
            java.lang.String r5 = "heartbeat"
            cn.jiguang.m.a.a(r4, r5)
            r5 = 0
            cn.jiguang.m.b.a(r4, r5)
            cn.jiguang.m.d r5 = cn.jiguang.m.d.d()
            r5.a(r4)
            return
    }
}
