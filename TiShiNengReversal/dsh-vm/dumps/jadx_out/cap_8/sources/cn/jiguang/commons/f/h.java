package cn.jiguang.commons.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class h {
    private static final java.util.regex.Pattern a = null;

    class a implements cn.jiguang.commons.f.f {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(cn.jiguang.commons.c.m r1) {
                r0 = this;
                return
        }

        @Override // cn.jiguang.commons.f.f
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                cn.jiguang.commons.c.m r1 = (cn.jiguang.commons.c.m) r1
                r0.a(r1)
                return
        }
    }

    class b implements cn.jiguang.commons.f.f {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(cn.jiguang.commons.c.n r1) {
                r0 = this;
                return
        }

        @Override // cn.jiguang.commons.f.f
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                cn.jiguang.commons.c.n r1 = (cn.jiguang.commons.c.n) r1
                r0.a(r1)
                return
        }
    }

    static {
            java.lang.String r0 = "^\\s*\\[\\s*(\\d*)\\s*,\\s*(\\d*)\\s*\\]\\s*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            cn.jiguang.commons.f.h.a = r0
            return
    }

    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean a(java.lang.String r8) {
            java.lang.String r0 = "ResetConfigurationHelper"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 1
            if (r1 == 0) goto La
            return r2
        La:
            java.util.regex.Pattern r1 = cn.jiguang.commons.f.h.a     // Catch: java.lang.NumberFormatException -> L92
            java.lang.String r3 = r8.trim()     // Catch: java.lang.NumberFormatException -> L92
            java.util.regex.Matcher r1 = r1.matcher(r3)     // Catch: java.lang.NumberFormatException -> L92
            boolean r3 = r1.matches()     // Catch: java.lang.NumberFormatException -> L92
            if (r3 != 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L92
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L92
            java.lang.String r3 = "invalid sdk range format: "
            r1.append(r3)     // Catch: java.lang.NumberFormatException -> L92
            r1.append(r8)     // Catch: java.lang.NumberFormatException -> L92
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L92
            cn.jiguang.commons.w.a.f(r0, r1)     // Catch: java.lang.NumberFormatException -> L92
            return r2
        L2f:
            java.lang.String r3 = r1.group(r2)     // Catch: java.lang.NumberFormatException -> L92
            r4 = 2
            java.lang.String r1 = r1.group(r4)     // Catch: java.lang.NumberFormatException -> L92
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.NumberFormatException -> L92
            int r4 = r4.f()     // Catch: java.lang.NumberFormatException -> L92
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.NumberFormatException -> L92
            r6 = 0
            java.lang.String r7 = "sdk version "
            if (r5 != 0) goto L6a
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L92
            if (r4 >= r3) goto L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L92
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L92
            r1.append(r7)     // Catch: java.lang.NumberFormatException -> L92
            r1.append(r4)     // Catch: java.lang.NumberFormatException -> L92
            java.lang.String r4 = " < min "
            r1.append(r4)     // Catch: java.lang.NumberFormatException -> L92
            r1.append(r3)     // Catch: java.lang.NumberFormatException -> L92
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L92
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.NumberFormatException -> L92
            return r6
        L6a:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.NumberFormatException -> L92
            if (r3 != 0) goto L91
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L92
            if (r4 <= r1) goto L91
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L92
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L92
            r3.append(r7)     // Catch: java.lang.NumberFormatException -> L92
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L92
            java.lang.String r4 = " > max "
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L92
            r3.append(r1)     // Catch: java.lang.NumberFormatException -> L92
            java.lang.String r1 = r3.toString()     // Catch: java.lang.NumberFormatException -> L92
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.NumberFormatException -> L92
            return r6
        L91:
            return r2
        L92:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "parse sdk range failed: "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r8)
            return r2
    }

    private static boolean a(org.json.JSONObject r6) {
            java.lang.String r0 = "type"
            java.lang.String r0 = r6.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            java.lang.String r1 = "sdk_range"
            java.lang.String r6 = r6.optString(r1)
            boolean r6 = a(r6)
            java.lang.String r1 = "ResetConfigurationHelper"
            if (r6 != 0) goto L36
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = "skip config "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = " due to sdk version"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            cn.jiguang.commons.w.a.a(r1, r6)
            return r2
        L36:
            int r6 = r0.hashCode()     // Catch: java.lang.Exception -> L56
            r3 = -363875687(0xffffffffea4fb299, float:-6.277276E25)
            r4 = 2
            r5 = 1
            if (r6 == r3) goto L62
            r3 = 3327218(0x32c4f2, float:4.662425E-39)
            if (r6 == r3) goto L58
            r3 = 3582119(0x36a8a7, float:5.019618E-39)
            if (r6 == r3) goto L4c
            goto L6c
        L4c:
            java.lang.String r6 = "uaid"
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Exception -> L56
            if (r6 == 0) goto L6c
            r6 = 2
            goto L6d
        L56:
            r6 = move-exception
            goto Lbd
        L58:
            java.lang.String r6 = "loc2"
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Exception -> L56
            if (r6 == 0) goto L6c
            r6 = 0
            goto L6d
        L62:
            java.lang.String r6 = "data_conf"
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Exception -> L56
            if (r6 == 0) goto L6c
            r6 = 1
            goto L6d
        L6c:
            r6 = -1
        L6d:
            if (r6 == 0) goto Lab
            if (r6 == r5) goto L99
            if (r6 == r4) goto L88
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56
            r6.<init>()     // Catch: java.lang.Exception -> L56
            java.lang.String r3 = "unknown config type: "
            r6.append(r3)     // Catch: java.lang.Exception -> L56
            r6.append(r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L56
            cn.jiguang.commons.w.a.f(r1, r6)     // Catch: java.lang.Exception -> L56
            return r2
        L88:
            cn.jiguang.commons.K.a r6 = cn.jiguang.commons.K.a.e()     // Catch: java.lang.Exception -> L56
            android.content.Context r3 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L56
            r6.c(r3)     // Catch: java.lang.Exception -> L56
            java.lang.String r6 = "uaid config updated"
            cn.jiguang.commons.w.a.a(r1, r6)     // Catch: java.lang.Exception -> L56
            return r5
        L99:
            cn.jiguang.commons.f.j r6 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L56
            cn.jiguang.commons.f.h$b r3 = new cn.jiguang.commons.f.h$b     // Catch: java.lang.Exception -> L56
            r3.<init>()     // Catch: java.lang.Exception -> L56
            r6.a(r3)     // Catch: java.lang.Exception -> L56
            java.lang.String r6 = "data config updated"
            cn.jiguang.commons.w.a.a(r1, r6)     // Catch: java.lang.Exception -> L56
            return r5
        Lab:
            cn.jiguang.commons.J.e r6 = cn.jiguang.commons.J.e.i()     // Catch: java.lang.Exception -> L56
            cn.jiguang.commons.f.h$a r3 = new cn.jiguang.commons.f.h$a     // Catch: java.lang.Exception -> L56
            r3.<init>()     // Catch: java.lang.Exception -> L56
            r6.a(r3)     // Catch: java.lang.Exception -> L56
            java.lang.String r6 = "location config updated"
            cn.jiguang.commons.w.a.a(r1, r6)     // Catch: java.lang.Exception -> L56
            return r5
        Lbd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " config update failed"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.commons.w.a.a(r1, r0, r6)
            return r2
    }

    public static void c(org.json.JSONObject r6) {
            java.lang.String r0 = "ResetConfigurationHelper"
            if (r6 != 0) goto La
            java.lang.String r6 = "jsonContent is null"
            cn.jiguang.commons.w.a.f(r0, r6)
            return
        La:
            java.lang.String r1 = "configs"
            org.json.JSONArray r6 = r6.optJSONArray(r1)
            if (r6 == 0) goto L84
            int r1 = r6.length()
            if (r1 != 0) goto L19
            goto L84
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reset config start, count="
            r1.append(r2)
            int r2 = r6.length()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r1)
            r1 = 0
            r2 = 0
        L33:
            int r3 = r6.length()
            if (r1 >= r3) goto L63
            org.json.JSONObject r3 = r6.getJSONObject(r1)     // Catch: java.lang.Exception -> L46
            boolean r3 = a(r3)     // Catch: java.lang.Exception -> L46
            if (r3 == 0) goto L60
            int r2 = r2 + 1
            goto L60
        L46:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "process config["
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = "] failed"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jiguang.commons.w.a.a(r0, r4, r3)
        L60:
            int r1 = r1 + 1
            goto L33
        L63:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "reset config done, success="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            int r6 = r6.length()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r6)
            return
        L84:
            java.lang.String r6 = "configs is empty"
            cn.jiguang.commons.w.a.f(r0, r6)
            return
    }
}
