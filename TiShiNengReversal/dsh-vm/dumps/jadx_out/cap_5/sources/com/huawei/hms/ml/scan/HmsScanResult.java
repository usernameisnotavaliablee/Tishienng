package com.huawei.hms.ml.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HmsScanResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScanResult> CREATOR = null;
    public static final int SCAN_NEED_ZOOM = 4098;
    public static final int SCAN_OVEREXPOSED = 4099;
    public static final int SCAN_PARSE_FAILED = 4097;
    public static final int SCAN_UNDEREXPOSED = 4100;
    private com.huawei.hms.ml.scan.HmsScan[] hmsScans;
    private int state;


    static {
            com.huawei.hms.ml.scan.HmsScanResult$1 r0 = new com.huawei.hms.ml.scan.HmsScanResult$1
            r0.<init>()
            com.huawei.hms.ml.scan.HmsScanResult.CREATOR = r0
            return
    }

    public HmsScanResult(int r1, com.huawei.hms.ml.scan.HmsScan[] r2) {
            r0 = this;
            r0.<init>()
            r0.state = r1
            r0.hmsScans = r2
            return
    }

    protected HmsScanResult(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.state = r0
            android.os.Parcelable$Creator<com.huawei.hms.ml.scan.HmsScan> r0 = com.huawei.hms.ml.scan.HmsScan.CREATOR
            java.lang.Object[] r2 = r2.createTypedArray(r0)
            com.huawei.hms.ml.scan.HmsScan[] r2 = (com.huawei.hms.ml.scan.HmsScan[]) r2
            r1.hmsScans = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan[] getHmsScans() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan[] r0 = r1.hmsScans
            return r0
    }

    public int getState() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r0 = r1.state
            r2.writeInt(r0)
            com.huawei.hms.ml.scan.HmsScan[] r0 = r1.hmsScans
            r2.writeTypedArray(r0, r3)
            return
    }
}
