package junit.extensions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b extends junit.extensions.c {
    private int b;

    public b(junit.framework.f r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 < 0) goto L8
            r0.b = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Repetition count must be >= 0"
            r1.<init>(r2)
            throw r1
    }

    @Override // junit.extensions.c, junit.framework.f
    public void a(junit.framework.j r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.b
            if (r0 >= r1) goto L12
            boolean r1 = r3.n()
            if (r1 == 0) goto Lc
            goto L12
        Lc:
            super.a(r3)
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    @Override // junit.extensions.c, junit.framework.f
    public int c() {
            r2 = this;
            int r0 = super.c()
            int r1 = r2.b
            int r0 = r0 * r1
            return r0
    }

    @Override // junit.extensions.c
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "(repeated)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
