package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ct {
    private static int a;
    private static boolean b;

    public ct() {
            r0 = this;
            r0.<init>()
            r0.b()
            return
    }

    private int a(java.lang.reflect.Method r3) {
            r2 = this;
            int r0 = com.kuaishou.weapon.p0.ct.a     // Catch: java.lang.Exception -> L10
            r1 = 1
            if (r0 <= r1) goto L10
            if (r3 == 0) goto L10
            int r1 = r3.getModifiers()     // Catch: java.lang.Exception -> L10
            int r3 = com.kuaishou.weapon.p0.jni.Engine.mmo(r3, r0, r1)     // Catch: java.lang.Exception -> L10
            return r3
        L10:
            r3 = 0
            return r3
    }

    private void b() {
            r2 = this;
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess
            if (r0 == 0) goto L21
            boolean r0 = com.kuaishou.weapon.p0.ct.b
            if (r0 != 0) goto L21
            boolean r0 = com.kuaishou.weapon.p0.cr.b()
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r0 == 0) goto L1e
            r0 = 29
            if (r1 >= r0) goto L1e
            r0 = 22
            if (r1 <= r0) goto L1e
            int r0 = com.kuaishou.weapon.p0.jni.Engine.off()
            com.kuaishou.weapon.p0.ct.a = r0
        L1e:
            r0 = 1
            com.kuaishou.weapon.p0.ct.b = r0
        L21:
            return
    }

    private boolean c() {
            r2 = this;
            boolean r0 = com.kuaishou.weapon.p0.ct.b
            if (r0 == 0) goto La
            int r0 = com.kuaishou.weapon.p0.ct.a
            r1 = 1
            if (r0 <= r1) goto La
            return r1
        La:
            r0 = 0
            return r0
    }

    public int a() {
            r7 = this;
            boolean r0 = r7.c()
            if (r0 == 0) goto L1b
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            long r0 = r0.a()
            com.kuaishou.weapon.p0.cq r2 = com.kuaishou.weapon.p0.cq.a
            long r2 = r2.a()
            int r4 = com.kuaishou.weapon.p0.ct.a
            long r4 = (long) r4
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L1b
            int r0 = (int) r2
            return r0
        L1b:
            r0 = -1
            return r0
    }

    public int a(int r2, java.lang.Class r3, java.lang.String r4, java.lang.Object... r5) {
            r1 = this;
            boolean r0 = r1.c()     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L11
            java.lang.reflect.Method r3 = com.kuaishou.weapon.p0.dh.a(r3, r4, r5)     // Catch: java.lang.Exception -> L11
            if (r3 == 0) goto L11
            int r2 = com.kuaishou.weapon.p0.jni.Engine.mqc(r3, r2)     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            r2 = 0
            return r2
    }

    public int a(java.lang.Class r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            boolean r0 = r1.c()     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto Lf
            java.lang.reflect.Method r2 = com.kuaishou.weapon.p0.dh.a(r2, r3, r4)     // Catch: java.lang.Exception -> Lf
            int r2 = r1.a(r2)     // Catch: java.lang.Exception -> Lf
            return r2
        Lf:
            r2 = 0
            return r2
    }
}
