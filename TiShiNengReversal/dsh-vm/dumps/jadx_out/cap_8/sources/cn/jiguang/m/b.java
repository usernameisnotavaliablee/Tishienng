package cn.jiguang.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {

    public static class a extends cn.jiguang.au.b {
        private android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        private org.json.JSONObject f1329b;

        a(android.content.Context r1, org.json.JSONObject r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f1329b = r2
                java.lang.String r1 = "JWakeCmd#WakeAction"
                r0.f668h = r1
                return
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r7 = this;
                java.lang.String r0 = "JWakeCmd"
                android.content.Context r1 = r7.a     // Catch: java.lang.Throwable -> L21
                java.lang.String r2 = "JWakeCmdcmd"
                long r1 = cn.jiguang.h.b.d(r1, r2)     // Catch: java.lang.Throwable -> L21
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L21
                org.json.JSONObject r5 = r7.f1329b     // Catch: java.lang.Throwable -> L21
                if (r5 != 0) goto L23
                long r3 = r3 - r1
                r1 = 3600000(0x36ee80, double:1.7786363E-317)
                int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r6 < 0) goto L1b
                goto L23
            L1b:
                java.lang.String r1 = "is not cmd wake time"
                cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L21
                return
            L21:
                r1 = move-exception
                goto L29
            L23:
                android.content.Context r1 = r7.a     // Catch: java.lang.Throwable -> L21
                cn.jiguang.m.b.b(r1, r5)     // Catch: java.lang.Throwable -> L21
                return
            L29:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "WakeAction failed:"
                r2.append(r3)
                java.lang.String r1 = r1.getMessage()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                cn.jiguang.w.f.i(r0, r1)
                return
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r4, org.json.JSONObject r5) {
            java.lang.String r0 = "JWakeCmd"
            if (r5 != 0) goto Lc
            java.lang.String r1 = "executeWakeAction: [JWakeCmd] from heartBeat"
        L6:
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> La
            goto Lf
        La:
            r4 = move-exception
            goto L38
        Lc:
            java.lang.String r1 = "executeWakeAction: [JWakeCmd] from cmd"
            goto L6
        Lf:
            java.lang.Object r1 = cn.jiguang.m.a.c(r4)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> La
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> La
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r2.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r3 = "JWakeCmd isActionUserEnable:"
            r2.append(r3)     // Catch: java.lang.Throwable -> La
            r2.append(r1)     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L37
            cn.jiguang.m.b$a r1 = new cn.jiguang.m.b$a     // Catch: java.lang.Throwable -> La
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> La
            cn.jiguang.z.b.a(r1)     // Catch: java.lang.Throwable -> La
        L37:
            return
        L38:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "[executeWakeAction] failed:"
            r5.append(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.w.f.j(r0, r4)
            return
    }

    static /* synthetic */ void b(android.content.Context r0, org.json.JSONObject r1) {
            c(r0, r1)
            return
    }

    private static void c(android.content.Context r10, org.json.JSONObject r11) {
            java.lang.String r0 = ""
            java.lang.String r1 = "bwct.catch.v2"
            java.lang.String r2 = "JWakeCmd"
            java.lang.String r3 = "JWakeCmdcmd"
            cn.jiguang.h.b.b(r10, r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = cn.jiguang.av.i.e(r1)     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "read cmd wakeTarget:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L93
            r4.append(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L93
            cn.jiguang.w.f.c(r2, r4)     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto Le2
            java.lang.String r4 = "content"
            org.json.JSONObject r4 = r11.getJSONObject(r4)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r5 = "type"
            r6 = 1
            int r5 = r4.optInt(r5, r6)     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = "pkgName"
            java.lang.String r7 = r4.optString(r7, r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = "serviceName"
            java.lang.String r0 = r4.optString(r8, r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = "delay_time"
            int r4 = r4.optInt(r8)     // Catch: java.lang.Throwable -> L93
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L93
            if (r8 != 0) goto Lb6
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L51
            goto Lb6
        L51:
            r11 = 0
            if (r5 != r6) goto L95
            android.content.pm.PackageManager r8 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L5f
            r9 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo(r7, r9)     // Catch: java.lang.Throwable -> L5f
            goto L74
        L5f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r8.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = "not found application:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L93
            r8.append(r7)     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L93
            cn.jiguang.w.f.j(r2, r8)     // Catch: java.lang.Throwable -> L93
            r8 = r11
        L74:
            if (r8 == 0) goto L95
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L93
            r11.<init>()     // Catch: java.lang.Throwable -> L93
            cn.jiguang.n.c r9 = new cn.jiguang.n.c     // Catch: java.lang.Throwable -> L93
            r9.<init>()     // Catch: java.lang.Throwable -> L93
            r9.a = r7     // Catch: java.lang.Throwable -> L93
            r9.f1342b = r0     // Catch: java.lang.Throwable -> L93
            int r8 = r8.targetSdkVersion     // Catch: java.lang.Throwable -> L93
            r9.f1343c = r8     // Catch: java.lang.Throwable -> L93
            r9.f1350j = r6     // Catch: java.lang.Throwable -> L93
            r9.f1351k = r4     // Catch: java.lang.Throwable -> L93
            r4 = 4
            r9.f1347g = r4     // Catch: java.lang.Throwable -> L93
            r11.add(r9)     // Catch: java.lang.Throwable -> L93
            goto L95
        L93:
            r10 = move-exception
            goto L102
        L95:
            java.util.List r0 = cn.jiguang.p.d.a(r3, r7, r0, r5)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = cn.jiguang.p.c.a(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r3.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "write cmd wakeTarget:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L93
            r3.append(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L93
            cn.jiguang.w.f.c(r2, r3)     // Catch: java.lang.Throwable -> L93
            cn.jiguang.av.i.a(r1, r0)     // Catch: java.lang.Throwable -> L93
            goto Lf2
        Lb6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r10.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "Incomplete data:"
            r10.append(r0)     // Catch: java.lang.Throwable -> L93
            r10.append(r11)     // Catch: java.lang.Throwable -> L93
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L93
            goto Lfe
        Lc8:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r11.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "stop wake,the json form cmd is illegal:"
            r11.append(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L93
            r11.append(r10)     // Catch: java.lang.Throwable -> L93
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L93
            cn.jiguang.w.f.i(r2, r10)     // Catch: java.lang.Throwable -> L93
            goto L11a
        Le2:
            if (r3 == 0) goto Lfc
            boolean r11 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L93
            if (r11 != 0) goto Lfc
            java.util.List r11 = cn.jiguang.p.c.a(r3)     // Catch: java.lang.Throwable -> L93
            java.util.List r11 = cn.jiguang.p.c.a(r10, r11)     // Catch: java.lang.Throwable -> L93
        Lf2:
            if (r11 == 0) goto L11a
            cn.jiguang.p.f r0 = cn.jiguang.p.f.a()     // Catch: java.lang.Throwable -> L93
            r0.a(r10, r11)     // Catch: java.lang.Throwable -> L93
            goto L11a
        Lfc:
            java.lang.String r10 = "there are no cache cmd wakeTarget"
        Lfe:
            cn.jiguang.w.f.i(r2, r10)     // Catch: java.lang.Throwable -> L93
            return
        L102:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "parse throwable:"
            r11.append(r0)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.w.f.i(r2, r10)
        L11a:
            return
    }
}
