package com.bytedance.j.xt.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {
    private java.util.List<com.bytedance.j.xt.m.b> a;

    private a(android.os.Handler r8, android.content.Context r9) {
            r7 = this;
            r7.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r0 = 3
            r9.<init>(r0)
            r7.a = r9
            com.bytedance.j.xt.m.c r1 = new com.bytedance.j.xt.m.c
            r3 = 0
            r5 = 15000(0x3a98, double:7.411E-320)
            r2 = r8
            r1.<init>(r2, r3, r5)
            r9.add(r1)
            return
    }

    public static com.bytedance.j.xt.m.a a(android.os.Handler r1, android.content.Context r2) {
            com.bytedance.j.xt.m.a r0 = new com.bytedance.j.xt.m.a
            r0.<init>(r1, r2)
            return r0
    }

    public void b() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[ScheduleTaskManager] execute, task size="
            r0.<init>(r1)
            java.util.List<com.bytedance.j.xt.m.b> r1 = r2.a
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.j.xt.tl.i.a(r0)
            java.util.List<com.bytedance.j.xt.m.b> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            com.bytedance.j.xt.m.b r1 = (com.bytedance.j.xt.m.b) r1
            r1.b()     // Catch: java.lang.Throwable -> L2d
            goto L1d
        L2d:
            goto L1d
        L2f:
            return
    }
}
