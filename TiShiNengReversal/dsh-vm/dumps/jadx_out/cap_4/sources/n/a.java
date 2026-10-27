package n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a<T> implements n.c {
    public static final int c = 4;
    private java.util.List<T> a;
    private int b;

    public a(java.util.List<T> r2) {
            r1 = this;
            r0 = 4
            r1.<init>(r2, r0)
            return
    }

    public a(java.util.List<T> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // n.c
    public int a() {
            r1 = this;
            java.util.List<T> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // n.c
    public java.lang.Object getItem(int r2) {
            r1 = this;
            if (r2 < 0) goto L11
            java.util.List<T> r0 = r1.a
            int r0 = r0.size()
            if (r2 >= r0) goto L11
            java.util.List<T> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
        L11:
            java.lang.String r2 = ""
            return r2
    }

    @Override // n.c
    public int indexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List<T> r0 = r1.a
            int r2 = r0.indexOf(r2)
            return r2
    }
}
