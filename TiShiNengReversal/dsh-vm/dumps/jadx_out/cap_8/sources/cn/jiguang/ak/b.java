package cn.jiguang.ak;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {

    public enum a extends java.lang.Enum<cn.jiguang.ak.b.a> {
        public static final cn.jiguang.ak.b.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final cn.jiguang.ak.b.a f521b = null;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ cn.jiguang.ak.b.a[] f522c = null;

        static {
                cn.jiguang.ak.b$a r0 = new cn.jiguang.ak.b$a
                java.lang.String r1 = "LANDSCAPE"
                r2 = 0
                r0.<init>(r1, r2)
                cn.jiguang.ak.b.a.a = r0
                cn.jiguang.ak.b$a r0 = new cn.jiguang.ak.b$a
                java.lang.String r1 = "PORTRAIT"
                r2 = 1
                r0.<init>(r1, r2)
                cn.jiguang.ak.b.a.f521b = r0
                cn.jiguang.ak.b$a[] r0 = a()
                cn.jiguang.ak.b.a.f522c = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ cn.jiguang.ak.b.a[] a() {
                r0 = 2
                cn.jiguang.ak.b$a[] r0 = new cn.jiguang.ak.b.a[r0]
                cn.jiguang.ak.b$a r1 = cn.jiguang.ak.b.a.a
                r2 = 0
                r0[r2] = r1
                cn.jiguang.ak.b$a r1 = cn.jiguang.ak.b.a.f521b
                r2 = 1
                r0[r2] = r1
                return r0
        }

        public static cn.jiguang.ak.b.a valueOf(java.lang.String r1) {
                java.lang.Class<cn.jiguang.ak.b$a> r0 = cn.jiguang.ak.b.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.jiguang.ak.b$a r1 = (cn.jiguang.ak.b.a) r1
                return r1
        }

        public static cn.jiguang.ak.b.a[] values() {
                cn.jiguang.ak.b$a[] r0 = cn.jiguang.ak.b.a.f522c
                java.lang.Object r0 = r0.clone()
                cn.jiguang.ak.b$a[] r0 = (cn.jiguang.ak.b.a[]) r0
                return r0
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static cn.jiguang.ak.b.a a(int r1) {
            r0 = 1
            if (r1 == r0) goto Lb
            r0 = 2
            if (r1 == r0) goto L8
            r1 = 0
            return r1
        L8:
            cn.jiguang.ak.b$a r1 = cn.jiguang.ak.b.a.a
            return r1
        Lb:
            cn.jiguang.ak.b$a r1 = cn.jiguang.ak.b.a.f521b
            return r1
    }
}
