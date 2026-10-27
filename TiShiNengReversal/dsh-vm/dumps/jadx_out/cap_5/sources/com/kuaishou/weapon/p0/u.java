package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class u implements java.lang.Runnable {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 0;
    public static final int e = 8;
    public static final int f = 1;
    public static final int g = 3;
    public static final int h = 4;
    private static long o;
    java.util.List<java.lang.Integer> i;
    private android.content.Context j;
    private com.kuaishou.weapon.p0.q k;
    private com.kuaishou.weapon.p0.t l;
    private java.io.File m;
    private com.kuaishou.weapon.p0.dp n;
    private int p;
    private int q;
    private boolean r;
    private java.util.Map<java.lang.Integer, com.kuaishou.weapon.p0.u.a> s;

    class a {
        int a;
        final /* synthetic */ com.kuaishou.weapon.p0.u b;

        public a(com.kuaishou.weapon.p0.u r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }
    }

    static {
            return
    }

    public u(android.content.Context r3, int r4, boolean r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.p = r0
            r2.q = r0
            r2.r = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.s = r0
            r2.j = r3
            com.kuaishou.weapon.p0.q r0 = com.kuaishou.weapon.p0.q.a(r3)
            r2.k = r0
            com.kuaishou.weapon.p0.t r0 = com.kuaishou.weapon.p0.t.a(r3)
            r2.l = r0
            com.kuaishou.weapon.p0.dp r0 = com.kuaishou.weapon.p0.dp.a(r3)
            r2.n = r0
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r1 = ".tmp"
            r0.<init>(r3, r1)
            r2.m = r0
            r2.p = r4
            r2.r = r5
            return
    }

    private void a(com.kuaishou.weapon.p0.s r9) {
            r8 = this;
            java.lang.String r0 = "-"
            r1 = 0
            java.lang.String r2 = r9.j     // Catch: java.lang.Throwable -> L16c
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L16c
            if (r2 != 0) goto L162
            java.lang.String r2 = r9.j     // Catch: java.lang.Throwable -> L16c
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L16c
            r3 = 10
            if (r2 >= r3) goto L17
            goto L162
        L17:
            java.io.File r2 = r8.m     // Catch: java.lang.Throwable -> L16c
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> L16c
            if (r2 != 0) goto L24
            java.io.File r2 = r8.m     // Catch: java.lang.Throwable -> L16c
            r2.mkdir()     // Catch: java.lang.Throwable -> L16c
        L24:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L16c
            java.io.File r3 = r8.m     // Catch: java.lang.Throwable -> L16c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16c
            r4.<init>()     // Catch: java.lang.Throwable -> L16c
            int r5 = r9.a     // Catch: java.lang.Throwable -> L16c
            r4.append(r5)     // Catch: java.lang.Throwable -> L16c
            r4.append(r0)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r5 = r9.d     // Catch: java.lang.Throwable -> L16c
            r4.append(r5)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r5 = ".tmp"
            r4.append(r5)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L16c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16c
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L16c
            java.io.File r4 = r8.m     // Catch: java.lang.Throwable -> L16c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16c
            r5.<init>()     // Catch: java.lang.Throwable -> L16c
            int r6 = r9.a     // Catch: java.lang.Throwable -> L16c
            r5.append(r6)     // Catch: java.lang.Throwable -> L16c
            r5.append(r0)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r0 = r9.d     // Catch: java.lang.Throwable -> L16c
            r5.append(r0)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r0 = ".zip"
            r5.append(r0)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L16c
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L16c
            android.content.Context r0 = r8.j     // Catch: java.lang.Throwable -> L16c
            com.kuaishou.weapon.p0.l r0 = com.kuaishou.weapon.p0.l.a(r0)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r4 = r9.i     // Catch: java.lang.Throwable -> L16c
            boolean r0 = r0.a(r4, r2)     // Catch: java.lang.Throwable -> L16c
            if (r0 != 0) goto L82
            android.content.Context r0 = r8.j     // Catch: java.lang.Throwable -> L16c
            com.kuaishou.weapon.p0.l r0 = com.kuaishou.weapon.p0.l.a(r0)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r4 = r9.i     // Catch: java.lang.Throwable -> L16c
            boolean r0 = r0.a(r4, r2)     // Catch: java.lang.Throwable -> L16c
        L82:
            if (r0 == 0) goto Lbe
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L16c
            if (r4 == 0) goto L8d
            r3.delete()     // Catch: java.lang.Throwable -> L16c
        L8d:
            java.lang.String r4 = "a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M="
            java.lang.String r5 = "utf-8"
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> L16c
            r5 = 2
            byte[] r4 = com.kuaishou.weapon.p0.c.a(r4, r5)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r5 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r6 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L16c
            int r4 = com.kuaishou.weapon.p0.b.c(r5, r6, r4)     // Catch: java.lang.Throwable -> L16c
            if (r4 == 0) goto Lb2
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L16c
            if (r0 == 0) goto Lb1
            r3.delete()     // Catch: java.lang.Throwable -> L16c
        Lb1:
            r0 = 0
        Lb2:
            if (r4 != 0) goto Lcf
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> L16c
            if (r4 == 0) goto Lcf
            r2.delete()     // Catch: java.lang.Throwable -> L16c
            goto Lcf
        Lbe:
            java.util.Map<java.lang.Integer, com.kuaishou.weapon.p0.u$a> r4 = r8.s     // Catch: java.lang.Throwable -> L16c
            int r5 = r9.a     // Catch: java.lang.Throwable -> L16c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L16c
            com.kuaishou.weapon.p0.u$a r6 = new com.kuaishou.weapon.p0.u$a     // Catch: java.lang.Throwable -> L16c
            r7 = 3
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L16c
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L16c
        Lcf:
            java.lang.String r4 = com.kuaishou.weapon.p0.f.a(r3)     // Catch: java.lang.Throwable -> L16c
            if (r0 == 0) goto L14c
            java.lang.String r0 = r9.j     // Catch: java.lang.Throwable -> L16c
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L16c
            if (r0 == 0) goto L14c
            java.lang.String r0 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L16c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L16c
            com.kuaishou.weapon.p0.dn.a(r0, r2)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r0 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L16c
            r9.e = r0     // Catch: java.lang.Throwable -> L16c
            com.kuaishou.weapon.p0.q r0 = r8.k     // Catch: java.lang.Throwable -> L16c
            boolean r0 = r0.a(r9, r1, r1)     // Catch: java.lang.Throwable -> L16c
            if (r0 == 0) goto L121
            java.util.Map<java.lang.Integer, com.kuaishou.weapon.p0.u$a> r0 = r8.s     // Catch: java.lang.Throwable -> L16c
            r2 = 1
            if (r0 == 0) goto L115
            int r3 = r9.a     // Catch: java.lang.Throwable -> L16c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16c
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L16c
            if (r0 != 0) goto L115
            java.util.Map<java.lang.Integer, com.kuaishou.weapon.p0.u$a> r0 = r8.s     // Catch: java.lang.Throwable -> L16c
            int r3 = r9.a     // Catch: java.lang.Throwable -> L16c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16c
            com.kuaishou.weapon.p0.u$a r4 = new com.kuaishou.weapon.p0.u$a     // Catch: java.lang.Throwable -> L16c
            r4.<init>(r8, r2)     // Catch: java.lang.Throwable -> L16c
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L16c
        L115:
            com.kuaishou.weapon.p0.dp r0 = r8.n     // Catch: java.lang.Throwable -> L16c
            java.lang.String r3 = "wlpauct2"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L16c
            r0.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L16c
            return
        L121:
            java.util.Map<java.lang.Integer, com.kuaishou.weapon.p0.u$a> r0 = r8.s     // Catch: java.lang.Throwable -> L16c
            if (r0 == 0) goto L142
            int r2 = r9.a     // Catch: java.lang.Throwable -> L16c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L16c
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L16c
            if (r0 != 0) goto L142
            java.util.Map<java.lang.Integer, com.kuaishou.weapon.p0.u$a> r0 = r8.s     // Catch: java.lang.Throwable -> L16c
            int r2 = r9.a     // Catch: java.lang.Throwable -> L16c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L16c
            com.kuaishou.weapon.p0.u$a r3 = new com.kuaishou.weapon.p0.u$a     // Catch: java.lang.Throwable -> L16c
            r4 = 4
            r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L16c
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L16c
        L142:
            com.kuaishou.weapon.p0.q r0 = r8.k     // Catch: java.lang.Throwable -> L16c
            int r2 = r9.a     // Catch: java.lang.Throwable -> L16c
            java.lang.String r3 = r9.d     // Catch: java.lang.Throwable -> L16c
            r0.a(r2, r3, r1)     // Catch: java.lang.Throwable -> L16c
            return
        L14c:
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L16c
            if (r0 == 0) goto L158
            r2.length()     // Catch: java.lang.Throwable -> L16c
            r2.delete()     // Catch: java.lang.Throwable -> L16c
        L158:
            com.kuaishou.weapon.p0.q r0 = r8.k     // Catch: java.lang.Throwable -> L16c
            int r2 = r9.a     // Catch: java.lang.Throwable -> L16c
            java.lang.String r3 = r9.d     // Catch: java.lang.Throwable -> L16c
            r0.a(r2, r3, r1)     // Catch: java.lang.Throwable -> L16c
            return
        L162:
            com.kuaishou.weapon.p0.q r0 = r8.k     // Catch: java.lang.Throwable -> L16c
            int r2 = r9.a     // Catch: java.lang.Throwable -> L16c
            java.lang.String r3 = r9.d     // Catch: java.lang.Throwable -> L16c
            r0.a(r2, r3, r1)     // Catch: java.lang.Throwable -> L16c
            return
        L16c:
            com.kuaishou.weapon.p0.q r0 = r8.k
            int r2 = r9.a
            java.lang.String r9 = r9.d
            r0.a(r2, r9, r1)
            return
    }

    public org.json.JSONObject a() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld3
            r0.<init>()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = com.kuaishou.weapon.p0.cu.a     // Catch: java.lang.Exception -> Ld3
            r0.append(r1)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = com.kuaishou.weapon.p0.cu.g     // Catch: java.lang.Exception -> Ld3
            r0.append(r1)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Ld3
            android.content.Context r1 = r6.j     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = com.kuaishou.weapon.p0.cv.a(r1)     // Catch: java.lang.Exception -> Ld3
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Ld3
            if (r2 != 0) goto L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld3
            r2.<init>()     // Catch: java.lang.Exception -> Ld3
            r2.append(r0)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "?"
            r2.append(r0)     // Catch: java.lang.Exception -> Ld3
            r2.append(r1)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Ld3
        L33:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld3
            r1.<init>()     // Catch: java.lang.Exception -> Ld3
            android.content.Context r2 = r6.j     // Catch: java.lang.Exception -> Ld3
            org.json.JSONObject r2 = com.kuaishou.weapon.p0.cv.c(r2)     // Catch: java.lang.Exception -> Ld3
            if (r2 == 0) goto L54
            com.kuaishou.weapon.p0.bn r3 = new com.kuaishou.weapon.p0.bn     // Catch: java.lang.Exception -> Ld3
            android.content.Context r4 = r6.j     // Catch: java.lang.Exception -> Ld3
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r2 = r3.c(r2)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r3 = "data"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> Ld3
        L54:
            android.content.Context r2 = r6.j     // Catch: java.lang.Exception -> Ld3
            com.kuaishou.weapon.p0.l r2 = com.kuaishou.weapon.p0.l.a(r2)     // Catch: java.lang.Exception -> Ld3
            com.kuaishou.weapon.p0.m r3 = new com.kuaishou.weapon.p0.m     // Catch: java.lang.Exception -> Ld3
            r3.<init>(r0, r1)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = com.kuaishou.weapon.p0.WeaponHI.cookieData     // Catch: java.lang.Exception -> Ld3
            r3.a(r0)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = com.kuaishou.weapon.p0.WeaponHI.encryENV     // Catch: java.lang.Exception -> Ld3
            r3.b(r0)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = r2.a(r3)     // Catch: java.lang.Exception -> Ld3
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld3
            r1.<init>(r0)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "result"
            r2 = 0
            int r0 = r1.optInt(r0, r2)     // Catch: java.lang.Exception -> Ld3
            r3 = 1
            if (r0 != r3) goto Lc5
            java.lang.String r0 = "antispamPluginManageRsp"
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> Ld3
            com.kuaishou.weapon.p0.bn r1 = new com.kuaishou.weapon.p0.bn     // Catch: java.lang.Exception -> Ld3
            android.content.Context r4 = r6.j     // Catch: java.lang.Exception -> Ld3
            r1.<init>(r4)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = r1.a(r0)     // Catch: java.lang.Exception -> Ld3
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Ld3
            if (r1 == 0) goto La3
            int r0 = r6.q     // Catch: java.lang.Exception -> Ld3
            if (r0 != 0) goto L9b
            r0 = 8
            r6.q = r0     // Catch: java.lang.Exception -> Ld3
        L9b:
            android.accounts.NetworkErrorException r0 = new android.accounts.NetworkErrorException     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = "kuaishou risk pluginloader response is null"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Ld3
            throw r0     // Catch: java.lang.Exception -> Ld3
        La3:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld3
            r1.<init>(r0)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "status"
            int r0 = r1.optInt(r0, r2)     // Catch: java.lang.Exception -> Ld3
            if (r0 != r3) goto Lb7
            java.lang.String r0 = "plugin"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Exception -> Ld3
            return r0
        Lb7:
            com.kuaishou.weapon.p0.dp r0 = r6.n     // Catch: java.lang.Exception -> Ld3
            if (r0 == 0) goto Ld3
            java.lang.String r1 = "wlpauct2"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Ld3
            r0.a(r1, r4, r3)     // Catch: java.lang.Exception -> Ld3
            goto Ld3
        Lc5:
            r1 = -7
            if (r0 != r1) goto Ld3
            android.content.Context r0 = r6.j     // Catch: java.lang.Exception -> Ld3
            com.kuaishou.weapon.p0.dp r0 = com.kuaishou.weapon.p0.dp.a(r0)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = "plc001_t_re"
            r0.a(r1, r3, r2)     // Catch: java.lang.Exception -> Ld3
        Ld3:
            r0 = 0
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r18 = this;
            r1 = r18
            java.lang.Class<com.kuaishou.weapon.p0.u> r2 = com.kuaishou.weapon.p0.u.class
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L31a
            int r0 = r1.p     // Catch: java.lang.Throwable -> L27
            r3 = 1
            if (r0 == r3) goto L2a
            r4 = 2
            if (r0 == r4) goto L2a
            r4 = 4
            if (r0 == r4) goto L2a
            boolean r0 = r1.r     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L2a
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L27
            long r6 = com.kuaishou.weapon.p0.u.o     // Catch: java.lang.Throwable -> L27
            long r4 = r4 - r6
            r6 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L2a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.WeaponHI.iD()
            return
        L27:
            r0 = move-exception
            goto L318
        L2a:
            com.kuaishou.weapon.p0.t r0 = r1.l     // Catch: java.lang.Throwable -> L27
            r0.d()     // Catch: java.lang.Throwable -> L27
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.u.o = r4     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.dp r0 = r1.n     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "wlpauct2"
            long r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L27
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L27
            long r6 = r6 - r4
            com.kuaishou.weapon.p0.dp r0 = r1.n     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "plc001_pd_ptip_pi"
            r5 = 6
            int r0 = r0.a(r4, r5)     // Catch: java.lang.Throwable -> L27
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L27
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 * r8
            long r6 = r6 - r4
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L309
            com.kuaishou.weapon.p0.t r0 = r1.l     // Catch: java.lang.Throwable -> L27
            java.util.List r0 = r0.a()     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r4.<init>()     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r5.<init>()     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r6.<init>()     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r7.<init>()     // Catch: java.lang.Throwable -> L27
            org.json.JSONObject r8 = r1.a()     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L301
            r9 = 0
            android.content.Context r10 = r1.j     // Catch: java.lang.Throwable -> L19e
            boolean r10 = com.kuaishou.weapon.p0.dm.b(r10)     // Catch: java.lang.Throwable -> L19e
            java.util.Iterator r11 = r8.keys()     // Catch: java.lang.Throwable -> L19e
            java.util.HashSet r12 = new java.util.HashSet     // Catch: java.lang.Throwable -> L19e
            r12.<init>()     // Catch: java.lang.Throwable -> L19e
            r13 = 0
        L89:
            boolean r14 = r11.hasNext()     // Catch: java.lang.Throwable -> L19e
            if (r14 == 0) goto L187
            java.lang.Object r14 = r11.next()     // Catch: java.lang.Throwable -> L19e
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L19e
            r15 = 3
            if (r10 == 0) goto Ld5
            java.lang.String r3 = "64"
            boolean r3 = r14.endsWith(r3)     // Catch: java.lang.Throwable -> L19e
            if (r3 == 0) goto Ld5
            int r3 = r14.length()     // Catch: java.lang.Throwable -> L19e
            if (r3 <= r15) goto Ld2
            int r3 = r14.length()     // Catch: java.lang.Throwable -> L19e
            int r3 = r3 - r15
            java.lang.String r3 = r14.substring(r9, r3)     // Catch: java.lang.Throwable -> L19e
            r12.add(r3)     // Catch: java.lang.Throwable -> L19e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19e
            r3.<init>()     // Catch: java.lang.Throwable -> L19e
            int r13 = r14.length()     // Catch: java.lang.Throwable -> L19e
            int r13 = r13 - r15
            java.lang.String r13 = r14.substring(r9, r13)     // Catch: java.lang.Throwable -> L19e
            r3.append(r13)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r13 = ".32"
            r3.append(r13)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L19e
            r12.add(r3)     // Catch: java.lang.Throwable -> L19e
        Lcf:
            r3 = 1
            r13 = 1
            goto L89
        Ld2:
            r13 = 1
            goto L184
        Ld5:
            if (r10 != 0) goto L10f
            java.lang.String r3 = "32"
            boolean r3 = r14.endsWith(r3)     // Catch: java.lang.Throwable -> L19e
            if (r3 == 0) goto L10f
            int r3 = r14.length()     // Catch: java.lang.Throwable -> L19e
            if (r3 <= r15) goto Ld2
            int r3 = r14.length()     // Catch: java.lang.Throwable -> L19e
            int r3 = r3 - r15
            java.lang.String r3 = r14.substring(r9, r3)     // Catch: java.lang.Throwable -> L19e
            r12.add(r3)     // Catch: java.lang.Throwable -> L19e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19e
            r3.<init>()     // Catch: java.lang.Throwable -> L19e
            int r13 = r14.length()     // Catch: java.lang.Throwable -> L19e
            int r13 = r13 - r15
            java.lang.String r13 = r14.substring(r9, r13)     // Catch: java.lang.Throwable -> L19e
            r3.append(r13)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r13 = ".64"
            r3.append(r13)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L19e
            r12.add(r3)     // Catch: java.lang.Throwable -> L19e
            goto Lcf
        L10f:
            if (r10 == 0) goto L149
            java.lang.String r3 = "v8"
            boolean r3 = r14.endsWith(r3)     // Catch: java.lang.Throwable -> L19e
            if (r3 == 0) goto L149
            int r3 = r14.length()     // Catch: java.lang.Throwable -> L19e
            if (r3 <= r15) goto Ld2
            int r3 = r14.length()     // Catch: java.lang.Throwable -> L19e
            int r3 = r3 - r15
            java.lang.String r3 = r14.substring(r9, r3)     // Catch: java.lang.Throwable -> L19e
            r12.add(r3)     // Catch: java.lang.Throwable -> L19e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19e
            r3.<init>()     // Catch: java.lang.Throwable -> L19e
            int r13 = r14.length()     // Catch: java.lang.Throwable -> L19e
            int r13 = r13 - r15
            java.lang.String r13 = r14.substring(r9, r13)     // Catch: java.lang.Throwable -> L19e
            r3.append(r13)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r13 = ".v7"
            r3.append(r13)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L19e
            r12.add(r3)     // Catch: java.lang.Throwable -> L19e
            goto Lcf
        L149:
            if (r10 != 0) goto L184
            java.lang.String r3 = "v7"
            boolean r3 = r14.endsWith(r3)     // Catch: java.lang.Throwable -> L19e
            if (r3 == 0) goto L184
            int r3 = r14.length()     // Catch: java.lang.Throwable -> L19e
            if (r3 <= r15) goto Ld2
            int r3 = r14.length()     // Catch: java.lang.Throwable -> L19e
            int r3 = r3 - r15
            java.lang.String r3 = r14.substring(r9, r3)     // Catch: java.lang.Throwable -> L19e
            r12.add(r3)     // Catch: java.lang.Throwable -> L19e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19e
            r3.<init>()     // Catch: java.lang.Throwable -> L19e
            int r13 = r14.length()     // Catch: java.lang.Throwable -> L19e
            int r13 = r13 - r15
            java.lang.String r13 = r14.substring(r9, r13)     // Catch: java.lang.Throwable -> L19e
            r3.append(r13)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r13 = ".v8"
            r3.append(r13)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L19e
            r12.add(r3)     // Catch: java.lang.Throwable -> L19e
            goto Ld2
        L184:
            r3 = 1
            goto L89
        L187:
            if (r13 == 0) goto L19d
            java.util.Iterator r3 = r12.iterator()     // Catch: java.lang.Throwable -> L19e
        L18d:
            boolean r10 = r3.hasNext()     // Catch: java.lang.Throwable -> L19e
            if (r10 == 0) goto L19d
            java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L19e
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L19e
            r8.remove(r10)     // Catch: java.lang.Throwable -> L19e
            goto L18d
        L19d:
            r9 = r13
        L19e:
            java.util.Iterator r3 = r8.keys()     // Catch: java.lang.Throwable -> L27
        L1a2:
            boolean r10 = r3.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r10 == 0) goto L263
            java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L27
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L27
            org.json.JSONObject r11 = r8.optJSONObject(r10)     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.s r11 = com.kuaishou.weapon.p0.o.a(r11)     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto L1a2
            if (r9 == 0) goto L1e1
            boolean r12 = r11.y     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L1e1
            java.lang.String r12 = "32"
            boolean r12 = r10.endsWith(r12)     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L1de
            java.lang.String r12 = "64"
            boolean r12 = r10.endsWith(r12)     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L1de
            java.lang.String r12 = "v7"
            boolean r12 = r10.endsWith(r12)     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L1de
            java.lang.String r12 = "v8"
            boolean r12 = r10.endsWith(r12)     // Catch: java.lang.Throwable -> L27
            if (r12 == 0) goto L1e1
        L1de:
            r12 = 1
            r11.y = r12     // Catch: java.lang.Throwable -> L27
        L1e1:
            boolean r12 = r11.v     // Catch: java.lang.Throwable -> L27
            if (r12 == 0) goto L1e8
            r7.add(r10)     // Catch: java.lang.Throwable -> L27
        L1e8:
            boolean r10 = r11.y     // Catch: java.lang.Throwable -> L27
            if (r10 != 0) goto L1ef
            r6.add(r11)     // Catch: java.lang.Throwable -> L27
        L1ef:
            int r10 = r0.indexOf(r11)     // Catch: java.lang.Throwable -> L27
            if (r10 < 0) goto L255
            boolean r12 = r11.y     // Catch: java.lang.Throwable -> L27
            if (r12 == 0) goto L255
            java.lang.Object r12 = r0.get(r10)     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.s r12 = (com.kuaishou.weapon.p0.s) r12     // Catch: java.lang.Throwable -> L27
            java.lang.String r13 = r11.d     // Catch: java.lang.Throwable -> L27
            java.lang.String r14 = r12.d     // Catch: java.lang.Throwable -> L27
            boolean r13 = com.kuaishou.weapon.p0.dn.b(r13, r14)     // Catch: java.lang.Throwable -> L27
            if (r13 == 0) goto L22a
            int r13 = r11.x     // Catch: java.lang.Throwable -> L27
            int r12 = r12.x     // Catch: java.lang.Throwable -> L27
            if (r13 == r12) goto L216
            com.kuaishou.weapon.p0.t r12 = r1.l     // Catch: java.lang.Throwable -> L27
            int r14 = r11.a     // Catch: java.lang.Throwable -> L27
            r12.c(r14, r13)     // Catch: java.lang.Throwable -> L27
        L216:
            com.kuaishou.weapon.p0.t r12 = r1.l     // Catch: java.lang.Throwable -> L27
            int r13 = r11.a     // Catch: java.lang.Throwable -> L27
            boolean r12 = r12.d(r13)     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L223
            r5.add(r11)     // Catch: java.lang.Throwable -> L27
        L223:
            r17 = r3
            r15 = r8
            r16 = r9
            r3 = 1
            goto L24b
        L22a:
            com.kuaishou.weapon.p0.dp r13 = r1.n     // Catch: java.lang.Throwable -> L27
            java.lang.String r14 = "wlpauct2"
            r15 = r8
            r16 = r9
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L27
            r17 = r3
            r3 = 1
            r13.a(r14, r8, r3)     // Catch: java.lang.Throwable -> L27
            int r8 = r11.x     // Catch: java.lang.Throwable -> L27
            int r9 = r12.x     // Catch: java.lang.Throwable -> L27
            if (r8 == r9) goto L248
            com.kuaishou.weapon.p0.t r9 = r1.l     // Catch: java.lang.Throwable -> L27
            int r12 = r11.a     // Catch: java.lang.Throwable -> L27
            r9.c(r12, r8)     // Catch: java.lang.Throwable -> L27
        L248:
            r4.add(r11)     // Catch: java.lang.Throwable -> L27
        L24b:
            r0.remove(r10)     // Catch: java.lang.Throwable -> L27
        L24e:
            r8 = r15
            r9 = r16
            r3 = r17
            goto L1a2
        L255:
            r17 = r3
            r15 = r8
            r16 = r9
            r3 = 1
            boolean r8 = r11.y     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L24e
            r5.add(r11)     // Catch: java.lang.Throwable -> L27
            goto L24e
        L263:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L27
        L267:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L290
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.s r3 = (com.kuaishou.weapon.p0.s) r3     // Catch: java.lang.Throwable -> L27
            java.lang.String r8 = r3.c     // Catch: java.lang.Throwable -> L27
            boolean r8 = r7.contains(r8)     // Catch: java.lang.Throwable -> L27
            if (r8 != 0) goto L267
            java.util.List<java.lang.Integer> r8 = r1.i     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L288
            int r9 = r3.a     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L27
            r8.add(r9)     // Catch: java.lang.Throwable -> L27
        L288:
            com.kuaishou.weapon.p0.q r8 = r1.k     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r3.c     // Catch: java.lang.Throwable -> L27
            r8.a(r3)     // Catch: java.lang.Throwable -> L27
            goto L267
        L290:
            java.util.Iterator r0 = r6.iterator()     // Catch: java.lang.Throwable -> L27
        L294:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L2bd
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.s r3 = (com.kuaishou.weapon.p0.s) r3     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r3.c     // Catch: java.lang.Throwable -> L27
            boolean r6 = r7.contains(r6)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L294
            java.util.List<java.lang.Integer> r6 = r1.i     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L2b5
            int r8 = r3.a     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L27
            r6.add(r8)     // Catch: java.lang.Throwable -> L27
        L2b5:
            com.kuaishou.weapon.p0.q r6 = r1.k     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r3.c     // Catch: java.lang.Throwable -> L27
            r6.a(r3)     // Catch: java.lang.Throwable -> L27
            goto L294
        L2bd:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L2cb
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L27
        L2cb:
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L2d4
            r0.addAll(r4)     // Catch: java.lang.Throwable -> L27
        L2d4:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L27
        L2d8:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L313
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.s r3 = (com.kuaishou.weapon.p0.s) r3     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L2d8
            boolean r6 = r4.contains(r3)     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L2f7
            com.kuaishou.weapon.p0.q r6 = r1.k     // Catch: java.lang.Throwable -> L27
            int r7 = r3.a     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r3.d     // Catch: java.lang.Throwable -> L27
            r8 = 0
            r6.a(r7, r3, r8)     // Catch: java.lang.Throwable -> L27
            goto L2d8
        L2f7:
            boolean r6 = r5.contains(r3)     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L2d8
            r1.a(r3)     // Catch: java.lang.Throwable -> L27
            goto L2d8
        L301:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "pluginJsonObject is null "
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L309:
            com.kuaishou.weapon.p0.q r0 = r1.k     // Catch: java.lang.Throwable -> L27
            r0.c()     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.t r0 = r1.l     // Catch: java.lang.Throwable -> L27
            r0.b()     // Catch: java.lang.Throwable -> L27
        L313:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            com.kuaishou.weapon.p0.WeaponHI.iD()
            return
        L318:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L31a
        L31a:
            com.kuaishou.weapon.p0.q r0 = r1.k     // Catch: java.lang.Throwable -> L328
            r0.c()     // Catch: java.lang.Throwable -> L328
            com.kuaishou.weapon.p0.t r0 = r1.l     // Catch: java.lang.Throwable -> L328
            r0.b()     // Catch: java.lang.Throwable -> L328
            com.kuaishou.weapon.p0.WeaponHI.iD()
            return
        L328:
            r0 = move-exception
            com.kuaishou.weapon.p0.WeaponHI.iD()
            throw r0
    }
}
