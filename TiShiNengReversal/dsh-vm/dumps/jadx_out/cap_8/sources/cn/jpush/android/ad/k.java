package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {
    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Object a(java.lang.Object r4, java.lang.String r5, java.lang.Class[] r6, java.lang.Object[] r7) {
            r0 = 0
            if (r7 == 0) goto L5
            int r1 = r7.length
            goto L6
        L5:
            r1 = 0
        L6:
            if (r6 == 0) goto La
            int r2 = r6.length
            goto Lb
        La:
            r2 = 0
        Lb:
            if (r1 != r2) goto L32
            java.lang.Class r1 = r4.getClass()
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)
            boolean r6 = r5.isAccessible()
            if (r6 != 0) goto L1f
            r1 = 1
            r5.setAccessible(r1)
        L1f:
            r1 = 0
            java.lang.Object r4 = r5.invoke(r4, r7)     // Catch: java.lang.Exception -> L25
            goto L29
        L25:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L29:
            if (r6 != 0) goto L2e
            r5.setAccessible(r0)
        L2e:
            if (r1 != 0) goto L31
            return r4
        L31:
            throw r1
        L32:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "argClasses' size is not equal to args' size"
            r4.<init>(r5)
            throw r4
    }
}
