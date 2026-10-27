package com.ss.android.downloadlib.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class xt implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.ss.android.downloadlib.j.j.xt> CREATOR = null;
    public int a;
    public int b;
    public java.lang.String c;
    public int d;
    public java.lang.String e;
    public java.lang.String f;

    static class a implements android.os.Parcelable.Creator<com.ss.android.downloadlib.j.j.xt> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.ss.android.downloadlib.j.j.xt a(android.os.Parcel r2) {
                r1 = this;
                com.ss.android.downloadlib.j.j.xt r0 = new com.ss.android.downloadlib.j.j.xt
                r0.<init>(r2)
                return r0
        }

        public com.ss.android.downloadlib.j.j.xt[] b(int r1) {
                r0 = this;
                com.ss.android.downloadlib.j.j.xt[] r1 = new com.ss.android.downloadlib.j.j.xt[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.ss.android.downloadlib.j.j.xt createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.ss.android.downloadlib.j.j.xt r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.ss.android.downloadlib.j.j.xt[] newArray(int r1) {
                r0 = this;
                com.ss.android.downloadlib.j.j.xt[] r1 = r0.b(r1)
                return r1
        }
    }

    static {
            com.ss.android.downloadlib.j.j.xt$a r0 = new com.ss.android.downloadlib.j.j.xt$a
            r0.<init>()
            com.ss.android.downloadlib.j.j.xt.CREATOR = r0
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.c = r0
            r1.e = r0
            r1.f = r0
            return
    }

    protected xt(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.c = r0
            r1.e = r0
            r1.f = r0
            int r0 = r2.readInt()
            r1.a = r0
            int r0 = r2.readInt()
            r1.b = r0
            java.lang.String r0 = r2.readString()
            r1.c = r0
            java.lang.String r0 = r2.readString()
            r1.e = r0
            java.lang.String r0 = r2.readString()
            r1.f = r0
            int r2 = r2.readInt()
            r1.d = r2
            return
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
            if (r5 == 0) goto L31
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L31
        L12:
            com.ss.android.downloadlib.j.j.xt r5 = (com.ss.android.downloadlib.j.j.xt) r5
            int r2 = r4.a
            int r3 = r5.a
            if (r2 != r3) goto L31
            int r2 = r4.b
            int r3 = r5.b
            if (r2 == r3) goto L21
            goto L31
        L21:
            java.lang.String r2 = r4.c
            if (r2 == 0) goto L2c
            java.lang.String r5 = r5.c
            boolean r5 = r2.equals(r5)
            return r5
        L2c:
            java.lang.String r5 = r5.c
            if (r5 != 0) goto L31
            return r0
        L31:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.c
            if (r1 == 0) goto L12
            int r1 = r1.hashCode()
            goto L13
        L12:
            r1 = 0
        L13:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.a
            r1.writeInt(r2)
            int r2 = r0.b
            r1.writeInt(r2)
            java.lang.String r2 = r0.c
            r1.writeString(r2)
            java.lang.String r2 = r0.e
            r1.writeString(r2)
            java.lang.String r2 = r0.f
            r1.writeString(r2)
            int r2 = r0.d
            r1.writeInt(r2)
            return
    }
}
