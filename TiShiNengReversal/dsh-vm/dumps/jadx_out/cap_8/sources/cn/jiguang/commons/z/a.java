package cn.jiguang.commons.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {
    public static final java.lang.String a = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f1227c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f1228d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f1229e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f1230f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f1231g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f1232h = null;

    static {
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x005c: FILL_ARRAY_DATA , data: [80, 59, 80, 96, 112, 82, 77, 79} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.a.a = r0
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0064: FILL_ARRAY_DATA , data: [104, 13, 76, 65, 82} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.a.f1227c = r0
            r0 = 13
            byte[] r0 = new byte[r0]
            r0 = {x006c: FILL_ARRAY_DATA , data: [65, 37, 85, 126, 94, 84, 124, 102, 98, 60, 125, 100, 44} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.a.f1228d = r0
            r0 = 17
            byte[] r0 = new byte[r0]
            r0 = {x0078: FILL_ARRAY_DATA , data: [72, 13, 122, 103, 101, 60, 93, 69, 109, 105, 59, 124, 84, 21, 106, 125, 123} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.a.f1229e = r0
            r0 = 22
            byte[] r0 = new byte[r0]
            r0 = {x0086: FILL_ARRAY_DATA , data: [105, 29, 67, 118, 123, 59, 124, 85, 84, 120, 37, 117, 126, 94, 84, 124, 102, 98, 60, 93, 68, 44} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.a.f1230f = r0
            r0 = 22
            byte[] r0 = new byte[r0]
            r0 = {x0096: FILL_ARRAY_DATA , data: [105, 29, 65, 116, 114, 59, 124, 85, 84, 120, 37, 117, 126, 94, 84, 124, 102, 98, 60, 93, 68, 44} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.a.f1231g = r0
            r0 = 12
            byte[] r0 = new byte[r0]
            r0 = {x00a6: FILL_ARRAY_DATA , data: [76, 112, 106, 124, 100, 68, 73, 117, 123, 56, 98, 95} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.a.f1232h = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2, java.lang.String r3) {
            if (r2 != 0) goto L6
            android.content.Context r2 = cn.jiguang.commons.L.h.a()
        L6:
            java.io.File r2 = r2.getFilesDir()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "zl"
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L28
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L28
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            java.lang.String r2 = r0.getAbsolutePath()
            return r2
        L28:
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r3)
            java.lang.String r2 = r2.getAbsolutePath()
            return r2
    }
}
