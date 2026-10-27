package cn.jiguang.commons.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    public java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    public long f1001c;

    /* renamed from: d, reason: collision with root package name */
    public int f1002d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f1003e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f1004f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f1005g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f1006h;

    public d() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1004f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1003e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1005g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1006h = r0
            return
    }

    private static java.lang.CharSequence a(java.lang.CharSequence r1, int r2) {
            if (r2 < 0) goto Ld
            int r0 = r1.length()
            if (r2 >= r0) goto Ld
            r0 = 0
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
        Ld:
            return r1
    }

    public org.json.JSONObject a(int r9) {
            r8 = this;
            r0 = 0
            long r1 = r8.f1001c     // Catch: java.lang.Throwable -> Lca
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1a
            java.util.List r1 = r8.f1004f     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto L1a
            java.util.List r1 = r8.f1005g     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto L1a
            return r0
        L1a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lca
            r1.<init>()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r2 = "pkg"
            java.lang.String r5 = r8.a     // Catch: java.lang.Throwable -> Lca
            java.lang.CharSequence r9 = a(r5, r9)     // Catch: java.lang.Throwable -> Lca
            org.json.JSONObject r9 = r1.put(r2, r9)     // Catch: java.lang.Throwable -> Lca
            long r1 = r8.f1001c     // Catch: java.lang.Throwable -> Lca
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L36
            java.lang.String r5 = "active_duration"
            r9.put(r5, r1)     // Catch: java.lang.Throwable -> Lca
        L36:
            java.util.List r1 = r8.f1004f     // Catch: java.lang.Throwable -> Lca
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lca
            if (r1 <= 0) goto L66
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lca
            r1.<init>()     // Catch: java.lang.Throwable -> Lca
            java.util.List r2 = r8.f1004f     // Catch: java.lang.Throwable -> Lca
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lca
        L49:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> Lca
            if (r5 == 0) goto L61
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> Lca
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> Lca
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> Lca
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L49
            r1.put(r5)     // Catch: java.lang.Throwable -> Lca
            goto L49
        L61:
            java.lang.String r2 = "active_time"
            r9.put(r2, r1)     // Catch: java.lang.Throwable -> Lca
        L66:
            java.util.List r1 = r8.f1003e     // Catch: java.lang.Throwable -> Lca
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lca
            if (r1 <= 0) goto L94
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lca
            r1.<init>()     // Catch: java.lang.Throwable -> Lca
            java.util.List r2 = r8.f1003e     // Catch: java.lang.Throwable -> Lca
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lca
        L79:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lca
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> Lca
            int r4 = r3.intValue()     // Catch: java.lang.Throwable -> Lca
            if (r4 <= 0) goto L79
            r1.put(r3)     // Catch: java.lang.Throwable -> Lca
            goto L79
        L8f:
            java.lang.String r2 = "source"
            r9.put(r2, r1)     // Catch: java.lang.Throwable -> Lca
        L94:
            java.util.List r1 = r8.f1005g     // Catch: java.lang.Throwable -> Lca
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lca
            if (r1 <= 0) goto Lc2
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lca
            r1.<init>()     // Catch: java.lang.Throwable -> Lca
            java.util.List r2 = r8.f1005g     // Catch: java.lang.Throwable -> Lca
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lca
        La7:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lca
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lca
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lca
            if (r4 != 0) goto La7
            r1.put(r3)     // Catch: java.lang.Throwable -> Lca
            goto La7
        Lbd:
            java.lang.String r2 = "page_name"
            r9.put(r2, r1)     // Catch: java.lang.Throwable -> Lca
        Lc2:
            java.lang.String r1 = "launch_count"
            int r2 = r8.f1002d     // Catch: java.lang.Throwable -> Lca
            r9.put(r1, r2)     // Catch: java.lang.Throwable -> Lca
            return r9
        Lca:
            return r0
    }
}
