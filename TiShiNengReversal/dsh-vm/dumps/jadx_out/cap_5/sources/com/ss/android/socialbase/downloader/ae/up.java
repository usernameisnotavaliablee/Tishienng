package com.ss.android.socialbase.downloader.ae;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class up implements android.os.Parcelable, java.lang.Comparable {
    public static final android.os.Parcelable.Creator<com.ss.android.socialbase.downloader.ae.up> CREATOR = null;
    private final java.lang.String j;
    private final java.lang.String xt;


    static {
            com.ss.android.socialbase.downloader.ae.up$1 r0 = new com.ss.android.socialbase.downloader.ae.up$1
            r0.<init>()
            com.ss.android.socialbase.downloader.ae.up.CREATOR = r0
            return
    }

    protected up(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.j = r0
            java.lang.String r2 = r2.readString()
            r1.xt = r2
            return
    }

    public up(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.ss.android.socialbase.downloader.ae.up
            r1 = 1
            if (r0 == 0) goto L2a
            java.lang.String r0 = r4.j
            com.ss.android.socialbase.downloader.ae.up r5 = (com.ss.android.socialbase.downloader.ae.up) r5
            java.lang.String r2 = r5.j()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            r2 = 0
            if (r0 == 0) goto L15
            return r2
        L15:
            java.lang.String r0 = r4.j
            r3 = -1
            if (r0 != 0) goto L1b
            return r3
        L1b:
            java.lang.String r5 = r5.j()
            int r5 = r0.compareTo(r5)
            if (r5 <= 0) goto L26
            return r1
        L26:
            if (r5 >= 0) goto L29
            return r3
        L29:
            return r2
        L2a:
            return r1
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L29
        L12:
            com.ss.android.socialbase.downloader.ae.up r5 = (com.ss.android.socialbase.downloader.ae.up) r5
            java.lang.String r2 = r4.j
            java.lang.String r3 = r5.j
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L29
            java.lang.String r2 = r4.xt
            java.lang.String r5 = r5.xt
            boolean r5 = android.text.TextUtils.equals(r2, r5)
            if (r5 == 0) goto L29
            return r0
        L29:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.j
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.xt
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HttpHeader{name='"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", value='"
            r0.append(r2)
            java.lang.String r2 = r3.xt
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.j
            r1.writeString(r2)
            java.lang.String r2 = r0.xt
            r1.writeString(r2)
            return
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.xt
            return r0
    }
}
