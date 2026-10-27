package c2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class d {
    private static final java.lang.String b = "RootKeyUtil";
    private byte[] a;

    static {
            return
    }

    private d() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    private void a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            byte[] r4 = c2.c.c(r4)
            r0.b(r1, r2, r3, r4)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    private void b(java.lang.String r3, java.lang.String r4, java.lang.String r5, byte[] r6) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L15
            java.lang.String r0 = c2.d.b
            java.lang.String r1 = "initRootKey: sha1"
            c2.g.e(r0, r1)
            r0 = 0
            byte[] r3 = c2.a.i(r3, r4, r5, r6, r0)
            r2.a = r3
            return
        L15:
            java.lang.String r0 = c2.d.b
            java.lang.String r1 = "initRootKey: sha256"
            c2.g.e(r0, r1)
            r0 = 1
            byte[] r3 = c2.a.i(r3, r4, r5, r6, r0)
            r2.a = r3
            return
    }

    public static c2.d e(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            c2.d r0 = new c2.d
            r0.<init>()
            r0.a(r1, r2, r3, r4)
            return r0
    }

    public static c2.d f(java.lang.String r1, java.lang.String r2, java.lang.String r3, byte[] r4) {
            c2.d r0 = new c2.d
            r0.<init>()
            r0.b(r1, r2, r3, r4)
            return r0
    }

    public byte[] c() {
            r1 = this;
            byte[] r0 = r1.a
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            byte[] r0 = r1.a
            java.lang.String r0 = c2.c.b(r0)
            return r0
    }
}
