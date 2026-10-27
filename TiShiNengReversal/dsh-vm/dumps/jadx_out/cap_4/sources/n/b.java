package n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements n.c {
    public static final int c = 9;
    private static final int d = 0;
    private int a;
    private int b;

    public b() {
            r2 = this;
            r0 = 0
            r1 = 9
            r2.<init>(r0, r1)
            return
    }

    public b(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // n.c
    public int a() {
            r2 = this;
            int r0 = r2.b
            int r1 = r2.a
            int r0 = r0 - r1
            int r0 = r0 + 1
            return r0
    }

    @Override // n.c
    public java.lang.Object getItem(int r2) {
            r1 = this;
            if (r2 < 0) goto L10
            int r0 = r1.a()
            if (r2 >= r0) goto L10
            int r0 = r1.a
            int r0 = r0 + r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L10:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // n.c
    public int indexOf(java.lang.Object r2) {
            r1 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> La
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> La
            int r0 = r1.a     // Catch: java.lang.Exception -> La
            int r2 = r2 - r0
            return r2
        La:
            r2 = -1
            return r2
    }
}
