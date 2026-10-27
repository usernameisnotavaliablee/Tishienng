package com.kwad.framework.filedownloader.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.kwad.framework.filedownloader.d.b> CREATOR = null;
    private java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> aoV;


    static {
            com.kwad.framework.filedownloader.d.b$1 r0 = new com.kwad.framework.filedownloader.d.b$1
            r0.<init>()
            com.kwad.framework.filedownloader.d.b.CREATOR = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    protected b(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.HashMap r2 = r2.readHashMap(r0)
            r1.aoV = r2
            return
    }

    public final void bw(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r1.aoV
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r1.aoV
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r2 = r0.aoV
            r1.writeMap(r2)
            return
    }

    public final void y(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.kwad.sdk.utils.ax.hh(r3)
            com.kwad.sdk.utils.ax.hh(r4)
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r2.aoV
            if (r0 != 0) goto L11
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.aoV = r0
        L11:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r2.aoV
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L25
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r2.aoV
            r1.put(r3, r0)
        L25:
            boolean r3 = r0.contains(r4)
            if (r3 != 0) goto L2e
            r0.add(r4)
        L2e:
            return
    }

    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> yY() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r1.aoV
            return r0
    }
}
