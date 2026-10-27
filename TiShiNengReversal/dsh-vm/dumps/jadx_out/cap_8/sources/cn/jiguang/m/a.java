package cn.jiguang.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jiguang.au.b {

    /* renamed from: e, reason: collision with root package name */
    private static long f1325e;
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jiguang.n.a f1326b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1327c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, java.lang.Boolean> f1328d;


    /* renamed from: cn.jiguang.m.a$a, reason: collision with other inner class name */
    private static class C0045a extends cn.jiguang.au.b {
        private android.content.Context a;

        public C0045a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.lang.String r1 = "JWake#RequestConfigAction"
                r0.f668h = r1
                return
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r1 = this;
                android.content.Context r0 = r1.a
                cn.jiguang.m.a.d(r0)
                return
        }
    }

    private static class b implements android.content.ServiceConnection {
        private android.content.Context a;

        public b(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
                r2 = this;
                java.lang.String r3 = "JWake"
                java.lang.String r4 = "unbind wake ServiceConnection"
                cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> L15
                android.content.Context r4 = r2.a     // Catch: java.lang.Throwable -> L15
                android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L15
                android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L15
                r4.unbindService(r2)     // Catch: java.lang.Throwable -> L15
                return
            L15:
                r4 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onServiceConnected throwable"
                r0.append(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                cn.jiguang.w.f.i(r3, r4)
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r1) {
                r0 = this;
                return
        }
    }

    public a(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1328d = r0
            r1.a = r2
            r1.f1327c = r3
            java.lang.String r2 = "JWake"
            r1.f668h = r2
            return
    }

    private static android.content.Intent a(java.lang.String r2, int r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2)
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            r2.addCategory(r0)
            r2.setComponent(r1)
            r2.setSelector(r1)
            return r3
    }

    public static java.lang.Object a(android.content.Context r1, java.lang.Object r2) {
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto Lf
            java.util.List r2 = (java.util.List) r2
            cn.jiguang.n.a r1 = cn.jiguang.p.b.b(r1)
            java.util.List r1 = cn.jiguang.p.c.a(r1, r2)
            return r1
        Lf:
            return r2
    }

    public static java.util.List<cn.jiguang.n.c> a(android.content.Context r6, cn.jiguang.n.a r7, java.util.List<cn.jiguang.n.c> r8) {
            boolean r0 = cn.jiguang.v.c.c()
            java.lang.String r1 = "JWake"
            if (r0 == 0) goto L13
            java.lang.String r6 = "is only JOperate sdk cmd"
            cn.jiguang.w.f.c(r1, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r6
        L13:
            if (r8 != 0) goto L1b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r6
        L1b:
            cn.jiguang.m.a r0 = new cn.jiguang.m.a
            java.lang.String r2 = "start"
            r0.<init>(r6, r2)
            r0.f1326b = r7
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7 = 0
            r2 = 0
        L2b:
            int r3 = r8.size()
            if (r2 >= r3) goto L42
            java.lang.Object r3 = r8.get(r2)
            cn.jiguang.n.c r3 = (cn.jiguang.n.c) r3
            if (r3 != 0) goto L3a
            goto L3f
        L3a:
            java.lang.String r4 = r3.a
            r6.put(r4, r3)
        L3f:
            int r2 = r2 + 1
            goto L2b
        L42:
            r2 = 0
            r3 = 1
            java.util.List r6 = r0.a(r6, r2, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "cmdPrepareWakeTargets:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r1, r0)
            if (r6 != 0) goto L63
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L63:
            r0 = 0
        L64:
            int r1 = r8.size()
            if (r0 >= r1) goto L98
            java.lang.Object r1 = r8.get(r0)
            cn.jiguang.n.c r1 = (cn.jiguang.n.c) r1
            if (r1 != 0) goto L73
            goto L95
        L73:
            r2 = 0
        L74:
            int r3 = r6.size()
            r4 = 4
            if (r2 >= r3) goto L90
            java.lang.Object r3 = r6.get(r2)
            cn.jiguang.n.c r3 = (cn.jiguang.n.c) r3
            int r5 = r3.f1347g
            r4 = r4 | r5
            r3.f1347g = r4
            java.lang.String r4 = r1.a
            java.lang.String r3 = r3.a
            if (r4 != r3) goto L8d
            goto L95
        L8d:
            int r2 = r2 + 1
            goto L74
        L90:
            r1.f1347g = r4
            r6.add(r1)
        L95:
            int r0 = r0 + 1
            goto L64
        L98:
            return r6
    }

    public static java.util.List<cn.jiguang.n.b> a(android.content.Context r45, java.util.List<cn.jiguang.n.c> r46) {
            r1 = r45
            r0 = r46
            java.lang.String r2 = "content://"
            java.lang.String r3 = "fail to start instrumentation caused by: "
            r4 = 102(0x66, float:1.43E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 64
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = 16
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r14 = 2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r16 = 101(0x65, float:1.42E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r16 = 4
            r17 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)
            boolean r18 = cn.jiguang.v.c.c()
            r19 = 0
            java.lang.String r8 = "JWake"
            if (r18 == 0) goto L48
            java.lang.String r0 = "is only JOperate sdk wake"
            cn.jiguang.w.f.c(r8, r0)
            return r19
        L48:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "[wake] wakeTargets:"
            r10.append(r12)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            cn.jiguang.w.f.c(r8, r10)
            cn.jiguang.h.b.b(r1, r8)
            cn.jiguang.h.b.b(r1)
            if (r0 == 0) goto L6a0
            int r10 = r0.size()
            if (r10 > 0) goto L6c
            goto L6a0
        L6c:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r12 = r1.getPackageName()
            java.lang.String r14 = "from_package"
            r10.put(r14, r12)
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.String r14 = "di"
            java.lang.String r0 = cn.jiguang.av.g.b(r1)     // Catch: java.lang.Throwable -> L88
            r12.put(r14, r0)     // Catch: java.lang.Throwable -> L88
        L88:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r22 = r46.iterator()
        L91:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L69e
            java.lang.Object r0 = r22.next()
            r23 = r7
            r7 = r0
            cn.jiguang.n.c r7 = (cn.jiguang.n.c) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r24 = r2
            java.lang.String r2 = "start wake target:"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r8, r0)
            if (r7 != 0) goto Lc3
            java.lang.String r0 = "wakeTarget is null, continue another wake"
        Lbb:
            cn.jiguang.w.f.i(r8, r0)
            r7 = r23
            r2 = r24
            goto L91
        Lc3:
            int r0 = r7.f1343c
            r2 = 2
            if (r0 != r2) goto Le6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "command this app is not allow to wake package:"
            r0.append(r2)
            java.lang.String r2 = r7.a
            r0.append(r2)
            java.lang.String r2 = ",service:"
            r0.append(r2)
            java.lang.String r2 = r7.f1342b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto Lbb
        Le6:
            java.lang.String r0 = r7.l     // Catch: java.lang.Throwable -> Lf6
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf6
            if (r0 != 0) goto Lf8
            java.lang.String r0 = "u_extra"
            java.lang.String r2 = r7.l     // Catch: java.lang.Throwable -> Lf6
            r12.put(r0, r2)     // Catch: java.lang.Throwable -> Lf6
            goto Lf8
        Lf6:
            goto L101
        Lf8:
            java.lang.String r0 = "jg_extras"
            java.lang.String r2 = r12.toString()     // Catch: java.lang.Throwable -> Lf6
            r10.put(r0, r2)     // Catch: java.lang.Throwable -> Lf6
        L101:
            cn.jiguang.n.b r2 = new cn.jiguang.n.b
            r2.<init>()
            java.lang.String r0 = r7.a
            r2.a = r0
            int r0 = r7.f1347g
            r0 = r0 & 1
            r25 = r12
            java.lang.String r12 = "type"
            r26 = 0
            if (r0 == 0) goto L1c0
            android.content.Intent r0 = r7.f1345e
            if (r0 == 0) goto L1c0
            boolean r0 = cn.jiguang.p.a.a(r1)
            if (r0 != 0) goto L1c0
            android.os.Bundle r0 = cn.jiguang.p.c.a(r10)     // Catch: java.lang.Throwable -> L1a0
            r27 = r10
            r10 = 8
            r0.putInt(r12, r10)     // Catch: java.lang.Throwable -> L163
            android.content.Intent r10 = r7.f1345e     // Catch: java.lang.Throwable -> L163
            boolean r28 = a(r1, r0, r10)     // Catch: java.lang.Throwable -> L163
            if (r28 != 0) goto L169
            r46 = r10
            android.content.Intent r10 = r7.f1346f     // Catch: java.lang.Throwable -> L163
            if (r10 == 0) goto L15e
            r29 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15a
            r15.<init>()     // Catch: java.lang.Throwable -> L15a
            r30 = r3
            java.lang.String r3 = "will wake backupActivity:"
            r15.append(r3)     // Catch: java.lang.Throwable -> L157
            r15.append(r10)     // Catch: java.lang.Throwable -> L157
            java.lang.String r3 = r15.toString()     // Catch: java.lang.Throwable -> L157
            cn.jiguang.w.f.c(r8, r3)     // Catch: java.lang.Throwable -> L157
            boolean r28 = a(r1, r0, r10)     // Catch: java.lang.Throwable -> L157
            goto L16e
        L157:
            r0 = move-exception
        L158:
            r3 = 0
            goto L1a6
        L15a:
            r0 = move-exception
            r30 = r3
            goto L158
        L15e:
            r30 = r3
            r29 = r15
            goto L16c
        L163:
            r0 = move-exception
            r30 = r3
        L166:
            r29 = r15
            goto L158
        L169:
            r46 = r10
            goto L15e
        L16c:
            r10 = r46
        L16e:
            if (r28 == 0) goto L198
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L195
            r0.<init>()     // Catch: java.lang.Throwable -> L195
            java.lang.String r3 = "use ACTIVITY wake up ,start activity:"
            r0.append(r3)     // Catch: java.lang.Throwable -> L195
            java.lang.String r3 = r7.a     // Catch: java.lang.Throwable -> L195
            r0.append(r3)     // Catch: java.lang.Throwable -> L195
            java.lang.String r3 = ","
            r0.append(r3)     // Catch: java.lang.Throwable -> L195
            r0.append(r10)     // Catch: java.lang.Throwable -> L195
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L195
            cn.jiguang.w.f.c(r8, r0)     // Catch: java.lang.Throwable -> L195
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b     // Catch: java.lang.Throwable -> L195
            r0.put(r13, r6)     // Catch: java.lang.Throwable -> L195
            r0 = 1
            goto L19e
        L195:
            r0 = move-exception
            r3 = 1
            goto L1a6
        L198:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b     // Catch: java.lang.Throwable -> L157
            r0.put(r13, r4)     // Catch: java.lang.Throwable -> L157
            r0 = 0
        L19e:
            r3 = r0
            goto L1c7
        L1a0:
            r0 = move-exception
            r30 = r3
            r27 = r10
            goto L166
        L1a6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "Fail to start activity caused by:"
            r10.append(r15)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            cn.jiguang.w.f.c(r8, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b
            r0.put(r13, r4)
            goto L1c7
        L1c0:
            r30 = r3
            r27 = r10
            r29 = r15
            r3 = 0
        L1c7:
            int r0 = r7.f1347g
            r21 = 2
            r0 = r0 & 2
            if (r0 == 0) goto L29c
            java.lang.String r0 = r7.f1348h
            if (r0 == 0) goto L29c
            java.lang.String r0 = "account"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L245
            r31 = r0
            android.accounts.AccountManager r31 = (android.accounts.AccountManager) r31     // Catch: java.lang.Throwable -> L245
            if (r31 == 0) goto L278
            android.accounts.AuthenticatorDescription[] r0 = r31.getAuthenticatorTypes()     // Catch: java.lang.Throwable -> L245
            r10 = 0
        L1e4:
            int r15 = r0.length     // Catch: java.lang.Throwable -> L245
            if (r10 >= r15) goto L249
            r15 = r0[r10]     // Catch: java.lang.Throwable -> L245
            r46 = r0
            java.lang.String r0 = r15.type     // Catch: java.lang.Throwable -> L245
            r28 = r3
            java.lang.String r3 = r7.f1348h     // Catch: java.lang.Throwable -> L238
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L238
            if (r0 == 0) goto L23c
            android.os.Bundle r0 = cn.jiguang.p.c.a(r27)     // Catch: java.lang.Throwable -> L238
            r3 = 16
            r0.putInt(r12, r3)     // Catch: java.lang.Throwable -> L236
            java.lang.String r10 = r15.type     // Catch: java.lang.Throwable -> L236
            java.lang.String r33 = "cn.jiguang.sdk.wake"
            r37 = 0
            r38 = 0
            r34 = 0
            r36 = 0
            r35 = r0
            r32 = r10
            r31.addAccount(r32, r33, r34, r35, r36, r37, r38)     // Catch: java.lang.Throwable -> L236
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L236
            r0.<init>()     // Catch: java.lang.Throwable -> L236
            java.lang.String r10 = "use ACCOUNT wake up ,start add account to:"
            r0.append(r10)     // Catch: java.lang.Throwable -> L236
            java.lang.String r10 = r15.type     // Catch: java.lang.Throwable -> L236
            r0.append(r10)     // Catch: java.lang.Throwable -> L236
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L236
            cn.jiguang.w.f.c(r8, r0)     // Catch: java.lang.Throwable -> L236
            java.lang.String r0 = "JWake_account"
            cn.jiguang.h.b.b(r1, r0)     // Catch: java.lang.Throwable -> L232
            r0 = 1
            r28 = 1
            goto L24e
        L232:
            r0 = move-exception
            r28 = 1
            goto L282
        L236:
            r0 = move-exception
            goto L282
        L238:
            r0 = move-exception
        L239:
            r3 = 16
            goto L282
        L23c:
            r3 = 16
            int r10 = r10 + 1
            r0 = r46
            r3 = r28
            goto L1e4
        L245:
            r0 = move-exception
            r28 = r3
            goto L239
        L249:
            r28 = r3
            r3 = 16
            r0 = 0
        L24e:
            if (r0 != 0) goto L272
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L236
            r0.<init>()     // Catch: java.lang.Throwable -> L236
            java.lang.String r10 = "start add account failed ,not found the target type :"
            r0.append(r10)     // Catch: java.lang.Throwable -> L236
            java.lang.String r10 = r7.f1348h     // Catch: java.lang.Throwable -> L236
            r0.append(r10)     // Catch: java.lang.Throwable -> L236
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L236
            cn.jiguang.w.f.c(r8, r0)     // Catch: java.lang.Throwable -> L236
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b     // Catch: java.lang.Throwable -> L236
            r10 = 103(0x67, float:1.44E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L236
            r0.put(r11, r10)     // Catch: java.lang.Throwable -> L236
            goto L2a0
        L272:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b     // Catch: java.lang.Throwable -> L236
            r0.put(r11, r6)     // Catch: java.lang.Throwable -> L236
            goto L2a0
        L278:
            r28 = r3
            r3 = 16
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b     // Catch: java.lang.Throwable -> L236
            r0.put(r11, r5)     // Catch: java.lang.Throwable -> L236
            goto L2a0
        L282:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "Fail to add account  caused by:"
            r10.append(r15)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            cn.jiguang.w.f.c(r8, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b
            r0.put(r11, r4)
            goto L2a0
        L29c:
            r28 = r3
            r3 = 16
        L2a0:
            if (r28 == 0) goto L2b9
            java.lang.String r0 = "wake success, continue wake other target"
            cn.jiguang.w.f.c(r8, r0)
            r14.add(r2)
            r7 = r23
            r2 = r24
            r12 = r25
            r10 = r27
            r15 = r29
            r3 = r30
            goto L91
        L2b9:
            int r0 = r7.f1347g
            r20 = 8
            r0 = r0 & 8
            java.lang.String r10 = "&"
            if (r0 == 0) goto L394
            java.lang.String r0 = r7.f1349i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L394
            java.lang.String r0 = r7.f1349i     // Catch: java.lang.Throwable -> L378
            java.lang.String[] r15 = r0.split(r10)     // Catch: java.lang.Throwable -> L378
            int r3 = r15.length     // Catch: java.lang.Throwable -> L378
            r31 = r11
            r11 = 0
        L2d5:
            if (r11 >= r3) goto L375
            r0 = r15[r11]     // Catch: java.lang.Throwable -> L371
            r32 = r3
            android.os.Bundle r3 = cn.jiguang.p.c.a(r27)     // Catch: java.lang.Throwable -> L341
            r33 = r11
            r11 = 64
            r3.putInt(r12, r11)     // Catch: java.lang.Throwable -> L33d
            android.content.ComponentName r11 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L33d
            r34 = r13
            java.lang.String r13 = r7.a     // Catch: java.lang.Throwable -> L33b
            r11.<init>(r13, r0)     // Catch: java.lang.Throwable -> L33b
            r13 = r19
            boolean r3 = r1.startInstrumentation(r11, r13, r3)     // Catch: java.lang.Throwable -> L33b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32d
            r11.<init>()     // Catch: java.lang.Throwable -> L32d
            java.lang.String r13 = "use INSTRUMENTATION wake up ,start instrumentation: "
            r11.append(r13)     // Catch: java.lang.Throwable -> L32d
            java.lang.String r13 = r7.a     // Catch: java.lang.Throwable -> L32d
            r11.append(r13)     // Catch: java.lang.Throwable -> L32d
            java.lang.String r13 = ", "
            r11.append(r13)     // Catch: java.lang.Throwable -> L32d
            r11.append(r0)     // Catch: java.lang.Throwable -> L32d
            java.lang.String r0 = ", state: "
            r11.append(r0)     // Catch: java.lang.Throwable -> L32d
            r11.append(r3)     // Catch: java.lang.Throwable -> L32d
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L32d
            cn.jiguang.w.f.c(r8, r0)     // Catch: java.lang.Throwable -> L32d
            if (r3 == 0) goto L331
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b     // Catch: java.lang.Throwable -> L32d
            r0.put(r9, r6)     // Catch: java.lang.Throwable -> L32d
            java.lang.String r0 = "JWakeinstrument"
            cn.jiguang.h.b.b(r1, r0)     // Catch: java.lang.Throwable -> L32d
            r28 = r3
        L329:
            r11 = r30
            goto L397
        L32d:
            r0 = move-exception
            r28 = r3
            goto L345
        L331:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b     // Catch: java.lang.Throwable -> L32d
            r0.put(r9, r5)     // Catch: java.lang.Throwable -> L32d
            r28 = r3
            r11 = r30
            goto L35e
        L33b:
            r0 = move-exception
            goto L345
        L33d:
            r0 = move-exception
        L33e:
            r34 = r13
            goto L345
        L341:
            r0 = move-exception
            r33 = r11
            goto L33e
        L345:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36d
            r3.<init>()     // Catch: java.lang.Throwable -> L36d
            r11 = r30
            r3.append(r11)     // Catch: java.lang.Throwable -> L36b
            r3.append(r0)     // Catch: java.lang.Throwable -> L36b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L36b
            cn.jiguang.w.f.c(r8, r0)     // Catch: java.lang.Throwable -> L36b
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b     // Catch: java.lang.Throwable -> L36b
            r0.put(r9, r4)     // Catch: java.lang.Throwable -> L36b
        L35e:
            int r0 = r33 + 1
            r30 = r11
            r3 = r32
            r13 = r34
            r19 = 0
            r11 = r0
            goto L2d5
        L36b:
            r0 = move-exception
            goto L37c
        L36d:
            r0 = move-exception
        L36e:
            r11 = r30
            goto L37c
        L371:
            r0 = move-exception
        L372:
            r34 = r13
            goto L36e
        L375:
            r34 = r13
            goto L329
        L378:
            r0 = move-exception
            r31 = r11
            goto L372
        L37c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.w.f.c(r8, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b
            r0.put(r9, r4)
            goto L397
        L394:
            r31 = r11
            goto L375
        L397:
            if (r28 == 0) goto L3b4
            java.lang.String r0 = "instrumentation wake success, continue wake other target"
            cn.jiguang.w.f.c(r8, r0)
            r14.add(r2)
        L3a1:
            r3 = r11
            r7 = r23
            r2 = r24
            r12 = r25
            r10 = r27
            r15 = r29
            r11 = r31
            r13 = r34
            r19 = 0
            goto L91
        L3b4:
            int r0 = r7.f1347g
            r0 = r0 & 4
            if (r0 != 0) goto L3d5
            r14.add(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "wake end, no service or provider wake, wakeType: "
            r0.append(r2)
            int r2 = r7.f1347g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r8, r0)
            goto L3a1
        L3d5:
            java.lang.String r0 = r7.f1342b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3ec
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 < r3) goto L3ea
            int r0 = r7.f1343c
            if (r0 >= r3) goto L3e8
            goto L3ea
        L3e8:
            r0 = 2
            goto L3ed
        L3ea:
            r0 = 3
            goto L3ed
        L3ec:
            r0 = 0
        L3ed:
            java.lang.String r3 = r7.f1344d
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L3f7
            r0 = r0 | 4
        L3f7:
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = "use OLD wake up ,wake type is :"
            r0.append(r13)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r8, r0)
            r13 = r3 & 2
            if (r13 != 0) goto L423
            r0 = r3 & 1
            if (r0 == 0) goto L415
            goto L423
        L415:
            r28 = r3
            r30 = r5
        L419:
            r35 = r9
            r36 = r11
            r17 = r14
            r14 = r29
            goto L566
        L423:
            java.lang.String r0 = r7.f1342b
            java.lang.String[] r15 = r0.split(r10)
            r28 = r3
            int r3 = r15.length
            r30 = r5
            r5 = 0
        L42f:
            if (r5 >= r3) goto L419
            r0 = r15[r5]
            r32 = r3
            android.content.ComponentName r3 = new android.content.ComponentName
            r33 = r5
            java.lang.String r5 = r7.a
            r3.<init>(r5, r0)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            r5.setComponent(r3)
            r3 = 32
            r5.setFlags(r3)
            android.os.Bundle r3 = cn.jiguang.p.c.a(r27)
            r35 = r9
            r9 = 2
            r3.putInt(r12, r9)
            r5.putExtras(r3)
            java.lang.String r3 = "cn.jpush.android.service.DaemonService"
            boolean r3 = android.text.TextUtils.equals(r0, r3)
            r9 = r3 ^ 1
            r46 = r3
            java.lang.String r3 = ", is d config: "
            r36 = r11
            java.lang.String r11 = "JWakedservice"
            if (r13 == 0) goto L4ea
            cn.jiguang.m.a$b r0 = new cn.jiguang.m.a$b     // Catch: java.lang.Throwable -> L4c8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c8
            r37 = r13
            android.content.Context r13 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L4c2
            android.content.Context r13 = com.stub.StubApp.getOrigApplicationContext(r13)     // Catch: java.lang.Throwable -> L4c2
            r38 = r15
            r15 = 1
            boolean r0 = r13.bindService(r5, r0, r15)     // Catch: java.lang.Throwable -> L488
            if (r0 == 0) goto L48e
            if (r46 != 0) goto L48e
            cn.jiguang.h.b.b(r1, r11)     // Catch: java.lang.Throwable -> L488
            goto L48e
        L488:
            r0 = move-exception
            r17 = r14
        L48b:
            r14 = r29
            goto L4cc
        L48e:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r13 = r2.f1341b     // Catch: java.lang.Throwable -> L488
            if (r0 == 0) goto L495
            r17 = 1
            goto L497
        L495:
            r17 = 102(0x66, float:1.43E-43)
        L497:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> L488
            r17 = r14
            r14 = r29
            r13.put(r14, r15)     // Catch: java.lang.Throwable -> L4c0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c0
            r13.<init>()     // Catch: java.lang.Throwable -> L4c0
            java.lang.String r15 = "use bindService wake up, state: "
            r13.append(r15)     // Catch: java.lang.Throwable -> L4c0
            r13.append(r0)     // Catch: java.lang.Throwable -> L4c0
            r13.append(r3)     // Catch: java.lang.Throwable -> L4c0
            r13.append(r9)     // Catch: java.lang.Throwable -> L4c0
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L4c0
            cn.jiguang.w.f.c(r8, r13)     // Catch: java.lang.Throwable -> L4c0
            if (r0 == 0) goto L4f2
            goto L566
        L4c0:
            r0 = move-exception
            goto L4cc
        L4c2:
            r0 = move-exception
        L4c3:
            r17 = r14
            r38 = r15
            goto L48b
        L4c8:
            r0 = move-exception
            r37 = r13
            goto L4c3
        L4cc:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "bindService throwable:"
            r13.append(r15)
            java.lang.String r0 = r0.getMessage()
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            cn.jiguang.w.f.i(r8, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b
            r0.put(r14, r4)
            goto L4f2
        L4ea:
            r37 = r13
            r17 = r14
            r38 = r15
            r14 = r29
        L4f2:
            r0 = r28 & 1
            if (r0 == 0) goto L552
            android.content.ComponentName r0 = r1.startService(r5)     // Catch: java.lang.Throwable -> L507
            if (r0 == 0) goto L4fe
            r0 = 1
            goto L4ff
        L4fe:
            r0 = 0
        L4ff:
            if (r0 == 0) goto L509
            if (r46 != 0) goto L509
            cn.jiguang.h.b.b(r1, r11)     // Catch: java.lang.Throwable -> L507
            goto L509
        L507:
            r0 = move-exception
            goto L535
        L509:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = r2.f1341b     // Catch: java.lang.Throwable -> L507
            if (r0 == 0) goto L50f
            r11 = 1
            goto L511
        L50f:
            r11 = 102(0x66, float:1.43E-43)
        L511:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L507
            r5.put(r6, r11)     // Catch: java.lang.Throwable -> L507
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L507
            r5.<init>()     // Catch: java.lang.Throwable -> L507
            java.lang.String r11 = "use startService wake up, state: "
            r5.append(r11)     // Catch: java.lang.Throwable -> L507
            r5.append(r0)     // Catch: java.lang.Throwable -> L507
            r5.append(r3)     // Catch: java.lang.Throwable -> L507
            r5.append(r9)     // Catch: java.lang.Throwable -> L507
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L507
            cn.jiguang.w.f.c(r8, r3)     // Catch: java.lang.Throwable -> L507
            if (r0 == 0) goto L552
            goto L566
        L535:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "startService throwable:"
            r3.append(r5)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.w.f.i(r8, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b
            r0.put(r6, r4)
        L552:
            int r5 = r33 + 1
            r29 = r14
            r14 = r17
            r3 = r32
            r9 = r35
            r11 = r36
            r13 = r37
            r15 = r38
            r17 = 1
            goto L42f
        L566:
            r0 = r28 & 4
            if (r0 == 0) goto L664
            java.lang.String r0 = r7.f1344d
            java.lang.String[] r3 = r0.split(r10)
            int r5 = r3.length
            r9 = 0
        L572:
            if (r9 >= r5) goto L664
            r0 = r3[r9]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62e
            r10.<init>()     // Catch: java.lang.Throwable -> L62e
            java.lang.String r11 = r7.a     // Catch: java.lang.Throwable -> L62e
            r10.append(r11)     // Catch: java.lang.Throwable -> L62e
            java.lang.String r11 = ".DownloadProvider"
            r10.append(r11)     // Catch: java.lang.Throwable -> L62e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L62e
            boolean r10 = android.text.TextUtils.equals(r0, r10)     // Catch: java.lang.Throwable -> L62e
            r11 = r10 ^ 1
            boolean r13 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L62e
            if (r13 != 0) goto L636
            android.content.Context r13 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L62e
            android.content.Context r13 = com.stub.StubApp.getOrigApplicationContext(r13)     // Catch: java.lang.Throwable -> L62e
            android.content.ContentResolver r39 = r13.getContentResolver()     // Catch: java.lang.Throwable -> L62e
            r13 = r24
            boolean r15 = r0.startsWith(r13)     // Catch: java.lang.Throwable -> L5b9
            if (r15 != 0) goto L5c0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b9
            r15.<init>()     // Catch: java.lang.Throwable -> L5b9
            r15.append(r13)     // Catch: java.lang.Throwable -> L5b9
            r15.append(r0)     // Catch: java.lang.Throwable -> L5b9
            java.lang.String r0 = r15.toString()     // Catch: java.lang.Throwable -> L5b9
            goto L5c0
        L5b9:
            r0 = move-exception
            r46 = r3
        L5bc:
            r3 = r23
            goto L63d
        L5c0:
            java.lang.String r15 = "4"
            r46 = r3
            r3 = r27
            r3.put(r12, r15)     // Catch: java.lang.Throwable -> L62a
            java.lang.String r15 = cn.jiguang.p.c.b(r3)     // Catch: java.lang.Throwable -> L62a
            boolean r24 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L62a
            if (r24 != 0) goto L5e7
            r27 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e5
            r3.<init>()     // Catch: java.lang.Throwable -> L5e5
            r3.append(r0)     // Catch: java.lang.Throwable -> L5e5
            r3.append(r15)     // Catch: java.lang.Throwable -> L5e5
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5e5
            goto L5e9
        L5e5:
            r0 = move-exception
            goto L5bc
        L5e7:
            r27 = r3
        L5e9:
            android.net.Uri r40 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L5e5
            r43 = 0
            r44 = 0
            r41 = 0
            r42 = 0
            android.database.Cursor r0 = r39.query(r40, r41, r42, r43, r44)     // Catch: java.lang.Throwable -> L5e5
            if (r0 == 0) goto L604
            boolean r3 = r0.isClosed()     // Catch: java.lang.Throwable -> L5e5
            if (r3 != 0) goto L604
            r0.close()     // Catch: java.lang.Throwable -> L5e5
        L604:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b     // Catch: java.lang.Throwable -> L5e5
            r3 = r23
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L613
            if (r10 != 0) goto L615
            java.lang.String r0 = "JWakedprovider"
            cn.jiguang.h.b.b(r1, r0)     // Catch: java.lang.Throwable -> L613
            goto L615
        L613:
            r0 = move-exception
            goto L63d
        L615:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L613
            r0.<init>()     // Catch: java.lang.Throwable -> L613
            java.lang.String r10 = "use provider wake up, state: true, is d config: "
            r0.append(r10)     // Catch: java.lang.Throwable -> L613
            r0.append(r11)     // Catch: java.lang.Throwable -> L613
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L613
            cn.jiguang.w.f.c(r8, r0)     // Catch: java.lang.Throwable -> L613
            goto L668
        L62a:
            r0 = move-exception
            r27 = r3
            goto L5bc
        L62e:
            r0 = move-exception
            r46 = r3
            r3 = r23
            r13 = r24
            goto L63d
        L636:
            r46 = r3
            r3 = r23
            r13 = r24
            goto L65a
        L63d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "getContentResolver throwable:"
            r10.append(r11)
            java.lang.String r0 = r0.getMessage()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            cn.jiguang.w.f.i(r8, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1341b
            r0.put(r3, r4)
        L65a:
            int r9 = r9 + 1
            r23 = r3
            r24 = r13
            r3 = r46
            goto L572
        L664:
            r3 = r23
            r13 = r24
        L668:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "wakeResult:"
            r0.append(r5)
            java.lang.String r5 = r2.toString()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r8, r0)
            r5 = r17
            r5.add(r2)
            r7 = r3
            r2 = r13
            r15 = r14
            r12 = r25
            r10 = r27
            r11 = r31
            r13 = r34
            r9 = r35
            r3 = r36
            r17 = 1
            r19 = 0
            r14 = r5
            r5 = r30
            goto L91
        L69e:
            r5 = r14
            return r5
        L6a0:
            java.lang.String r0 = "there are no wakeTarget"
            cn.jiguang.w.f.i(r8, r0)
            r19 = 0
            return r19
    }

    private java.util.List<cn.jiguang.n.c> a(java.util.HashMap<java.lang.String, cn.jiguang.n.c> r31, java.util.HashMap<java.lang.String, cn.jiguang.n.c> r32, boolean r33) {
            r30 = this;
            r1 = r30
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            cn.jiguang.n.a r0 = r1.f1326b
            java.util.Map<java.lang.String, cn.jiguang.n.d> r0 = r0.f1340k
            java.util.HashMap r0 = (java.util.HashMap) r0
            android.content.Context r5 = r1.a
            java.lang.String r6 = "JWake_account"
            long r5 = cn.jiguang.h.b.d(r5, r6)
            android.content.Context r7 = r1.a
            java.lang.String r8 = "JWake_activity"
            long r7 = cn.jiguang.h.b.d(r7, r8)
            android.content.Context r9 = r1.a
            java.lang.String r10 = "JWake_dactivity"
            long r9 = cn.jiguang.h.b.d(r9, r10)
            android.content.Context r11 = r1.a
            java.lang.String r12 = "JWakedservice"
            long r11 = cn.jiguang.h.b.d(r11, r12)
            android.content.Context r13 = r1.a
            java.lang.String r14 = "JWakedprovider"
            long r13 = cn.jiguang.h.b.d(r13, r14)
            android.content.Context r15 = r1.a
            r16 = r0
            java.lang.String r0 = "JWakeinstrument"
            r17 = r4
            long r3 = cn.jiguang.h.b.d(r15, r0)
            r18 = r3
            long r2 = java.lang.System.currentTimeMillis()
            long r20 = r2 - r5
            cn.jiguang.n.a r0 = r1.f1326b
            r22 = r13
            long r13 = r0.q
            int r24 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r24 < 0) goto L55
            r13 = 1
            goto L56
        L55:
            r13 = 0
        L56:
            long r20 = r2 - r7
            r24 = r5
            long r4 = r0.s
            int r14 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r14 < 0) goto L62
            r4 = 1
            goto L63
        L62:
            r4 = 0
        L63:
            long r20 = r2 - r11
            r26 = r7
            long r6 = r0.t
            int r8 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r8 < 0) goto L6f
            r7 = 1
            goto L70
        L6f:
            r7 = 0
        L70:
            long r20 = r2 - r22
            long r5 = r0.u
            int r14 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r14 < 0) goto L7a
            r5 = 1
            goto L7b
        L7a:
            r5 = 0
        L7b:
            long r20 = r2 - r18
            r28 = r9
            long r8 = r0.v
            int r10 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r10 < 0) goto L87
            r8 = 1
            goto L88
        L87:
            r8 = 0
        L88:
            long r9 = r2 - r28
            r14 = r7
            long r6 = r0.r
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 >= 0) goto L9e
            java.lang.String r0 = r1.f1327c
            java.lang.String r6 = "start"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L9c
            goto L9e
        L9c:
            r7 = 0
            goto L9f
        L9e:
            r7 = 1
        L9f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "currentTimeMillis:"
            r0.append(r6)
            r0.append(r2)
            java.lang.String r2 = ",lastAccountTime:"
            r0.append(r2)
            r2 = r24
            r0.append(r2)
            java.lang.String r2 = ",lastActivityTime:"
            r0.append(r2)
            r2 = r26
            r0.append(r2)
            java.lang.String r2 = ",lastDActivityTime:"
            r0.append(r2)
            r2 = r28
            r0.append(r2)
            java.lang.String r2 = ",lastDServiceTime:"
            r0.append(r2)
            r0.append(r11)
            java.lang.String r2 = ",lastDProviderTime: "
            r0.append(r2)
            r2 = r22
            r0.append(r2)
            java.lang.String r2 = ", lastInstrumentTime: "
            r0.append(r2)
            r2 = r18
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "JWake"
            cn.jiguang.w.f.c(r2, r0)
            if (r16 == 0) goto L327
            java.util.Set r0 = r16.entrySet()
            java.util.Iterator r3 = r0.iterator()
        Lf9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L327
            int r0 = r17.size()
            cn.jiguang.n.a r6 = r1.f1326b
            int r6 = r6.f1335f
            if (r0 >= r6) goto L327
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = r1.a(r9)
            if (r6 == 0) goto L11d
            goto Lf9
        L11d:
            android.content.Context r6 = r1.a
            boolean r6 = cn.jiguang.p.e.a(r6, r9)
            if (r6 == 0) goto L13f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "["
            r0.append(r6)
            r0.append(r9)
            java.lang.String r6 = "] is alive now."
        L134:
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r2, r0)
            goto Lf9
        L13f:
            java.lang.Object r0 = r0.getValue()
            r10 = r0
            cn.jiguang.n.d r10 = (cn.jiguang.n.d) r10
            int r0 = r10.a
            if (r0 != 0) goto L155
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r6 = " not need any method to wake, type is 0"
            goto L134
        L155:
            android.content.Context r0 = r1.a
            java.lang.String r6 = r10.f1357g
            boolean r0 = b(r0, r6)
            if (r0 == 0) goto L16a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r6 = " is alive"
            goto L134
        L16a:
            r11 = r31
            if (r31 == 0) goto L17b
            boolean r6 = r11.containsKey(r9)
            if (r6 == 0) goto L17b
            java.lang.Object r6 = r11.get(r9)
            cn.jiguang.n.c r6 = (cn.jiguang.n.c) r6
            goto L187
        L17b:
            boolean r6 = r10.f1354d
            if (r6 == 0) goto L186
            android.content.Context r6 = r1.a
            cn.jiguang.n.c r6 = cn.jiguang.p.c.a(r6, r9)
            goto L187
        L186:
            r6 = 0
        L187:
            if (r6 != 0) goto L19a
            if (r32 == 0) goto L19a
            r12 = r32
            boolean r16 = r12.containsKey(r9)
            if (r16 == 0) goto L19c
            java.lang.Object r6 = r12.get(r9)
            cn.jiguang.n.c r6 = (cn.jiguang.n.c) r6
            goto L19c
        L19a:
            r12 = r32
        L19c:
            if (r6 != 0) goto L1b4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r6 = " not found targetInfo"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.i(r2, r0)
            goto Lf9
        L1b4:
            java.lang.String r0 = r10.f1358h
            r6.l = r0
            int r0 = r10.a
            r6.f1347g = r0
            r18 = 1
            if (r33 != 0) goto L1c4
            int r15 = r10.f1359i
            r6.f1351k = r15
        L1c4:
            r0 = r0 & 2
            if (r0 == 0) goto L1d0
            if (r13 == 0) goto L1d0
            java.lang.String r0 = r10.f1355e
            r6.f1348h = r0
            r15 = 1
            goto L1d1
        L1d0:
            r15 = 0
        L1d1:
            if (r13 != 0) goto L1d8
            java.lang.String r0 = "not account time"
            cn.jiguang.w.f.c(r2, r0)
        L1d8:
            int r0 = r6.f1347g     // Catch: java.net.URISyntaxException -> L287
            r0 = r0 & 1
            if (r0 == 0) goto L290
            java.lang.String r0 = r10.f1356f     // Catch: java.net.URISyntaxException -> L287
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.net.URISyntaxException -> L287
            if (r0 == 0) goto L22c
            if (r7 == 0) goto L21d
            android.content.Intent r0 = new android.content.Intent     // Catch: java.net.URISyntaxException -> L219
            r0.<init>()     // Catch: java.net.URISyntaxException -> L219
            r19 = r3
            java.lang.String r3 = "cn.jpush.android.service.DActivity"
            r0.setClassName(r9, r3)     // Catch: java.net.URISyntaxException -> L215
            android.content.Intent r3 = new android.content.Intent     // Catch: java.net.URISyntaxException -> L215
            r3.<init>()     // Catch: java.net.URISyntaxException -> L215
            r21 = r4
            java.lang.String r4 = "cn.jpush.android.service.BActivity"
            r3.setClassName(r9, r4)     // Catch: java.net.URISyntaxException -> L20f
            r4 = 0
            boolean r16 = r1.a(r0, r9, r4)     // Catch: java.net.URISyntaxException -> L20f
            boolean r20 = r1.a(r3, r9, r4)     // Catch: java.net.URISyntaxException -> L20f
            r4 = r6
            r16 = r16 | r20
            r6 = r16
            goto L253
        L20f:
            r0 = move-exception
        L210:
            r4 = r6
        L211:
            r16 = r5
            goto L298
        L215:
            r0 = move-exception
        L216:
            r21 = r4
            goto L210
        L219:
            r0 = move-exception
            r19 = r3
            goto L216
        L21d:
            r19 = r3
            r21 = r4
            r4 = r6
            java.lang.String r0 = "not DActivity time"
            cn.jiguang.w.f.c(r2, r0)     // Catch: java.net.URISyntaxException -> L22a
            r3 = 1
            r6 = 0
            goto L251
        L22a:
            r0 = move-exception
            goto L211
        L22c:
            r19 = r3
            r21 = r4
            r4 = r6
            if (r21 == 0) goto L24a
            java.lang.String r0 = r10.f1356f     // Catch: java.net.URISyntaxException -> L246
            r6 = 0
            android.content.Intent r0 = a(r0, r6)     // Catch: java.net.URISyntaxException -> L243
            r3 = 1
            boolean r18 = r1.a(r0, r9, r3)     // Catch: java.net.URISyntaxException -> L22a
            r6 = r18
        L241:
            r3 = 0
            goto L253
        L243:
            r0 = move-exception
            r3 = 1
            goto L211
        L246:
            r0 = move-exception
            r3 = 1
            r6 = 0
            goto L211
        L24a:
            r3 = 1
            r6 = 0
            java.lang.String r0 = "not custom Activity time"
            cn.jiguang.w.f.c(r2, r0)     // Catch: java.net.URISyntaxException -> L22a
        L251:
            r0 = 0
            goto L241
        L253:
            if (r6 == 0) goto L266
            if (r0 != 0) goto L259
            if (r3 == 0) goto L266
        L259:
            if (r0 == 0) goto L260
            r4.f1345e = r0     // Catch: java.net.URISyntaxException -> L22a
            r4.f1346f = r3     // Catch: java.net.URISyntaxException -> L22a
            goto L262
        L260:
            r4.f1345e = r3     // Catch: java.net.URISyntaxException -> L22a
        L262:
            r16 = r5
            r15 = 1
            goto L2b4
        L266:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L22a
            r3.<init>()     // Catch: java.net.URISyntaxException -> L22a
            r16 = r5
            java.lang.String r5 = "do not use Activity wake , activityEnable = "
            r3.append(r5)     // Catch: java.net.URISyntaxException -> L285
            r3.append(r6)     // Catch: java.net.URISyntaxException -> L285
            java.lang.String r5 = ",  intent="
            r3.append(r5)     // Catch: java.net.URISyntaxException -> L285
            r3.append(r0)     // Catch: java.net.URISyntaxException -> L285
            java.lang.String r0 = r3.toString()     // Catch: java.net.URISyntaxException -> L285
            cn.jiguang.w.f.i(r2, r0)     // Catch: java.net.URISyntaxException -> L285
            goto L2b4
        L285:
            r0 = move-exception
            goto L298
        L287:
            r0 = move-exception
            r19 = r3
            r21 = r4
            r16 = r5
            r4 = r6
            goto L298
        L290:
            r19 = r3
            r21 = r4
            r16 = r5
            r4 = r6
            goto L2b4
        L298:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "parse package:"
            r3.append(r5)
            r3.append(r9)
            java.lang.String r5 = " activity intent error:"
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.w.f.l(r2, r0)
        L2b4:
            int r0 = r4.f1347g
            r0 = r0 & 4
            if (r0 == 0) goto L2ec
            java.lang.String r0 = r10.f1360j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d0
            if (r14 == 0) goto L2ca
            java.lang.String r0 = r10.f1360j
            r4.f1342b = r0
            r15 = 1
            goto L2d3
        L2ca:
            java.lang.String r0 = "not Service time"
        L2cc:
            cn.jiguang.w.f.c(r2, r0)
            goto L2d3
        L2d0:
            java.lang.String r0 = "Service name is empty"
            goto L2cc
        L2d3:
            java.lang.String r0 = r10.f1361k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2e9
            if (r16 == 0) goto L2e3
            java.lang.String r0 = r10.f1361k
            r4.f1344d = r0
            r15 = 1
            goto L2ec
        L2e3:
            java.lang.String r0 = "not Provider time"
        L2e5:
            cn.jiguang.w.f.c(r2, r0)
            goto L2ec
        L2e9:
            java.lang.String r0 = "Provider authority is empty"
            goto L2e5
        L2ec:
            int r0 = r4.f1347g
            r0 = r0 & 8
            if (r0 == 0) goto L316
            java.lang.String r0 = r10.l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L313
            if (r8 == 0) goto L310
            android.content.Context r0 = r1.a
            boolean r0 = cn.jiguang.p.e.b(r0, r9)
            if (r0 == 0) goto L30a
            java.lang.String r0 = r10.l
            r4.f1349i = r0
            r15 = 1
            goto L316
        L30a:
            java.lang.String r0 = "not instrumentation for forbidding"
        L30c:
            cn.jiguang.w.f.c(r2, r0)
            goto L316
        L310:
            java.lang.String r0 = "not instrumentation time"
            goto L30c
        L313:
            java.lang.String r0 = "Instrumentation name is empty"
            goto L30c
        L316:
            r3 = r17
            if (r15 == 0) goto L31d
            r3.add(r4)
        L31d:
            r17 = r3
            r5 = r16
            r3 = r19
            r4 = r21
            goto Lf9
        L327:
            r3 = r17
            return r3
    }

    public static void a(android.content.Context r3) {
            java.lang.String r0 = "JWake"
            boolean r1 = cn.jiguang.v.c.c()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            java.lang.String r3 = "is only JOperate sdk reConfig"
            cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r3 = move-exception
            goto L19
        L10:
            cn.jiguang.m.a$a r1 = new cn.jiguang.m.a$a     // Catch: java.lang.Throwable -> Le
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Le
            cn.jiguang.z.b.a(r1)     // Catch: java.lang.Throwable -> Le
            return
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[requestConfig failed] "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jiguang.w.f.i(r0, r3)
            return
    }

    private static void a(android.content.Context r4, cn.jiguang.n.a r5) {
            boolean r0 = r5.f1331b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r5.f1333d
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            boolean r3 = cn.jiguang.h.b.c(r4)
            if (r0 == 0) goto L16
            if (r3 == 0) goto L16
            r1 = 1
        L16:
            cn.jiguang.p.a.a(r4, r1)
            long r0 = r5.l
            cn.jiguang.m.c.a(r4, r0)
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "JWake"
            boolean r1 = cn.jiguang.v.c.c()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r3.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "[doAction ] "
            r3.append(r1)     // Catch: java.lang.Throwable -> L22
            r3.append(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = " : is only JOperate sdk"
            r3.append(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L22
            cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r3 = move-exception
            goto L2d
        L24:
            cn.jiguang.m.a r1 = new cn.jiguang.m.a     // Catch: java.lang.Throwable -> L22
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L22
            cn.jiguang.z.b.a(r1)     // Catch: java.lang.Throwable -> L22
            return
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[doAction failed] "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " :"
            r1.append(r4)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jiguang.w.f.i(r0, r3)
            return
    }

    static /* synthetic */ void a(cn.jiguang.m.a r0, boolean r1) {
            r0.a(r1)
            return
    }

    private void a(boolean r12) {
            r11 = this;
            cn.jiguang.n.a r0 = r11.f1326b
            long r7 = r0.l
            android.content.Context r0 = r11.a
            java.lang.String r1 = "JWakeConfigHelper"
            long r0 = cn.jiguang.h.b.d(r0, r1)
            cn.jiguang.m.a.f1325e = r0
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[refeshWakeConfig] currentTimeMillis:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ",lastBusinessTime:"
            r0.append(r1)
            long r1 = cn.jiguang.m.a.f1325e
            r0.append(r1)
            java.lang.String r1 = ",wakeConfigInterval:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JWake"
            cn.jiguang.w.f.c(r1, r0)
            long r5 = cn.jiguang.m.a.f1325e
            long r9 = r3 - r5
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto L64
            android.content.Context r1 = r11.a
            cn.jiguang.m.a$1 r10 = new cn.jiguang.m.a$1
            r10.<init>(r11)
            java.lang.String r9 = "wake"
            r2 = r12
            boolean r12 = cn.jiguang.v.l.b.a(r1, r2, r3, r5, r7, r9, r10)
            if (r12 == 0) goto L54
            return
        L54:
            android.content.Context r12 = r11.a
            cn.jiguang.n.a r12 = e(r12)
            if (r12 == 0) goto L5e
            r11.f1326b = r12
        L5e:
            android.content.Context r12 = r11.a
            cn.jiguang.m.c.a(r12)
            return
        L64:
            java.lang.String r12 = "need not get wake config"
            cn.jiguang.w.f.c(r1, r12)
            return
    }

    private static boolean a(android.content.Context r2, android.os.Bundle r3, android.content.Intent r4) {
            java.lang.String r0 = "JWake"
            if (r4 == 0) goto L3b
            r1 = 276824064(0x10800000, float:5.04871E-29)
            r4.addFlags(r1)     // Catch: java.lang.Throwable -> L34
            r4.putExtras(r3)     // Catch: java.lang.Throwable -> L34
            r2.startActivity(r4)     // Catch: java.lang.Throwable -> L34
            android.content.ComponentName r3 = r4.getComponent()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L39
            android.content.ComponentName r3 = r4.getComponent()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r3.getClassName()     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "cn.jpush.android.service.DActivity"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L36
            java.lang.String r4 = "cn.jpush.android.service.BActivity"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L2e
            goto L36
        L2e:
            java.lang.String r3 = "JWake_activity"
        L30:
            cn.jiguang.h.b.b(r2, r3)     // Catch: java.lang.Throwable -> L34
            goto L39
        L34:
            r2 = move-exception
            goto L41
        L36:
            java.lang.String r3 = "JWake_dactivity"
            goto L30
        L39:
            r2 = 1
            return r2
        L3b:
            java.lang.String r2 = "Fail to start activity ,activityIntent is null !!"
            cn.jiguang.w.f.i(r0, r2)     // Catch: java.lang.Throwable -> L34
            goto L55
        L41:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fail to start activity caused by:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.c(r0, r2)
        L55:
            r2 = 0
            return r2
    }

    private boolean a(android.content.Intent r2, java.lang.String r3, boolean r4) {
            r1 = this;
            android.content.Context r0 = r1.a
            boolean r2 = cn.jiguang.p.a.a(r0, r3, r2, r4)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    private boolean a(java.lang.String r5) {
            r4 = this;
            cn.jiguang.n.a r0 = r4.f1326b
            java.util.List<java.lang.String> r0 = r0.p
            r1 = 1
            java.lang.String r2 = "JWake"
            if (r0 == 0) goto L24
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " is in black list"
        L19:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            cn.jiguang.w.f.c(r2, r5)
            return r1
        L24:
            cn.jiguang.n.a r0 = r4.f1326b
            java.lang.String r0 = r0.n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L70
            cn.jiguang.n.a r0 = r4.f1326b
            java.lang.String r0 = r0.n
            java.lang.String r3 = "exclude"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4f
            cn.jiguang.n.a r0 = r4.f1326b
            java.util.List<java.lang.String> r0 = r0.o
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L70
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " is in excloude list"
            goto L19
        L4f:
            cn.jiguang.n.a r0 = r4.f1326b
            java.lang.String r0 = r0.n
            java.lang.String r3 = "include"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L70
            cn.jiguang.n.a r0 = r4.f1326b
            java.util.List<java.lang.String> r0 = r0.o
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L70
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " is not in include list"
            goto L19
        L70:
            r5 = 0
            return r5
    }

    private boolean a(java.util.List<java.lang.String> r9) {
            r8 = this;
            java.lang.String r0 = "JWake"
            r1 = 1
            if (r9 == 0) goto L84
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L49
            if (r2 <= 0) goto L84
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L49
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L84
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L49
            java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = r8.f1328d     // Catch: java.lang.Throwable -> L49
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L49
            r4 = 0
            java.lang.String r5 = "checkSafeStatus blackPkgName = "
            if (r3 == 0) goto L4c
            java.util.HashMap<java.lang.String, java.lang.Boolean> r9 = r8.f1328d     // Catch: java.lang.Throwable -> L49
            java.lang.Object r9 = r9.get(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L49
            if (r9 == 0) goto L4b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L49
            if (r9 == 0) goto L4b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r9.<init>()     // Catch: java.lang.Throwable -> L49
            r9.append(r5)     // Catch: java.lang.Throwable -> L49
            r9.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.w.f.c(r0, r9)     // Catch: java.lang.Throwable -> L49
            return r4
        L49:
            r9 = move-exception
            goto L70
        L4b:
            return r1
        L4c:
            android.content.Context r3 = r8.a     // Catch: java.lang.Throwable -> L49
            boolean r3 = cn.jiguang.av.a.e(r3, r2)     // Catch: java.lang.Throwable -> L49
            java.util.HashMap<java.lang.String, java.lang.Boolean> r6 = r8.f1328d     // Catch: java.lang.Throwable -> L49
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L49
            r6.put(r2, r7)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto Lf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r9.<init>()     // Catch: java.lang.Throwable -> L49
            r9.append(r5)     // Catch: java.lang.Throwable -> L49
            r9.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.w.f.c(r0, r9)     // Catch: java.lang.Throwable -> L49
            return r4
        L70:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkSafeStatus error:"
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            cn.jiguang.w.f.i(r0, r9)
        L84:
            return r1
    }

    public static java.lang.Integer b() {
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public static void b(android.content.Context r0) {
            a(r0)
            return
    }

    private static boolean b(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "content://"
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto La
            return r1
        La:
            boolean r2 = r6.startsWith(r0)     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r2.<init>()     // Catch: java.lang.Throwable -> L5a
            r2.append(r0)     // Catch: java.lang.Throwable -> L5a
            r2.append(r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L5a
        L1f:
            android.net.Uri r0 = android.net.Uri.parse(r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "JWake"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r3.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = " provider: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5a
            r3.append(r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = ", uri: "
            r3.append(r6)     // Catch: java.lang.Throwable -> L5a
            r3.append(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L5a
            cn.jiguang.w.f.c(r2, r6)     // Catch: java.lang.Throwable -> L5a
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L5a
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L5a
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L5a
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            android.net.Uri r5 = r5.insert(r0, r6)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L5a
            r5 = 1
            return r5
        L5a:
            return r1
    }

    public static java.lang.Object c(android.content.Context r2) {
            boolean r2 = cn.jiguang.h.b.c(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isActionUserEnable :"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JWake"
            cn.jiguang.w.f.c(r1, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    private boolean c() {
            r3 = this;
            android.content.Context r0 = r3.a
            boolean r0 = cn.jiguang.h.b.c(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isActionUserEnable :"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JWake"
            cn.jiguang.w.f.c(r2, r1)
            return r0
    }

    static /* synthetic */ cn.jiguang.n.a d(android.content.Context r0) {
            cn.jiguang.n.a r0 = e(r0)
            return r0
    }

    @android.annotation.TargetApi(15)
    private java.util.List<cn.jiguang.n.c> d() {
            r3 = this;
            android.content.Context r0 = r3.a
            java.util.HashMap r0 = cn.jiguang.p.c.a(r0)
            android.content.Context r1 = r3.a
            java.util.HashMap r1 = cn.jiguang.p.c.a(r1, r0)
            r2 = 0
            java.util.List r0 = r3.a(r0, r1, r2)
            return r0
    }

    private static cn.jiguang.n.a e(android.content.Context r2) {
            org.json.JSONObject r0 = cn.jiguang.p.b.a(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L31
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = cn.jiguang.av.x.b(r1)     // Catch: java.lang.Throwable -> L16
            cn.jiguang.p.b.a(r2, r1)     // Catch: java.lang.Throwable -> L16
            cn.jiguang.n.a r2 = cn.jiguang.p.b.a(r2, r0)     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[requestConfigNow] failed:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "JWake"
            cn.jiguang.w.f.i(r0, r2)
        L31:
            r2 = 0
            return r2
    }

    @Override // cn.jiguang.au.b
    public void a() {
            r10 = this;
            java.lang.String r0 = "JWake"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "wake with:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r10.f1327c     // Catch: java.lang.Throwable -> L27
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L27
            android.content.Context r1 = r10.a     // Catch: java.lang.Throwable -> L27
            boolean r1 = cn.jiguang.d.b.a(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L2a
            java.lang.String r1 = "can't w because not r yet"
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r1 = move-exception
            goto L104
        L2a:
            android.content.Context r1 = r10.a     // Catch: java.lang.Throwable -> L27
            cn.jiguang.n.a r1 = cn.jiguang.p.b.b(r1)     // Catch: java.lang.Throwable -> L27
            r10.f1326b = r1     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r10.a(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "use config:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.n.a r2 = r10.f1326b     // Catch: java.lang.Throwable -> L27
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L27
            android.content.Context r1 = r10.a     // Catch: java.lang.Throwable -> L27
            cn.jiguang.n.a r2 = r10.f1326b     // Catch: java.lang.Throwable -> L27
            a(r1, r2)     // Catch: java.lang.Throwable -> L27
            boolean r1 = r10.c()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L5e
            java.lang.String r1 = "wake is disabled by user"
            goto Lfc
        L5e:
            cn.jiguang.n.a r1 = r10.f1326b     // Catch: java.lang.Throwable -> L27
            boolean r2 = r1.a     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L100
            boolean r2 = r1.f1332c     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L6a
            goto L100
        L6a:
            int r2 = r1.y     // Catch: java.lang.Throwable -> L27
            r3 = 15
            if (r2 != r3) goto L74
            java.lang.String r1 = "all wakeup type is unsupported of app, not wakeup any package"
            goto Lfc
        L74:
            boolean r1 = r1.f1338i     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "wake is disabled by unsafe package"
            if (r1 == 0) goto La2
            java.lang.String r1 = r10.f1327c     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "start"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto La2
            cn.jiguang.n.a r1 = r10.f1326b     // Catch: java.lang.Throwable -> L27
            java.util.List<java.lang.String> r1 = r1.z     // Catch: java.lang.Throwable -> L27
            boolean r1 = r10.a(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L93
        L8f:
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L27
            return
        L93:
            java.util.List r1 = r10.d()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.p.f r2 = cn.jiguang.p.f.a()     // Catch: java.lang.Throwable -> L27
            android.content.Context r3 = r10.a     // Catch: java.lang.Throwable -> L27
            goto Lf7
        L9e:
            r2.a(r3, r4, r1)     // Catch: java.lang.Throwable -> L27
            return
        La2:
            cn.jiguang.n.a r1 = r10.f1326b     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.f1337h     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto Lab
            java.lang.String r1 = "time disabled"
            goto Lfc
        Lab:
            android.content.Context r1 = r10.a     // Catch: java.lang.Throwable -> L27
            long r3 = cn.jiguang.h.b.d(r1, r0)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.n.a r1 = r10.f1326b     // Catch: java.lang.Throwable -> L27
            long r5 = r1.f1336g     // Catch: java.lang.Throwable -> L27
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r9 = "[wakeUp]currentTimeMillis:"
            r1.append(r9)     // Catch: java.lang.Throwable -> L27
            r1.append(r7)     // Catch: java.lang.Throwable -> L27
            java.lang.String r9 = ",lastBusinessTime:"
            r1.append(r9)     // Catch: java.lang.Throwable -> L27
            r1.append(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r9 = ",wakeInterval:"
            r1.append(r9)     // Catch: java.lang.Throwable -> L27
            r1.append(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L27
            long r7 = r7 - r3
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto Lfa
            cn.jiguang.n.a r1 = r10.f1326b     // Catch: java.lang.Throwable -> L27
            java.util.List<java.lang.String> r1 = r1.z     // Catch: java.lang.Throwable -> L27
            boolean r1 = r10.a(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto Led
            goto L8f
        Led:
            java.util.List r1 = r10.d()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.p.f r2 = cn.jiguang.p.f.a()     // Catch: java.lang.Throwable -> L27
            android.content.Context r3 = r10.a     // Catch: java.lang.Throwable -> L27
        Lf7:
            cn.jiguang.n.a r4 = r10.f1326b     // Catch: java.lang.Throwable -> L27
            goto L9e
        Lfa:
            java.lang.String r1 = "need not wake up"
        Lfc:
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L27
            return
        L100:
            java.lang.String r1 = "wake is disabled by server"
            goto Lfc
        L104:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "wake failed:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r0, r1)
            return
    }
}
