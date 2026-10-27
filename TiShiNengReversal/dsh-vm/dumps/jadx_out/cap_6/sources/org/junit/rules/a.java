package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements org.junit.rules.l {
    private final org.junit.rules.l a;
    private final boolean b;

    public a(org.junit.rules.l r2) {
            r1 = this;
            java.lang.management.RuntimeMXBean r0 = java.lang.management.ManagementFactory.getRuntimeMXBean()
            java.util.List r0 = r0.getInputArguments()
            r1.<init>(r2, r0)
            return
    }

    a(org.junit.rules.l r1, java.util.List<java.lang.String> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            boolean r1 = c(r2)
            r0.b = r1
            return
    }

    private static boolean c(java.util.List<java.lang.String> r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "-Xdebug"
            boolean r1 = r1.equals(r0)
            r2 = 1
            if (r1 == 0) goto L1a
            return r2
        L1a:
            java.lang.String r1 = "-agentlib:jdwp"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4
            return r2
        L23:
            r3 = 0
            return r3
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.h a(org.junit.runners.model.h r2, org.junit.runner.Description r3) {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto L5
            return r2
        L5:
            org.junit.rules.l r0 = r1.a
            org.junit.runners.model.h r2 = r0.a(r2, r3)
            return r2
    }

    public boolean b() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }
}
