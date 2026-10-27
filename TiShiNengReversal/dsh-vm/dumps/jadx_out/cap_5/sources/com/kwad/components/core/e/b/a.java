package com.kwad.components.core.e.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.e.b.a$a, reason: collision with other inner class name */
    static class C0070a {
        private static final com.kwad.components.core.e.b.c OD = null;

        static {
                r0 = 10
                int[] r0 = new int[r0]
                r0 = {x000e: FILL_ARRAY_DATA , data: [7, 8, 4, 2, 0, 3, 6, 9, 1, 8} // fill-array
                com.kwad.components.core.e.b.c r0 = com.kwad.components.core.e.b.c.a(r0)
                com.kwad.components.core.e.b.a.C0070a.OD = r0
                return
        }

        public C0070a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.e.b.c oT() {
                com.kwad.components.core.e.b.c r0 = com.kwad.components.core.e.b.a.C0070a.OD
                return r0
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long ai(java.lang.String r2) {
            com.kwad.components.core.e.b.c r0 = oS()
            long r0 = r0.aj(r2)
            return r0
    }

    private static com.kwad.components.core.e.b.c oS() {
            com.kwad.components.core.e.b.c r0 = com.kwad.components.core.e.b.a.C0070a.oT()
            return r0
    }

    public static java.lang.String y(long r1) {
            com.kwad.components.core.e.b.c r0 = oS()
            java.lang.String r1 = r0.z(r1)
            java.lang.String r2 = "="
            boolean r0 = r1.endsWith(r2)
            if (r0 == 0) goto L16
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replace(r2, r0)
        L16:
            return r1
    }
}
