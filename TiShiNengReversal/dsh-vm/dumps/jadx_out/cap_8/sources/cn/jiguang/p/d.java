package cn.jiguang.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.List<cn.jiguang.n.c> a(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            cn.jiguang.n.c r0 = new cn.jiguang.n.c
            r0.<init>()
            r0.a = r5
            r0.f1342b = r6
            if (r4 == 0) goto L2c
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L2c
            java.util.List r4 = cn.jiguang.p.c.a(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cache cmd wakeTargets:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JWakePackageHelper"
            cn.jiguang.w.f.c(r2, r1)
            goto L2d
        L2c:
            r4 = 0
        L2d:
            r1 = 1
            if (r4 == 0) goto L60
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L60
            int r2 = r4.size()
            int r2 = r2 - r1
        L3b:
            if (r2 < 0) goto L60
            java.lang.Object r3 = r4.get(r2)
            cn.jiguang.n.c r3 = (cn.jiguang.n.c) r3
            java.lang.String r3 = r3.a
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r4.get(r2)
            cn.jiguang.n.c r3 = (cn.jiguang.n.c) r3
            java.lang.String r3 = r3.f1342b
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L5d
            r4.remove(r2)
            goto L60
        L5d:
            int r2 = r2 + (-1)
            goto L3b
        L60:
            if (r4 != 0) goto L67
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L67:
            if (r7 != r1) goto L6c
            r4.add(r0)
        L6c:
            return r4
    }
}
