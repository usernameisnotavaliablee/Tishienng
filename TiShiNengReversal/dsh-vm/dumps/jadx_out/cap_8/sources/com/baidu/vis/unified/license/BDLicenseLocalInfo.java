package com.baidu.vis.unified.license;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BDLicenseLocalInfo {
    public int algorithmId;
    public java.lang.String deviceId;
    public java.lang.String fingerVersion;
    public java.lang.String licenseKey;
    public java.lang.String licenseSdkVersion;
    public java.lang.String md5;
    public java.lang.String packageName;

    public BDLicenseLocalInfo(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.licenseKey = r1
            r0.algorithmId = r2
            r0.packageName = r3
            r0.md5 = r4
            r0.deviceId = r5
            r0.fingerVersion = r6
            r0.licenseSdkVersion = r7
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "licenseKey:"
            r0.append(r1)
            java.lang.String r1 = r4.licenseKey
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            java.lang.String r2 = "algorithmId:"
            r0.append(r2)
            int r2 = r4.algorithmId
            r0.append(r2)
            java.lang.String r2 = ";"
            r0.append(r2)
            java.lang.String r3 = "packageName:"
            r0.append(r3)
            java.lang.String r3 = r4.packageName
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = "md5:"
            r0.append(r3)
            java.lang.String r3 = r4.md5
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = "deviceId:"
            r0.append(r3)
            java.lang.String r3 = r4.deviceId
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = "fingerVersion:"
            r0.append(r1)
            java.lang.String r1 = r4.fingerVersion
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "licenseSdkVersion:"
            r0.append(r1)
            java.lang.String r1 = r4.licenseSdkVersion
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
