package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class w extends ms.bz.bd.c.Pgl.pbly.pgla {
    w() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    protected final java.lang.Object b(long r8, java.lang.String r10, java.lang.Object r11) throws java.lang.Throwable {
            r7 = this;
            ms.bz.bd.c.Pgl.p1 r8 = ms.bz.bd.c.Pgl.p1.a()
            java.lang.Throwable r8 = r8.b()
            r9 = 0
            if (r8 != 0) goto Lc
            return r9
        Lc:
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            int r10 = r8.length
            r11 = 4
            if (r10 >= r11) goto L15
            return r9
        L15:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 1
        L1b:
            if (r10 >= r11) goto L6f
            r0 = r8[r10]
            if (r0 == 0) goto L6c
            java.lang.String r0 = r0.getClassName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6c
            r0 = r8[r10]
            java.lang.String r0 = r0.getClassName()
            java.lang.Class r0 = java.lang.Class.forName(r0)
            ms.bz.bd.c.Pgl.p1 r1 = ms.bz.bd.c.Pgl.p1.a()
            r2 = r8[r10]
            java.lang.String r2 = r2.getMethodName()
            r1.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L69
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            int r3 = r0.length
            r4 = 0
        L53:
            if (r4 >= r3) goto L69
            r5 = r0[r4]
            if (r5 == 0) goto L66
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L66
            r1.add(r5)
        L66:
            int r4 = r4 + 1
            goto L53
        L69:
            r9.addAll(r1)
        L6c:
            int r10 = r10 + 1
            goto L1b
        L6f:
            return r9
    }
}
