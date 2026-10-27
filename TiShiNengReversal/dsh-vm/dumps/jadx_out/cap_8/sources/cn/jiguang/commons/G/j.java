package cn.jiguang.commons.G;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(cn.jiguang.commons.bean.EddystoneData r2, cn.jiguang.commons.bean.EddystoneData r3) {
            int r0 = r3.a()
            r1 = -1
            if (r0 == r1) goto Le
            int r0 = r3.a()
            r2.a(r0)
        Le:
            java.lang.String r0 = r3.c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = r3.c()
            r2.a(r0)
        L1f:
            java.util.List r0 = r3.e()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L30
            java.util.List r0 = r3.e()
            r2.a(r0)
        L30:
            java.lang.String r0 = r3.i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = r3.i()
            r2.c(r0)
        L41:
            java.util.List r0 = r3.j()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L52
            java.util.List r0 = r3.j()
            r2.d(r0)
        L52:
            int r0 = r3.l()
            if (r0 == 0) goto L5f
            int r0 = r3.l()
            r2.g(r0)
        L5f:
            int r0 = r3.k()
            if (r0 == 0) goto L6c
            int r0 = r3.k()
            r2.f(r0)
        L6c:
            int r0 = r3.g()
            if (r0 == 0) goto L79
            int r0 = r3.g()
            r2.d(r0)
        L79:
            int r0 = r3.h()
            if (r0 == 0) goto L86
            int r0 = r3.h()
            r2.e(r0)
        L86:
            int r0 = r3.d()
            if (r0 == 0) goto L93
            int r0 = r3.d()
            r2.c(r0)
        L93:
            java.util.List r0 = r3.f()
            if (r0 == 0) goto La2
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto La2
            r2.c(r0)
        La2:
            java.util.List r3 = r3.j()
            if (r3 == 0) goto Lb1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb1
            r2.d(r3)
        Lb1:
            return
    }

    private static void a(cn.jiguang.commons.bean.IBeaconData r1, cn.jiguang.commons.bean.IBeaconData r2) {
            java.lang.String r0 = r2.e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L11
            java.lang.String r0 = r2.e()
            r1.a(r0)
        L11:
            int r0 = r2.a()
            if (r0 == 0) goto L1e
            int r0 = r2.a()
            r1.a(r0)
        L1e:
            int r0 = r2.d()
            if (r0 == 0) goto L2b
            int r0 = r2.d()
            r1.d(r0)
        L2b:
            int r0 = r2.c()
            if (r0 == 0) goto L38
            int r2 = r2.c()
            r1.c(r2)
        L38:
            return
    }

    public static void a(cn.jiguang.commons.bean.Peripheral r6, cn.jiguang.commons.bean.Peripheral r7) {
            java.lang.String r0 = "PeripheralMerger"
            if (r6 == 0) goto L3d
            if (r7 != 0) goto L7
            goto L3d
        L7:
            java.lang.String r1 = r6.a()
            int r2 = r6.i()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r7.i()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r3
            java.lang.String r1 = "merging device info: address=%s, target_type=%d, source_type=%d"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            cn.jiguang.commons.w.a.a(r0, r1)
            c(r6, r7)
            f(r6, r7)
            d(r6, r7)
            e(r6, r7)
            return
        L3d:
            java.lang.String r6 = "mergePeripheralInfo: target or source is null"
            cn.jiguang.commons.w.a.f(r0, r6)
            return
    }

    private static void c(cn.jiguang.commons.bean.Peripheral r2, cn.jiguang.commons.bean.Peripheral r3) {
            int r0 = r3.i()
            if (r0 <= 0) goto Ld
            int r0 = r3.i()
            r2.e(r0)
        Ld:
            int r0 = r3.d()
            if (r0 <= 0) goto L1a
            int r0 = r3.d()
            r2.c(r0)
        L1a:
            java.lang.String r0 = r3.g()
            if (r0 == 0) goto L31
            java.lang.String r0 = r3.g()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L31
            java.lang.String r0 = r3.g()
            r2.d(r0)
        L31:
            int r0 = r3.c()
            if (r0 == 0) goto L3e
            int r0 = r3.c()
            r2.a(r0)
        L3e:
            int r0 = r3.h()
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.h()
            int r1 = java.lang.Math.abs(r1)
            if (r0 >= r1) goto L57
            int r3 = r3.h()
            r2.d(r3)
        L57:
            return
    }

    private static void d(cn.jiguang.commons.bean.Peripheral r1, cn.jiguang.commons.bean.Peripheral r2) {
            cn.jiguang.commons.bean.EddystoneData r0 = r2.e()
            if (r0 == 0) goto L17
            cn.jiguang.commons.bean.EddystoneData r0 = r1.e()
            cn.jiguang.commons.bean.EddystoneData r2 = r2.e()
            if (r0 != 0) goto L14
            r1.a(r2)
            return
        L14:
            a(r0, r2)
        L17:
            return
    }

    private static void e(cn.jiguang.commons.bean.Peripheral r1, cn.jiguang.commons.bean.Peripheral r2) {
            cn.jiguang.commons.bean.IBeaconData r0 = r2.f()
            if (r0 == 0) goto L17
            cn.jiguang.commons.bean.IBeaconData r0 = r1.f()
            cn.jiguang.commons.bean.IBeaconData r2 = r2.f()
            if (r0 != 0) goto L14
            r1.a(r2)
            return
        L14:
            a(r0, r2)
        L17:
            return
    }

    private static void f(cn.jiguang.commons.bean.Peripheral r2, cn.jiguang.commons.bean.Peripheral r3) {
            java.util.List r0 = r3.j()
            if (r0 == 0) goto L32
            java.util.List r0 = r3.j()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L32
            java.util.List r3 = r3.j()
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r1 = r2.j()
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L18
            r2.a(r0)
            goto L18
        L32:
            return
    }
}
