package junit.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class h {
    protected junit.framework.f a;
    protected java.lang.Throwable b;

    public h(junit.framework.f r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.Throwable r0 = r1.d()
            java.lang.String r0 = r0.getMessage()
            return r0
    }

    public junit.framework.f b() {
            r1 = this;
            junit.framework.f r0 = r1.a
            return r0
    }

    public boolean c() {
            r1 = this;
            java.lang.Throwable r0 = r1.d()
            boolean r0 = r0 instanceof junit.framework.AssertionFailedError
            return r0
    }

    public java.lang.Throwable d() {
            r1 = this;
            java.lang.Throwable r0 = r1.b
            return r0
    }

    public java.lang.String e() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.lang.Throwable r1 = r2.d()
            r1.getClass()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            junit.framework.f r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.Throwable r1 = r2.b
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
