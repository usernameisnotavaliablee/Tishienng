package cn.jiguang.commons.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f extends java.io.IOException {
    private final long a;

    /* renamed from: c, reason: collision with root package name */
    private final long f1222c;

    public f(long r6, long r8) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Response body exceeds maximum allowed size ("
            r0.append(r1)
            r1 = 1024(0x400, double:5.06E-321)
            long r3 = r8 / r1
            long r3 = r3 / r1
            r0.append(r3)
            java.lang.String r1 = "MB). Actual: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " bytes"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            r5.a = r6
            r5.f1222c = r8
            return
    }
}
