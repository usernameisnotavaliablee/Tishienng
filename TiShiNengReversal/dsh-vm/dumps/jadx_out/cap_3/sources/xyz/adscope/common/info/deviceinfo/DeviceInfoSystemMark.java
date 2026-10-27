package xyz.adscope.common.info.deviceinfo;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DeviceInfoSystemMark {
    public DeviceInfoSystemMark() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getDeviceUpdateMark() {
            r5 = this;
            java.lang.String r0 = ""
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "/data/data"
            android.system.StructStat r2 = android.system.Os.stat(r2)     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto Ld
            return r0
        Ld:
            r3 = 27
            if (r1 < r3) goto L32
            android.system.StructTimespec r1 = com.beizi.ad.internal.h.y.a(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L45
            long r3 = com.beizi.ad.internal.h.z.a(r1)     // Catch: java.lang.Throwable -> L45
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "."
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            long r3 = com.beizi.ad.internal.h.a0.a(r1)     // Catch: java.lang.Throwable -> L45
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L45
            return r0
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r1.<init>()     // Catch: java.lang.Throwable -> L45
            long r2 = r2.st_atime     // Catch: java.lang.Throwable -> L45
            r1.append(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = ".0"
            r1.append(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L45
        L45:
            return r0
    }
}
