package com.kwad.library.solder.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r1, @androidx.annotation.NonNull com.kwad.library.solder.lib.c.b r2, com.kwad.library.solder.lib.ext.b.a r3) {
            com.kwad.library.solder.lib.b.a r0 = new com.kwad.library.solder.lib.b.a
            r0.<init>(r2)
            com.kwad.library.solder.lib.i r2 = com.kwad.library.solder.lib.i.zS()
            r2.a(r1, r0, r3)
            return
    }

    public static void a(android.content.Context r1, @androidx.annotation.NonNull com.kwad.library.solder.lib.c.b r2, com.kwad.library.solder.lib.ext.b.c r3) {
            com.kwad.library.solder.lib.b.c r0 = new com.kwad.library.solder.lib.b.c
            r0.<init>(r2)
            com.kwad.library.solder.lib.i r2 = com.kwad.library.solder.lib.i.zS()
            r2.a(r1, r0, r3)
            return
    }

    public static com.kwad.library.b.a k(android.content.Context r1, java.lang.String r2) {
            com.kwad.library.solder.lib.i r0 = com.kwad.library.solder.lib.i.zS()
            com.kwad.library.solder.lib.a.a r1 = r0.m(r1, r2)
            if (r1 == 0) goto L18
            boolean r2 = r1.isLoaded()
            if (r2 == 0) goto L18
            boolean r2 = r1 instanceof com.kwad.library.b.a
            if (r2 != 0) goto L15
            goto L18
        L15:
            com.kwad.library.b.a r1 = (com.kwad.library.b.a) r1
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static void l(android.content.Context r1, java.lang.String r2) {
            com.kwad.library.solder.lib.i r0 = com.kwad.library.solder.lib.i.zS()
            r0.l(r1, r2)
            return
    }
}
