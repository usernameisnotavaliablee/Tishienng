package pl.droidsonroids.relinker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class e implements pl.droidsonroids.relinker.c.b {
    e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // pl.droidsonroids.relinker.c.b
    public java.lang.String a(java.lang.String r3) {
            r2 = this;
            int r0 = r3.length()
            r1 = 3
            int r0 = r0 - r1
            java.lang.String r3 = r3.substring(r1, r0)
            return r3
    }

    @Override // pl.droidsonroids.relinker.c.b
    public java.lang.String[] b() {
            r2 = this;
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            int r1 = r0.length
            if (r1 <= 0) goto L6
            return r0
        L6:
            java.lang.String r0 = android.os.Build.CPU_ABI2
            boolean r1 = pl.droidsonroids.relinker.f.a(r0)
            if (r1 != 0) goto L15
            java.lang.String r1 = android.os.Build.CPU_ABI
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            return r0
        L15:
            java.lang.String r0 = android.os.Build.CPU_ABI
            java.lang.String[] r0 = new java.lang.String[]{r0}
            return r0
    }

    @Override // pl.droidsonroids.relinker.c.b
    public void c(java.lang.String r1) {
            r0 = this;
            java.lang.System.load(r1)
            return
    }

    @Override // pl.droidsonroids.relinker.c.b
    public java.lang.String d(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "lib"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = ".so"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L11
            return r2
        L11:
            java.lang.String r2 = java.lang.System.mapLibraryName(r2)
            return r2
    }

    @Override // pl.droidsonroids.relinker.c.b
    public void loadLibrary(java.lang.String r1) {
            r0 = this;
            java.lang.System.loadLibrary(r1)
            return
    }
}
