package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends org.junit.runners.model.h {
    private final org.junit.runners.model.h a;

    public h(org.junit.runners.model.h r1, java.lang.Iterable<org.junit.rules.l> r2, org.junit.runner.Description r3) {
            r0 = this;
            r0.<init>()
            org.junit.runners.model.h r1 = b(r1, r2, r3)
            r0.a = r1
            return
    }

    private static org.junit.runners.model.h b(org.junit.runners.model.h r1, java.lang.Iterable<org.junit.rules.l> r2, org.junit.runner.Description r3) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r2.next()
            org.junit.rules.l r0 = (org.junit.rules.l) r0
            org.junit.runners.model.h r1 = r0.a(r1, r3)
            goto L4
        L15:
            return r1
    }

    @Override // org.junit.runners.model.h
    public void a() throws java.lang.Throwable {
            r1 = this;
            org.junit.runners.model.h r0 = r1.a
            r0.a()
            return
    }
}
