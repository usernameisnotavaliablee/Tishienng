package com.kwad.components.core.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.i.a$a, reason: collision with other inner class name */
    static final class C0076a {
        private static final com.kwad.components.core.i.a QT = null;

        static {
                com.kwad.components.core.i.a r0 = new com.kwad.components.core.i.a
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.core.i.a.C0076a.QT = r0
                return
        }

        public C0076a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.i.a qo() {
                com.kwad.components.core.i.a r0 = com.kwad.components.core.i.a.C0076a.QT
                return r0
        }
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ a(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.content.Context r8, long r9) {
            r7 = this;
            java.io.File r8 = au(r8)
            com.kwad.components.core.i.a$2 r0 = new com.kwad.components.core.i.a$2
            r0.<init>(r7)
            java.io.File[] r8 = r8.listFiles(r0)
            if (r8 == 0) goto L43
            int r0 = r8.length
            if (r0 <= 0) goto L43
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r4 = 0
        L17:
            if (r4 >= r0) goto L26
            r5 = r8[r4]
            long r5 = r5.lastModified()
            long r2 = java.lang.Math.max(r2, r5)
            int r4 = r4 + 1
            goto L17
        L26:
            long r9 = java.lang.Math.min(r9, r2)
            int r0 = r8.length
        L2b:
            if (r1 >= r0) goto L43
            r2 = r8[r1]
            boolean r3 = r2.exists()
            if (r3 == 0) goto L40
            long r3 = r2.lastModified()
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 >= 0) goto L40
            r2.delete()
        L40:
            int r1 = r1 + 1
            goto L2b
        L43:
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.i.a r0, android.content.Context r1, long r2) {
            r0.a(r1, r2)
            return
    }

    private static java.io.File au(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            java.lang.String r1 = "ksad_dynamic"
            r0.<init>(r2, r1)
            return r0
    }

    public static com.kwad.components.core.i.a qn() {
            com.kwad.components.core.i.a r0 = com.kwad.components.core.i.a.C0076a.qo()
            return r0
    }

    public final void at(android.content.Context r4) {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.kwad.components.core.i.a$1 r2 = new com.kwad.components.core.i.a$1
            r2.<init>(r3, r4, r0)
            r0 = 10
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            com.kwad.sdk.utils.h.schedule(r2, r0, r4)
            return
    }
}
