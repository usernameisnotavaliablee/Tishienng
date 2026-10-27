package cn.jpush.android.b;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class c {
    protected android.content.Context a;



    public c(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.a = r2
            cn.jpush.android.n.e r2 = cn.jpush.android.n.e.a()
            cn.jpush.android.b.c$1 r0 = new cn.jpush.android.b.c$1
            r0.<init>(r1)
            r2.a(r0)
            return
    }

    private void a(android.content.Context r11, cn.jpush.android.b.b r12, android.location.Location r13) {
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "GeofenceAction"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "geofence report id="
            r2.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r12.a     // Catch: java.lang.Throwable -> L63
            r2.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L63
            cn.jpush.android.helper.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L63
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "geofence_id"
            java.lang.String r12 = r12.a     // Catch: java.lang.Throwable -> L63
            r2.put(r3, r12)     // Catch: java.lang.Throwable -> L63
            if (r13 == 0) goto L66
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            r12.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "lat"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r4.<init>()     // Catch: java.lang.Throwable -> L63
            double r5 = r13.getLatitude()     // Catch: java.lang.Throwable -> L63
            r4.append(r5)     // Catch: java.lang.Throwable -> L63
            r4.append(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L63
            r12.put(r3, r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "lng"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r4.<init>()     // Catch: java.lang.Throwable -> L63
            double r5 = r13.getLongitude()     // Catch: java.lang.Throwable -> L63
            r4.append(r5)     // Catch: java.lang.Throwable -> L63
            r4.append(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = r4.toString()     // Catch: java.lang.Throwable -> L63
            r12.put(r3, r13)     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = "gps"
            r2.put(r13, r12)     // Catch: java.lang.Throwable -> L63
            goto L66
        L63:
            r0 = move-exception
            r11 = r0
            goto L95
        L66:
            r12 = 2
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L63
            r13 = 0
            r8[r13] = r2     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "geo_fence"
            r9 = 1
            r8[r9] = r0     // Catch: java.lang.Throwable -> L63
            r3 = 0
            r4 = 0
            r5 = 26
            r6 = 0
            r7 = 0
            java.lang.Object r0 = cn.jiguang.api.JCoreManager.onEvent(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L94
            java.lang.String r4 = "JPUSH"
            cn.jpush.android.b.c$2 r0 = new cn.jpush.android.b.c$2     // Catch: java.lang.Throwable -> L63
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L63
            r8[r13] = r2     // Catch: java.lang.Throwable -> L63
            r8[r9] = r0     // Catch: java.lang.Throwable -> L63
            r5 = 15
            r6 = 0
            r7 = 0
            r3 = r11
            cn.jiguang.api.JCoreManager.onEvent(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L63
        L94:
            return
        L95:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "report geofence error:"
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            cn.jpush.android.helper.Logger.w(r1, r11)
            return
    }

    protected void a() {
            r0 = this;
            return
    }

    public void a(long r1) {
            r0 = this;
            return
    }

    protected abstract void a(cn.jpush.android.b.b r1);

    protected void a(cn.jpush.android.b.b r4, android.location.Location r5) {
            r3 = this;
            java.lang.String r0 = "GeofenceAction"
            if (r4 == 0) goto L35
            int r1 = r4.f1737i     // Catch: java.lang.Throwable -> Lf
            r2 = 2
            if (r1 != r2) goto L11
            android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> Lf
            r3.a(r1, r4, r5)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r4 = move-exception
            goto L21
        L11:
            cn.jpush.android.d.d r4 = r4.t     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L1b
            android.content.Context r5 = r3.a     // Catch: java.lang.Throwable -> Lf
            cn.jpush.android.d.b.a(r5, r4)     // Catch: java.lang.Throwable -> Lf
            return
        L1b:
            java.lang.String r4 = "there is no push entity, won't show notification"
            cn.jpush.android.helper.Logger.w(r0, r4)     // Catch: java.lang.Throwable -> Lf
            return
        L21:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "process geofence error:"
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.ww(r0, r4)
        L35:
            return
    }

    protected abstract void a(cn.jpush.android.b.b r1, cn.jpush.android.b.b r2);

    public void b() {
            r0 = this;
            return
    }

    protected abstract void b(cn.jpush.android.b.b r1);
}
