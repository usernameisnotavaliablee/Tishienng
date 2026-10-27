package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r5) {
            java.lang.String r0 = c(r5)
            java.lang.String r1 = cn.jiguang.d.a.e(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "appkey="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " last="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "InitHelper"
            cn.jiguang.w.f.c(r3, r2)
            boolean r2 = cn.jiguang.av.v.a(r0)
            r4 = 0
            if (r2 != 0) goto L3d
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3d
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.as()
            java.lang.String r2 = cn.jiguang.a.a.f243j
            java.lang.String r1 = cn.jiguang.av.t.a(r1, r2)
            cn.jiguang.e.a r0 = r0.a(r1)
            r1 = 1
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r1]
            r2[r4] = r0
            cn.jiguang.e.b.a(r5, r2)
            java.lang.String r0 = "We found the appKey is changed or register appkey is empty. Will re-register."
            cn.jiguang.w.f.d(r3, r0)
            cn.jiguang.z.b.a(r5)
            return r1
    }

    public static void b(android.content.Context r3) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.al()
            java.lang.Object r0 = cn.jiguang.e.b.a(r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r1 = "1."
            boolean r1 = r0.startsWith(r1)
        L16:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "5.3.1"
            if (r1 != 0) goto L26
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L25
            goto L26
        L25:
            return
        L26:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.al()
            cn.jiguang.e.a r0 = r0.a(r2)
            r1 = 1
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]
            r2 = 0
            r1[r2] = r0
            cn.jiguang.e.b.a(r3, r1)
            return
    }

    private static java.lang.String c(android.content.Context r5) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.as()
            java.lang.Object r0 = cn.jiguang.e.b.a(r5, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L17
            java.lang.String r5 = cn.jiguang.a.a.f243j
            java.lang.String r5 = cn.jiguang.av.t.b(r0, r5)
            return r5
        L17:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.at()
            java.lang.Object r0 = cn.jiguang.e.b.a(r5, r0)
            java.lang.String r0 = (java.lang.String) r0
            cn.jiguang.e.a r1 = cn.jiguang.e.a.as()
            java.lang.String r2 = cn.jiguang.a.a.f243j
            java.lang.String r2 = cn.jiguang.av.t.a(r0, r2)
            cn.jiguang.e.a r1 = r1.a(r2)
            r2 = 1
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r2]
            r4 = 0
            r3[r4] = r1
            cn.jiguang.e.b.a(r5, r3)
            cn.jiguang.e.a r1 = cn.jiguang.e.a.at()
            java.lang.String r3 = ""
            cn.jiguang.e.a r1 = r1.a(r3)
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r2]
            r2[r4] = r1
            cn.jiguang.e.b.a(r5, r2)
            return r0
    }
}
