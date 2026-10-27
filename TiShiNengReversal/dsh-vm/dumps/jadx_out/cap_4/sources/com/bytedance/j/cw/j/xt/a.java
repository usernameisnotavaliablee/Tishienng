package com.bytedance.j.cw.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class a implements com.bytedance.j.cw.j.xt.xt, java.lang.Comparable<com.bytedance.j.cw.j.xt.a>, java.lang.Runnable {
    private com.bytedance.j.cw.j.xt.xt.j a;
    private java.lang.String b;

    public a() {
            r3 = this;
            r3.<init>()
            com.bytedance.j.cw.j.xt.xt$j r0 = com.bytedance.j.cw.j.xt.xt.j.xt
            r3.a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            long r1 = java.lang.System.nanoTime()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.b = r0
            return
    }

    public int a(com.bytedance.j.cw.j.xt.a r3) {
            r2 = this;
            com.bytedance.j.cw.j.xt.xt$j r0 = r2.b()
            int r0 = r0.j()
            com.bytedance.j.cw.j.xt.xt$j r1 = r3.b()
            int r1 = r1.j()
            if (r0 >= r1) goto L14
            r3 = 1
            return r3
        L14:
            com.bytedance.j.cw.j.xt.xt$j r0 = r2.b()
            int r0 = r0.j()
            com.bytedance.j.cw.j.xt.xt$j r3 = r3.b()
            int r3 = r3.j()
            if (r0 <= r3) goto L28
            r3 = -1
            return r3
        L28:
            r3 = 0
            return r3
    }

    public com.bytedance.j.cw.j.xt.xt.j b() {
            r1 = this;
            com.bytedance.j.cw.j.xt.xt$j r0 = r1.a
            return r0
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.bytedance.j.cw.j.xt.a r1) {
            r0 = this;
            com.bytedance.j.cw.j.xt.a r1 = (com.bytedance.j.cw.j.xt.a) r1
            int r1 = r0.a(r1)
            return r1
    }
}
