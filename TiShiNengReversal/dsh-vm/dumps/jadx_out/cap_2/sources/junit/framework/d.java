package junit.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d implements junit.framework.f, org.junit.runner.b {
    private final org.junit.runner.Description a;

    d(org.junit.runner.Description r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // junit.framework.f
    public void a(junit.framework.j r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "This test stub created only for informational purposes."
            r2.<init>(r0)
            throw r2
    }

    @Override // junit.framework.f
    public int c() {
            r1 = this;
            r0 = 1
            return r0
    }

    public org.junit.runner.Description getDescription() {
            r1 = this;
            org.junit.runner.Description r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            org.junit.runner.Description r0 = r1.getDescription()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
