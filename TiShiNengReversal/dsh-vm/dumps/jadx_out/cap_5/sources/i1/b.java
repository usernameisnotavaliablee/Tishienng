package i1;

@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class b {
    private final android.content.Context a;
    private java.io.InputStream b;

    public b(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final void a() {
            r1 = this;
            java.io.InputStream r0 = r1.b
            com.huawei.agconnect.config.impl.b.a(r0)
            return
    }

    public abstract java.io.InputStream b(android.content.Context r1);

    public java.io.InputStream c() {
            r1 = this;
            java.io.InputStream r0 = r1.b
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.a
            java.io.InputStream r0 = r1.b(r0)
            r1.b = r0
        Lc:
            java.io.InputStream r0 = r1.b
            return r0
    }
}
