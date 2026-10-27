package com.kwad.library.solder.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g extends com.kwad.library.solder.lib.a.a {
    public g(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static void e(java.io.File r2) {
            boolean r0 = r2.exists()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "/data/"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L19
            r2.getAbsolutePath()
        L19:
            return
        L1a:
            com.kwad.library.solder.lib.ext.PluginError$LoadError r2 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            java.lang.String r0 = "Apk file not exist."
            r1 = 4001(0xfa1, float:5.607E-42)
            r2.<init>(r0, r1)
            throw r2
    }

    @Override // com.kwad.library.solder.lib.a.a
    public void i(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            e(r1)
            return
    }
}
