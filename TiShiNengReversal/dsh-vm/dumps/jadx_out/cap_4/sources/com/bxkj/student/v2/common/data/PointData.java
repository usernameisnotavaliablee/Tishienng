package com.bxkj.student.v2.common.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PointData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.bxkj.student.v2.common.data.PointData> CREATOR = null;
    private double a;
    private long c;
    private int e;
    private java.lang.Boolean f;
    private java.lang.Boolean h;
    private boolean i;

    /* renamed from: l, reason: collision with root package name */
    private int f1338l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.Boolean f1339m;

    /* renamed from: o, reason: collision with root package name */
    private double f1340o;

    /* renamed from: s, reason: collision with root package name */
    private float f1341s;

    /* renamed from: t, reason: collision with root package name */
    private long f1342t;


    static {
            com.bxkj.student.v2.common.data.PointData$1 r0 = new com.bxkj.student.v2.common.data.PointData$1
            r0.<init>()
            com.bxkj.student.v2.common.data.PointData.CREATOR = r0
            return
    }

    public PointData() {
            r0 = this;
            r0.<init>()
            return
    }

    public PointData(double r1, double r3, long r5, float r7, boolean r8, int r9, long r10, int r12) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f1340o = r3
            r0.f1342t = r5
            r0.f1341s = r7
            r0.i = r8
            r0.f1338l = r9
            r0.c = r10
            r0.e = r12
            return
    }

    protected PointData(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            double r0 = r3.readDouble()
            r2.a = r0
            double r0 = r3.readDouble()
            r2.f1340o = r0
            long r0 = r3.readLong()
            r2.f1342t = r0
            float r0 = r3.readFloat()
            r2.f1341s = r0
            byte r0 = r3.readByte()
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            r2.i = r0
            int r0 = r3.readInt()
            r2.f1338l = r0
            long r0 = r3.readLong()
            r2.c = r0
            int r0 = r3.readInt()
            r2.e = r0
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r3.readValue(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2.f = r1
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r3.readValue(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2.f1339m = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r3 = r3.readValue(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r2.h = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public double getA() {
            r2 = this;
            double r0 = r2.a
            return r0
    }

    public long getC() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public long getE() {
            r2 = this;
            int r0 = r2.e
            long r0 = (long) r0
            return r0
    }

    public java.lang.Boolean getF() {
            r1 = this;
            java.lang.Boolean r0 = r1.f
            return r0
    }

    public java.lang.Boolean getH() {
            r1 = this;
            java.lang.Boolean r0 = r1.h
            return r0
    }

    public int getL() {
            r1 = this;
            int r0 = r1.f1338l
            return r0
    }

    public java.lang.Boolean getM() {
            r1 = this;
            java.lang.Boolean r0 = r1.f1339m
            return r0
    }

    public double getO() {
            r2 = this;
            double r0 = r2.f1340o
            return r0
    }

    public float getS() {
            r1 = this;
            float r0 = r1.f1341s
            return r0
    }

    public long getT() {
            r2 = this;
            long r0 = r2.f1342t
            return r0
    }

    public boolean isI() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public void readFromParcel(android.os.Parcel r3) {
            r2 = this;
            double r0 = r3.readDouble()
            r2.a = r0
            double r0 = r3.readDouble()
            r2.f1340o = r0
            long r0 = r3.readLong()
            r2.f1342t = r0
            float r0 = r3.readFloat()
            r2.f1341s = r0
            byte r0 = r3.readByte()
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            r2.i = r0
            int r0 = r3.readInt()
            r2.f1338l = r0
            long r0 = r3.readLong()
            r2.c = r0
            int r0 = r3.readInt()
            r2.e = r0
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r3.readValue(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2.f = r1
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r3.readValue(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2.f1339m = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r3 = r3.readValue(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r2.h = r3
            return
    }

    public com.bxkj.student.v2.common.data.PointData setA(double r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setC(long r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setE(int r1) {
            r0 = this;
            r0.e = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setF(java.lang.Boolean r1) {
            r0 = this;
            r0.f = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setH(java.lang.Boolean r1) {
            r0 = this;
            r0.h = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setI(boolean r1) {
            r0 = this;
            r0.i = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setL(int r1) {
            r0 = this;
            r0.f1338l = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setM(java.lang.Boolean r1) {
            r0 = this;
            r0.f1339m = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setO(double r1) {
            r0 = this;
            r0.f1340o = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setS(float r1) {
            r0 = this;
            r0.f1341s = r1
            return r0
    }

    public com.bxkj.student.v2.common.data.PointData setT(long r1) {
            r0 = this;
            r0.f1342t = r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PointData{a="
            r0.append(r1)
            double r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", o="
            r0.append(r1)
            double r1 = r3.f1340o
            r0.append(r1)
            java.lang.String r1 = ", t="
            r0.append(r1)
            long r1 = r3.f1342t
            r0.append(r1)
            java.lang.String r1 = ", s="
            r0.append(r1)
            float r1 = r3.f1341s
            r0.append(r1)
            java.lang.String r1 = ", i="
            r0.append(r1)
            boolean r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", l="
            r0.append(r1)
            int r1 = r3.f1338l
            r0.append(r1)
            java.lang.String r1 = ", c="
            r0.append(r1)
            long r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", e="
            r0.append(r1)
            int r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", f="
            r0.append(r1)
            java.lang.Boolean r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", m="
            r0.append(r1)
            java.lang.Boolean r1 = r3.f1339m
            r0.append(r1)
            java.lang.String r1 = ", h="
            r0.append(r1)
            java.lang.Boolean r1 = r3.h
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            double r0 = r2.a
            r3.writeDouble(r0)
            double r0 = r2.f1340o
            r3.writeDouble(r0)
            long r0 = r2.f1342t
            r3.writeLong(r0)
            float r4 = r2.f1341s
            r3.writeFloat(r4)
            boolean r4 = r2.i
            r3.writeByte(r4)
            int r4 = r2.f1338l
            r3.writeInt(r4)
            long r0 = r2.c
            r3.writeLong(r0)
            int r4 = r2.e
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.f
            r3.writeValue(r4)
            java.lang.Boolean r4 = r2.f1339m
            r3.writeValue(r4)
            java.lang.Boolean r4 = r2.h
            r3.writeValue(r4)
            return
    }
}
