package com.bytedance.j.xt.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static volatile com.bytedance.j.xt.up.j.f e;
    private android.content.Context a;
    private java.util.Map<com.bytedance.j.xt.cw, com.bytedance.j.xt.up.j.b> b;
    private com.bytedance.j.xt.up.j.h c;
    private com.bytedance.j.xt.up.j.e d;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                com.bytedance.j.xt.cw[] r0 = com.bytedance.j.xt.cw.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.j.xt.up.j.f.a.a = r0
                com.bytedance.j.xt.cw r1 = com.bytedance.j.xt.cw.xt     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.j.xt.up.j.f.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.j.xt.cw r1 = com.bytedance.j.xt.cw.f2132r     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.j.xt.up.j.f.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.bytedance.j.xt.cw r1 = com.bytedance.j.xt.cw.tl     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private f(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            r1.a = r2
            com.bytedance.j.xt.up.j.h r2 = new com.bytedance.j.xt.up.j.h
            android.content.Context r0 = r1.a
            r2.<init>(r0)
            r1.c = r2
            com.bytedance.j.xt.up.j.e r2 = new com.bytedance.j.xt.up.j.e
            android.content.Context r0 = r1.a
            r2.<init>(r0)
            r1.d = r2
            return
    }

    @androidx.annotation.Nullable
    private com.bytedance.j.xt.up.j.b b(com.bytedance.j.xt.cw r5) {
            r4 = this;
            java.util.Map<com.bytedance.j.xt.cw, com.bytedance.j.xt.up.j.b> r0 = r4.b
            java.lang.Object r0 = r0.get(r5)
            com.bytedance.j.xt.up.j.b r0 = (com.bytedance.j.xt.up.j.b) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int[] r1 = com.bytedance.j.xt.up.j.f.a.a
            int r2 = r5.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L35
            r2 = 2
            if (r1 == r2) goto L29
            r2 = 3
            if (r1 == r2) goto L1d
            goto L40
        L1d:
            com.bytedance.j.xt.up.j.d r0 = new com.bytedance.j.xt.up.j.d
            android.content.Context r1 = r4.a
            com.bytedance.j.xt.up.j.h r2 = r4.c
            com.bytedance.j.xt.up.j.e r3 = r4.d
            r0.<init>(r1, r2, r3)
            goto L40
        L29:
            com.bytedance.j.xt.up.j.c r0 = new com.bytedance.j.xt.up.j.c
            android.content.Context r1 = r4.a
            com.bytedance.j.xt.up.j.h r2 = r4.c
            com.bytedance.j.xt.up.j.e r3 = r4.d
            r0.<init>(r1, r2, r3)
            goto L40
        L35:
            com.bytedance.j.xt.up.j.a r0 = new com.bytedance.j.xt.up.j.a
            android.content.Context r1 = r4.a
            com.bytedance.j.xt.up.j.h r2 = r4.c
            com.bytedance.j.xt.up.j.e r3 = r4.d
            r0.<init>(r1, r2, r3)
        L40:
            if (r0 == 0) goto L47
            java.util.Map<com.bytedance.j.xt.cw, com.bytedance.j.xt.up.j.b> r1 = r4.b
            r1.put(r5, r0)
        L47:
            return r0
    }

    public static com.bytedance.j.xt.up.j.f c() {
            com.bytedance.j.xt.up.j.f r0 = com.bytedance.j.xt.up.j.f.e
            if (r0 == 0) goto L7
            com.bytedance.j.xt.up.j.f r0 = com.bytedance.j.xt.up.j.f.e
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "CrashContextAssembly not init"
            r0.<init>(r1)
            throw r0
    }

    public static void d(android.content.Context r1) {
            com.bytedance.j.xt.up.j.f r0 = com.bytedance.j.xt.up.j.f.e
            if (r0 != 0) goto Lb
            com.bytedance.j.xt.up.j.f r0 = new com.bytedance.j.xt.up.j.f
            r0.<init>(r1)
            com.bytedance.j.xt.up.j.f.e = r0
        Lb:
            return
    }

    public com.bytedance.j.xt.cw.b a(com.bytedance.j.xt.cw r1, com.bytedance.j.xt.cw.b r2) {
            r0 = this;
            if (r1 != 0) goto L3
            goto Le
        L3:
            com.bytedance.j.xt.up.j.b r1 = r0.b(r1)
            if (r1 == 0) goto Le
            com.bytedance.j.xt.cw.b r1 = r1.b(r2)
            return r1
        Le:
            return r2
    }
}
