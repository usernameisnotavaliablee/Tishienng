package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private cn.jiguang.ac.a.C0009a[] a;

    /* renamed from: cn.jiguang.ac.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: cn.jiguang.ac.a$a, reason: collision with other inner class name */
    private static class C0009a {
        cn.jiguang.ac.g a;

        /* renamed from: b, reason: collision with root package name */
        int f330b;

        /* renamed from: c, reason: collision with root package name */
        cn.jiguang.ac.a.C0009a f331c;

        private C0009a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ C0009a(cn.jiguang.ac.a.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 17
            cn.jiguang.ac.a$a[] r0 = new cn.jiguang.ac.a.C0009a[r0]
            r1.a = r0
            return
    }

    public int a(cn.jiguang.ac.g r4) {
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            int r0 = r0 % 17
            cn.jiguang.ac.a$a[] r1 = r3.a
            r0 = r1[r0]
            r1 = -1
        Lf:
            if (r0 == 0) goto L1e
            cn.jiguang.ac.g r2 = r0.a
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1b
            int r1 = r0.f330b
        L1b:
            cn.jiguang.ac.a$a r0 = r0.f331c
            goto Lf
        L1e:
            return r1
    }

    public void a(int r4, cn.jiguang.ac.g r5) {
            r3 = this;
            r0 = 16383(0x3fff, float:2.2957E-41)
            if (r4 <= r0) goto L5
            return
        L5:
            int r0 = r5.hashCode()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            int r0 = r0 % 17
            cn.jiguang.ac.a$a r1 = new cn.jiguang.ac.a$a
            r2 = 0
            r1.<init>(r2)
            r1.a = r5
            r1.f330b = r4
            cn.jiguang.ac.a$a[] r4 = r3.a
            r5 = r4[r0]
            r1.f331c = r5
            r4[r0] = r1
            return
    }
}
