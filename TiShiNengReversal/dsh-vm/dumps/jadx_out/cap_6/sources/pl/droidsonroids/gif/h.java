package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h {
    char a;
    boolean b;

    public h() {
            r0 = this;
            r0.<init>()
            r0.a()
            return
    }

    private void a() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r0 = 0
            r1.b = r0
            return
    }

    void b(@androidx.annotation.Nullable pl.droidsonroids.gif.h r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r1.a()
            return
        L6:
            boolean r0 = r2.b
            r1.b = r0
            char r2 = r2.a
            r1.a = r2
            return
    }

    public void c(boolean r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void d(@androidx.annotation.IntRange(from = 1, to = 65535) int r3) {
            r2 = this;
            r0 = 1
            if (r3 < r0) goto Ld
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r3 <= r1) goto L9
            goto Ld
        L9:
            char r3 = (char) r3
            r2.a = r3
            return
        Ld:
            r2.a = r0
            return
    }
}
