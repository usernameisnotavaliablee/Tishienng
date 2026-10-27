package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class q {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private final java.lang.Object a;

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.Class f124b;

        public a(java.lang.Object r1, java.lang.Class r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f124b = r2
                return
        }

        java.lang.Object a() {
                r1 = this;
                java.lang.Object r0 = r1.a
                return r0
        }

        java.lang.Class getType() {
                r1 = this;
                java.lang.Class r0 = r1.f124b
                return r0
        }
    }

    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.Object r5, java.lang.String r6, cn.bluemobi.dylan.base.utils.q.a... r7) {
            if (r5 != 0) goto L3
            goto L3b
        L3:
            r0 = 0
            if (r7 != 0) goto L9
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3b
            goto Lc
        L9:
            int r1 = r7.length     // Catch: java.lang.Throwable -> L3b
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L3b
        Lc:
            if (r7 != 0) goto L11
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3b
            goto L14
        L11:
            int r2 = r7.length     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3b
        L14:
            if (r7 == 0) goto L2c
            int r3 = r1.length     // Catch: java.lang.Throwable -> L3b
        L17:
            if (r0 >= r3) goto L2c
            r4 = r7[r0]     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r4 = r4.getType()     // Catch: java.lang.Throwable -> L3b
            r1[r0] = r4     // Catch: java.lang.Throwable -> L3b
            r4 = r7[r0]     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> L3b
            r2[r0] = r4     // Catch: java.lang.Throwable -> L3b
            int r0 = r0 + 1
            goto L17
        L2c:
            java.lang.Class r7 = r5.getClass()     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method r6 = r7.getDeclaredMethod(r6, r1)     // Catch: java.lang.Throwable -> L3b
            r7 = 1
            r6.setAccessible(r7)     // Catch: java.lang.Throwable -> L3b
            r6.invoke(r5, r2)     // Catch: java.lang.Throwable -> L3b
        L3b:
            return
    }
}
