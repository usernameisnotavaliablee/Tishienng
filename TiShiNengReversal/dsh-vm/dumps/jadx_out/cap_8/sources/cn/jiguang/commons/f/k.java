package cn.jiguang.commons.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {
    private final java.util.HashMap a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.HashMap f1118c;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.f.k a = null;

        static {
                cn.jiguang.commons.f.k r0 = new cn.jiguang.commons.f.k
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.f.k.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.f.k a() {
                cn.jiguang.commons.f.k r0 = cn.jiguang.commons.f.k.b.a
                return r0
        }
    }

    private k() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1118c = r0
            r1.c()
            r1.d()
            return
    }

    /* synthetic */ k(cn.jiguang.commons.f.k.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.f.k a() {
            cn.jiguang.commons.f.k r0 = cn.jiguang.commons.f.k.b.a()
            return r0
    }

    private java.lang.String a(java.util.HashSet r4) {
            r3 = this;
            java.lang.String r0 = "[]"
            if (r4 == 0) goto L45
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lb
            goto L45
        Lb:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L24
        L14:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L24
            r1.put(r2)     // Catch: java.lang.Throwable -> L24
            goto L14
        L24:
            r4 = move-exception
            goto L2b
        L26:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L24
            return r4
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "convertListToString failed: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "UserConfigManager"
            cn.jiguang.commons.w.a.c(r1, r4)
        L45:
            return r0
    }

    private java.util.ArrayList a(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "DISABLE_DATA"
            java.io.Serializable r2 = r2.getSerializable(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto Lb
            return r2
        Lb:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
    }

    private void a(int r5, int... r6) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r6[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L15:
            java.util.HashMap r6 = r4.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.put(r5, r0)
            return
    }

    private boolean a(java.util.ArrayList r6, java.util.ArrayList r7) {
            r5 = this;
            cn.jiguang.commons.f.i r0 = cn.jiguang.commons.f.i.d()
            boolean r1 = r6.isEmpty()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L34
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r6.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            boolean r4 = r0.a(r4)
            if (r4 == 0) goto L10
            boolean r4 = r0.e(r1)
            boolean r1 = r0.a(r1)
            if (r4 != 0) goto L32
            if (r1 == 0) goto L10
        L32:
            r3 = 1
            goto L10
        L34:
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L62
            java.util.Iterator r6 = r7.iterator()
        L3e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L62
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r1 = r7.intValue()
            boolean r1 = r0.a(r1)
            if (r1 == 0) goto L3e
            boolean r1 = r0.d(r7)
            boolean r7 = r0.c(r7)
            if (r1 != 0) goto L60
            if (r7 == 0) goto L3e
        L60:
            r3 = 1
            goto L3e
        L62:
            return r3
    }

    private java.util.ArrayList c(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "ENABLE_DATA"
            java.io.Serializable r2 = r2.getSerializable(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto Lb
            return r2
        Lb:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
    }

    private void c() {
            r8 = this;
            r0 = 3000(0xbb8, float:4.204E-42)
            r1 = 1000(0x3e8, float:1.401E-42)
            r2 = 2000(0x7d0, float:2.803E-42)
            int[] r0 = new int[]{r2, r0, r1}
            r1 = 1502(0x5de, float:2.105E-42)
            r8.a(r1, r0)
            r0 = 2001(0x7d1, float:2.804E-42)
            r1 = 3001(0xbb9, float:4.205E-42)
            r2 = 1001(0x3e9, float:1.403E-42)
            int[] r3 = new int[]{r0, r1, r2}
            r4 = 1100(0x44c, float:1.541E-42)
            r8.a(r4, r3)
            int[] r3 = new int[]{r0, r1, r2}
            r4 = 1101(0x44d, float:1.543E-42)
            r8.a(r4, r3)
            int[] r3 = new int[]{r0, r1, r2}
            r4 = 1104(0x450, float:1.547E-42)
            r8.a(r4, r3)
            int[] r3 = new int[]{r0, r1, r2}
            r4 = 1112(0x458, float:1.558E-42)
            r8.a(r4, r3)
            int[] r3 = new int[]{r0, r1, r2}
            r4 = 1102(0x44e, float:1.544E-42)
            r8.a(r4, r3)
            int[] r3 = new int[]{r0, r1, r2}
            r4 = 1110(0x456, float:1.555E-42)
            r8.a(r4, r3)
            int[] r3 = new int[]{r0, r1, r2}
            r4 = 1108(0x454, float:1.553E-42)
            r8.a(r4, r3)
            int[] r0 = new int[]{r0, r1, r2}
            r1 = 1109(0x455, float:1.554E-42)
            r8.a(r1, r0)
            r0 = 3003(0xbbb, float:4.208E-42)
            int[] r0 = new int[]{r0}
            r1 = 1013(0x3f5, float:1.42E-42)
            r8.a(r1, r0)
            r0 = 3004(0xbbc, float:4.21E-42)
            int[] r0 = new int[]{r0}
            r1 = 1014(0x3f6, float:1.421E-42)
            r8.a(r1, r0)
            r0 = 3007(0xbbf, float:4.214E-42)
            int[] r0 = new int[]{r0}
            r2 = 1015(0x3f7, float:1.422E-42)
            r8.a(r2, r0)
            r0 = 3008(0xbc0, float:4.215E-42)
            int[] r0 = new int[]{r0}
            r2 = 1011(0x3f3, float:1.417E-42)
            r8.a(r2, r0)
            r0 = 3005(0xbbd, float:4.211E-42)
            r2 = 2006(0x7d6, float:2.811E-42)
            int[] r0 = new int[]{r0, r2}
            r2 = 1017(0x3f9, float:1.425E-42)
            r8.a(r2, r0)
            r0 = 3006(0xbbe, float:4.212E-42)
            r2 = 2005(0x7d5, float:2.81E-42)
            int[] r0 = new int[]{r2, r0}
            r3 = 1009(0x3f1, float:1.414E-42)
            r8.a(r3, r0)
            r0 = 3009(0xbc1, float:4.217E-42)
            r3 = 1005(0x3ed, float:1.408E-42)
            r4 = 2009(0x7d9, float:2.815E-42)
            int[] r0 = new int[]{r4, r0, r3}
            r3 = 1010(0x3f2, float:1.415E-42)
            r8.a(r3, r0)
            r0 = 2003(0x7d3, float:2.807E-42)
            r4 = 3010(0xbc2, float:4.218E-42)
            r5 = 1012(0x3f4, float:1.418E-42)
            int[] r0 = new int[]{r0, r4, r5}
            r4 = 1505(0x5e1, float:2.109E-42)
            r8.a(r4, r0)
            r0 = 2010(0x7da, float:2.817E-42)
            r4 = 3011(0xbc3, float:4.22E-42)
            r6 = 1006(0x3ee, float:1.41E-42)
            int[] r0 = new int[]{r6, r0, r4}
            r4 = 1608(0x648, float:2.253E-42)
            r8.a(r4, r0)
            r0 = 3012(0xbc4, float:4.221E-42)
            r4 = 1007(0x3ef, float:1.411E-42)
            r6 = 2004(0x7d4, float:2.808E-42)
            int[] r0 = new int[]{r6, r0, r4}
            r4 = 1601(0x641, float:2.243E-42)
            r8.a(r4, r0)
            r0 = 2011(0x7db, float:2.818E-42)
            r4 = 3013(0xbc5, float:4.222E-42)
            r7 = 1008(0x3f0, float:1.413E-42)
            int[] r0 = new int[]{r7, r0, r4}
            r4 = 1501(0x5dd, float:2.103E-42)
            r8.a(r4, r0)
            r0 = 3014(0xbc6, float:4.224E-42)
            r4 = 1003(0x3eb, float:1.406E-42)
            r7 = 2007(0x7d7, float:2.812E-42)
            int[] r0 = new int[]{r7, r0, r4}
            r8.a(r6, r0)
            r0 = 2008(0x7d8, float:2.814E-42)
            r4 = 3015(0xbc7, float:4.225E-42)
            int[] r0 = new int[]{r0, r4}
            r8.a(r5, r0)
            r0 = 3016(0xbc8, float:4.226E-42)
            r4 = 2012(0x7dc, float:2.82E-42)
            int[] r0 = new int[]{r0, r3, r4}
            r8.a(r2, r0)
            r0 = 3017(0xbc9, float:4.228E-42)
            r2 = 2013(0x7dd, float:2.821E-42)
            int[] r0 = new int[]{r0, r2}
            r2 = 2201(0x899, float:3.084E-42)
            r8.a(r2, r0)
            int[] r0 = new int[]{r1}
            r1 = 2400(0x960, float:3.363E-42)
            r8.a(r1, r0)
            return
    }

    private void d() {
            r8 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "UserConfigManager"
            cn.jiguang.commons.L.ac r2 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Throwable -> L33
            cn.jiguang.commons.f.i r3 = cn.jiguang.commons.f.i.d()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "user_disable_config"
            java.lang.String r4 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = "user_enable_config"
            java.lang.String r0 = r2.a(r5, r0)     // Catch: java.lang.Throwable -> L33
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L36
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L36
            java.lang.String r0 = "restoreUserConfigFromSp: no saved config, init default"
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L33
            cn.jiguang.commons.f.i r0 = cn.jiguang.commons.f.i.d()     // Catch: java.lang.Throwable -> L33
            r0.e()     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
            goto Ldb
        L36:
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> L33
            r5 = 0
            if (r2 != 0) goto L77
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L5e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L5e
            r4 = 0
        L43:
            int r6 = r2.length()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L5e
            if (r4 >= r6) goto L77
            int r6 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L5e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L5e
            r3.e(r7)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L5e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L5e
            r3.a(r6)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L5e
            int r4 = r4 + 1
            goto L43
        L5e:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r4.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = "convertStringToList disable failed: "
            r4.append(r6)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L33
            r4.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L33
            cn.jiguang.commons.w.a.c(r1, r2)     // Catch: java.lang.Throwable -> L33
        L77:
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto Lb6
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L9d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L9d
        L82:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L9d
            if (r5 >= r0) goto Lb6
            int r0 = r2.getInt(r5)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L9d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L9d
            r3.d(r4)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L9d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L9d
            r3.c(r0)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L9d
            int r5 = r5 + 1
            goto L82
        L9d:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r2.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "convertStringToList enable failed: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L33
            r2.append(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L33
            cn.jiguang.commons.w.a.c(r1, r0)     // Catch: java.lang.Throwable -> L33
        Lb6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "restoreUserConfigFromSp completed - enable: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L33
            java.util.HashSet r2 = r3.c()     // Catch: java.lang.Throwable -> L33
            r0.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = ", disable: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L33
            java.util.HashSet r2 = r3.a()     // Catch: java.lang.Throwable -> L33
            r0.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L33
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L33
            goto Lf3
        Ldb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "restoreUserConfigFromSp failed: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        Lf3:
            return
    }

    private void e() {
            r6 = this;
            java.lang.String r0 = "UserConfigManager"
            cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.commons.f.i r2 = cn.jiguang.commons.f.i.d()     // Catch: java.lang.Throwable -> L27
            java.util.HashSet r2 = r2.a()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.commons.f.i r3 = cn.jiguang.commons.f.i.d()     // Catch: java.lang.Throwable -> L27
            java.util.HashSet r3 = r3.c()     // Catch: java.lang.Throwable -> L27
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto L29
            java.lang.String r4 = "user_disable_config"
            java.lang.String r5 = r6.a(r2)     // Catch: java.lang.Throwable -> L27
            r1.c(r4, r5)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r1 = move-exception
            goto L62
        L29:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto L39
            java.lang.String r4 = "user_enable_config"
            java.lang.String r5 = r6.a(r3)     // Catch: java.lang.Throwable -> L27
            r1.c(r4, r5)     // Catch: java.lang.Throwable -> L27
        L39:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "update a- disable="
            r1.append(r4)     // Catch: java.lang.Throwable -> L27
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "update a- enable="
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            r1.append(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L27
            return
        L62:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "saveUserConfigToSp failed: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.commons.w.a.c(r0, r1)
            return
    }

    public boolean a(int r19) {
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r3 = "UserConfigManager"
            java.util.HashMap r0 = r1.a     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L31
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L1a
            boolean r5 = r0.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L1e
        L1a:
            r17 = 1
            goto L1f9
        L1e:
            java.util.HashMap r5 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L34
            boolean r0 = r5.booleanValue()     // Catch: java.lang.Throwable -> L31
            return r0
        L31:
            r0 = move-exception
            goto L1fa
        L34:
            cn.jiguang.commons.f.i r5 = cn.jiguang.commons.f.i.d()     // Catch: java.lang.Throwable -> L31
            java.util.HashSet r5 = r5.c()     // Catch: java.lang.Throwable -> L31
            cn.jiguang.commons.f.i r6 = cn.jiguang.commons.f.i.d()     // Catch: java.lang.Throwable -> L31
            boolean r7 = r6.f1114e     // Catch: java.lang.Throwable -> L31
            boolean r8 = r6.f1115f     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.f1116g     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L31
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L4e:
            boolean r15 = r9.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r15 == 0) goto L99
            java.lang.Object r15 = r9.next()     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch: java.lang.Throwable -> L31
            r16 = 0
            int r10 = r15.intValue()     // Catch: java.lang.Throwable -> L31
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r10 < r4) goto L6e
            int r4 = r15.intValue()     // Catch: java.lang.Throwable -> L31
            r10 = 1999(0x7cf, float:2.801E-42)
            if (r4 > r10) goto L6e
            r11 = 1
            goto L91
        L6e:
            int r4 = r15.intValue()     // Catch: java.lang.Throwable -> L31
            r10 = 2000(0x7d0, float:2.803E-42)
            if (r4 < r10) goto L80
            int r4 = r15.intValue()     // Catch: java.lang.Throwable -> L31
            r10 = 2999(0xbb7, float:4.202E-42)
            if (r4 > r10) goto L80
            r12 = 1
            goto L91
        L80:
            int r4 = r15.intValue()     // Catch: java.lang.Throwable -> L31
            r10 = 3000(0xbb8, float:4.204E-42)
            if (r4 < r10) goto L91
            int r4 = r15.intValue()     // Catch: java.lang.Throwable -> L31
            r10 = 3999(0xf9f, float:5.604E-42)
            if (r4 > r10) goto L91
            r13 = 1
        L91:
            boolean r4 = r5.contains(r15)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L4e
            r14 = 1
            goto L4e
        L99:
            r16 = 0
            if (r11 == 0) goto L9f
            if (r7 != 0) goto La7
        L9f:
            if (r12 == 0) goto La3
            if (r8 != 0) goto La7
        La3:
            if (r13 == 0) goto La9
            if (r6 == 0) goto La9
        La7:
            r4 = 1
            goto Laa
        La9:
            r4 = 0
        Laa:
            int r9 = r11 + r12
            int r9 = r9 + r13
            r10 = 2400(0x960, float:3.363E-42)
            if (r2 != r10) goto Lc3
            if (r4 == 0) goto Lb4
            goto Lb5
        Lb4:
            r14 = 1
        Lb5:
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            return r14
        Lc3:
            r10 = 1
            if (r9 != r10) goto L112
            if (r13 == 0) goto Lda
            if (r7 != 0) goto Lcc
            if (r8 == 0) goto L102
        Lcc:
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        Lda:
            if (r12 == 0) goto Lee
            if (r7 != 0) goto Le0
            if (r6 == 0) goto L102
        Le0:
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        Lee:
            if (r11 == 0) goto L102
            if (r8 != 0) goto Lf4
            if (r6 == 0) goto L102
        Lf4:
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        L102:
            if (r14 == 0) goto L161
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        L112:
            r10 = 2
            if (r9 != r10) goto L161
            if (r12 == 0) goto L129
            if (r13 == 0) goto L129
            if (r7 == 0) goto L151
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        L129:
            if (r11 == 0) goto L13d
            if (r13 == 0) goto L13d
            if (r8 == 0) goto L151
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        L13d:
            if (r11 == 0) goto L151
            if (r12 == 0) goto L151
            if (r6 == 0) goto L151
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        L151:
            if (r14 == 0) goto L161
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        L161:
            if (r14 == 0) goto L171
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        L171:
            if (r4 != 0) goto L181
            java.util.HashMap r0 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            r17 = 1
            return r17
        L181:
            java.util.HashMap r10 = r1.f1118c     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L31
            r10.put(r15, r1)     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r10 = "scd:"
            r1.append(r10)     // Catch: java.lang.Throwable -> L31
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r10 = " disabled,typeCount="
            r1.append(r10)     // Catch: java.lang.Throwable -> L31
            r1.append(r9)     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = " hasP="
            r1.append(r9)     // Catch: java.lang.Throwable -> L31
            r1.append(r11)     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = " hasO="
            r1.append(r9)     // Catch: java.lang.Throwable -> L31
            r1.append(r12)     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = " hasV="
            r1.append(r9)     // Catch: java.lang.Throwable -> L31
            r1.append(r13)     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = " jpush="
            r1.append(r9)     // Catch: java.lang.Throwable -> L31
            r1.append(r7)     // Catch: java.lang.Throwable -> L31
            java.lang.String r7 = " joper="
            r1.append(r7)     // Catch: java.lang.Throwable -> L31
            r1.append(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.String r7 = " jver="
            r1.append(r7)     // Catch: java.lang.Throwable -> L31
            r1.append(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = " ip="
            r1.append(r6)     // Catch: java.lang.Throwable -> L31
            r1.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = " ec="
            r1.append(r4)     // Catch: java.lang.Throwable -> L31
            r1.append(r14)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = " mapped="
            r1.append(r4)     // Catch: java.lang.Throwable -> L31
            r1.append(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = " enableSet="
            r1.append(r0)     // Catch: java.lang.Throwable -> L31
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L31
            cn.jiguang.commons.w.a.a(r3, r0)     // Catch: java.lang.Throwable -> L31
            return r16
        L1f9:
            return r17
        L1fa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "check fail id="
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = " e="
            r1.append(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.commons.w.a.c(r3, r0)
            r1 = r18
            java.util.HashMap r0 = r1.f1118c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.put(r2, r3)
            r17 = 1
            return r17
    }

    public synchronized void d(android.os.Bundle r6) {
            r5 = this;
            java.lang.String r0 = "UserConfigManager"
            monitor-enter(r5)
            if (r6 == 0) goto L5c
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto Lc
            goto L5c
        Lc:
            java.lang.String r1 = "DISABLE_DATA"
            boolean r1 = r6.containsKey(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            java.lang.String r1 = "ENABLE_DATA"
            boolean r1 = r6.containsKey(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L7f
            goto L1f
        L1d:
            r6 = move-exception
            goto L65
        L1f:
            java.util.ArrayList r1 = r5.a(r6)     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList r6 = r5.c(r6)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "UserConfigManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r3.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = "updateUserConfig input - disable: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1d
            r3.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = ", enable: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1d
            r3.append(r6)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.w.a.a(r2, r3)     // Catch: java.lang.Throwable -> L1d
            java.util.HashMap r2 = r5.f1118c     // Catch: java.lang.Throwable -> L1d
            r2.clear()     // Catch: java.lang.Throwable -> L1d
            boolean r6 = r5.a(r1, r6)     // Catch: java.lang.Throwable -> L1d
            if (r6 == 0) goto L56
            r5.e()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = "updateUserConfig completed with changes"
            goto L58
        L56:
            java.lang.String r6 = "updateUserConfig completed without changes"
        L58:
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Throwable -> L1d
            goto L7f
        L5c:
            java.lang.String r6 = "UserConfigManager"
            java.lang.String r0 = "updateUserConfig: bundle is null or empty"
            cn.jiguang.commons.w.a.a(r6, r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r5)
            return
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r0.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "updateUserConfig failed: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L81
            r0.append(r6)     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "UserConfigManager"
            cn.jiguang.commons.w.a.c(r0, r6)     // Catch: java.lang.Throwable -> L81
        L7f:
            monitor-exit(r5)
            return
        L81:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            throw r6
    }
}
