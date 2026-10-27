package cn.jiguang.commons.o;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private android.content.Context a;

    /* renamed from: c, reason: collision with root package name */
    private android.net.Uri f1177c;

    public c(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.lang.String r3 = "k97muQEI3n3mlJTZdD9q3lC6tvCVkeY7wPOrf0wd0l4zQtrGyn5uq0enBKOySISr"
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "url: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NubiaOpenIDHelper"
            cn.jiguang.commons.w.a.a(r1, r0)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r2.f1177c = r3
            return
    }

    public java.lang.String a() {
            r3 = this;
            android.content.Context r0 = r3.a     // Catch: java.lang.Exception -> L9
            android.net.Uri r1 = r3.f1177c     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = cn.jiguang.commons.o.a.a(r0, r1)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get Ids-oa error: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "NubiaOpenIDHelper"
            cn.jiguang.commons.w.a.f(r1, r0)
            java.lang.String r0 = ""
            return r0
    }
}
