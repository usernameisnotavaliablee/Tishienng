package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class Entry extends com.github.mikephil.charting.data.BaseEntry implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.github.mikephil.charting.data.Entry> CREATOR = null;
    private float x;


    static {
            com.github.mikephil.charting.data.Entry$1 r0 = new com.github.mikephil.charting.data.Entry$1
            r0.<init>()
            com.github.mikephil.charting.data.Entry.CREATOR = r0
            return
    }

    public Entry() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.x = r0
            return
    }

    public Entry(float r1, float r2) {
            r0 = this;
            r0.<init>(r2)
            r0.x = r1
            return
    }

    public Entry(float r1, float r2, android.graphics.drawable.Drawable r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.x = r1
            return
    }

    public Entry(float r1, float r2, android.graphics.drawable.Drawable r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.x = r1
            return
    }

    public Entry(float r1, float r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.x = r1
            return
    }

    protected Entry(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.x = r0
            float r0 = r3.readFloat()
            r2.x = r0
            float r0 = r3.readFloat()
            r2.setY(r0)
            int r0 = r3.readInt()
            r1 = 1
            if (r0 != r1) goto L27
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            r2.setData(r3)
        L27:
            return
    }

    public com.github.mikephil.charting.data.Entry copy() {
            r4 = this;
            com.github.mikephil.charting.data.Entry r0 = new com.github.mikephil.charting.data.Entry
            float r1 = r4.x
            float r2 = r4.getY()
            java.lang.Object r3 = r4.getData()
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equalTo(com.github.mikephil.charting.data.Entry r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r4.getData()
            java.lang.Object r2 = r3.getData()
            if (r1 == r2) goto Lf
            return r0
        Lf:
            float r1 = r4.x
            float r2 = r3.x
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            float r2 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L1f
            return r0
        L1f:
            float r4 = r4.getY()
            float r1 = r3.getY()
            float r4 = r4 - r1
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L31
            return r0
        L31:
            r4 = 1
            return r4
    }

    public float getX() {
            r1 = this;
            float r0 = r1.x
            return r0
    }

    public void setX(float r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Entry, x: "
            r0.append(r1)
            float r1 = r2.x
            r0.append(r1)
            java.lang.String r1 = " y: "
            r0.append(r1)
            float r1 = r2.getY()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            float r0 = r1.x
            r2.writeFloat(r0)
            float r0 = r1.getY()
            r2.writeFloat(r0)
            java.lang.Object r0 = r1.getData()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.getData()
            boolean r0 = r0 instanceof android.os.Parcelable
            if (r0 == 0) goto L28
            r0 = 1
            r2.writeInt(r0)
            java.lang.Object r0 = r1.getData()
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r2.writeParcelable(r0, r3)
            return
        L28:
            android.os.ParcelFormatException r2 = new android.os.ParcelFormatException
            java.lang.String r3 = "Cannot parcel an Entry with non-parcelable data"
            r2.<init>(r3)
            throw r2
        L30:
            r3 = 0
            r2.writeInt(r3)
            return
    }
}
