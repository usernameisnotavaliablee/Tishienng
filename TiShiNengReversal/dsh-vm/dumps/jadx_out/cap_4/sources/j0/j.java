package j0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static final float f = 9.0f;
    private static final float g = 9.0f;
    private final java.lang.String a;
    private final float b;
    private final float c;
    private int d;
    private boolean e;

    public j(java.lang.String r2) {
            r1 = this;
            r0 = 1091567616(0x41100000, float:9.0)
            r1.<init>(r2, r0, r0)
            return
    }

    public j(java.lang.String r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r1 = 0
            r0.d = r1
            r0.e = r1
            return
    }

    public int a(j0.b r4) {
            r3 = this;
            java.lang.String r0 = r3.a
            float r4 = r4.c(r0)
            boolean r0 = r3.e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L18
            float r0 = r3.b
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L13
            r1 = 1
        L13:
            r3.e = r1
            int r4 = r3.d
            return r4
        L18:
            float r0 = r3.c
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L25
            int r4 = r3.d
            int r4 = r4 + r2
            r3.d = r4
            r3.e = r1
        L25:
            int r4 = r3.d
            return r4
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.d
            return r0
    }
}
