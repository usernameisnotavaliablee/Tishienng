package cn.jpush.android.b;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private cn.jpush.android.b.c a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jpush.android.n.f f1740b;

    /* renamed from: cn.jpush.android.b.d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jpush.android.b.d a = null;

        static {
                cn.jpush.android.b.d r0 = new cn.jpush.android.b.d
                r1 = 0
                r0.<init>(r1)
                cn.jpush.android.b.d.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jpush.android.b.d a() {
                cn.jpush.android.b.d r0 = cn.jpush.android.b.d.a.a
                return r0
        }
    }

    private d() {
            r0 = this;
            r0.<init>()
            r0.f()
            return
    }

    /* synthetic */ d(cn.jpush.android.b.d.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jpush.android.b.d a() {
            cn.jpush.android.b.d r0 = cn.jpush.android.b.d.a.a()
            return r0
    }

    private void f() {
            r2 = this;
            android.content.Context r0 = cn.jpush.android.ad.m.a()
            cn.jpush.android.n.e r1 = cn.jpush.android.n.e.a()
            r1.a(r0)
            cn.jpush.android.b.a r1 = new cn.jpush.android.b.a
            r1.<init>(r0)
            r2.a = r1
            cn.jpush.android.n.f r1 = new cn.jpush.android.n.f
            r1.<init>(r0)
            r2.f1740b = r1
            return
    }

    public void a(int r2) {
            r1 = this;
            cn.jpush.android.n.e r0 = cn.jpush.android.n.e.a()
            r0.a(r2)
            return
    }

    public void a(long r2) {
            r1 = this;
            cn.jpush.android.b.c r0 = r1.a
            r0.a(r2)
            return
    }

    public void a(long r2, int r4, cn.jpush.android.n.d r5) {
            r1 = this;
            cn.jpush.android.n.f r0 = r1.f1740b
            r0.a(r2, r4, r5)
            return
    }

    public void a(cn.jpush.android.b.b r3) {
            r2 = this;
            java.lang.String r0 = "GeofenceManager"
            java.lang.String r1 = "recv geofence..."
            cn.jpush.android.helper.Logger.dd(r0, r1)
            cn.jpush.android.n.e r0 = cn.jpush.android.n.e.a()
            r0.b(r3)
            return
    }

    public void a(cn.jpush.android.n.b r2) {
            r1 = this;
            cn.jpush.android.n.f r0 = r1.f1740b
            r0.a(r2)
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            cn.jpush.android.n.e r0 = cn.jpush.android.n.e.a()
            r0.a(r2)
            return
    }

    public void a(org.json.JSONObject r6) {
            r5 = this;
            java.lang.String r0 = "GeofenceManager"
            java.lang.String r1 = "content"
            org.json.JSONObject r6 = r6.getJSONObject(r1)     // Catch: java.lang.Throwable -> L4e
            if (r6 == 0) goto L91
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L4e
            if (r1 <= 0) goto L91
            java.lang.String r1 = "op"
            java.lang.String r1 = r6.optString(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "geofenceid"
            java.lang.String r2 = r6.optString(r2)     // Catch: java.lang.Throwable -> L4e
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4e
            if (r3 != 0) goto L8e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L29
            goto L8e
        L29:
            int r3 = r1.hashCode()     // Catch: java.lang.Throwable -> L4e
            r4 = 96417(0x178a1, float:1.35109E-40)
            if (r3 == r4) goto L60
            r4 = 99339(0x1840b, float:1.39204E-40)
            if (r3 == r4) goto L50
            r4 = 116009(0x1c529, float:1.62563E-40)
            if (r3 == r4) goto L3d
            goto L74
        L3d:
            java.lang.String r3 = "upd"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L74
            cn.jpush.android.n.e r1 = cn.jpush.android.n.e.a()     // Catch: java.lang.Throwable -> L4e
            r3 = 1
            r1.a(r2, r6, r3)     // Catch: java.lang.Throwable -> L4e
            return
        L4e:
            r6 = move-exception
            goto L92
        L50:
            java.lang.String r6 = "del"
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Throwable -> L4e
            if (r6 == 0) goto L74
            cn.jpush.android.n.e r6 = cn.jpush.android.n.e.a()     // Catch: java.lang.Throwable -> L4e
            r6.a(r2)     // Catch: java.lang.Throwable -> L4e
            return
        L60:
            java.lang.String r2 = "add"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L74
            cn.jpush.android.b.b r6 = cn.jpush.android.b.b.a(r6)     // Catch: java.lang.Throwable -> L4e
            cn.jpush.android.n.e r1 = cn.jpush.android.n.e.a()     // Catch: java.lang.Throwable -> L4e
            r1.b(r6)     // Catch: java.lang.Throwable -> L4e
            return
        L74:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r6.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "operation "
            r6.append(r2)     // Catch: java.lang.Throwable -> L4e
            r6.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = " not supported"
            r6.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L4e
        L8a:
            cn.jpush.android.helper.Logger.w(r0, r6)     // Catch: java.lang.Throwable -> L4e
            return
        L8e:
            java.lang.String r6 = "json error: required key not found"
            goto L8a
        L91:
            return
        L92:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "json error:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r6)
            return
    }

    public void b() {
            r1 = this;
            cn.jpush.android.b.c r0 = r1.a
            r0.b()
            return
    }

    public void c() {
            r1 = this;
            cn.jpush.android.b.c r0 = r1.a
            r0.a()
            return
    }

    public void d() {
            r1 = this;
            cn.jpush.android.n.f r0 = r1.f1740b
            r0.a()
            return
    }

    public void e() {
            r1 = this;
            cn.jpush.android.n.f r0 = r1.f1740b
            r0.b()
            return
    }
}
