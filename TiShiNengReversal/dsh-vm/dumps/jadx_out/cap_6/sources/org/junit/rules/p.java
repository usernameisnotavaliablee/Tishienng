package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class p implements org.junit.rules.l {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends org.junit.runners.model.h {
        final /* synthetic */ org.junit.runners.model.h a;
        final /* synthetic */ org.junit.rules.p b;

        a(org.junit.rules.p r1, org.junit.runners.model.h r2) throws java.lang.Throwable {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // org.junit.runners.model.h
        public void a() throws java.lang.Throwable {
                r1 = this;
                org.junit.runners.model.h r0 = r1.a
                r0.a()
                org.junit.rules.p r0 = r1.b
                r0.b()
                return
        }
    }

    public p() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.h a(org.junit.runners.model.h r1, org.junit.runner.Description r2) {
            r0 = this;
            org.junit.rules.p$a r2 = new org.junit.rules.p$a
            r2.<init>(r0, r1)
            return r2
    }

    protected void b() throws java.lang.Throwable {
            r0 = this;
            return
    }
}
