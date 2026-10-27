package com.kwad.library.solder.lib.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements java.lang.Comparable<com.kwad.library.solder.lib.c.b> {
    public java.lang.String arA;
    public boolean arB;
    public boolean arC;
    public java.util.HashMap<java.lang.String, java.lang.String> arD;
    public java.util.List<java.lang.String> arE;
    public java.util.List<java.lang.String> arF;
    public java.lang.ClassLoader arG;
    public java.lang.String ara;
    public boolean arb;
    public java.lang.String arx;
    public java.lang.String ary;
    public long arz;
    public boolean enable;
    public java.lang.String version;

    public b() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.arB = r0
            r0 = 1
            r2.arC = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 10
            r0.<init>(r1)
            r2.arD = r0
            return
    }

    private int b(@androidx.annotation.NonNull com.kwad.library.solder.lib.c.b r2) {
            r1 = this;
            java.lang.String r0 = r1.version
            java.lang.String r2 = r2.version
            int r2 = r0.compareTo(r2)
            int r2 = -r2
            return r2
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@androidx.annotation.NonNull com.kwad.library.solder.lib.c.b r1) {
            r0 = this;
            com.kwad.library.solder.lib.c.b r1 = (com.kwad.library.solder.lib.c.b) r1
            int r1 = r0.b(r1)
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RemotePluginInfo{pluginId='"
            r0.<init>(r1)
            java.lang.String r1 = r4.arx
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", version='"
            r0.append(r2)
            java.lang.String r2 = r4.version
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", downloadUrl='"
            r0.append(r2)
            java.lang.String r2 = r4.ary
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", fileSize="
            r0.append(r2)
            long r2 = r4.arz
            r0.append(r2)
            java.lang.String r2 = ", enable="
            r0.append(r2)
            boolean r2 = r4.enable
            r0.append(r2)
            java.lang.String r2 = ", md5sum='"
            r0.append(r2)
            java.lang.String r2 = r4.arA
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", onlyWifiDownload="
            r0.append(r1)
            boolean r1 = r4.arB
            r0.append(r1)
            java.lang.String r1 = ", onlyWifiRetryDownload="
            r0.append(r1)
            boolean r1 = r4.arC
            r0.append(r1)
            java.lang.String r1 = ", soMd5s="
            r0.append(r1)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r4.arD
            r0.append(r1)
            java.lang.String r1 = ", hostPackages="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r4.arE
            r0.append(r1)
            java.lang.String r1 = ", hostInterfaces="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r4.arF
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
