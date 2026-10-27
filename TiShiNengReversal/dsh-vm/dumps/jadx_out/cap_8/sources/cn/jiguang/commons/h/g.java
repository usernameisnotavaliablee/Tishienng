package cn.jiguang.commons.H;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g extends cn.jiguang.commons.a.c {
    private static java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f811c;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.H.g a = null;

        static {
                cn.jiguang.commons.H.g r0 = new cn.jiguang.commons.H.g
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.H.g.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.H.g a() {
                cn.jiguang.commons.H.g r0 = cn.jiguang.commons.H.g.b.a
                return r0
        }
    }

    private g() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ g(cn.jiguang.commons.H.g.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.H.g c() {
            cn.jiguang.commons.H.g r0 = cn.jiguang.commons.H.g.b.a()
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JDeviceMac"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r8) {
            r7 = this;
            java.lang.String r0 = "JDeviceMac"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            r2 = 29
            if (r1 >= r2) goto L20
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r8.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "it need not business, because os version less than 29, current is "
            r8.append(r2)     // Catch: java.lang.Throwable -> L1d
            r8.append(r1)     // Catch: java.lang.Throwable -> L1d
        L15:
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.w.a.a(r0, r8)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r8 = move-exception
            goto L19c
        L20:
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L1d
            r2 = 1010(0x3f2, float:1.415E-42)
            java.lang.String r1 = r1.d(r2, r8)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r2.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "mac: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1d
            r2.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = cn.jiguang.commons.H.g.a     // Catch: java.lang.Throwable -> L1d
            boolean r2 = android.text.TextUtils.equals(r1, r2)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L54
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r8.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "mac unchanged, skip report: "
            r8.append(r2)     // Catch: java.lang.Throwable -> L1d
            r8.append(r1)     // Catch: java.lang.Throwable -> L1d
            goto L15
        L54:
            cn.jiguang.commons.H.g.a = r1     // Catch: java.lang.Throwable -> L1d
            java.util.List r8 = cn.jiguang.commons.I.d.c(r8)     // Catch: java.lang.Throwable -> L1d
            if (r8 == 0) goto L195
            boolean r2 = r8.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L64
            goto L195
        L64:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            r3 = r2
        L6a:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto Lbd
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.c.k r4 = (cn.jiguang.commons.c.k) r4     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r4.f1055d     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = "connect"
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L99
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r8.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "connect wifi: "
            r8.append(r5)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L1d
            r8.append(r5)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.w.a.a(r0, r8)     // Catch: java.lang.Throwable -> L1d
            goto Lbe
        L99:
            java.lang.String r5 = r4.f1055d     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = "strongest"
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L6a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r3.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "strongest wifi: "
            r3.append(r5)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L1d
            r3.append(r5)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Throwable -> L1d
            r3 = r4
            goto L6a
        Lbd:
            r4 = r2
        Lbe:
            java.lang.String r8 = "unknownssid"
            java.lang.String r5 = "<unknown ssid>"
            if (r4 == 0) goto Lf4
            java.lang.String r6 = r4.f1054c     // Catch: java.lang.Throwable -> L1d
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L1d
            if (r6 != 0) goto Lf4
            java.lang.String r6 = r4.f1054c     // Catch: java.lang.Throwable -> L1d
            boolean r6 = android.text.TextUtils.equals(r6, r5)     // Catch: java.lang.Throwable -> L1d
            if (r6 != 0) goto Lf4
            java.lang.String r6 = r4.f1054c     // Catch: java.lang.Throwable -> L1d
            boolean r6 = android.text.TextUtils.equals(r6, r8)     // Catch: java.lang.Throwable -> L1d
            if (r6 != 0) goto Lf4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r8.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "use connect wifi, ssid: "
            r8.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = r4.f1054c     // Catch: java.lang.Throwable -> L1d
            r8.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.w.a.d(r0, r8)     // Catch: java.lang.Throwable -> L1d
            r2 = r4
            goto L125
        Lf4:
            if (r3 == 0) goto L125
            java.lang.String r4 = r3.f1054c     // Catch: java.lang.Throwable -> L1d
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L125
            java.lang.String r4 = r3.f1054c     // Catch: java.lang.Throwable -> L1d
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L125
            java.lang.String r4 = r3.f1054c     // Catch: java.lang.Throwable -> L1d
            boolean r8 = android.text.TextUtils.equals(r4, r8)     // Catch: java.lang.Throwable -> L1d
            if (r8 != 0) goto L125
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r8.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "use strongest wifi, ssid: "
            r8.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = r3.f1054c     // Catch: java.lang.Throwable -> L1d
            r8.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.w.a.d(r0, r8)     // Catch: java.lang.Throwable -> L1d
            r2 = r3
        L125:
            if (r2 == 0) goto L18f
            java.lang.String r8 = cn.jiguang.commons.H.g.f811c     // Catch: java.lang.Throwable -> L1d
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L1d
            if (r8 != 0) goto L14a
            java.lang.String r8 = cn.jiguang.commons.H.g.f811c     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r2.f1054c     // Catch: java.lang.Throwable -> L1d
            boolean r8 = android.text.TextUtils.equals(r8, r3)     // Catch: java.lang.Throwable -> L1d
            if (r8 == 0) goto L14a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r8.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "ssid unchanged, skip report: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r2.f1054c     // Catch: java.lang.Throwable -> L1d
            r8.append(r1)     // Catch: java.lang.Throwable -> L1d
            goto L15
        L14a:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L178
            r8.<init>()     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "tag"
            java.lang.String r4 = r2.f1055d     // Catch: java.lang.Throwable -> L178
            r8.put(r3, r4)     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "l_mac_address"
            r8.put(r3, r1)     // Catch: java.lang.Throwable -> L178
            java.lang.String r1 = "ssid"
            java.lang.String r3 = r2.f1054c     // Catch: java.lang.Throwable -> L178
            r8.put(r1, r3)     // Catch: java.lang.Throwable -> L178
            java.lang.String r1 = "report ssid data success"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L178
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "ssid_mac_info"
            r1.a(r8, r3)     // Catch: java.lang.Throwable -> L178
            java.lang.String r8 = r2.f1054c     // Catch: java.lang.Throwable -> L178
            cn.jiguang.commons.H.g.f811c = r8     // Catch: java.lang.Throwable -> L178
            super.d(r0)     // Catch: java.lang.Throwable -> L178
            return
        L178:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "ssid mac report err: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L1d
            r1.append(r8)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            goto L191
        L18f:
            java.lang.String r8 = "exact wifi info null, cannot report ssid mac"
        L191:
            cn.jiguang.commons.w.a.f(r0, r8)     // Catch: java.lang.Throwable -> L1d
            goto L1b4
        L195:
            java.lang.String r8 = "wifi info list empty"
            cn.jiguang.commons.w.a.f(r0, r8)     // Catch: java.lang.Throwable -> L1d
            return
        L19c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ssid mac err:"
            r1.append(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r8)
        L1b4:
            return
    }
}
