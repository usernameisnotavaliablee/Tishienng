package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cy {
    private static volatile com.kuaishou.weapon.p0.cy b;
    private android.content.Context a;


    private cy(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* synthetic */ android.content.Context a(com.kuaishou.weapon.p0.cy r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    public static com.kuaishou.weapon.p0.cy a(android.content.Context r2) {
            com.kuaishou.weapon.p0.cy r0 = com.kuaishou.weapon.p0.cy.b
            if (r0 != 0) goto L19
            java.lang.Class<com.kuaishou.weapon.p0.cy> r0 = com.kuaishou.weapon.p0.cy.class
            monitor-enter(r0)
            com.kuaishou.weapon.p0.cy r1 = com.kuaishou.weapon.p0.cy.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kuaishou.weapon.p0.cy r1 = new com.kuaishou.weapon.p0.cy     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.kuaishou.weapon.p0.cy.b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.kuaishou.weapon.p0.cy r2 = com.kuaishou.weapon.p0.cy.b
            return r2
    }

    public void a(int r5) {
            r4 = this;
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "re_po_rt"
            com.kuaishou.weapon.p0.h r0 = com.kuaishou.weapon.p0.h.a(r0, r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "a1_p_s_p_s"
            boolean r1 = r0.e(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "a1_p_s_p_s_c_b"
            boolean r0 = r0.e(r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L19
            if (r0 != 0) goto L19
            goto L2a
        L19:
            boolean r2 = com.kuaishou.weapon.p0.WeaponHI.as     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L1e
            goto L2a
        L1e:
            com.kuaishou.weapon.p0.n r2 = com.kuaishou.weapon.p0.n.a()     // Catch: java.lang.Throwable -> L2a
            com.kuaishou.weapon.p0.cy$1 r3 = new com.kuaishou.weapon.p0.cy$1     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r4, r1, r0, r5)     // Catch: java.lang.Throwable -> L2a
            r2.a(r3)     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }
}
