package com.bxkj.student.run.app.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LatLngTimeSpeed implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.bxkj.student.run.app.location.LatLngTimeSpeed> CREATOR = null;
    private long countTime;
    private boolean isPuase;
    private double latitude;
    private int locationType;
    private double longitude;
    private float speed;
    private long time;


    static {
            com.bxkj.student.run.app.location.LatLngTimeSpeed$1 r0 = new com.bxkj.student.run.app.location.LatLngTimeSpeed$1
            r0.<init>()
            com.bxkj.student.run.app.location.LatLngTimeSpeed.CREATOR = r0
            return
    }

    public LatLngTimeSpeed() {
            r0 = this;
            r0.<init>()
            return
    }

    public LatLngTimeSpeed(double r1, double r3, long r5, float r7, boolean r8, int r9) {
            r0 = this;
            r0.<init>()
            r0.latitude = r1
            r0.longitude = r3
            r0.time = r5
            r0.speed = r7
            r0.isPuase = r8
            r0.locationType = r9
            return
    }

    public LatLngTimeSpeed(double r1, double r3, long r5, float r7, boolean r8, int r9, long r10) {
            r0 = this;
            r0.<init>()
            r0.latitude = r1
            r0.longitude = r3
            r0.time = r5
            r0.speed = r7
            r0.isPuase = r8
            r0.locationType = r9
            r0.countTime = r10
            return
    }

    protected LatLngTimeSpeed(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            double r0 = r3.readDouble()
            r2.latitude = r0
            double r0 = r3.readDouble()
            r2.longitude = r0
            long r0 = r3.readLong()
            r2.time = r0
            long r0 = r3.readLong()
            r2.countTime = r0
            float r0 = r3.readFloat()
            r2.speed = r0
            int r0 = r3.readInt()
            r2.locationType = r0
            byte r3 = r3.readByte()
            if (r3 == 0) goto L2f
            r3 = 1
            goto L30
        L2f:
            r3 = 0
        L30:
            r2.isPuase = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public long getCountTime() {
            r2 = this;
            long r0 = r2.countTime
            return r0
    }

    public double getLatitude() {
            r2 = this;
            double r0 = r2.latitude
            return r0
    }

    public int getLocationType() {
            r1 = this;
            int r0 = r1.locationType
            return r0
    }

    public double getLongitude() {
            r2 = this;
            double r0 = r2.longitude
            return r0
    }

    public float getSpeed() {
            r1 = this;
            float r0 = r1.speed
            return r0
    }

    public long getTime() {
            r2 = this;
            long r0 = r2.time
            return r0
    }

    public boolean isPuase() {
            r1 = this;
            boolean r0 = r1.isPuase
            return r0
    }

    public com.bxkj.student.run.app.location.LatLngTimeSpeed setCountTime(long r1) {
            r0 = this;
            r0.countTime = r1
            return r0
    }

    public com.bxkj.student.run.app.location.LatLngTimeSpeed setLatitude(double r1) {
            r0 = this;
            r0.latitude = r1
            return r0
    }

    public void setLocationType(int r1) {
            r0 = this;
            r0.locationType = r1
            return
    }

    public com.bxkj.student.run.app.location.LatLngTimeSpeed setLongitude(double r1) {
            r0 = this;
            r0.longitude = r1
            return r0
    }

    public com.bxkj.student.run.app.location.LatLngTimeSpeed setPuase(boolean r1) {
            r0 = this;
            r0.isPuase = r1
            return r0
    }

    public com.bxkj.student.run.app.location.LatLngTimeSpeed setSpeed(float r1) {
            r0 = this;
            r0.speed = r1
            return r0
    }

    public com.bxkj.student.run.app.location.LatLngTimeSpeed setTime(long r1) {
            r0 = this;
            r0.time = r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LatLngTimeSpeed{latitude="
            r0.append(r1)
            double r1 = r3.latitude
            r0.append(r1)
            java.lang.String r1 = ", longitude="
            r0.append(r1)
            double r1 = r3.longitude
            r0.append(r1)
            java.lang.String r1 = ", time="
            r0.append(r1)
            long r1 = r3.time
            r0.append(r1)
            java.lang.String r1 = ", speed="
            r0.append(r1)
            float r1 = r3.speed
            r0.append(r1)
            java.lang.String r1 = ", isPuase="
            r0.append(r1)
            boolean r1 = r3.isPuase
            r0.append(r1)
            java.lang.String r1 = ", locationType="
            r0.append(r1)
            int r1 = r3.locationType
            r0.append(r1)
            java.lang.String r1 = ", countTime="
            r0.append(r1)
            long r1 = r3.countTime
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            double r0 = r2.latitude
            r3.writeDouble(r0)
            double r0 = r2.longitude
            r3.writeDouble(r0)
            long r0 = r2.time
            r3.writeLong(r0)
            long r0 = r2.countTime
            r3.writeLong(r0)
            float r4 = r2.speed
            r3.writeFloat(r4)
            int r4 = r2.locationType
            r3.writeInt(r4)
            boolean r4 = r2.isPuase
            r3.writeByte(r4)
            return
    }
}
