package cn.jpush.android.n;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static int f1838c = 200;
    protected android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    protected int f1839b;

    /* renamed from: d, reason: collision with root package name */
    private volatile java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> f1840d;

    /* renamed from: e, reason: collision with root package name */
    private volatile java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> f1841e;

    /* renamed from: f, reason: collision with root package name */
    private cn.jpush.android.n.e.a f1842f;

    /* renamed from: cn.jpush.android.n.e$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public interface a {
        void a(cn.jpush.android.b.b r1);

        void a(cn.jpush.android.b.b r1, cn.jpush.android.b.b r2);

        void a(boolean r1);

        void b(cn.jpush.android.b.b r1);
    }

    private static final class b {
        private static final cn.jpush.android.n.e a = null;

        static {
                cn.jpush.android.n.e r0 = new cn.jpush.android.n.e
                r1 = 0
                r0.<init>(r1)
                cn.jpush.android.n.e.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jpush.android.n.e a() {
                cn.jpush.android.n.e r0 = cn.jpush.android.n.e.b.a
                return r0
        }
    }

    static {
            return
    }

    private e() {
            r1 = this;
            r1.<init>()
            r0 = 100
            r1.f1839b = r0
            return
    }

    /* synthetic */ e(cn.jpush.android.n.e.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private static cn.jpush.android.b.b a(cn.jpush.android.d.d r3) {
            cn.jpush.android.b.b r0 = new cn.jpush.android.b.b
            r0.<init>()
            java.lang.String r1 = r3.ak
            r0.a = r1
            long r1 = r3.al
            r0.f1730b = r1
            java.lang.String r1 = r3.am
            r0.f1731c = r1
            boolean r1 = r3.an
            r0.f1732d = r1
            long r1 = r3.ap
            r0.f1733e = r1
            double r1 = r3.aq
            r0.f1734f = r1
            double r1 = r3.ar
            r0.f1735g = r1
            java.lang.String r3 = r3.as
            r0.f1736h = r3
            return r0
    }

    public static cn.jpush.android.n.e a() {
            cn.jpush.android.n.e r0 = cn.jpush.android.n.e.b.a()
            return r0
    }

    private java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> a(android.content.Context r7, int r8) {
            r6 = this;
            r0 = 0
            java.lang.String r1 = "GeofenceDataHelper"
            if (r7 != 0) goto Lb
            java.lang.String r7 = "unexcepted , context is null"
            cn.jpush.android.helper.Logger.w(r1, r7)
            return r0
        Lb:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r3 = 2
            if (r8 != r3) goto L18
            java.lang.String r8 = "jpush_geofence_v5_report"
            goto L1a
        L16:
            r7 = move-exception
            goto L57
        L18:
            java.lang.String r8 = "jpush_geofence_v5"
        L1a:
            java.io.File r8 = cn.jpush.android.ad.c.a(r7, r8)     // Catch: java.lang.Throwable -> L16
            boolean r3 = r8.exists()     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L53
            java.lang.String r8 = cn.jpush.android.ad.c.c(r8)     // Catch: java.lang.Throwable -> L16
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L53
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r8 = r3.keys()     // Catch: java.lang.Throwable -> L16
        L37:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L53
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L16
            org.json.JSONObject r4 = r3.getJSONObject(r4)     // Catch: java.lang.Throwable -> L16
            cn.jpush.android.b.b r4 = cn.jpush.android.b.b.a(r7, r4)     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L37
            java.lang.String r5 = r4.a     // Catch: java.lang.Throwable -> L16
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L16
            goto L37
        L53:
            cn.jpush.android.ad.m.a(r0)
            return r2
        L57:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r8.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "load objects error:"
            r8.append(r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L73
            r8.append(r7)     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.helper.Logger.w(r1, r7)     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.ad.m.a(r0)
            return r2
        L73:
            r7 = move-exception
            cn.jpush.android.ad.m.a(r0)
            throw r7
    }

    private void a(java.lang.String r7, org.json.JSONObject r8, int r9, boolean r10) {
            r6 = this;
            java.util.LinkedHashMap r0 = r6.d(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Before update.Current geofence size:"
            r1.append(r2)
            int r2 = r0.size()
            r1.append(r2)
            java.lang.String r2 = ",type:"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GeofenceDataHelper"
            cn.jpush.android.helper.Logger.dd(r2, r1)
            java.lang.Object r1 = r0.get(r7)
            cn.jpush.android.b.b r1 = (cn.jpush.android.b.b) r1
            if (r1 != 0) goto L34
            java.lang.String r7 = "can not update geofence because origin one not found"
            cn.jpush.android.helper.Logger.ww(r2, r7)
            return
        L34:
            r1.b(r8)
            long r2 = r1.f1733e
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r4 = java.lang.System.currentTimeMillis()
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L4c
            r0.remove(r7)
            r6.a(r1)
            goto L55
        L4c:
            if (r10 == 0) goto L55
            cn.jpush.android.n.e$a r7 = r6.f1842f
            if (r7 == 0) goto L55
            r7.a(r1, r1)
        L55:
            r6.e(r9)
            return
    }

    private void b(android.content.Context r9) {
            r8 = this;
            java.lang.String r0 = "GeofenceDataHelper"
            r1 = 2
            r2 = 1
            r3 = 0
            java.lang.String r4 = "jpush_geofence_v5_report"
            java.io.File r4 = cn.jpush.android.ad.c.a(r9, r4)     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L1e
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L1e
            java.util.LinkedHashMap r4 = r8.a(r9, r1)     // Catch: java.lang.Throwable -> L1a
            r8.f1841e = r4     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r9 = move-exception
            r4 = 0
            goto Le2
        L1e:
            java.lang.String r4 = "jpush_geofence_v5"
            java.io.File r4 = cn.jpush.android.ad.c.a(r9, r4)     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L34
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L34
            java.util.LinkedHashMap r4 = r8.a(r9, r2)     // Catch: java.lang.Throwable -> L1a
            r8.f1840d = r4     // Catch: java.lang.Throwable -> L1a
            goto Lca
        L34:
            cn.jpush.android.cache.Key r4 = cn.jpush.android.cache.Key.PushVerCode()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = cn.jpush.android.cache.Sp.get(r9, r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L1a
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L1a
            r5 = 318(0x13e, float:4.46E-43)
            r6 = 330(0x14a, float:4.62E-43)
            if (r4 < r5) goto La9
            if (r4 > r6) goto La9
            java.lang.String r4 = "jpush_geofence_v3"
            java.io.File r4 = cn.jpush.android.ad.c.a(r9, r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = cn.jpush.android.ad.c.a(r4)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto Lca
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto Lca
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r5.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = "old geofences:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L1a
            r5.append(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1a
            cn.jpush.android.helper.Logger.d(r0, r5)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L1a
            r5.<init>()     // Catch: java.lang.Throwable -> L1a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L1a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L1a
        L7f:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r6 == 0) goto L9f
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L1a
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L1a
            cn.jpush.android.d.d r6 = (cn.jpush.android.d.d) r6     // Catch: java.lang.Throwable -> L1a
            cn.jpush.android.b.b r6 = a(r6)     // Catch: java.lang.Throwable -> L1a
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L1a
            goto L7f
        L9f:
            boolean r4 = r5.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto Lca
            r8.f1840d = r5     // Catch: java.lang.Throwable -> L1a
        La7:
            r4 = 1
            goto Lcb
        La9:
            if (r4 <= r6) goto Lca
            r5 = 350(0x15e, float:4.9E-43)
            if (r4 >= r5) goto Lca
            java.lang.String r4 = "jpush_geofence_v4"
            java.io.File r4 = cn.jpush.android.ad.c.a(r9, r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = cn.jpush.android.ad.c.a(r4)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L1a
            r8.f1840d = r4     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r4 = r8.f1840d     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto Lca
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r4 = r8.f1840d     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto Lca
            goto La7
        Lca:
            r4 = 0
        Lcb:
            cn.jpush.android.cache.Key r5 = cn.jpush.android.cache.Key.PushVerCode()     // Catch: java.lang.Throwable -> Le1
            int r6 = cn.jpush.android.m.a.a     // Catch: java.lang.Throwable -> Le1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Le1
            cn.jpush.android.cache.Key r5 = r5.set(r6)     // Catch: java.lang.Throwable -> Le1
            cn.jpush.android.cache.Key[] r6 = new cn.jpush.android.cache.Key[r2]     // Catch: java.lang.Throwable -> Le1
            r6[r3] = r5     // Catch: java.lang.Throwable -> Le1
            cn.jpush.android.cache.Sp.set(r9, r6)     // Catch: java.lang.Throwable -> Le1
            goto Lf6
        Le1:
            r9 = move-exception
        Le2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "recover geofence failed:"
            r5.append(r6)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            cn.jpush.android.helper.Logger.dd(r0, r9)
        Lf6:
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r9 = r8.f1841e
            if (r9 != 0) goto L101
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r8.f1841e = r9
        L101:
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r9 = r8.f1840d
            if (r9 != 0) goto L10d
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r8.f1840d = r9
            goto L156
        L10d:
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r9 = r8.f1840d
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L117:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L156
            java.lang.Object r5 = r9.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            cn.jpush.android.b.b r5 = (cn.jpush.android.b.b) r5
            if (r5 == 0) goto L117
            int r6 = r5.f1737i
            if (r6 != r1) goto L117
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "save Geofence "
            r3.append(r6)
            java.lang.String r6 = r5.a
            r3.append(r6)
            java.lang.String r6 = "to report!"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            cn.jpush.android.helper.Logger.dd(r0, r3)
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r3 = r8.f1841e
            java.lang.String r6 = r5.a
            r3.put(r6, r5)
            r9.remove()
            r3 = 1
            goto L117
        L156:
            boolean r9 = r8.b(r1)
            boolean r5 = r8.b(r2)
            if (r4 != 0) goto L162
            if (r5 == 0) goto L165
        L162:
            r8.c(r2)
        L165:
            if (r3 != 0) goto L169
            if (r9 == 0) goto L16c
        L169:
            r8.c(r1)
        L16c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "Recover show geofence size:"
            r9.append(r1)
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r1 = r8.f1840d
            int r1 = r1.size()
            r9.append(r1)
            java.lang.String r1 = "  report geofence size:"
            r9.append(r1)
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r1 = r8.f1841e
            int r1 = r1.size()
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            cn.jpush.android.helper.Logger.dd(r0, r9)
            return
    }

    private boolean b(int r8) {
            r7 = this;
            r0 = 2
            if (r8 != r0) goto L6
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r8 = r7.f1841e
            goto L8
        L6:
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r8 = r7.f1840d
        L8:
            r0 = 0
            if (r8 == 0) goto L5e
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L12
            goto L5e
        L12:
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L1a:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            cn.jpush.android.b.b r1 = (cn.jpush.android.b.b) r1
            if (r1 == 0) goto L1a
            long r2 = r1.f1733e
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r4 = java.lang.System.currentTimeMillis()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Geofence "
            r0.append(r2)
            java.lang.String r1 = r1.a
            r0.append(r1)
            java.lang.String r1 = " is out of date!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GeofenceDataHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            r8.remove()
            r0 = 1
            goto L1a
        L5e:
            return r0
    }

    private void c(int r6) {
            r5 = this;
            r0 = 2
            if (r6 != 0) goto Lb
            r5.c(r0)
            r6 = 1
            r5.c(r6)
            return
        Lb:
            java.lang.String r1 = "GeofenceDataHelper"
            if (r6 != r0) goto L19
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r6 = r5.f1841e
            java.lang.String r0 = "save report geofence to file"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            java.lang.String r0 = "jpush_geofence_v5_report"
            goto L22
        L19:
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r6 = r5.f1840d
            java.lang.String r0 = "save show geofence to file"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            java.lang.String r0 = "jpush_geofence_v5"
        L22:
            if (r6 != 0) goto L25
            return
        L25:
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> L58
            java.io.File r0 = cn.jpush.android.ad.c.a(r2, r0)     // Catch: java.lang.Throwable -> L58
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L58
        L38:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L58
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L58
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L58
            cn.jpush.android.b.b r3 = (cn.jpush.android.b.b) r3     // Catch: java.lang.Throwable -> L58
            org.json.JSONObject r3 = r3.a()     // Catch: java.lang.Throwable -> L58
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L58
            goto L38
        L58:
            r6 = move-exception
            goto L66
        L5a:
            java.lang.String r6 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L58
            cn.jpush.android.ad.c.a(r6, r0)     // Catch: java.lang.Throwable -> L58
            return
        L66:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "save geo to file error:"
            r0.append(r2)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jpush.android.helper.Logger.ww(r1, r6)
            return
    }

    private boolean c(cn.jpush.android.b.b r6) {
            r5 = this;
            if (r6 == 0) goto L3d
            java.lang.String r0 = r6.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3d
            long r0 = r6.f1730b
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3d
            double r0 = r6.f1735g
            r2 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L3d
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L3d
            double r0 = r6.f1734f
            r2 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L3d
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L3b
            goto L3d
        L3b:
            r6 = 1
            return r6
        L3d:
            java.lang.String r6 = "GeofenceDataHelper"
            java.lang.String r0 = "The geofence is invalid, won't operate!"
            cn.jpush.android.helper.Logger.ww(r6, r0)
            r6 = 0
            return r6
    }

    private java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> d(int r2) {
            r1 = this;
            r0 = 2
            if (r2 != r0) goto L6
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r2 = r1.f1841e
            return r2
        L6:
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r2 = r1.f1840d
            return r2
    }

    private void e(int r2) {
            r1 = this;
            r1.c(r2)
            cn.jpush.android.n.e$a r2 = r1.f1842f
            if (r2 == 0) goto L1d
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r0 = r1.f1840d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r0 = r1.f1841e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            r2.a(r0)
        L1d:
            return
    }

    private void f(int r4) {
            r3 = this;
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r0 = r3.f1840d
            int r0 = r0.size()
            if (r0 <= r4) goto L4e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ShowGeofence count= "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = ",limit="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ",need remove earliest"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GeofenceDataHelper"
            cn.jpush.android.helper.Logger.dd(r2, r1)
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r1 = r3.f1840d
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            if (r0 <= r4) goto L4e
            java.lang.Object r2 = r1.next()
            cn.jpush.android.b.b r2 = (cn.jpush.android.b.b) r2
            if (r2 == 0) goto L48
            r3.a(r2)
        L48:
            r1.remove()
            int r0 = r0 + (-1)
            goto L35
        L4e:
            return
    }

    public void a(int r2) {
            r1 = this;
            android.content.Context r0 = r1.a
            cn.jpush.android.cache.a.d(r0, r2)
            r1.f1839b = r2
            r1.f(r2)
            return
    }

    public synchronized void a(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L5
            monitor-exit(r1)
            return
        L5:
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L21
            r1.a = r0     // Catch: java.lang.Throwable -> L21
            r0 = 10
            int r0 = cn.jpush.android.cache.a.e(r2, r0)     // Catch: java.lang.Throwable -> L21
            r1.f1839b = r0     // Catch: java.lang.Throwable -> L21
            r1.b(r2)     // Catch: java.lang.Throwable -> L21
            int r2 = r1.f1839b     // Catch: java.lang.Throwable -> L21
            r1.f(r2)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)
            return
        L21:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r2
    }

    public void a(cn.jpush.android.b.b r6) {
            r5 = this;
            if (r6 == 0) goto Lb
            java.lang.String r0 = r6.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            goto L47
        Lb:
            int r0 = r6.f1737i
            java.lang.String r1 = r6.a
            java.util.LinkedHashMap r2 = r5.d(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Before delete.Current geofence size:"
            r3.append(r4)
            int r4 = r2.size()
            r3.append(r4)
            java.lang.String r4 = ",type:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "GeofenceDataHelper"
            cn.jpush.android.helper.Logger.dd(r4, r3)
            java.lang.Object r1 = r2.remove(r1)
            cn.jpush.android.b.b r1 = (cn.jpush.android.b.b) r1
            if (r1 == 0) goto L48
            r5.e(r0)
            cn.jpush.android.n.e$a r0 = r5.f1842f
            if (r0 == 0) goto L47
            r0.b(r6)
        L47:
            return
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "geofence="
            r0.append(r1)
            java.lang.String r6 = r6.a
            r0.append(r6)
            java.lang.String r6 = " already not exists"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jpush.android.helper.Logger.d(r4, r6)
            return
    }

    public void a(cn.jpush.android.n.e.a r1) {
            r0 = this;
            r0.f1842f = r1
            return
    }

    public void a(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "will delete geofence="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GeofenceDataHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L1e
            goto L55
        L1e:
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r0 = r3.f1840d
            java.lang.Object r0 = r0.get(r4)
            cn.jpush.android.b.b r0 = (cn.jpush.android.b.b) r0
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r2 = r3.f1841e
            java.lang.Object r2 = r2.get(r4)
            cn.jpush.android.b.b r2 = (cn.jpush.android.b.b) r2
            if (r0 == 0) goto L33
            r3.a(r0)
        L33:
            if (r2 == 0) goto L38
            r3.a(r2)
        L38:
            if (r0 != 0) goto L55
            if (r2 != 0) goto L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "geofence="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = " already not exists"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r4)
        L55:
            return
    }

    public void a(java.lang.String r4, org.json.JSONObject r5, boolean r6) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L25
            if (r5 == 0) goto L25
            int r0 = r5.length()
            if (r0 != 0) goto Lf
            goto L25
        Lf:
            java.lang.String r0 = "type"
            boolean r1 = r5.has(r0)
            r2 = 1
            if (r1 == 0) goto L20
            int r0 = r5.optInt(r0, r2)
        L1c:
            r3.a(r4, r5, r0, r6)
            return
        L20:
            r3.a(r4, r5, r2, r6)
            r0 = 2
            goto L1c
        L25:
            return
    }

    public void a(org.json.JSONArray r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L38
        L3:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L9:
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L16
            int r3 = cn.jpush.android.n.e.f1838c     // Catch: java.lang.Throwable -> L16
            if (r2 > r3) goto L18
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r5 = move-exception
            goto L39
        L18:
            if (r1 >= r3) goto L2a
            org.json.JSONObject r2 = r5.getJSONObject(r1)     // Catch: java.lang.Throwable -> L16
            cn.jpush.android.b.b r2 = cn.jpush.android.b.b.a(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> L16
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L16
            int r1 = r1 + 1
            goto L9
        L2a:
            r4.f1841e = r0
            r5 = 2
            r4.e(r5)
            cn.jpush.android.n.e$a r5 = r4.f1842f
            if (r5 == 0) goto L38
            r0 = 0
            r5.a(r0, r0)
        L38:
            return
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Replace report geofences failed:"
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "GeofenceDataHelper"
            cn.jpush.android.helper.Logger.dd(r0, r5)
            return
    }

    public java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> b() {
            r2 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r1 = r2.f1841e
            r0.putAll(r1)
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r1 = r2.f1840d
            r0.putAll(r1)
            return r0
    }

    public void b(cn.jpush.android.b.b r9) {
            r8 = this;
            boolean r0 = r8.c(r9)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r9.f1737i
            java.util.LinkedHashMap r1 = r8.d(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Before add.Current geofence size:"
            r2.append(r3)
            int r3 = r1.size()
            r2.append(r3)
            java.lang.String r3 = ",type:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GeofenceDataHelper"
            cn.jpush.android.helper.Logger.dd(r3, r2)
            java.lang.String r2 = r9.a
            java.lang.Object r2 = r1.get(r2)
            cn.jpush.android.b.b r2 = (cn.jpush.android.b.b) r2
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L60
            long r6 = r9.f1733e
            long r6 = r6 * r4
            long r3 = java.lang.System.currentTimeMillis()
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 > 0) goto L50
            java.lang.String r9 = r9.a
            r1.remove(r9)
            r8.a(r2)
            goto Lbd
        L50:
            r9.a(r2)
            java.lang.String r3 = r9.a
            r1.put(r3, r9)
            cn.jpush.android.n.e$a r1 = r8.f1842f
            if (r1 == 0) goto Lbd
            r1.a(r2, r9)
            goto Lbd
        L60:
            r2 = 2
            if (r0 != r2) goto L8c
            int r2 = r1.size()
            int r6 = cn.jpush.android.n.e.f1838c
            if (r2 < r6) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Report geofence size limit :"
            r0.append(r1)
            int r1 = cn.jpush.android.n.e.f1838c
            r0.append(r1)
            java.lang.String r1 = ",won't add geofence"
            r0.append(r1)
            java.lang.String r9 = r9.a
        L81:
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            cn.jpush.android.helper.Logger.dd(r3, r9)
            return
        L8c:
            long r6 = r9.f1733e
            long r6 = r6 * r4
            long r4 = java.lang.System.currentTimeMillis()
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto Laa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The geofence "
            r0.append(r1)
            java.lang.String r9 = r9.a
            r0.append(r9)
            java.lang.String r9 = " is out of date, will not create!"
            goto L81
        Laa:
            int r2 = r8.f1839b
            int r2 = r2 + (-1)
            r8.f(r2)
            java.lang.String r2 = r9.a
            r1.put(r2, r9)
            cn.jpush.android.n.e$a r1 = r8.f1842f
            if (r1 == 0) goto Lbd
            r1.a(r9)
        Lbd:
            r8.e(r0)
            return
    }

    public int c() {
            r2 = this;
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r0 = r2.f1840d
            int r0 = r0.size()
            java.util.LinkedHashMap<java.lang.String, cn.jpush.android.b.b> r1 = r2.f1841e
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }
}
