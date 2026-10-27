package cn.jiguang.commons.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m {
    private final java.util.Map a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.Map f1067c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.Map f1068d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.List f1069e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.List f1070f;

    /* renamed from: g, reason: collision with root package name */
    private final java.util.List f1071g;

    public m() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f1067c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f1068d = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f1069e = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f1070f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f1071g = r0
            r1.c()
            return
    }

    private void c() {
            r3 = this;
            java.util.Map r0 = r3.a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "gps_enabled"
            r0.put(r2, r1)
            java.util.Map r0 = r3.a
            java.lang.String r2 = "wifi_enabled"
            r0.put(r2, r1)
            java.util.Map r0 = r3.a
            java.lang.String r2 = "cell_enabled"
            r0.put(r2, r1)
            java.util.Map r0 = r3.f1067c
            r1 = 800000(0xc3500, double:3.952525E-318)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "gps_interval"
            r0.put(r2, r1)
            java.util.Map r0 = r3.f1067c
            java.lang.String r2 = "wifi_interval"
            r0.put(r2, r1)
            java.util.Map r0 = r3.f1067c
            java.lang.String r2 = "cell_interval"
            r0.put(r2, r1)
            java.util.Map r0 = r3.f1067c
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "report_interval"
            r0.put(r2, r1)
            java.util.Map r0 = r3.f1067c
            r1 = 240000(0x3a980, double:1.18576E-318)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "gps_update_interval"
            r0.put(r2, r1)
            java.util.Map r0 = r3.f1068d
            r1 = 20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "wifi_count"
            r0.put(r2, r1)
            java.util.Map r0 = r3.f1068d
            r1 = -90
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "wifi_min_level"
            r0.put(r2, r1)
            java.util.Map r0 = r3.f1068d
            r1 = 30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "new_wifi_percent"
            r0.put(r2, r1)
            java.util.Map r0 = r3.f1068d
            r1 = 800(0x320, float:1.121E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "gps_update_distance"
            r0.put(r2, r1)
            return
    }

    public long a(java.lang.String r4) {
            r3 = this;
            java.util.Map r0 = r3.f1067c
            java.lang.Object r0 = r0.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto Lf
            long r0 = r0.longValue()
            return r0
        Lf:
            java.lang.String r0 = "gps_interval"
            boolean r0 = r0.equals(r4)
            r1 = 800000(0xc3500, double:3.952525E-318)
            if (r0 == 0) goto L1b
            return r1
        L1b:
            java.lang.String r0 = "wifi_interval"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L25
            return r1
        L25:
            java.lang.String r0 = "cell_interval"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L2e
            return r1
        L2e:
            java.lang.String r0 = "report_interval"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L3a
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            return r0
        L3a:
            java.lang.String r0 = "gps_update_interval"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L46
            r0 = 240000(0x3a980, double:1.18576E-318)
            return r0
        L46:
            r0 = 0
            return r0
    }

    public java.util.List a() {
            r1 = this;
            java.util.List r0 = r1.f1071g
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public void a(java.lang.String r2, int r3) {
            r1 = this;
            java.util.Map r0 = r1.f1068d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public void a(java.lang.String r4, long r5) {
            r3 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lf
            java.util.Map r0 = r3.f1067c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r4, r5)
        Lf:
            return
    }

    public void a(java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.Map r0 = r1.a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public void a(java.util.List r2) {
            r1 = this;
            java.util.List r0 = r1.f1071g
            r0.clear()
            if (r2 == 0) goto Lc
            java.util.List r0 = r1.f1071g
            r0.addAll(r2)
        Lc:
            return
    }

    public int c(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.f1068d
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r2 = r0.intValue()
            return r2
        Lf:
            java.lang.String r0 = "wifi_min_level"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1b
            r2 = -90
            return r2
        L1b:
            java.lang.String r0 = "wifi_count"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            r2 = 20
            return r2
        L27:
            java.lang.String r0 = "new_wifi_percent"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L32
            r2 = 30
            return r2
        L32:
            java.lang.String r0 = "gps_update_distance"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L3d
            r2 = 800(0x320, float:1.121E-42)
            return r2
        L3d:
            r2 = 0
            return r2
    }

    public boolean d(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto Lf
            boolean r2 = r2.booleanValue()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public boolean e(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.List r0 = r1.f1069e
            java.lang.String r2 = r2.trim()
            boolean r2 = r0.contains(r2)
            return r2
    }

    public boolean f(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.List r0 = r1.f1070f
            java.lang.String r2 = r2.trim()
            boolean r2 = r0.contains(r2)
            return r2
    }

    public void g(java.lang.String r5) {
            r4 = this;
            java.util.List r0 = r4.f1069e
            r0.clear()
            if (r5 == 0) goto L27
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L27
            java.lang.String r0 = ","
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r1 = 0
        L15:
            if (r1 >= r0) goto L27
            r2 = r5[r1]
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L24
            java.util.List r3 = r4.f1069e
            r3.add(r2)
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            return
    }

    public void h(java.lang.String r5) {
            r4 = this;
            java.util.List r0 = r4.f1070f
            r0.clear()
            if (r5 == 0) goto L27
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L27
            java.lang.String r0 = ","
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r1 = 0
        L15:
            if (r1 >= r0) goto L27
            r2 = r5[r1]
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L24
            java.util.List r3 = r4.f1070f
            r3.add(r2)
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LocationConfig{featureFlags="
            r0.append(r1)
            java.util.Map r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", intervals="
            r0.append(r1)
            java.util.Map r1 = r2.f1067c
            r0.append(r1)
            java.lang.String r1 = ", thresholds="
            r0.append(r1)
            java.util.Map r1 = r2.f1068d
            r0.append(r1)
            java.lang.String r1 = ", packageBlacklist="
            r0.append(r1)
            java.util.List r1 = r2.f1069e
            r0.append(r1)
            java.lang.String r1 = ", serviceBlacklist="
            r0.append(r1)
            java.util.List r1 = r2.f1070f
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
