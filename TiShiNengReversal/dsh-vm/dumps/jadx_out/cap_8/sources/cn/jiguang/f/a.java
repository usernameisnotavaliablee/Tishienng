package cn.jiguang.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements cn.jiguang.commons.j.c {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.os.Bundle r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "callback: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CommonCallback"
            cn.jiguang.w.f.c(r1, r0)
            if (r4 != 0) goto L19
            goto L76
        L19:
            java.lang.String r0 = "action"
            java.lang.String r4 = r4.getString(r0)     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L76
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L28
            goto L76
        L28:
            java.lang.String r0 = "s_c"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L3a
            android.content.Context r4 = cn.jiguang.av.c.a()     // Catch: java.lang.Throwable -> L76
            r0 = 86
            cn.jiguang.i.a.a(r4, r0)     // Catch: java.lang.Throwable -> L76
            return
        L3a:
            java.lang.String r0 = "ser_done"
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L76
            android.content.Context r4 = cn.jiguang.av.c.a()     // Catch: java.lang.Throwable -> L76
            cn.jiguang.f.b$a r4 = cn.jiguang.f.b.a.a(r4)     // Catch: java.lang.Throwable -> L76
            boolean r4 = r4.b()     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r0.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "ser_done:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L76
            r0.append(r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L76
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L76
            android.content.Context r0 = cn.jiguang.av.c.a()     // Catch: java.lang.Throwable -> L76
            cn.jiguang.f.b$a r0 = cn.jiguang.f.b.a.a(r0)     // Catch: java.lang.Throwable -> L76
            r0.a()     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto L76
            android.content.Context r4 = cn.jiguang.av.c.a()     // Catch: java.lang.Throwable -> L76
            cn.jiguang.ai.a.b(r4)     // Catch: java.lang.Throwable -> L76
        L76:
            return
    }

    private void a(org.json.JSONObject r2) {
            r1 = this;
            android.content.Context r0 = cn.jiguang.av.c.a()     // Catch: java.lang.Throwable -> L7
            cn.jiguang.z.b.a(r0, r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    @Override // cn.jiguang.commons.j.c
    public void c(android.os.Bundle r1) {
            r0 = this;
            r0.a(r1)
            return
    }

    @Override // cn.jiguang.commons.j.c
    public void r(org.json.JSONObject r1) {
            r0 = this;
            r0.a(r1)
            return
    }
}
