package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class x6 {
    private final android.content.Context a;
    private final java.util.Map<java.lang.String, java.lang.Long> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                xyz.adscope.ad.c[] r0 = xyz.adscope.ad.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xyz.adscope.ad.x6.a.a = r0
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.f     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = xyz.adscope.ad.x6.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.h     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = xyz.adscope.ad.x6.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.d     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = xyz.adscope.ad.x6.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.c     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = xyz.adscope.ad.x6.a.a     // Catch: java.lang.NoSuchFieldError -> L3e
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.g     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public x6(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.a = r1
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            r0.b = r1
            return
    }

    private long a(java.lang.String r3, long r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1d
            android.content.Context r0 = r2.a
            java.lang.String r1 = r2.a()
            boolean r0 = xyz.adscope.ad.i0.a(r0, r1, r3)
            if (r0 == 0) goto L1d
            android.content.Context r0 = r2.a
            java.lang.String r1 = r2.a()
            long r3 = xyz.adscope.ad.i0.a(r0, r1, r3, r4)
            return r3
        L1d:
            return r4
    }

    private java.lang.String a() {
            r3 = this;
            java.lang.String r0 = xyz.adscope.ad.f0.a()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "asnp_user_%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }

    private java.lang.String a(xyz.adscope.ad.c r2) {
            r1 = this;
            int[] r0 = xyz.adscope.ad.x6.a.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L25
            r0 = 2
            if (r2 == r0) goto L22
            r0 = 3
            if (r2 == r0) goto L1f
            r0 = 4
            if (r2 == r0) goto L1c
            r0 = 5
            if (r2 == r0) goto L19
            r2 = 0
            return r2
        L19:
            java.lang.String r2 = "VCD"
            return r2
        L1c:
            java.lang.String r2 = "BCD"
            return r2
        L1f:
            java.lang.String r2 = "NCD"
            return r2
        L22:
            java.lang.String r2 = "SCD"
            return r2
        L25:
            java.lang.String r2 = "ICD"
            return r2
    }

    private void b() {
            r8 = this;
            java.lang.String r0 = "ICD"
            java.lang.String r1 = "VCD"
            java.lang.String r2 = "SCD"
            java.lang.String r3 = "BCD"
            java.lang.String r4 = "NCD"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            r1 = 0
        Lf:
            r2 = 5
            if (r1 >= r2) goto L2a
            r2 = r0[r1]
            r3 = 0
            long r5 = r8.a(r2, r3)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L27
            java.util.Map<java.lang.String, java.lang.Long> r3 = r8.b
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r3.put(r2, r4)
        L27:
            int r1 = r1 + 1
            goto Lf
        L2a:
            return
    }

    private void b(java.lang.String r3, long r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lf
            android.content.Context r0 = r2.a
            java.lang.String r1 = r2.a()
            xyz.adscope.ad.i0.b(r0, r1, r3, r4)
        Lf:
            return
    }

    private void c() {
            r6 = this;
            java.lang.String r0 = "UPT"
            r1 = 0
            long r3 = r6.a(r0, r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L13
            long r3 = java.lang.System.currentTimeMillis()
            r6.b(r0, r3)
        L13:
            java.util.Map<java.lang.String, java.lang.Long> r1 = r6.b
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r1.put(r0, r2)
            return
    }

    public boolean a(long r7) {
            r6 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r6.b
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.String r2 = "UPT"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L29
            java.util.Map<java.lang.String, java.lang.Long> r0 = r6.b
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L20
            long r4 = r0.longValue()
            goto L22
        L20:
            r4 = 0
        L22:
            long r2 = r2 - r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L29
            r7 = 1
            return r7
        L29:
            return r1
    }

    public boolean a(xyz.adscope.ad.c r7, long r8) {
            r6 = this;
            java.lang.String r7 = r6.a(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L31
            java.util.Map<java.lang.String, java.lang.Long> r0 = r6.b
            if (r0 == 0) goto L31
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L31
            java.util.Map<java.lang.String, java.lang.Long> r0 = r6.b
            java.lang.Object r7 = r0.get(r7)
            java.lang.Long r7 = (java.lang.Long) r7
            long r2 = java.lang.System.currentTimeMillis()
            if (r7 == 0) goto L28
            long r4 = r7.longValue()
            goto L2a
        L28:
            r4 = 0
        L2a:
            long r2 = r2 - r4
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 >= 0) goto L31
            r7 = 1
            return r7
        L31:
            return r1
    }

    public void b(xyz.adscope.ad.c r5) {
            r4 = this;
            java.lang.String r5 = r4.a(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L1a
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.String, java.lang.Long> r2 = r4.b
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r2.put(r5, r3)
            r4.b(r5, r0)
        L1a:
            return
    }

    public void d() {
            r0 = this;
            r0.c()
            r0.b()
            return
    }
}
